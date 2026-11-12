package com.fs.arpg;

import java.io.DataInputStream;

public final class ay {
  short[] d;
  
  short[] e;
  
  short[] c;
  
  private int d;
  
  public final void d(DataInputStream paramDataInputStream) {
    this.d = paramDataInputStream.readByte();
    this.c = new short[this.d];
    this.d = new short[this.d];
    this.e = new short[this.d];
    for (byte b = 0; b < this.d; b++) {
      this.c[b] = (short)(paramDataInputStream.readShort() + 1);
      l.d().d(this.c[b]);
      this.d[b] = paramDataInputStream.readShort();
      this.e[b] = paramDataInputStream.readShort();
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ay.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */