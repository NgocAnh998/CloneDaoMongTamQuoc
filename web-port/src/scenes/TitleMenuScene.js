import { GAME_VIEW } from "../core/GameRuntime.js";

const MENU_ITEMS = [
  "Nhân vật", "Vật phẩm", "Võ tướng", "Nhiệm vụ",
  "Bản đồ", "Thành tựu", "Hệ thống", "Phụ ma"
];

const MENU_LAYOUT = MENU_ITEMS.map((label, index) => ({
  label,
  index,
  x: index % 2 === 0 ? 23 : 165,
  y: 88 + Math.floor(index / 2) * 59,
  width: 132,
  height: 43
}));

export class TitleMenuScene {
  #assets;
  #onOpenMap;
  #mode = "splash";
  #splashElapsed = 0;
  #selected = 0;
  #activeModule = null;
  #openingMap = false;
  #errorMessage = null;

  constructor(assets, onOpenMap = null) {
    this.#assets = assets;
    this.#onOpenMap = onOpenMap;
  }

  update(deltaMs) {
    if (this.#mode !== "splash") return;
    this.#splashElapsed += deltaMs;
    if (this.#splashElapsed >= 2400) this.#mode = "menu";
  }

  render(ctx) {
    if (this.#mode === "splash") {
      this.#renderSplash(ctx);
      return;
    }
    this.#renderMenu(ctx);
    if (this.#activeModule || this.#openingMap || this.#errorMessage) {
      this.#renderModulePanel(ctx);
    }
  }

  #renderSplash(ctx) {
    const title = this.#assets.getImage("240X320-80S.png");
    ctx.fillStyle = "#080d15";
    ctx.fillRect(0, 0, GAME_VIEW.width, GAME_VIEW.height);
    if (title) ctx.drawImage(title, 0, 0, GAME_VIEW.width, GAME_VIEW.height);

    const pulse = 0.72 + Math.sin(this.#splashElapsed / 180) * 0.18;
    ctx.fillStyle = `rgba(0, 0, 0, ${0.48 * pulse})`;
    ctx.fillRect(34, 322, 252, 25);
    ctx.strokeStyle = "rgba(232, 190, 112, 0.8)";
    ctx.strokeRect(34.5, 322.5, 251, 24);
    ctx.fillStyle = "#ffe7ac";
    ctx.font = "bold 10px Arial, sans-serif";
    ctx.textAlign = "center";
    ctx.fillText("CHẠM HOẶC NHẤN ENTER ĐỂ TIẾP TỤC", 160, 338);
  }

  #renderMenu(ctx) {
    const background = this.#assets.getImage("beijing.png");
    const header = this.#assets.getImage("zhujiemian3.png");
    const title = this.#assets.getImage("biaoti.png");
    const buttonArt = this.#assets.getImage("zhujiemian.png");

    ctx.fillStyle = "#101a25";
    ctx.fillRect(0, 0, GAME_VIEW.width, GAME_VIEW.height);
    if (background) {
      for (let y = 0; y < GAME_VIEW.height; y += 117) {
        for (let x = 0; x < GAME_VIEW.width; x += 160) {
          ctx.drawImage(background, x, y, 160, 117);
        }
      }
    }
    ctx.fillStyle = "rgba(4, 9, 16, 0.48)";
    ctx.fillRect(0, 0, GAME_VIEW.width, GAME_VIEW.height);

    if (header) ctx.drawImage(header, 0, 0, GAME_VIEW.width, 39);
    if (title) ctx.drawImage(title, 99, 8, 122, 24);

    ctx.textAlign = "center";
    ctx.fillStyle = "#ffdb94";
    ctx.font = "bold 10px Arial, sans-serif";
    ctx.fillText("MENU CHÍNH", 160, 61);

    for (const item of MENU_LAYOUT) {
      const selected = item.index === this.#selected;
      ctx.save();
      const gradient = ctx.createLinearGradient(item.x, item.y, item.x, item.y + item.height);
      if (selected) {
        gradient.addColorStop(0, "rgba(111, 60, 24, 0.96)");
        gradient.addColorStop(1, "rgba(48, 28, 20, 0.96)");
      } else {
        gradient.addColorStop(0, "rgba(31, 48, 62, 0.94)");
        gradient.addColorStop(1, "rgba(11, 20, 31, 0.94)");
      }
      ctx.fillStyle = gradient;
      ctx.fillRect(item.x, item.y, item.width, item.height);

      if (buttonArt && selected) {
        ctx.globalAlpha = 0.32;
        ctx.drawImage(buttonArt, item.x + 4, item.y + 1, item.width - 8, item.height - 2);
        ctx.globalAlpha = 1;
      }

      ctx.strokeStyle = selected ? "#f3c06e" : "rgba(157, 177, 193, 0.7)";
      ctx.lineWidth = selected ? 2 : 1;
      ctx.strokeRect(item.x + 0.5, item.y + 0.5, item.width - 1, item.height - 1);
      ctx.fillStyle = selected ? "#ffe1a1" : "#d6e0e8";
      ctx.font = selected ? "bold 13px Arial, sans-serif" : "12px Arial, sans-serif";
      ctx.textAlign = "center";
      ctx.textBaseline = "middle";
      ctx.fillText(item.label, item.x + item.width / 2, item.y + item.height / 2);

      if (selected) {
        ctx.fillStyle = "#ffce78";
        ctx.beginPath();
        ctx.moveTo(item.x + 8, item.y + item.height / 2);
        ctx.lineTo(item.x + 14, item.y + item.height / 2 - 5);
        ctx.lineTo(item.x + 14, item.y + item.height / 2 + 5);
        ctx.closePath();
        ctx.fill();
      }
      ctx.restore();
    }

    ctx.textBaseline = "alphabetic";
    ctx.fillStyle = "rgba(231, 220, 194, 0.88)";
    ctx.font = "9px Arial, sans-serif";
    ctx.textAlign = "center";
    ctx.fillText("↑ ↓ Chọn mục     ENTER Mở     ESC Quay lại", 160, 348);
  }

  #renderModulePanel(ctx) {
    ctx.fillStyle = "rgba(0, 0, 0, 0.78)";
    ctx.fillRect(16, 100, 288, 156);
    ctx.strokeStyle = "#dcae65";
    ctx.lineWidth = 2;
    ctx.strokeRect(17, 101, 286, 154);
    ctx.textAlign = "center";
    ctx.fillStyle = "#ffe0a2";
    ctx.font = "bold 16px Arial, sans-serif";
    ctx.fillText(
      this.#errorMessage ? "Không mở được bản đồ" : (this.#openingMap ? "Đang nạp bản đồ…" : this.#activeModule),
      160,
      137
    );
    ctx.fillStyle = "#e2e5e9";
    ctx.font = "11px Arial, sans-serif";
    const message = this.#errorMessage ??
      (this.#openingMap
        ? "Đang đọc map 001 và hai tileset gốc."
        : "Module này chưa được chuyển đổi từ Java ME.");
    ctx.fillText(message.slice(0, 42), 160, 180);
    ctx.fillStyle = "#f0ca89";
    ctx.font = "bold 10px Arial, sans-serif";
    ctx.fillText("NHẤN ESC / ENTER ĐỂ QUAY LẠI", 160, 237);
  }

  #activateSelected() {
    const selected = MENU_ITEMS[this.#selected];
    this.#errorMessage = null;

    if (selected === "Bản đồ" && this.#onOpenMap) {
      if (this.#openingMap) return;
      this.#openingMap = true;
      Promise.resolve()
        .then(() => this.#onOpenMap())
        .catch((error) => {
          this.#errorMessage = error instanceof Error ? error.message : String(error);
        })
        .finally(() => {
          this.#openingMap = false;
        });
      return;
    }

    this.#activeModule = selected;
  }

  handleKey(type, event) {
    if (type !== "down") return;
    if (this.#mode === "splash") {
      if (event.key === "Enter" || event.key === " " || event.key === "Escape") {
        this.#mode = "menu";
      }
      return;
    }
    if (this.#openingMap) return;

    if (this.#activeModule || this.#errorMessage) {
      if (event.key === "Escape" || event.key === "Enter" || event.key === "Backspace") {
        this.#activeModule = null;
        this.#errorMessage = null;
      }
      return;
    }
    if (event.key === "ArrowUp" || event.key === "ArrowLeft") {
      this.#selected = (this.#selected + MENU_ITEMS.length - 1) % MENU_ITEMS.length;
    } else if (event.key === "ArrowDown" || event.key === "ArrowRight") {
      this.#selected = (this.#selected + 1) % MENU_ITEMS.length;
    } else if (event.key === "Enter") {
      this.#activateSelected();
    }
  }

  handlePointer(point) {
    if (!point || !Number.isFinite(point.x) || !Number.isFinite(point.y)) return;
    if (this.#mode === "splash") {
      this.#mode = "menu";
      return;
    }
    if (this.#openingMap) return;
    if (this.#activeModule || this.#errorMessage) {
      this.#activeModule = null;
      this.#errorMessage = null;
      return;
    }
    const item = MENU_LAYOUT.find((candidate) =>
      point.x >= candidate.x &&
      point.x <= candidate.x + candidate.width &&
      point.y >= candidate.y &&
      point.y <= candidate.y + candidate.height
    );
    if (item) {
      this.#selected = item.index;
      this.#activateSelected();
    }
  }
}
