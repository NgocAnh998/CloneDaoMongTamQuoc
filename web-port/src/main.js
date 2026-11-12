import { AssetStore } from "./core/AssetStore.js";
import { GameRuntime } from "./core/GameRuntime.js";
import { MapPreviewScene } from "./scenes/MapPreviewScene.js";
import { TitleMenuScene } from "./scenes/TitleMenuScene.js";

const canvas = document.querySelector("#gameCanvas");
const status = document.querySelector("#runtimeStatus");
const STARTUP_IMAGES = [
  "240X320-80S.png",
  "beijing.png",
  "biaoti.png",
  "zhujiemian3.png",
  "zhujiemian.png"
];

try {
  status.textContent = "Đang nạp tài nguyên game gốc…";

  const assets = new AssetStore();
  await assets.loadManifest();
  await assets.preloadImages(STARTUP_IMAGES);

  const textCatalog = await assets.loadTextCatalog();
  if (!textCatalog.has(0) || !textCatalog.has(1) || !textCatalog.has(2)) {
    throw new Error("Bảng chữ txt.dat thiếu nội dung hộp thoại khởi động.");
  }

  const game = new GameRuntime(canvas);
  const openMap = async () => {
    status.textContent = "Đang nạp bản đồ gốc 001…";
    const mapScene = await MapPreviewScene.create(
      assets,
      "001",
      () => game.popScene()
    );
    game.addScene(mapScene);
    status.textContent = "Đã nạp bản đồ 001 · tileset gốc · dữ liệu entity/collision";
  };
  const onMusicChoice = (enabled) => {
    status.textContent = enabled
      ? "Đã chọn Có · phát nhạc MIDI chưa được port."
      : "Đã chọn Không · phát nhạc MIDI chưa được port.";
  };

  game.addScene(new TitleMenuScene(assets, openMap, textCatalog, onMusicChoice));
  game.start();

  const count = assets.manifest.resourceCount ?? 0;
  status.textContent = `Đã nạp ${count} tài nguyên · màn hình 320 × 360 · nhịp game 100 ms`;
  window.addEventListener("pagehide", () => game.stop(), { once: true });
} catch (error) {
  console.error(error);
  status.textContent = `Không thể khởi động game: ${error.message}`;
}
