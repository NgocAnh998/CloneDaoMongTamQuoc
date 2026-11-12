# Đạo Mộng Tam Quốc — JavaScript port

This folder contains the new browser implementation. The original Java ME source remains untouched in `../DaoMong-TamQuoc-360x640.jar.src/`.

## Run

Requires Node.js 20 or newer.

```bash
cd web-port
npm run dev
```

Open the local URL printed by the server (default: `http://localhost:4173`).

On the first run, the server extracts the original `.idx/.pkg` resource packs and static datasets into `public/assets/`. The generated files stay on your computer and do not need to be committed to GitHub.

Run syntax checks with:

```bash
npm run check
```

## What works now

- Browser Canvas runtime at the original logical size of **320 × 360**, with a fixed game update step of approximately **100 ms**.
- Original title artwork and original menu/background assets.
- The post-splash music question uses the original Vietnamese strings decoded from `txt.dat` (IDs 0, 1, and 2: prompt, “Có”, and “Không”). The user's choice is captured, but MIDI playback itself is not ported yet.
- Selecting **Bản đồ** opens map resource `001`, resolves its two original image atlases through `images.dat`, and renders both 16×16 tile layers.
- The map parser reads tile transforms, animation/entity references, collision records, and the optional parallax flag. It also parses `anis.dat` and `.ani` sprite-frame data, then draws original static entity sprites on map `001` for the animation formats currently supported. Unsupported multi-atlas/palette cases fall back to position markers.
- In the map preview, arrow keys pan the camera, `E` toggles entity sprites, `C` toggles a raw collision-data overlay, and `ESC` returns to the menu.
- Other menu sections are still placeholders; they are not represented as completed gameplay systems.

## Resource extraction

The source game stores resource data in paired `.idx` and `.pkg` files. An index entry contains a Java modified-UTF resource name, a 32-bit byte length, and a packed offset. The highest byte of the packed offset is the package number; the lower 24 bits are the byte offset.

The original loader XORs the first 20 bytes of every resource with a one-byte key. I verified the key as **97 decimal (`0x61`)** by checking that decoded image data begins with the PNG signature and decoded music data begins with the MIDI `MThd` header.

The extractor also copies plain game datasets such as `images.dat`, `txt.dat`, `anis.dat`, and `scenelv.dat`, and places their image ID and static-file indexes into `resource-manifest.json`.

To run extraction manually:

```bash
node scripts/extract-pack.mjs --source ../DaoMong-TamQuoc-360x640.jar.src --out public/assets
```

Generated files under `public/assets/` are ignored by Git.

## Porting plan

1. Reconstruct the original home/menu scene after the music question (the original `ar` class did not decompile cleanly).
2. Extend map sprite rendering to multi-atlas animations and timed action sequences from `ani.idx/.pkg`.
3. Complete multi-atlas animation slicing, action timing, and palette overlays; then port the player character, movement, collision response, and camera-follow behavior.
4. Port NPC behavior, combat, skills, inventory, quests, and persistence.
5. Compare each ported scene and mechanic against the original J2ME game.

The Java source is heavily obfuscated and some classes were not recovered cleanly by the decompiler. The port is therefore behavior- and data-format-based, not a mechanical syntax conversion. The original source is preserved unchanged for reference.
