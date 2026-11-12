package com.fs.arpg;

import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class n {
  private int[] d;
  
  private String[] d;
  
  private String[] e;
  
  bh d;
  
  private at d = (at)new bh(50);
  
  private static n d;
  
  public static n d() {
    if (d == null)
      d = new n(); 
    return d;
  }
  
  private n() {
    this.d = (n)new at("/image.idx", "/image.pkg");
    d();
  }
  
  private void d() {
    // Byte code:
    //   0: ldc '/images.dat'
    //   2: invokestatic d : (Ljava/lang/String;)Ljava/io/DataInputStream;
    //   5: dup
    //   6: astore_1
    //   7: invokevirtual readShort : ()S
    //   10: istore_2
    //   11: aload_0
    //   12: iload_2
    //   13: newarray int
    //   15: putfield d : [I
    //   18: aload_0
    //   19: iload_2
    //   20: anewarray java/lang/String
    //   23: putfield d : [Ljava/lang/String;
    //   26: aload_0
    //   27: iload_2
    //   28: anewarray java/lang/String
    //   31: putfield e : [Ljava/lang/String;
    //   34: iconst_0
    //   35: istore #4
    //   37: iload #4
    //   39: iload_2
    //   40: if_icmpge -> 118
    //   43: aload_0
    //   44: getfield d : [I
    //   47: iload #4
    //   49: aload_1
    //   50: invokevirtual readShort : ()S
    //   53: iastore
    //   54: aload_0
    //   55: getfield d : [Ljava/lang/String;
    //   58: iload #4
    //   60: aload_1
    //   61: invokevirtual readUTF : ()Ljava/lang/String;
    //   64: aastore
    //   65: aload_1
    //   66: invokevirtual readUTF : ()Ljava/lang/String;
    //   69: dup
    //   70: astore_3
    //   71: ifnull -> 83
    //   74: aload_3
    //   75: invokevirtual length : ()I
    //   78: ifne -> 83
    //   81: aconst_null
    //   82: astore_3
    //   83: aload_3
    //   84: ifnull -> 104
    //   87: new java/lang/StringBuffer
    //   90: dup
    //   91: ldc '/'
    //   93: invokespecial <init> : (Ljava/lang/String;)V
    //   96: aload_3
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   100: invokevirtual toString : ()Ljava/lang/String;
    //   103: astore_3
    //   104: aload_0
    //   105: getfield e : [Ljava/lang/String;
    //   108: iload #4
    //   110: aload_3
    //   111: aastore
    //   112: iinc #4, 1
    //   115: goto -> 37
    //   118: return
    //   119: pop
    //   120: return
    // Exception table:
    //   from	to	target	type
    //   0	118	119	java/lang/Exception
  }
  
  private static String d(String paramString) {
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer("/")).append(paramString.substring(0, paramString.length() - 3));
    stringBuffer.append("fs");
    return stringBuffer.toString();
  }
  
  private Image d(String paramString) {
    byte[] arrayOfByte;
    return this.d.d(paramString) ? Image.createImage(arrayOfByte = this.d.d(paramString), 0, arrayOfByte.length) : Image.createImage(arrayOfByte = bi.d(d((String)arrayOfByte)), 0, arrayOfByte.length);
  }
  
  public final void d(Image paramImage) {
    byte b = 0;
    int i = this.d.d();
    while (b < i) {
      if ((Image)this.d.d(b) == paramImage) {
        d(this.d.d((short)b));
        i = this.d.d();
        b--;
      } 
      b++;
    } 
  }
  
  public final void d(short paramShort) {
    this.d.d(paramShort);
  }
  
  private byte[] d(String paramString) {
    try {
      return this.d.d(paramString) ? this.d.d(paramString) : bi.d(d(paramString));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final Image d(short paramShort) {
    Image image;
    if ((image = (Image)this.d.d(paramShort)) != null)
      return image; 
    String str1 = d((String[])this.d, paramShort);
    String str2 = d(this.e, paramShort);
    if (str1 == null)
      return null; 
    try {
      if (str2 == null) {
        image = d(str1);
      } else {
        String str4 = str2;
        String str3;
        byte[] arrayOfByte1 = d(str3 = str1);
        byte[] arrayOfByte2 = bi.e(str4);
        image = bi.d(arrayOfByte1, arrayOfByte2);
      } 
      this.d.d(paramShort, image);
    } catch (Exception exception) {
      try {
        return d(str1);
      } catch (IOException iOException) {}
    } 
    return image;
  }
  
  public final byte[] d(int paramInt) {
    String str;
    return ((str = d((String[])this.d, paramInt)) == null) ? null : (this.d.d(str) ? this.d.d(str) : bi.d(d(str)));
  }
  
  private String d(String[] paramArrayOfString, int paramInt) {
    int i = 0;
    int j = this.d.length - 1;
    while (i <= j) {
      if (this.d[i] == paramInt)
        return paramArrayOfString[i]; 
      if (this.d[j] == paramInt)
        return paramArrayOfString[j]; 
      int k = i + j >> 1;
      if (this.d[k] == paramInt)
        return paramArrayOfString[k]; 
      if (this.d[k] > paramInt) {
        j = k - 1;
        continue;
      } 
      i = k + 1;
    } 
    return null;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\n.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */