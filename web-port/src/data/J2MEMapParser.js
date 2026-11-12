import { BinaryReader } from "./BinaryReader.js";

const MAX_MAP_DIMENSION = 255;

export function parseJ2MEMap(source, resourceName = "unknown") {
  const reader = new BinaryReader(source);
  const internalName = reader.readJavaUtf();
  const reserved = reader.readU8();
  const width = reader.readU8();
  const height = reader.readU8();

  if (
    width < 1 ||
    height < 1 ||
    width > MAX_MAP_DIMENSION ||
    height > MAX_MAP_DIMENSION
  ) {
    throw new Error(`Map ${resourceName} has invalid dimensions: ${width} × ${height}.`);
  }

  const cellCount = width * height;
  const layer1ImageId = reader.readU16();
  const layer1 = readTileLayer(reader, cellCount);
  const layer2ImageId = reader.readU16();
  const layer2 = readTileLayer(reader, cellCount);

  const entityCount = reader.readU16();
  const entities = [];
  for (let i = 0; i < entityCount; i += 1) {
    entities.push({
      animationId: reader.readU16(),
      frame: reader.readU16(),
      x: reader.readU8(),
      y: reader.readU8(),
      layer: reader.readU8()
    });
  }

  const collisionCount = reader.readU16();
  const collision = [];
  for (let i = 0; i < collisionCount; i += 1) {
    collision.push({
      x: reader.readU8(),
      y: reader.readU8(),
      value: reader.readU8()
    });
  }

  const extra = reader.readU8();
  const hasParallax = reader.readBoolean();

  return {
    resourceName,
    internalName,
    reserved,
    width,
    height,
    tileSize: 16,
    layer1ImageId,
    layer1,
    layer2ImageId,
    layer2,
    entities,
    collision,
    extra,
    hasParallax,
    // The original J2ME renderer uses its fixed image resource ID 4 when enabled.
    parallaxImageId: hasParallax ? 4 : null,
    trailingBytes: reader.remaining
  };
}

function readTileLayer(reader, cellCount) {
  const tiles = new Array(cellCount);
  for (let i = 0; i < cellCount; i += 1) {
    tiles[i] = {
      atlasX: reader.readU8(),
      atlasY: reader.readU8(),
      transform: reader.readU8()
    };
  }
  return tiles;
}

export function getTile(map, x, y, layer = 1) {
  if (x < 0 || y < 0 || x >= map.width || y >= map.height) return null;
  const index = x * map.height + y;
  return (layer === 1 ? map.layer1 : map.layer2)[index] ?? null;
}
