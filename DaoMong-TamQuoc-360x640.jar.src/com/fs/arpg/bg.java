package com.fs.arpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class bg {
  private static bg d;
  
  private short[] d;
  
  private short[] e;
  
  private short[] c;
  
  private char[] d;
  
  public static bg d() {
    if (d == null)
      d = (char[])new bg(); 
    return (bg)d;
  }
  
  private bg() {
    d();
  }
  
  private void d() {
    try {
      DataInputStream dataInputStream2;
      byte[] arrayOfByte = new byte[(dataInputStream2 = bi.d("/txt.dat")).readShort()];
      dataInputStream2.readFully(arrayOfByte);
      arrayOfByte = bi.d(arrayOfByte);
      try {
        dataInputStream2.close();
      } catch (Exception exception) {}
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      DataInputStream dataInputStream1;
      short s = (dataInputStream1 = new DataInputStream(byteArrayInputStream)).readShort();
      this.d = new char[s];
      short s1;
      for (s1 = 0; s1 < s; s1++)
        this.d[s1] = dataInputStream1.readChar(); 
      s1 = dataInputStream1.readShort();
      this.d = (char[])new short[s1];
      this.e = new short[s1];
      this.c = new short[s1];
      for (s = 0; s < s1; s++) {
        this.d[s] = dataInputStream1.readShort();
        this.e[s] = dataInputStream1.readShort();
        this.c[s] = dataInputStream1.readShort();
      } 
      try {
        dataInputStream1.close();
        return;
      } catch (Exception exception) {
        return;
      } 
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final char[] d(short paramShort) {
    short s = paramShort;
    int i;
    char[] arrayOfChar1;
    if ((i = bh.d((short[])this.d, (arrayOfChar1 = this.d).length, s)) < 0)
      return null; 
    s = this.e[i];
    char[] arrayOfChar2 = new char[i = this.c[i]];
    for (byte b = 0; b < i; b++)
      arrayOfChar2[b] = this.d[s + b]; 
    return arrayOfChar2;
  }
  
  public final void d(short paramShort, StringBuffer paramStringBuffer) {
    short s = paramShort;
    char[] arrayOfChar;
    int i;
    if ((i = bh.d((short[])this.d, (arrayOfChar = this.d).length, s)) < 0)
      return; 
    s = this.e[i];
    i = this.c[i];
    for (byte b = 0; b < i; b++)
      paramStringBuffer.append(this.d[s + b]); 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bg.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */