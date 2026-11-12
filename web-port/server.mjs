import { spawnSync } from "node:child_process";
import { access, readFile } from "node:fs/promises";
import { createServer } from "node:http";
import path from "node:path";
import { fileURLToPath } from "node:url";

const here = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(here);
const source = path.resolve(here, "../DaoMong-TamQuoc-360x640.jar.src");
const assetsRoot = path.join(here, "public", "assets");
const manifestPath = path.join(assetsRoot, "resource-manifest.json");
const extractorPath = path.join(here, "scripts", "extract-pack.mjs");
const port = Number(process.env.PORT || 4173);

const mime = {
  ".html": "text/html; charset=utf-8",
  ".css": "text/css; charset=utf-8",
  ".js": "text/javascript; charset=utf-8",
  ".json": "application/json; charset=utf-8",
  ".png": "image/png",
  ".jpg": "image/jpeg",
  ".jpeg": "image/jpeg",
  ".webp": "image/webp",
  ".ogg": "audio/ogg",
  ".mp3": "audio/mpeg",
  ".mid": "audio/midi",
  ".midi": "audio/midi"
};

async function ensureAssets() {
  try {
    await access(manifestPath);
    const manifest = JSON.parse(await readFile(manifestPath, "utf8"));
    const hasImageCatalog = Array.isArray(manifest.imageCatalog) && manifest.imageCatalog.length > 0;
    const hasMapCatalog = Array.isArray(manifest.categories?.map) && manifest.categories.map.length > 0;
    const hasTextCatalog = Array.isArray(manifest.staticFiles) &&
      manifest.staticFiles.some((file) => file.name === "txt.dat");
    if (hasImageCatalog && hasMapCatalog && hasTextCatalog) {
      console.log("Decoded game resources and image catalog found in public/assets.");
      return;
    }
    console.log("Existing resource manifest is from an older extractor; rebuilding it.");
  } catch {
    // First run or stale manifest: decode the original package files.
  }

  console.log("Extracting original J2ME game resources with verified XOR key 0x61…");
  const result = spawnSync(
    process.execPath,
    [extractorPath, "--source", source, "--out", assetsRoot],
    { cwd: here, stdio: "inherit" }
  );

  if (result.error) throw result.error;
  if (result.status !== 0) {
    throw new Error(`Resource extraction exited with status ${result.status ?? "unknown"}.`);
  }
}

const server = createServer(async (req, res) => {
  try {
    const pathname = decodeURIComponent(new URL(req.url || "/", "http://localhost").pathname);
    const requested = pathname === "/" ? "/index.html" : pathname;
    const filePath = path.resolve(root, "." + requested);
    const relative = path.relative(root, filePath);

    if (relative.startsWith("..") || path.isAbsolute(relative)) {
      res.writeHead(403);
      res.end("Forbidden");
      return;
    }

    const body = await readFile(filePath);
    res.writeHead(200, {
      "Content-Type": mime[path.extname(filePath).toLowerCase()] || "application/octet-stream",
      "Cache-Control": "no-cache"
    });
    res.end(body);
  } catch {
    res.writeHead(404, { "Content-Type": "text/plain; charset=utf-8" });
    res.end("Not found");
  }
});

ensureAssets()
  .then(() => {
    server.listen(port, "127.0.0.1", () => {
      console.log(`Dao Mong Tam Quoc web port: http://localhost:${port}`);
    });
  })
  .catch((error) => {
    console.error(`Cannot start web port: ${error.message}`);
    process.exitCode = 1;
  });
