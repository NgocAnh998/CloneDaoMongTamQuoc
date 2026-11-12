package com.fs.arpg;

import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class aq extends Canvas implements Runnable {
  private static int a = 100;
  
  private String d;
  
  public boolean d;
  
  int d = 1L;
  
  private static r[] d = new r[5];
  
  static int e = 0L;
  
  private static ag d = null;
  
  static h d = null;
  
  static h e = null;
  
  static long d;
  
  static int c;
  
  static int b;
  
  public static boolean e;
  
  private static long e;
  
  public aq() {
    setFullScreenMode(true);
    String str;
    ba.d = Integer.parseInt((str = ba.d.getAppProperty("MIDlet-Version")).substring(0, str.indexOf(".")));
    (new Thread(this)).start();
  }
  
  public static void d() {
    a = 80;
  }
  
  public static void e() {
    a = 100;
  }
  
  public static void c() {
    n.d();
    v.d();
    if (d == null)
      d = ag.d(); 
    d.d();
    ba.e();
    ba.a();
    if (ba.c == null) {
      ba.c = (Hashtable)new am();
    } else {
      ba.c.e();
    } 
    if (ba.e == null) {
      ba.e = (Hashtable)new am();
    } else {
      ba.e.e();
    } 
    if (ba.d == null) {
      ba.d = (Hashtable)new am();
    } else {
      ba.d.e();
    } 
    am.d();
    (n.d()).d.d();
    m.d();
    ba.z();
    ah.d();
    if (ba.d == null)
      (ba.d = (Hashtable)new ac()).b(); 
    ba.c();
    ba.b();
  }
  
  public static void b() {
    c();
    d(new a());
  }
  
  public static void d(r paramr) {
    d[e] = paramr;
    e++;
  }
  
  public static void a() {
    if (e <= 0L)
      return; 
    d[e - 1] = null;
    e--;
  }
  
  public final void sizeChanged(int paramInt1, int paramInt2) {
    if (paramInt1 > 320) {
      e = 0L;
      return;
    } 
    e = 1L;
  }
  
  private static void d(Graphics paramGraphics) {
    if (e == 0L) {
      int i = paramGraphics.getTranslateX();
      int j = paramGraphics.getTranslateY();
      paramGraphics.translate(-i, -j);
      paramGraphics.setClip(0, 0, 360, 360);
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, 20, 360);
      paramGraphics.fillRect(340, 0, 20, 360);
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: pop2
    //   4: aload_1
    //   5: getstatic com/fs/arpg/ah.d : Ljavax/microedition/lcdui/Font;
    //   8: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   11: getstatic com/fs/arpg/aq.e : Z
    //   14: ifne -> 24
    //   17: aload_1
    //   18: bipush #20
    //   20: iconst_0
    //   21: invokevirtual translate : (II)V
    //   24: aload_0
    //   25: getfield d : I
    //   28: iconst_1
    //   29: if_icmpne -> 112
    //   32: aload_1
    //   33: iconst_0
    //   34: invokevirtual setColor : (I)V
    //   37: aload_1
    //   38: iconst_0
    //   39: iconst_0
    //   40: sipush #320
    //   43: sipush #360
    //   46: invokevirtual fillRect : (IIII)V
    //   49: aload_1
    //   50: ldc 16777215
    //   52: invokevirtual setColor : (I)V
    //   55: aload_0
    //   56: getfield d : Ljava/lang/String;
    //   59: ifnonnull -> 81
    //   62: aload_0
    //   63: new java/lang/String
    //   66: dup
    //   67: invokestatic d : ()Lcom/fs/arpg/bg;
    //   70: bipush #110
    //   72: invokevirtual d : (S)[C
    //   75: invokespecial <init> : ([C)V
    //   78: putfield d : Ljava/lang/String;
    //   81: aload_1
    //   82: aload_0
    //   83: getfield d : Ljava/lang/String;
    //   86: sipush #160
    //   89: sipush #180
    //   92: bipush #17
    //   94: invokevirtual drawString : (Ljava/lang/String;III)V
    //   97: aload_0
    //   98: dup
    //   99: getfield d : I
    //   102: iconst_1
    //   103: iadd
    //   104: putfield d : I
    //   107: aload_1
    //   108: invokestatic d : (Ljavax/microedition/lcdui/Graphics;)V
    //   111: return
    //   112: aload_0
    //   113: getfield d : I
    //   116: ifeq -> 120
    //   119: return
    //   120: invokestatic currentTimeMillis : ()J
    //   123: pop2
    //   124: iconst_m1
    //   125: istore_2
    //   126: getstatic com/fs/arpg/aq.e : I
    //   129: iconst_1
    //   130: isub
    //   131: istore_3
    //   132: iload_3
    //   133: iflt -> 158
    //   136: getstatic com/fs/arpg/aq.d : [Lcom/fs/arpg/r;
    //   139: iload_3
    //   140: aaload
    //   141: getfield d : Z
    //   144: ifeq -> 152
    //   147: iload_3
    //   148: istore_2
    //   149: goto -> 158
    //   152: iinc #3, -1
    //   155: goto -> 132
    //   158: iload_2
    //   159: iflt -> 186
    //   162: iload_2
    //   163: istore_3
    //   164: iload_3
    //   165: getstatic com/fs/arpg/aq.e : I
    //   168: if_icmpge -> 186
    //   171: getstatic com/fs/arpg/aq.d : [Lcom/fs/arpg/r;
    //   174: iload_3
    //   175: aaload
    //   176: aload_1
    //   177: invokevirtual d : (Ljavax/microedition/lcdui/Graphics;)V
    //   180: iinc #3, 1
    //   183: goto -> 164
    //   186: invokestatic currentTimeMillis : ()J
    //   189: pop2
    //   190: aload_1
    //   191: invokestatic d : (Ljavax/microedition/lcdui/Graphics;)V
    //   194: return
  }
  
  private void h() {
    repaint();
    serviceRepaints();
  }
  
  private static void g() {
    try {
      Thread.sleep(100L);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final synchronized void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Z
    //   4: ifeq -> 156
    //   7: aload_0
    //   8: getfield d : Z
    //   11: ifeq -> 128
    //   14: aload_0
    //   15: getfield d : I
    //   18: ifne -> 128
    //   21: aload_0
    //   22: astore_1
    //   23: invokestatic currentTimeMillis : ()J
    //   26: putstatic com/fs/arpg/aq.e : J
    //   29: aload_1
    //   30: invokespecial h : ()V
    //   33: getstatic com/fs/arpg/aq.e : I
    //   36: ifeq -> 99
    //   39: invokestatic currentTimeMillis : ()J
    //   42: putstatic com/fs/arpg/aq.d : J
    //   45: iconst_0
    //   46: istore_1
    //   47: iload_1
    //   48: getstatic com/fs/arpg/aq.e : I
    //   51: if_icmpge -> 68
    //   54: getstatic com/fs/arpg/aq.d : [Lcom/fs/arpg/r;
    //   57: iload_1
    //   58: aaload
    //   59: invokevirtual d : ()V
    //   62: iinc #1, 1
    //   65: goto -> 47
    //   68: getstatic com/fs/arpg/aq.d : Lcom/fs/arpg/ag;
    //   71: ifnull -> 95
    //   74: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   77: ifnull -> 89
    //   80: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   83: getfield b : Z
    //   86: ifne -> 95
    //   89: getstatic com/fs/arpg/aq.d : Lcom/fs/arpg/ag;
    //   92: invokevirtual a : ()V
    //   95: invokestatic currentTimeMillis : ()J
    //   98: pop2
    //   99: invokestatic currentTimeMillis : ()J
    //   102: getstatic com/fs/arpg/aq.e : J
    //   105: lsub
    //   106: dup2
    //   107: lstore_2
    //   108: getstatic com/fs/arpg/aq.a : I
    //   111: i2l
    //   112: lcmp
    //   113: ifge -> 125
    //   116: getstatic com/fs/arpg/aq.a : I
    //   119: i2l
    //   120: lload_2
    //   121: lsub
    //   122: invokestatic sleep : (J)V
    //   125: goto -> 7
    //   128: aload_0
    //   129: getfield d : I
    //   132: iconst_1
    //   133: if_icmpne -> 146
    //   136: aload_0
    //   137: invokespecial h : ()V
    //   140: invokestatic g : ()V
    //   143: goto -> 0
    //   146: invokestatic g : ()V
    //   149: goto -> 0
    //   152: pop
    //   153: goto -> 0
    //   156: invokestatic d : ()Lcom/fs/arpg/ag;
    //   159: invokevirtual d : ()V
    //   162: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/GameMidlet;
    //   165: iconst_0
    //   166: invokevirtual destroyApp : (Z)V
    //   169: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/GameMidlet;
    //   172: invokevirtual notifyDestroyed : ()V
    //   175: return
    // Exception table:
    //   from	to	target	type
    //   7	149	152	java/lang/Exception
  }
  
  protected final void hideNotify() {
    z();
  }
  
  public final void z() {
    if (this.d == 0L || this.d == 2)
      this.d = 1L; 
    Hashtable hashtable;
    if ((hashtable = ba.d) != null && ((ai)hashtable).d != null)
      ((t)((ai)hashtable).d).d = 0L; 
    (ag.d()).e = 1;
    ag.d().b();
  }
  
  public final void keyPressed(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: iconst_1
    //   5: if_icmple -> 9
    //   8: return
    //   9: getstatic com/fs/arpg/aq.e : I
    //   12: ifne -> 16
    //   15: return
    //   16: iload_1
    //   17: lookupswitch default -> 84, 35 -> 78, 42 -> 72, 55 -> 60, 57 -> 66
    //   60: bipush #57
    //   62: istore_1
    //   63: goto -> 84
    //   66: bipush #48
    //   68: istore_1
    //   69: goto -> 84
    //   72: bipush #55
    //   74: istore_1
    //   75: goto -> 84
    //   78: bipush #51
    //   80: istore_1
    //   81: goto -> 84
    //   84: getstatic com/fs/arpg/aq.d : [Lcom/fs/arpg/r;
    //   87: getstatic com/fs/arpg/aq.e : I
    //   90: iconst_1
    //   91: isub
    //   92: aaload
    //   93: iload_1
    //   94: invokevirtual d : (I)V
    //   97: return
  }
  
  public final void keyReleased(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: iconst_1
    //   5: if_icmple -> 28
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield d : I
    //   13: invokestatic d : ()Lcom/fs/arpg/ag;
    //   16: dup
    //   17: astore_1
    //   18: iconst_0
    //   19: putfield e : Z
    //   22: aload_1
    //   23: iconst_0
    //   24: putfield c : Z
    //   27: return
    //   28: getstatic com/fs/arpg/aq.e : I
    //   31: ifne -> 35
    //   34: return
    //   35: iload_1
    //   36: lookupswitch default -> 104, 35 -> 98, 42 -> 92, 55 -> 80, 57 -> 86
    //   80: bipush #51
    //   82: istore_1
    //   83: goto -> 104
    //   86: bipush #48
    //   88: istore_1
    //   89: goto -> 104
    //   92: bipush #55
    //   94: istore_1
    //   95: goto -> 104
    //   98: bipush #57
    //   100: istore_1
    //   101: goto -> 104
    //   104: getstatic com/fs/arpg/aq.d : [Lcom/fs/arpg/r;
    //   107: getstatic com/fs/arpg/aq.e : I
    //   110: iconst_1
    //   111: isub
    //   112: aaload
    //   113: iload_1
    //   114: invokevirtual e : (I)V
    //   117: return
  }
  
  static {
    d = new h(360);
    e = new h(510);
    d = 0L;
    e = 0L;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\aq.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */