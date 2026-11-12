export class SceneStack {
  #scenes = [];

  get current() {
    return this.#scenes.at(-1) ?? null;
  }

  push(scene) {
    if (!scene) throw new TypeError("A scene is required.");
    this.current?.onPause?.();
    this.#scenes.push(scene);
    scene.onEnter?.();
  }

  pop() {
    const scene = this.#scenes.pop();
    scene?.onExit?.();
    this.current?.onResume?.();
    return scene ?? null;
  }

  update(deltaMs) {
    this.current?.update?.(deltaMs);
  }

  render(context, interpolation) {
    this.current?.render?.(context, interpolation);
  }

  handleKey(type, event) {
    this.current?.handleKey?.(type, event);
  }

  handlePointer(point) {
    this.current?.handlePointer?.(point);
  }

  destroy() {
    while (this.#scenes.length) this.pop();
  }
}
