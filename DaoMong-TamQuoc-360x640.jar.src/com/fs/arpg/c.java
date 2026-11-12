package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class c extends al {
  private String[] d;
  
  private int[] e;
  
  private byte[] d;
  
  public final void d(DataInputStream paramDataInputStream) {
    super.d(paramDataInputStream);
    short s = paramDataInputStream.readShort();
    this.d = (byte[])new String[s];
    this.e = new int[s];
    this.d = new byte[s];
    for (byte b = 0; b < s; b++) {
      this.d[b] = paramDataInputStream.readUTF();
      this.e[b] = paramDataInputStream.readShort();
    } 
  }
  
  public final void d() {
    super.d();
    byte b = 0;
    int i = this.d.length;
    while (b < i) {
      ba.d(this.d[b], 0);
      this.d[b] = 0;
      b++;
    } 
  }
  
  public final int d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : [Ljava/lang/String;
    //   4: arraylength
    //   5: istore #4
    //   7: iconst_0
    //   8: istore #5
    //   10: iload #5
    //   12: iload #4
    //   14: if_icmpge -> 203
    //   17: new java/lang/StringBuffer
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: dup
    //   25: astore #6
    //   27: ldc 'Tiêu diệt'
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   32: aload_0
    //   33: getfield d : [Ljava/lang/String;
    //   36: iload #5
    //   38: aaload
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   42: bipush #40
    //   44: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   47: pop
    //   48: aload_0
    //   49: getfield d : Z
    //   52: ifeq -> 90
    //   55: aload #6
    //   57: ldc 'Hoàn thành )'
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   62: pop
    //   63: invokestatic d : ()Lcom/fs/arpg/ah;
    //   66: aload_1
    //   67: aload #6
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokevirtual toCharArray : ()[C
    //   75: iload_2
    //   76: iload_3
    //   77: iconst_3
    //   78: iadd
    //   79: iload #5
    //   81: iconst_4
    //   82: ishl
    //   83: iadd
    //   84: invokevirtual d : (Ljavax/microedition/lcdui/Graphics;[CII)V
    //   87: goto -> 197
    //   90: aload_0
    //   91: getfield d : [Ljava/lang/String;
    //   94: iload #5
    //   96: aaload
    //   97: ldc 'Yêu tộc hộ pháp'
    //   99: invokevirtual equals : (Ljava/lang/Object;)Z
    //   102: ifeq -> 140
    //   105: aload #6
    //   107: ldc 'Chưa xong )'
    //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   112: pop
    //   113: invokestatic d : ()Lcom/fs/arpg/ah;
    //   116: aload_1
    //   117: aload #6
    //   119: invokevirtual toString : ()Ljava/lang/String;
    //   122: invokevirtual toCharArray : ()[C
    //   125: iload_2
    //   126: iload_3
    //   127: iconst_3
    //   128: iadd
    //   129: iload #5
    //   131: iconst_4
    //   132: ishl
    //   133: iadd
    //   134: invokevirtual d : (Ljavax/microedition/lcdui/Graphics;[CII)V
    //   137: goto -> 197
    //   140: aload #6
    //   142: aload_0
    //   143: getfield d : [B
    //   146: iload #5
    //   148: baload
    //   149: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   152: bipush #47
    //   154: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   157: aload_0
    //   158: getfield e : [I
    //   161: iload #5
    //   163: iaload
    //   164: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   167: bipush #41
    //   169: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   172: pop
    //   173: invokestatic d : ()Lcom/fs/arpg/ah;
    //   176: aload_1
    //   177: aload #6
    //   179: invokevirtual toString : ()Ljava/lang/String;
    //   182: invokevirtual toCharArray : ()[C
    //   185: iload_2
    //   186: iload_3
    //   187: iconst_3
    //   188: iadd
    //   189: iload #5
    //   191: iconst_4
    //   192: ishl
    //   193: iadd
    //   194: invokevirtual d : (Ljavax/microedition/lcdui/Graphics;[CII)V
    //   197: iinc #5, 1
    //   200: goto -> 10
    //   203: iload #4
    //   205: iconst_4
    //   206: ishl
    //   207: ireturn
  }
  
  public final void e() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual e : ()Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_1
    //   10: putfield d : Z
    //   13: aload_0
    //   14: getfield d : [Ljava/lang/String;
    //   17: arraylength
    //   18: istore_1
    //   19: iconst_0
    //   20: istore_2
    //   21: iload_2
    //   22: iload_1
    //   23: if_icmpge -> 221
    //   26: aload_0
    //   27: getfield d : [Ljava/lang/String;
    //   30: iload_2
    //   31: aaload
    //   32: invokestatic d : (Ljava/lang/String;)I
    //   35: dup
    //   36: istore_3
    //   37: ifne -> 48
    //   40: aload_0
    //   41: iconst_0
    //   42: putfield d : Z
    //   45: goto -> 215
    //   48: iload_3
    //   49: aload_0
    //   50: getfield e : [I
    //   53: iload_2
    //   54: iaload
    //   55: if_icmpge -> 76
    //   58: iload_3
    //   59: aload_0
    //   60: getfield d : [B
    //   63: iload_2
    //   64: baload
    //   65: if_icmpne -> 76
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield d : Z
    //   73: goto -> 215
    //   76: iload_3
    //   77: aload_0
    //   78: getfield e : [I
    //   81: iload_2
    //   82: iaload
    //   83: if_icmpgt -> 215
    //   86: iload_3
    //   87: aload_0
    //   88: getfield d : [B
    //   91: iload_2
    //   92: baload
    //   93: if_icmpeq -> 215
    //   96: aload_0
    //   97: getfield d : [B
    //   100: iload_2
    //   101: iload_3
    //   102: i2b
    //   103: bastore
    //   104: aload_0
    //   105: getfield d : [Ljava/lang/String;
    //   108: iload_2
    //   109: aaload
    //   110: ldc 'Yêu tộc hộ pháp'
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 154
    //   118: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   121: new java/lang/StringBuffer
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: aload_0
    //   129: getfield d : [Ljava/lang/String;
    //   132: iload_2
    //   133: aaload
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   137: ldc 'Hoàn thành'
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokevirtual toCharArray : ()[C
    //   148: invokevirtual d : ([C)V
    //   151: goto -> 215
    //   154: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   157: new java/lang/StringBuffer
    //   160: dup
    //   161: invokespecial <init> : ()V
    //   164: aload_0
    //   165: getfield d : [Ljava/lang/String;
    //   168: iload_2
    //   169: aaload
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   173: iload_3
    //   174: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   177: ldc '/'
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   182: aload_0
    //   183: getfield e : [I
    //   186: iload_2
    //   187: iaload
    //   188: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: invokevirtual toCharArray : ()[C
    //   197: invokevirtual d : ([C)V
    //   200: iload_3
    //   201: aload_0
    //   202: getfield e : [I
    //   205: iload_2
    //   206: iaload
    //   207: if_icmpge -> 215
    //   210: aload_0
    //   211: iconst_0
    //   212: putfield d : Z
    //   215: iinc #2, 1
    //   218: goto -> 21
    //   221: aload_0
    //   222: getfield d : Z
    //   225: ifeq -> 239
    //   228: aload_0
    //   229: getfield d : Lcom/fs/arpg/al;
    //   232: ifnonnull -> 239
    //   235: aload_0
    //   236: invokevirtual a : ()V
    //   239: aload_0
    //   240: invokevirtual e : ()Z
    //   243: ifeq -> 247
    //   246: return
    //   247: return
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\c.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */