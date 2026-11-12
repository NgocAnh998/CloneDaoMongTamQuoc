package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public class al {
  private int e;
  
  public boolean d;
  
  public boolean e;
  
  public short d;
  
  public char[] d;
  
  public char[] e;
  
  public int d;
  
  public int[] d;
  
  private String[] d;
  
  private int c;
  
  private int b;
  
  public al d;
  
  public boolean c;
  
  boolean b;
  
  private g d = null;
  
  private short e = 0;
  
  public int d() {
    return (this.d == null || ((al)this.d).d == null) ? this.d : ((this.d == null) ? this.d : ((al)this.d).d);
  }
  
  public void d(DataInputStream paramDataInputStream) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual readShort : ()S
    //   4: dup
    //   5: istore_2
    //   6: iflt -> 25
    //   9: aload_0
    //   10: iload_2
    //   11: invokestatic d : (I)Lcom/fs/arpg/al;
    //   14: putfield d : Lcom/fs/arpg/al;
    //   17: aload_0
    //   18: getfield d : Lcom/fs/arpg/al;
    //   21: aload_1
    //   22: invokevirtual d : (Ljava/io/DataInputStream;)V
    //   25: aload_0
    //   26: aload_1
    //   27: invokevirtual readShort : ()S
    //   30: putfield d : I
    //   33: aload_1
    //   34: invokevirtual readShort : ()S
    //   37: pop
    //   38: aload_1
    //   39: invokevirtual readShort : ()S
    //   42: pop
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual readShort : ()S
    //   48: putfield d : S
    //   51: aload_0
    //   52: aload_1
    //   53: invokevirtual readBoolean : ()Z
    //   56: putfield e : Z
    //   59: aload_0
    //   60: aload_1
    //   61: invokevirtual readUTF : ()Ljava/lang/String;
    //   64: invokevirtual toCharArray : ()[C
    //   67: putfield d : [C
    //   70: aload_0
    //   71: aload_1
    //   72: invokevirtual readUTF : ()Ljava/lang/String;
    //   75: invokevirtual toCharArray : ()[C
    //   78: putfield e : [C
    //   81: aload_1
    //   82: invokevirtual readUTF : ()Ljava/lang/String;
    //   85: pop
    //   86: aload_1
    //   87: invokevirtual readInt : ()I
    //   90: pop
    //   91: aload_1
    //   92: invokevirtual readShort : ()S
    //   95: istore_2
    //   96: aload_0
    //   97: iload_2
    //   98: newarray int
    //   100: putfield d : [I
    //   103: aload_0
    //   104: aload_1
    //   105: astore_2
    //   106: astore_1
    //   107: iconst_0
    //   108: istore #4
    //   110: aload_1
    //   111: getfield d : [I
    //   114: arraylength
    //   115: istore #5
    //   117: iload #4
    //   119: iload #5
    //   121: if_icmpge -> 247
    //   124: aload_2
    //   125: invokevirtual readShort : ()S
    //   128: istore_3
    //   129: aload_1
    //   130: getfield d : [I
    //   133: iload #4
    //   135: dup2
    //   136: iaload
    //   137: iload_3
    //   138: bipush #24
    //   140: ishl
    //   141: ior
    //   142: iastore
    //   143: iload_3
    //   144: tableswitch default -> 241, 0 -> 172, 1 -> 192, 2 -> 212
    //   172: aload_1
    //   173: getfield d : [I
    //   176: iload #4
    //   178: dup2
    //   179: iaload
    //   180: aload_2
    //   181: invokevirtual readInt : ()I
    //   184: ldc 65535
    //   186: iand
    //   187: ior
    //   188: iastore
    //   189: goto -> 241
    //   192: aload_1
    //   193: getfield d : [I
    //   196: iload #4
    //   198: dup2
    //   199: iaload
    //   200: aload_2
    //   201: invokevirtual readInt : ()I
    //   204: ldc 65535
    //   206: iand
    //   207: ior
    //   208: iastore
    //   209: goto -> 241
    //   212: aload_1
    //   213: getfield d : [I
    //   216: iload #4
    //   218: dup2
    //   219: iaload
    //   220: aload_2
    //   221: invokevirtual readInt : ()I
    //   224: ldc 65535
    //   226: iand
    //   227: bipush #8
    //   229: ishl
    //   230: aload_2
    //   231: invokevirtual readInt : ()I
    //   234: sipush #255
    //   237: iand
    //   238: ior
    //   239: ior
    //   240: iastore
    //   241: iinc #4, 1
    //   244: goto -> 117
    //   247: return
  }
  
  public final boolean d() {
    return (this.d == null) ? this.d : ((this.d != null && ((al)this.d).d != null));
  }
  
  final boolean d(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: aload_0
    //   5: getfield e : I
    //   8: isub
    //   9: iflt -> 271
    //   12: aload_0
    //   13: getfield d : [I
    //   16: aload_0
    //   17: getfield b : I
    //   20: aload_0
    //   21: getfield e : I
    //   24: isub
    //   25: iaload
    //   26: bipush #24
    //   28: iushr
    //   29: tableswitch default -> 271, 0 -> 56, 1 -> 87, 2 -> 113
    //   56: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   59: dup
    //   60: getfield W : I
    //   63: aload_0
    //   64: getfield d : [I
    //   67: aload_0
    //   68: getfield b : I
    //   71: aload_0
    //   72: getfield e : I
    //   75: isub
    //   76: iaload
    //   77: ldc 65535
    //   79: iand
    //   80: iadd
    //   81: putfield W : I
    //   84: goto -> 271
    //   87: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   90: aload_0
    //   91: getfield d : [I
    //   94: aload_0
    //   95: getfield b : I
    //   98: aload_0
    //   99: getfield e : I
    //   102: isub
    //   103: iaload
    //   104: ldc 65535
    //   106: iand
    //   107: invokevirtual c : (I)V
    //   110: goto -> 271
    //   113: aload_0
    //   114: getfield d : [I
    //   117: aload_0
    //   118: getfield b : I
    //   121: aload_0
    //   122: getfield e : I
    //   125: isub
    //   126: iaload
    //   127: sipush #255
    //   130: iand
    //   131: istore_2
    //   132: aload_0
    //   133: aload_0
    //   134: getfield d : [I
    //   137: aload_0
    //   138: getfield b : I
    //   141: aload_0
    //   142: getfield e : I
    //   145: isub
    //   146: iaload
    //   147: bipush #8
    //   149: ishr
    //   150: i2s
    //   151: putfield e : S
    //   154: aload_0
    //   155: getfield e : S
    //   158: invokestatic d : (S)Lcom/fs/arpg/g;
    //   161: astore_3
    //   162: aload_0
    //   163: getfield e : S
    //   166: invokestatic d : (S)Z
    //   169: ifeq -> 246
    //   172: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/i;
    //   175: dup
    //   176: astore_2
    //   177: aload_3
    //   178: putfield d : Lcom/fs/arpg/g;
    //   181: aload_2
    //   182: invokevirtual e : ()V
    //   185: new java/lang/StringBuffer
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: dup
    //   193: astore #4
    //   195: ldc 'Đạt được'
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   200: pop
    //   201: aload #4
    //   203: aload_3
    //   204: getfield e : [C
    //   207: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   210: pop
    //   211: aload #4
    //   213: ldc 'Đã sử dụng,'
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   218: pop
    //   219: aload #4
    //   221: aload_2
    //   222: invokevirtual d : ()Ljava/lang/String;
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   228: pop
    //   229: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   232: aload #4
    //   234: invokevirtual toString : ()Ljava/lang/String;
    //   237: invokevirtual toCharArray : ()[C
    //   240: invokevirtual d : ([C)V
    //   243: goto -> 271
    //   246: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   249: aload_0
    //   250: getfield e : S
    //   253: iload_2
    //   254: invokevirtual d : (SI)V
    //   257: aload_3
    //   258: getfield d : B
    //   261: bipush #8
    //   263: if_icmpne -> 271
    //   266: aload_0
    //   267: aload_3
    //   268: putfield d : Lcom/fs/arpg/g;
    //   271: aload_0
    //   272: getfield b : I
    //   275: aload_0
    //   276: getfield c : I
    //   279: iconst_1
    //   280: isub
    //   281: if_icmple -> 372
    //   284: aload_0
    //   285: getfield d : Lcom/fs/arpg/g;
    //   288: ifnull -> 370
    //   291: new java/lang/StringBuffer
    //   294: dup
    //   295: ldc 'Đạt được {'
    //   297: invokespecial <init> : (Ljava/lang/String;)V
    //   300: aload_0
    //   301: getfield d : Lcom/fs/arpg/g;
    //   304: getfield e : [C
    //   307: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   310: ldc '}, Chức năng: '
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   315: aload_0
    //   316: getfield d : Lcom/fs/arpg/g;
    //   319: getfield d : [C
    //   322: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   325: ldc 'Có ngay lập tức Phụ Ma không?'
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   330: astore_2
    //   331: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   334: getfield d : Lcom/fs/arpg/j;
    //   337: bipush #118
    //   339: putfield d : I
    //   342: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   345: getfield d : Lcom/fs/arpg/j;
    //   348: aload_2
    //   349: invokevirtual toString : ()Ljava/lang/String;
    //   352: invokevirtual toCharArray : ()[C
    //   355: invokevirtual c : ([C)V
    //   358: aload_0
    //   359: aconst_null
    //   360: putfield d : Lcom/fs/arpg/g;
    //   363: aload_0
    //   364: iconst_m1
    //   365: putfield b : I
    //   368: iconst_0
    //   369: ireturn
    //   370: iconst_1
    //   371: ireturn
    //   372: aload_0
    //   373: getfield b : I
    //   376: iconst_m1
    //   377: if_icmpne -> 418
    //   380: iload_1
    //   381: sipush #400
    //   384: if_icmpne -> 389
    //   387: iconst_1
    //   388: ireturn
    //   389: iload_1
    //   390: sipush #200
    //   393: if_icmpne -> 416
    //   396: aload_0
    //   397: dup
    //   398: getfield b : I
    //   401: iconst_1
    //   402: isub
    //   403: putfield b : I
    //   406: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   409: aload_0
    //   410: getfield e : S
    //   413: invokevirtual d : (S)V
    //   416: iconst_0
    //   417: ireturn
    //   418: aload_0
    //   419: getfield b : I
    //   422: bipush #-2
    //   424: if_icmpne -> 445
    //   427: iload_1
    //   428: sipush #200
    //   431: if_icmpne -> 443
    //   434: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   437: iconst_0
    //   438: putfield x : Z
    //   441: iconst_1
    //   442: ireturn
    //   443: iconst_0
    //   444: ireturn
    //   445: aload_0
    //   446: dup
    //   447: getfield b : I
    //   450: iconst_1
    //   451: iadd
    //   452: putfield b : I
    //   455: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   458: getfield d : Lcom/fs/arpg/j;
    //   461: aload_0
    //   462: getfield d : [Ljava/lang/String;
    //   465: aload_0
    //   466: getfield b : I
    //   469: aaload
    //   470: invokevirtual toCharArray : ()[C
    //   473: invokevirtual d : ([C)V
    //   476: iconst_0
    //   477: ireturn
  }
  
  public int d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    return 0;
  }
  
  public void d() {
    this.b = false;
    this.d = false;
    if (this.d != null) {
      ((al)this.d).d = false;
      this.d.d();
    } 
  }
  
  void c() {}
  
  public final boolean e() {
    if (this.d == null) {
      if (this.d != null) {
        this.d.c();
        return false;
      } 
      c();
      return false;
    } 
    if (this.d != null) {
      this.d.e();
      if (((al)this.d).d != null) {
        a();
        return true;
      } 
      return false;
    } 
    a();
    return true;
  }
  
  public void e() {}
  
  public String[] d() {
    return null;
  }
  
  public void b() {}
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield d : [C
    //   12: arraylength
    //   13: ifne -> 17
    //   16: return
    //   17: aload_0
    //   18: getfield e : Z
    //   21: ifne -> 30
    //   24: ldc 'Nhiệm vụ phụ'
    //   26: iconst_1
    //   27: invokestatic e : (Ljava/lang/String;I)V
    //   30: aload_0
    //   31: invokevirtual b : ()V
    //   34: aload_0
    //   35: getfield d : [I
    //   38: arraylength
    //   39: istore_1
    //   40: aload_0
    //   41: invokevirtual d : ()[Ljava/lang/String;
    //   44: dup
    //   45: astore_2
    //   46: ifnull -> 127
    //   49: aload_0
    //   50: iconst_1
    //   51: aload_2
    //   52: arraylength
    //   53: iadd
    //   54: putfield e : I
    //   57: aload_0
    //   58: iload_1
    //   59: aload_0
    //   60: getfield e : I
    //   63: iadd
    //   64: anewarray java/lang/String
    //   67: putfield d : [Ljava/lang/String;
    //   70: aload_2
    //   71: iconst_0
    //   72: aload_0
    //   73: getfield d : [Ljava/lang/String;
    //   76: iconst_0
    //   77: aload_2
    //   78: arraylength
    //   79: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   82: aload_0
    //   83: getfield d : [Ljava/lang/String;
    //   86: aload_2
    //   87: arraylength
    //   88: new java/lang/StringBuffer
    //   91: dup
    //   92: ldc 'Nhiệm vụ:'
    //   94: invokespecial <init> : (Ljava/lang/String;)V
    //   97: aload_0
    //   98: getfield d : [C
    //   101: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   104: ldc ' '
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   109: invokestatic d : ()Lcom/fs/arpg/bg;
    //   112: bipush #21
    //   114: invokevirtual d : (S)[C
    //   117: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: aastore
    //   124: goto -> 186
    //   127: aload_0
    //   128: iconst_1
    //   129: putfield e : I
    //   132: aload_0
    //   133: iload_1
    //   134: aload_0
    //   135: getfield e : I
    //   138: iadd
    //   139: anewarray java/lang/String
    //   142: putfield d : [Ljava/lang/String;
    //   145: aload_0
    //   146: getfield d : [Ljava/lang/String;
    //   149: iconst_0
    //   150: new java/lang/StringBuffer
    //   153: dup
    //   154: ldc 'Nhiệm vụ:'
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: aload_0
    //   160: getfield d : [C
    //   163: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   166: ldc ' '
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   171: invokestatic d : ()Lcom/fs/arpg/bg;
    //   174: bipush #21
    //   176: invokevirtual d : (S)[C
    //   179: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   182: invokevirtual toString : ()Ljava/lang/String;
    //   185: aastore
    //   186: aload_0
    //   187: iconst_0
    //   188: putfield b : I
    //   191: aload_0
    //   192: aload_0
    //   193: getfield d : [Ljava/lang/String;
    //   196: arraylength
    //   197: iconst_1
    //   198: isub
    //   199: putfield c : I
    //   202: iconst_0
    //   203: istore_2
    //   204: iload_2
    //   205: iload_1
    //   206: if_icmpge -> 392
    //   209: aload_0
    //   210: getfield d : [I
    //   213: iload_2
    //   214: iaload
    //   215: bipush #24
    //   217: iushr
    //   218: tableswitch default -> 386, 0 -> 244, 1 -> 282, 2 -> 320
    //   244: aload_0
    //   245: getfield d : [Ljava/lang/String;
    //   248: iload_2
    //   249: aload_0
    //   250: getfield e : I
    //   253: iadd
    //   254: new java/lang/StringBuffer
    //   257: dup
    //   258: ldc 'Đạt được tiền tài'
    //   260: invokespecial <init> : (Ljava/lang/String;)V
    //   263: aload_0
    //   264: getfield d : [I
    //   267: iload_2
    //   268: iaload
    //   269: ldc 65535
    //   271: iand
    //   272: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   275: invokevirtual toString : ()Ljava/lang/String;
    //   278: aastore
    //   279: goto -> 386
    //   282: aload_0
    //   283: getfield d : [Ljava/lang/String;
    //   286: iload_2
    //   287: aload_0
    //   288: getfield e : I
    //   291: iadd
    //   292: new java/lang/StringBuffer
    //   295: dup
    //   296: ldc 'Lấy được kinh nghiệm'
    //   298: invokespecial <init> : (Ljava/lang/String;)V
    //   301: aload_0
    //   302: getfield d : [I
    //   305: iload_2
    //   306: iaload
    //   307: ldc 65535
    //   309: iand
    //   310: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: aastore
    //   317: goto -> 386
    //   320: aload_0
    //   321: getfield d : [I
    //   324: iload_2
    //   325: iaload
    //   326: bipush #8
    //   328: ishr
    //   329: i2s
    //   330: invokestatic d : (S)Lcom/fs/arpg/g;
    //   333: astore_3
    //   334: aload_0
    //   335: getfield d : [I
    //   338: iload_2
    //   339: iaload
    //   340: sipush #255
    //   343: iand
    //   344: istore #4
    //   346: aload_0
    //   347: getfield d : [Ljava/lang/String;
    //   350: iload_2
    //   351: aload_0
    //   352: getfield e : I
    //   355: iadd
    //   356: new java/lang/StringBuffer
    //   359: dup
    //   360: ldc 'Đạt được'
    //   362: invokespecial <init> : (Ljava/lang/String;)V
    //   365: aload_3
    //   366: getfield e : [C
    //   369: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   372: iload #4
    //   374: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   377: ldc 'Cái'
    //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   382: invokevirtual toString : ()Ljava/lang/String;
    //   385: aastore
    //   386: iinc #2, 1
    //   389: goto -> 204
    //   392: aload_0
    //   393: getfield d : [Ljava/lang/String;
    //   396: arraylength
    //   397: ifle -> 437
    //   400: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   403: getfield e : Lcom/fs/arpg/m;
    //   406: invokevirtual b : ()V
    //   409: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   412: aload_0
    //   413: putfield d : Lcom/fs/arpg/al;
    //   416: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   419: getfield d : Lcom/fs/arpg/j;
    //   422: aload_0
    //   423: getfield d : [Ljava/lang/String;
    //   426: aload_0
    //   427: getfield b : I
    //   430: aaload
    //   431: invokevirtual toCharArray : ()[C
    //   434: invokevirtual d : ([C)V
    //   437: aload_0
    //   438: iconst_0
    //   439: putfield c : Z
    //   442: return
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\al.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */