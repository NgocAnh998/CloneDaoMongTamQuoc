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

- Browser Canvas runtime at the original logical size of **320 × 360**.
- Fixed update step of approximately **100 ms**, matching the J2ME game loop.
- Original 320×360 splash artwork and original menu/background assets.
- Menu navigation by keyboard and pointer/touch.
- Selecting **Bản đồ** loads map resource `001`, resolves its two original image atlases by the ID catalog from `images.dat`, and renders both tile layers.
- Map data parser reads map dimensions, tile transforms, animation/entity references, collision records, and the optional parallax flag.
- The map preview can pan in 16-pixel steps with the arrow keys. Press `E` to toggle entity markers, `C` to toggle a raw collision-data overlay, and `ESC` to return to the menu.

The map preview renders the original tiles and marks the entity locations, but does **not** yet animate those entities or simulate the player, movement rules, NPC AI, battles, or quests.

## Resource extraction

The source game stores resource data in paired `.idx` and `.pkg` files. An index entry contains a Java modified-UTF resource name, a 32-bit byte length, and a packed offset. The highest byte of the packed offset is the package number; the lower 24 bits are the byte offset.

The original loader XORs the first 20 bytes of every resource with a one-byte key. I verified the key as **97 decimal (`0x61`)** by checking that decoded image data begins with the PNG signature and decoded music data begins with the MIDI `MThd` header.

The extractor can also be run manually:

```bash
node scripts/extract-pack.mjs --source ../DaoMong-TamQuoc-360x640.jar.src --out public/assets
```

To override the verified key for diagnostics only, use `--xor-key 97`.

The extractor writes `public/assets/resource-manifest.json`, including resource paths, image-ID mappings from `images.dat`, and static game datasets.

## Porting plan

1. Match the original splash/menu transitions more precisely.
2. Port map entities and the original animation-file format in `ani.idx/.pkg`.
3. Port the player character, movement, collision response, and camera-follow behavior.
4. Port NPC behavior, combat, skills, inventory, quests, and persistence.
5. Compare each ported scene and mechanic against the original J2ME game.

The Java source is heavily obfuscated and some classes were not recovered cleanly by the decompiler. The port is therefore behavior- and data-format-based, not a mechanical syntax conversion. The original source is preserved unchanged for reference.
