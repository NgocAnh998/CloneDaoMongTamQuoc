import { GameRuntime } from "./core/GameRuntime.js";
import { PortStatusScene } from "./scenes/PortStatusScene.js";

const canvas = document.querySelector("#gameCanvas");
const status = document.querySelector("#runtimeStatus");

try {
  const game = new GameRuntime(canvas);
  game.addScene(new PortStatusScene());
  game.start();

  status.textContent = "Runtime hoạt động · vùng vẽ logic 320 × 360 · nhịp game 100 ms";
  window.addEventListener("pagehide", () => game.stop(), { once: true });
} catch (error) {
  console.error(error);
  status.textContent = `Không thể khởi động game: ${error.message}`;
}
