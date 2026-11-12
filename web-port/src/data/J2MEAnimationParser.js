import { BinaryReader } from "./BinaryReader.js";

const MAX_RECTS = 4096;
const MAX_FRAMES = 4096;
const MAX_PARTS_PER_FRAME = 1024;
const MAX_ACTIONS = 1024;
const MAX_ACTION_STEPS = 4096;

export function parseJ2MEAnimation(source, resourceName = "unknown") {
  const reader = new BinaryReader(source);

  const rectCount = reader.readU16();
  if (rectCount > MAX_RECTS) {
    throw new Error(`Animation ${resourceName} has too many sprite rectangles: ${rectCount}.`);
  }

  const rectangles = [];
  for (let i = 0; i < rectCount; i += 1) {
    rectangles.push({
      x: reader.readI16(),
      y: reader.readI16(),
      width: reader.readI16(),
      height: reader.readI16()
    });
  }

  const frameCount = reader.readU16();
  if (frameCount > MAX_FRAMES) {
    throw new Error(`Animation ${resourceName} has too many frames: ${frameCount}.`);
  }

  const frames = [];
  for (let frameIndex = 0; frameIndex < frameCount; frameIndex += 1) {
    // bc.java reads four shorts, then narrows each value to a signed byte.
    const bounds = readFourNarrowedBytes(reader);

    const hasPrimaryHitbox = reader.readBoolean();
    const primaryHitbox = hasPrimaryHitbox ? readFourNarrowedBytes(reader) : null;
    const hasSecondaryHitbox = reader.readBoolean();
    const secondaryHitbox = hasSecondaryHitbox ? readFourNarrowedBytes(reader) : null;

    const partCount = reader.readU16();
    if (partCount > MAX_PARTS_PER_FRAME) {
      throw new Error(`Animation ${resourceName}, frame ${frameIndex} has too many sprite parts.`);
    }

    const parts = [];
    for (let partIndex = 0; partIndex < partCount; partIndex += 1) {
      parts.push({
        // The original stores this field in a short array but later reads it as a byte.
        rectangleIndex: narrowSignedByte(reader.readI16()),
        transform: reader.readI8(),
        x: reader.readI16(),
        y: reader.readI16()
      });
    }

    frames.push({
      index: frameIndex,
      bounds,
      hasPrimaryHitbox,
      primaryHitbox,
      hasSecondaryHitbox,
      secondaryHitbox,
      parts
    });
  }

  const actionCount = reader.readU16();
  if (actionCount > MAX_ACTIONS) {
    throw new Error(`Animation ${resourceName} has too many actions: ${actionCount}.`);
  }

  const actions = [];
  for (let actionIndex = 0; actionIndex < actionCount; actionIndex += 1) {
    const name = reader.readJavaUtf();
    const stepCount = reader.readU16();
    if (stepCount > MAX_ACTION_STEPS) {
      throw new Error(`Animation ${resourceName}, action ${actionIndex} has too many steps.`);
    }

    const sequence = [];
    for (let stepIndex = 0; stepIndex < stepCount; stepIndex += 1) {
      sequence.push({
        frameIndex: reader.readI8(),
        duration: reader.readU16()
      });
    }
    actions.push({ index: actionIndex, name, sequence });
  }

  return {
    resourceName,
    rectangles,
    frames,
    actions,
    trailingBytes: reader.remaining
  };
}

function readFourNarrowedBytes(reader) {
  return {
    left: narrowSignedByte(reader.readI16()),
    top: narrowSignedByte(reader.readI16()),
    right: narrowSignedByte(reader.readI16()),
    bottom: narrowSignedByte(reader.readI16())
  };
}

function narrowSignedByte(value) {
  return (value << 24) >> 24;
}
