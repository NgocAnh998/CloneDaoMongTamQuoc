package com.fs.arpg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class x extends e {
  private be c;
  
  private long c;
  
  private int x = 1;
  
  public int j;
  
  public String e;
  
  private be b;
  
  boolean j;
  
  boolean k;
  
  public static int[] b;
  
  public static int k;
  
  public static int l;
  
  as d;
  
  int m;
  
  private m b = (m)new be();
  
  private m a;
  
  private m z;
  
  m e;
  
  m c;
  
  boolean l;
  
  private int y;
  
  private int B;
  
  int n;
  
  long e;
  
  int p;
  
  boolean m;
  
  int o;
  
  int q;
  
  int s;
  
  int r;
  
  int t;
  
  boolean n = true;
  
  int u;
  
  boolean p;
  
  be d;
  
  int v;
  
  ao d;
  
  ao e;
  
  private int A;
  
  private Image e = n.d().d((short)359);
  
  boolean o = true;
  
  int w = -1;
  
  boolean q;
  
  private static h c = new h();
  
  private void g(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x80;
      return;
    } 
    this.A &= 0x7F;
  }
  
  public final boolean e() {
    return ((this.A >> 7 & 0x1) == 1);
  }
  
  public final void c(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x40;
      return;
    } 
    this.A &= 0xBF;
  }
  
  public final boolean c() {
    return ((this.A >> 6 & 0x1) == 1);
  }
  
  public final void b(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x20;
      return;
    } 
    this.A &= 0xDF;
  }
  
  public final boolean b() {
    return ((this.A >> 5 & 0x1) == 1);
  }
  
  private void f(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x10;
      return;
    } 
    this.A &= 0xEF;
  }
  
  public final void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x1;
      return;
    } 
    this.A &= 0xFE;
  }
  
  public final void z(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x2;
      return;
    } 
    this.A &= 0xFD;
  }
  
  public final void h(boolean paramBoolean) {
    if (paramBoolean) {
      this.A |= 0x4;
      return;
    } 
    this.A &= 0xFB;
  }
  
  public x() {
    v.d().d((short)102, (be)this.b);
    ((be)this.b).c = 6;
    this.b.v();
    b(true);
  }
  
  public final void d(int paramInt) {
    this.z = false;
    this.n = false;
  }
  
  private void m() {
    if (this.z < null) {
      this.n = false;
      return;
    } 
    this.n = this.z * 100 / this.g;
  }
  
  public final void d(m paramm, int paramInt) {
    switch (paramInt) {
      case 0:
        this.b = paramm;
        return;
      case 1:
        this.a = paramm;
        return;
      case 2:
        this.z = paramm;
        this.u = this.ab << 16 | this.ac & 0xFFFF;
        return;
      case 3:
        this.e = (Image)paramm;
        return;
    } 
  }
  
  public final m d(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.b;
      case 1:
        return this.a;
      case 2:
        return this.z;
      case 3:
        return (m)this.e;
    } 
    return null;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.u = paramInt1 << 16 | paramInt2 & 0xFFFF;
  }
  
  public final void e(int paramInt1, int paramInt2) {
    if (((as)this.d).a) {
      ba.c.d(this, paramInt1, paramInt2);
      return;
    } 
    ba.e.d(this, paramInt1, paramInt2);
  }
  
  public final void a() {
    this.d = (ao)this.d.d(this.d);
  }
  
  public final void d(h paramh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/fs/arpg/be;
    //   4: ifnull -> 34
    //   7: aload_0
    //   8: getfield d : Lcom/fs/arpg/be;
    //   11: getfield e : Lcom/fs/arpg/bc;
    //   14: aload_0
    //   15: getfield d : Lcom/fs/arpg/be;
    //   18: getfield c : S
    //   21: aload_0
    //   22: getfield d : Lcom/fs/arpg/be;
    //   25: getfield d : B
    //   28: aload_1
    //   29: invokevirtual c : (IILcom/fs/arpg/h;)Lcom/fs/arpg/h;
    //   32: pop
    //   33: return
    //   34: aload_0
    //   35: getfield e : Lcom/fs/arpg/bc;
    //   38: aload_0
    //   39: getfield c : S
    //   42: aload_0
    //   43: getfield d : B
    //   46: aload_1
    //   47: invokevirtual c : (IILcom/fs/arpg/h;)Lcom/fs/arpg/h;
    //   50: pop
    //   51: return
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.d != null) {
      ((be)this.d).ab = this.ab;
      ((be)this.d).ac = this.ac;
      this.d.d(paramGraphics, paramInt1, paramInt2);
      this.d.n();
      this.v--;
      d((h)e);
    } 
    if (this.f != 0)
      return; 
    if (!this.g)
      return; 
    if (this.j) {
      ((be)this.b).ab = this.ab;
      ((be)this.b).ac = this.ac;
      this.b.e(paramGraphics, paramInt1, paramInt2);
      if (this.b.a()) {
        this.j = false;
        this.b.d();
      } else {
        this.b.u();
        return;
      } 
    } 
    if (this.d != null && !((this.d.d != 3) ? 1 : 0)) {
      this.d.d(paramGraphics, this);
      return;
    } 
    Graphics graphics = paramGraphics;
    x x1;
    if ((x1 = this).c != null) {
      x1.c(c);
      ((be)x1.c).ab = x1.ab;
      ((be)x1.c).ac = x1.ac - 35;
      ((be)x1.c).c = (short)((x1.b == 2) ? 0 : 1);
      x1.c.d(graphics, paramInt1, paramInt2);
      x1.c.n();
    } 
    e(paramGraphics, paramInt1, paramInt2);
    int j = paramInt2;
    int i = paramInt1;
    graphics = paramGraphics;
    if (!(x1 = this).l) {
      paramInt1 = x1.e.getWidth() / 5;
      paramInt2 = x1.e.getHeight();
      int[] arrayOfInt = (l.d()).e;
      x1.c((h)arrayOfInt);
      i = x1.ab - i;
      j = x1.ac - j;
      if (((x1.A & 0x1) == 1)) {
        bi.d(graphics, x1.e, i - (paramInt1 >> 1), j - arrayOfInt.d() - paramInt2, paramInt1, 0, paramInt1, paramInt2);
      } else if (((x1.A >> 2 & 0x1) == 1)) {
        bi.d(graphics, x1.e, i - (paramInt1 >> 1), j - arrayOfInt.d() - paramInt2, paramInt1 << 1, 0, paramInt1, paramInt2);
      } else if (((x1.A >> 1 & 0x1) == 1)) {
        bi.d(graphics, x1.e, i - (paramInt1 >> 1), j - arrayOfInt.d() - paramInt2, 0, 0, paramInt1, paramInt2);
      } else if (((as)x1.d).f != 0) {
        bi.d(graphics, x1.e, i - (paramInt1 >> 1), j - arrayOfInt.d() - paramInt2, paramInt1 << 2, 0, paramInt1, paramInt2);
      } else if (((as)x1.d).e) {
        bi.d(graphics, x1.e, i - (paramInt1 >> 1), j - arrayOfInt.d() - paramInt2, paramInt1 * 3, 0, paramInt1, paramInt2);
      } 
    } 
    if (this.d != null)
      this.d.d(paramGraphics, this); 
  }
  
  public final void g() {
    this.d = null;
    this.i = false;
    this.d = 2;
    this.z = this.g;
    this.ab = this.u >> 16 & 0xFFFF;
    this.ac = this.u & 0xFFFF;
    f(false);
    g(false);
    z();
    if (((as)this.d).a) {
      ba.c.e(this);
      return;
    } 
    ba.e.e(this);
  }
  
  public final void f() {
    if (l.d != null && this.d == null && this.d == 2) {
      this.d = (ao)l.d().d(this);
      return;
    } 
    if (l.d == null)
      this.d = null; 
  }
  
  public final void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Z
    //   4: ifne -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield d : Lcom/fs/arpg/bc;
    //   12: ifnull -> 16
    //   15: return
    //   16: aload_0
    //   17: getfield j : Z
    //   20: ifeq -> 24
    //   23: return
    //   24: aload_0
    //   25: aconst_null
    //   26: astore_1
    //   27: getfield A : I
    //   30: iconst_4
    //   31: ishr
    //   32: iconst_1
    //   33: iand
    //   34: iconst_1
    //   35: if_icmpne -> 42
    //   38: iconst_1
    //   39: goto -> 43
    //   42: iconst_0
    //   43: ifeq -> 962
    //   46: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/m;
    //   49: ifnull -> 62
    //   52: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/m;
    //   55: invokevirtual e : ()Z
    //   58: ifne -> 62
    //   61: return
    //   62: aload_0
    //   63: getfield d : Lcom/fs/arpg/as;
    //   66: getfield d : S
    //   69: iconst_2
    //   70: if_icmpeq -> 156
    //   73: aload_0
    //   74: getfield d : Lcom/fs/arpg/as;
    //   77: getfield d : S
    //   80: iconst_3
    //   81: if_icmpeq -> 156
    //   84: aload_0
    //   85: getfield d : Lcom/fs/arpg/as;
    //   88: getfield d : S
    //   91: bipush #7
    //   93: if_icmpeq -> 156
    //   96: aload_0
    //   97: getfield d : Lcom/fs/arpg/as;
    //   100: getfield d : S
    //   103: bipush #77
    //   105: if_icmpeq -> 156
    //   108: aload_0
    //   109: getfield d : Lcom/fs/arpg/as;
    //   112: getfield d : S
    //   115: bipush #75
    //   117: if_icmpeq -> 156
    //   120: aload_0
    //   121: getfield d : Lcom/fs/arpg/as;
    //   124: getfield d : S
    //   127: bipush #76
    //   129: if_icmpeq -> 156
    //   132: aload_0
    //   133: getfield d : Lcom/fs/arpg/as;
    //   136: getfield d : S
    //   139: bipush #80
    //   141: if_icmpeq -> 156
    //   144: aload_0
    //   145: getfield d : Lcom/fs/arpg/as;
    //   148: getfield d : S
    //   151: bipush #50
    //   153: if_icmpne -> 162
    //   156: ldc 'Tiêu diệt bộ binh'
    //   158: iconst_1
    //   159: invokestatic e : (Ljava/lang/String;I)V
    //   162: aload_0
    //   163: getfield d : Lcom/fs/arpg/as;
    //   166: getfield d : S
    //   169: bipush #10
    //   171: if_icmpeq -> 186
    //   174: aload_0
    //   175: getfield d : Lcom/fs/arpg/as;
    //   178: getfield d : S
    //   181: bipush #79
    //   183: if_icmpne -> 192
    //   186: ldc 'Tiêu diệt kỵ binh'
    //   188: iconst_1
    //   189: invokestatic e : (Ljava/lang/String;I)V
    //   192: aload_0
    //   193: getfield d : Lcom/fs/arpg/as;
    //   196: getfield d : S
    //   199: iconst_4
    //   200: if_icmpeq -> 227
    //   203: aload_0
    //   204: getfield d : Lcom/fs/arpg/as;
    //   207: getfield d : S
    //   210: bipush #78
    //   212: if_icmpeq -> 227
    //   215: aload_0
    //   216: getfield d : Lcom/fs/arpg/as;
    //   219: getfield d : S
    //   222: bipush #74
    //   224: if_icmpne -> 233
    //   227: ldc 'Tiêu diệt cung tiễn'
    //   229: iconst_1
    //   230: invokestatic e : (Ljava/lang/String;I)V
    //   233: aload_0
    //   234: getfield d : Lcom/fs/arpg/as;
    //   237: getfield d : S
    //   240: bipush #28
    //   242: if_icmpeq -> 257
    //   245: aload_0
    //   246: getfield d : Lcom/fs/arpg/as;
    //   249: getfield d : S
    //   252: bipush #29
    //   254: if_icmpne -> 263
    //   257: ldc 'Đập bình rượu'
    //   259: iconst_1
    //   260: invokestatic e : (Ljava/lang/String;I)V
    //   263: aload_0
    //   264: getfield d : Lcom/fs/arpg/as;
    //   267: getfield d : S
    //   270: bipush #24
    //   272: if_icmplt -> 293
    //   275: aload_0
    //   276: getfield d : Lcom/fs/arpg/as;
    //   279: getfield d : S
    //   282: bipush #27
    //   284: if_icmpgt -> 293
    //   287: ldc 'Đập thùng gỗ'
    //   289: iconst_1
    //   290: invokestatic e : (Ljava/lang/String;I)V
    //   293: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   296: iconst_0
    //   297: putfield l : Z
    //   300: ldc 'Tiêu diệt kẻ địch'
    //   302: iconst_1
    //   303: invokestatic e : (Ljava/lang/String;I)V
    //   306: aload_0
    //   307: iconst_1
    //   308: invokespecial g : (Z)V
    //   311: aload_0
    //   312: getfield d : Lcom/fs/arpg/as;
    //   315: getfield d : Z
    //   318: ifeq -> 609
    //   321: ldc 'BOSSX'
    //   323: aload_0
    //   324: getfield ab : I
    //   327: invokestatic d : (Ljava/lang/String;I)V
    //   330: ldc 'BOSSY'
    //   332: aload_0
    //   333: getfield ac : I
    //   336: invokestatic d : (Ljava/lang/String;I)V
    //   339: invokestatic d : ()Lcom/fs/arpg/l;
    //   342: invokevirtual a : ()V
    //   345: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   348: invokevirtual q : ()V
    //   351: invokestatic d : ()Lcom/fs/arpg/bd;
    //   354: aload_0
    //   355: invokestatic currentTimeMillis : ()J
    //   358: aload_0
    //   359: getfield c : J
    //   362: lsub
    //   363: l2i
    //   364: sipush #1000
    //   367: idiv
    //   368: istore_3
    //   369: astore_2
    //   370: astore_1
    //   371: aload_2
    //   372: getfield d : Lcom/fs/arpg/as;
    //   375: getfield d : S
    //   378: tableswitch default -> 609, 30 -> 428, 31 -> 451, 32 -> 474, 33 -> 497, 34 -> 520, 35 -> 543, 36 -> 566, 37 -> 589, 38 -> 451
    //   428: aload_1
    //   429: getfield c : I
    //   432: ifeq -> 443
    //   435: aload_1
    //   436: getfield c : I
    //   439: iload_3
    //   440: if_icmplt -> 609
    //   443: aload_1
    //   444: iload_3
    //   445: putfield c : I
    //   448: goto -> 609
    //   451: aload_1
    //   452: getfield b : I
    //   455: ifeq -> 466
    //   458: aload_1
    //   459: getfield b : I
    //   462: iload_3
    //   463: if_icmplt -> 609
    //   466: aload_1
    //   467: iload_3
    //   468: putfield b : I
    //   471: goto -> 609
    //   474: aload_1
    //   475: getfield a : I
    //   478: ifeq -> 489
    //   481: aload_1
    //   482: getfield a : I
    //   485: iload_3
    //   486: if_icmplt -> 609
    //   489: aload_1
    //   490: iload_3
    //   491: putfield a : I
    //   494: goto -> 609
    //   497: aload_1
    //   498: getfield z : I
    //   501: ifeq -> 512
    //   504: aload_1
    //   505: getfield z : I
    //   508: iload_3
    //   509: if_icmplt -> 609
    //   512: aload_1
    //   513: iload_3
    //   514: putfield z : I
    //   517: goto -> 609
    //   520: aload_1
    //   521: getfield h : I
    //   524: ifeq -> 535
    //   527: aload_1
    //   528: getfield h : I
    //   531: iload_3
    //   532: if_icmplt -> 609
    //   535: aload_1
    //   536: iload_3
    //   537: putfield h : I
    //   540: goto -> 609
    //   543: aload_1
    //   544: getfield g : I
    //   547: ifeq -> 558
    //   550: aload_1
    //   551: getfield g : I
    //   554: iload_3
    //   555: if_icmplt -> 609
    //   558: aload_1
    //   559: iload_3
    //   560: putfield g : I
    //   563: goto -> 609
    //   566: aload_1
    //   567: getfield f : I
    //   570: ifeq -> 581
    //   573: aload_1
    //   574: getfield f : I
    //   577: iload_3
    //   578: if_icmplt -> 609
    //   581: aload_1
    //   582: iload_3
    //   583: putfield f : I
    //   586: goto -> 609
    //   589: aload_1
    //   590: getfield i : I
    //   593: ifeq -> 604
    //   596: aload_1
    //   597: getfield i : I
    //   600: iload_3
    //   601: if_icmplt -> 609
    //   604: aload_1
    //   605: iload_3
    //   606: putfield i : I
    //   609: aload_0
    //   610: astore_1
    //   611: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   614: getfield d : I
    //   617: ifeq -> 922
    //   620: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   623: astore_2
    //   624: aload_1
    //   625: getfield B : I
    //   628: istore_3
    //   629: getstatic com/fs/arpg/ac.e : Z
    //   632: ifeq -> 639
    //   635: iload_3
    //   636: iconst_3
    //   637: imul
    //   638: istore_3
    //   639: aload_2
    //   640: invokevirtual e : ()I
    //   643: aload_1
    //   644: getfield m : I
    //   647: isub
    //   648: bipush #10
    //   650: if_icmplt -> 663
    //   653: aload_2
    //   654: iload_3
    //   655: iconst_5
    //   656: idiv
    //   657: invokevirtual c : (I)V
    //   660: goto -> 668
    //   663: aload_2
    //   664: iload_3
    //   665: invokevirtual c : (I)V
    //   668: aload_1
    //   669: getfield d : Lcom/fs/arpg/as;
    //   672: getfield a : I
    //   675: dup
    //   676: dup
    //   677: istore_2
    //   678: bipush #100
    //   680: idiv
    //   681: iadd
    //   682: istore_2
    //   683: iload_2
    //   684: sipush #400
    //   687: if_icmple -> 721
    //   690: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   693: sipush #1400
    //   696: aload_1
    //   697: getfield ab : I
    //   700: aload_1
    //   701: getfield ac : I
    //   704: bipush #48
    //   706: sipush #160
    //   709: invokevirtual d : (SIIII)V
    //   712: wide iinc #2 -400
    //   718: goto -> 683
    //   721: iload_2
    //   722: ifle -> 750
    //   725: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   728: iload_2
    //   729: sipush #1000
    //   732: iadd
    //   733: i2s
    //   734: aload_1
    //   735: getfield ab : I
    //   738: aload_1
    //   739: getfield ac : I
    //   742: bipush #48
    //   744: sipush #160
    //   747: invokevirtual d : (SIIII)V
    //   750: aload_1
    //   751: getfield d : Lcom/fs/arpg/as;
    //   754: getfield z : Z
    //   757: ifeq -> 772
    //   760: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   763: dup
    //   764: getfield F : I
    //   767: iconst_1
    //   768: iadd
    //   769: putfield F : I
    //   772: aload_1
    //   773: getfield d : Lcom/fs/arpg/as;
    //   776: getfield d : Z
    //   779: ifeq -> 814
    //   782: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   785: getfield A : Z
    //   788: ifeq -> 814
    //   791: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   794: aload_1
    //   795: getfield ab : I
    //   798: putfield l : I
    //   801: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   804: aload_1
    //   805: getfield ac : I
    //   808: putfield m : I
    //   811: goto -> 922
    //   814: iconst_0
    //   815: istore_2
    //   816: aload_1
    //   817: getfield d : Lcom/fs/arpg/as;
    //   820: getfield d : [S
    //   823: arraylength
    //   824: istore_3
    //   825: iload_2
    //   826: iload_3
    //   827: if_icmpge -> 922
    //   830: iconst_0
    //   831: bipush #100
    //   833: invokestatic d : (II)I
    //   836: dup
    //   837: dup
    //   838: istore #4
    //   840: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   843: getfield r : I
    //   846: imul
    //   847: bipush #100
    //   849: idiv
    //   850: isub
    //   851: aload_1
    //   852: getfield d : Lcom/fs/arpg/as;
    //   855: getfield d : [S
    //   858: iload_2
    //   859: iconst_2
    //   860: iadd
    //   861: saload
    //   862: if_icmpgt -> 916
    //   865: aload_1
    //   866: getfield d : Lcom/fs/arpg/as;
    //   869: getfield d : [S
    //   872: iload_2
    //   873: saload
    //   874: istore #4
    //   876: aload_1
    //   877: getfield d : Lcom/fs/arpg/as;
    //   880: getfield d : [S
    //   883: iload_2
    //   884: saload
    //   885: invokestatic d : (S)Lcom/fs/arpg/g;
    //   888: astore #5
    //   890: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   893: iload #4
    //   895: aload_1
    //   896: getfield ab : I
    //   899: aload_1
    //   900: getfield ac : I
    //   903: aload #5
    //   905: getfield d : I
    //   908: aload #5
    //   910: getfield e : I
    //   913: invokevirtual d : (SIIII)V
    //   916: iinc #2, 3
    //   919: goto -> 825
    //   922: aload_0
    //   923: getfield a : Lcom/fs/arpg/m;
    //   926: ifnull -> 961
    //   929: aload_0
    //   930: getfield a : Lcom/fs/arpg/m;
    //   933: invokevirtual e : ()V
    //   936: aload_0
    //   937: getfield a : Lcom/fs/arpg/m;
    //   940: invokevirtual z : ()V
    //   943: aload_0
    //   944: getfield a : Lcom/fs/arpg/m;
    //   947: invokevirtual e : ()Z
    //   950: ifne -> 960
    //   953: aload_0
    //   954: getfield a : Lcom/fs/arpg/m;
    //   957: putstatic com/fs/arpg/ba.d : Lcom/fs/arpg/m;
    //   960: return
    //   961: return
    //   962: aload_0
    //   963: getfield d : Lcom/fs/arpg/ao;
    //   966: ifnull -> 1006
    //   969: aload_0
    //   970: getfield d : Lcom/fs/arpg/ao;
    //   973: getfield d : Z
    //   976: ifne -> 1006
    //   979: aload_0
    //   980: getfield d : Lcom/fs/arpg/ao;
    //   983: getfield d : I
    //   986: iconst_2
    //   987: if_icmpeq -> 1001
    //   990: aload_0
    //   991: getfield d : Lcom/fs/arpg/ao;
    //   994: getfield d : I
    //   997: iconst_3
    //   998: if_icmpne -> 1006
    //   1001: aload_0
    //   1002: aconst_null
    //   1003: putfield d : Lcom/fs/arpg/ao;
    //   1006: aload_0
    //   1007: invokevirtual f : ()V
    //   1010: aload_0
    //   1011: dup
    //   1012: astore_1
    //   1013: getfield z : I
    //   1016: ifle -> 1034
    //   1019: aload_1
    //   1020: getfield d : Lcom/fs/arpg/ao;
    //   1023: ifnull -> 1034
    //   1026: aload_1
    //   1027: getfield d : Lcom/fs/arpg/ao;
    //   1030: aload_1
    //   1031: invokevirtual e : (Lcom/fs/arpg/e;)V
    //   1034: aload_0
    //   1035: getfield i : Z
    //   1038: ifeq -> 1042
    //   1041: return
    //   1042: aload_0
    //   1043: getfield d : Lcom/fs/arpg/as;
    //   1046: getfield d : Z
    //   1049: ifne -> 1112
    //   1052: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1055: getfield d : J
    //   1058: lconst_0
    //   1059: lcmp
    //   1060: ifeq -> 1112
    //   1063: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1066: getfield g : Z
    //   1069: ifne -> 1112
    //   1072: aload_0
    //   1073: getfield d : I
    //   1076: iconst_4
    //   1077: if_icmpeq -> 1112
    //   1080: aload_0
    //   1081: getfield d : I
    //   1084: bipush #7
    //   1086: if_icmpeq -> 1112
    //   1089: aload_0
    //   1090: getfield d : I
    //   1093: iconst_3
    //   1094: if_icmpeq -> 1112
    //   1097: aload_0
    //   1098: getfield d : I
    //   1101: iconst_5
    //   1102: if_icmpeq -> 1112
    //   1105: aload_0
    //   1106: getfield l : Z
    //   1109: ifne -> 1191
    //   1112: aload_0
    //   1113: getfield d : Lcom/fs/arpg/as;
    //   1116: getfield d : Z
    //   1119: ifeq -> 1174
    //   1122: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1125: getfield d : J
    //   1128: lconst_0
    //   1129: lcmp
    //   1130: ifeq -> 1174
    //   1133: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1136: getfield g : Z
    //   1139: ifne -> 1174
    //   1142: aload_0
    //   1143: getfield d : I
    //   1146: bipush #7
    //   1148: if_icmpeq -> 1174
    //   1151: aload_0
    //   1152: getfield d : I
    //   1155: iconst_3
    //   1156: if_icmpeq -> 1174
    //   1159: aload_0
    //   1160: getfield d : I
    //   1163: iconst_5
    //   1164: if_icmpeq -> 1174
    //   1167: aload_0
    //   1168: getfield l : Z
    //   1171: ifne -> 1191
    //   1174: aload_0
    //   1175: getfield l : Z
    //   1178: ifne -> 1457
    //   1181: aload_0
    //   1182: getfield d : Lcom/fs/arpg/as;
    //   1185: getfield b : Z
    //   1188: ifne -> 1457
    //   1191: aload_0
    //   1192: getfield c : J
    //   1195: lconst_0
    //   1196: lcmp
    //   1197: ifne -> 1207
    //   1200: aload_0
    //   1201: invokestatic currentTimeMillis : ()J
    //   1204: putfield c : J
    //   1207: aload_0
    //   1208: getfield d : Lcom/fs/arpg/as;
    //   1211: aload_0
    //   1212: astore_2
    //   1213: dup
    //   1214: astore_1
    //   1215: aload_2
    //   1216: astore_1
    //   1217: dup
    //   1218: astore_2
    //   1219: getfield d : [Lcom/fs/arpg/aw;
    //   1222: ifnull -> 1457
    //   1225: aload_1
    //   1226: getfield m : Z
    //   1229: ifeq -> 1333
    //   1232: aload_2
    //   1233: getfield d : [Lcom/fs/arpg/aw;
    //   1236: aload_1
    //   1237: getfield o : I
    //   1240: aaload
    //   1241: aload_1
    //   1242: invokevirtual e : (Lcom/fs/arpg/x;)Z
    //   1245: ifne -> 1264
    //   1248: aload_2
    //   1249: getfield d : [Lcom/fs/arpg/aw;
    //   1252: aload_1
    //   1253: getfield o : I
    //   1256: aaload
    //   1257: aload_1
    //   1258: invokevirtual e : (Lcom/fs/arpg/x;)V
    //   1261: goto -> 1457
    //   1264: aload_2
    //   1265: getfield d : [Lcom/fs/arpg/aw;
    //   1268: aload_1
    //   1269: getfield o : I
    //   1272: aaload
    //   1273: aload_1
    //   1274: invokevirtual d : (Lcom/fs/arpg/x;)V
    //   1277: aload_1
    //   1278: iconst_m1
    //   1279: putfield s : I
    //   1282: aload_1
    //   1283: dup
    //   1284: getfield q : I
    //   1287: iconst_1
    //   1288: iadd
    //   1289: putfield q : I
    //   1292: aload_1
    //   1293: getfield q : I
    //   1296: aload_2
    //   1297: getfield d : [Lcom/fs/arpg/aw;
    //   1300: aload_1
    //   1301: getfield o : I
    //   1304: aaload
    //   1305: getfield d : [S
    //   1308: arraylength
    //   1309: if_icmpge -> 1328
    //   1312: aload_2
    //   1313: getfield d : [Lcom/fs/arpg/aw;
    //   1316: aload_1
    //   1317: getfield o : I
    //   1320: aaload
    //   1321: aload_1
    //   1322: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   1325: goto -> 1457
    //   1328: aload_1
    //   1329: iconst_0
    //   1330: putfield m : Z
    //   1333: iconst_0
    //   1334: istore_3
    //   1335: aload_2
    //   1336: getfield d : [Lcom/fs/arpg/aw;
    //   1339: arraylength
    //   1340: istore #4
    //   1342: iload_3
    //   1343: iload #4
    //   1345: if_icmpge -> 1457
    //   1348: aload_2
    //   1349: getfield d : Z
    //   1352: ifne -> 1364
    //   1355: aload_2
    //   1356: getfield d : S
    //   1359: bipush #62
    //   1361: if_icmpne -> 1372
    //   1364: aload_1
    //   1365: iload_3
    //   1366: invokestatic d : (Lcom/fs/arpg/x;I)Z
    //   1369: ifne -> 1451
    //   1372: iconst_0
    //   1373: putstatic com/fs/arpg/aw.d : I
    //   1376: aload_2
    //   1377: getfield d : [Lcom/fs/arpg/aw;
    //   1380: iload_3
    //   1381: aaload
    //   1382: aload_1
    //   1383: invokevirtual d : (Lcom/fs/arpg/x;)Z
    //   1386: ifeq -> 1451
    //   1389: aload_1
    //   1390: iconst_1
    //   1391: putfield m : Z
    //   1394: aload_1
    //   1395: iload_3
    //   1396: putfield o : I
    //   1399: aload_1
    //   1400: iconst_0
    //   1401: putfield q : I
    //   1404: aload_1
    //   1405: getstatic com/fs/arpg/aq.c : I
    //   1408: i2l
    //   1409: putfield e : J
    //   1412: aload_2
    //   1413: getfield d : [Lcom/fs/arpg/aw;
    //   1416: iload_3
    //   1417: aaload
    //   1418: aload_1
    //   1419: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   1422: getstatic com/fs/arpg/aw.d : I
    //   1425: ifeq -> 1457
    //   1428: aload_1
    //   1429: iload_3
    //   1430: getstatic com/fs/arpg/aq.c : I
    //   1433: i2l
    //   1434: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1437: getfield d : J
    //   1440: lsub
    //   1441: l2i
    //   1442: getstatic com/fs/arpg/aw.d : I
    //   1445: invokestatic d : (Lcom/fs/arpg/x;III)V
    //   1448: goto -> 1457
    //   1451: iinc #3, 1
    //   1454: goto -> 1342
    //   1457: aload_0
    //   1458: getfield e : Z
    //   1461: ifeq -> 1484
    //   1464: aload_0
    //   1465: getfield d : Lcom/fs/arpg/aa;
    //   1468: aload_0
    //   1469: invokevirtual d : (Lcom/fs/arpg/e;)V
    //   1472: aload_0
    //   1473: aload_0
    //   1474: getfield d : Lcom/fs/arpg/as;
    //   1477: getfield a : Z
    //   1480: invokevirtual d : (Z)V
    //   1483: return
    //   1484: aload_0
    //   1485: getfield c : Z
    //   1488: ifeq -> 1504
    //   1491: aload_0
    //   1492: getfield d : Lcom/fs/arpg/aa;
    //   1495: aload_0
    //   1496: invokevirtual d : (Lcom/fs/arpg/e;)V
    //   1499: aload_0
    //   1500: invokevirtual b : ()V
    //   1503: return
    //   1504: aload_0
    //   1505: dup
    //   1506: astore_1
    //   1507: getfield d : Lcom/fs/arpg/aa;
    //   1510: aload_1
    //   1511: invokevirtual d : (Lcom/fs/arpg/e;)V
    //   1514: aload_1
    //   1515: getfield c : I
    //   1518: ifne -> 1528
    //   1521: aload_1
    //   1522: invokevirtual d : ()Z
    //   1525: ifeq -> 1839
    //   1528: aload_1
    //   1529: aload_1
    //   1530: aload_1
    //   1531: getfield b : I
    //   1534: aload_1
    //   1535: getfield c : I
    //   1538: invokevirtual d : (Lcom/fs/arpg/e;II)V
    //   1541: aload_1
    //   1542: getfield b : Z
    //   1545: ifeq -> 1564
    //   1548: aload_1
    //   1549: aload_1
    //   1550: getfield ab : I
    //   1553: putfield f : I
    //   1556: aload_1
    //   1557: aload_1
    //   1558: getfield ac : I
    //   1561: putfield i : I
    //   1564: aload_1
    //   1565: dup
    //   1566: astore_2
    //   1567: getfield ab : I
    //   1570: aload_2
    //   1571: getfield f : I
    //   1574: if_icmpne -> 1588
    //   1577: aload_2
    //   1578: getfield ac : I
    //   1581: aload_2
    //   1582: getfield i : I
    //   1585: if_icmpeq -> 1725
    //   1588: aload_2
    //   1589: getfield d : Lcom/fs/arpg/as;
    //   1592: getfield d : I
    //   1595: ifne -> 1628
    //   1598: aload_2
    //   1599: getfield d : Lcom/fs/arpg/as;
    //   1602: getfield e : I
    //   1605: ifne -> 1628
    //   1608: aload_2
    //   1609: getfield d : Lcom/fs/arpg/as;
    //   1612: getfield c : I
    //   1615: ifne -> 1628
    //   1618: aload_2
    //   1619: getfield d : Lcom/fs/arpg/as;
    //   1622: getfield b : I
    //   1625: ifeq -> 1725
    //   1628: aload_2
    //   1629: getfield f : I
    //   1632: aload_2
    //   1633: getfield d : Lcom/fs/arpg/as;
    //   1636: getfield d : I
    //   1639: if_icmple -> 1700
    //   1642: aload_2
    //   1643: getfield f : I
    //   1646: aload_2
    //   1647: getfield d : Lcom/fs/arpg/as;
    //   1650: getfield d : I
    //   1653: aload_2
    //   1654: getfield d : Lcom/fs/arpg/as;
    //   1657: getfield c : I
    //   1660: iadd
    //   1661: if_icmpge -> 1700
    //   1664: aload_2
    //   1665: getfield i : I
    //   1668: aload_2
    //   1669: getfield d : Lcom/fs/arpg/as;
    //   1672: getfield e : I
    //   1675: if_icmple -> 1700
    //   1678: aload_2
    //   1679: getfield i : I
    //   1682: aload_2
    //   1683: getfield d : Lcom/fs/arpg/as;
    //   1686: getfield e : I
    //   1689: aload_2
    //   1690: getfield d : Lcom/fs/arpg/as;
    //   1693: getfield b : I
    //   1696: iadd
    //   1697: if_icmplt -> 1725
    //   1700: aload_2
    //   1701: aload_2
    //   1702: getfield ab : I
    //   1705: putfield f : I
    //   1708: aload_2
    //   1709: aload_2
    //   1710: getfield ac : I
    //   1713: putfield i : I
    //   1716: aload_2
    //   1717: iconst_2
    //   1718: putfield d : I
    //   1721: aload_2
    //   1722: invokevirtual z : ()V
    //   1725: aload_1
    //   1726: getfield d : Lcom/fs/arpg/as;
    //   1729: getfield c : Z
    //   1732: ifne -> 1753
    //   1735: invokestatic d : ()Lcom/fs/arpg/l;
    //   1738: aload_1
    //   1739: aload_1
    //   1740: getfield f : I
    //   1743: aload_1
    //   1744: getfield i : I
    //   1747: invokevirtual d : (Lcom/fs/arpg/x;II)Z
    //   1750: ifeq -> 1839
    //   1753: aload_1
    //   1754: getfield d : Lcom/fs/arpg/as;
    //   1757: getfield c : Z
    //   1760: ifeq -> 1805
    //   1763: aload_1
    //   1764: getfield d : Lcom/fs/arpg/as;
    //   1767: getfield a : Z
    //   1770: ifeq -> 1789
    //   1773: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   1776: aload_1
    //   1777: aload_1
    //   1778: getfield f : I
    //   1781: aload_1
    //   1782: getfield i : I
    //   1785: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   1788: return
    //   1789: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1792: aload_1
    //   1793: aload_1
    //   1794: getfield f : I
    //   1797: aload_1
    //   1798: getfield i : I
    //   1801: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   1804: return
    //   1805: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   1808: aload_1
    //   1809: aload_1
    //   1810: getfield b : I
    //   1813: aload_1
    //   1814: getfield ab : I
    //   1817: aload_1
    //   1818: getfield ac : I
    //   1821: aload_1
    //   1822: getfield f : I
    //   1825: aload_1
    //   1826: getfield i : I
    //   1829: aload_1
    //   1830: getfield d : Lcom/fs/arpg/as;
    //   1833: getfield a : Z
    //   1836: invokevirtual d : (Lcom/fs/arpg/e;IIIIIZ)V
    //   1839: return
  }
  
  public final void n() {
    ao ao1 = this.d;
    x();
    int i;
    if (this.d != ao1 && (i = this.d.d(this.e, this.d)) >= 0)
      ba.d.b(i); 
  }
  
  final void d(s params) {
    if (this.n)
      return; 
    if (this.j)
      return; 
    if (this.d == 7)
      return; 
    boolean bool;
    if (!(bool = params.h))
      return; 
    if (params.d.d != null && params.d.d.d(this))
      this.d = params.d.d.d(); 
    ba.d.o();
    this.q = false;
    if ((bool >> 31 & 0x1) == 1)
      this.q = true; 
    int i;
    if ((i = (bool & 0xFFFFFF) - (this.y >> 1) + (i = (bool & 0xFFFFFF) - (this.y >> 1)) * ba.d(-50, 50) / 500) < 0)
      i = 1; 
    if (this.q) {
      i <<= 1;
      ba.d.d(this, i, true);
      ba.d.g();
      ba.d.a();
    } else {
      ba.d.d(this, i, false);
    } 
    bd.d().d(i);
    this.z -= i;
    m();
    if (this.z <= null) {
      this.m = false;
      this.d = 7;
      z();
      return;
    } 
    if (this.p || ((as)this.d).a)
      return; 
    if (this.d == 4 || this.d == 3)
      return; 
    if (this.d.d(4) == null)
      return; 
    this.d = 4;
    this.m = false;
    this.o = false;
    z();
  }
  
  public final boolean d(int paramInt) {
    return (this.x == paramInt);
  }
  
  public final void e(int paramInt) {
    if (this.x == paramInt)
      return; 
    this.x = paramInt;
  }
  
  public final void i() {
    if (((as)this.d).a) {
      ba.c.d(this);
      return;
    } 
    ba.e.d(this);
  }
  
  final void j() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: iconst_4
    //   8: istore_3
    //   9: iconst_0
    //   10: istore #4
    //   12: iload #4
    //   14: iconst_4
    //   15: if_icmpge -> 208
    //   18: aload_0
    //   19: iload_1
    //   20: istore #6
    //   22: dup
    //   23: astore #5
    //   25: getfield d : Lcom/fs/arpg/as;
    //   28: getfield d : Lcom/fs/arpg/aa;
    //   31: iload #6
    //   33: invokevirtual d : (I)I
    //   36: dup
    //   37: istore #7
    //   39: ifne -> 46
    //   42: iconst_0
    //   43: goto -> 117
    //   46: aload #5
    //   48: aload #5
    //   50: iload #6
    //   52: iload #7
    //   54: invokevirtual d : (Lcom/fs/arpg/e;II)V
    //   57: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   60: aload #5
    //   62: getfield f : I
    //   65: iconst_4
    //   66: ishr
    //   67: aload #5
    //   69: getfield i : I
    //   72: iconst_4
    //   73: ishr
    //   74: invokevirtual d : (II)Z
    //   77: ifne -> 84
    //   80: iconst_0
    //   81: goto -> 117
    //   84: aload #5
    //   86: getfield d : Lcom/fs/arpg/as;
    //   89: getfield c : Z
    //   92: ifeq -> 99
    //   95: iconst_1
    //   96: goto -> 117
    //   99: invokestatic d : ()Lcom/fs/arpg/l;
    //   102: aload #5
    //   104: aload #5
    //   106: getfield f : I
    //   109: aload #5
    //   111: getfield i : I
    //   114: invokevirtual d : (Lcom/fs/arpg/x;II)Z
    //   117: ifeq -> 146
    //   120: iconst_0
    //   121: bipush #100
    //   123: invokestatic d : (II)I
    //   126: bipush #30
    //   128: if_icmpge -> 146
    //   131: aload_0
    //   132: iload_1
    //   133: putfield b : I
    //   136: aload_0
    //   137: iconst_1
    //   138: putfield d : I
    //   141: aload_0
    //   142: invokevirtual z : ()V
    //   145: return
    //   146: iload_2
    //   147: iconst_1
    //   148: iload_1
    //   149: ishl
    //   150: ior
    //   151: istore_2
    //   152: iconst_1
    //   153: iload_3
    //   154: invokestatic d : (II)I
    //   157: istore #5
    //   159: iinc #3, -1
    //   162: iconst_0
    //   163: istore #6
    //   165: iconst_0
    //   166: istore #7
    //   168: iload #7
    //   170: iconst_4
    //   171: if_icmpge -> 202
    //   174: iload_2
    //   175: iconst_1
    //   176: iload #7
    //   178: ishl
    //   179: iand
    //   180: ifne -> 196
    //   183: iinc #6, 1
    //   186: iload #6
    //   188: iload #5
    //   190: if_icmpne -> 196
    //   193: iload #7
    //   195: istore_1
    //   196: iinc #7, 1
    //   199: goto -> 168
    //   202: iinc #4, 1
    //   205: goto -> 12
    //   208: return
  }
  
  final void p() {
    if (this.e < ((aa)this.d).d - 1) {
      this.e++;
      this.c = this.d.d(this.b, this.e);
      d();
      this.d.d(this);
      return;
    } 
    this.d.d(this);
    if (this.d == 7) {
      f(true);
      this.m = false;
      return;
    } 
    if (this.d == 4 || this.d == 5) {
      this.d = 2;
      z();
      return;
    } 
    d();
  }
  
  public final void k() {
    boolean bool;
    int j = k - 1;
    if (((as)this.d).z < k - 1 && ((as)this.d).z)
      bool = ((as)this.d).z; 
    int i = bool * l;
    this.g = this.z = b[i] + this.m * b[i + 1];
    this.h = b[i + 2] + this.m * b[i + 3];
    this.y = b[i + 4] + this.m * b[i + 5];
    this.B = b[i + 6] + this.m * b[i + 7];
    if (this.m - b[i + 8] >= 0)
      this.g = this.z += b[i + 9] * this.m; 
    this.n = true;
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if ((paramInt1 = ba.d.d(this, this.ab >> 4, this.ac >> 4, paramInt1 >> 4, paramInt2 >> 4, ((as)this.d).c)) != 10) {
      this.b = paramInt1;
      this.d = true;
      z();
      return;
    } 
  }
  
  public final void c() {
    if (((as)this.d).a) {
      ba.c.d(this, this.ab, this.ac);
      return;
    } 
    ba.e.d(this, this.ab, this.ac);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (((as)this.d).a) {
      ba.c.d(this, paramInt1, paramInt2);
      return;
    } 
    ba.e.d(this, paramInt1, paramInt2);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    int i = paramInt1 - this.ab;
    int j = paramInt2 - this.ac;
    if (i == 0 && j == 0) {
      if (this.d != 2) {
        this.d = 2;
        z();
      } 
      return;
    } 
    if (Math.abs(i) < this.c && i != 0) {
      this.f = paramInt1;
      this.i = this.ac;
      b(this.f, this.i);
      i = 0;
    } 
    if (Math.abs(j) < this.c && j != 0) {
      this.i = paramInt2;
      this.f = this.ab;
      b(this.f, this.i);
      j = 0;
    } 
    if (i == 0 && j == 0) {
      if (this.d != 2) {
        this.d = 2;
        z();
      } 
      return;
    } 
    if (i != 0) {
      if ((paramInt1 = (this.ab < paramInt1) ? 3 : 2) != this.b) {
        this.b = paramInt1;
        h();
      } 
      return;
    } 
    if (j != 0) {
      if ((paramInt1 = (this.ac < paramInt2) ? 1 : 0) != this.b) {
        this.b = paramInt1;
        h();
      } 
      return;
    } 
  }
  
  private void d(e parame) {
    if (!parame.b || parame.b == 2) {
      this.b = parame.b + 1;
      return;
    } 
    this.b = parame.b - 1;
  }
  
  public final void d(x paramx) {
    if (this.n)
      return; 
    if (this.j)
      return; 
    if (this.d == 7 || this.d == 5)
      return; 
    boolean bool;
    if (!(bool = paramx.h))
      return; 
    ba.d.o();
    if (paramx.e != null && paramx.e.d(this)) {
      this.d = paramx.e.d();
    } else if (paramx.e != null && ((ao)paramx.e).d == 4 && paramx.e.d()) {
      paramx.e.e(null);
    } 
    this.q = false;
    if ((bool >> 31 & 0x1) == 1)
      this.q = true; 
    int i;
    if ((i = (bool & 0xFFFFFF) - (this.y >> 1) + (i = (bool & 0xFFFFFF) - (this.y >> 1)) * ba.d(-50, 50) / 500) < 0)
      i = 1; 
    if (this.q) {
      i <<= 1;
      ba.d.d(this, i, true);
      ba.d.g();
      ba.d.a();
    } else {
      ba.d.d(this, i, false);
    } 
    this.z -= i;
    bd.d().d(i);
    m();
    if (this.z <= null) {
      this.m = false;
      if (this.d.d(7) == null) {
        this.z = true;
        return;
      } 
      this.d = 7;
      z();
      return;
    } 
    if (this.p || ((as)this.d).a)
      return; 
    if (this.d == 4 || this.d == 5 || this.d == 3)
      return; 
    if (this.d.d(4) == null)
      return; 
    this.d = 4;
    d(paramx);
    this.m = false;
    this.o = false;
    z();
  }
  
  public final void d(p paramp) {
    if (this.n)
      return; 
    if (this.j)
      return; 
    if (this.d == 7 || this.d == 5)
      return; 
    int i;
    if ((i = paramp.c()) == 0)
      return; 
    ba.d.o();
    if (paramp.e != null && paramp.e.d(this)) {
      this.d = paramp.e.d();
    } else if (paramp.e != null && ((ao)paramp.e).d == 4 && paramp.e.d()) {
      paramp.e.e(null);
    } 
    this.q = false;
    if ((i >> 31 & 0x1) == 1)
      this.q = true; 
    if ((i = (i & 0xFFFFFF) - (this.y >> 1) + (i = (i & 0xFFFFFF) - (this.y >> 1)) * ba.d(-50, 50) / 500) < 0)
      i = 1; 
    if (this.q) {
      if (paramp.V == 0) {
        i = i * 3 >> 1;
      } else {
        i <<= 1;
      } 
      ba.d.d(this, i, true);
      ba.d.g();
      ba.d.a();
    } else {
      ba.d.d(this, i, false);
    } 
    this.z -= i;
    bd.d().d(i);
    m();
    if (this.z <= null) {
      this.m = false;
      if (this.d.d(7) == null) {
        this.z = true;
        return;
      } 
      this.d = 7;
      z();
      return;
    } 
    if (this.p || ((as)this.d).a)
      return; 
    if (this.d == 4 || this.d == 5 || this.d == 3)
      return; 
    if (this.d.d(4) == null)
      return; 
    if (paramp.d != null && ((ax)paramp.d).e && this.d.d(5) != null && !this.d.d(5).d()) {
      this.d = 5;
      d(paramp);
      z();
      return;
    } 
    this.d = 4;
    d(paramp);
    this.m = false;
    this.o = false;
    z();
  }
  
  public final int d() {
    int i;
    boolean bool = this.h;
    if (this.s == 6 && this.r > 0)
      i = bool + bool * this.r / 100; 
    return i;
  }
  
  public final void d(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(((as)this.d).d);
    paramDataOutputStream.writeByte(this.m & 0xFF);
    if (!this.l && !((as)this.d).b && ((as)this.d).d != null && ((as)this.d).d.length != 0) {
      paramDataOutputStream.writeShort(this.u >> 16 & 0xFFFF);
      paramDataOutputStream.writeShort(this.u & 0xFFFF);
    } else {
      paramDataOutputStream.writeShort(this.ab);
      paramDataOutputStream.writeShort(this.ac);
    } 
    paramDataOutputStream.writeByte(this.b);
    paramDataOutputStream.writeUTF((String)this.d);
    paramDataOutputStream.writeBoolean(this.l);
    paramDataOutputStream.writeBoolean(this.g);
    paramDataOutputStream.writeBoolean(b());
    l.d(paramDataOutputStream, this.b);
    l.d(paramDataOutputStream, this.a);
    l.d(paramDataOutputStream, this.z);
    l.d(paramDataOutputStream, (m)this.e);
    paramDataOutputStream.writeBoolean(this.o);
    paramDataOutputStream.writeShort(this.w);
    if (this.d != null) {
      paramDataOutputStream.writeBoolean(true);
      paramDataOutputStream.writeShort(((aa)this.d).d);
      paramDataOutputStream.writeShort(this.c);
      paramDataOutputStream.writeBoolean(this.a);
      paramDataOutputStream.writeBoolean(this.h);
      return;
    } 
    paramDataOutputStream.writeBoolean(false);
  }
  
  public final void d(as paramas) {
    this.d = (ao)paramas;
    if (paramas.z) {
      this.c = (h)new be();
      v.d().d((short)53, (be)this.c);
      this.c.v();
    } 
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    short s = paramDataInputStream.readShort();
    this.d = (ao)l.d().d(s);
    if (((as)this.d).z) {
      this.c = (h)new be();
      v.d().d((short)53, (be)this.c);
      this.c.v();
    } 
    this.m = paramDataInputStream.readByte() & 0xFF;
    this.ab = paramDataInputStream.readShort();
    this.ac = paramDataInputStream.readShort();
    this.b = paramDataInputStream.readByte();
    this.d = (ao)paramDataInputStream.readUTF();
    this.l = paramDataInputStream.readBoolean();
    this.g = paramDataInputStream.readBoolean();
    b(paramDataInputStream.readBoolean());
    this.d = 2;
    z();
    k();
    this.u = this.ab << 16 | this.ac & 0xFFFF;
    this.b = l.d(paramDataInputStream);
    this.a = l.d(paramDataInputStream);
    this.z = l.d(paramDataInputStream);
    this.e = (Image)l.d(paramDataInputStream);
    this.o = paramDataInputStream.readBoolean();
    this.w = paramDataInputStream.readShort();
    if (paramDataInputStream.readBoolean()) {
      s = paramDataInputStream.readShort();
      short s1 = paramDataInputStream.readShort();
      this.a = paramDataInputStream.readBoolean();
      this.h = paramDataInputStream.readBoolean();
      this.d = (ao)this.e;
      this.d = (ao)this.c;
      v.d().d((short)s, this);
      this.c = (short)s1;
      v();
    } 
  }
  
  public final void l() {
    if (this.d == null)
      return; 
    if (((as)this.d).d.d == true)
      return; 
    l l = l.d();
    (new short[1])[0] = k2.d;
    k k2 = ((k2 = (k)(v.d()).d.d(((bc)this.e).d)).d != null) ? (k)new short[1] : (k)k2.d;
    boolean bool = true;
    byte b = 0;
    int i = l.d.size();
    while (b < i) {
      h h1;
      if ((h1 = l.d[b]) != this && ((x)h1).d != null && ((x)h1).d == this.d) {
        bool = false;
        break;
      } 
      b++;
    } 
    if (bool) {
      short[] arrayOfShort;
      b = 0;
      i = l.d.size();
      while (b < i) {
        h h1;
        if ((h1 = l.d[b]) != this && ((x)h1).d != null) {
          k k4 = k2;
          h h2 = h1;
          short[] arrayOfShort1 = new short[k4.length];
          byte b1 = 0;
          byte b2 = 0;
          int k = k4.length;
          while (b2 < k) {
            if (k4[b2] != k3.d) {
              arrayOfShort1[b1] = k4[b2];
              b1++;
            } 
            b2++;
          } 
          String[] arrayOfString = k3.d;
          k = 0;
          int j = k4.length;
          while (k < j) {
            boolean bool1 = true;
            byte b3 = 0;
            int n = arrayOfString.length;
            while (b3 < n) {
              if (k4[k] == arrayOfString[b3]) {
                bool1 = false;
                break;
              } 
              b3++;
            } 
            if (bool1) {
              arrayOfShort1[b1] = k4[k];
              b1++;
            } 
            k++;
          } 
          k k3;
          if ((arrayOfShort = ((k3 = (k)(v.d()).d.d(((bc)((x)h2).e).d)).d != null) ? arrayOfShort1 : arrayOfShort1)[0] != 0)
            continue; 
          break;
        } 
        continue;
        b++;
      } 
      b = 0;
      i = arrayOfShort.length;
      while (b < i) {
        if (arrayOfShort[b] != 0)
          n.d().d(arrayOfShort[b]); 
        b++;
      } 
    } 
    this.d = null;
    Image image = this.e;
    v v = v.d();
    k k1;
    if (image != null && (k1 = (k)v.d.d(((bc)image).d)) != null)
      v.d.remove(k1.d); 
    if (this.d != null) {
      v.d().d((bc)this.d);
      v.d().d((bc)this.e);
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\x.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */