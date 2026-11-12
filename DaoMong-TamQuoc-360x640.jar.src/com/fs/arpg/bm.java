package com.fs.arpg;

public final class bm {
  private static bm d = new bm();
  
  private static byte[] d = new byte[] { 
      Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0 };
  
  private long[] d = new long[4];
  
  private long[] e;
  
  private byte[] e = (byte[])new long[2];
  
  private byte[] c;
  
  public static bm d() {
    return (bm)d;
  }
  
  public final String d(byte[] paramArrayOfbyte) {
    d();
    d(paramArrayOfbyte, paramArrayOfbyte.length);
    bm bm1 = this;
    d(paramArrayOfbyte = new byte[8], (long[])bm1.e, 8);
    int i;
    int j = ((i = (int)(bm1.e[0] >>> 3L) & 0x3F) < 56) ? (56 - i) : (120 - i);
    bm1.d((byte[])d, j);
    bm1.d(paramArrayOfbyte, 8);
    d(bm1.c, bm1.d, 16);
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < 16; b++) {
      byte b1 = this.c[b];
      char[] arrayOfChar1 = { 
          '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
          'a', 'b', 'c', 'd', 'e', 'f' };
      char[] arrayOfChar2;
      (arrayOfChar2 = new char[2])[0] = arrayOfChar1[b1 >>> 4 & 0xF];
      arrayOfChar2[1] = arrayOfChar1[b1 & 0xF];
      Object object = null;
      stringBuffer.append(new String(arrayOfChar2));
    } 
    return stringBuffer.toString();
  }
  
  private bm() {
    this.e = new byte[64];
    this.c = new byte[16];
    d();
  }
  
  private void d() {
    this.e[0] = 0L;
    this.e[1] = 0L;
    this.d[0] = 1732584193L;
    this.d[1] = 4023233417L;
    this.d[2] = 2562383102L;
    this.d[3] = 271733878L;
  }
  
  private static long d(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += (paramLong2 & paramLong3 | (paramLong2 ^ 0xFFFFFFFFFFFFFFFFL) & paramLong4) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static long e(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += (paramLong2 & paramLong4 | paramLong3 & (paramLong4 ^ 0xFFFFFFFFFFFFFFFFL)) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static long c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += (paramLong2 ^ paramLong3 ^ paramLong4) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static long b(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += (paramLong3 ^ (paramLong2 | paramLong4 ^ 0xFFFFFFFFFFFFFFFFL)) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private void d(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[64];
    int j = (int)(this.e[0] >>> 3L) & 0x3F;
    this.e[0] = this.e[0] + (paramInt << 3);
    if (this.e[0] + (paramInt << 3) < (paramInt << 3))
      this.e[1] = this.e[1] + 1L; 
    this.e[1] = this.e[1] + (paramInt >>> 29);
    int i = 64 - j;
    if (paramInt >= i) {
      d(this.e, paramArrayOfbyte, j, 0, i);
      d(this.e);
      while (i + 63 < paramInt) {
        d(arrayOfByte, paramArrayOfbyte, 0, i, 64);
        d(arrayOfByte);
        i += 64;
      } 
      j = 0;
    } else {
      i = 0;
    } 
    d(this.e, paramArrayOfbyte, j, i, paramInt - i);
  }
  
  private static void d(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++)
      paramArrayOfbyte1[paramInt1 + b] = paramArrayOfbyte2[paramInt2 + b]; 
  }
  
  private void d(byte[] paramArrayOfbyte) {
    long l1 = this.d[0];
    long l2 = this.d[1];
    long l3 = this.d[2];
    long l4 = this.d[3];
    byte[] arrayOfByte = paramArrayOfbyte;
    long[] arrayOfLong1 = new long[16];
    long[] arrayOfLong2 = arrayOfLong1;
    byte b1 = 0;
    for (byte b2 = 0; b2 < 64; b2 += 4) {
      arrayOfLong2[b1] = d(arrayOfByte[b2]) | d(arrayOfByte[b2 + 1]) << 8L | d(arrayOfByte[b2 + 2]) << 16L | d(arrayOfByte[b2 + 3]) << 24L;
      b1++;
    } 
    l1 = d(l1, l2, l3, l4, arrayOfLong1[0], 7L, 3614090360L);
    l4 = d(l4, l1, l2, l3, arrayOfLong1[1], 12L, 3905402710L);
    l3 = d(l3, l4, l1, l2, arrayOfLong1[2], 17L, 606105819L);
    l2 = d(l2, l3, l4, l1, arrayOfLong1[3], 22L, 3250441966L);
    l1 = d(l1, l2, l3, l4, arrayOfLong1[4], 7L, 4118548399L);
    l4 = d(l4, l1, l2, l3, arrayOfLong1[5], 12L, 1200080426L);
    l3 = d(l3, l4, l1, l2, arrayOfLong1[6], 17L, 2821735955L);
    l2 = d(l2, l3, l4, l1, arrayOfLong1[7], 22L, 4249261313L);
    l1 = d(l1, l2, l3, l4, arrayOfLong1[8], 7L, 1770035416L);
    l4 = d(l4, l1, l2, l3, arrayOfLong1[9], 12L, 2336552879L);
    l3 = d(l3, l4, l1, l2, arrayOfLong1[10], 17L, 4294925233L);
    l2 = d(l2, l3, l4, l1, arrayOfLong1[11], 22L, 2304563134L);
    l1 = d(l1, l2, l3, l4, arrayOfLong1[12], 7L, 1804603682L);
    l4 = d(l4, l1, l2, l3, arrayOfLong1[13], 12L, 4254626195L);
    l3 = d(l3, l4, l1, l2, arrayOfLong1[14], 17L, 2792965006L);
    l2 = d(l2, l3, l4, l1, arrayOfLong1[15], 22L, 1236535329L);
    l1 = e(l1, l2, l3, l4, arrayOfLong1[1], 5L, 4129170786L);
    l4 = e(l4, l1, l2, l3, arrayOfLong1[6], 9L, 3225465664L);
    l3 = e(l3, l4, l1, l2, arrayOfLong1[11], 14L, 643717713L);
    l2 = e(l2, l3, l4, l1, arrayOfLong1[0], 20L, 3921069994L);
    l1 = e(l1, l2, l3, l4, arrayOfLong1[5], 5L, 3593408605L);
    l4 = e(l4, l1, l2, l3, arrayOfLong1[10], 9L, 38016083L);
    l3 = e(l3, l4, l1, l2, arrayOfLong1[15], 14L, 3634488961L);
    l2 = e(l2, l3, l4, l1, arrayOfLong1[4], 20L, 3889429448L);
    l1 = e(l1, l2, l3, l4, arrayOfLong1[9], 5L, 568446438L);
    l4 = e(l4, l1, l2, l3, arrayOfLong1[14], 9L, 3275163606L);
    l3 = e(l3, l4, l1, l2, arrayOfLong1[3], 14L, 4107603335L);
    l2 = e(l2, l3, l4, l1, arrayOfLong1[8], 20L, 1163531501L);
    l1 = e(l1, l2, l3, l4, arrayOfLong1[13], 5L, 2850285829L);
    l4 = e(l4, l1, l2, l3, arrayOfLong1[2], 9L, 4243563512L);
    l3 = e(l3, l4, l1, l2, arrayOfLong1[7], 14L, 1735328473L);
    l2 = e(l2, l3, l4, l1, arrayOfLong1[12], 20L, 2368359562L);
    l1 = c(l1, l2, l3, l4, arrayOfLong1[5], 4L, 4294588738L);
    l4 = c(l4, l1, l2, l3, arrayOfLong1[8], 11L, 2272392833L);
    l3 = c(l3, l4, l1, l2, arrayOfLong1[11], 16L, 1839030562L);
    l2 = c(l2, l3, l4, l1, arrayOfLong1[14], 23L, 4259657740L);
    l1 = c(l1, l2, l3, l4, arrayOfLong1[1], 4L, 2763975236L);
    l4 = c(l4, l1, l2, l3, arrayOfLong1[4], 11L, 1272893353L);
    l3 = c(l3, l4, l1, l2, arrayOfLong1[7], 16L, 4139469664L);
    l2 = c(l2, l3, l4, l1, arrayOfLong1[10], 23L, 3200236656L);
    l1 = c(l1, l2, l3, l4, arrayOfLong1[13], 4L, 681279174L);
    l4 = c(l4, l1, l2, l3, arrayOfLong1[0], 11L, 3936430074L);
    l3 = c(l3, l4, l1, l2, arrayOfLong1[3], 16L, 3572445317L);
    l2 = c(l2, l3, l4, l1, arrayOfLong1[6], 23L, 76029189L);
    l1 = c(l1, l2, l3, l4, arrayOfLong1[9], 4L, 3654602809L);
    l4 = c(l4, l1, l2, l3, arrayOfLong1[12], 11L, 3873151461L);
    l3 = c(l3, l4, l1, l2, arrayOfLong1[15], 16L, 530742520L);
    l2 = c(l2, l3, l4, l1, arrayOfLong1[2], 23L, 3299628645L);
    l1 = b(l1, l2, l3, l4, arrayOfLong1[0], 6L, 4096336452L);
    l4 = b(l4, l1, l2, l3, arrayOfLong1[7], 10L, 1126891415L);
    l3 = b(l3, l4, l1, l2, arrayOfLong1[14], 15L, 2878612391L);
    l2 = b(l2, l3, l4, l1, arrayOfLong1[5], 21L, 4237533241L);
    l1 = b(l1, l2, l3, l4, arrayOfLong1[12], 6L, 1700485571L);
    l4 = b(l4, l1, l2, l3, arrayOfLong1[3], 10L, 2399980690L);
    l3 = b(l3, l4, l1, l2, arrayOfLong1[10], 15L, 4293915773L);
    l2 = b(l2, l3, l4, l1, arrayOfLong1[1], 21L, 2240044497L);
    l1 = b(l1, l2, l3, l4, arrayOfLong1[8], 6L, 1873313359L);
    l4 = b(l4, l1, l2, l3, arrayOfLong1[15], 10L, 4264355552L);
    l3 = b(l3, l4, l1, l2, arrayOfLong1[6], 15L, 2734768916L);
    l2 = b(l2, l3, l4, l1, arrayOfLong1[13], 21L, 1309151649L);
    l1 = b(l1, l2, l3, l4, arrayOfLong1[4], 6L, 4149444226L);
    l4 = b(l4, l1, l2, l3, arrayOfLong1[11], 10L, 3174756917L);
    l3 = b(l3, l4, l1, l2, arrayOfLong1[2], 15L, 718787259L);
    l2 = b(l2, l3, l4, l1, arrayOfLong1[9], 21L, 3951481745L);
    this.d[0] = this.d[0] + l1;
    this.d[1] = this.d[1] + l2;
    this.d[2] = this.d[2] + l3;
    this.d[3] = this.d[3] + l4;
  }
  
  private static void d(byte[] paramArrayOfbyte, long[] paramArrayOflong, int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt; b2 += 4) {
      paramArrayOfbyte[b2] = (byte)(int)(paramArrayOflong[b1] & 0xFFL);
      paramArrayOfbyte[b2 + 1] = (byte)(int)(paramArrayOflong[b1] >>> 8L & 0xFFL);
      paramArrayOfbyte[b2 + 2] = (byte)(int)(paramArrayOflong[b1] >>> 16L & 0xFFL);
      paramArrayOfbyte[b2 + 3] = (byte)(int)(paramArrayOflong[b1] >>> 24L & 0xFFL);
      b1++;
    } 
  }
  
  private static long d(byte paramByte) {
    return (paramByte < 0) ? (paramByte & 0xFF) : paramByte;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bm.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */