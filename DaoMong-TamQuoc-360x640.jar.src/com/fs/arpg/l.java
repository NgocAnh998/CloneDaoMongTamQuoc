package com.fs.arpg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Hashtable;

public final class l {
  private static l d;
  
  private at d;
  
  bh d;
  
  private bh e;
  
  private bh c;
  
  Hashtable d;
  
  x[] d;
  
  private boolean e;
  
  static boolean d;
  
  x[] e;
  
  int[] d;
  
  int d;
  
  ae[] d;
  
  int e;
  
  s[] d;
  
  int c;
  
  x d;
  
  h d = new h();
  
  h e;
  
  private h c = new h();
  
  private int[] e = (int[])new h();
  
  private int b;
  
  public static l d() {
    if (d == null)
      d = (h)new l(); 
    return (l)d;
  }
  
  public final void d(x paramx) {
    if (((as)paramx.d).d == 0)
      return; 
    if (!paramx.g)
      return; 
    this.d = (h)paramx;
    ao ao = paramx.d;
    ah.d((String)ao);
  }
  
  private l() {
    this.e = new int[5];
    this.d = (h)new at("/role.idx", "/role.pkg");
    d();
  }
  
  public final void d() {
    this.e = new int[5];
    this.d = (h)new bh(30);
    this.e = (int[])new bh(30);
    this.c = (h)new bh(30);
    this.d = (h)new Hashtable();
    this.d = (h)new x[80];
    this.e = (int[])new x[80];
    this.d = (h)new int[80];
    this.d = false;
    this.e = false;
    this.d = (h)new ae[80];
    this.d = (h)new s[80];
    this.c = false;
    this.d = null;
  }
  
  public final DataInputStream d(String paramString) {
    return this.d.d(paramString);
  }
  
  public static short d(String paramString) {
    return (short)Integer.parseInt(paramString.substring(4, paramString.length() - 4));
  }
  
