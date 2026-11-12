package com.fs.arpg;

import java.io.DataInputStream;

public final class u extends aa {
  private byte[] d;
  
  private short[] e;
  
  private bh d;
  
  public final void d(DataInputStream paramDataInputStream) {
    paramDataInputStream.read();
    this.d = paramDataInputStream.read();
    d();
    int i = this.d << 2;
    this.d = new bh(i);
    this.d = (bh)new short[i];
    this.e = new short[this.d];
    byte[][] arrayOfByte = new byte[this.d][];
    short s = 0;
    byte b;
    for (b = 0; b < this.d; b++) {
      paramDataInputStream.read();
      int j = 0;
      byte b1;
      for (b1 = 0; b1 < 4; b1++) {
        this.d = paramDataInputStream.readShort();
        short s1 = paramDataInputStream.readShort();
        this.d[j + b] = s1;
        byte b3;
        if ((b3 = paramDataInputStream.readByte()) > 0) {
          byte[] arrayOfByte1 = new byte[b3];
          for (byte b4 = 0; b4 < b3; b4++)
            arrayOfByte1[b4] = paramDataInputStream.readByte(); 
          this.d.d(s1, arrayOfByte1);
        } 
        j += this.d;
      } 
      b1 = paramDataInputStream.readByte();
      arrayOfByte[b] = new byte[b1];
      this.e[b] = s;
      for (byte b2 = 0; b2 < b1; b2++) {
        byte b3 = paramDataInputStream.readByte();
        arrayOfByte[b][b2] = b3;
        s = (short)(s + 1);
      } 
    } 
    if (s == 0) {
      this.e = null;
      this.d = null;
      return;
    } 
    this.d = (bh)new byte[s];
    s = 0;
    for (b = 0; b < this.d; b++) {
      byte[] arrayOfByte1;
      System.arraycopy(arrayOfByte1 = arrayOfByte[b], 0, this.d, s, arrayOfByte1.length);
      s = (short)(s + arrayOfByte1.length);
    } 
    v.d().d(this.d);
  }
  
  public final void d(e parame) {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])this.d.d(parame.c)) == null || parame.d >= arrayOfByte.length) {
      parame.c = false;
      return;
    } 
    parame.c = arrayOfByte[parame.d];
  }
  
  public final int d(int paramInt) {
    paramInt = d(paramInt, 0);
    byte[] arrayOfByte;
    return ((arrayOfByte = (byte[])this.d.d(paramInt)) == null) ? 0 : arrayOfByte[0];
  }
  
  public final int d(int paramInt1, int paramInt2) {
    return ((paramInt1 = this.e[paramInt1] + paramInt2) >= this.d.length) ? 0 : this.d[paramInt1];
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arp\\u.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */