# Đạo Mộng Tam Quốc — JavaScript port

This folder is the new browser-based implementation. The original Java ME source remains untouched in `../DaoMong-TamQuoc-360x640.jar.src/`.

## Run

Requires Node.js 20 or newer.

```bash
cd web-port
npm run dev
```

Open the local URL printed by the server (default: `http://localhost:4173`).

Run syntax checks with:

```bash
npm run check
```

## Current status

The initial Canvas runtime and scene stack are in place. The current screen is only a development status scene; it is not yet the original game.

The Java ME source indicates a logical drawing area of **320 × 360** and a legacy update cadence of approximately **100 ms**. The browser runtime preserves those values while rendering through Canvas 2D.

## Original resource packs

The Java code loads resources through paired `.idx` and `.pkg` files. The index records contain a Java modified-UTF resource name, a 32-bit byte length, and a packed offset. The packed offset stores the package number in its highest byte and the byte offset in its lower 24 bits. The original loader XORs up to the first 20 bytes of each resource using a one-byte key derived through `dcn.bin`.

A first-pass extractor is provided at `scripts/extract-pack.mjs`. It deliberately requires the correct key instead of silently guessing it:

```bash
node scripts/extract-pack.mjs --source ../DaoMong-TamQuoc-360x640.jar.src --out public/assets --xor-key <0-255>
```

**The XOR key derivation from `dcn.bin` has not been ported yet.** The extractor is therefore infrastructure, not a claim that the original assets are already decoded.

## Porting sequence

1. Reproduce the `dcn.bin` key derivation and verify decoded image bytes.
2. Extract and catalogue images, maps, animation frames, role data, UI text, and MIDI.
3. Port the splash/menu and scene transitions.
4. Port map rendering, player/NPC entities, movement, combat, skills, inventory, quests, and persistence.
5. Compare each screen and mechanic against the original game.

The original Java source is heavily obfuscated (short class/member names), so porting is based on behavior and data formats rather than a mechanical Java-to-JavaScript syntax conversion.
