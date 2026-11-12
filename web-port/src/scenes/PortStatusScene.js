import { GAME_VIEW } from "../core/GameRuntime.js";

export class PortStatusScene {
  #ticks = 0;

  update() {
    this.#ticks += 1;
  }

  render(ctx) {
    ctx.fillStyle = "#090b10";
    ctx.fillRect(0, 0, GAME_VIEW.width, GAME_VIEW.height);

    ctx.strokeStyle = "#454d5c";
    ctx.lineWidth = 1;
    ctx.strokeRect(8.5, 8.5, GAME_VIEW.width - 17, GAME_VIEW.height - 17);

    ctx.textAlign = "center";
    ctx.fillStyle = "#f1f3f6";
    ctx.font = "bold 17px Arial";
    ctx.fillText("ĐẠO MỘNG TAM QUỐC", GAME_VIEW.width / 2, 138);

    ctx.fillStyle = "#aeb8c7";
    ctx.font = "11px Arial";
    ctx.fillText("JAVASCRIPT PORT", GAME_VIEW.width / 2, 158);

    ctx.strokeStyle = "#555f70";
    ctx.beginPath();
    ctx.moveTo(48, 178);
    ctx.lineTo(GAME_VIEW.width - 48, 178);
    ctx.stroke();

    ctx.fillStyle = "#d4dbe5";
    ctx.font = "12px Arial";
    ctx.fillText("Runtime đã khởi động", GAME_VIEW.width / 2, 205);

    ctx.fillStyle = "#8490a1";
    ctx.font = "10px Arial";
    ctx.fillText("Chưa nạp dữ liệu hình ảnh / bản đồ gốc", GAME_VIEW.width / 2, 226);
    ctx.fillText("Tick tương thích: 100 ms", GAME_VIEW.width / 2, 246);
    ctx.fillText(`Frames: ${this.#ticks}`, GAME_VIEW.width / 2, 266);
  }

  handleKey(type, event) {
    if (type === "down" && event.key === "Escape") {
      // Reserved for the game's future pause/back command.
    }
  }
}
