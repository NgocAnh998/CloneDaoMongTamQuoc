#!/usr/bin/env node
import { mkdir, readFile, writeFile } from "node:fs/promises";
import path from "node:path";
import process from "node:process";

const VERIFIED_XOR_KEY = 0x61;
const CATEGORIES = ["image", "map", "ani", "role", "out", "music"];

function parseArgs(argv) {
  const result = {};
  for (let i = 0; i < argv.length; i += 1) {
    const arg = argv[i];
    if (arg === "--source" || arg === "--out" || arg === "--xor-key") {
      const value = argv[++i];
      if (!value || value.startsWith("--")) {
        throw new Error(`Missing value for ${arg}`);
      }
      result[arg.slice(2)] = value;
    } else if (arg === "--help" || arg === "-h") {
      result.help = true;
    } else {
      throw new Error(`Unknown argument: ${arg}`);
    }
  }
  return result;
}

function decodeModifiedUtf8(bytes) {
  let result = "";
  for (let i = 0; i < bytes.length;) {
    const first = bytes[i++];
    if ((first & 0x80) === 0) {
      result += String.fromCharCode(first);
      continue;
    }

    if ((first & 0xe0) === 0xc0) {
      if (i >= bytes.length) throw new Error("Truncated modified UTF-8 sequence.");
      const second = bytes[i++];
      if ((second & 0xc0) !== 0x80) throw new Error("Invalid modified UTF-8 continuation byte.");
      result += String.fromCharCode(((first & 0x1f) << 6) | (second & 0x3f));
      continue;
    }

    if ((first & 0xf0) === 0xe0) {
      if (i + 1 >= bytes.length) throw new Error("Truncated modified UTF-8 sequence.");
      const second = bytes[i++];
      const third = bytes[i++];
      if ((second & 0xc0) !== 0x80 || (third & 0xc0) !== 0x80) {
        throw new Error("Invalid modified UTF-8 continuation bytes.");
      }
      result += String.fromCharCode(
        ((first & 0x0f) << 12) | ((second & 0x3f) << 6) | (third & 0x3f)
      );
      continue;
    }

    throw new Error("Invalid modified UTF-8 leading byte.");
  }
  return result;
}

function readJavaUtf(buffer, cursor) {
  if (cursor.offset + 2 > buffer.length) {
    throw new Error("Unexpected end of index (UTF length).");
  }
  const length = buffer.readUInt16BE(cursor.offset);
  cursor.offset += 2;
  if (cursor.offset + length > buffer.length) {
    throw new Error("Unexpected end of index (UTF data).");
  }
  const value = decodeModifiedUtf8(buffer.subarray(cursor.offset, cursor.offset + length));
  cursor.offset += length;
  return value;
}

function parseIndex(buffer) {
  if (buffer.length < 2) throw new Error("Index file is too small.");
  const cursor = { offset: 0 };
  const count = buffer.readUInt16BE(cursor.offset);
  cursor.offset += 2;
  if (count > 50000) throw new Error(`Invalid resource count: ${count}`);

  const entries = [];
  for (let i = 0; i < count; i += 1) {
    const name = readJavaUtf(buffer, cursor);
    if (cursor.offset + 8 > buffer.length) {
      throw new Error("Unexpected end of index (resource metadata).");
    }
    const size = buffer.readUInt32BE(cursor.offset);
    const packedOffset = buffer.readUInt32BE(cursor.offset + 4);
    cursor.offset += 8;
    entries.push({ name, size, packedOffset });
  }
  return entries;
}

function safeOutputPath(root, category, entryName) {
  const normalized = entryName
    .split(String.fromCharCode(92))
    .join("/")
    .split("/")
    .filter((part) => part && part !== ".")
    .join(path.sep);
  const categoryRoot = path.resolve(root, category);
  const target = path.resolve(categoryRoot, normalized);
  const relative = path.relative(categoryRoot, target);
  if (
    !normalized ||
    relative === ".." ||
    relative.startsWith(`..${path.sep}`) ||
    path.isAbsolute(relative)
  ) {
    throw new Error(`Unsafe resource path in index: ${entryName}`);
  }
  return target;
}
function xorResource(input, key) {
  const bytes = Buffer.from(input);
  const xorLength = Math.min(20, bytes.length);
  for (let i = 0; i < xorLength; i += 1) bytes[i] ^= key;
  return bytes;
}

