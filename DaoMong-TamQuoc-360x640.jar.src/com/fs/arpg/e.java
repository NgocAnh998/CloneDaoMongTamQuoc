package com.fs.arpg;

import javax.microedition.lcdui.Graphics;

public abstract class e extends be {
  e d;
  
  long d;
  
  String d;
  
  boolean d;
  
  int d;
  
  int e;
  
  int c;
  
  int b;
  
  int a;
  
  int[] d;
  
  int[] e;
  
  boolean[] d;
  
  int[] c;
  
  int z;
  
  int h;
  
  int g;
  
  boolean e;
  
  boolean c;
  
  private m e;
  
  private int[] b;
  
  private int[] z;
  
  private int j;
  
  boolean b;
  
  boolean a;
  
  boolean z;
  
  boolean h;
  
  aa d;
  
  bc d;
  
  short d;
  
  m d = null;
  
  boolean g;
  
  boolean f;
  
  int f;
  
  int i;
  
  boolean i;
  
  public e() {
    this.d = 2;
    this.b = true;
    this.g = true;
    this.d = aq.d;
  }
  
  public final void d(m paramm, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    byte b;
    this.e = true;
    this.e = paramm;
    this.b = paramArrayOfint1;
    this.z = paramArrayOfint2;
    this.j = 0;
    if (this.ab == paramArrayOfint1[this.j]) {
      if (this.ac < paramArrayOfint2[this.j]) {
        b = 1;
      } else {
        b = 0;
      } 
    } else if (this.ab < paramArrayOfint1[this.j]) {
      b = 3;
    } else {
      b = 2;
    } 
    this.b = b;
    this.d = true;
    z();
  }
  
  public final boolean d() {
    return (l.d != null && this.d != null);
  }
  
  public void d() {
    if (this.d != null)
      this.d.d(this); 
    if (this.a)
      return; 
    if (this.h && this.d != null) {
      this.e = this.d;
      this.c = this.d;
      this.d = null;
      this.a = false;
      v();
      z();
    } 
    super.d();
  }
  
  public void e() {}
  
  public void c() {}
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : [I
    //   4: aload_0
    //   5: getfield a : I
    //   8: iaload
    //   9: ifne -> 81
    //   12: aload_0
    //   13: getfield a : I
    //   16: aload_0
    //   17: getfield e : [I
    //   20: arraylength
    //   21: iconst_1
    //   22: isub
    //   23: if_icmplt -> 81
    //   26: aload_0
    //   27: iconst_2
    //   28: putfield d : I
    //   31: aload_0
    //   32: invokevirtual z : ()V
    //   35: aload_0
    //   36: iconst_0
    //   37: putfield c : Z
    //   40: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   43: getfield e : Lcom/fs/arpg/m;
    //   46: ifnull -> 80
    //   49: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   52: getfield e : Lcom/fs/arpg/m;
    //   55: iconst_0
    //   56: aconst_null
    //   57: invokevirtual d : (ILjava/lang/Object;)V
    //   60: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   63: getfield e : Lcom/fs/arpg/m;
    //   66: getfield d : Z
    //   69: ifne -> 79
    //   72: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   75: aconst_null
    //   76: putfield e : Lcom/fs/arpg/m;
    //   79: return
    //   80: return
    //   81: aload_0
    //   82: getfield d : I
    //   85: iconst_1
    //   86: if_icmpeq -> 98
    //   89: aload_0
    //   90: iconst_1
    //   91: putfield d : I
    //   94: aload_0
    //   95: invokevirtual z : ()V
    //   98: aload_0
    //   99: getfield e : [I
    //   102: aload_0
    //   103: getfield a : I
    //   106: iaload
    //   107: ifne -> 120
    //   110: aload_0
    //   111: dup
    //   112: getfield a : I
    //   115: iconst_1
    //   116: iadd
    //   117: putfield a : I
    //   120: aload_0
    //   121: getfield d : [I
    //   124: aload_0
    //   125: getfield a : I
    //   128: iaload
    //   129: istore_1
    //   130: aload_0
    //   131: getfield b : I
    //   134: iload_1
    //   135: if_icmpeq -> 147
    //   138: aload_0
    //   139: iload_1
    //   140: putfield b : I
    //   143: aload_0
    //   144: invokevirtual h : ()V
    //   147: aload_0
    //   148: getfield e : [I
    //   151: aload_0
    //   152: getfield a : I
    //   155: iaload
    //   156: aload_0
    //   157: getfield c : [I
    //   160: aload_0
    //   161: getfield a : I
    //   164: iaload
    //   165: if_icmple -> 202
    //   168: aload_0
    //   169: getfield c : [I
    //   172: aload_0
    //   173: getfield a : I
    //   176: iaload
    //   177: istore_1
    //   178: aload_0
    //   179: getfield e : [I
    //   182: aload_0
    //   183: getfield a : I
    //   186: dup2
    //   187: iaload
    //   188: aload_0
    //   189: getfield c : [I
    //   192: aload_0
    //   193: getfield a : I
    //   196: iaload
    //   197: isub
    //   198: iastore
    //   199: goto -> 222
    //   202: aload_0
    //   203: getfield e : [I
    //   206: aload_0
    //   207: getfield a : I
    //   210: iaload
    //   211: istore_1
    //   212: aload_0
    //   213: getfield e : [I
    //   216: aload_0
    //   217: getfield a : I
    //   220: iconst_0
    //   221: iastore
    //   222: aload_0
    //   223: getfield d : [Z
    //   226: aload_0
    //   227: getfield a : I
    //   230: baload
    //   231: ifeq -> 248
    //   234: aload_0
    //   235: aload_0
    //   236: aload_0
    //   237: getfield b : I
    //   240: iload_1
    //   241: ineg
    //   242: invokevirtual d : (Lcom/fs/arpg/e;II)V
    //   245: goto -> 258
    //   248: aload_0
    //   249: aload_0
    //   250: aload_0
    //   251: getfield b : I
    //   254: iload_1
    //   255: invokevirtual d : (Lcom/fs/arpg/e;II)V
    //   258: aload_0
    //   259: aload_0
    //   260: getfield f : I
    //   263: aload_0
    //   264: getfield i : I
    //   267: iconst_0
    //   268: iconst_0
    //   269: invokestatic d : (Lcom/fs/arpg/e;IIZZ)V
    //   272: return
  }
  
  public final void d(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ab : I
    //   4: aload_0
    //   5: getfield b : [I
    //   8: aload_0
    //   9: getfield j : I
    //   12: iaload
    //   13: isub
    //   14: invokestatic abs : (I)I
    //   17: istore_2
    //   18: aload_0
    //   19: getfield ac : I
    //   22: aload_0
    //   23: getfield z : [I
    //   26: aload_0
    //   27: getfield j : I
    //   30: iaload
    //   31: isub
    //   32: invokestatic abs : (I)I
    //   35: istore_3
    //   36: iload_2
    //   37: aload_0
    //   38: getfield c : I
    //   41: if_icmpge -> 82
    //   44: iload_3
    //   45: aload_0
    //   46: getfield c : I
    //   49: if_icmpge -> 82
    //   52: aload_0
    //   53: aload_0
    //   54: getfield b : [I
    //   57: aload_0
    //   58: getfield j : I
    //   61: iaload
    //   62: putfield f : I
    //   65: aload_0
    //   66: aload_0
    //   67: getfield z : [I
    //   70: aload_0
    //   71: getfield j : I
    //   74: iaload
    //   75: putfield i : I
    //   78: iconst_0
    //   79: istore_2
    //   80: iconst_0
    //   81: istore_3
    //   82: iload_2
    //   83: ifne -> 165
    //   86: iload_3
    //   87: ifne -> 165
    //   90: aload_0
    //   91: getfield j : I
    //   94: aload_0
    //   95: getfield b : [I
    //   98: arraylength
    //   99: iconst_1
    //   100: isub
    //   101: if_icmpne -> 165
    //   104: aload_0
    //   105: aload_0
    //   106: getfield f : I
    //   109: aload_0
    //   110: getfield i : I
    //   113: iload_1
    //   114: iconst_0
    //   115: invokestatic d : (Lcom/fs/arpg/e;IIZZ)V
    //   118: aload_0
    //   119: getfield e : Lcom/fs/arpg/m;
    //   122: invokevirtual f : ()V
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield e : Z
    //   130: aload_0
    //   131: aconst_null
    //   132: putfield e : Lcom/fs/arpg/m;
    //   135: aload_0
    //   136: getfield b : [I
    //   139: aload_0
    //   140: getfield j : I
    //   143: iconst_0
    //   144: iastore
    //   145: aload_0
    //   146: getfield z : [I
    //   149: aload_0
    //   150: getfield j : I
    //   153: iconst_0
    //   154: iastore
    //   155: aload_0
    //   156: iconst_2
    //   157: putfield d : I
    //   160: aload_0
    //   161: invokevirtual z : ()V
    //   164: return
    //   165: iload_2
    //   166: ifne -> 299
    //   169: iload_3
    //   170: ifne -> 299
    //   173: aload_0
    //   174: aload_0
    //   175: getfield f : I
    //   178: aload_0
    //   179: getfield i : I
    //   182: iload_1
    //   183: iconst_0
    //   184: invokestatic d : (Lcom/fs/arpg/e;IIZZ)V
    //   187: aload_0
    //   188: dup
    //   189: getfield j : I
    //   192: iconst_1
    //   193: iadd
    //   194: putfield j : I
    //   197: aload_0
    //   198: getfield ab : I
    //   201: aload_0
    //   202: getfield b : [I
    //   205: aload_0
    //   206: getfield j : I
    //   209: iaload
    //   210: isub
    //   211: invokestatic abs : (I)I
    //   214: istore_2
    //   215: aload_0
    //   216: getfield ac : I
    //   219: aload_0
    //   220: getfield z : [I
    //   223: aload_0
    //   224: getfield j : I
    //   227: iaload
    //   228: isub
    //   229: invokestatic abs : (I)I
    //   232: pop
    //   233: iload_2
    //   234: ifne -> 268
    //   237: aload_0
    //   238: aload_0
    //   239: getfield ac : I
    //   242: aload_0
    //   243: getfield z : [I
    //   246: aload_0
    //   247: getfield j : I
    //   250: iaload
    //   251: isub
    //   252: ifge -> 259
    //   255: iconst_1
    //   256: goto -> 260
    //   259: iconst_0
    //   260: putfield b : I
    //   263: aload_0
    //   264: invokevirtual h : ()V
    //   267: return
    //   268: aload_0
    //   269: aload_0
    //   270: getfield ab : I
    //   273: aload_0
    //   274: getfield b : [I
    //   277: aload_0
    //   278: getfield j : I
    //   281: iaload
    //   282: isub
    //   283: ifle -> 290
    //   286: iconst_2
    //   287: goto -> 291
    //   290: iconst_3
    //   291: putfield b : I
    //   294: aload_0
    //   295: invokevirtual h : ()V
    //   298: return
    //   299: aload_0
    //   300: getfield b : I
    //   303: iconst_2
    //   304: if_icmpeq -> 315
    //   307: aload_0
    //   308: getfield b : I
    //   311: iconst_3
    //   312: if_icmpne -> 380
    //   315: iload_2
    //   316: aload_0
    //   317: getfield c : I
    //   320: if_icmpge -> 445
    //   323: aload_0
    //   324: aload_0
    //   325: getfield b : [I
    //   328: aload_0
    //   329: getfield j : I
    //   332: iaload
    //   333: putfield f : I
    //   336: aload_0
    //   337: aload_0
    //   338: getfield f : I
    //   341: aload_0
    //   342: getfield i : I
    //   345: iload_1
    //   346: iconst_0
    //   347: invokestatic d : (Lcom/fs/arpg/e;IIZZ)V
    //   350: aload_0
    //   351: aload_0
    //   352: getfield ac : I
    //   355: aload_0
    //   356: getfield z : [I
    //   359: aload_0
    //   360: getfield j : I
    //   363: iaload
    //   364: if_icmple -> 371
    //   367: iconst_0
    //   368: goto -> 372
    //   371: iconst_1
    //   372: putfield b : I
    //   375: aload_0
    //   376: invokevirtual h : ()V
    //   379: return
    //   380: iload_3
    //   381: aload_0
    //   382: getfield c : I
    //   385: if_icmpge -> 445
    //   388: aload_0
    //   389: aload_0
    //   390: getfield f : I
    //   393: aload_0
    //   394: getfield i : I
    //   397: iload_1
    //   398: iconst_0
    //   399: invokestatic d : (Lcom/fs/arpg/e;IIZZ)V
    //   402: aload_0
    //   403: aload_0
    //   404: getfield z : [I
    //   407: aload_0
    //   408: getfield j : I
    //   411: iaload
    //   412: putfield i : I
    //   415: aload_0
    //   416: aload_0
    //   417: getfield ab : I
    //   420: aload_0
    //   421: getfield b : [I
    //   424: aload_0
    //   425: getfield j : I
    //   428: iaload
    //   429: if_icmple -> 436
    //   432: iconst_2
    //   433: goto -> 437
    //   436: iconst_3
    //   437: putfield b : I
    //   440: aload_0
    //   441: invokevirtual h : ()V
    //   444: return
    //   445: aload_0
    //   446: aload_0
    //   447: aload_0
    //   448: getfield b : I
    //   451: aload_0
    //   452: getfield c : I
    //   455: invokevirtual d : (Lcom/fs/arpg/e;II)V
    //   458: aload_0
    //   459: aload_0
    //   460: getfield f : I
    //   463: aload_0
    //   464: getfield i : I
    //   467: iload_1
    //   468: iconst_0
    //   469: invokestatic d : (Lcom/fs/arpg/e;IIZZ)V
    //   472: return
  }
  
  private static void d(e parame, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1) {
      ba.c.d(parame, paramInt1, paramInt2);
      return;
    } 
    ba.e.d(parame, paramInt1, paramInt2);
  }
  
  public final void d(e parame, int paramInt1, int paramInt2) {
    this.f = this.ab;
    this.i = this.ac;
    boolean bool1 = false;
    boolean bool2 = false;
    if (parame.d() && !((e)parame.d).b) {
      boolean bool3 = ((e)this.d).c;
      boolean bool4;
      if (!(bool4 = ((e)this.d).b)) {
        bool2 = -bool3;
      } else if (bool4 == 2) {
        bool1 = -bool3;
      } else if (bool4 == 3) {
        bool1 = bool3;
      } else if (bool4 == true) {
        bool2 = bool3;
      } 
    } 
    switch (paramInt1) {
      case 0:
        this.i -= paramInt2;
        break;
      case 1:
        this.i += paramInt2;
        break;
      case 2:
        this.f -= paramInt2;
        break;
      case 3:
        this.f += paramInt2;
        break;
    } 
    this.f += bool1;
    this.i += bool2;
  }
  
  void a() {}
  
  void e(boolean paramBoolean) {
    if (paramBoolean)
      v.d().d(((aa)this.d).d, this); 
    this.c = this.d.d(this.b, 0);
    this.e = false;
    d();
  }
  
  public void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    e(paramGraphics, paramInt1, paramInt2);
  }
  
  void z() {
    a();
    e(true);
    v();
    this.d.d(this);
  }
  
  void h() {
    e(false);
    this.d.d(this);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\e.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */