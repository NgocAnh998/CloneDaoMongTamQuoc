export class AssetStore {
  #manifest = null;
  #imagePromises = new Map();
  #images = new Map();

  async loadManifest() {
    if (this.#manifest) return this.#manifest;
    const response = await fetch("/public/assets/resource-manifest.json", { cache: "no-store" });
    if (!response.ok) {
      throw new Error(`Không tải được resource-manifest.json (HTTP ${response.status}). Hãy chạy npm run dev để giải nén tài nguyên.`);
    }
    const manifest = await response.json();
    if (!manifest.categories?.image) throw new Error("Resource manifest không có nhóm image.");
    this.#manifest = manifest;
    return manifest;
  }

  get manifest() {
    return this.#manifest;
  }

  getResource(category, name) {
    return this.#manifest?.categories?.[category]?.find((entry) => entry.name === name) ?? null;
  }

  loadImage(name, category = "image") {
    const key = `${category}/${name}`;
    if (this.#images.has(key)) return Promise.resolve(this.#images.get(key));
    if (this.#imagePromises.has(key)) return this.#imagePromises.get(key);

    const entry = this.getResource(category, name);
    if (!entry) return Promise.reject(new Error(`Không tìm thấy ảnh ${key} trong manifest.`));

    const url = `/public/assets/${entry.path.split("/").map(encodeURIComponent).join("/")}`;
    const promise = new Promise((resolve, reject) => {
      const image = new Image();
      image.decoding = "async";
      image.onload = () => {
        this.#images.set(key, image);
        resolve(image);
      };
      image.onerror = () => reject(new Error(`Không giải mã được ảnh: ${entry.path}`));
      image.src = url;
    }).finally(() => this.#imagePromises.delete(key));

    this.#imagePromises.set(key, promise);
    return promise;
  }

  getImage(name, category = "image") {
    return this.#images.get(`${category}/${name}`) ?? null;
  }

  async preloadImages(names, category = "image") {
    return Promise.all(names.map((name) => this.loadImage(name, category)));
  }
}
