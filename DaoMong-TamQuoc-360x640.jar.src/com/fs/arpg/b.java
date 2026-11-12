package com.fs.arpg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b {
  public int d;
  
  private int b;
  
  private int a;
  
  private int z;
  
  private Image d;
  
  private int[] d;
  
  private Image e;
  
  private int[] e;
  
  private byte[] d;
  
  private int[] c;
  
  int e;
  
  int c;
  
  public bh d;
  
  private bh e;
  
  private static boolean d = false;
  
  private static Graphics d;
  
  private static Image c;
  
  private static int h;
  
  private static int g;
  
  private static int f;
  
  private static int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int p;
  
  private short[] d;
  
  private boolean e;
  
  private int o;
  
  private int q;
  
  private byte[] e;
  
  private int[] b;
  
  private int[] a = false;
  
  private int s;
  
  private int r;
  
  private String d;
  
  private static at d = new at("/map.idx", "/map.pkg");
  
  private boolean c;
  
  private Image b = false;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int[] z = false;
  
  private int[] h;
  
  private int[] g;
  
  private int w;
  
  private int x;
  
  private long[] d;
  
  private be[] d;
  
  private int y;
  
  public b() {
    this.z = new int[50];
    this.h = new int[50];
    this.g = new int[50];
    this.d = (be[])new long[20];
    this.d = new be[20];
  }
  
  public b(String paramString) {
    this.z = new int[50];
    this.h = new int[50];
    this.g = new int[50];
    this.d = (be[])new long[20];
    this.d = new be[20];
    this.d = (be[])paramString;
    this.d = Integer.parseInt(paramString);
    d(paramString);
  }
  
  public final void d(short paramShort1, short paramShort2, byte paramByte) {
    this.d[this.y] = (paramShort1 << 16) | paramShort2 | (paramByte & 0xFF) << 32L;
    be be1 = new be();
    v.d().d((short)107, be1);
    be1.c = (short)paramByte;
    be1.ab = paramShort1;
    be1.ac = paramShort2;
    be1.d();
    this.d[this.y] = be1;
    this.y++;
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (ba.d != null && !ba.d.e())
      return; 
    for (byte b1 = 0; b1 < this.y; b1++) {
      this.d[b1].d(paramGraphics, paramInt1, paramInt2);
      this.d[b1].n();
    } 
  }
  
  private void e(DataInputStream paramDataInputStream) {
    // Byte code:
    //   0: aload_0
    //   1: bipush #20
    //   3: newarray long
    //   5: putfield d : [J
    //   8: aload_1
    //   9: invokevirtual readShort : ()S
    //   12: istore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: iload_2
    //   17: if_icmpge -> 77
    //   20: aload_1
    //   21: invokevirtual readLong : ()J
    //   24: dup2
    //   25: lstore #4
    //   27: bipush #16
    //   29: lshr
    //   30: ldc2_w 65535
    //   33: land
    //   34: l2i
    //   35: i2s
    //   36: istore #6
    //   38: lload #4
    //   40: ldc2_w 65535
    //   43: land
    //   44: l2i
    //   45: i2s
    //   46: istore #7
    //   48: lload #4
    //   50: bipush #32
    //   52: lshr
    //   53: ldc2_w 65535
    //   56: land
    //   57: l2i
    //   58: i2b
    //   59: istore #4
    //   61: aload_0
    //   62: iload #6
    //   64: iload #7
    //   66: iload #4
    //   68: invokevirtual d : (SSB)V
    //   71: iinc #3, 1
    //   74: goto -> 15
    //   77: return
  }
  
  public final void d(short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.w >= 50)
      return; 
    int i = ba.d(4, 6);
    byte b1 = (byte)ba.d(-8, 8);
    byte b2 = (byte)ba.d(-20, -20);
    int j = (this.x + this.w) % 50;
    this.z[j] = 0;
    this.h[j] = 0;
    this.g[j] = 0;
    this.z[j] = paramInt3 << 24 | paramInt4 << 16 | i << 8;
    this.h[j] = paramInt1 << 16 | paramInt2;
    this.g[j] = paramShort << 16 | ((b1 & 0xFF) << 8 | b2 & 0xFF) & 0xFFFF;
    this.w++;
  }
  
  public final void e(Graphics paramGraphics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield w : I
    //   4: ifne -> 8
    //   7: return
    //   8: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   11: astore #12
    //   13: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   16: astore #13
    //   18: aload_0
    //   19: getfield x : I
    //   22: istore #14
    //   24: aload_0
    //   25: getfield x : I
    //   28: aload_0
    //   29: getfield w : I
    //   32: iadd
    //   33: istore #15
    //   35: iload #14
    //   37: iload #15
    //   39: if_icmpge -> 402
    //   42: iload #14
    //   44: bipush #50
    //   46: irem
    //   47: istore #16
    //   49: aload_0
    //   50: getfield z : [I
    //   53: iload #16
    //   55: iaload
    //   56: bipush #24
    //   58: iushr
    //   59: istore #6
    //   61: aload_0
    //   62: getfield z : [I
    //   65: iload #16
    //   67: iaload
    //   68: bipush #16
    //   70: ishr
    //   71: sipush #255
    //   74: iand
    //   75: istore #7
    //   77: aload_0
    //   78: getfield z : [I
    //   81: iload #16
    //   83: iaload
    //   84: bipush #8
    //   86: ishr
    //   87: sipush #255
    //   90: iand
    //   91: istore #10
    //   93: aload_0
    //   94: getfield z : [I
    //   97: iload #16
    //   99: iaload
    //   100: sipush #255
    //   103: iand
    //   104: istore #11
    //   106: aload_0
    //   107: getfield h : [I
    //   110: iload #16
    //   112: iaload
    //   113: bipush #16
    //   115: ishr
    //   116: ldc 65535
    //   118: iand
    //   119: istore #4
    //   121: aload_0
    //   122: getfield h : [I
    //   125: iload #16
    //   127: iaload
    //   128: ldc 65535
    //   130: iand
    //   131: istore #5
    //   133: aload_0
    //   134: getfield g : [I
    //   137: iload #16
    //   139: iaload
    //   140: bipush #8
    //   142: ishr
    //   143: i2b
    //   144: istore #8
    //   146: aload_0
    //   147: getfield g : [I
    //   150: iload #16
    //   152: iaload
    //   153: i2b
    //   154: istore #9
    //   156: aload_1
    //   157: getstatic com/fs/arpg/g.e : Ljavax/microedition/lcdui/Image;
    //   160: iload #4
    //   162: iload_2
    //   163: isub
    //   164: iload #5
    //   166: iload_3
    //   167: isub
    //   168: bipush #8
    //   170: iadd
    //   171: iconst_0
    //   172: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   175: aload_1
    //   176: getstatic com/fs/arpg/g.d : Ljavax/microedition/lcdui/Image;
    //   179: iload #4
    //   181: iload_2
    //   182: isub
    //   183: iload #5
    //   185: iload_3
    //   186: isub
    //   187: iload #6
    //   189: iload #7
    //   191: bipush #16
    //   193: bipush #16
    //   195: invokestatic d : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Image;IIIIII)V
    //   198: iload #11
    //   200: iload #10
    //   202: if_icmpge -> 260
    //   205: iload #4
    //   207: iload #8
    //   209: iadd
    //   210: istore #4
    //   212: iload #5
    //   214: iload #9
    //   216: iload #11
    //   218: iconst_3
    //   219: ishl
    //   220: iadd
    //   221: iconst_4
    //   222: iadd
    //   223: iadd
    //   224: istore #5
    //   226: aload_0
    //   227: getfield h : [I
    //   230: iload #16
    //   232: iconst_0
    //   233: iastore
    //   234: aload_0
    //   235: getfield z : [I
    //   238: iload #16
    //   240: iconst_0
    //   241: iastore
    //   242: aload_0
    //   243: getfield h : [I
    //   246: iload #16
    //   248: iload #4
    //   250: bipush #16
    //   252: ishl
    //   253: iload #5
    //   255: ior
    //   256: iastore
    //   257: goto -> 362
    //   260: iload #11
    //   262: iload #10
    //   264: if_icmple -> 362
    //   267: iload #4
    //   269: aload #12
    //   271: getfield ab : I
    //   274: iload #4
    //   276: isub
    //   277: bipush #8
    //   279: isub
    //   280: iconst_1
    //   281: ishr
    //   282: iadd
    //   283: istore #4
    //   285: iload #5
    //   287: aload #12
    //   289: getfield ac : I
    //   292: iload #5
    //   294: isub
    //   295: iconst_1
    //   296: ishr
    //   297: iadd
    //   298: istore #5
    //   300: aload_0
    //   301: getfield h : [I
    //   304: iload #16
    //   306: iconst_0
    //   307: iastore
    //   308: aload_0
    //   309: getfield h : [I
    //   312: iload #16
    //   314: iload #4
    //   316: bipush #16
    //   318: ishl
    //   319: iload #5
    //   321: ior
    //   322: iastore
    //   323: aload #12
    //   325: getfield ab : I
    //   328: iload #4
    //   330: isub
    //   331: invokestatic abs : (I)I
    //   334: bipush #11
    //   336: if_icmpge -> 362
    //   339: aload #12
    //   341: getfield ac : I
    //   344: iload #5
    //   346: isub
    //   347: invokestatic abs : (I)I
    //   350: bipush #6
    //   352: if_icmpge -> 362
    //   355: iload #10
    //   357: bipush #20
    //   359: iadd
    //   360: istore #11
    //   362: iinc #11, 1
    //   365: aload_0
    //   366: getfield z : [I
    //   369: iload #16
    //   371: iload #6
    //   373: bipush #24
    //   375: ishl
    //   376: iload #7
    //   378: bipush #16
    //   380: ishl
    //   381: ior
    //   382: iload #10
    //   384: bipush #8
    //   386: ishl
    //   387: ior
    //   388: iload #11
    //   390: sipush #255
    //   393: iand
    //   394: ior
    //   395: iastore
    //   396: iinc #14, 1
    //   399: goto -> 35
    //   402: aload_0
    //   403: getfield z : [I
    //   406: aload_0
    //   407: getfield x : I
    //   410: iaload
    //   411: istore #14
    //   413: invokestatic d : ()Lcom/fs/arpg/bg;
    //   416: astore #15
    //   418: iload #14
    //   420: sipush #255
    //   423: iand
    //   424: iload #14
    //   426: bipush #8
    //   428: ishr
    //   429: sipush #255
    //   432: iand
    //   433: bipush #20
    //   435: iadd
    //   436: if_icmple -> 677
    //   439: aload_0
    //   440: getfield g : [I
    //   443: aload_0
    //   444: getfield x : I
    //   447: iaload
    //   448: bipush #16
    //   450: ishr
    //   451: dup
    //   452: istore_1
    //   453: sipush #1000
    //   456: if_icmple -> 524
    //   459: iload_1
    //   460: sipush #1000
    //   463: isub
    //   464: istore_2
    //   465: getstatic com/fs/arpg/ac.c : Z
    //   468: ifeq -> 475
    //   471: iload_2
    //   472: iconst_1
    //   473: ishl
    //   474: istore_2
    //   475: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   478: dup
    //   479: getfield W : I
    //   482: iload_2
    //   483: iadd
    //   484: putfield W : I
    //   487: new java/lang/StringBuffer
    //   490: dup
    //   491: invokespecial <init> : ()V
    //   494: astore #16
    //   496: aload #15
    //   498: bipush #24
    //   500: aload #16
    //   502: invokevirtual d : (SLjava/lang/StringBuffer;)V
    //   505: aload #15
    //   507: bipush #83
    //   509: aload #16
    //   511: invokevirtual d : (SLjava/lang/StringBuffer;)V
    //   514: aload #16
    //   516: iload_2
    //   517: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   520: pop
    //   521: goto -> 606
    //   524: iload_1
    //   525: invokestatic d : (S)Lcom/fs/arpg/g;
    //   528: astore_2
    //   529: new java/lang/StringBuffer
    //   532: dup
    //   533: invokespecial <init> : ()V
    //   536: astore #16
    //   538: aload #15
    //   540: bipush #24
    //   542: aload #16
    //   544: invokevirtual d : (SLjava/lang/StringBuffer;)V
    //   547: aload #16
    //   549: aload_2
    //   550: getfield e : [C
    //   553: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   556: pop
    //   557: iload_1
    //   558: invokestatic d : (S)Z
    //   561: ifeq -> 588
    //   564: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/i;
    //   567: aload_2
    //   568: putfield d : Lcom/fs/arpg/g;
    //   571: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/i;
    //   574: invokevirtual e : ()V
    //   577: aload #16
    //   579: ldc ', đã tự động sử dụng'
    //   581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   584: pop
    //   585: goto -> 606
    //   588: aload #12
    //   590: iload_1
    //   591: invokevirtual d : (S)V
    //   594: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   597: invokevirtual b : ()V
    //   600: invokestatic d : ()Lcom/fs/arpg/d;
    //   603: invokevirtual d : ()V
    //   606: aload #13
    //   608: aload #16
    //   610: invokevirtual toString : ()Ljava/lang/String;
    //   613: invokevirtual toCharArray : ()[C
    //   616: invokevirtual d : ([C)V
    //   619: aload_0
    //   620: getfield z : [I
    //   623: aload_0
    //   624: getfield x : I
    //   627: iconst_0
    //   628: iastore
    //   629: aload_0
    //   630: dup
    //   631: getfield x : I
    //   634: iconst_1
    //   635: iadd
    //   636: putfield x : I
    //   639: aload_0
    //   640: getfield x : I
    //   643: bipush #50
    //   645: if_icmplt -> 653
    //   648: aload_0
    //   649: iconst_0
    //   650: putfield x : I
    //   653: aload_0
    //   654: getfield z : [I
    //   657: aload_0
    //   658: getfield x : I
    //   661: iaload
    //   662: istore #14
    //   664: aload_0
    //   665: dup
    //   666: getfield w : I
    //   669: iconst_1
    //   670: isub
    //   671: putfield w : I
    //   674: goto -> 418
    //   677: return
  }
  
  public final void d(m paramm, int paramInt1, int paramInt2) {
    paramInt1 = (short)(paramInt1 << 8 | paramInt2);
    if (this.e != null) {
      this.e.d(paramInt1, paramm);
      return;
    } 
    this.d.d(paramInt1, paramm);
  }
  
  public final m d(int paramInt1, int paramInt2) {
    paramInt1 >>= 4;
    paramInt2 >>= 4;
    paramInt1 = (short)(paramInt1 << 8 | paramInt2);
    return (m)this.d.d(paramInt1);
  }
  
  public final void d() {
    this.e = (byte[])this.d;
    this.d = (be[])new bh(20);
  }
  
  public final void e() {
    this.d.d();
    this.d = (be[])this.e;
    this.e = null;
  }
  
  private void d(String paramString) {
    try {
      DataInputStream dataInputStream1;
      (dataInputStream1 = d.d(paramString)).readUTF();
      dataInputStream1.read();
      this.a = dataInputStream1.read() & 0xFF;
      this.b = dataInputStream1.read() & 0xFF;
      this.d = (be[])new short[this.a];
      short s;
      for (s = 0; s < this.a; s++)
        this.d[s] = (short)(this.b * s); 
      this.z = this.a * this.b;
      this.e = this.a << 4;
      this.c = this.b << 4;
      s = dataInputStream1.readShort();
      n n = n.d();
      this.d = (be[])n.d(s);
      this.d = (be[])new int[this.z];
      d(dataInputStream1, (int[])this.d);
      s = dataInputStream1.readShort();
      this.e = (byte[])n.d(s);
      this.e = (byte[])new int[this.z];
      d(dataInputStream1, (int[])this.e);
      DataInputStream dataInputStream2;
      short s2 = (dataInputStream2 = dataInputStream1).readShort();
      v v = v.d();
      for (byte b2 = 0; b2 < s2; b2++) {
        be be1 = new be();
        short s3 = dataInputStream2.readShort();
        v.d(s3, be1);
        be1.c = dataInputStream2.readShort();
        be1.d();
        int i = dataInputStream2.read() & 0xFF;
        int j = dataInputStream2.read() & 0xFF;
        be1.ab = (short)((i << 4) + 8);
        be1.ac = (short)(j + 1 << 4);
        switch (dataInputStream2.readByte()) {
          case 1:
            ba.c.e(be1);
            break;
          case 0:
            ba.e.e(be1);
            break;
          case 2:
            ba.d.e(be1);
            break;
        } 
      } 
      DataInputStream dataInputStream3 = dataInputStream1;
      b b1;
      this.d = (be[])new byte[(b1 = this).z];
      short s1 = dataInputStream3.readShort();
      s2 = 0;
      int[] arrayOfInt = new int[20];
      for (byte b3 = 0; b3 < s1; b3++) {
        int i = dataInputStream3.read() & 0xFF;
        int j = dataInputStream3.read() & 0xFF;
        int k = b1.d[i] + j;
        b1.d[k] = (byte)dataInputStream3.read();
        if (b1.d[k] == 4) {
          arrayOfInt[s2] = i << 16 | j;
          s2++;
        } 
      } 
      b1.c = new int[s2];
      System.arraycopy(arrayOfInt, 0, b1.c, 0, s2);
      this.d = (be[])new bh(20);
      dataInputStream1.read();
      n.d((short)4);
      this.c = dataInputStream1.readBoolean();
      if (this.c) {
        this.b = n.d((short)4);
        this.t = this.b.getWidth();
        this.u = this.b.getHeight();
      } else {
        n.d(this.b);
        this.b = null;
      } 
      try {
        dataInputStream1.close();
      } catch (Exception exception) {}
      if (c == null) {
        g = 20;
        h = (h = (h = 22) + 1) + 1;
        f = ++g << 4;
        i = h << 4;
        d = (be[])(c = Image.createImage(f, i)).getGraphics();
      } 
      d.setColor(0);
      d.fillRect(0, 0, f, i);
      d = false;
      this.j = 0;
      this.k = 0;
      this.e = new byte[(b1 = this).z];
      b1.a = new int[80];
      b1.b = (Image)new int[80];
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  final void c() {
    n.d().d((Image)this.d);
    n.d().d((Image)this.e);
    this.d = null;
    this.d = null;
    this.e = null;
    this.e = null;
  }
  
  final void b() {
    c();
    c = null;
  }
  
  final boolean d() {
    int i = ((p)ba.d).ab >> 4;
    int j = ((p)ba.d).ac >> 4;
    byte b1 = ((p)ba.d).b;
    return (i < 0 || j < 0) ? false : ((i >= this.a || j >= this.b) ? false : ((this.d[this.d[i] + j] >= 11 && b1 + 11 == this.d[this.d[i] + j])));
  }
  
  private void d(DataInputStream paramDataInputStream, int[] paramArrayOfint) {
    for (byte b1 = 0; b1 < this.a; b1++) {
      for (byte b2 = 0; b2 < this.b; b2++)
        paramArrayOfint[this.d[b1] + b2] = (paramDataInputStream.read() & 0xFF) << 16 | (paramDataInputStream.read() & 0xFF) << 8 | paramDataInputStream.read() & 0xFF; 
    } 
  }
  
  private void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Image paramImage, int[] paramArrayOfint) {
    if (paramInt1 < 0 || paramInt2 < 0 || paramInt1 >= this.a || paramInt2 >= this.b)
      return; 
    try {
      paramInt2 = (paramInt1 = paramArrayOfint[this.d[paramInt1] + paramInt2]) >> 16 & 0xFF;
      int j = paramInt1 >> 8 & 0xFF;
      if (paramInt2 == 255 || j == 255) {
        if (paramArrayOfint == this.d) {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(paramInt3, paramInt4, 16, 16);
        } 
        return;
      } 
      paramInt1 &= 0xFF;
      paramInt2 <<= 4;
      int i = j << 4;
      bi.d(paramGraphics, paramImage, paramInt2, i, 16, 16, paramInt1, paramInt3, paramInt4, 20);
      paramGraphics.setClip(0, 0, f, i);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    d(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, (Image)this.d, (int[])this.d);
    d(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, (Image)this.e, (int[])this.e);
  }
  
  private void d(int paramInt1, int paramInt2) {
    int i = paramInt1 >> 4;
    int j = paramInt2 >> 4;
    boolean bool1 = false;
    byte b1 = 0;
    boolean bool2 = false;
    int k;
    while (b1 < g && (k = b1 + i) < this.a) {
      for (byte b2 = 0; b2 < h && b2 + j < this.b; b2++) {
        d((Graphics)d, k, b2 + j, bool1, bool2);
        bool2 += true;
      } 
      bool1 += true;
      b1++;
    } 
    this.l = paramInt1 - (i << 4);
    this.m = paramInt2 - (j << 4);
    this.j = 0;
    this.k = 0;
  }
  
  public final void c(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.c) {
      Graphics graphics1 = paramGraphics;
      b b2 = this;
      int i5 = -((paramInt1 + b2.v) % b2.t);
      int i6;
      for (i6 = 0; i6 < 360; i6 += b2.u) {
        int i10;
        for (i10 = i5; i10 < 320; i10 += b2.t)
          d.drawImage(b2.b, i10, i6, 0); 
      } 
      int i7 = paramInt1 >> 4;
      i5 = paramInt2 >> 4;
      boolean bool1 = false;
      int i8 = 0;
      boolean bool2 = false;
      int i9;
      while (i8 < g && (i9 = i8 + i7) < b2.a) {
        for (byte b3 = 0; b3 < h && b3 + i5 < b2.b; b3++) {
          b2.d((Graphics)d, i9, b3 + i5, bool1, bool2, (Image)b2.e, (int[])b2.e);
          bool2 += true;
        } 
        bool1 += true;
        i8++;
      } 
      i8 = paramInt1 & 0xF;
      i9 = paramInt2 & 0xF;
      bi.d(graphics1, c, 0, 0, i8, i9, f - i8, i - i9);
      graphics1.drawImage(c, 0, 0, 0);
      b2.v++;
      if (b2.v >= b2.t)
        b2.v = 0; 
      return;
    } 
    int k = paramInt2;
    int j = paramInt1;
    b b1 = this;
    if (d == null) {
      b1.d(paramInt1, paramInt2);
      d = true;
    } else {
      int i5 = Math.abs(paramInt1 - b1.n);
      int i6 = Math.abs(paramInt2 - b1.p);
      if (i5 != 0 && i6 != 0) {
        b1.d(paramInt1, paramInt2);
      } else if (i5 > 16 || i6 > 16) {
        b1.d(paramInt1, paramInt2);
      } else if (i5 != 0 || i6 != 0) {
        b b2 = b1;
        int i7 = j >> 4;
        int i8 = k >> 4;
        int i9 = j + 320 >> 4;
        int i10 = k + 360 >> 4;
        if (j > b2.n) {
          int i11 = j - b2.n;
          if (b2.l + i11 + 320 <= f) {
            b2.l += i11;
          } else {
            int i12;
            if ((i12 = b2.j + 16) >= f)
              i12 -= f; 
            j = b2.j;
            k = b2.m >> 4;
            i5 = b2.k >> 4;
            i6 = 0;
            int i13 = i5;
            int i14 = i8 - k + h - i5;
            byte b3;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, i9, b3 + i14, j, i6);
              i6 += 16;
            } 
            i13 = h - i5;
            i14 = i8 - k;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, i9, b3 + i14, j, i6);
              i6 += 16;
            } 
            b2.l = b2.l + i11 - 16;
            b2.j = i12;
          } 
        } else if (j < b2.n) {
          int i11 = b2.n - j;
          if (b2.l - i11 >= 0) {
            b2.l -= i11;
          } else {
            int i12;
            if ((i12 = b2.j - 16) < 0)
              i12 += f; 
            j = b2.m >> 4;
            k = i12;
            i5 = b2.k >> 4;
            i6 = 0;
            int i13 = i5;
            int i14 = i8 - j + h - i5;
            byte b3;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, i7, b3 + i14, k, i6);
              i6 += 16;
            } 
            i13 = h - i5;
            i14 = i8 - j;
            for (b3 = 0; b3 < i13 && b3 + i14 < b2.b; b3++) {
              b2.d((Graphics)d, i7, b3 + i14, k, i6);
              i6 += 16;
            } 
            b2.l = b2.l - i11 + 16;
            b2.j = i12;
          } 
        } else if (k < b2.p) {
          int i11 = b2.p - k;
          if (b2.m - i11 >= 0) {
            b2.m -= i11;
          } else {
            int i12;
            if ((i12 = b2.k - 16) < 0)
              i12 += i; 
            j = b2.l >> 4;
            k = i12;
            i5 = b2.j >> 4;
            i6 = 0;
            int i13 = i5;
            int i14 = i7 - j + g - i5;
            byte b3;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, b3 + i14, i8, i6, k);
              i6 += 16;
            } 
            i13 = g - i5;
            i14 = i7 - j;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, b3 + i14, i8, i6, k);
              i6 += 16;
            } 
            b2.m = b2.m - i11 + 16;
            b2.k = i12;
          } 
        } else if (k > b2.p) {
          int i11 = k - b2.p;
          if (b2.m + i11 + 360 <= i) {
            b2.m += i11;
          } else {
            int i12;
            if ((i12 = b2.k + 16) >= i)
              i12 -= i; 
            j = b2.k;
            k = b2.l >> 4;
            i5 = b2.j >> 4;
            i6 = 0;
            int i13 = i5;
            int i14 = i7 - k + g - i5;
            byte b3;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, b3 + i14, i10, i6, j);
              i6 += 16;
            } 
            i13 = g - i5;
            i14 = i7 - k;
            for (b3 = 0; b3 < i13; b3++) {
              b2.d((Graphics)d, b3 + i14, i10, i6, j);
              i6 += 16;
            } 
            b2.m = b2.m + i11 - 16;
            b2.k = i12;
          } 
        } 
      } 
    } 
    Graphics graphics = paramGraphics;
    k = (b1 = this).j + b1.l;
    int m = b1.k + b1.m;
    int n;
    if ((n = f - k) > 320)
      n = 320; 
    int i1;
    if ((i1 = i - m) > 360)
      i1 = 360; 
    if (n > 0 && i1 > 0)
      bi.d(graphics, c, 0, 0, k, m, n, i1); 
    int i2 = n;
    int i3 = 360 - i1;
    if (i2 > 0 && i3 > 0)
      bi.d(graphics, c, 0, i1, k, 0, i2, i3); 
    int i4 = 320 - n;
    int i = i1;
    if (i4 > 0 && i > 0)
      bi.d(graphics, c, n, 0, 0, m, i4, i); 
    k = i4;
    m = 360 - i;
    if (k > 0 && m > 0)
      bi.d(graphics, c, n, i, 0, 0, k, m); 
    this.n = paramInt1;
    this.p = paramInt2;
  }
  
  public final void d(e parame, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    b b1;
    e e1;
    e e2;
    e e4;
    byte b2;
    e e3;
    int n;
    int i1;
    int i2;
    int k = paramInt4 >> 4;
    int m = paramInt5 >> 4;
    if (k < 0 || k >= this.a || m < 0 || m >= this.b)
      return; 
    h h = new h();
    if (parame.d()) {
      m m1;
      (m1 = parame.d).e(h);
      h.d(((e)m1).ab, ((e)m1).ac);
      if (!h.d() && !h.d(paramInt4, paramInt5)) {
        paramInt4 = ((paramInt4 = (paramInt4 < h.d) ? h.d : paramInt4) > h.c) ? h.c : paramInt4;
        paramInt5 = ((paramInt5 = (paramInt5 > h.b) ? h.b : paramInt5) < h.e) ? h.e : paramInt5;
      } 
      if (paramBoolean) {
        ba.c.d(parame, paramInt4, paramInt5);
        return;
      } 
      ba.e.d(parame, paramInt4, paramInt5);
      return;
    } 
    m = paramInt1;
    if (parame.c)
      switch (paramInt1) {
        case 0:
          m = 1;
          break;
        case 1:
          m = 0;
          break;
        case 2:
          m = 3;
          break;
        case 3:
          m = 2;
          break;
      }  
    switch (m) {
      case 0:
        j = paramInt5;
        paramInt5 = paramInt4;
        paramInt4 = paramInt3;
        paramInt3 = paramInt2;
        e1 = parame;
        b1 = this;
        m = paramInt3 >> 4;
        n = paramInt4 >> 4;
        i1 = j >> 4;
        if (paramInt3 - (m << 4) == 0 && (!b1.d(paramInt3 - 1 >> 4, i1) || !b1.d(m, i1))) {
          e1.f = paramInt3;
          e1.i = paramInt4;
          b1.d(e1);
          break;
        } 
        i1 = Math.abs(n - i1) + 1;
        i2 = n;
        for (n = 0; n < i1 && b1.d(m, i2 - 1) && !b1.d(e1, m << 4, i2 << 4); n++)
          i2--; 
        n = (i2 << 4) + 4;
        if (j < n)
          j = n; 
        if (j != paramInt4 || e1.d != true) {
          e1.f = paramInt5;
          e1.i = j;
          break;
        } 
        e1.f = paramInt5;
        e1.i = j;
        b1.d(e1);
        break;
      case 1:
        j = paramInt5;
        paramInt5 = paramInt4;
        paramInt4 = paramInt3;
        e2 = e1;
        e1 = parame;
        b1 = this;
        m = e2 >> 4;
        n = paramInt4 >> 4;
        i1 = j >> 4;
        if (e2 - (m << 4) == 0 && (!b1.d(e2 - 1 >> 4, i1) || !b1.d(m, i1))) {
          e1.f = e2;
          e1.i = paramInt4;
          b1.d(e1);
          break;
        } 
        i1 = Math.abs(n - i1) + 1;
        i2 = n + 1;
        for (n = 0; n < i1 && b1.d(m, i2) && !b1.d(e1, m << 4, i2 - 1 << 4); n++)
          i2++; 
        n = (i2 << 4) - 1;
        if (j > n)
          j = n; 
        if (j != paramInt4 || e1.d != true) {
          e1.f = paramInt5;
          e1.i = j;
          break;
        } 
        e1.f = paramInt5;
        e1.i = j;
        b1.d(e1);
        break;
      case 2:
        j = paramInt5;
        paramInt5 = paramInt4;
        e4 = e2;
        e2 = e1;
        e1 = parame;
        b1 = this;
        m = e2 >> 4;
        n = e4 >> 4;
        i1 = paramInt5 >> 4;
        if (e4 - (n << 4) == 0 && (!b1.d(i1, e4 - 1 >> 4) || !b1.d(i1, n))) {
          e1.f = e2;
          e1.i = e4;
          b1.d(e1);
          break;
        } 
        i1 = Math.abs(m - i1) + 1;
        i2 = m;
        for (b2 = 0; b2 < i1 && b1.d(i2 - 1, n) && !b1.d(e1, i2 << 4, n << 4); b2++)
          i2--; 
        n = (i2 << 4) + 5;
        if (paramInt5 < n)
          paramInt5 = n; 
        if (paramInt5 != e2 || e1.d != true) {
          e1.f = paramInt5;
          e1.i = j;
          break;
        } 
        e1.f = paramInt5;
        e1.i = j;
        b1.d(e1);
        break;
      case 3:
        j = paramInt5;
        paramInt5 = b2;
        e3 = e2;
        e2 = e1;
        e1 = parame;
        b1 = this;
        m = e2 >> 4;
        n = e3 >> 4;
        i1 = paramInt5 >> 4;
        if (e3 - (n << 4) == 0 && (!b1.d(i1, e3 - 1 >> 4) || !b1.d(i1, n))) {
          e1.f = e2;
          e1.i = e3;
          b1.d(e1);
          break;
        } 
        i1 = Math.abs(m - i1) + 1;
        i2 = m + 1;
        for (i = 0; i < i1 && b1.d(i2, n) && !b1.d(e1, i2 - 1 << 4, n << 4); i++)
          i2++; 
        n = (i2 << 4) - 5;
        if (paramInt5 > n)
          paramInt5 = n; 
        if (paramInt5 != e2 || e1.d != true) {
          e1.f = paramInt5;
          e1.i = j;
          break;
        } 
        e1.f = paramInt5;
        e1.i = j;
        b1.d(e1);
        break;
    } 
    int i = parame.f;
    boolean bool = parame.i;
    int j = i >> 4;
    m = bool >> 4;
    if (this.d[this.d[j] + m] == 10 && (parame.d == 0L || aq.d - parame.d > 500L)) {
      parame.d = aq.d;
      ba.d.d(i, bool);
    } 
    if (paramBoolean) {
      ba.c.d(parame, i, bool);
      return;
    } 
    ba.e.d(parame, i, bool);
  }
  
  private boolean d(e parame, int paramInt1, int paramInt2) {
    return (parame == ba.d && d(paramInt1, paramInt2) != null && (ba.d == null || ba.d.e()));
  }
  
  private void d(e parame) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: astore_3
    //   3: astore_2
    //   4: aload_3
    //   5: getfield d : I
    //   8: iconst_1
    //   9: if_icmpeq -> 16
    //   12: iconst_0
    //   13: goto -> 757
    //   16: aload_3
    //   17: getfield ab : I
    //   20: aload_3
    //   21: getfield f : I
    //   24: if_icmpeq -> 47
    //   27: aload_3
    //   28: getfield b : I
    //   31: iconst_2
    //   32: if_icmpeq -> 43
    //   35: aload_3
    //   36: getfield b : I
    //   39: iconst_3
    //   40: if_icmpne -> 47
    //   43: iconst_0
    //   44: goto -> 757
    //   47: aload_3
    //   48: getfield ac : I
    //   51: aload_3
    //   52: getfield i : I
    //   55: if_icmpeq -> 77
    //   58: aload_3
    //   59: getfield b : I
    //   62: ifeq -> 73
    //   65: aload_3
    //   66: getfield b : I
    //   69: iconst_1
    //   70: if_icmpne -> 77
    //   73: iconst_0
    //   74: goto -> 757
    //   77: aload_3
    //   78: getfield ab : I
    //   81: istore #4
    //   83: aload_3
    //   84: getfield ac : I
    //   87: istore #5
    //   89: iload #4
    //   91: iconst_4
    //   92: ishr
    //   93: istore #6
    //   95: iload #5
    //   97: iconst_4
    //   98: ishr
    //   99: istore #7
    //   101: iload #6
    //   103: ifle -> 133
    //   106: iload #7
    //   108: ifle -> 133
    //   111: iload #6
    //   113: aload_2
    //   114: getfield a : I
    //   117: iconst_1
    //   118: isub
    //   119: if_icmpge -> 133
    //   122: iload #7
    //   124: aload_2
    //   125: getfield b : I
    //   128: iconst_1
    //   129: isub
    //   130: if_icmplt -> 137
    //   133: iconst_0
    //   134: goto -> 757
    //   137: iload #5
    //   139: aload_3
    //   140: getfield c : I
    //   143: isub
    //   144: dup
    //   145: istore #8
    //   147: ifge -> 153
    //   150: iconst_0
    //   151: istore #8
    //   153: iload #5
    //   155: aload_3
    //   156: getfield c : I
    //   159: iadd
    //   160: dup
    //   161: istore #9
    //   163: aload_2
    //   164: getfield c : I
    //   167: if_icmple -> 176
    //   170: aload_2
    //   171: getfield c : I
    //   174: istore #9
    //   176: iload #4
    //   178: aload_3
    //   179: getfield c : I
    //   182: isub
    //   183: dup
    //   184: istore #10
    //   186: ifge -> 192
    //   189: iconst_0
    //   190: istore #10
    //   192: iload #4
    //   194: aload_3
    //   195: getfield c : I
    //   198: iadd
    //   199: dup
    //   200: istore #11
    //   202: aload_2
    //   203: getfield e : I
    //   206: if_icmple -> 215
    //   209: aload_2
    //   210: getfield e : I
    //   213: istore #11
    //   215: aload_2
    //   216: aload_3
    //   217: getfield ab : I
    //   220: aload_3
    //   221: getfield ac : I
    //   224: iload #4
    //   226: iload #8
    //   228: iconst_0
    //   229: invokespecial d : (IIIII)Z
    //   232: ifeq -> 252
    //   235: invokestatic d : ()Lcom/fs/arpg/l;
    //   238: iload #4
    //   240: iload #8
    //   242: invokevirtual d : (II)Z
    //   245: ifeq -> 252
    //   248: iconst_1
    //   249: goto -> 253
    //   252: iconst_0
    //   253: istore #8
    //   255: aload_2
    //   256: aload_3
    //   257: getfield ab : I
    //   260: aload_3
    //   261: getfield ac : I
    //   264: iload #4
    //   266: iload #9
    //   268: iconst_1
    //   269: invokespecial d : (IIIII)Z
    //   272: ifeq -> 292
    //   275: invokestatic d : ()Lcom/fs/arpg/l;
    //   278: iload #4
    //   280: iload #9
    //   282: invokevirtual d : (II)Z
    //   285: ifeq -> 292
    //   288: iconst_1
    //   289: goto -> 293
    //   292: iconst_0
    //   293: istore #9
    //   295: aload_2
    //   296: aload_3
    //   297: getfield ab : I
    //   300: aload_3
    //   301: getfield ac : I
    //   304: iload #10
    //   306: iload #5
    //   308: iconst_2
    //   309: invokespecial d : (IIIII)Z
    //   312: ifeq -> 332
    //   315: invokestatic d : ()Lcom/fs/arpg/l;
    //   318: iload #10
    //   320: iload #5
    //   322: invokevirtual d : (II)Z
    //   325: ifeq -> 332
    //   328: iconst_1
    //   329: goto -> 333
    //   332: iconst_0
    //   333: istore #10
    //   335: aload_2
    //   336: aload_3
    //   337: getfield ab : I
    //   340: aload_3
    //   341: getfield ac : I
    //   344: iload #11
    //   346: iload #5
    //   348: iconst_3
    //   349: invokespecial d : (IIIII)Z
    //   352: ifeq -> 372
    //   355: invokestatic d : ()Lcom/fs/arpg/l;
    //   358: iload #11
    //   360: iload #5
    //   362: invokevirtual d : (II)Z
    //   365: ifeq -> 372
    //   368: iconst_1
    //   369: goto -> 373
    //   372: iconst_0
    //   373: istore #11
    //   375: iconst_0
    //   376: istore #4
    //   378: iconst_0
    //   379: istore #5
    //   381: aload_3
    //   382: getfield b : I
    //   385: tableswitch default -> 749, 0 -> 416, 1 -> 501, 2 -> 584, 3 -> 669
    //   416: aload_2
    //   417: iload #6
    //   419: iconst_1
    //   420: isub
    //   421: iload #7
    //   423: iconst_1
    //   424: isub
    //   425: invokevirtual d : (II)Z
    //   428: istore #12
    //   430: aload_2
    //   431: iload #6
    //   433: iconst_1
    //   434: iadd
    //   435: iload #7
    //   437: iconst_1
    //   438: isub
    //   439: invokevirtual d : (II)Z
    //   442: istore #13
    //   444: iload #10
    //   446: ifeq -> 471
    //   449: iload #12
    //   451: ifeq -> 471
    //   454: aload_3
    //   455: getfield ab : I
    //   458: aload_3
    //   459: getfield c : I
    //   462: isub
    //   463: istore #4
    //   465: aload_3
    //   466: getfield ac : I
    //   469: istore #5
    //   471: iload #11
    //   473: ifeq -> 749
    //   476: iload #13
    //   478: ifeq -> 749
    //   481: aload_3
    //   482: getfield ab : I
    //   485: aload_3
    //   486: getfield c : I
    //   489: iadd
    //   490: istore #4
    //   492: aload_3
    //   493: getfield ac : I
    //   496: istore #5
    //   498: goto -> 749
    //   501: aload_2
    //   502: iload #6
    //   504: iconst_1
    //   505: isub
    //   506: iload #7
    //   508: iconst_1
    //   509: iadd
    //   510: invokevirtual d : (II)Z
    //   513: istore #13
    //   515: aload_2
    //   516: iload #6
    //   518: iconst_1
    //   519: iadd
    //   520: iload #7
    //   522: iconst_1
    //   523: iadd
    //   524: invokevirtual d : (II)Z
    //   527: istore_2
    //   528: iload #10
    //   530: ifeq -> 555
    //   533: iload #13
    //   535: ifeq -> 555
    //   538: aload_3
    //   539: getfield ab : I
    //   542: aload_3
    //   543: getfield c : I
    //   546: isub
    //   547: istore #4
    //   549: aload_3
    //   550: getfield ac : I
    //   553: istore #5
    //   555: iload #11
    //   557: ifeq -> 749
    //   560: iload_2
    //   561: ifeq -> 749
    //   564: aload_3
    //   565: getfield ab : I
    //   568: aload_3
    //   569: getfield c : I
    //   572: iadd
    //   573: istore #4
    //   575: aload_3
    //   576: getfield ac : I
    //   579: istore #5
    //   581: goto -> 749
    //   584: aload_2
    //   585: iload #6
    //   587: iconst_1
    //   588: isub
    //   589: iload #7
    //   591: iconst_1
    //   592: iadd
    //   593: invokevirtual d : (II)Z
    //   596: istore #13
    //   598: aload_2
    //   599: iload #6
    //   601: iconst_1
    //   602: isub
    //   603: iload #7
    //   605: iconst_1
    //   606: isub
    //   607: invokevirtual d : (II)Z
    //   610: istore #12
    //   612: iload #9
    //   614: ifeq -> 639
    //   617: iload #13
    //   619: ifeq -> 639
    //   622: aload_3
    //   623: getfield ac : I
    //   626: aload_3
    //   627: getfield c : I
    //   630: iadd
    //   631: istore #5
    //   633: aload_3
    //   634: getfield ab : I
    //   637: istore #4
    //   639: iload #8
    //   641: ifeq -> 749
    //   644: iload #12
    //   646: ifeq -> 749
    //   649: aload_3
    //   650: getfield ac : I
    //   653: aload_3
    //   654: getfield c : I
    //   657: isub
    //   658: istore #5
    //   660: aload_3
    //   661: getfield ab : I
    //   664: istore #4
    //   666: goto -> 749
    //   669: aload_2
    //   670: iload #6
    //   672: iconst_1
    //   673: iadd
    //   674: iload #7
    //   676: iconst_1
    //   677: isub
    //   678: invokevirtual d : (II)Z
    //   681: istore #13
    //   683: aload_2
    //   684: iload #6
    //   686: iconst_1
    //   687: iadd
    //   688: iload #7
    //   690: iconst_1
    //   691: iadd
    //   692: invokevirtual d : (II)Z
    //   695: istore_2
    //   696: iload #9
    //   698: ifeq -> 722
    //   701: iload_2
    //   702: ifeq -> 722
    //   705: aload_3
    //   706: getfield ac : I
    //   709: aload_3
    //   710: getfield c : I
    //   713: iadd
    //   714: istore #5
    //   716: aload_3
    //   717: getfield ab : I
    //   720: istore #4
    //   722: iload #8
    //   724: ifeq -> 749
    //   727: iload #13
    //   729: ifeq -> 749
    //   732: aload_3
    //   733: getfield ac : I
    //   736: aload_3
    //   737: getfield c : I
    //   740: isub
    //   741: istore #5
    //   743: aload_3
    //   744: getfield ab : I
    //   747: istore #4
    //   749: iload #4
    //   751: bipush #16
    //   753: ishl
    //   754: iload #5
    //   756: ior
    //   757: dup
    //   758: istore_2
    //   759: ifne -> 763
    //   762: return
    //   763: aload_1
    //   764: iload_2
    //   765: bipush #16
    //   767: ishr
    //   768: putfield f : I
    //   771: aload_1
    //   772: iload_2
    //   773: ldc 65535
    //   775: iand
    //   776: putfield i : I
    //   779: return
  }
  
  private boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 >>= 4;
    paramInt2 >>= 4;
    paramInt3 >>= 4;
    paramInt4 >>= 4;
    switch (paramInt5) {
      case 0:
        for (paramInt5 = paramInt4; paramInt5 <= paramInt2; paramInt5++) {
          if (!d(paramInt1, paramInt5))
            return false; 
        } 
        break;
      case 1:
        for (paramInt5 = paramInt2; paramInt5 <= paramInt4; paramInt5++) {
          if (!d(paramInt1, paramInt5))
            return false; 
        } 
        break;
      case 2:
        for (paramInt5 = paramInt3; paramInt5 <= paramInt1; paramInt5++) {
          if (!d(paramInt5, paramInt2))
            return false; 
        } 
        break;
      case 3:
        for (paramInt5 = paramInt1; paramInt5 <= paramInt3; paramInt5++) {
          if (!d(paramInt5, paramInt2))
            return false; 
        } 
        break;
    } 
    return true;
  }
  
  public final boolean e() {
    int i = ((p)ba.d).ab >> 4;
    int j = ((p)ba.d).ac >> 4;
    byte b1 = ((p)ba.d).b;
    return (i < 0 || j < 0) ? false : ((i >= this.a || j >= this.b) ? false : ((this.d[this.d[i] + j] >= 5 && b1 + 5 == this.d[this.d[i] + j])));
  }
  
  public final int d() {
    int i = ((p)ba.d).ab >> 4;
    int j = ((p)ba.d).ac >> 4;
    byte b1 = ((p)ba.d).b;
    do {
      if (b1 == 0)
        j--; 
      if (b1 == 1)
        j++; 
      if (b1 == 2)
        i--; 
      if (b1 != 3)
        continue; 
      i++;
    } while (this.d[this.d[i] + j] == 3);
    switch (b1) {
      case 0:
        j--;
        break;
      case 1:
        j++;
        break;
      case 2:
        i--;
        break;
      case 3:
        i++;
        break;
    } 
    return i << 16 | j;
  }
  
  public final int e() {
    int i = ((p)ba.d).ab >> 4;
    int j = ((p)ba.d).ac >> 4;
    byte b1 = ((p)ba.d).b;
    byte b2 = 0;
    do {
      if (b1 == 0)
        j--; 
      if (b1 == 1)
        j++; 
      if (b1 == 2)
        i--; 
      if (b1 == 3)
        i++; 
      b2++;
    } while (this.d[this.d[i] + j] == 3);
    switch (b1) {
      case 0:
        j--;
        break;
      case 1:
        j++;
        break;
      case 2:
        i--;
        break;
      case 3:
        i++;
        break;
    } 
    if (this.d[this.d[i] + j] != 3)
      b2++; 
    return b2 << 4;
  }
  
  public final boolean d(int paramInt1, int paramInt2) {
    return (paramInt1 < 0 || paramInt2 < 0) ? false : ((paramInt1 >= this.a || paramInt2 >= this.b) ? false : ((this.d[this.d[paramInt1] + paramInt2] != 3)));
  }
  
  public final void d(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeUTF((String)this.d);
    paramDataOutputStream.writeShort(this.d);
    int i = this.d.d();
    paramDataOutputStream.writeShort(i);
    int j;
    for (j = 0; j < i; j++) {
      paramDataOutputStream.writeShort(this.d.d(j));
      m m = (m)this.d.d(j);
      paramDataOutputStream.writeUTF((String)m.d);
    } 
    if (this.e == null) {
      paramDataOutputStream.writeShort(0);
    } else {
      j = this.e.d();
      paramDataOutputStream.writeShort(j);
      for (byte b2 = 0; b2 < j; b2++) {
        paramDataOutputStream.writeShort(this.e.d(b2));
        m m = (m)this.e.d(b2);
        paramDataOutputStream.writeUTF((String)m.d);
      } 
    } 
    DataOutputStream dataOutputStream = paramDataOutputStream;
    b b1 = this;
    dataOutputStream.writeShort(b1.y);
    for (j = 0; j < b1.y; j++)
      dataOutputStream.writeLong(b1.d[j]); 
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    this.d = (be[])new long[20];
    this.d = new be[20];
    this.y = 0;
    this.d = (be[])paramDataInputStream.readUTF();
    this.d = paramDataInputStream.readShort();
    d((String)this.d);
    this.d.d();
    this.e = null;
    Hashtable hashtable = new Hashtable();
    short s = paramDataInputStream.readShort();
    short s1;
    for (s1 = 0; s1 < s; s1++) {
      short s2 = paramDataInputStream.readShort();
      String str = paramDataInputStream.readUTF();
      m m;
      if ((m = (m)hashtable.get(str)) == null) {
        m = new m(str);
        hashtable.put(str, m);
      } 
      this.d.d(s2, m);
    } 
    hashtable.clear();
    if ((s1 = paramDataInputStream.readShort()) != 0) {
      this.e = (byte[])new bh();
      for (byte b1 = 0; b1 < s1; b1++) {
        short s2 = paramDataInputStream.readShort();
        String str = paramDataInputStream.readUTF();
        m m;
        if ((m = (m)hashtable.get(str)) == null) {
          m = new m(str);
          hashtable.put(str, m);
        } 
        this.e.d(s2, m);
      } 
    } 
    e(paramDataInputStream);
  }
  
  public final int d(x paramx, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    if (paramInt1 == paramInt3 && paramInt4 == paramInt2)
      return 10; 
    if (paramBoolean) {
      paramInt2 = paramInt4;
      paramInt1 = paramInt3;
      int m = paramInt2;
      int n = paramInt1;
      x x1 = paramx;
      paramInt3 = 10;
      if (n != paramInt1)
        if (n < paramInt1) {
          paramInt3 = 3;
        } else {
          paramInt3 = 2;
        }  
      paramInt1 = 10;
      if (m != paramInt2)
        if (m < paramInt2) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }  
      return (x1.b == paramInt3 || x1.b == paramInt1) ? x1.b : ((paramInt3 == 10) ? ((paramInt1 == 10) ? 10 : paramInt1) : ((paramInt1 != 10 && paramInt3 == x1.b) ? paramInt1 : paramInt3));
    } 
    this.s = paramInt3;
    this.r = paramInt4;
    d(paramInt3, paramInt4, -101);
    d(paramInt1, paramInt2, -100);
    this.e = false;
    int i = paramInt1;
    int j = paramInt2;
    for (byte b1 = 0; b1 < 20 && this.e == null; b1++) {
      int i1;
      if (b1 == 0) {
        i1 = -1;
      } else {
        i1 = this.o;
        byte b2 = c(this.o);
        i = d(this.o);
        j = e(this.o);
        c(this.o, -1);
        e(this.o, -1);
        if (b2 >= 0) {
          c(b2, -1);
          this.o = b2;
        } else {
          this.o = 0;
        } 
      } 
      int m = i;
      int n = j - 1;
      d(m, n, i1);
      m = i;
      n = j + 1;
      d(m, n, i1);
      m = i - 1;
      n = j;
      d(m, n, i1);
      m = i + 1;
      n = j;
      d(m, n, i1);
    } 
    int k = this.o;
    i = 0;
    j = 0;
    while (k != -1) {
      i = d(k);
      j = e(k);
      int m = k;
      k = (byte)this.b[m];
    } 
    d(paramInt1, paramInt2, 0);
    d(paramInt3, paramInt4, 0);
    for (paramInt3 = 0; paramInt3 < this.a.length; paramInt3++)
      d(d(paramInt3), e(paramInt3), 0); 
    this.o = 0;
    this.q = 0;
    return (i == 0 && j == 0) ? 10 : ((paramInt1 > i) ? 2 : ((paramInt1 < i) ? 3 : ((paramInt2 > j) ? 0 : ((paramInt2 < j) ? 1 : 10))));
  }
  
  private boolean d(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: ifeq -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: iload_1
    //   10: iflt -> 33
    //   13: iload_1
    //   14: aload_0
    //   15: getfield a : I
    //   18: if_icmpge -> 33
    //   21: iload_2
    //   22: iflt -> 33
    //   25: iload_2
    //   26: aload_0
    //   27: getfield b : I
    //   30: if_icmplt -> 35
    //   33: iconst_0
    //   34: ireturn
    //   35: aload_0
    //   36: getfield d : [B
    //   39: aload_0
    //   40: getfield d : [S
    //   43: iload_1
    //   44: saload
    //   45: iload_2
    //   46: iadd
    //   47: baload
    //   48: iconst_3
    //   49: if_icmpne -> 54
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_0
    //   55: iload_1
    //   56: iload_2
    //   57: invokespecial d : (II)B
    //   60: bipush #-101
    //   62: if_icmpne -> 70
    //   65: aload_0
    //   66: iconst_1
    //   67: putfield e : Z
    //   70: aload_0
    //   71: iload_1
    //   72: iload_2
    //   73: invokespecial d : (II)B
    //   76: ifeq -> 92
    //   79: aload_0
    //   80: iload_1
    //   81: iload_2
    //   82: invokespecial d : (II)B
    //   85: bipush #-101
    //   87: if_icmpeq -> 92
    //   90: iconst_0
    //   91: ireturn
    //   92: aload_0
    //   93: astore #4
    //   95: iload_1
    //   96: aload #4
    //   98: getfield s : I
    //   101: isub
    //   102: invokestatic abs : (I)I
    //   105: iload_2
    //   106: aload #4
    //   108: getfield r : I
    //   111: isub
    //   112: invokestatic abs : (I)I
    //   115: iadd
    //   116: istore #4
    //   118: aload_0
    //   119: iload_1
    //   120: iload_2
    //   121: iload_3
    //   122: iload #4
    //   124: istore_2
    //   125: istore_1
    //   126: istore #6
    //   128: istore #5
    //   130: dup
    //   131: astore #4
    //   133: iload #5
    //   135: iload #6
    //   137: aload #4
    //   139: getfield q : I
    //   142: bipush #50
    //   144: iadd
    //   145: invokespecial d : (III)V
    //   148: aload #4
    //   150: getfield b : [I
    //   153: aload #4
    //   155: getfield q : I
    //   158: iload #5
    //   160: sipush #255
    //   163: iand
    //   164: bipush #16
    //   166: ishl
    //   167: iload #6
    //   169: sipush #255
    //   172: iand
    //   173: bipush #8
    //   175: ishl
    //   176: ior
    //   177: iload_1
    //   178: sipush #255
    //   181: iand
    //   182: ior
    //   183: iastore
    //   184: aload #4
    //   186: getfield a : [I
    //   189: aload #4
    //   191: getfield q : I
    //   194: ldc -65536
    //   196: iload_2
    //   197: sipush #255
    //   200: iand
    //   201: bipush #8
    //   203: ishl
    //   204: ior
    //   205: iastore
    //   206: aload #4
    //   208: aload #4
    //   210: getfield q : I
    //   213: iload_2
    //   214: istore_3
    //   215: istore_2
    //   216: dup
    //   217: astore_1
    //   218: getfield o : I
    //   221: ifne -> 235
    //   224: aload_1
    //   225: getfield q : I
    //   228: aload_1
    //   229: getfield o : I
    //   232: if_icmpeq -> 419
    //   235: aload_1
    //   236: getfield o : I
    //   239: istore #5
    //   241: aload_1
    //   242: iload #5
    //   244: invokespecial a : (I)B
    //   247: dup
    //   248: istore #6
    //   250: iload_3
    //   251: if_icmplt -> 276
    //   254: aload_1
    //   255: iload_2
    //   256: iload #5
    //   258: invokespecial e : (II)V
    //   261: aload_1
    //   262: iload #5
    //   264: iload_2
    //   265: invokespecial c : (II)V
    //   268: aload_1
    //   269: iload_2
    //   270: putfield o : I
    //   273: goto -> 419
    //   276: iconst_0
    //   277: istore #7
    //   279: iload #6
    //   281: iload_3
    //   282: if_icmpgt -> 318
    //   285: aload_1
    //   286: iload #5
    //   288: invokespecial c : (I)B
    //   291: dup
    //   292: istore #8
    //   294: ifge -> 303
    //   297: iconst_1
    //   298: istore #7
    //   300: goto -> 318
    //   303: aload_1
    //   304: iload #8
    //   306: invokespecial a : (I)B
    //   309: istore #6
    //   311: iload #8
    //   313: istore #5
    //   315: goto -> 279
    //   318: iconst_0
    //   319: istore #8
    //   321: iload #7
    //   323: ifne -> 358
    //   326: aload_1
    //   327: iload #5
    //   329: invokespecial b : (I)B
    //   332: iconst_m1
    //   333: if_icmpeq -> 358
    //   336: aload_1
    //   337: aload_1
    //   338: iload #5
    //   340: invokespecial b : (I)B
    //   343: invokespecial c : (I)B
    //   346: iconst_m1
    //   347: if_icmpeq -> 358
    //   350: aload_1
    //   351: iload #5
    //   353: invokespecial b : (I)B
    //   356: istore #8
    //   358: iload #7
    //   360: ifeq -> 367
    //   363: iload #5
    //   365: istore #8
    //   367: aload_1
    //   368: iload #8
    //   370: iload_2
    //   371: invokespecial e : (II)V
    //   374: aload_1
    //   375: iload_2
    //   376: iload #8
    //   378: invokespecial c : (II)V
    //   381: iload #7
    //   383: ifne -> 400
    //   386: aload_1
    //   387: iload #5
    //   389: iload_2
    //   390: invokespecial c : (II)V
    //   393: aload_1
    //   394: iload_2
    //   395: iload #5
    //   397: invokespecial e : (II)V
    //   400: iload #7
    //   402: ifne -> 419
    //   405: iload #5
    //   407: aload_1
    //   408: getfield o : I
    //   411: if_icmpne -> 419
    //   414: aload_1
    //   415: iload_2
    //   416: putfield o : I
    //   419: aload #4
    //   421: dup
    //   422: getfield q : I
    //   425: iconst_1
    //   426: iadd
    //   427: putfield q : I
    //   430: iconst_0
    //   431: ireturn
  }
  
  private byte d(int paramInt1, int paramInt2) {
    paramInt1 = this.d[paramInt1] + paramInt2;
    return this.e[paramInt1];
  }
  
  private void d(int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.d[paramInt1] + paramInt2;
    this.e[paramInt1] = (byte)paramInt3;
  }
  
  private byte d(int paramInt) {
    return (byte)(this.b[paramInt] >> 16);
  }
  
  private byte e(int paramInt) {
    return (byte)(this.b[paramInt] >> 8);
  }
  
  private void e(int paramInt1, int paramInt2) {
    this.a[paramInt1] = this.a[paramInt1] & 0xFFFFFF;
    this.a[paramInt1] = this.a[paramInt1] | (paramInt2 & 0xFF) << 24;
  }
  
  private byte c(int paramInt) {
    return this.a[paramInt] >> 24;
  }
  
  private byte b(int paramInt) {
    return (byte)(this.a[paramInt] >> 16);
  }
  
  private void c(int paramInt1, int paramInt2) {
    this.a[paramInt1] = this.a[paramInt1] & 0xFF00FFFF;
    this.a[paramInt1] = this.a[paramInt1] | (paramInt2 & 0xFF) << 16;
  }
  
  private byte a(int paramInt) {
    return (byte)(this.a[paramInt] >> 8);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\b.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */