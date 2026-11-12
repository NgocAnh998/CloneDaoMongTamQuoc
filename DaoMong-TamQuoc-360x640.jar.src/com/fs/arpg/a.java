package com.fs.arpg;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class a extends r {
  private Vector d;
  
  private Image d;
  
  private int d;
  
  private int e;
  
  private int c;
  
  private long d;
  
  public a() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_1
    //   6: putfield d : Z
    //   9: aload_0
    //   10: astore_1
    //   11: ldc '/logo.fs'
    //   13: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   16: dup
    //   17: astore_2
    //   18: ifnonnull -> 25
    //   21: invokestatic c : ()V
    //   24: return
    //   25: aload_2
    //   26: invokevirtual trim : ()Ljava/lang/String;
    //   29: dup
    //   30: astore_2
    //   31: invokevirtual length : ()I
    //   34: ifne -> 41
    //   37: invokestatic c : ()V
    //   40: return
    //   41: aload_2
    //   42: bipush #59
    //   44: invokevirtual indexOf : (I)I
    //   47: istore_3
    //   48: aload_2
    //   49: astore #4
    //   51: aconst_null
    //   52: astore #5
    //   54: iload_3
    //   55: ifle -> 75
    //   58: aload_2
    //   59: iconst_0
    //   60: iload_3
    //   61: invokevirtual substring : (II)Ljava/lang/String;
    //   64: astore #4
    //   66: aload_2
    //   67: iload_3
    //   68: iconst_1
    //   69: iadd
    //   70: invokevirtual substring : (I)Ljava/lang/String;
    //   73: astore #5
    //   75: aload_1
    //   76: aload #4
    //   78: astore_3
    //   79: dup
    //   80: astore_2
    //   81: new java/util/Vector
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: putfield d : Ljava/util/Vector;
    //   91: iconst_0
    //   92: istore #4
    //   94: iload #4
    //   96: aload_3
    //   97: invokevirtual length : ()I
    //   100: if_icmpge -> 189
    //   103: aload_3
    //   104: bipush #38
    //   106: iload #4
    //   108: iconst_1
    //   109: iadd
    //   110: invokevirtual indexOf : (II)I
    //   113: dup
    //   114: istore #6
    //   116: ifge -> 125
    //   119: aload_3
    //   120: invokevirtual length : ()I
    //   123: istore #6
    //   125: aload_3
    //   126: iload #4
    //   128: iload #6
    //   130: invokevirtual substring : (II)Ljava/lang/String;
    //   133: astore #4
    //   135: new java/lang/StringBuffer
    //   138: dup
    //   139: ldc '/'
    //   141: invokespecial <init> : (Ljava/lang/String;)V
    //   144: aload #4
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: invokestatic d : (Ljava/lang/String;)[B
    //   155: dup
    //   156: astore #4
    //   158: iconst_0
    //   159: aload #4
    //   161: arraylength
    //   162: invokestatic createImage : ([BII)Ljavax/microedition/lcdui/Image;
    //   165: astore #4
    //   167: aload_2
    //   168: getfield d : Ljava/util/Vector;
    //   171: aload #4
    //   173: invokevirtual addElement : (Ljava/lang/Object;)V
    //   176: goto -> 180
    //   179: pop
    //   180: iload #6
    //   182: iconst_1
    //   183: iadd
    //   184: istore #4
    //   186: goto -> 94
    //   189: aload #5
    //   191: dup
    //   192: astore_2
    //   193: ifnull -> 233
    //   196: aload_2
    //   197: bipush #59
    //   199: invokevirtual indexOf : (I)I
    //   202: dup
    //   203: istore_3
    //   204: ifle -> 229
    //   207: aload_2
    //   208: iconst_0
    //   209: iload_3
    //   210: invokevirtual substring : (II)Ljava/lang/String;
    //   213: putstatic com/fs/arpg/ba.d : Ljava/lang/String;
    //   216: aload_2
    //   217: iload_3
    //   218: iconst_1
    //   219: iadd
    //   220: invokevirtual substring : (I)Ljava/lang/String;
    //   223: putstatic com/fs/arpg/ba.e : Ljava/lang/String;
    //   226: goto -> 233
    //   229: aload_2
    //   230: putstatic com/fs/arpg/ba.e : Ljava/lang/String;
    //   233: aload_1
    //   234: getfield d : Ljava/util/Vector;
    //   237: invokevirtual isEmpty : ()Z
    //   240: ifeq -> 247
    //   243: invokestatic c : ()V
    //   246: return
    //   247: aload_1
    //   248: aload_1
    //   249: getfield d : Ljava/util/Vector;
    //   252: iconst_0
    //   253: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   256: checkcast javax/microedition/lcdui/Image
    //   259: putfield d : Ljavax/microedition/lcdui/Image;
    //   262: aload_1
    //   263: invokespecial e : ()V
    //   266: return
    // Exception table:
    //   from	to	target	type
    //   135	176	179	java/lang/Exception
  }
  
  private void e() {
    this.d = 320 - this.d.getWidth() >> 1;
    this.e = 360 - this.d.getHeight() >> 1;
    this.d = System.currentTimeMillis();
  }
  
  private void d(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: new java/util/Vector
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield d : Ljava/util/Vector;
    //   11: iconst_0
    //   12: istore_2
    //   13: iload_2
    //   14: aload_1
    //   15: invokevirtual length : ()I
    //   18: if_icmpge -> 94
    //   21: aload_1
    //   22: bipush #38
    //   24: iload_2
    //   25: iconst_1
    //   26: iadd
    //   27: invokevirtual indexOf : (II)I
    //   30: dup
    //   31: istore_3
    //   32: ifge -> 40
    //   35: aload_1
    //   36: invokevirtual length : ()I
    //   39: istore_3
    //   40: aload_1
    //   41: iload_2
    //   42: iload_3
    //   43: invokevirtual substring : (II)Ljava/lang/String;
    //   46: astore_2
    //   47: new java/lang/StringBuffer
    //   50: dup
    //   51: ldc '/'
    //   53: invokespecial <init> : (Ljava/lang/String;)V
    //   56: aload_2
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: invokestatic d : (Ljava/lang/String;)[B
    //   66: dup
    //   67: astore_2
    //   68: iconst_0
    //   69: aload_2
    //   70: arraylength
    //   71: invokestatic createImage : ([BII)Ljavax/microedition/lcdui/Image;
    //   74: astore_2
    //   75: aload_0
    //   76: getfield d : Ljava/util/Vector;
    //   79: aload_2
    //   80: invokevirtual addElement : (Ljava/lang/Object;)V
    //   83: goto -> 87
    //   86: pop
    //   87: iload_3
    //   88: iconst_1
    //   89: iadd
    //   90: istore_2
    //   91: goto -> 13
    //   94: return
    // Exception table:
    //   from	to	target	type
    //   47	83	86	java/lang/Exception
  }
  
  private static void c() {
    aq.a();
    aq.d(new bn());
  }
  
  public final void d(Graphics paramGraphics) {
    bi.d(paramGraphics, 16777215);
    if (this.d == null)
      return; 
    paramGraphics.drawImage(this.d, this.d, this.e, 20);
  }
  
  public final void d() {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: dup2
    //   4: lstore_1
    //   5: aload_0
    //   6: getfield d : J
    //   9: lsub
    //   10: ldc2_w 2000
    //   13: lcmp
    //   14: ifge -> 18
    //   17: return
    //   18: aload_0
    //   19: dup
    //   20: getfield c : I
    //   23: iconst_1
    //   24: iadd
    //   25: putfield c : I
    //   28: aload_0
    //   29: getfield c : I
    //   32: aload_0
    //   33: getfield d : Ljava/util/Vector;
    //   36: invokevirtual size : ()I
    //   39: if_icmplt -> 46
    //   42: invokestatic c : ()V
    //   45: return
    //   46: aload_0
    //   47: lload_1
    //   48: putfield d : J
    //   51: aload_0
    //   52: aload_0
    //   53: getfield d : Ljava/util/Vector;
    //   56: aload_0
    //   57: getfield c : I
    //   60: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   63: checkcast javax/microedition/lcdui/Image
    //   66: putfield d : Ljavax/microedition/lcdui/Image;
    //   69: aload_0
    //   70: invokespecial e : ()V
    //   73: return
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\a.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */