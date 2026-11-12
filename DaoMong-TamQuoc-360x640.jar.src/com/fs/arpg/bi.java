package com.fs.arpg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bi {
  private static bi d = new bi();
  
  private static long[] d = new long[256];
  
  private static int d = 0;
  
  public static final void d(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramGraphics.setClip(paramInt1, paramInt2, paramInt5, paramInt6);
    paramGraphics.drawImage(paramImage, paramInt1 - paramInt3, paramInt2 - paramInt4, 0);
    paramGraphics.setClip(0, 0, 320, 360);
  }
  
  public static void d(Graphics paramGraphics, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramGraphics.drawRGB(paramArrayOfint, 0, 160, paramInt2, paramInt3, 160, 180, true);
  }
  
  public static Image d(Image paramImage) {
    int i = paramImage.getWidth();
    int j = paramImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramImage.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
    byte b = 0;
    int k = arrayOfInt.length;
    while (b < k) {
      int m = arrayOfInt[b] >>> 24;
      int n = arrayOfInt[b] & 0xFF;
      if (m != 0) {
        arrayOfInt[b] = 0;
        arrayOfInt[b] = n << 24 | 0xFFFFFF;
      } 
      b++;
    } 
    return Image.createRGBImage(arrayOfInt, i, j, true);
  }
  
  public static final void d(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    int i = paramInt1 + paramInt3 - paramImage.getWidth();
    int j = paramInt2 + paramInt4 - paramImage.getHeight();
    if (i > 0)
      paramInt3 -= i; 
    if (j > 0)
      paramInt4 -= j; 
    if (paramInt3 <= 0 || paramInt4 <= 0)
      return; 
    if (paramInt5 == 0) {
      d(paramGraphics, paramImage, paramInt6, paramInt7, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    paramGraphics.drawRegion(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public static final void d(Graphics paramGraphics, int paramInt) {
    paramGraphics.setColor(paramInt);
    paramGraphics.fillRect(0, 0, 320, 360);
  }
  
  public static final void d(Graphics paramGraphics, char[] paramArrayOfchar, int paramInt) {
    byte b1 = 0;
    int i = paramArrayOfchar.length;
    char c = Character.MIN_VALUE;
    int j = 320 - paramInt >> 1;
    byte b2 = 100;
    paramInt += 10;
    int k = paramInt - bb.d;
    while (b1 < i) {
      byte b = b1;
      int m = 0;
      int n = bb.d(c);
      while (b < i && (c = paramArrayOfchar[b]) != '&' && (((n = m + n) <= paramInt && (c != ' ' || n <= k)) || i < 10)) {
        m = n;
        b++;
      } 
      m = j + (paramInt - m >> 1);
      while (b1 < b) {
        c = paramArrayOfchar[b1];
        m += bb.d(paramGraphics, c, m, b2);
        b1++;
      } 
      b2 += 16;
      b1 = b;
      if (c == '&')
        b1++; 
    } 
  }
  
  public static byte[] d(String paramString) {
    try {
      return d(d(paramString), true);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  private static byte[] d(byte[] paramArrayOfbyte, boolean paramBoolean) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    try {
      byte[] arrayOfByte1 = new byte[4];
      for (byte b = 0; b < paramArrayOfbyte.length; b += 8) {
        int i = d(paramArrayOfbyte, b);
        int j = d(paramArrayOfbyte, b + 4);
        if (paramBoolean) {
          i ^= j;
        } else {
          j ^= i;
        } 
        i ^= 0x76F74372;
        j ^= 0x1244FD19;
        d(i, arrayOfByte1);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte, b, 4);
        d(j, arrayOfByte1);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte, b + 4, 4);
      } 
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  private static void d(int paramInt, byte[] paramArrayOfbyte) {
    paramArrayOfbyte[0] = paramInt >> 24;
    paramArrayOfbyte[1] = (byte)(paramInt >> 16);
    paramArrayOfbyte[2] = (byte)(paramInt >> 8);
    paramArrayOfbyte[3] = (byte)paramInt;
  }
  
  private static int d(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte[paramInt] & 0xFF) << 24 | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 8 | paramArrayOfbyte[paramInt + 3] & 0xFF;
  }
  
  private static byte[] d(InputStream paramInputStream, boolean paramBoolean) {
    int i;
    byte[] arrayOfByte2 = new byte[i = paramInputStream.read() & 0xFF | (paramInputStream.read() & 0xFF) << 8];
    int j;
    if ((j = i % 8) != 0)
      arrayOfByte2 = new byte[i + 8 - j]; 
    paramInputStream.read(arrayOfByte2);
    byte[] arrayOfByte1 = d(arrayOfByte2, paramBoolean);
    arrayOfByte2 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    return arrayOfByte2;
  }
  
  public static String d(String paramString) {
    try {
      InputStream inputStream;
      if ((inputStream = d(paramString)) == null)
        return null; 
      inputStream.skip(2L);
      byte[] arrayOfByte1 = d(inputStream, false);
      byte[] arrayOfByte2 = arrayOfByte1;
      inputStream = inputStream;
      byte[] arrayOfByte3 = new byte[32];
      inputStream.read(arrayOfByte3);
      char[] arrayOfChar;
      char c = (arrayOfChar = (new String(arrayOfByte3, "UTF-8")).toCharArray())[0];
      arrayOfChar[0] = arrayOfChar[arrayOfChar.length - 1];
      arrayOfChar[arrayOfChar.length - 1] = c;
      if ((new String(arrayOfChar)).equals(bm.d().d(arrayOfByte2)))
        return new String(arrayOfByte1, "UTF-8"); 
    } catch (Exception exception) {}
    return null;
  }
  
  public static byte[] d(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    return d(new DataInputStream(byteArrayInputStream), false);
  }
  
  public static byte[] e(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    DataInputStream dataInputStream;
    (dataInputStream = new DataInputStream(byteArrayInputStream)).readShort();
    return d(dataInputStream, false);
  }
  
  public static Image d(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte1.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte1, 0, paramArrayOfbyte1.length);
    int i = 0;
    int j = 0;
    int m;
    for (m = 0; m < arrayOfByte1.length; m++) {
      if (arrayOfByte1[m] == 80 && arrayOfByte1[m + 1] == 76 && arrayOfByte1[m + 2] == 84 && arrayOfByte1[m + 3] == 69) {
        i = m + 4;
        j = (arrayOfByte1[m - 4] & 0xFF) << 24 | (arrayOfByte1[m - 4 + 1] & 0xFF) << 16 | (arrayOfByte1[m - 4 + 2] & 0xFF) << 8 | arrayOfByte1[m - 4 + 3] & 0xFF;
        break;
      } 
    } 
    for (m = i; m < i + j; m++)
      arrayOfByte1[m] = paramArrayOfbyte2[m - i]; 
    byte[] arrayOfByte2 = new byte[j + 4];
    byte b2;
    for (b2 = 0; b2 < j + 4; b2++)
      arrayOfByte2[b2] = arrayOfByte1[i - 4 + b2]; 
    int k = arrayOfByte2.length;
    paramArrayOfbyte2 = arrayOfByte2;
    if (d == 0) {
      for (byte b = 0; b < 'Ā'; b++) {
        long l = b;
        for (b2 = 0; b2 < 8; b2++) {
          if ((int)(l & 0x1L) != 0) {
            l = 0xEDB88320L ^ l >> 1L;
          } else {
            l >>= 1L;
          } 
        } 
        d[b] = l;
      } 
      d = 1;
    } 
    long l2 = 4294967295L;
    for (byte b1 = 0; b1 < k; b1++)
      l2 = d[(int)(l2 ^ paramArrayOfbyte2[b1]) & 0xFF] ^ l2 >> 8L; 
    long l1 = l2 ^ 0xFFFFFFFFL;
    i += j;
    arrayOfByte1[i] = (byte)(int)((l1 & 0xFFFFFFFFFF000000L) >> 24L);
    arrayOfByte1[i + 1] = (byte)(int)((l1 & 0xFF0000L) >> 16L);
    arrayOfByte1[i + 2] = (byte)(int)((l1 & 0xFF00L) >> 8L);
    arrayOfByte1[i + 3] = (byte)(int)(l1 & 0xFFL);
    return Image.createImage(arrayOfByte1, 0, arrayOfByte1.length);
  }
  
  public static byte[] e(String paramString) {
    try {
      InputStream inputStream2 = d(paramString);
      InputStream inputStream1 = inputStream2;
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte2 = new byte[10240];
      int i;
      for (i = inputStream1.read(arrayOfByte2); i >= 0; i = inputStream1.read(arrayOfByte2)) {
        if (i > 0)
          byteArrayOutputStream.write(arrayOfByte2, 0, i); 
      } 
      byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray();
      inputStream2.close();
      return arrayOfByte1;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static DataInputStream d(String paramString) {
    InputStream inputStream = d(paramString);
    return new DataInputStream(inputStream);
  }
  
  private static InputStream d(String paramString) {
    // Byte code:
    //   0: getstatic com/fs/arpg/bi.d : Lcom/fs/arpg/bi;
    //   3: invokevirtual getClass : ()Ljava/lang/Class;
    //   6: aload_0
    //   7: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   10: areturn
  }
  
  public static String[] d(String paramString, char paramChar) {
    if (paramString == null)
      return null; 
    char[] arrayOfChar;
    if ((arrayOfChar = paramString.toCharArray()).length == 0)
      return null; 
    byte b = 0;
    int i;
    for (i = 0; i < arrayOfChar.length; i++) {
      if (paramChar == arrayOfChar[i])
        b++; 
    } 
    if (arrayOfChar[arrayOfChar.length - 1] != paramChar)
      b++; 
    if (b == 0)
      return null; 
    i = -1;
    String[] arrayOfString = new String[b];
    for (b = 0; b < arrayOfString.length; b++) {
      int j = i + 1;
      if ((i = paramString.indexOf(paramChar, i + 1)) == -1) {
        arrayOfString[b] = paramString.substring(j).trim();
      } else {
        arrayOfString[b] = paramString.substring(j, i).trim();
      } 
    } 
    return arrayOfString;
  }
  
  public static int d(int paramInt) {
    if (paramInt < 10) {
      paramInt = 1;
    } else if (paramInt < 100) {
      paramInt = 2;
    } else if (paramInt < 1000) {
      paramInt = 3;
    } else if (paramInt < 10000) {
      paramInt = 4;
    } else if (paramInt < 100000) {
      paramInt = 5;
    } else if (paramInt < 1000000) {
      paramInt = 6;
    } else if (paramInt < 10000000) {
      paramInt = 7;
    } else {
      paramInt = 10;
    } 
    return paramInt;
  }
  
  public static void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramGraphics.fillTriangle(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  static String d(String paramString1, String paramString2, String paramString3) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = 0;
    int j = paramString1.indexOf(paramString2);
    int k = paramString2.length();
    while (j != -1) {
      stringBuffer.append(paramString1.substring(i, j));
      i = j + k;
      j = paramString1.indexOf(paramString2, i);
      stringBuffer.append(paramString3);
    } 
    stringBuffer.append(paramString1.substring(i, paramString1.length()));
    return stringBuffer.toString();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bi.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */