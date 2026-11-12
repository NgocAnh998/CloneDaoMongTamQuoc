package com.fs.arpg;

import java.io.DataInputStream;
import java.util.Hashtable;

public final class aw {
  private static short d;
  
  private short[] e;
  
  short[] d;
  
  private Object[] d;
  
  private int e;
  
  static int d;
  
  private static x[] d = new x[10];
  
  private static int[] d = new int[10];
  
  private static int[] e = new int[10];
  
  private static int[] c = new int[10];
  
  private static int c;
  
  public static void d() {
    d = (int[])new x[10];
    d = new int[10];
    e = new int[10];
    c = new int[10];
    c = 0;
  }
  
  public static void d(x paramx, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iload #4
    //   5: getstatic com/fs/arpg/aw.c : I
    //   8: if_icmpge -> 52
    //   11: getstatic com/fs/arpg/aw.d : [Lcom/fs/arpg/x;
    //   14: iload #4
    //   16: aaload
    //   17: aload_0
    //   18: if_acmpne -> 46
    //   21: getstatic com/fs/arpg/aw.d : [I
    //   24: iload #4
    //   26: iaload
    //   27: iload_1
    //   28: if_icmpne -> 46
    //   31: getstatic com/fs/arpg/aw.e : [I
    //   34: iload #4
    //   36: iload_2
    //   37: iastore
    //   38: getstatic com/fs/arpg/aw.c : [I
    //   41: iload #4
    //   43: iload_3
    //   44: iastore
    //   45: return
    //   46: iinc #4, 1
    //   49: goto -> 3
    //   52: getstatic com/fs/arpg/aw.d : [Lcom/fs/arpg/x;
    //   55: getstatic com/fs/arpg/aw.c : I
    //   58: aload_0
    //   59: aastore
    //   60: getstatic com/fs/arpg/aw.d : [I
    //   63: getstatic com/fs/arpg/aw.c : I
    //   66: iload_1
    //   67: iastore
    //   68: getstatic com/fs/arpg/aw.e : [I
    //   71: getstatic com/fs/arpg/aw.c : I
    //   74: iload_2
    //   75: iastore
    //   76: getstatic com/fs/arpg/aw.c : [I
    //   79: getstatic com/fs/arpg/aw.c : I
    //   82: iload_3
    //   83: iastore
    //   84: getstatic com/fs/arpg/aw.c : I
    //   87: iconst_1
    //   88: iadd
    //   89: putstatic com/fs/arpg/aw.c : I
    //   92: return
  }
  
  public static boolean d(x paramx, int paramInt) {
    if (c == 0)
      return false; 
    for (byte b = 0; b < c; b++) {
      if (d[b] == paramx && paramInt == d[b])
        return (aq.c < e[b] + ((ai)ba.d).d + c[b]); 
    } 
    return false;
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    // Byte code:
    //   0: bipush #100
    //   2: newarray short
    //   4: astore_2
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iconst_0
    //   9: invokespecial d : (Ljava/io/DataInputStream;[SI)I
    //   12: istore_3
    //   13: aload_0
    //   14: iload_3
    //   15: newarray short
    //   17: putfield e : [S
    //   20: aload_2
    //   21: iconst_0
    //   22: aload_0
    //   23: getfield e : [S
    //   26: iconst_0
    //   27: iload_3
    //   28: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   31: aload_1
    //   32: invokevirtual read : ()I
    //   35: istore_2
    //   36: aload_0
    //   37: iload_2
    //   38: newarray short
    //   40: putfield d : [S
    //   43: aload_0
    //   44: iload_2
    //   45: anewarray java/lang/Object
    //   48: putfield d : [Ljava/lang/Object;
    //   51: iconst_0
    //   52: istore_3
    //   53: iload_3
    //   54: iload_2
    //   55: if_icmpge -> 761
    //   58: aload_0
    //   59: aload_1
    //   60: iload_3
    //   61: istore #6
    //   63: astore #5
    //   65: astore #4
    //   67: aload #5
    //   69: invokevirtual read : ()I
    //   72: istore #7
    //   74: aload #4
    //   76: getfield d : [S
    //   79: iload #6
    //   81: iload #7
    //   83: i2s
    //   84: sastore
    //   85: iload #7
    //   87: tableswitch default -> 755, 6 -> 196, 7 -> 755, 8 -> 282, 9 -> 337, 10 -> 364, 11 -> 309, 12 -> 391, 13 -> 755, 14 -> 755, 15 -> 755, 16 -> 755, 17 -> 755, 18 -> 755, 19 -> 755, 20 -> 755, 21 -> 755, 22 -> 419, 23 -> 491, 24 -> 538, 25 -> 566, 26 -> 593, 27 -> 620, 28 -> 677, 29 -> 727
    //   196: new com/fs/arpg/aj
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: dup
    //   204: astore #7
    //   206: aload #5
    //   208: astore #8
    //   210: dup
    //   211: astore #5
    //   213: aload #8
    //   215: invokestatic d : (Ljava/io/DataInputStream;)Lcom/fs/arpg/aa;
    //   218: putfield d : Lcom/fs/arpg/aa;
    //   221: aload #5
    //   223: aload #8
    //   225: invokestatic d : (Ljava/io/DataInputStream;)Lcom/fs/arpg/ao;
    //   228: putfield d : Lcom/fs/arpg/ao;
    //   231: aload #5
    //   233: aload #8
    //   235: invokevirtual readBoolean : ()Z
    //   238: putfield d : Z
    //   241: aload #5
    //   243: aload #8
    //   245: invokevirtual readShort : ()S
    //   248: putfield d : I
    //   251: aload #5
    //   253: aload #8
    //   255: invokevirtual readByte : ()B
    //   258: sipush #255
    //   261: iand
    //   262: sipush #1000
    //   265: imul
    //   266: putfield e : I
    //   269: aload #4
    //   271: getfield d : [Ljava/lang/Object;
    //   274: iload #6
    //   276: aload #7
    //   278: aastore
    //   279: goto -> 755
    //   282: aload #5
    //   284: invokevirtual readInt : ()I
    //   287: istore #5
    //   289: aload #4
    //   291: getfield d : [Ljava/lang/Object;
    //   294: iload #6
    //   296: new java/lang/Integer
    //   299: dup
    //   300: iload #5
    //   302: invokespecial <init> : (I)V
    //   305: aastore
    //   306: goto -> 755
    //   309: new com/fs/arpg/ay
    //   312: dup
    //   313: invokespecial <init> : ()V
    //   316: dup
    //   317: astore #7
    //   319: aload #5
    //   321: invokevirtual d : (Ljava/io/DataInputStream;)V
    //   324: aload #4
    //   326: getfield d : [Ljava/lang/Object;
    //   329: iload #6
    //   331: aload #7
    //   333: aastore
    //   334: goto -> 755
    //   337: aload #5
    //   339: invokevirtual readBoolean : ()Z
    //   342: istore #5
    //   344: aload #4
    //   346: getfield d : [Ljava/lang/Object;
    //   349: iload #6
    //   351: new java/lang/Boolean
    //   354: dup
    //   355: iload #5
    //   357: invokespecial <init> : (Z)V
    //   360: aastore
    //   361: goto -> 755
    //   364: aload #5
    //   366: invokevirtual readBoolean : ()Z
    //   369: istore #5
    //   371: aload #4
    //   373: getfield d : [Ljava/lang/Object;
    //   376: iload #6
    //   378: new java/lang/Boolean
    //   381: dup
    //   382: iload #5
    //   384: invokespecial <init> : (Z)V
    //   387: aastore
    //   388: goto -> 755
    //   391: new com/fs/arpg/y
    //   394: dup
    //   395: invokespecial <init> : ()V
    //   398: dup
    //   399: astore #7
    //   401: aload #5
    //   403: invokevirtual d : (Ljava/io/DataInputStream;)V
    //   406: aload #4
    //   408: getfield d : [Ljava/lang/Object;
    //   411: iload #6
    //   413: aload #7
    //   415: aastore
    //   416: goto -> 755
    //   419: new com/fs/arpg/z
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: dup
    //   427: astore #7
    //   429: aload #5
    //   431: astore #8
    //   433: dup
    //   434: astore #5
    //   436: aload #8
    //   438: invokevirtual readBoolean : ()Z
    //   441: putfield d : Z
    //   444: aload #5
    //   446: aload #8
    //   448: invokevirtual readShort : ()S
    //   451: sipush #1000
    //   454: imul
    //   455: putfield d : I
    //   458: aload #5
    //   460: aload #8
    //   462: invokevirtual readShort : ()S
    //   465: putfield e : I
    //   468: aload #5
    //   470: aload #8
    //   472: invokevirtual readShort : ()S
    //   475: putfield c : I
    //   478: aload #4
    //   480: getfield d : [Ljava/lang/Object;
    //   483: iload #6
    //   485: aload #7
    //   487: aastore
    //   488: goto -> 755
    //   491: aload #5
    //   493: invokevirtual readShort : ()S
    //   496: istore #7
    //   498: aload #5
    //   500: invokevirtual readShort : ()S
    //   503: istore #5
    //   505: iload #7
    //   507: bipush #16
    //   509: ishl
    //   510: iload #5
    //   512: ldc 65535
    //   514: iand
    //   515: ior
    //   516: istore #5
    //   518: aload #4
    //   520: getfield d : [Ljava/lang/Object;
    //   523: iload #6
    //   525: new java/lang/Integer
    //   528: dup
    //   529: iload #5
    //   531: invokespecial <init> : (I)V
    //   534: aastore
    //   535: goto -> 755
    //   538: new com/fs/arpg/ap
    //   541: dup
    //   542: invokespecial <init> : ()V
    //   545: dup
    //   546: astore #7
    //   548: aload #5
    //   550: invokevirtual d : (Ljava/io/DataInputStream;)V
    //   553: aload #4
    //   555: getfield d : [Ljava/lang/Object;
    //   558: iload #6
    //   560: aload #7
    //   562: aastore
    //   563: goto -> 755
    //   566: aload #5
    //   568: invokevirtual readUTF : ()Ljava/lang/String;
    //   571: astore #5
    //   573: aload #4
    //   575: getfield d : [Ljava/lang/Object;
    //   578: iload #6
    //   580: new com/fs/arpg/m
    //   583: dup
    //   584: aload #5
    //   586: invokespecial <init> : (Ljava/lang/String;)V
    //   589: aastore
    //   590: goto -> 755
    //   593: aload #5
    //   595: invokevirtual readBoolean : ()Z
    //   598: istore #5
    //   600: aload #4
    //   602: getfield d : [Ljava/lang/Object;
    //   605: iload #6
    //   607: new java/lang/Boolean
    //   610: dup
    //   611: iload #5
    //   613: invokespecial <init> : (Z)V
    //   616: aastore
    //   617: goto -> 755
    //   620: aload #5
    //   622: invokevirtual readShort : ()S
    //   625: istore #7
    //   627: aload #5
    //   629: invokevirtual readShort : ()S
    //   632: istore #8
    //   634: aload #5
    //   636: invokevirtual readShort : ()S
    //   639: istore #5
    //   641: aload #4
    //   643: getfield d : [Ljava/lang/Object;
    //   646: iload #6
    //   648: new java/lang/Integer
    //   651: dup
    //   652: iload #7
    //   654: bipush #16
    //   656: ishl
    //   657: iload #8
    //   659: bipush #8
    //   661: ishl
    //   662: ior
    //   663: iload #5
    //   665: sipush #255
    //   668: iand
    //   669: ior
    //   670: invokespecial <init> : (I)V
    //   673: aastore
    //   674: goto -> 755
    //   677: aload #5
    //   679: invokevirtual readUTF : ()Ljava/lang/String;
    //   682: astore #7
    //   684: aload #5
    //   686: invokevirtual readShort : ()S
    //   689: istore #5
    //   691: aload #4
    //   693: getfield d : [Ljava/lang/Object;
    //   696: iload #6
    //   698: new java/lang/StringBuffer
    //   701: dup
    //   702: invokespecial <init> : ()V
    //   705: aload #7
    //   707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   710: ldc '|'
    //   712: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   715: iload #5
    //   717: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   720: invokevirtual toString : ()Ljava/lang/String;
    //   723: aastore
    //   724: goto -> 755
    //   727: aload #5
    //   729: invokevirtual read : ()I
    //   732: sipush #255
    //   735: iand
    //   736: istore #5
    //   738: aload #4
    //   740: getfield d : [Ljava/lang/Object;
    //   743: iload #6
    //   745: new java/lang/Integer
    //   748: dup
    //   749: iload #5
    //   751: invokespecial <init> : (I)V
    //   754: aastore
    //   755: iinc #3, 1
    //   758: goto -> 53
    //   761: return
  }
  
  private int d(DataInputStream paramDataInputStream, short[] paramArrayOfshort, int paramInt) {
    int i;
    short s = (short)paramDataInputStream.read();
    paramArrayOfshort[paramInt] = s;
    paramInt++;
    for (byte b = 0; b < s; b++) {
      int j = paramInt;
      short[] arrayOfShort = paramArrayOfshort;
      DataInputStream dataInputStream = paramDataInputStream;
      aw aw1 = this;
      short s1 = (short)dataInputStream.read();
      arrayOfShort[j] = s1;
      j++;
      switch (s1) {
        case 0:
          arrayOfShort[j] = dataInputStream.readShort();
          arrayOfShort[++j] = dataInputStream.readShort();
          j++;
          break;
        case 6:
          j = e(dataInputStream, arrayOfShort, j);
          break;
        case 7:
          arrayOfShort[j] = dataInputStream.readShort();
          j++;
          break;
        case 3:
          j = aw1.d(dataInputStream, arrayOfShort, j);
          break;
        case 4:
          j = aw1.d(dataInputStream, arrayOfShort, j);
          break;
        case 2:
          j = e(dataInputStream, arrayOfShort, j);
          break;
        case 12:
          arrayOfShort[j] = dataInputStream.readShort();
          j = e(dataInputStream, arrayOfShort, ++j);
          break;
        case 13:
          j = e(dataInputStream, arrayOfShort, j);
          break;
        case 14:
          arrayOfShort[j] = (short)((dataInputStream.readByte() & 0xFF) * 10);
          arrayOfShort[++j] = (short)((dataInputStream.readByte() & 0xFF) * 10);
          j++;
          break;
        case 15:
          arrayOfShort[j] = d;
          j++;
          d = (short)(d + 1);
          break;
        case 16:
          arrayOfShort[j] = dataInputStream.readShort();
          arrayOfShort[++j] = dataInputStream.readShort();
          j++;
          break;
        case 1:
        case 17:
          arrayOfShort[j] = dataInputStream.readBoolean() ? 1 : 0;
          j++;
          break;
        case 18:
          arrayOfShort[j] = (short)(dataInputStream.readByte() & 0xFF);
          j++;
          break;
      } 
      i = j;
    } 
    return i;
  }
  
  private static int e(DataInputStream paramDataInputStream, short[] paramArrayOfshort, int paramInt) {
    short s = (short)(paramDataInputStream.readBoolean() ? 1 : 0);
    paramArrayOfshort[paramInt] = s;
    return ++paramInt;
  }
  
  public final boolean d(x paramx) {
    int i = this.e[0];
    this.e = true;
    for (byte b = 0; b < i; b++) {
      if (!c(paramx))
        return false; 
    } 
    return true;
  }
  
  private boolean c(x paramx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : [S
    //   4: aload_0
    //   5: getfield e : I
    //   8: saload
    //   9: istore_2
    //   10: aload_0
    //   11: dup
    //   12: getfield e : I
    //   15: iconst_1
    //   16: iadd
    //   17: putfield e : I
    //   20: iload_2
    //   21: tableswitch default -> 1215, 0 -> 112, 1 -> 267, 2 -> 530, 3 -> 430, 4 -> 479, 5 -> 528, 6 -> 318, 7 -> 394, 8 -> 428, 9 -> 583, 10 -> 588, 11 -> 670, 12 -> 599, 13 -> 812, 14 -> 955, 15 -> 1032, 16 -> 1079, 17 -> 1149, 18 -> 1189
    //   112: aload_0
    //   113: getfield e : [S
    //   116: aload_0
    //   117: getfield e : I
    //   120: saload
    //   121: istore_2
    //   122: aload_0
    //   123: dup
    //   124: getfield e : I
    //   127: iconst_1
    //   128: iadd
    //   129: putfield e : I
    //   132: aload_0
    //   133: getfield e : [S
    //   136: aload_0
    //   137: getfield e : I
    //   140: saload
    //   141: istore_3
    //   142: aload_0
    //   143: dup
    //   144: getfield e : I
    //   147: iconst_1
    //   148: iadd
    //   149: putfield e : I
    //   152: aload_1
    //   153: getfield ab : I
    //   156: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   159: getfield ab : I
    //   162: isub
    //   163: invokestatic abs : (I)I
    //   166: istore #4
    //   168: aload_1
    //   169: getfield ac : I
    //   172: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   175: getfield ac : I
    //   178: isub
    //   179: invokestatic abs : (I)I
    //   182: istore #5
    //   184: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   187: invokevirtual d : ()Z
    //   190: ifeq -> 231
    //   193: aload_1
    //   194: getfield ab : I
    //   197: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   200: getfield d : Lcom/fs/arpg/e;
    //   203: getfield ab : I
    //   206: isub
    //   207: invokestatic abs : (I)I
    //   210: istore #4
    //   212: aload_1
    //   213: getfield ac : I
    //   216: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   219: getfield d : Lcom/fs/arpg/e;
    //   222: getfield ac : I
    //   225: isub
    //   226: invokestatic abs : (I)I
    //   229: istore #5
    //   231: iload #4
    //   233: iload_2
    //   234: if_icmpge -> 245
    //   237: iload #5
    //   239: iload_2
    //   240: if_icmpge -> 245
    //   243: iconst_0
    //   244: ireturn
    //   245: iload_3
    //   246: ifne -> 251
    //   249: iconst_1
    //   250: ireturn
    //   251: iload #4
    //   253: iload_3
    //   254: if_icmpgt -> 263
    //   257: iload #5
    //   259: iload_3
    //   260: if_icmple -> 265
    //   263: iconst_0
    //   264: ireturn
    //   265: iconst_1
    //   266: ireturn
    //   267: aload_0
    //   268: getfield e : [S
    //   271: aload_0
    //   272: getfield e : I
    //   275: saload
    //   276: istore_2
    //   277: aload_0
    //   278: dup
    //   279: getfield e : I
    //   282: iconst_1
    //   283: iadd
    //   284: putfield e : I
    //   287: iload_2
    //   288: iconst_1
    //   289: if_icmpne -> 302
    //   292: aload_1
    //   293: getfield d : I
    //   296: iconst_4
    //   297: if_icmpne -> 302
    //   300: iconst_1
    //   301: ireturn
    //   302: iload_2
    //   303: ifne -> 316
    //   306: aload_1
    //   307: getfield d : I
    //   310: iconst_4
    //   311: if_icmpeq -> 316
    //   314: iconst_1
    //   315: ireturn
    //   316: iconst_0
    //   317: ireturn
    //   318: aload_0
    //   319: getfield e : [S
    //   322: aload_0
    //   323: getfield e : I
    //   326: saload
    //   327: istore_2
    //   328: aload_0
    //   329: dup
    //   330: getfield e : I
    //   333: iconst_1
    //   334: iadd
    //   335: putfield e : I
    //   338: iload_2
    //   339: ifeq -> 365
    //   342: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   345: getfield d : Lcom/fs/arpg/ao;
    //   348: ifnull -> 365
    //   351: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   354: getfield d : Lcom/fs/arpg/ao;
    //   357: getfield d : Z
    //   360: ifeq -> 365
    //   363: iconst_1
    //   364: ireturn
    //   365: iload_2
    //   366: ifne -> 392
    //   369: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   372: getfield d : Lcom/fs/arpg/ao;
    //   375: ifnull -> 390
    //   378: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   381: getfield d : Lcom/fs/arpg/ao;
    //   384: getfield d : Z
    //   387: ifne -> 392
    //   390: iconst_1
    //   391: ireturn
    //   392: iconst_0
    //   393: ireturn
    //   394: aload_0
    //   395: getfield e : [S
    //   398: aload_0
    //   399: getfield e : I
    //   402: saload
    //   403: istore_1
    //   404: aload_0
    //   405: dup
    //   406: getfield e : I
    //   409: iconst_1
    //   410: iadd
    //   411: putfield e : I
    //   414: iconst_0
    //   415: bipush #100
    //   417: invokestatic d : (II)I
    //   420: iload_1
    //   421: if_icmpgt -> 426
    //   424: iconst_1
    //   425: ireturn
    //   426: iconst_0
    //   427: ireturn
    //   428: iconst_0
    //   429: ireturn
    //   430: aload_0
    //   431: getfield e : [S
    //   434: aload_0
    //   435: getfield e : I
    //   438: saload
    //   439: istore_2
    //   440: aload_0
    //   441: dup
    //   442: getfield e : I
    //   445: iconst_1
    //   446: iadd
    //   447: putfield e : I
    //   450: iconst_1
    //   451: istore_3
    //   452: iconst_0
    //   453: istore #4
    //   455: iload #4
    //   457: iload_2
    //   458: if_icmpge -> 477
    //   461: aload_0
    //   462: aload_1
    //   463: invokespecial c : (Lcom/fs/arpg/x;)Z
    //   466: ifne -> 471
    //   469: iconst_0
    //   470: istore_3
    //   471: iinc #4, 1
    //   474: goto -> 455
    //   477: iload_3
    //   478: ireturn
    //   479: aload_0
    //   480: getfield e : [S
    //   483: aload_0
    //   484: getfield e : I
    //   487: saload
    //   488: istore_2
    //   489: aload_0
    //   490: dup
    //   491: getfield e : I
    //   494: iconst_1
    //   495: iadd
    //   496: putfield e : I
    //   499: iconst_0
    //   500: istore_3
    //   501: iconst_0
    //   502: istore #4
    //   504: iload #4
    //   506: iload_2
    //   507: if_icmpge -> 526
    //   510: aload_0
    //   511: aload_1
    //   512: invokespecial c : (Lcom/fs/arpg/x;)Z
    //   515: ifeq -> 520
    //   518: iconst_1
    //   519: istore_3
    //   520: iinc #4, 1
    //   523: goto -> 504
    //   526: iload_3
    //   527: ireturn
    //   528: iconst_1
    //   529: ireturn
    //   530: aload_0
    //   531: getfield e : [S
    //   534: aload_0
    //   535: getfield e : I
    //   538: saload
    //   539: istore_2
    //   540: aload_0
    //   541: dup
    //   542: getfield e : I
    //   545: iconst_1
    //   546: iadd
    //   547: putfield e : I
    //   550: iload_2
    //   551: iconst_1
    //   552: if_icmpne -> 566
    //   555: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   558: getfield l : Z
    //   561: ifeq -> 566
    //   564: iconst_1
    //   565: ireturn
    //   566: iload_2
    //   567: ifne -> 581
    //   570: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   573: getfield l : Z
    //   576: ifne -> 581
    //   579: iconst_1
    //   580: ireturn
    //   581: iconst_0
    //   582: ireturn
    //   583: aload_1
    //   584: getfield f : Z
    //   587: ireturn
    //   588: aload_1
    //   589: getfield f : Z
    //   592: ifne -> 597
    //   595: iconst_1
    //   596: ireturn
    //   597: iconst_0
    //   598: ireturn
    //   599: aload_0
    //   600: getfield e : [S
    //   603: aload_0
    //   604: getfield e : I
    //   607: saload
    //   608: istore_3
    //   609: aload_0
    //   610: dup
    //   611: getfield e : I
    //   614: iconst_1
    //   615: iadd
    //   616: putfield e : I
    //   619: aload_0
    //   620: getfield e : [S
    //   623: aload_0
    //   624: getfield e : I
    //   627: saload
    //   628: istore #4
    //   630: aload_0
    //   631: dup
    //   632: getfield e : I
    //   635: iconst_1
    //   636: iadd
    //   637: putfield e : I
    //   640: iload #4
    //   642: iconst_1
    //   643: if_icmpne -> 658
    //   646: aload_1
    //   647: getfield n : I
    //   650: iload_3
    //   651: if_icmplt -> 656
    //   654: iconst_1
    //   655: ireturn
    //   656: iconst_0
    //   657: ireturn
    //   658: aload_1
    //   659: getfield n : I
    //   662: iload_3
    //   663: if_icmpge -> 668
    //   666: iconst_1
    //   667: ireturn
    //   668: iconst_0
    //   669: ireturn
    //   670: invokestatic d : ()Lcom/fs/arpg/l;
    //   673: getfield d : Ljava/util/Hashtable;
    //   676: invokevirtual size : ()I
    //   679: bipush #10
    //   681: if_icmplt -> 686
    //   684: iconst_0
    //   685: ireturn
    //   686: aload_1
    //   687: getfield ab : I
    //   690: iconst_4
    //   691: ishr
    //   692: istore #5
    //   694: aload_1
    //   695: getfield ac : I
    //   698: iconst_4
    //   699: ishr
    //   700: istore_1
    //   701: iload #5
    //   703: iconst_2
    //   704: isub
    //   705: istore_2
    //   706: iload_2
    //   707: iload #5
    //   709: iconst_2
    //   710: iadd
    //   711: if_icmpgt -> 810
    //   714: iload_1
    //   715: iconst_2
    //   716: isub
    //   717: istore_3
    //   718: iload_3
    //   719: iload_1
    //   720: iconst_2
    //   721: iadd
    //   722: if_icmpgt -> 804
    //   725: iload_2
    //   726: iload #5
    //   728: iconst_2
    //   729: isub
    //   730: if_icmpne -> 740
    //   733: iload_3
    //   734: iload_1
    //   735: iconst_2
    //   736: isub
    //   737: if_icmpeq -> 798
    //   740: iload_2
    //   741: iload #5
    //   743: iconst_2
    //   744: iadd
    //   745: if_icmpne -> 755
    //   748: iload_3
    //   749: iload_1
    //   750: iconst_2
    //   751: isub
    //   752: if_icmpeq -> 798
    //   755: iload_2
    //   756: iload #5
    //   758: iconst_2
    //   759: isub
    //   760: if_icmpne -> 770
    //   763: iload_3
    //   764: iload_1
    //   765: iconst_2
    //   766: iadd
    //   767: if_icmpeq -> 798
    //   770: iload_2
    //   771: iload #5
    //   773: iconst_2
    //   774: iadd
    //   775: if_icmpne -> 785
    //   778: iload_3
    //   779: iload_1
    //   780: iconst_2
    //   781: iadd
    //   782: if_icmpeq -> 798
    //   785: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   788: iload_2
    //   789: iload_3
    //   790: invokevirtual d : (II)Z
    //   793: ifne -> 798
    //   796: iconst_0
    //   797: ireturn
    //   798: iinc #3, 1
    //   801: goto -> 718
    //   804: iinc #2, 1
    //   807: goto -> 706
    //   810: iconst_1
    //   811: ireturn
    //   812: aload_0
    //   813: getfield e : [S
    //   816: aload_0
    //   817: getfield e : I
    //   820: saload
    //   821: istore_2
    //   822: aload_0
    //   823: dup
    //   824: getfield e : I
    //   827: iconst_1
    //   828: iadd
    //   829: putfield e : I
    //   832: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   835: getfield ab : I
    //   838: istore_3
    //   839: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   842: getfield ac : I
    //   845: istore #4
    //   847: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   850: invokevirtual d : ()Z
    //   853: ifeq -> 877
    //   856: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   859: getfield d : Lcom/fs/arpg/e;
    //   862: getfield ab : I
    //   865: istore_3
    //   866: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   869: getfield d : Lcom/fs/arpg/e;
    //   872: getfield ac : I
    //   875: istore #4
    //   877: aload_1
    //   878: getfield ab : I
    //   881: iload_3
    //   882: isub
    //   883: invokestatic abs : (I)I
    //   886: istore_3
    //   887: aload_1
    //   888: getfield ac : I
    //   891: iload #4
    //   893: isub
    //   894: invokestatic abs : (I)I
    //   897: istore_1
    //   898: iload_3
    //   899: iload_1
    //   900: if_icmple -> 911
    //   903: iload_3
    //   904: istore #4
    //   906: iload_1
    //   907: istore_3
    //   908: iload #4
    //   910: istore_1
    //   911: iload_1
    //   912: ifne -> 924
    //   915: iload_2
    //   916: iconst_1
    //   917: if_icmpne -> 922
    //   920: iconst_1
    //   921: ireturn
    //   922: iconst_0
    //   923: ireturn
    //   924: iload_3
    //   925: iconst_3
    //   926: ishl
    //   927: iload_3
    //   928: iadd
    //   929: iload_3
    //   930: iadd
    //   931: iload_1
    //   932: iconst_2
    //   933: ishl
    //   934: if_icmpgt -> 946
    //   937: iload_2
    //   938: iconst_1
    //   939: if_icmpne -> 944
    //   942: iconst_1
    //   943: ireturn
    //   944: iconst_0
    //   945: ireturn
    //   946: iload_2
    //   947: iconst_1
    //   948: if_icmpne -> 953
    //   951: iconst_0
    //   952: ireturn
    //   953: iconst_1
    //   954: ireturn
    //   955: aload_0
    //   956: getfield e : [S
    //   959: aload_0
    //   960: getfield e : I
    //   963: saload
    //   964: ldc 65535
    //   966: iand
    //   967: istore #4
    //   969: aload_0
    //   970: dup
    //   971: getfield e : I
    //   974: iconst_1
    //   975: iadd
    //   976: putfield e : I
    //   979: aload_0
    //   980: getfield e : [S
    //   983: aload_0
    //   984: getfield e : I
    //   987: saload
    //   988: ldc 65535
    //   990: iand
    //   991: i2l
    //   992: lstore #6
    //   994: aload_0
    //   995: dup
    //   996: getfield e : I
    //   999: iconst_1
    //   1000: iadd
    //   1001: putfield e : I
    //   1004: getstatic com/fs/arpg/aq.c : I
    //   1007: i2l
    //   1008: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1011: getfield d : J
    //   1014: lsub
    //   1015: iload #4
    //   1017: i2l
    //   1018: lcmp
    //   1019: ifge -> 1024
    //   1022: iconst_0
    //   1023: ireturn
    //   1024: lload #6
    //   1026: l2i
    //   1027: putstatic com/fs/arpg/aw.d : I
    //   1030: iconst_1
    //   1031: ireturn
    //   1032: aload_0
    //   1033: getfield e : [S
    //   1036: aload_0
    //   1037: getfield e : I
    //   1040: saload
    //   1041: istore_2
    //   1042: aload_0
    //   1043: dup
    //   1044: getfield e : I
    //   1047: iconst_1
    //   1048: iadd
    //   1049: putfield e : I
    //   1052: aload_1
    //   1053: getfield p : I
    //   1056: iload_2
    //   1057: iushr
    //   1058: iconst_1
    //   1059: iand
    //   1060: ifne -> 1077
    //   1063: aload_1
    //   1064: dup
    //   1065: getfield p : I
    //   1068: iconst_1
    //   1069: iload_2
    //   1070: ishl
    //   1071: ior
    //   1072: putfield p : I
    //   1075: iconst_1
    //   1076: ireturn
    //   1077: iconst_0
    //   1078: ireturn
    //   1079: aload_0
    //   1080: getfield e : [S
    //   1083: aload_0
    //   1084: getfield e : I
    //   1087: saload
    //   1088: istore_2
    //   1089: aload_0
    //   1090: dup
    //   1091: getfield e : I
    //   1094: iconst_1
    //   1095: iadd
    //   1096: putfield e : I
    //   1099: aload_0
    //   1100: getfield e : [S
    //   1103: aload_0
    //   1104: getfield e : I
    //   1107: saload
    //   1108: istore_3
    //   1109: aload_0
    //   1110: dup
    //   1111: getfield e : I
    //   1114: iconst_1
    //   1115: iadd
    //   1116: putfield e : I
    //   1119: aload_1
    //   1120: getfield ab : I
    //   1123: iload_2
    //   1124: isub
    //   1125: invokestatic abs : (I)I
    //   1128: iconst_4
    //   1129: if_icmpge -> 1147
    //   1132: aload_1
    //   1133: getfield ac : I
    //   1136: iload_3
    //   1137: isub
    //   1138: invokestatic abs : (I)I
    //   1141: iconst_4
    //   1142: if_icmpge -> 1147
    //   1145: iconst_1
    //   1146: ireturn
    //   1147: iconst_0
    //   1148: ireturn
    //   1149: aload_0
    //   1150: getfield e : [S
    //   1153: aload_0
    //   1154: getfield e : I
    //   1157: saload
    //   1158: istore_2
    //   1159: aload_0
    //   1160: dup
    //   1161: getfield e : I
    //   1164: iconst_1
    //   1165: iadd
    //   1166: putfield e : I
    //   1169: iload_2
    //   1170: ifne -> 1184
    //   1173: aload_1
    //   1174: invokevirtual d : ()Z
    //   1177: ifne -> 1182
    //   1180: iconst_1
    //   1181: ireturn
    //   1182: iconst_0
    //   1183: ireturn
    //   1184: aload_1
    //   1185: invokevirtual d : ()Z
    //   1188: ireturn
    //   1189: aload_0
    //   1190: getfield e : [S
    //   1193: aload_0
    //   1194: getfield e : I
    //   1197: saload
    //   1198: istore_2
    //   1199: aload_0
    //   1200: dup
    //   1201: getfield e : I
    //   1204: iconst_1
    //   1205: iadd
    //   1206: putfield e : I
    //   1209: aload_1
    //   1210: iload_2
    //   1211: invokevirtual d : (I)Z
    //   1214: ireturn
    //   1215: iconst_0
    //   1216: ireturn
  }
  
  public final boolean e(x paramx) {
    int i;
    z z;
    int j;
    boolean bool = paramx.q;
    switch (this.d[bool]) {
      case 6:
        return (paramx.t == 0) ? paramx.a() : ((aq.c - paramx.e >= paramx.t));
      case 0:
        i = ((p)ba.d).ab;
        j = ((p)ba.d).ac;
        return (ba.d.d(paramx, paramx.ab >> 4, paramx.ac >> 4, i >> 4, j >> 4, ((as)paramx.d).c) != paramx.b) ? true : paramx.a();
      case 1:
        return (paramx.b == 3 && paramx.a());
      case 8:
        return (aq.c - paramx.e >= paramx.t);
      case 9:
      case 10:
      case 11:
      case 12:
      case 14:
      case 29:
        return true;
      case 18:
      case 19:
        return paramx.a();
      case 20:
        return true;
      case 21:
        i = paramx.u >> 16 & 0xFFFF;
        j = paramx.u & 0xFFFF;
        return (i == paramx.ab && j == paramx.ac);
      case 22:
        if (paramx.t > 0)
          return (aq.c - paramx.e >= paramx.t); 
        z = (z)this.d[i];
        return (paramx.ab == z.e && paramx.ac == z.c);
      case 23:
        return true;
      case 24:
        return true;
      case 25:
        if (paramx.c == null)
          return true; 
        if (paramx.c.e()) {
          paramx.c = null;
          return true;
        } 
        return false;
      case 26:
        return true;
      case 27:
        return (paramx.v < 0);
      case 28:
        return paramx.j;
    } 
    return false;
  }
  
  public final void d(x paramx) {
    boolean bool = paramx.q;
    switch (this.d[bool]) {
      case 6:
        paramx.t = 0;
        paramx.r = 0;
        if (paramx.d(1)) {
          paramx.d = 2;
          paramx.z();
          paramx.f();
        } 
        return;
      case 0:
      case 18:
      case 19:
      case 21:
      case 22:
        paramx.d = 2;
        paramx.z();
        return;
      case 1:
        paramx.b = paramx.r;
        paramx.z();
        return;
      case 24:
        return;
      case 25:
        paramx.c = null;
        return;
    } 
  }
  
  public final void e(x paramx) {
    int i;
    z z;
    x x1;
    Hashtable hashtable;
    int j;
    boolean bool = paramx.q;
    switch (this.d[bool]) {
      case 1:
        if (aq.c - paramx.e < paramx.t)
          return; 
        paramx.b++;
        paramx.z();
        return;
      case 21:
        i = paramx.u >> 16 & 0xFFFF;
        j = paramx.u & 0xFFFF;
        paramx.a(i, j);
        return;
      case 22:
        z = (z)this.d[i];
        if (paramx.t == 0) {
          paramx.a(z.e, z.c);
          return;
        } 
        paramx.a(z.e, z.c);
        return;
      case 24:
        return;
      case 26:
        return;
      case 27:
        return;
      case 28:
        if ((x1 = l.d().d((String)paramx.e)) == null)
          hashtable = ba.d; 
        if (paramx.b != ((e)hashtable).b) {
          paramx.b = ((e)hashtable).b;
          paramx.h();
        } 
        paramx.b(((e)hashtable).ab, ((e)hashtable).ac);
        paramx.j--;
        return;
    } 
  }
  
  private static void d(x paramx, int paramInt) {
    int i = ((p)ba.d).ab;
    int j = ((p)ba.d).ac;
    int k = i >> 4;
    int m = j >> 4;
    if (paramInt == 0) {
      paramx.f = i;
      paramx.i = (m - 1 << 4) + 8;
      paramx.b = true;
    } 
    if (paramInt == 1) {
      paramx.f = i;
      paramx.i = (m + 1 << 4) + 8;
      paramx.b = false;
    } 
    if (paramInt == 2) {
      paramx.f = (k - 1 << 4) + 8;
      paramx.i = j;
      paramx.b = 3;
    } 
    if (paramInt == 3) {
      paramx.f = (k + 1 << 4) + 8;
      paramx.i = j;
      paramx.b = 2;
    } 
  }
  
  public final void c(x paramx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : [S
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_1
    //   9: getfield q : I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield d : [S
    //   17: iload_2
    //   18: saload
    //   19: istore_3
    //   20: aload_1
    //   21: iload_3
    //   22: putfield s : I
    //   25: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   28: invokevirtual b : ()Z
    //   31: ifne -> 58
    //   34: iload_3
    //   35: bipush #6
    //   37: if_icmpeq -> 52
    //   40: iload_3
    //   41: bipush #11
    //   43: if_icmpeq -> 52
    //   46: iload_3
    //   47: bipush #12
    //   49: if_icmpne -> 58
    //   52: aload_1
    //   53: iconst_0
    //   54: putfield e : Z
    //   57: return
    //   58: iload_3
    //   59: tableswitch default -> 1993, 0 -> 384, 1 -> 401, 2 -> 1993, 3 -> 1993, 4 -> 1993, 5 -> 1993, 6 -> 192, 7 -> 1993, 8 -> 434, 9 -> 757, 10 -> 776, 11 -> 462, 12 -> 1057, 13 -> 1993, 14 -> 793, 15 -> 1993, 16 -> 1993, 17 -> 1993, 18 -> 1447, 19 -> 1563, 20 -> 1568, 21 -> 1580, 22 -> 1603, 23 -> 1674, 24 -> 1721, 25 -> 1744, 26 -> 1781, 27 -> 1798, 28 -> 1920, 29 -> 1974
    //   192: aload_0
    //   193: getfield d : [Ljava/lang/Object;
    //   196: iload_2
    //   197: aaload
    //   198: checkcast com/fs/arpg/aj
    //   201: astore_2
    //   202: aload_1
    //   203: getfield ab : I
    //   206: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   209: getfield ab : I
    //   212: isub
    //   213: istore_3
    //   214: aload_1
    //   215: getfield ac : I
    //   218: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   221: getfield ac : I
    //   224: isub
    //   225: istore #4
    //   227: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   230: invokevirtual d : ()Z
    //   233: ifeq -> 274
    //   236: aload_1
    //   237: invokevirtual d : ()Z
    //   240: ifne -> 274
    //   243: aload_1
    //   244: getfield ab : I
    //   247: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   250: getfield d : Lcom/fs/arpg/e;
    //   253: getfield ab : I
    //   256: isub
    //   257: istore_3
    //   258: aload_1
    //   259: getfield ac : I
    //   262: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   265: getfield d : Lcom/fs/arpg/e;
    //   268: getfield ac : I
    //   271: isub
    //   272: istore #4
    //   274: iload_3
    //   275: invokestatic abs : (I)I
    //   278: iload #4
    //   280: invokestatic abs : (I)I
    //   283: if_icmpge -> 303
    //   286: aload_1
    //   287: iload #4
    //   289: ifle -> 296
    //   292: iconst_0
    //   293: goto -> 297
    //   296: iconst_1
    //   297: putfield b : I
    //   300: goto -> 316
    //   303: aload_1
    //   304: iload_3
    //   305: ifle -> 312
    //   308: iconst_2
    //   309: goto -> 313
    //   312: iconst_3
    //   313: putfield b : I
    //   316: aload_1
    //   317: iconst_0
    //   318: putfield d : I
    //   321: aload_1
    //   322: aload_2
    //   323: getfield d : Lcom/fs/arpg/aa;
    //   326: putfield d : Lcom/fs/arpg/aa;
    //   329: aload_1
    //   330: aload_2
    //   331: getfield d : Lcom/fs/arpg/ao;
    //   334: putfield e : Lcom/fs/arpg/ao;
    //   337: aload_1
    //   338: aload_2
    //   339: getfield d : Z
    //   342: invokevirtual c : (Z)V
    //   345: aload_1
    //   346: iconst_1
    //   347: invokevirtual e : (Z)V
    //   350: aload_1
    //   351: dup
    //   352: astore_3
    //   353: getfield d : Lcom/fs/arpg/aa;
    //   356: aload_3
    //   357: invokevirtual d : (Lcom/fs/arpg/e;)V
    //   360: aload_1
    //   361: invokevirtual v : ()V
    //   364: aload_1
    //   365: aload_2
    //   366: getfield d : I
    //   369: putfield r : I
    //   372: aload_1
    //   373: aload_2
    //   374: getfield e : I
    //   377: bipush #100
    //   379: idiv
    //   380: putfield t : I
    //   383: return
    //   384: aload_1
    //   385: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   388: getfield ab : I
    //   391: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   394: getfield ac : I
    //   397: invokevirtual c : (II)V
    //   400: return
    //   401: aload_1
    //   402: iconst_5
    //   403: bipush #20
    //   405: invokestatic d : (II)I
    //   408: putfield t : I
    //   411: aload_1
    //   412: aload_1
    //   413: getfield b : I
    //   416: putfield r : I
    //   419: aload_1
    //   420: iconst_0
    //   421: putfield b : I
    //   424: aload_1
    //   425: iconst_2
    //   426: putfield d : I
    //   429: aload_1
    //   430: invokevirtual z : ()V
    //   433: return
    //   434: aload_1
    //   435: getstatic com/fs/arpg/aq.c : I
    //   438: i2l
    //   439: putfield e : J
    //   442: aload_1
    //   443: aload_0
    //   444: getfield d : [Ljava/lang/Object;
    //   447: iload_2
    //   448: aaload
    //   449: checkcast java/lang/Integer
    //   452: invokevirtual intValue : ()I
    //   455: bipush #100
    //   457: idiv
    //   458: putfield t : I
    //   461: return
    //   462: aload_0
    //   463: getfield d : [Ljava/lang/Object;
    //   466: iload_2
    //   467: aaload
    //   468: checkcast com/fs/arpg/ay
    //   471: aconst_null
    //   472: astore_2
    //   473: dup
    //   474: astore_3
    //   475: getfield c : [S
    //   478: ifnull -> 756
    //   481: invokestatic d : ()Lcom/fs/arpg/l;
    //   484: astore_2
    //   485: iconst_0
    //   486: istore #4
    //   488: aload_3
    //   489: getfield c : [S
    //   492: arraylength
    //   493: istore #5
    //   495: iload #4
    //   497: iload #5
    //   499: if_icmpge -> 756
    //   502: new com/fs/arpg/s
    //   505: dup
    //   506: invokespecial <init> : ()V
    //   509: dup
    //   510: astore #6
    //   512: getstatic com/fs/arpg/aq.b : I
    //   515: i2l
    //   516: putfield e : J
    //   519: aload #6
    //   521: aload_2
    //   522: aload_3
    //   523: getfield c : [S
    //   526: iload #4
    //   528: saload
    //   529: invokevirtual d : (S)Lcom/fs/arpg/au;
    //   532: invokevirtual d : (Lcom/fs/arpg/au;)V
    //   535: aload #6
    //   537: aload_1
    //   538: getfield b : I
    //   541: invokevirtual d : (I)V
    //   544: aload #6
    //   546: aload_1
    //   547: invokevirtual d : (Lcom/fs/arpg/be;)V
    //   550: aload_1
    //   551: getfield b : I
    //   554: ifne -> 594
    //   557: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   560: aload #6
    //   562: aload #6
    //   564: getfield ab : I
    //   567: aload_3
    //   568: getfield e : [S
    //   571: iload #4
    //   573: saload
    //   574: iadd
    //   575: aload #6
    //   577: getfield ac : I
    //   580: aload_3
    //   581: getfield d : [S
    //   584: iload #4
    //   586: saload
    //   587: isub
    //   588: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   591: goto -> 718
    //   594: aload_1
    //   595: getfield b : I
    //   598: iconst_1
    //   599: if_icmpne -> 639
    //   602: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   605: aload #6
    //   607: aload #6
    //   609: getfield ab : I
    //   612: aload_3
    //   613: getfield e : [S
    //   616: iload #4
    //   618: saload
    //   619: iadd
    //   620: aload #6
    //   622: getfield ac : I
    //   625: aload_3
    //   626: getfield d : [S
    //   629: iload #4
    //   631: saload
    //   632: iadd
    //   633: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   636: goto -> 718
    //   639: aload_1
    //   640: getfield b : I
    //   643: iconst_2
    //   644: if_icmpne -> 684
    //   647: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   650: aload #6
    //   652: aload #6
    //   654: getfield ab : I
    //   657: aload_3
    //   658: getfield d : [S
    //   661: iload #4
    //   663: saload
    //   664: isub
    //   665: aload #6
    //   667: getfield ac : I
    //   670: aload_3
    //   671: getfield e : [S
    //   674: iload #4
    //   676: saload
    //   677: iadd
    //   678: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   681: goto -> 718
    //   684: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   687: aload #6
    //   689: aload #6
    //   691: getfield ab : I
    //   694: aload_3
    //   695: getfield d : [S
    //   698: iload #4
    //   700: saload
    //   701: iadd
    //   702: aload #6
    //   704: getfield ac : I
    //   707: aload_3
    //   708: getfield e : [S
    //   711: iload #4
    //   713: saload
    //   714: iadd
    //   715: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   718: aload #6
    //   720: aload_1
    //   721: getfield h : I
    //   724: aload #6
    //   726: getfield d : Lcom/fs/arpg/au;
    //   729: getfield c : I
    //   732: imul
    //   733: bipush #100
    //   735: idiv
    //   736: putfield h : I
    //   739: aload #6
    //   741: invokevirtual f : ()V
    //   744: aload_2
    //   745: aload #6
    //   747: invokevirtual d : (Lcom/fs/arpg/s;)V
    //   750: iinc #4, 1
    //   753: goto -> 495
    //   756: return
    //   757: aload_0
    //   758: getfield d : [Ljava/lang/Object;
    //   761: iload_2
    //   762: aaload
    //   763: checkcast java/lang/Boolean
    //   766: invokevirtual booleanValue : ()Z
    //   769: istore_2
    //   770: aload_1
    //   771: iload_2
    //   772: putfield f : Z
    //   775: return
    //   776: aload_1
    //   777: aload_0
    //   778: getfield d : [Ljava/lang/Object;
    //   781: iload_2
    //   782: aaload
    //   783: checkcast java/lang/Boolean
    //   786: invokevirtual booleanValue : ()Z
    //   789: putfield n : Z
    //   792: return
    //   793: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   796: getfield ab : I
    //   799: istore_2
    //   800: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   803: getfield ac : I
    //   806: istore_3
    //   807: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   810: getfield b : I
    //   813: istore #4
    //   815: iload_2
    //   816: iconst_4
    //   817: ishr
    //   818: istore_2
    //   819: iload_3
    //   820: iconst_4
    //   821: ishr
    //   822: istore_3
    //   823: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   826: iload_2
    //   827: iload_3
    //   828: iconst_1
    //   829: isub
    //   830: invokevirtual d : (II)Z
    //   833: istore #5
    //   835: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   838: iload_2
    //   839: iload_3
    //   840: iconst_1
    //   841: iadd
    //   842: invokevirtual d : (II)Z
    //   845: istore #6
    //   847: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   850: iload_2
    //   851: iconst_1
    //   852: isub
    //   853: iload_3
    //   854: invokevirtual d : (II)Z
    //   857: istore #7
    //   859: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   862: iload_2
    //   863: iconst_1
    //   864: iadd
    //   865: iload_3
    //   866: invokevirtual d : (II)Z
    //   869: istore_2
    //   870: iload #5
    //   872: ifne -> 890
    //   875: iload #6
    //   877: ifne -> 890
    //   880: iload #7
    //   882: ifne -> 890
    //   885: iload_2
    //   886: ifne -> 890
    //   889: return
    //   890: aload_1
    //   891: bipush #10
    //   893: putfield b : I
    //   896: iload #4
    //   898: ifne -> 919
    //   901: iload #5
    //   903: ifeq -> 919
    //   906: aload_1
    //   907: iconst_1
    //   908: putfield b : I
    //   911: aload_1
    //   912: iconst_0
    //   913: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   916: goto -> 987
    //   919: iload #4
    //   921: iconst_1
    //   922: if_icmpne -> 943
    //   925: iload #6
    //   927: ifeq -> 943
    //   930: aload_1
    //   931: iconst_0
    //   932: putfield b : I
    //   935: aload_1
    //   936: iconst_1
    //   937: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   940: goto -> 987
    //   943: iload #4
    //   945: iconst_2
    //   946: if_icmpne -> 967
    //   949: iload #7
    //   951: ifeq -> 967
    //   954: aload_1
    //   955: iconst_3
    //   956: putfield b : I
    //   959: aload_1
    //   960: iconst_2
    //   961: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   964: goto -> 987
    //   967: iload #4
    //   969: iconst_3
    //   970: if_icmpne -> 987
    //   973: iload_2
    //   974: ifeq -> 987
    //   977: aload_1
    //   978: iconst_2
    //   979: putfield b : I
    //   982: aload_1
    //   983: iconst_3
    //   984: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   987: aload_1
    //   988: getfield b : I
    //   991: bipush #10
    //   993: if_icmpne -> 1044
    //   996: aload_1
    //   997: iconst_0
    //   998: iconst_3
    //   999: invokestatic d : (II)I
    //   1002: putfield b : I
    //   1005: iload #5
    //   1007: ifeq -> 1015
    //   1010: aload_1
    //   1011: iconst_0
    //   1012: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   1015: iload #6
    //   1017: ifeq -> 1025
    //   1020: aload_1
    //   1021: iconst_1
    //   1022: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   1025: iload #7
    //   1027: ifeq -> 1035
    //   1030: aload_1
    //   1031: iconst_2
    //   1032: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   1035: iload_2
    //   1036: ifeq -> 1044
    //   1039: aload_1
    //   1040: iconst_3
    //   1041: invokestatic d : (Lcom/fs/arpg/x;I)V
    //   1044: aload_1
    //   1045: aload_1
    //   1046: getfield f : I
    //   1049: aload_1
    //   1050: getfield i : I
    //   1053: invokevirtual b : (II)V
    //   1056: return
    //   1057: aload_0
    //   1058: getfield d : [Ljava/lang/Object;
    //   1061: iload_2
    //   1062: aaload
    //   1063: checkcast com/fs/arpg/y
    //   1066: aconst_null
    //   1067: astore_2
    //   1068: astore_3
    //   1069: invokestatic d : ()Lcom/fs/arpg/l;
    //   1072: astore #4
    //   1074: iconst_0
    //   1075: istore #5
    //   1077: aload_3
    //   1078: getfield d : [S
    //   1081: arraylength
    //   1082: istore #6
    //   1084: iload #5
    //   1086: iload #6
    //   1088: if_icmpge -> 1446
    //   1091: new com/fs/arpg/x
    //   1094: dup
    //   1095: invokespecial <init> : ()V
    //   1098: dup
    //   1099: astore_2
    //   1100: iconst_1
    //   1101: putfield k : Z
    //   1104: aload_2
    //   1105: aload #4
    //   1107: aload_3
    //   1108: getfield d : [S
    //   1111: iload #5
    //   1113: saload
    //   1114: invokevirtual d : (S)Lcom/fs/arpg/as;
    //   1117: putfield d : Lcom/fs/arpg/as;
    //   1120: aload_2
    //   1121: iconst_2
    //   1122: putfield d : I
    //   1125: aload_2
    //   1126: invokevirtual z : ()V
    //   1129: aload_2
    //   1130: aload_1
    //   1131: getfield m : I
    //   1134: putfield m : I
    //   1137: aload_2
    //   1138: invokevirtual k : ()V
    //   1141: aload_2
    //   1142: aload_1
    //   1143: getfield b : I
    //   1146: putfield b : I
    //   1149: aload_2
    //   1150: aload_1
    //   1151: getfield ab : I
    //   1154: putfield ab : I
    //   1157: aload_2
    //   1158: aload_1
    //   1159: getfield ac : I
    //   1162: putfield ac : I
    //   1165: aload_2
    //   1166: new java/lang/StringBuffer
    //   1169: dup
    //   1170: invokespecial <init> : ()V
    //   1173: iconst_0
    //   1174: ldc 1000000
    //   1176: invokestatic d : (II)I
    //   1179: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1182: ldc 'Phân thân'
    //   1184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1187: iload #5
    //   1189: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1192: invokevirtual toString : ()Ljava/lang/String;
    //   1195: putfield d : Ljava/lang/String;
    //   1198: aload_3
    //   1199: getfield e : [S
    //   1202: iload #5
    //   1204: saload
    //   1205: sipush #-1000
    //   1208: if_icmpgt -> 1271
    //   1211: aload_3
    //   1212: getfield c : [S
    //   1215: iload #5
    //   1217: saload
    //   1218: sipush #-1000
    //   1221: if_icmpgt -> 1271
    //   1224: aload_2
    //   1225: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1228: getfield ab : I
    //   1231: aload_3
    //   1232: getfield e : [S
    //   1235: iload #5
    //   1237: saload
    //   1238: iadd
    //   1239: sipush #1000
    //   1242: iadd
    //   1243: putfield ab : I
    //   1246: aload_2
    //   1247: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1250: getfield ac : I
    //   1253: aload_3
    //   1254: getfield c : [S
    //   1257: iload #5
    //   1259: saload
    //   1260: iadd
    //   1261: sipush #1000
    //   1264: iadd
    //   1265: putfield ac : I
    //   1268: goto -> 1391
    //   1271: aload_2
    //   1272: aload_1
    //   1273: getfield ac : I
    //   1276: aload_3
    //   1277: getfield c : [S
    //   1280: iload #5
    //   1282: saload
    //   1283: isub
    //   1284: putfield ac : I
    //   1287: aload_1
    //   1288: getfield b : I
    //   1291: ifne -> 1313
    //   1294: aload_2
    //   1295: aload_1
    //   1296: getfield ac : I
    //   1299: aload_3
    //   1300: getfield e : [S
    //   1303: iload #5
    //   1305: saload
    //   1306: isub
    //   1307: putfield ac : I
    //   1310: goto -> 1391
    //   1313: aload_1
    //   1314: getfield b : I
    //   1317: iconst_1
    //   1318: if_icmpne -> 1340
    //   1321: aload_2
    //   1322: aload_1
    //   1323: getfield ac : I
    //   1326: aload_3
    //   1327: getfield e : [S
    //   1330: iload #5
    //   1332: saload
    //   1333: iadd
    //   1334: putfield ac : I
    //   1337: goto -> 1391
    //   1340: aload_1
    //   1341: getfield b : I
    //   1344: iconst_2
    //   1345: if_icmpne -> 1367
    //   1348: aload_2
    //   1349: aload_1
    //   1350: getfield ab : I
    //   1353: aload_3
    //   1354: getfield e : [S
    //   1357: iload #5
    //   1359: saload
    //   1360: isub
    //   1361: putfield ab : I
    //   1364: goto -> 1391
    //   1367: aload_1
    //   1368: getfield b : I
    //   1371: iconst_3
    //   1372: if_icmpne -> 1391
    //   1375: aload_2
    //   1376: aload_1
    //   1377: getfield ab : I
    //   1380: aload_3
    //   1381: getfield e : [S
    //   1384: iload #5
    //   1386: saload
    //   1387: iadd
    //   1388: putfield ab : I
    //   1391: aload_2
    //   1392: iconst_0
    //   1393: invokevirtual b : (Z)V
    //   1396: aload_2
    //   1397: aload_2
    //   1398: getfield d : Lcom/fs/arpg/as;
    //   1401: getfield b : Z
    //   1404: putfield l : Z
    //   1407: aload #4
    //   1409: aload_2
    //   1410: invokevirtual e : (Lcom/fs/arpg/x;)V
    //   1413: aload_2
    //   1414: getfield d : Lcom/fs/arpg/as;
    //   1417: getfield a : Z
    //   1420: ifeq -> 1433
    //   1423: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   1426: aload_2
    //   1427: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   1430: goto -> 1440
    //   1433: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1436: aload_2
    //   1437: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   1440: iinc #5, 1
    //   1443: goto -> 1084
    //   1446: return
    //   1447: iconst_2
    //   1448: istore_2
    //   1449: aload_1
    //   1450: getfield ab : I
    //   1453: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1456: getfield ab : I
    //   1459: if_icmplt -> 1464
    //   1462: iconst_3
    //   1463: istore_2
    //   1464: iconst_0
    //   1465: istore_3
    //   1466: aload_1
    //   1467: getfield ac : I
    //   1470: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1473: getfield ac : I
    //   1476: if_icmplt -> 1481
    //   1479: iconst_1
    //   1480: istore_3
    //   1481: aload_1
    //   1482: getfield ab : I
    //   1485: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1488: getfield ab : I
    //   1491: isub
    //   1492: invokestatic abs : (I)I
    //   1495: istore #4
    //   1497: aload_1
    //   1498: getfield ac : I
    //   1501: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1504: getfield ac : I
    //   1507: isub
    //   1508: invokestatic abs : (I)I
    //   1511: istore #5
    //   1513: iload_2
    //   1514: istore #6
    //   1516: iload #4
    //   1518: iload #5
    //   1520: if_icmpge -> 1526
    //   1523: iload_3
    //   1524: istore #6
    //   1526: aload_1
    //   1527: getfield b : I
    //   1530: dup
    //   1531: istore #4
    //   1533: iload_2
    //   1534: if_icmpeq -> 1547
    //   1537: iload #4
    //   1539: iload_3
    //   1540: if_icmpeq -> 1547
    //   1543: iload #6
    //   1545: istore #4
    //   1547: aload_1
    //   1548: iload #4
    //   1550: putfield b : I
    //   1553: aload_1
    //   1554: iconst_1
    //   1555: putfield d : I
    //   1558: aload_1
    //   1559: invokevirtual z : ()V
    //   1562: return
    //   1563: aload_1
    //   1564: invokevirtual j : ()V
    //   1567: return
    //   1568: invokestatic d : ()Lcom/fs/arpg/l;
    //   1571: aload_1
    //   1572: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   1575: aload_1
    //   1576: invokevirtual i : ()V
    //   1579: return
    //   1580: aload_1
    //   1581: aload_1
    //   1582: getfield u : I
    //   1585: bipush #16
    //   1587: ishr
    //   1588: sipush #255
    //   1591: iand
    //   1592: aload_1
    //   1593: getfield u : I
    //   1596: ldc 65535
    //   1598: iand
    //   1599: invokevirtual c : (II)V
    //   1602: return
    //   1603: aload_0
    //   1604: getfield d : [Ljava/lang/Object;
    //   1607: iload_2
    //   1608: aaload
    //   1609: checkcast com/fs/arpg/z
    //   1612: astore_2
    //   1613: aload_1
    //   1614: aload_2
    //   1615: getfield d : I
    //   1618: bipush #100
    //   1620: idiv
    //   1621: putfield t : I
    //   1624: aload_2
    //   1625: getfield d : Z
    //   1628: ifeq -> 1661
    //   1631: aload_2
    //   1632: getfield d : I
    //   1635: ifeq -> 1661
    //   1638: aload_2
    //   1639: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1642: getfield ab : I
    //   1645: putfield e : I
    //   1648: aload_2
    //   1649: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1652: getfield ac : I
    //   1655: bipush #60
    //   1657: isub
    //   1658: putfield c : I
    //   1661: aload_1
    //   1662: aload_2
    //   1663: getfield e : I
    //   1666: aload_2
    //   1667: getfield c : I
    //   1670: invokevirtual c : (II)V
    //   1673: return
    //   1674: aload_0
    //   1675: getfield d : [Ljava/lang/Object;
    //   1678: iload_2
    //   1679: aaload
    //   1680: checkcast java/lang/Integer
    //   1683: invokevirtual intValue : ()I
    //   1686: dup
    //   1687: istore_3
    //   1688: ifne -> 1708
    //   1691: aload_1
    //   1692: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1695: getfield ab : I
    //   1698: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1701: getfield ac : I
    //   1704: invokevirtual e : (II)V
    //   1707: return
    //   1708: aload_1
    //   1709: iload_3
    //   1710: bipush #16
    //   1712: ishr
    //   1713: iload_3
    //   1714: ldc 65535
    //   1716: iand
    //   1717: invokevirtual e : (II)V
    //   1720: return
    //   1721: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1724: aload_0
    //   1725: getfield d : [Ljava/lang/Object;
    //   1728: iload_2
    //   1729: aaload
    //   1730: checkcast com/fs/arpg/ap
    //   1733: putfield d : Lcom/fs/arpg/ap;
    //   1736: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1739: iconst_0
    //   1740: putfield b : I
    //   1743: return
    //   1744: aload_1
    //   1745: iconst_2
    //   1746: putfield d : I
    //   1749: aload_1
    //   1750: invokevirtual z : ()V
    //   1753: aload_1
    //   1754: aload_0
    //   1755: getfield d : [Ljava/lang/Object;
    //   1758: iload_2
    //   1759: aaload
    //   1760: checkcast com/fs/arpg/m
    //   1763: putfield c : Lcom/fs/arpg/m;
    //   1766: aload_1
    //   1767: getfield c : Lcom/fs/arpg/m;
    //   1770: invokevirtual e : ()V
    //   1773: aload_1
    //   1774: getfield c : Lcom/fs/arpg/m;
    //   1777: putstatic com/fs/arpg/ba.d : Lcom/fs/arpg/m;
    //   1780: return
    //   1781: aload_1
    //   1782: aload_0
    //   1783: getfield d : [Ljava/lang/Object;
    //   1786: iload_2
    //   1787: aaload
    //   1788: checkcast java/lang/Boolean
    //   1791: invokevirtual booleanValue : ()Z
    //   1794: putfield p : Z
    //   1797: return
    //   1798: aload_0
    //   1799: getfield d : [Ljava/lang/Object;
    //   1802: iload_2
    //   1803: aaload
    //   1804: checkcast java/lang/Integer
    //   1807: invokevirtual intValue : ()I
    //   1810: dup
    //   1811: istore #4
    //   1813: bipush #16
    //   1815: ishr
    //   1816: ldc 65535
    //   1818: iand
    //   1819: dup
    //   1820: istore #5
    //   1822: ifne -> 1831
    //   1825: aload_1
    //   1826: aconst_null
    //   1827: putfield d : Lcom/fs/arpg/be;
    //   1830: return
    //   1831: iload #4
    //   1833: bipush #8
    //   1835: ishr
    //   1836: sipush #255
    //   1839: iand
    //   1840: istore #6
    //   1842: iload #4
    //   1844: sipush #255
    //   1847: iand
    //   1848: istore #4
    //   1850: aload_1
    //   1851: new com/fs/arpg/be
    //   1854: dup
    //   1855: invokespecial <init> : ()V
    //   1858: putfield d : Lcom/fs/arpg/be;
    //   1861: invokestatic d : ()Lcom/fs/arpg/v;
    //   1864: iload #5
    //   1866: i2s
    //   1867: aload_1
    //   1868: getfield d : Lcom/fs/arpg/be;
    //   1871: invokevirtual d : (SLcom/fs/arpg/be;)V
    //   1874: aload_1
    //   1875: getfield d : Lcom/fs/arpg/be;
    //   1878: iload #6
    //   1880: i2s
    //   1881: putfield c : S
    //   1884: aload_1
    //   1885: getfield d : Lcom/fs/arpg/be;
    //   1888: aload_1
    //   1889: getfield ab : I
    //   1892: putfield ab : I
    //   1895: aload_1
    //   1896: getfield d : Lcom/fs/arpg/be;
    //   1899: aload_1
    //   1900: getfield ac : I
    //   1903: putfield ac : I
    //   1906: aload_1
    //   1907: getfield d : Lcom/fs/arpg/be;
    //   1910: invokevirtual v : ()V
    //   1913: aload_1
    //   1914: iload #4
    //   1916: putfield v : I
    //   1919: return
    //   1920: aload_0
    //   1921: getfield d : [Ljava/lang/Object;
    //   1924: iload_2
    //   1925: aaload
    //   1926: checkcast java/lang/String
    //   1929: astore_2
    //   1930: aload_1
    //   1931: aload_2
    //   1932: iconst_0
    //   1933: aload_2
    //   1934: ldc '|'
    //   1936: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1939: invokevirtual substring : (II)Ljava/lang/String;
    //   1942: putfield e : Ljava/lang/String;
    //   1945: aload_1
    //   1946: aload_2
    //   1947: aload_2
    //   1948: ldc '|'
    //   1950: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1953: iconst_1
    //   1954: iadd
    //   1955: invokevirtual substring : (I)Ljava/lang/String;
    //   1958: invokestatic parseInt : (Ljava/lang/String;)I
    //   1961: putfield j : I
    //   1964: aload_1
    //   1965: iconst_2
    //   1966: putfield d : I
    //   1969: aload_1
    //   1970: invokevirtual z : ()V
    //   1973: return
    //   1974: aload_0
    //   1975: getfield d : [Ljava/lang/Object;
    //   1978: iload_2
    //   1979: aaload
    //   1980: checkcast java/lang/Integer
    //   1983: invokevirtual intValue : ()I
    //   1986: istore_2
    //   1987: aload_1
    //   1988: iload_2
    //   1989: invokevirtual e : (I)V
    //   1992: return
    //   1993: return
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\aw.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */