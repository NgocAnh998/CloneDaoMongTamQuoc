#!/usr/bin/env node
import { mkdir, readFile, writeFile } from "node:fs/promises";
import path from "node:path";
import process from "node:process";

function parseArgs(argv) {
  const result = {};
  for (let i = 0; i < argv.length; i += 1) {
    const arg = argv[i];
    if (arg === "--source" || arg === "--out" || arg === "--xor-key") {
      result[arg.slice(2)] = argv[++i];
    } else if (arg === "--help" || arg === "-h") {
      result.help = true;
    } else {
      throw new Error(`Unknown argument: ${arg}`);
    }
  }
  return result;
}

function readJavaUtf(buffer, cursor) {
  if (cursor.offset + 2 > buffer.length) throw new Error("Unexpected end of index (UTF length).");
  const length = buffer.readUInt16BE(cursor.offset);
  cursor.offset += 2;
  if (cursor.offset + length > buffer.length) throw new Error("Unexpected end of index (UTF data).");
  // Resource keys in this game are normally ASCII. Decode Java's modified UTF-8 safely
  // for those names while retaining UTF-8 support for non-ASCII filenames.
  const value = buffer.subarray(cursor.offset, cursor.offset + length).toString("utf8");
  cursor.offset += length;
  return value.replaceAll("\\u0000", "");
}

function parseIndex(buffer) {
  if (buffer.length < 2) throw new Error("Index file is too small.");
  const cursor = { offset: 0 };
  const count = buffer.readInt16BE(cursor.offset);
  cursor.offset += 2;
  if (count < 0 || count > 50000) throw new Error(`Invalid resource count: ${count}`);

  const entries = [];
  for (let i = 0; i < count; i += 1) {
    const name = readJavaUtf(buffer, cursor);
    if (cursor.offset + 8 > buffer.length) throw new Error("Unexpected end of index (resource metadata).");
    const size = buffer.readUInt32BE(cursor.offset);
    const packedOffset = buffer.readUInt32BE(cursor.offset + 4);
    cursor.offset += 8;
    entries.push({ name, size, packedOffset });
  }
  return entries;
}

function safeOutputPath(root, category, entryName) {
  const normalized = entryName.replaceAll("\\", "/").replace(/^\\/+/, "");
  const target = path.resolve(root, category, normalized);
  const relative = path.relative(root, target);
  if (relative.startsWith("..") || path.isAbsolute(relative)) {
    throw new Error(`Unsafe resource path in index: ${entryName}`);
  }
  return target;
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    console.log("Usage: node scripts/extract-pack.mjs --source <jar.src-folder> --out <output-folder> --xor-key <0-255>");
    process.exit(0);
  }

  const source = path.resolve(args.source || "../DaoMong-TamQuoc-360x640.jar.src");
  const output = path.resolve(args.out || "public/assets");
  const keyText = args["xor-key"] ?? process.env.DM3_XOR_KEY;
  if (keyText === undefined) {
    throw new Error("Missing --xor-key. The original dcn.bin key derivation still needs to be ported; do not guess this value.");
  }
  const xorKey = Number(keyText);
  if (!Number.isInteger(xorKey) || xorKey < 0 || xorKey > 255) {
    throw new Error("--xor-key must be an integer from 0 to 255.");
  }

  const categories = ["image", "map", "ani", "role", "out", "music"];
  let extracted = 0;
  for (const category of categories) {
    const indexPath = path.join(source, `${category}.idx`);
    let indexBuffer;
    try {
      indexBuffer = await readFile(indexPath);
    } catch {
      console.warn(`Skip missing index: ${indexPath}`);
      continue;
    }

    const entries = parseIndex(indexBuffer);
    for (const entry of entries) {
      const group = entry.packedOffset >>> 24;
      const offset = entry.packedOffset & 0x00ffffff;
      const packagePath = path.join(source, `${category}${group}.pkg`);
      const packageBuffer = await readFile(packagePath);
      const end = offset + entry.size;
      if (end > packageBuffer.length) {
        throw new Error(`Resource ${entry.name} exceeds ${packagePath} bounds.`);
      }

      const bytes = Buffer.from(packageBuffer.subarray(offset, end));
      const xorLength = Math.min(20, bytes.length);
      for (let i = 0; i < xorLength; i += 1) bytes[i] ^= xorKey;

      const destination = safeOutputPath(output, category, entry.name);
      await mkdir(path.dirname(destination), { recursive: true });
      await writeFile(destination, bytes);
      extracted += 1;
    }
    console.log(`${category}: ${entries.length} resource(s)`);
  }

  console.log(`Extracted ${extracted} resource(s) to ${output}`);
}

main().catch((error) => {
  console.error(error.message);
  process.exitCode = 1;
});
