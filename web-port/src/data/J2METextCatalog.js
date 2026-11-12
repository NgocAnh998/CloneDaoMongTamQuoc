const BLOCK_SIZE = 8;
const KEY_A = 0x76f74372;
const KEY_B = 0x1244fd19;

export function decodeJ2METextCatalog(source) {
  const bytes = toBytes(source);
  if (bytes.length < 4) throw new Error("txt.dat is too small.");

  // txt.dat first has a big-endian DataInputStream length.
  const outerLength = (bytes[0] << 8) | bytes[1];
  if (outerLength + 2 > bytes.length) {
    throw new Error("txt.dat outer length exceeds the available bytes.");
  }

  // bi.d(byte[]) then reads a second, little-endian byte length.
  const encrypted = bytes.subarray(2, 2 + outerLength);
  if (encrypted.length < 2) throw new Error("txt.dat encrypted payload is missing.");
  const plainLength = encrypted[0] | (encrypted[1] << 8);
  if (plainLength + 2 > encrypted.length) {
    throw new Error("txt.dat inner length exceeds the encrypted payload.");
  }

  const payload = encrypted.subarray(2, 2 + plainLength);
  const paddedLength = Math.ceil(payload.length / BLOCK_SIZE) * BLOCK_SIZE;
  const padded = new Uint8Array(paddedLength);
  padded.set(payload);

  const inputView = new DataView(padded.buffer);
  const output = new Uint8Array(paddedLength);
  const outputView = new DataView(output.buffer);

  // Reproduce bi.d(byte[], false): unpack one pair of 32-bit words per block.
  for (let offset = 0; offset < paddedLength; offset += BLOCK_SIZE) {
    const first = inputView.getUint32(offset, false);
    const second = inputView.getUint32(offset + 4, false);
    const mixedSecond = (second ^ first) >>> 0;
    outputView.setUint32(offset, (first ^ KEY_A) >>> 0, false);
    outputView.setUint32(offset + 4, (mixedSecond ^ KEY_B) >>> 0, false);
  }

  return parseTextTable(output.subarray(0, plainLength));
}

function parseTextTable(bytes) {
  let offset = 0;
  const readU16 = () => {
    if (offset + 2 > bytes.length) throw new Error("Truncated txt.dat text table.");
    const value = (bytes[offset] << 8) | bytes[offset + 1];
    offset += 2;
    return value;
  };

  const charCount = readU16();
  if (charCount * 2 > bytes.length - offset) {
    throw new Error("txt.dat character table is truncated.");
  }

  const characters = new Array(charCount);
  for (let i = 0; i < charCount; i += 1) {
    characters[i] = String.fromCharCode(readU16());
  }

  const entryCount = readU16();
  const entries = new Map();
  for (let i = 0; i < entryCount; i += 1) {
    const id = readU16();
    const start = readU16();
    const length = readU16();
    if (start + length > characters.length) {
      throw new Error(`txt.dat entry ${id} points outside the character table.`);
    }
    entries.set(id, characters.slice(start, start + length).join(""));
  }

  return Object.freeze({
    size: entries.size,
    get(id) {
      return entries.get(id) ?? null;
    },
    has(id) {
      return entries.has(id);
    },
    entries() {
      return [...entries.entries()];
    }
  });
}

function toBytes(source) {
  if (source instanceof ArrayBuffer) return new Uint8Array(source);
  if (ArrayBuffer.isView(source)) {
    return new Uint8Array(source.buffer, source.byteOffset, source.byteLength);
  }
  throw new TypeError("Text catalog decoder expects an ArrayBuffer or typed array.");
}
