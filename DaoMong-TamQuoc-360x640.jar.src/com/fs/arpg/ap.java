package com.fs.arpg;

import java.io.DataInputStream;

public final class ap {
  public char[] d;
  
  int[] d;
  
  public int d;
  
  public final void d(DataInputStream paramDataInputStream) {
    this.d = paramDataInputStream.readUTF().toCharArray();
    byte b1 = 0;
    int i = 0;
    byte b2 = 0;
    int[] arrayOfInt = new int[10];
    byte b3 = 0;
    int j = this.d.length;
    while (b3 < j) {
      if (this.d[b3] == 38) {
        arrayOfInt[b1] = i;
        arrayOfInt[b1 + 1] = b2;
        b1 += 2;
        i = b3 + 1;
        b2 = 0;
      } else {
        b2++;
      } 
      b3++;
    } 
    if (b2 > 0) {
      arrayOfInt[b1] = i;
      arrayOfInt[b1 + 1] = b2;
      b1 += 2;
    } 
    this.d = new int[b1];
    System.arraycopy(arrayOfInt, 0, this.d, 0, b1);
    this.d = paramDataInputStream.readInt();
    paramDataInputStream.readUTF();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ap.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */