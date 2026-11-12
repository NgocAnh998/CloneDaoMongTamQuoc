package com.fs.arpg;

import java.io.DataInputStream;

public abstract class aa {
  short d;
  
  int d;
  
  short[] d;
  
  private int e;
  
  public final boolean d() {
    return (this.d == null);
  }
  
  public abstract void d(DataInputStream paramDataInputStream);
  
  public abstract void d(e parame);
  
  public void d(int paramInt) {}
  
  public void e(int paramInt) {}
  
  public abstract int d(int paramInt);
  
  public final short d(int paramInt1, int paramInt2) {
    paramInt1 = this.e >> paramInt1 << 3 & 0xFF;
    return this.d[paramInt1 + paramInt2];
  }
  
  final void d() {
    short s = 0;
    for (byte b = 0; b < 4; b++) {
      this.e |= s << b << 3;
      s = (short)(s + this.d);
    } 
  }
  
  public static aa d(DataInputStream paramDataInputStream) {
    u u;
    byte b = paramDataInputStream.readByte();
    bk bk = null;
    if (b < 0)
      return null; 
    switch (b) {
      case 0:
        bk = new bk();
        break;
      case 1:
        u = new u();
        break;
    } 
    u.d(paramDataInputStream);
    return u;
  }
  
  public int d(int paramInt1, int paramInt2) {
    return -1;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\aa.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */