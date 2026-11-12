import { SceneStack } from "./SceneStack.js";

const LOGICAL_WIDTH = 320;
const LOGICAL_HEIGHT = 360;
const LEGACY_TICK_MS = 100;

export class GameRuntime {
  #canvas;
  #context;
  #stack = new SceneStack();
  #rafId = 0;
  #lastFrame = 0;
  #accumulator = 0;
  #running = false;

  #onKeyDown = (event) => {
    if (["ArrowUp", "ArrowDown", "ArrowLeft", "ArrowRight", " "].includes(event.key)) {
      event.preventDefault();
    }
    this.#stack.handleKey("down", event);
  };

  #onKeyUp = (event) => {
    this.#stack.handleKey("up", event);
  };

  #frame = (timestamp) => {
    if (!this.#running) return;

    if (this.#lastFrame === 0) this.#lastFrame = timestamp;
    const elapsed = Math.min(timestamp - this.#lastFrame, 500);
    this.#lastFrame = timestamp;
    this.#accumulator += elapsed;

    while (this.#accumulator >= LEGACY_TICK_MS) {
      this.#stack.update(LEGACY_TICK_MS);
      this.#accumulator -= LEGACY_TICK_MS;
    }

    this.#context.clearRect(0, 0, LOGICAL_WIDTH, LOGICAL_HEIGHT);
    this.#stack.render(this.#context, this.#accumulator / LEGACY_TICK_MS);
    this.#rafId = requestAnimationFrame(this.#frame);
  };

  constructor(canvas) {
    if (!(canvas instanceof HTMLCanvasElement)) {
      throw new TypeError("GameRuntime requires a canvas element.");
    }

    const context = canvas.getContext("2d", { alpha: false });
    if (!context) throw new Error("Canvas 2D is not available.");

    this.#canvas = canvas;
    this.#context = context;
    this.#canvas.width = LOGICAL_WIDTH;
    this.#canvas.height = LOGICAL_HEIGHT;
    this.#context.imageSmoothingEnabled = false;
  }

  addScene(scene) {
    this.#stack.push(scene);
  }

  start() {
    if (this.#running) return;
    this.#running = true;
    this.#lastFrame = 0;
    window.addEventListener("keydown", this.#onKeyDown);
    window.addEventListener("keyup", this.#onKeyUp);
    this.#rafId = requestAnimationFrame(this.#frame);
  }

  stop() {
    if (!this.#running) return;
    this.#running = false;
    cancelAnimationFrame(this.#rafId);
    window.removeEventListener("keydown", this.#onKeyDown);
    window.removeEventListener("keyup", this.#onKeyUp);
    this.#stack.destroy();
  }
}

export const GAME_VIEW = Object.freeze({
  width: LOGICAL_WIDTH,
  height: LOGICAL_HEIGHT,
  tickMs: LEGACY_TICK_MS
});
