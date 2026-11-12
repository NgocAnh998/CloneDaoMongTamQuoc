import assert from "node:assert/strict";
import { parseJ2MEAnimation } from "../src/data/J2MEAnimationParser.js";

function buildAnimationFixture() {
  const bytes = [];
  const u8 = (value) => bytes.push(value & 0xff);
  const u16 = (value) => {
    u8((value >> 8) & 0xff);
    u8(value & 0xff);
  };
  const i16 = (value) => u16(value < 0 ? value + 0x10000 : value);
  const javaUtf = (value) => {
    const encoded = new TextEncoder().encode(value);
    u16(encoded.length);
    for (const byte of encoded) u8(byte);
  };

  // One 12×14 source rectangle.
  u16(1);
  i16(0); i16(0); i16(12); i16(14);

  // One frame. Bounds are stored as shorts then narrowed to signed bytes.
  u16(1);
  i16(-130); i16(-10); i16(130); i16(10);
  u8(0); // no primary hitbox
  u8(0); // no secondary hitbox

  // One part: rectangle 0, transform 5, offset (-3, 12).
  u16(1);
  i16(0); u8(5); i16(-3); i16(12);

  // One action named "idle", with frame 1 lasting six J2ME ticks.
  u16(1);
  javaUtf("idle");
  u16(1);
  u8(1);
  u16(6);

  return Uint8Array.from(bytes);
}

const parsed = parseJ2MEAnimation(buildAnimationFixture(), "fixture.ani");

assert.equal(parsed.resourceName, "fixture.ani");
assert.deepEqual(parsed.rectangles, [{ x: 0, y: 0, width: 12, height: 14 }]);
assert.deepEqual(parsed.frames[0].bounds, {
  left: 126,
  top: -10,
  right: -126,
  bottom: 10
});
assert.deepEqual(parsed.frames[0].parts, [{
  rectangleIndex: 0,
  transform: 5,
  x: -3,
  y: 12
}]);
assert.deepEqual(parsed.actions[0], {
  index: 0,
  name: "idle",
  sequence: [{ frameIndex: 1, duration: 6 }]
});
assert.equal(parsed.trailingBytes, 0);

console.log("J2ME animation parser fixture: PASS");
