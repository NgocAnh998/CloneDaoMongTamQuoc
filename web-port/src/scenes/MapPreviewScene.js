import { GAME_VIEW } from "../core/GameRuntime.js";
import { parseJ2MEMap } from "../data/J2MEMapParser.js";

const TILE = 16;
const HUD_HEIGHT = 24;
const FOOTER_HEIGHT = 20;
const VIEW_HEIGHT = GAME_VIEW.height - HUD_HEIGHT - FOOTER_HEIGHT;

export class MapPreviewScene {
  #map;
  #background;
  #foreground;
  #animations;
  #onExit;
  #cameraX = 0;
  #cameraY = 0;
  #showEntities = true;
  #showCollision = false;
  #drawnSprites = 0;
  #fallbackEntities = 0;

  static async create(assets, mapName = "001", onExit = () => {}) {
    const data = await assets.loadBinary(mapName, "map");
    const map = parseJ2MEMap(data, mapName);

    const [background, foreground] = await Promise.all([
      assets.loadImageById(map.layer1ImageId),
      assets.loadImageById(map.layer2ImageId)
    ]);

    const animationIds = [...new Set(map.entities.map((entity) => entity.animationId))];
    const animationEntries = await Promise.all(animationIds.map(async (id) => {
      try {
        return [id, await assets.loadAnimation(id)];
      } catch (error) {
        console.warn(`Animation ${id} could not be loaded:`, error);
        return [id, null];
      }
    }));

    return new MapPreviewScene(
      map,
      background,
      foreground,
      new Map(animationEntries),
      onExit
    );
  }

  constructor(map, background, foreground, animations, onExit) {
    this.#map = map;
    this.#background = background;
    this.#foreground = foreground;
    this.#animations = animations;
    this.#onExit = onExit;

    const pixelWidth = map.width * TILE;
    const pixelHeight = map.height * TILE;
    this.#cameraX = Math.max(0, Math.floor((pixelWidth - GAME_VIEW.width) / 2));
    this.#cameraY = Math.max(0, Math.floor((pixelHeight - VIEW_HEIGHT) / 2));
  }

  update() {}

  render(ctx) {
    ctx.fillStyle = "#111820";
    ctx.fillRect(0, 0, GAME_VIEW.width, GAME_VIEW.height);

    ctx.save();
    ctx.beginPath();
    ctx.rect(0, HUD_HEIGHT, GAME_VIEW.width, VIEW_HEIGHT);
    ctx.clip();

    ctx.fillStyle = "#101820";
    ctx.fillRect(0, HUD_HEIGHT, GAME_VIEW.width, VIEW_HEIGHT);

    const startX = Math.max(0, Math.floor(this.#cameraX / TILE));
    const startY = Math.max(0, Math.floor(this.#cameraY / TILE));
    const endX = Math.min(
      this.#map.width,
      Math.ceil((this.#cameraX + GAME_VIEW.width) / TILE)
    );
    const endY = Math.min(
      this.#map.height,
      Math.ceil((this.#cameraY + VIEW_HEIGHT) / TILE)
    );

    this.#drawLayer(ctx, this.#background, this.#map.layer1, startX, startY, endX, endY);

    this.#drawnSprites = 0;
    this.#fallbackEntities = 0;
    if (this.#showEntities) this.#drawEntitySprites(ctx);

    this.#drawLayer(ctx, this.#foreground, this.#map.layer2, startX, startY, endX, endY);

    if (this.#showCollision) this.#drawCollision(ctx);

    ctx.restore();
    this.#drawHud(ctx);
  }

  #drawLayer(ctx, atlas, tiles, startX, startY, endX, endY) {
    if (!atlas) return;

    for (let x = startX; x < endX; x += 1) {
      for (let y = startY; y < endY; y += 1) {
        // The original J2ME map stores cells column-first: x * mapHeight + y.
        const tile = tiles[x * this.#map.height + y];
        if (!tile || tile.atlasX === 255 || tile.atlasY === 255) continue;

        const destX = x * TILE - this.#cameraX;
        const destY = y * TILE - this.#cameraY + HUD_HEIGHT;
        this.#drawTile(ctx, atlas, tile, destX, destY);
      }
    }
  }

  #drawTile(ctx, atlas, tile, x, y) {
    const sx = tile.atlasX * TILE;
    const sy = tile.atlasY * TILE;
    if (sx + TILE > atlas.width || sy + TILE > atlas.height) return;

    ctx.save();
    ctx.translate(x, y);
    applySpriteTransform(ctx, tile.transform, TILE, TILE);
    ctx.drawImage(atlas, sx, sy, TILE, TILE, 0, 0, TILE, TILE);
    ctx.restore();
  }

  #drawEntitySprites(ctx) {
    for (const entity of this.#map.entities) {
      const animation = this.#animations.get(entity.animationId);
      const action = animation?.actions?.[entity.frame] ?? animation?.actions?.[0];
      const sequenceEntry = action?.sequence?.find((entry) => entry.frameIndex >= 0);
      const frame = sequenceEntry
        ? animation?.frames?.[sequenceEntry.frameIndex]
        : null;

      if (!animation || !frame || frame.parts.length === 0) {
        this.#drawEntityFallback(ctx, entity);
        this.#fallbackEntities += 1;
        continue;
      }

      const drewSprite = this.#drawAnimationFrame(ctx, entity, animation, frame);
      if (drewSprite) {
        this.#drawnSprites += 1;
      } else {
        this.#drawEntityFallback(ctx, entity);
        this.#fallbackEntities += 1;
      }
    }
  }

  #drawAnimationFrame(ctx, entity, animation, frame) {
    let drewPart = false;
    const anchorX = entity.x * TILE - this.#cameraX;
    const anchorY = entity.y * TILE - this.#cameraY + HUD_HEIGHT;

    for (const part of frame.parts) {
      const rectangle = animation.rectangles[part.rectangleIndex];
      if (!rectangle || rectangle.width <= 0 || rectangle.height <= 0) continue;

      // Map 001 currently references single-atlas animations. Multi-atlas
      // animation slicing is not yet ported, so use the first atlas as a safe fallback.
      const imageEntry = animation.mode === "single"
        ? animation.images[0]
        : (animation.images[part.rectangleIndex] ?? animation.images[0]);
      const atlas = imageEntry?.image;
      if (!atlas) continue;

      const sx = rectangle.x;
      const sy = rectangle.y;
      const sw = rectangle.width;
      const sh = rectangle.height;
      if (sx < 0 || sy < 0 || sx + sw > atlas.width || sy + sh > atlas.height) continue;

      const x = anchorX + part.x;
      const y = anchorY + part.y;
      if (
        x + sw < -TILE ||
        y + sh < HUD_HEIGHT - TILE ||
        x > GAME_VIEW.width + TILE ||
        y > HUD_HEIGHT + VIEW_HEIGHT + TILE
      ) {
        continue;
      }

      ctx.save();
      ctx.translate(x, y);
      applySpriteTransform(ctx, part.transform, sw, sh);
      ctx.drawImage(atlas, sx, sy, sw, sh, 0, 0, sw, sh);
      ctx.restore();
      drewPart = true;
    }

    return drewPart;
  }

  #drawEntityFallback(ctx, entity) {
    const x = entity.x * TILE - this.#cameraX + TILE / 2;
    const y = entity.y * TILE - this.#cameraY + HUD_HEIGHT + TILE / 2;
    if (
      x < -TILE ||
      y < HUD_HEIGHT - TILE ||
      x > GAME_VIEW.width + TILE ||
      y > HUD_HEIGHT + VIEW_HEIGHT + TILE
    ) {
      return;
    }

    ctx.fillStyle = entity.layer === 0
      ? "rgba(255, 209, 112, 0.92)"
      : "rgba(116, 208, 255, 0.9)";
    ctx.beginPath();
    ctx.arc(x, y, 2.4, 0, Math.PI * 2);
    ctx.fill();
  }

  #drawCollision(ctx) {
    for (const cell of this.#map.collision) {
      if (cell.x >= this.#map.width || cell.y >= this.#map.height) continue;
      const x = cell.x * TILE - this.#cameraX;
      const y = cell.y * TILE - this.#cameraY + HUD_HEIGHT;
      if (
        x < -TILE ||
        y < HUD_HEIGHT - TILE ||
        x > GAME_VIEW.width ||
        y > HUD_HEIGHT + VIEW_HEIGHT
      ) {
        continue;
      }

      const shade = Math.max(0.12, Math.min(0.48, cell.value / 255));
      ctx.fillStyle = `rgba(255, 76, 66, ${shade})`;
      ctx.fillRect(x, y, TILE, TILE);
      ctx.strokeStyle = "rgba(255, 190, 175, 0.3)";
      ctx.strokeRect(x + 0.5, y + 0.5, TILE - 1, TILE - 1);
    }
  }

  #drawHud(ctx) {
    ctx.fillStyle = "rgba(5, 10, 16, 0.96)";
    ctx.fillRect(0, 0, GAME_VIEW.width, HUD_HEIGHT);
    ctx.fillRect(0, GAME_VIEW.height - FOOTER_HEIGHT, GAME_VIEW.width, FOOTER_HEIGHT);

    ctx.fillStyle = "#ffe0a0";
    ctx.font = "bold 11px Arial, sans-serif";
    ctx.textAlign = "left";
    ctx.textBaseline = "middle";
    ctx.fillText(`MAP ${this.#map.resourceName}`, 8, 12);

    ctx.fillStyle = "#e2e8ef";
    ctx.textAlign = "right";
    ctx.font = "9px Arial, sans-serif";
    ctx.fillText(
      `${this.#map.width}×${this.#map.height} ô · ${this.#drawnSprites} sprites · ${this.#fallbackEntities} fallback`,
      312,
      12
    );

    ctx.fillStyle = "#bac6d3";
    ctx.textAlign = "center";
    ctx.font = "9px Arial, sans-serif";
    const collisionLabel = this.#showCollision ? "Collision: ON" : "Collision: OFF";
    const entityLabel = this.#showEntities ? "Entities: ON" : "Entities: OFF";
    ctx.fillText(
      `← ↑ → ↓ Camera · E ${entityLabel} · C ${collisionLabel} · ESC Quay lại`,
      160,
      GAME_VIEW.height - 10
    );
  }

  handleKey(type, event) {
    if (type !== "down") return;

    switch (event.key) {
      case "Escape":
      case "Backspace":
        this.#onExit();
        break;
      case "ArrowLeft":
        this.#moveCamera(-TILE, 0);
        break;
      case "ArrowRight":
        this.#moveCamera(TILE, 0);
        break;
      case "ArrowUp":
        this.#moveCamera(0, -TILE);
        break;
      case "ArrowDown":
        this.#moveCamera(0, TILE);
        break;
      case "e":
      case "E":
        this.#showEntities = !this.#showEntities;
        break;
      case "c":
      case "C":
        this.#showCollision = !this.#showCollision;
        break;
      default:
        break;
    }
  }

  #moveCamera(dx, dy) {
    const maxX = Math.max(0, this.#map.width * TILE - GAME_VIEW.width);
    const maxY = Math.max(0, this.#map.height * TILE - VIEW_HEIGHT);
    this.#cameraX = Math.max(0, Math.min(maxX, this.#cameraX + dx));
    this.#cameraY = Math.max(0, Math.min(maxY, this.#cameraY + dy));
  }

  handlePointer() {
    // Keyboard panning is intentional for the first map-data inspection pass.
  }
}

function applySpriteTransform(ctx, transform, width, height) {
  // MIDP Sprite.TRANS_* values: mirror/rotate semantics from J2ME.
  switch (transform & 7) {
    case 1: // TRANS_MIRROR_ROT180: vertical flip
      ctx.transform(1, 0, 0, -1, 0, height);
      break;
    case 2: // TRANS_MIRROR: horizontal flip
      ctx.transform(-1, 0, 0, 1, width, 0);
      break;
    case 3: // TRANS_ROT180
      ctx.transform(-1, 0, 0, -1, width, height);
      break;
    case 4: // TRANS_MIRROR_ROT270: diagonal reflection
      ctx.transform(0, 1, 1, 0, 0, 0);
      break;
    case 5: // TRANS_ROT90
      ctx.transform(0, 1, -1, 0, height, 0);
      break;
    case 6: // TRANS_ROT270
      ctx.transform(0, -1, 1, 0, 0, width);
      break;
    case 7: // TRANS_MIRROR_ROT90: anti-diagonal reflection
      ctx.transform(0, -1, -1, 0, height, width);
      break;
    default:
      break;
  }
}