  private static String d(short paramShort) {
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer("role")).append(paramShort);
    stringBuffer.append(".dat");
    return stringBuffer.toString();
  }
  
  public final o d(String paramString) {
    short s1 = d(paramString);
    o o;
    if ((o = (o)this.c.d(s1)) == null) {
      (o = new o()).d = s1;
      o.d(paramString);
      this.c.d(s1, o);
    } 
    return o;
  }
  
  private o d(short paramShort) {
    o o;
    if ((o = (o)this.c.d(paramShort)) == null) {
      String str = d(paramShort);
      (o = new o()).d = paramShort;
      o.d(str);
      this.c.d(paramShort, o);
    } 
    return o;
  }
  
  public final as d(short paramShort) {
    as as;
    if ((as = (as)this.d.d(paramShort)) == null) {
      String str = d(paramShort);
      (as = new as()).d = paramShort;
      as.d(str);
      this.d.d(paramShort, as);
    } 
    return as;
  }
  
  public final au d(short paramShort) {
    au au;
    if ((au = (au)this.e.d(paramShort)) == null) {
      String str = d(paramShort);
      (au = new au()).d(str);
      this.e.d(paramShort, au);
    } 
    return au;
  }
  
  public final void d(ae paramae) {
    this.d[this.e] = (h)paramae;
    this.e++;
  }
  
  public final ae d(String paramString) {
    for (byte b = 0; b < this.e; b++) {
      if (((ae)this.d[b]).d.equals(paramString))
        return (ae)this.d[b]; 
    } 
    return null;
  }
  
  public final void e(ae paramae) {
    if (d((Object[])this.d, this.e, paramae) && this.e > null)
      this.e--; 
  }
  
  public final void e(x paramx) {
    int i = this.d.size();
    this.d[i] = (h)paramx;
    if (((as)paramx.d).d != 0)
      d(paramx); 
    this.d.put(paramx.d, paramx);
  }
  
  private void b(x paramx) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : [I
    //   4: aload_0
    //   5: getfield d : I
    //   8: iconst_m1
    //   9: iastore
    //   10: aload_0
    //   11: getfield e : [Lcom/fs/arpg/x;
    //   14: aload_0
    //   15: getfield d : I
    //   18: aload_1
    //   19: aastore
    //   20: aload_0
    //   21: dup
    //   22: getfield d : I
    //   25: iconst_1
    //   26: iadd
    //   27: putfield d : I
    //   30: return
  }
  
  public final void c(x paramx) {
    int i = this.d.size();
    this.d.remove(paramx.d);
    d((Object[])this.d, i, paramx);
    if (paramx == this.d) {
      this.d = null;
      byte b = 0;
      i = this.d.size();
      while (b < i) {
        h h1;
        if (((as)((x)(h1 = this.d[b])).d).d != 0)
          this.d = h1; 
        b++;
      } 
    } 
  }
  
  public final x d(String paramString) {
    return (x)this.d.get(paramString);
  }
  
  public final void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/util/Hashtable;
    //   4: invokevirtual size : ()I
    //   7: istore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iload_2
    //   11: iload_1
    //   12: if_icmpge -> 44
    //   15: aload_0
    //   16: getfield d : [Lcom/fs/arpg/x;
    //   19: iload_2
    //   20: aaload
    //   21: dup
    //   22: astore_3
    //   23: ifnull -> 38
    //   26: aload_3
    //   27: invokevirtual e : ()V
    //   30: aload_0
    //   31: getfield d : Ljava/util/Hashtable;
    //   34: invokevirtual size : ()I
    //   37: istore_1
    //   38: iinc #2, 1
    //   41: goto -> 10
    //   44: aload_0
    //   45: astore_1
    //   46: iconst_0
    //   47: istore_3
    //   48: iload_3
    //   49: aload_1
    //   50: getfield d : Ljava/util/Hashtable;
    //   53: invokevirtual size : ()I
    //   56: if_icmpge -> 148
    //   59: aload_1
    //   60: getfield d : [Lcom/fs/arpg/x;
    //   63: iload_3
    //   64: aaload
    //   65: dup
    //   66: astore_2
    //   67: invokevirtual e : ()Z
    //   70: ifeq -> 142
    //   73: aload_1
    //   74: aload_2
    //   75: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   78: aload_2
    //   79: invokevirtual i : ()V
    //   82: iinc #3, -1
    //   85: aload_2
    //   86: invokevirtual b : ()Z
    //   89: ifeq -> 138
    //   92: aload_1
    //   93: aload_2
    //   94: astore #5
    //   96: dup
    //   97: astore #4
    //   99: getfield d : [I
    //   102: aload #4
    //   104: getfield d : I
    //   107: getstatic com/fs/arpg/aq.c : I
    //   110: iastore
    //   111: aload #4
    //   113: getfield e : [Lcom/fs/arpg/x;
    //   116: aload #4
    //   118: getfield d : I
    //   121: aload #5
    //   123: aastore
    //   124: aload #4
    //   126: dup
    //   127: getfield d : I
    //   130: iconst_1
    //   131: iadd
    //   132: putfield d : I
    //   135: goto -> 142
    //   138: aload_2
    //   139: invokevirtual l : ()V
    //   142: iinc #3, 1
    //   145: goto -> 48
    //   148: aload_0
    //   149: astore_1
    //   150: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/m;
    //   153: ifnull -> 165
    //   156: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/m;
    //   159: invokevirtual e : ()Z
    //   162: ifeq -> 323
    //   165: aload_1
    //   166: getfield e : Z
    //   169: ifne -> 323
    //   172: iconst_0
    //   173: istore #4
    //   175: iload #4
    //   177: aload_1
    //   178: getfield d : I
    //   181: if_icmpge -> 323
    //   184: aload_1
    //   185: getfield e : [Lcom/fs/arpg/x;
    //   188: iload #4
    //   190: aaload
    //   191: astore_2
    //   192: aload_1
    //   193: getfield d : [I
    //   196: iload #4
    //   198: iaload
    //   199: iflt -> 317
    //   202: getstatic com/fs/arpg/aq.c : I
    //   205: aload_1
    //   206: getfield d : [I
    //   209: iload #4
    //   211: iaload
    //   212: isub
    //   213: sipush #300
    //   216: if_icmplt -> 317
    //   219: aload_1
    //   220: aload_2
    //   221: iload #4
    //   223: istore #6
    //   225: astore_3
    //   226: dup
    //   227: astore #5
    //   229: getfield d : [I
    //   232: iload #6
    //   234: aload #5
    //   236: getfield d : [I
    //   239: aload #5
    //   241: getfield d : I
    //   244: iconst_1
    //   245: isub
    //   246: iaload
    //   247: iastore
    //   248: aload #5
    //   250: getfield d : [I
    //   253: aload #5
    //   255: getfield d : I
    //   258: iconst_1
    //   259: isub
    //   260: iconst_0
    //   261: iastore
    //   262: aload #5
    //   264: getfield e : [Lcom/fs/arpg/x;
    //   267: aload #5
    //   269: getfield d : I
    //   272: aload_3
    //   273: invokestatic d : ([Ljava/lang/Object;ILjava/lang/Object;)Z
    //   276: iconst_0
    //   277: istore_3
    //   278: ifeq -> 300
    //   281: aload #5
    //   283: getfield d : I
    //   286: ifle -> 300
    //   289: aload #5
    //   291: dup
    //   292: getfield d : I
    //   295: iconst_1
    //   296: isub
    //   297: putfield d : I
    //   300: aload_2
    //   301: invokevirtual g : ()V
    //   304: aload_2
    //   305: iconst_1
    //   306: putfield j : Z
    //   309: aload_1
    //   310: aload_2
    //   311: invokevirtual e : (Lcom/fs/arpg/x;)V
    //   314: iinc #4, -1
    //   317: iinc #4, 1
    //   320: goto -> 175
    //   323: return
  }
  
  public final void c() {
    for (byte b = 0; b < this.c; b++) {
      h h1;
      (h1 = this.d[b]).e();
      if (!((s)h1).j) {
        e((s)h1);
        b--;
        ba.c.d((be)h1);
      } 
    } 
  }
  
  final void b() {
    for (byte b = 0; b < this.c; b++)
      ((s)this.d[b]).j = false; 
  }
  
  final void a() {
    ba.d.z();
    this.d = null;
    aw.d();
    byte b;
    for (b = 0; b < this.d.size(); b++) {
      h h1;
      if (((as)((x)(h1 = this.d[b])).d).d == 0 && ((x)h1).l && ((x)h1).g) {
        c((x)h1);
        h1.i();
        b--;
      } 
    } 
    for (b = 0; b < this.c; b++) {
      h h1 = this.d[b];
      ba.c.d((be)h1);
      ((s)h1).j = false;
    } 
    ba.d.b(0);
    ((p)ba.d).d = 2;
    ba.d.z();
  }
  
  public final boolean d(e parame, int paramInt1, int paramInt2) {
    int i;
    boolean bool;
    if ((bool = parame.b) <= true) {
      this.d.d(parame.ab - 5, parame.ac, paramInt1 + 5, paramInt2);
    } else {
      this.d.d(parame.ab, parame.ac - 4, paramInt1, paramInt2 + 4);
    } 
    int j = this.d.size();
    byte b;
    for (b = 0; b < j; b++) {
      h h1;
      if ((!((x)(h1 = this.d[b])).l || !((x)h1).o) && (!((as)((x)h1).d).b || !((x)h1).o) && ((x)h1).g && (((as)((x)h1).d).b || ((as)((x)h1).d).d.length == 0))
        if (!((x)h1).o) {
          h1.e((h)this.e);
          this.e.d(((x)h1).ab, ((x)h1).ac);
          if (this.e.d(paramInt1, paramInt2)) {
            parame.f = parame.ab;
            parame.i = parame.ac;
            return false;
          } 
        } else {
          this.e.d(((x)h1).ab - 5, ((x)h1).ac - 4, ((x)h1).ab + 5, ((x)h1).ac + 4);
          if (this.d.d((h)this.e)) {
            switch (bool) {
              case false:
                if (parame.ac > ((x)h1).ac) {
                  i = ((x)h1).ac + 8 + 1;
                  if (ba.d.d(paramInt1 >> 4, i >> 4))
                    parame.i = i; 
                  break;
                } 
                parame.f = parame.ab;
                parame.i = parame.ac;
                break;
              case true:
                if (parame.ac < ((x)h1).ac) {
                  i = ((x)h1).ac - 8 - 1;
                  if (ba.d.d(paramInt1 >> 4, i >> 4))
                    parame.i = i; 
                  break;
                } 
                parame.f = parame.ab;
                parame.i = parame.ac;
                break;
              case true:
                if (parame.ab > ((x)h1).ab) {
                  i = ((x)h1).ab + 10 + 1;
                  if (ba.d.d(i >> 4, paramInt2 >> 4))
                    parame.f = i; 
                  break;
                } 
                parame.f = parame.ab;
                parame.i = parame.ac;
                break;
              case true:
                if (parame.ab < ((x)h1).ab) {
                  i = ((x)h1).ab - 10 - 1;
                  if (ba.d.d(i >> 4, paramInt2 >> 4))
                    parame.f = i; 
                  break;
                } 
                parame.f = parame.ab;
                parame.i = parame.ac;
                break;
            } 
            return false;
          } 
        }  
    } 
    for (b = 0; b < this.e; b++) {
      h h1;
      if (((ae)(h1 = this.d[b])).g) {
        h1.e(this.d);
        this.d.d(((ae)h1).ab, ((ae)h1).ac);
        if (this.d.d(paramInt1, paramInt2)) {
          switch (i) {
            case 0:
              parame.i += this.d.b - parame.i + 2;
              break;
            case 1:
              parame.i -= parame.i - this.d.e + 2;
              break;
            case 2:
              parame.f += this.d.c - parame.f + 2;
              break;
            case 3:
              parame.f -= parame.f - this.d.d + 2;
              break;
          } 
          return false;
        } 
      } 
    } 
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2) {
    this.d.d(paramInt1 - 5, paramInt2 - 4, paramInt1 + 5, paramInt2);
    int i = this.d.size();
    byte b;
    for (b = 0; b < i; b++) {
      h h1;
      if ((!((x)(h1 = this.d[b])).l || !((x)h1).o) && ((x)h1).g) {
        this.e.d(((x)h1).ab - 5, ((x)h1).ac - 4, ((x)h1).ab + 5, ((x)h1).ac);
        if (this.d.d((h)this.e))
          return false; 
      } 
    } 
    for (b = 0; b < this.e; b++) {
      h h1;
      if (((ae)(h1 = this.d[b])).g) {
        h1.e(this.d);
        this.d.d(((ae)h1).ab, ((ae)h1).ac);
        if (this.d.d(paramInt1, paramInt2))
          return false; 
      } 
    } 
    return true;
  }
  
  public final boolean d(x paramx, int paramInt1, int paramInt2) {
    this.d.d(paramInt1 - 5, paramInt2 - 4, paramInt1 + 5, paramInt2);
    int i = this.d.size();
    byte b;
    for (b = 0; b < i; b++) {
      h h1 = this.d[b];
      if (paramx != h1 && ((x)h1).g && paramx.l == ((x)h1).l) {
        this.e.d(((x)h1).ab - 5, ((x)h1).ac - 4, ((x)h1).ab + 5, ((x)h1).ac);
        if (this.d.d((h)this.e))
          return false; 
      } 
    } 
    this.e.d(((p)ba.d).ab - 5, ((p)ba.d).ac - 4, ((p)ba.d).ab + 5, ((p)ba.d).ac);
    if (this.d.d((h)this.e))
      return false; 
    for (b = 0; b < this.e; b++) {
      h h1;
      if (((ae)(h1 = this.d[b])).g) {
        h1.e(this.d);
        this.d.d(((ae)h1).ab, ((ae)h1).ac);
        if (this.d.d(paramInt1, paramInt2))
          return false; 
      } 
    } 
    return true;
  }
  
  public final void d(s params) {
    this.d[this.c] = (h)params;
    this.c++;
  }
  
  public final void z() {
    byte b = 0;
    int i = this.d.size();
    while (b < i) {
      ((x)this.d[b]).d = null;
      b++;
    } 
  }
  
  public final e d(e parame) {
    h h1 = new h();
    byte b = 0;
    int i = this.d.size();
    while (b < i) {
      h h2;
      if ((h2 = this.d[b]) != parame) {
        h2.e(h1);
        h1.d(((x)h2).ab, ((x)h2).ac);
        if (h1.d(parame.ab, parame.ac))
          return (e)h2; 
      } 
      b++;
    } 
    return null;
  }
  
  private static boolean d(Object[] paramArrayOfObject, int paramInt, Object paramObject) {
    if (paramInt == 0) {
      System.out.println("Không tìm thấy" + paramObject + ", Kiểm tra vấn đề");
      return false;
    } 
    if (paramInt == 1) {
      paramArrayOfObject[0] = null;
      return true;
    } 
    byte b = -1;
    for (byte b1 = 0; b1 < paramInt; b1++) {
      if (paramObject == paramArrayOfObject[b1]) {
        b = b1;
        break;
      } 
    } 
    if (b < 0) {
      System.out.println("Không tìm thấy" + paramObject + ", Kiểm tra vấn đề");
      return false;
    } 
    if (b == paramInt - 1)
      paramArrayOfObject[b] = null; 
    paramArrayOfObject[b] = paramArrayOfObject[paramInt - 1];
    paramArrayOfObject[paramInt - 1] = null;
    return true;
  }
  
  private void e(s params) {
    if (d((Object[])this.d, this.c, params) && this.c > null)
      this.c--; 
  }
  
  public final void h() {
    if (!ba.d.b())
      return; 
    Hashtable hashtable;
    if ((hashtable = ba.d) == null)
      return; 
    if (ba.d != null && !ba.d.e())
      return; 
    if (((p)ba.d).j != 0)
      return; 
    this.b = 0;
    this.e = new int[5];
    if (hashtable.c()) {
      this.d.d();
      hashtable.d(this.d);
      if (!this.d.d()) {
        this.d.d(((p)hashtable).ab, ((p)hashtable).ac);
        byte b1 = 0;
        int j = this.d.size();
        while (b1 < j) {
          h h1;
          if (((x)(h1 = this.d[b1])).l && ((x)h1).g && ((x)h1).f == 0) {
            h1.e((h)this.e);
            this.e.d(((x)h1).ab, ((x)h1).ac);
            if (this.d.d((h)this.e)) {
              h1.d((p)hashtable);
              d((h)this.e, (x)h1);
            } 
          } 
          b1++;
        } 
      } 
    } 
    byte b = 0;
    int i = this.d.size();
    while (b < i) {
      h h1;
      if (!((x)(h1 = this.d[b])).l || !((x)h1).g) {
        h1.d(this.c);
        if (!this.c.d()) {
          this.c.d(((x)h1).ab, ((x)h1).ac);
          for (byte b1 = 0; b1 < i; b1++) {
            h h2;
            if (((x)(h2 = this.d[b1])).l && ((x)h2).g && ((x)h2).f == 0) {
              h2.e((h)this.e);
              this.e.d(((x)h2).ab, ((x)h2).ac);
              if (this.c.d((h)this.e)) {
                h2.d((x)h1);
                d((h)this.e, (x)h2);
              } 
            } 
          } 
        } 
      } 
      b++;
    } 
    ba.d.e(this.d);
    this.d.d(((p)hashtable).ab, ((p)hashtable).ac);
    b = 0;
    i = this.d.size();
    while (b < i) {
      h h1;
      if (((x)(h1 = this.d[b])).l && ((x)h1).g) {
        h1.d((h)this.e);
        if (!this.e.d()) {
          this.e.d(((x)h1).ab, ((x)h1).ac);
          if (this.d.d((h)this.e))
            ba.d.d((x)h1); 
        } 
      } 
      b++;
    } 
    for (b = 0; b < this.c; b++) {
      h h1;
      (h1 = this.d[b]).d((h)this.e);
      this.e.d(((s)h1).ab, ((s)h1).ac);
      if (((s)h1).d.d != null) {
        if (this.e.d(this.d))
          ba.d.d((s)h1); 
      } else {
        byte b1 = 0;
        int j = this.d.size();
        while (b1 < j) {
          h h2;
          if (((x)(h2 = this.d[b1])).l && ((x)h2).g && ((x)h2).f == 0) {
            h2.e(this.c);
            this.c.d(((x)h2).ab, ((x)h2).ac);
            if (this.e.d(this.c)) {
              h2.d((s)h1);
              d(this.c, (x)h2);
            } 
          } 
          b1++;
        } 
      } 
    } 
    if (this.b != 0)
      ba.d.d(this.e, this.b + 1); 
  }
  
  private void d(h paramh, x paramx) {
    this.e[this.b] = paramx.ab << 16 | paramx.ac - (paramh.d() >> 1) & 0xFFFF;
    if (paramx.q)
      this.e[this.b] = this.e[this.b] | Integer.MIN_VALUE; 
    this.b++;
    if (this.b >= this.e.length)
      this.b = this.e.length - 1; 
  }
  
  public final void g() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield e : Z
    //   5: iconst_0
    //   6: istore_1
    //   7: iload_1
    //   8: aload_0
    //   9: getfield d : I
    //   12: if_icmpge -> 44
    //   15: aload_0
    //   16: getfield e : [Lcom/fs/arpg/x;
    //   19: iload_1
    //   20: aaload
    //   21: dup
    //   22: astore_2
    //   23: invokevirtual g : ()V
    //   26: aload_0
    //   27: aload_2
    //   28: invokevirtual e : (Lcom/fs/arpg/x;)V
    //   31: aload_0
    //   32: getfield e : [Lcom/fs/arpg/x;
    //   35: iload_1
    //   36: aconst_null
    //   37: aastore
    //   38: iinc #1, 1
    //   41: goto -> 7
    //   44: aload_0
    //   45: iconst_0
    //   46: putfield d : I
    //   49: return
  }
  
  public final void f() {
    this.e = true;
    byte b = 0;
    int i = this.d.size();
    while (b < i) {
      h h2;
      if (((x)(h2 = this.d[b])).l && h2.b()) {
        h2.i();
        b((x)h2);
        c((x)h2);
        i = this.d.size();
        b--;
      } 
      b++;
    } 
    h h1;
    while ((h1 = this.c) > null) {
      h h2 = this.d[0];
      ba.c.d((be)h2);
      e((s)h2);
    } 
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    paramDataInputStream.readBoolean();
    d = false;
    short s1 = paramDataInputStream.readShort();
    short s2;
    for (s2 = 0; s2 < s1; s2++) {
      x x1;
      (x1 = new x()).d(paramDataInputStream);
      e(x1);
      if (x1.g)
        if (((as)x1.d).a) {
          ba.c.e(x1);
        } else {
          ba.e.e(x1);
        }  
    } 
    s2 = paramDataInputStream.readShort();
    for (byte b1 = 0; b1 < s2; b1++) {
      x x1;
      (x1 = new x()).d(paramDataInputStream);
      if (paramDataInputStream.readInt() < 0) {
        b(x1);
      } else {
        e(x1);
        if (x1.g)
          if (((as)x1.d).a) {
            ba.c.e(x1);
          } else {
            ba.e.e(x1);
          }  
      } 
    } 
    s1 = paramDataInputStream.readShort();
    v v = v.d();
    for (byte b2 = 0; b2 < s1; b2++) {
      s2 = paramDataInputStream.readShort();
      byte b3 = paramDataInputStream.readByte();
      short s3 = paramDataInputStream.readShort();
      short s4 = paramDataInputStream.readShort();
      boolean bool = paramDataInputStream.readBoolean();
      byte b4 = paramDataInputStream.readByte();
      String str = paramDataInputStream.readUTF();
      ae ae1 = new ae(str, s3, s4);
      s4 = s2;
      l l1;
      o o2;
      if ((o2 = (o)(l1 = this).c.d(s4)) == null) {
        String str1 = d(s4);
        (o2 = new o()).d = s4;
        o2.d(str1);
        l1.c.d(s4, o2);
      } 
      o o1 = o2;
      ae1.d = o1;
      v.d(o1.d, ae1);
      ae1.g = bool;
      ae1.b = b4;
      ae1.d = b3;
      ae1.a();
      d(ae1);
      if (bool)
        ba.e.e(ae1); 
      ae1.e = d(paramDataInputStream);
      ae1.c = d(paramDataInputStream);
    } 
    paramDataInputStream.readShort();
  }
  
  public static m d(DataInputStream paramDataInputStream) {
    String str;
    return ((str = paramDataInputStream.readUTF()) == null || str.length() == 0) ? null : new m(str);
  }
  
  public static void d(DataOutputStream paramDataOutputStream, m paramm) {
    if (paramm == null) {
      paramDataOutputStream.writeUTF("");
      return;
    } 
    paramDataOutputStream.writeUTF((String)paramm.d);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\l.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */