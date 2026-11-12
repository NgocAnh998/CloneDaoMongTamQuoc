package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ah {
  public static final Font d = Font.getFont(0, 0, 8);
  
  private int b;
  
  private int a = 30;
  
  private int z;
  
  private int h;
  
  int d;
  
  private int g;
  
  private int f;
  
  private char[] d;
  
  private byte[] d;
  
  private short[] d;
  
  private int[] d;
  
  private int[] e;
  
  private static ah d;
  
  private int[] c;
  
  int e = new int[] { 1, -1, 1, -1 };
  
  private Image d;
  
  private boolean d = new int[] { 1, 1, -1, -1 };
  
  int c;
  
  public static ah d() {
    if (d == null)
      d = new ah(); 
    return d;
  }
  
  public final void d() {
    this.d = n.d().d((short)57);
  }
  
  public final void e() {}
  
  public final int d() {
    return this.a + 2;
  }
  
  private void d(String paramString) {
    try {
      DataInputStream dataInputStream = bi.d(paramString);
      this.b = dataInputStream.readShort();
      this.d = new char[this.b];
      this.d = new short[this.b];
      this.a = dataInputStream.read();
      dataInputStream.read();
      this.h = dataInputStream.readShort();
      this.d = dataInputStream.read();
      dataInputStream.read();
      this.f = dataInputStream.readShort();
      byte[] arrayOfByte = new byte[this.b * this.h];
      dataInputStream.readInt();
      short s = 0;
      for (byte b = 0; b < this.b; b++) {
        this.d[b] = (char)dataInputStream.readShort();
        int i = this.f;
        boolean bool;
        if (((bool = this.d[b]) > 127))
          i = this.h; 
        dataInputStream.readFully(arrayOfByte, s, i);
        this.d[b] = s;
        s = (short)(s + i);
      } 
      try {
        dataInputStream.close();
      } catch (Exception exception) {}
      this.d = new byte[s];
      System.arraycopy(arrayOfByte, 0, this.d, 0, s);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static boolean d(char paramChar) {
    return (paramChar > '');
  }
  
  public final void d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramGraphics.setColor(paramInt5);
    int i = paramInt5;
    int j = paramInt1;
    paramInt1 += paramInt2;
    while (j < paramInt1) {
      if ((paramInt2 = paramArrayOfchar[j]) == 123) {
        i = 16267311;
        paramInt3 += bb.d(paramInt2 = paramInt2);
      } else if (paramInt2 == 125) {
        i = paramInt5;
        paramInt3 += bb.d(paramInt2 = paramInt2);
      } else {
        paramGraphics.setColor(i);
        d(paramGraphics, paramInt2, paramInt3, paramInt4);
        paramInt3 += bb.d(paramInt2 = paramInt2);
      } 
      j++;
    } 
  }
  
  public static void d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ac.e++;
    paramInt2 = paramInt1 + paramInt2;
    for (paramInt1 = paramInt1; paramInt1 < paramInt2; paramInt1++)
      paramInt3 += bb.d(paramGraphics, paramArrayOfchar[paramInt1], paramInt3, paramInt4); 
  }
  
  public final void d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    d(paramGraphics, paramArrayOfchar, 0, paramArrayOfchar.length, paramInt1, paramInt2);
  }
  
  public final void e(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = d(paramArrayOfchar, 0, paramInt1);
    d(paramGraphics, paramArrayOfchar, 0, paramInt1, 160 - (i >> 1), paramInt2);
  }
  
  public final void d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt) {
    char[] arrayOfChar = paramArrayOfchar;
    ah ah1 = this;
    int i = d(arrayOfChar, 0, arrayOfChar.length);
    d(paramGraphics, paramArrayOfchar, 0, paramArrayOfchar.length, 160 - (i >> 1), paramInt);
  }
  
  public final int d(char[] paramArrayOfchar, int paramInt) {
    int i = 0;
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfchar.length; b2++) {
      char c;
      if ((c = paramArrayOfchar[b2]) == '&' || c == '|') {
        i = 0;
        b1 += true;
      } else if (c != '{' && c != '}') {
        int j = bb.d(c = c);
        if (i + j > paramInt) {
          i = 0;
          b1 += true;
        } 
        i += j;
      } 
    } 
    return b1 + 16;
  }
  
  public final int d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    ac.e++;
    int i = paramInt1;
    int j = paramInt2;
    int k = paramArrayOfchar.length;
    int m = (paramInt3 = paramInt1 + paramInt3 + 10) - bb.d;
    for (byte b = 0; b < k; b++) {
      char c;
      if ((c = paramArrayOfchar[b]) == '&' || c == '|') {
        i = paramInt1;
        j += 16;
      } else {
        int n = bb.d(c);
        int i1;
        if (((i1 = i + n) > paramInt3 || (c == ' ' && i1 > m)) && k >= 10) {
          i = paramInt1;
          i1 = (c == ' ') ? paramInt1 : (paramInt1 + n);
          j += 16;
        } 
        d(paramGraphics, c, i, j);
        i = i1;
      } 
    } 
    return j + 16 - paramInt2;
  }
  
  public static int e(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    int j = paramInt1;
    int k = paramInt2;
    for (byte b = 0; b < paramArrayOfchar.length; b++) {
      char c;
      if ((c = paramArrayOfchar[b]) == '&' || c == '|') {
        i = 0;
        j = paramInt1;
        k += d.getHeight();
      } else {
        int m = d.charWidth(c);
        if (i + m > paramInt3) {
          i = 0;
          k += d.getHeight();
          j = paramInt1;
        } 
        paramGraphics.drawChar(c, j, k, 0);
        i += m;
        j += m;
      } 
    } 
    return k + d.getHeight() - paramInt2;
  }
  
  public final int d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    paramInt3 = paramInt3 / d.getHeight() * d.getHeight();
    paramGraphics.setClip(0, paramInt2, 320, paramInt3);
    paramBoolean = false;
    int i = paramInt1;
    int j = paramInt4;
    int k;
    for (k = 0; k < paramArrayOfchar.length; k++) {
      char c;
      if ((c = paramArrayOfchar[k]) == '&' || c == '|') {
        paramBoolean = false;
        i = paramInt1;
        j += d.getHeight();
      } else {
        int n = d.charWidth(c);
        if (paramBoolean + n > 280) {
          paramBoolean = false;
          j += d.getHeight();
          i = paramInt1;
        } 
        int i2 = j;
        int i1 = i;
        char c1 = c;
        Graphics graphics = paramGraphics;
        ah ah1;
        int i3 = (ah1 = this).d.length;
        graphics.setColor(16777215);
        for (byte b = 0; b < i3; b++)
          graphics.drawChar(c1, i1 + ah1.d[b], i2 + ah1.e[b], 0); 
        graphics.setColor(6970711);
        graphics.drawChar(c1, i1, i2, 0);
        int m = paramBoolean + n;
        i += n;
      } 
    } 
    paramGraphics.setClip(0, 0, 320, 360);
    if ((k = j + d.getHeight() - paramInt4) > paramInt3) {
      this.c = (k - paramInt3) / d.getHeight() + 1;
      if (this.c * d.getHeight() < k - paramInt3)
        this.c++; 
      d(paramGraphics, 300, paramInt2 + 10, paramInt3 - 20, (paramInt2 - paramInt4) / d.getHeight(), this.c);
    } 
    return k;
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    d(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 4214630);
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt5 <= 1)
      return; 
    int i = paramInt2 + 7 + 2;
    int j = paramInt3 - 14 - 4;
    int k = paramInt1 + 3;
    paramInt4 = i + 1 + (j - this.d.getHeight() - 2) * paramInt4 / (paramInt5 - 1);
    int[] arrayOfInt = { 
        k, paramInt2, paramInt1, paramInt2 + 7, paramInt1 + 7, paramInt2 + 7, k, paramInt2 + paramInt3 - 2, paramInt1, paramInt2 - 7 + paramInt3, 
        paramInt1 + 7, paramInt2 - 7 + paramInt3 };
    paramGraphics.setColor(paramInt6);
    paramGraphics.fillRect(paramInt1, i, 7, j);
    bi.d(paramGraphics, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3], arrayOfInt[4], arrayOfInt[5]);
    bi.d(paramGraphics, arrayOfInt[6], arrayOfInt[7], arrayOfInt[8], arrayOfInt[9], arrayOfInt[10], arrayOfInt[11]);
    paramGraphics.drawImage(this.d, k, paramInt4, 17);
  }
  
  final void e(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.d.length;
    paramGraphics.setColor(paramInt4);
    for (paramInt4 = 0; paramInt4 < i; paramInt4++)
      d(paramGraphics, paramArrayOfchar, 0, paramArrayOfchar.length, paramInt1 + this.d[paramInt4], paramInt2 + this.e[paramInt4]); 
    paramGraphics.setColor(paramInt3);
    d(paramGraphics, paramArrayOfchar, 0, paramArrayOfchar.length, paramInt1, paramInt2);
  }
  
  private void d(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.d.length;
    paramGraphics.setColor(paramInt4);
    for (paramInt4 = 0; paramInt4 < i; paramInt4++)
      d(paramGraphics, paramChar, paramInt1 + this.d[paramInt4], paramInt2 + this.e[paramInt4]); 
    paramGraphics.setColor(paramInt3);
    d(paramGraphics, paramChar, paramInt1, paramInt2);
  }
  
  public static void d(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2) {
    bb.d(paramGraphics, paramChar, paramInt1, paramInt2);
  }
  
  public static int d(char paramChar) {
    return bb.d(paramChar);
  }
  
  public final void d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    int i = d(paramArrayOfchar, 0, paramArrayOfchar.length);
    switch (paramInt3) {
      case 36:
        paramInt2 -= 16;
        break;
      case 17:
        paramInt1 -= i >> 1;
        break;
      case 33:
        paramInt1 -= i >> 1;
        paramInt2 -= 16;
        break;
      case 24:
        paramInt1 -= i;
        break;
      case 40:
        paramInt1 -= i;
        paramInt2 -= 16;
        break;
    } 
    d(paramGraphics, paramArrayOfchar, 0, paramArrayOfchar.length, paramInt1, paramInt2);
  }
  
  public final void d(Graphics paramGraphics, String paramString, int paramInt) {
    char[] arrayOfChar = paramString.toCharArray();
    paramString.toCharArray();
    e(paramGraphics, arrayOfChar, 44, paramInt, 16777215, 5439666);
  }
  
  public final void d(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    char[] arrayOfChar = paramString.toCharArray();
    int i = d(paramString.toCharArray(), 0, arrayOfChar.length);
    switch (paramInt3) {
      case 36:
        paramInt2 -= 16;
        break;
      case 17:
        paramInt1 -= i >> 1;
        break;
      case 33:
        paramInt1 -= i >> 1;
        paramInt2 -= 16;
        break;
      case 24:
        paramInt1 -= i;
        break;
      case 40:
        paramInt1 -= i;
        paramInt2 -= 16;
        break;
    } 
    d(paramGraphics, arrayOfChar, 0, arrayOfChar.length, paramInt1, paramInt2);
  }
  
  public static int d(String paramString) {
    return bb.d(paramString);
  }
  
  public final int d(char[] paramArrayOfchar) {
    return d(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public static int d(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int i = 0;
    paramInt2 = paramInt1 + paramInt2;
    for (paramInt1 = paramInt1; paramInt1 < paramInt2; paramInt1++)
      i += bb.d(paramArrayOfchar[paramInt1]); 
    return i;
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    int i = bi.d(paramInt1);
    i = paramInt3;
    paramInt3 = paramInt2 + i * 6;
    paramInt2 = paramInt1;
    Graphics graphics = paramGraphics;
    ah ah1 = this;
    paramInt3 -= ah1.d;
    if (paramInt2 == 0) {
      d(graphics, '0', paramInt3, i);
      return;
    } 
    while (paramInt2 != 0) {
      int j = (char)((j = paramInt2 % 10) + 48);
      d(graphics, j, paramInt3, i);
      paramInt2 /= 10;
      paramInt3 -= 6;
    } 
  }
  
  public final int d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    int i = paramInt5;
    int j;
    for (j = paramInt1; j >= 0; j--) {
      char c;
      if ((c = paramArrayOfchar[j]) == '{') {
        i = paramInt6;
        break;
      } 
      if (c == '}')
        break; 
    } 
    j = 20;
    int k = paramInt4;
    paramGraphics.setColor(paramInt5);
    int m = paramInt1;
    paramInt1 += paramInt2;
    paramInt2 = 320 - bb.d;
    int n = paramArrayOfchar.length;
    while (m <= paramInt1) {
      if (m >= n)
        return m; 
      char c;
      if ((c = paramArrayOfchar[m]) == '&') {
        k += 16;
        j = 20;
      } else if (c == '{') {
        i = paramInt6;
      } else if (c == '}') {
        i = paramInt5;
      } else {
        if (c == '$')
          return m; 
        paramGraphics.setColor(i);
        int i1 = bb.d(c) + paramInt8;
        int i2;
        if ((i2 = j + i1) > 320 || (c == ' ' && i2 > paramInt2)) {
          k += 16;
          j = 20;
          i2 = (c == ' ') ? 20 : (i1 + 20);
        } 
        if (k - paramInt4 > paramInt3)
          return m; 
        if (paramInt7 < 0) {
          bb.d(paramGraphics, c, j, k);
        } else {
          d(paramGraphics, c, j, k, i, paramInt7);
        } 
        j = i2;
      } 
      m++;
    } 
    return k - paramInt4;
  }
  
  public final int d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = paramInt2;
    int j = paramInt3;
    paramGraphics.setColor(paramInt4);
    int k = paramInt4;
    byte b = 0;
    int m = paramArrayOfchar.length;
    int n = (paramInt1 = paramInt2 + paramInt1 + 10) - bb.d;
    while (b < m) {
      char c;
      if ((c = paramArrayOfchar[b]) == '&') {
        j += 16;
        i = paramInt2;
      } else if (c == '{') {
        k = paramInt5;
      } else if (c == '}') {
        k = paramInt4;
      } else {
        paramGraphics.setColor(k);
        int i1 = bb.d(c);
        int i2;
        if (((i2 = i + i1) > paramInt1 || (c == ' ' && i2 > n)) && m >= 10) {
          j += 16;
          i = paramInt2;
          i2 = (c == ' ') ? paramInt2 : (paramInt2 + i1);
        } 
        if (paramInt6 < 0) {
          d(paramGraphics, c, i, j);
        } else {
          d(paramGraphics, c, i, j, k, paramInt6);
        } 
        i = i2;
      } 
      b++;
    } 
    return j - paramInt3;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ah.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */