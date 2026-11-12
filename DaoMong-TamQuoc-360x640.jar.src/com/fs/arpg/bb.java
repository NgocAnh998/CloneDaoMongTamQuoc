package com.fs.arpg;

import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;

public final class bb {
  private static byte[][] d;
  
  private static int[] d;
  
  private static int[] e;
  
  private static Hashtable d;
  
  private static boolean d;
  
  private static byte d;
  
  public static int d;
  
  static {
    // Byte code:
    //   0: getstatic com/fs/arpg/bb.d : [[B
    //   3: ifnonnull -> 242
    //   6: new java/util/Hashtable
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: putstatic com/fs/arpg/bb.d : Ljava/util/Hashtable;
    //   16: new java/io/DataInputStream
    //   19: dup
    //   20: ldc ''
    //   22: invokevirtual getClass : ()Ljava/lang/Class;
    //   25: ldc '/font.bin'
    //   27: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   30: invokespecial <init> : (Ljava/io/InputStream;)V
    //   33: astore_0
    //   34: aload_0
    //   35: invokevirtual readUTF : ()Ljava/lang/String;
    //   38: astore_1
    //   39: aload_0
    //   40: invokevirtual readByte : ()B
    //   43: dup
    //   44: putstatic com/fs/arpg/bb.d : B
    //   47: istore_2
    //   48: aload_1
    //   49: invokevirtual length : ()I
    //   52: dup
    //   53: istore_3
    //   54: newarray int
    //   56: putstatic com/fs/arpg/bb.d : [I
    //   59: iload_3
    //   60: newarray int
    //   62: putstatic com/fs/arpg/bb.e : [I
    //   65: iconst_0
    //   66: istore #4
    //   68: iconst_0
    //   69: istore #5
    //   71: goto -> 135
    //   74: getstatic com/fs/arpg/bb.d : [I
    //   77: iload #5
    //   79: aload_0
    //   80: invokevirtual readByte : ()B
    //   83: iastore
    //   84: getstatic com/fs/arpg/bb.e : [I
    //   87: iload #5
    //   89: iload #4
    //   91: iastore
    //   92: iload #4
    //   94: getstatic com/fs/arpg/bb.d : [I
    //   97: iload #5
    //   99: iaload
    //   100: iadd
    //   101: istore #4
    //   103: getstatic com/fs/arpg/bb.d : Ljava/util/Hashtable;
    //   106: new java/lang/Integer
    //   109: dup
    //   110: aload_1
    //   111: iload #5
    //   113: invokevirtual charAt : (I)C
    //   116: invokespecial <init> : (I)V
    //   119: new java/lang/Integer
    //   122: dup
    //   123: iload #5
    //   125: invokespecial <init> : (I)V
    //   128: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: iinc #5, 1
    //   135: iload #5
    //   137: iload_3
    //   138: if_icmplt -> 74
    //   141: iload_2
    //   142: iload #4
    //   144: multianewarray[[B 2
    //   148: putstatic com/fs/arpg/bb.d : [[B
    //   151: bipush #7
    //   153: istore #5
    //   155: iconst_0
    //   156: istore_1
    //   157: iconst_0
    //   158: istore_3
    //   159: goto -> 219
    //   162: iconst_0
    //   163: istore #6
    //   165: goto -> 209
    //   168: iinc #5, 1
    //   171: iload #5
    //   173: bipush #8
    //   175: if_icmplt -> 186
    //   178: iconst_0
    //   179: istore #5
    //   181: aload_0
    //   182: invokevirtual readByte : ()B
    //   185: istore_1
    //   186: iload_1
    //   187: iconst_1
    //   188: iand
    //   189: ifeq -> 201
    //   192: getstatic com/fs/arpg/bb.d : [[B
    //   195: iload_3
    //   196: aaload
    //   197: iload #6
    //   199: iconst_1
    //   200: bastore
    //   201: iload_1
    //   202: iconst_1
    //   203: ishr
    //   204: i2b
    //   205: istore_1
    //   206: iinc #6, 1
    //   209: iload #6
    //   211: iload #4
    //   213: if_icmplt -> 168
    //   216: iinc #3, 1
    //   219: iload_3
    //   220: iload_2
    //   221: if_icmplt -> 162
    //   224: aload_0
    //   225: invokevirtual close : ()V
    //   228: ldc 'nhung'
    //   230: invokestatic d : (Ljava/lang/String;)S
    //   233: putstatic com/fs/arpg/bb.d : I
    //   236: return
    //   237: dup
    //   238: astore_1
    //   239: invokevirtual printStackTrace : ()V
    //   242: return
    // Exception table:
    //   from	to	target	type
    //   34	236	237	java/lang/Exception
  }
  
  public static short d(String paramString) {
    int i = 0;
    int j = paramString.length();
    for (byte b = 0; b < j; b++) {
      Integer integer = new Integer(paramString.charAt(b));
      try {
        i += d[((Integer)d.get(integer)).intValue()];
      } catch (Exception exception) {}
    } 
    return (short)i;
  }
  
  public static int d(char paramChar) {
    try {
      return d[((Integer)d.get(new Integer(paramChar))).intValue()];
    } catch (Exception exception) {
      return 0;
    } 
  }
  
  private static void d(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte paramByte) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic d : (Ljava/lang/String;)S
    //   4: istore #8
    //   6: iload_2
    //   7: iload #4
    //   9: iload #8
    //   11: istore #9
    //   13: dup
    //   14: istore #8
    //   16: iconst_1
    //   17: iand
    //   18: ifeq -> 28
    //   21: iload #9
    //   23: iconst_1
    //   24: ishr
    //   25: goto -> 42
    //   28: iload #8
    //   30: bipush #8
    //   32: iand
    //   33: ifeq -> 41
    //   36: iload #9
    //   38: goto -> 42
    //   41: iconst_0
    //   42: isub
    //   43: istore_2
    //   44: iload_3
    //   45: iload #4
    //   47: getstatic com/fs/arpg/bb.d : B
    //   50: istore #9
    //   52: dup
    //   53: istore #8
    //   55: iconst_2
    //   56: iand
    //   57: ifeq -> 67
    //   60: iload #9
    //   62: iconst_1
    //   63: ishr
    //   64: goto -> 96
    //   67: iload #8
    //   69: bipush #32
    //   71: iand
    //   72: ifeq -> 80
    //   75: iload #9
    //   77: goto -> 96
    //   80: iload #8
    //   82: bipush #64
    //   84: iand
    //   85: ifeq -> 95
    //   88: iload #9
    //   90: iconst_1
    //   91: ishr
    //   92: goto -> 96
    //   95: iconst_0
    //   96: isub
    //   97: istore_3
    //   98: iload #7
    //   100: tableswitch default -> 396, 0 -> 132, 1 -> 142, 2 -> 379, 3 -> 387
    //   132: aload_0
    //   133: aload_1
    //   134: iload_2
    //   135: iload_3
    //   136: iload #5
    //   138: invokestatic d : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   141: return
    //   142: aload_0
    //   143: aload_1
    //   144: iload_2
    //   145: iload_3
    //   146: iload #5
    //   148: iload #6
    //   150: istore_3
    //   151: istore_2
    //   152: istore_1
    //   153: istore_0
    //   154: astore #9
    //   156: astore #8
    //   158: iload_0
    //   159: istore_0
    //   160: aload #9
    //   162: invokevirtual length : ()I
    //   165: istore #4
    //   167: aload #8
    //   169: invokevirtual getColor : ()I
    //   172: istore #5
    //   174: iconst_0
    //   175: istore #6
    //   177: goto -> 364
    //   180: new java/lang/Integer
    //   183: dup
    //   184: aload #9
    //   186: iload #6
    //   188: invokevirtual charAt : (I)C
    //   191: invokespecial <init> : (I)V
    //   194: astore #7
    //   196: getstatic com/fs/arpg/bb.d : Ljava/util/Hashtable;
    //   199: aload #7
    //   201: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   204: checkcast java/lang/Integer
    //   207: invokevirtual intValue : ()I
    //   210: istore #7
    //   212: getstatic com/fs/arpg/bb.d : [I
    //   215: iload #7
    //   217: iaload
    //   218: istore #10
    //   220: getstatic com/fs/arpg/bb.e : [I
    //   223: iload #7
    //   225: iaload
    //   226: istore #7
    //   228: getstatic com/fs/arpg/bb.d : B
    //   231: istore #11
    //   233: iconst_0
    //   234: istore #12
    //   236: goto -> 331
    //   239: iconst_0
    //   240: istore #13
    //   242: goto -> 321
    //   245: getstatic com/fs/arpg/bb.d : [[B
    //   248: iload #12
    //   250: aaload
    //   251: iload #13
    //   253: iload #7
    //   255: iadd
    //   256: baload
    //   257: ifeq -> 318
    //   260: aload #8
    //   262: iload_2
    //   263: invokevirtual setColor : (I)V
    //   266: aload #8
    //   268: iload_0
    //   269: iload #13
    //   271: iadd
    //   272: iload_1
    //   273: iload #12
    //   275: iadd
    //   276: iload_0
    //   277: iload #13
    //   279: iadd
    //   280: iload_1
    //   281: iload #12
    //   283: iadd
    //   284: invokevirtual drawLine : (IIII)V
    //   287: aload #8
    //   289: iload_3
    //   290: invokevirtual setColor : (I)V
    //   293: aload #8
    //   295: iload_0
    //   296: iload #13
    //   298: iadd
    //   299: iconst_1
    //   300: iadd
    //   301: iload_1
    //   302: iload #12
    //   304: iadd
    //   305: iload_0
    //   306: iload #13
    //   308: iadd
    //   309: iload_1
    //   310: iload #12
    //   312: iadd
    //   313: iconst_1
    //   314: iadd
    //   315: invokevirtual drawLine : (IIII)V
    //   318: iinc #13, 1
    //   321: iload #13
    //   323: iload #10
    //   325: if_icmplt -> 245
    //   328: iinc #12, 1
    //   331: iload #12
    //   333: iload #11
    //   335: if_icmplt -> 239
    //   338: iload_0
    //   339: iload #10
    //   341: iadd
    //   342: istore_0
    //   343: goto -> 361
    //   346: astore #7
    //   348: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   351: aload #9
    //   353: invokevirtual println : (Ljava/lang/String;)V
    //   356: aload #7
    //   358: invokevirtual printStackTrace : ()V
    //   361: iinc #6, 1
    //   364: iload #6
    //   366: iload #4
    //   368: if_icmplt -> 180
    //   371: aload #8
    //   373: iload #5
    //   375: invokevirtual setColor : (I)V
    //   378: return
    //   379: aload_0
    //   380: aload_1
    //   381: iload_2
    //   382: iload_3
    //   383: invokestatic d : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;II)V
    //   386: return
    //   387: aload_0
    //   388: aload_1
    //   389: iload_2
    //   390: iload_3
    //   391: iload #5
    //   393: invokestatic d : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   396: return
    // Exception table:
    //   from	to	target	type
    //   196	343	346	java/lang/Exception
  }
  
  private static void d(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramGraphics.getColor();
    paramGraphics.setColor(paramInt3);
    d(paramGraphics, paramString, paramInt1, paramInt2);
    paramGraphics.setColor(i);
  }
  
  public static final int d(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/lang/Integer
    //   3: dup
    //   4: iload_1
    //   5: invokespecial <init> : (I)V
    //   8: astore #4
    //   10: getstatic com/fs/arpg/bb.d : Ljava/util/Hashtable;
    //   13: aload #4
    //   15: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   18: checkcast java/lang/Integer
    //   21: invokevirtual intValue : ()I
    //   24: istore #4
    //   26: getstatic com/fs/arpg/bb.d : [I
    //   29: iload #4
    //   31: iaload
    //   32: istore #5
    //   34: getstatic com/fs/arpg/bb.e : [I
    //   37: iload #4
    //   39: iaload
    //   40: istore #4
    //   42: getstatic com/fs/arpg/bb.d : B
    //   45: istore #6
    //   47: iconst_0
    //   48: istore #7
    //   50: goto -> 107
    //   53: iconst_0
    //   54: istore #8
    //   56: goto -> 97
    //   59: getstatic com/fs/arpg/bb.d : [[B
    //   62: iload #7
    //   64: aaload
    //   65: iload #8
    //   67: iload #4
    //   69: iadd
    //   70: baload
    //   71: ifeq -> 94
    //   74: aload_0
    //   75: iload_2
    //   76: iload #8
    //   78: iadd
    //   79: iload_3
    //   80: iload #7
    //   82: iadd
    //   83: iload_2
    //   84: iload #8
    //   86: iadd
    //   87: iload_3
    //   88: iload #7
    //   90: iadd
    //   91: invokevirtual drawLine : (IIII)V
    //   94: iinc #8, 1
    //   97: iload #8
    //   99: iload #5
    //   101: if_icmplt -> 59
    //   104: iinc #7, 1
    //   107: iload #7
    //   109: iload #6
    //   111: if_icmplt -> 53
    //   114: iload #5
    //   116: ireturn
    //   117: pop
    //   118: aconst_null
    //   119: astore #5
    //   121: iload_1
    //   122: sipush #26159
    //   125: if_icmpne -> 135
    //   128: ldc 'Có'
    //   130: astore #5
    //   132: goto -> 146
    //   135: iload_1
    //   136: sipush #21542
    //   139: if_icmpne -> 146
    //   142: ldc 'Không'
    //   144: astore #5
    //   146: aload #5
    //   148: ifnull -> 159
    //   151: aload_0
    //   152: aload #5
    //   154: iload_2
    //   155: iload_3
    //   156: invokestatic d : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;II)V
    //   159: iconst_0
    //   160: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	116	117	java/lang/Exception
  }
  
  private static void d(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2) {
    paramInt1 = paramInt1;
    int i = paramString.length();
    for (byte b = 0; b < i; b++)
      paramInt1 += d(paramGraphics, paramString.charAt(b), paramInt1, paramInt2); 
  }
  
  private static void d(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_2
    //   1: istore_2
    //   2: aload_1
    //   3: invokevirtual length : ()I
    //   6: istore #6
    //   8: aload_0
    //   9: invokevirtual getColor : ()I
    //   12: istore #7
    //   14: iconst_0
    //   15: istore #8
    //   17: goto -> 200
    //   20: new java/lang/Integer
    //   23: dup
    //   24: aload_1
    //   25: iload #8
    //   27: invokevirtual charAt : (I)C
    //   30: invokespecial <init> : (I)V
    //   33: astore #9
    //   35: getstatic com/fs/arpg/bb.d : Ljava/util/Hashtable;
    //   38: aload #9
    //   40: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   43: checkcast java/lang/Integer
    //   46: invokevirtual intValue : ()I
    //   49: istore #9
    //   51: getstatic com/fs/arpg/bb.d : [I
    //   54: iload #9
    //   56: iaload
    //   57: istore #10
    //   59: getstatic com/fs/arpg/bb.e : [I
    //   62: iload #9
    //   64: iaload
    //   65: istore #9
    //   67: getstatic com/fs/arpg/bb.d : B
    //   70: istore #11
    //   72: iconst_0
    //   73: istore #12
    //   75: goto -> 168
    //   78: iconst_0
    //   79: istore #13
    //   81: goto -> 158
    //   84: getstatic com/fs/arpg/bb.d : [[B
    //   87: iload #12
    //   89: aaload
    //   90: iload #13
    //   92: iload #9
    //   94: iadd
    //   95: baload
    //   96: ifeq -> 155
    //   99: aload_0
    //   100: iload #4
    //   102: invokevirtual setColor : (I)V
    //   105: aload_0
    //   106: iload_2
    //   107: iload #13
    //   109: iadd
    //   110: iload_3
    //   111: iload #12
    //   113: iadd
    //   114: iload_2
    //   115: iload #13
    //   117: iadd
    //   118: iload_3
    //   119: iload #12
    //   121: iadd
    //   122: invokevirtual drawLine : (IIII)V
    //   125: aload_0
    //   126: iload #5
    //   128: invokevirtual setColor : (I)V
    //   131: aload_0
    //   132: iload_2
    //   133: iload #13
    //   135: iadd
    //   136: iconst_1
    //   137: iadd
    //   138: iload_3
    //   139: iload #12
    //   141: iadd
    //   142: iload_2
    //   143: iload #13
    //   145: iadd
    //   146: iload_3
    //   147: iload #12
    //   149: iadd
    //   150: iconst_1
    //   151: iadd
    //   152: invokevirtual drawLine : (IIII)V
    //   155: iinc #13, 1
    //   158: iload #13
    //   160: iload #10
    //   162: if_icmplt -> 84
    //   165: iinc #12, 1
    //   168: iload #12
    //   170: iload #11
    //   172: if_icmplt -> 78
    //   175: iload_2
    //   176: iload #10
    //   178: iadd
    //   179: istore_2
    //   180: goto -> 197
    //   183: astore #9
    //   185: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   188: aload_1
    //   189: invokevirtual println : (Ljava/lang/String;)V
    //   192: aload #9
    //   194: invokevirtual printStackTrace : ()V
    //   197: iinc #8, 1
    //   200: iload #8
    //   202: iload #6
    //   204: if_icmplt -> 20
    //   207: aload_0
    //   208: iload #7
    //   210: invokevirtual setColor : (I)V
    //   213: return
    // Exception table:
    //   from	to	target	type
    //   35	180	183	java/lang/Exception
  }
  
  private static final int d(int paramInt1, int paramInt2) {
    return ((paramInt1 & 0x1) != 0) ? (paramInt2 >> 1) : (((paramInt1 & 0x8) != 0) ? paramInt2 : 0);
  }
  
  private static final int e(int paramInt1, int paramInt2) {
    return ((paramInt1 & 0x2) != 0) ? (paramInt2 >> 1) : (((paramInt1 & 0x20) != 0) ? paramInt2 : (((paramInt1 & 0x40) != 0) ? (paramInt2 >> 1) : 0));
  }
  
  private static void d(Graphics paramGraphics, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean) {
    paramGraphics.drawRGB(paramArrayOfint, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean);
  }
  
  private static int d(int paramInt) {
    return ((paramInt & 0xFF000000) == 0) ? (0xFF000000 | paramInt) : paramInt;
  }
  
  private static void e(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    d(paramGraphics, paramString, paramInt1, paramInt2, paramInt3, paramInt4, -1, (byte)0);
  }
  
  private static void d(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    d(paramGraphics, paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, (byte)((paramInt5 == -1) ? 0 : 1));
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */