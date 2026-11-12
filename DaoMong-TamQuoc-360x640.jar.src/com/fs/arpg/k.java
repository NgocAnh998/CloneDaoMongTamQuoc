package com.fs.arpg;

import javax.microedition.lcdui.Image;

public final class k {
  public String d;
  
  boolean d;
  
  short d;
  
  String e;
  
  public short[] d;
  
  public String[] d = true;
  
  public final void d(be parambe) {
    // Byte code:
    //   0: aload_1
    //   1: getfield r : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield d : Z
    //   12: ifeq -> 36
    //   15: aload_1
    //   16: iconst_1
    //   17: putfield s : Z
    //   20: aload_1
    //   21: aload_0
    //   22: getfield d : S
    //   25: aload_0
    //   26: getfield e : Ljava/lang/String;
    //   29: invokestatic d : (SLjava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   32: putfield d : Ljavax/microedition/lcdui/Image;
    //   35: return
    //   36: aload_0
    //   37: getfield d : [S
    //   40: arraylength
    //   41: istore_2
    //   42: aload_1
    //   43: iconst_0
    //   44: putfield s : Z
    //   47: iload_2
    //   48: anewarray javax/microedition/lcdui/Image
    //   51: astore #5
    //   53: iload_2
    //   54: newarray int
    //   56: astore #6
    //   58: iconst_0
    //   59: istore #7
    //   61: iconst_0
    //   62: istore #8
    //   64: iload #8
    //   66: iload_2
    //   67: if_icmpge -> 124
    //   70: aload_0
    //   71: getfield d : [S
    //   74: iload #8
    //   76: saload
    //   77: istore #4
    //   79: aload_0
    //   80: getfield d : [Ljava/lang/String;
    //   83: iload #8
    //   85: aaload
    //   86: astore_3
    //   87: aload #5
    //   89: iload #8
    //   91: iload #4
    //   93: aload_3
    //   94: invokestatic d : (SLjava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   97: aastore
    //   98: iload #7
    //   100: aload #5
    //   102: iload #8
    //   104: aaload
    //   105: invokevirtual getHeight : ()I
    //   108: iadd
    //   109: istore #7
    //   111: aload #6
    //   113: iload #8
    //   115: iload #7
    //   117: iastore
    //   118: iinc #8, 1
    //   121: goto -> 64
    //   124: aload_1
    //   125: aload #5
    //   127: putfield d : [Ljavax/microedition/lcdui/Image;
    //   130: aload_1
    //   131: getfield e : Lcom/fs/arpg/bc;
    //   134: dup
    //   135: astore #8
    //   137: getfield c : [S
    //   140: arraylength
    //   141: iconst_1
    //   142: ishr
    //   143: dup
    //   144: istore_3
    //   145: newarray int
    //   147: astore #4
    //   149: iconst_0
    //   150: istore #7
    //   152: iload #7
    //   154: iload_3
    //   155: if_icmpge -> 340
    //   158: aload #8
    //   160: iload #7
    //   162: istore #9
    //   164: astore #5
    //   166: iload #9
    //   168: iconst_1
    //   169: ishl
    //   170: istore #10
    //   172: aload #5
    //   174: getfield e : [S
    //   177: iload #10
    //   179: iconst_1
    //   180: iadd
    //   181: saload
    //   182: istore #5
    //   184: aload #6
    //   186: iload #5
    //   188: iconst_0
    //   189: iload_2
    //   190: iconst_1
    //   191: isub
    //   192: istore #12
    //   194: istore #11
    //   196: istore #10
    //   198: astore #9
    //   200: iload #11
    //   202: iload #12
    //   204: if_icmpgt -> 301
    //   207: aload #9
    //   209: iload #11
    //   211: iload #10
    //   213: invokestatic d : ([III)Z
    //   216: ifeq -> 224
    //   219: iload #11
    //   221: goto -> 302
    //   224: aload #9
    //   226: iload #12
    //   228: iload #10
    //   230: invokestatic d : ([III)Z
    //   233: ifeq -> 241
    //   236: iload #12
    //   238: goto -> 302
    //   241: iload #11
    //   243: iload #12
    //   245: iadd
    //   246: iconst_1
    //   247: ishr
    //   248: istore #5
    //   250: aload #9
    //   252: iload #5
    //   254: iload #10
    //   256: invokestatic d : ([III)Z
    //   259: ifeq -> 267
    //   262: iload #5
    //   264: goto -> 302
    //   267: aload #9
    //   269: iload #5
    //   271: iaload
    //   272: iload #10
    //   274: if_icmple -> 289
    //   277: iload #5
    //   279: iconst_1
    //   280: isub
    //   281: istore #12
    //   283: iinc #11, 1
    //   286: goto -> 200
    //   289: iload #5
    //   291: iconst_1
    //   292: iadd
    //   293: istore #11
    //   295: iinc #12, -1
    //   298: goto -> 200
    //   301: iconst_0
    //   302: istore #5
    //   304: aload #4
    //   306: iload #7
    //   308: iload #5
    //   310: iastore
    //   311: iload #5
    //   313: ifle -> 334
    //   316: aload #4
    //   318: iload #7
    //   320: dup2
    //   321: iaload
    //   322: aload #6
    //   324: iload #5
    //   326: iconst_1
    //   327: isub
    //   328: iaload
    //   329: bipush #16
    //   331: ishl
    //   332: ior
    //   333: iastore
    //   334: iinc #7, 1
    //   337: goto -> 152
    //   340: aload_1
    //   341: aload #4
    //   343: putfield a : [I
    //   346: aload_1
    //   347: iconst_1
    //   348: putfield r : Z
    //   351: return
    //   352: pop
    //   353: return
    // Exception table:
    //   from	to	target	type
    //   8	35	352	java/lang/Exception
    //   36	351	352	java/lang/Exception
  }
  
  private static boolean d(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int j = 0;
    if (paramInt1 > 0)
      j = paramArrayOfint[paramInt1 - 1]; 
    int i = paramArrayOfint[paramInt1];
    return (paramInt2 >= j && paramInt2 < i);
  }
  
  private static Image d(short paramShort, String paramString) {
    Image image;
    n n = n.d();
    if (paramString != null) {
      byte[] arrayOfByte1 = n.d(paramShort);
      byte[] arrayOfByte2 = bi.e("/" + paramString);
      image = bi.d(arrayOfByte1, arrayOfByte2);
    } else {
      image = n.d(image);
    } 
    return image;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\k.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */