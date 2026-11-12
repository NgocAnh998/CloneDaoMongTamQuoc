package com.fs.arpg;

import java.io.DataInputStream;

public final class y {
  private int d;
  
  short[] d;
  
  short[] e;
  
  short[] c;
  
  public final void d(DataInputStream paramDataInputStream) {
    this.d = paramDataInputStream.readByte();
    this.d = new short[this.d];
    this.e = new short[this.d];
    this.c = new short[this.d];
    for (byte b = 0; b < this.d; b++) {
      this.d[b] = (short)(paramDataInputStream.readShort() + 1);
      l.d().d(this.d[b]);
      this.e[b] = paramDataInputStream.readShort();
      this.c[b] = paramDataInputStream.readShort();
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\y.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */