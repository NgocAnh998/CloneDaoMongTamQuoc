package com.fs.arpg;

import java.io.DataInputStream;

public final class bk extends aa {
  private int c;
  
  int e;
  
  public final void d(int paramInt) {
    this.c += paramInt;
    this.e += paramInt;
  }
  
  public final void e(int paramInt) {
    this.c = paramInt;
    this.e = paramInt;
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    paramDataInputStream.read();
    if (paramDataInputStream.readBoolean()) {
      this.c = (byte)paramDataInputStream.read();
      this.e = (byte)paramDataInputStream.read();
    } 
    byte b1 = 0;
    for (byte b2 = 0; b2 < 4; b2++) {
      this.d = (short)paramDataInputStream.read();
      if (this.d == null)
        this.d = new short[this.d << 2]; 
      for (byte b = 0; b < this.d; b++) {
        this.d = paramDataInputStream.readShort();
        this.d[b1] = paramDataInputStream.readShort();
        b1++;
      } 
    } 
    d();
    v.d().d(this.d);
  }
  
  public final void d(e parame) {
    if (this.c == 0 && this.e == 0) {
      parame.c = false;
      return;
    } 
    switch (parame.b) {
      case false:
      case true:
        parame.c = this.c;
        return;
      case true:
      case true:
        parame.c = this.e;
        break;
    } 
  }
  
  public final int d(int paramInt) {
    if (this.c == 0 && this.e == 0)
      return 0; 
    switch (paramInt) {
      case 0:
      case 1:
        return this.c;
      case 2:
      case 3:
        return this.e;
    } 
    return 0;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bk.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */