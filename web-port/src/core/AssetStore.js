import { decodeJ2METextCatalog } from "../data/J2METextCatalog.js";
import { parseJ2MEAnimation } from "../data/J2MEAnimationParser.js";

export class AssetStore {
  #manifest = null;
  #imagePromises = new Map();
  #images = new Map();
  #binaryPromises = new Map();
  #binaryData = new Map();
  #animationPromises = new Map();
  #animations = new Map();

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

  getAnimationCatalogEntry(id) {
    return this.#manifest?.animationCatalog?.find((entry) => entry.id === id) ?? null;
  }

  loadAnimation(id) {
    if (this.#animations.has(id)) return Promise.resolve(this.#animations.get(id));
    if (this.#animationPromises.has(id)) return this.#animationPromises.get(id);

    const entry = this.getAnimationCatalogEntry(id);
    if (!entry) {
      return Promise.reject(new Error(`Không tìm thấy animation ID ${id} trong anis.dat.`));
    }

    const promise = this.loadBinary(entry.name, "ani")
      .then((buffer) => {
        const data = parseJ2MEAnimation(buffer, entry.name);
        return Promise.all(entry.images.map(async (imageRef) => {
          if (imageRef.overlay) {
            throw new Error(
              `Animation ${id} cần palette overlay ${imageRef.overlay}; xử lý palette chưa được port.`
            );
          }
          const image = await this.loadImageById(imageRef.imageId);
          return { imageId: imageRef.imageId, image };
        })).then((images) => ({
          id,
          name: entry.name,
          mode: entry.mode,
          images,
          ...data
        }));
      })
      .then((animation) => {
        this.#animations.set(id, animation);
        return animation;
      })
      .finally(() => this.#animationPromises.delete(id));

    this.#animationPromises.set(id, promise);
    return promise;
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

  loadStaticBinary(name) {
    const key = `static/${name}`;
    if (this.#binaryData.has(key)) return Promise.resolve(this.#binaryData.get(key));
    if (this.#binaryPromises.has(key)) return this.#binaryPromises.get(key);

    const entry = this.#manifest?.staticFiles?.find((file) => file.name === name);
    if (!entry) return Promise.reject(new Error(`Không tìm thấy dữ liệu tĩnh ${name} trong manifest.`));

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

  async loadTextCatalog() {
    const data = await this.loadStaticBinary("txt.dat");
    return decodeJ2METextCatalog(data);
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
