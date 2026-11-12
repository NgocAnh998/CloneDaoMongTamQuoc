package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bc {
  short d;
  
  byte[] d;
  
  private short[] b;
  
  private byte[] e;
  
  short[] d;
  
  private short[] a;
  
  private byte[] c;
  
  private short[] z;
  
  private int[] d;
  
  private int[] e;
  
  private byte[] b;
  
  private byte[] a;
  
  private byte[] z;
  
  public short[] e;
  
  public short[] c;
  
  public bc(DataInputStream paramDataInputStream) {
    try {
      DataInputStream dataInputStream = paramDataInputStream;
      bc bc1;
      (bc1 = this).d(dataInputStream);
      bc1.e(dataInputStream);
      bc1.c(dataInputStream);
      dataInputStream.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void d(DataInputStream paramDataInputStream) {
    short s;
    int i = (s = paramDataInputStream.readShort()) << 1;
    this.e = new short[i];
    this.c = new short[i];
    for (i = 0; i < s; i++) {
      int j = i << 1;
      this.e[j] = paramDataInputStream.readShort();
      this.e[j + 1] = paramDataInputStream.readShort();
      this.c[j] = (short)paramDataInputStream.readShort();
      this.c[j + 1] = (short)paramDataInputStream.readShort();
    } 
  }
  
  private void e(DataInputStream paramDataInputStream) {
    short s = paramDataInputStream.readShort();
    this.c = (short[])new byte[s];
    this.z = (byte[])new short[s];
    int i = (s >> 5) + 1;
    this.d = new int[i];
    this.e = (short[])new int[i];
    this.b = new byte[s << 2];
    this.a = new byte[s << 2];
    this.z = new byte[s << 2];
    i = 0;
    short[][] arrayOfShort = new short[s][];
    short s1 = 0;
    byte b1;
    for (b1 = 0; b1 < s; b1++) {
      int j = b1 << 2;
      d(paramDataInputStream, this.z, j);
      boolean bool1;
      if (bool1 = paramDataInputStream.readBoolean())
        d(this.d, b1); 
      if (bool1)
        d(paramDataInputStream, this.b, j); 
      boolean bool2;
      if (bool2 = paramDataInputStream.readBoolean())
        d((int[])this.e, b1); 
      if (bool2)
        d(paramDataInputStream, this.a, j); 
      j = paramDataInputStream.readShort();
      this.c[b1] = (byte)j;
      this.z[b1] = s1;
      s1 = (short)(s1 + j);
      short[] arrayOfShort1 = new short[j << 2];
      arrayOfShort[b1] = arrayOfShort1;
      i += j << 2;
      for (bool2 = false; bool2 < j; bool2++) {
        int k = bool2 << 2;
        arrayOfShort1[k] = paramDataInputStream.readShort();
        arrayOfShort1[k + 1] = (short)paramDataInputStream.readByte();
        arrayOfShort1[k + 2] = paramDataInputStream.readShort();
        arrayOfShort1[k + 3] = paramDataInputStream.readShort();
      } 
    } 
    this.a = (byte[])new short[i];
    b1 = 0;
    for (byte b2 = 0; b2 < s; b2++) {
      byte b = 0;
      int j = (arrayOfShort[b2]).length;
      while (b < j) {
        this.a[b1] = arrayOfShort[b2][b];
        b1++;
        b++;
      } 
    } 
  }
  
  private static void d(DataInputStream paramDataInputStream, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)paramDataInputStream.readShort();
    paramArrayOfbyte[paramInt + 1] = (byte)paramDataInputStream.readShort();
    paramArrayOfbyte[paramInt + 2] = (byte)paramDataInputStream.readShort();
    paramArrayOfbyte[paramInt + 3] = (byte)paramDataInputStream.readShort();
  }
  
  private static boolean d(int[] paramArrayOfint, int paramInt) {
    int i = paramInt >> 5;
    paramInt &= 0x1F;
    return ((paramArrayOfint[i] >> paramInt & 0x1) != 0);
  }
  
  private static void d(int[] paramArrayOfint, int paramInt) {
    int i = paramInt >> 5;
    paramInt &= 0x1F;
    paramArrayOfint[i] = paramArrayOfint[i] | 1 << paramInt;
  }
  
  private void c(DataInputStream paramDataInputStream) {
    short s = paramDataInputStream.readShort();
    this.e = (short[])new byte[s];
    this.d = (int[])new short[s];
    short s1 = 0;
    short[][][] arrayOfShort = new short[s][][];
    byte b;
    for (b = 0; b < s; b++) {
      paramDataInputStream.readUTF();
      short s2 = paramDataInputStream.readShort();
      this.e[b] = (byte)s2;
      this.d[b] = s1;
      s1 = (short)(s1 + s2);
      arrayOfShort[b] = new short[s2][2];
      for (byte b1 = 0; b1 < s2; b1++) {
        arrayOfShort[b][b1][0] = (short)paramDataInputStream.readByte();
        arrayOfShort[b][b1][1] = paramDataInputStream.readShort();
      } 
    } 
    this.b = (byte[])new short[s1];
    this.d = (int[])new byte[s1];
    for (b = 0; b < s; b++) {
      short s2 = (short)this.e[b];
      int i = this.d[b];
      for (byte b1 = 0; b1 < s2; b1++) {
        this.d[i + b1] = (byte)arrayOfShort[b][b1][0];
        this.b[i + b1] = arrayOfShort[b][b1][1];
      } 
    } 
  }
  
  public final int d(int paramInt) {
    return (paramInt > this.e.length) ? 0 : this.e[paramInt];
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, be parambe) {
    paramInt1 = d(paramInt1, paramInt2);
    paramInt2 = this.z[paramInt1] << 2;
    paramInt1 = this.c[paramInt1];
    for (byte b = 0; b < paramInt1; b++) {
      be be1 = parambe;
      int i = paramInt2;
      Graphics graphics = paramGraphics;
      bc bc1;
      byte b1 = (bc1 = this).a[i];
      byte b2 = bc1.a[i + 1];
      byte b3 = bc1.a[i + 2];
      i = bc1.a[i + 3];
      if (b3 != 255 && i != 255) {
        byte b4 = 20;
        switch (b2) {
          case 2:
            b4 = 24;
            break;
          case 1:
            b4 = 36;
            break;
          case 3:
            b4 = 40;
            break;
          case 5:
            b4 = 24;
            break;
          case 4:
            b4 = 20;
            break;
          case 6:
            b4 = 36;
            break;
          case 7:
            b4 = 40;
            break;
        } 
        int j = b1 << 1;
        if (be1.s) {
          bi.d(graphics, (Image)be1.d, bc1.e[j], bc1.e[j + 1], bc1.c[j] & 0xFFFF, bc1.c[j + 1] & 0xFFFF, b2, paramInt3 + b3, paramInt4 + i, b4);
        } else {
          int m = be1.a[b1] & 0xFFFF;
          int k = bc1.e[j + 1] - (be1.a[b1] >> 16 & 0xFFFF);
          if (be1.d[m] != null && be1.d[m].getWidth() >= bc1.e[j])
            bi.d(graphics, be1.d[m], bc1.e[j], k, bc1.c[j] & 0xFFFF, bc1.c[j + 1] & 0xFFFF, b2, paramInt3 + b3, paramInt4 + i, b4); 
        } 
      } 
      paramInt2 += 4;
    } 
  }
  
  private int d(int paramInt1, int paramInt2) {
    paramInt1 = this.d[paramInt1];
    return this.b[paramInt1 + paramInt2];
  }
  
  public final h d(int paramInt1, int paramInt2, h paramh) {
    paramInt1 = d(paramInt1, paramInt2);
    d(this.z, paramInt1, paramh);
    return paramh;
  }
  
  public final h e(int paramInt1, int paramInt2, h paramh) {
    paramInt1 = d(paramInt1, paramInt2);
    if (!d((int[])this.e, paramInt1)) {
      paramh.d();
      return paramh;
    } 
    d(this.a, paramInt1, paramh);
    return paramh;
  }
  
  public final h c(int paramInt1, int paramInt2, h paramh) {
    paramInt1 = d(paramInt1, paramInt2);
    if (!d(this.d, paramInt1)) {
      paramh.d();
      return paramh;
    } 
    d(this.b, paramInt1, paramh);
    return paramh;
  }
  
  private static void d(byte[] paramArrayOfbyte, int paramInt, h paramh) {
    paramInt <<= 2;
    byte b2 = paramArrayOfbyte[paramInt];
    byte b3 = paramArrayOfbyte[paramInt + 1];
    byte b4 = paramArrayOfbyte[paramInt + 2];
    byte b1 = paramArrayOfbyte[paramInt + 3];
    paramh.d(b2, b3, b4, b1);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bc.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */