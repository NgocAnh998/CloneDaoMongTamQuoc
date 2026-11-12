export class AssetStore {
  #manifest = null;
  #imagePromises = new Map();
  #images = new Map();
  #binaryPromises = new Map();
  #binaryData = new Map();

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

  getImageCatalogEntry(id) {
    return this.#manifest?.imageCatalog?.find((entry) => entry.id === id) ?? null;
  }

  loadBinary(name, category = "map") {
    const key = `${category}/${name}`;
    if (this.#binaryData.has(key)) return Promise.resolve(this.#binaryData.get(key));
    if (this.#binaryPromises.has(key)) return this.#binaryPromises.get(key);

    const entry = this.getResource(category, name);
    if (!entry) return Promise.reject(new Error(`Không tìm thấy tài nguyên ${key} trong manifest.`));

    const url = `/public/assets/${entry.path.split("/").map(encodeURIComponent).join("/")}`;
    const promise = fetch(url)
      .then((response) => {
        if (!response.ok) throw new Error(`Không tải được ${entry.path} (HTTP ${response.status}).`);
        return response.arrayBuffer();
      })
      .then((buffer) => {
        this.#binaryData.set(key, buffer);
        return buffer;
      })
      .finally(() => this.#binaryPromises.delete(key));

    this.#binaryPromises.set(key, promise);
    return promise;
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

  async loadImageById(id) {
    const entry = this.getImageCatalogEntry(id);
    if (!entry) throw new Error(`Không tìm thấy image ID ${id} trong images.dat.`);
    if (entry.overlay) {
      throw new Error(`Ảnh ID ${id} cần palette overlay ${entry.overlay}; xử lý palette chưa được port.`);
    }
    return this.loadImage(entry.name, "image");
  }

  getImage(name, category = "image") {
    return this.#images.get(`${category}/${name}`) ?? null;
  }

  async preloadImages(names, category = "image") {
    return Promise.all(names.map((name) => this.loadImage(name, category)));
  }
}
