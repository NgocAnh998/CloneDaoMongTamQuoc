export class BinaryReader {
  #bytes;
  #view;
  #offset = 0;

  constructor(source) {
    if (source instanceof ArrayBuffer) {
      this.#bytes = new Uint8Array(source);
    } else if (ArrayBuffer.isView(source)) {
      this.#bytes = new Uint8Array(source.buffer, source.byteOffset, source.byteLength);
    } else {
      throw new TypeError("BinaryReader expects an ArrayBuffer or typed array.");
    }
    this.#view = new DataView(
      this.#bytes.buffer,
      this.#bytes.byteOffset,
      this.#bytes.byteLength
    );
  }

  get offset() {
    return this.#offset;
  }

  get remaining() {
    return this.#bytes.length - this.#offset;
  }

  #require(length) {
    if (!Number.isInteger(length) || length < 0 || this.#offset + length > this.#bytes.length) {
      throw new RangeError(
        `Unexpected end of game data at byte ${this.#offset} (need ${length}, have ${this.remaining}).`
      );
    }
  }

  readU8() {
    this.#require(1);
    return this.#view.getUint8(this.#offset++);
  }

  readI8() {
    this.#require(1);
    return this.#view.getInt8(this.#offset++);
  }

  readU16() {
    this.#require(2);
    const value = this.#view.getUint16(this.#offset, false);
    this.#offset += 2;
    return value;
  }

  readI16() {
    this.#require(2);
    const value = this.#view.getInt16(this.#offset, false);
    this.#offset += 2;
    return value;
  }

  readU32() {
    this.#require(4);
    const value = this.#view.getUint32(this.#offset, false);
    this.#offset += 4;
    return value;
  }

  readBoolean() {
    return this.readU8() !== 0;
  }

  readBytes(length) {
    this.#require(length);
    const result = this.#bytes.slice(this.#offset, this.#offset + length);
    this.#offset += length;
    return result;
  }

  readJavaUtf() {
    const length = this.readU16();
    const bytes = this.readBytes(length);
    let result = "";

    for (let i = 0; i < bytes.length;) {
      const first = bytes[i++];
      if ((first & 0x80) === 0) {
        result += String.fromCharCode(first);
      } else if ((first & 0xe0) === 0xc0) {
        if (i >= bytes.length) throw new Error("Truncated Java modified UTF-8 sequence.");
        const second = bytes[i++];
        if ((second & 0xc0) !== 0x80) throw new Error("Invalid Java modified UTF-8 continuation.");
        result += String.fromCharCode(((first & 0x1f) << 6) | (second & 0x3f));
      } else if ((first & 0xf0) === 0xe0) {
        if (i + 1 >= bytes.length) throw new Error("Truncated Java modified UTF-8 sequence.");
        const second = bytes[i++];
        const third = bytes[i++];
        if ((second & 0xc0) !== 0x80 || (third & 0xc0) !== 0x80) {
          throw new Error("Invalid Java modified UTF-8 continuation.");
        }
        result += String.fromCharCode(
          ((first & 0x0f) << 12) | ((second & 0x3f) << 6) | (third & 0x3f)
        );
      } else {
        throw new Error("Invalid Java modified UTF-8 leading byte.");
      }
    }

    return result;
  }
}
