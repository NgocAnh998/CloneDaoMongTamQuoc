package com.fs.arpg;

public final class bj {
  private byte[] d;
  
  int d;
  
  public bj() {}
  
  public bj(byte[] paramArrayOfbyte) {
    d(paramArrayOfbyte);
  }
  
  public final void d(byte[] paramArrayOfbyte) {
    this.d = paramArrayOfbyte;
    this.d = 0;
  }
  
  public final byte d() {
    return this.d[this.d++];
  }
  
  public final short d() {
    short s = (short)((this.d[this.d] & 0xFF) << 8 | this.d[this.d + 1] & 0xFF);
    this.d += 2;
    return s;
  }
  
  public final int d() {
    int i = (this.d[this.d] & 0xFF) << 24 | (this.d[this.d + 1] & 0xFF) << 16 | (this.d[this.d + 2] & 0xFF) << 8 | this.d[this.d + 3] & 0xFF;
    this.d += 4;
    return i;
  }
  
  public final long d() {
    long l = (this.d[this.d] & 0xFFL) << 56L | (this.d[this.d + 1] & 0xFFL) << 48L | (this.d[this.d + 2] & 0xFFL) << 40L | (this.d[this.d + 3] & 0xFFL) << 32L | (this.d[this.d + 4] & 0xFFL) << 24L | (this.d[this.d + 5] & 0xFFL) << 16L | (this.d[this.d + 6] & 0xFFL) << 8L | this.d[this.d + 7] & 0xFFL;
    this.d += 8;
    return l;
  }
  
  public final String d() {
    short s = d();
    String str = new String(this.d, this.d, s, "UTF-8");
    this.d += s;
    return str;
  }
  
  public final void d(int paramInt) {
    this.d += paramInt;
  }
  
  public final boolean d() {
    return (d() == 1);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bj.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */