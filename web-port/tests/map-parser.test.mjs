import assert from "node:assert/strict";
import { isWalkableTile, parseJ2MEMap } from "../src/data/J2MEMapParser.js";

function buildMapFixture() {
  const bytes = [];
  const u8 = (value) => bytes.push(value & 0xff);
  const u16 = (value) => {
    u8((value >> 8) & 0xff);
    u8(value & 0xff);
  };
  const javaUtf = (value) => {
    const encoded = new TextEncoder().encode(value);
    u16(encoded.length);
    for (const byte of encoded) u8(byte);
  };

  javaUtf("fixture-map");
  u8(0); // reserved
  u8(2); // width
  u8(2); // height

  u16(103); // background atlas image ID
  for (let i = 0; i < 4; i += 1) { u8(0); u8(0); u8(0); }

  u16(104); // foreground atlas image ID
  for (let i = 0; i < 4; i += 1) { u8(255); u8(255); u8(0); }

  u16(0); // entities

  u16(1); // collision records
  u8(1); u8(0); u8(3); // block tile (1,0)

  u8(0); // extra
  u8(0); // no parallax
  return Uint8Array.from(bytes);
}

const map = parseJ2MEMap(buildMapFixture(), "fixture-map");
assert.equal(map.width, 2);
assert.equal(map.height, 2);
assert.equal(map.layer1ImageId, 103);
assert.equal(map.layer2ImageId, 104);
assert.equal(map.collisionCount, undefined);
assert.equal(map.collision.length, 1);
assert.equal(map.collisionGrid[1 * map.height + 0], 3);
assert.equal(isWalkableTile(map, 0, 0), true);
assert.equal(isWalkableTile(map, 1, 0), false);
assert.equal(isWalkableTile(map, 1, 1), true);
assert.equal(isWalkableTile(map, -1, 0), false);
assert.equal(isWalkableTile(map, 2, 0), false);
assert.equal(map.trailingBytes, 0);

console.log("J2ME map parser + collision fixture: PASS");