function validateResource(name, bytes, key) {
  const lower = name.toLowerCase();
  if (lower.endsWith(".png")) {
    const pngSignature = [0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a];
    if (bytes.length < 8 || !pngSignature.every((value, index) => bytes[index] === value)) {
      throw new Error(
        `Decoded PNG signature mismatch for "${name}". XOR key ${key} may be incorrect.`
      );
    }
  }
  if (lower.endsWith(".mid") || lower.endsWith(".midi")) {
    if (bytes.subarray(0, 4).toString("ascii") !== "MThd") {
      throw new Error(
        `Decoded MIDI header mismatch for "${name}". XOR key ${key} may be incorrect.`
      );
    }
  }
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    console.log(
      "Usage: node scripts/extract-pack.mjs [--source <jar.src-folder>] [--out <output-folder>] [--xor-key <0-255>]"
    );
    console.log(`Default verified XOR key: ${VERIFIED_XOR_KEY} (0x61)`);
    process.exit(0);
  }

  const source = path.resolve(args.source || "../DaoMong-TamQuoc-360x640.jar.src");
  const output = path.resolve(args.out || "public/assets");
  const keyText = args["xor-key"] ?? process.env.DM3_XOR_KEY ?? String(VERIFIED_XOR_KEY);
  const xorKey = Number(keyText);
  if (!Number.isInteger(xorKey) || xorKey < 0 || xorKey > 255) {
    throw new Error("--xor-key must be an integer from 0 to 255.");
  }

  await mkdir(output, { recursive: true });
  const manifest = {
    game: "Dao Mong Tam Quoc",
    formatVersion: 1,
    xorKey,
    verifiedDefaultKey: VERIFIED_XOR_KEY,
    extraction: "J2ME .idx/.pkg resources; XOR is applied to the first 20 bytes",
    categories: {},
    resourceCount: 0,
    totalBytes: 0
  };

  for (const category of CATEGORIES) {
    const indexPath = path.join(source, `${category}.idx`);
    let indexBuffer;
    try {
      indexBuffer = await readFile(indexPath);
    } catch {
      console.warn(`Skip missing index: ${indexPath}`);
      continue;
    }

    const entries = parseIndex(indexBuffer);
    const categoryManifest = [];
    for (const entry of entries) {
      const group = entry.packedOffset >>> 24;
      const offset = entry.packedOffset & 0x00ffffff;
      const packagePath = path.join(source, `${category}${group}.pkg`);
      const packageBuffer = await readFile(packagePath);
      const end = offset + entry.size;
      if (end > packageBuffer.length) {
        throw new Error(`Resource ${entry.name} exceeds ${packagePath} bounds.`);
      }

      const bytes = xorResource(packageBuffer.subarray(offset, end), xorKey);
      validateResource(entry.name, bytes, xorKey);

      const destination = safeOutputPath(output, category, entry.name);
      await mkdir(path.dirname(destination), { recursive: true });
      await writeFile(destination, bytes);

      const relativePath = path.relative(output, destination).split(path.sep).join("/");
      categoryManifest.push({
        name: entry.name,
        path: relativePath,
        group,
        packageOffset: offset,
        size: bytes.length
      });
      manifest.resourceCount += 1;
      manifest.totalBytes += bytes.length;
    }

    manifest.categories[category] = categoryManifest;
    console.log(`${category}: ${entries.length} resource(s)`);
  }

  if (manifest.resourceCount === 0) {
    throw new Error(`No resource indexes were found in: ${source}`);
  }

  const manifestPath = path.join(output, "resource-manifest.json");
  await writeFile(manifestPath, `${JSON.stringify(manifest, null, 2)}\n`, "utf8");
  console.log(`Extracted ${manifest.resourceCount} resource(s) (${manifest.totalBytes.toLocaleString()} bytes) to ${output}`);
  console.log(`Manifest: ${manifestPath}`);
}

main().catch((error) => {
  console.error(`Resource extraction failed: ${error.message}`);
  process.exitCode = 1;
});
