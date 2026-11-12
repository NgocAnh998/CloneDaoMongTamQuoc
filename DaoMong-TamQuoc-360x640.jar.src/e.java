public final class e {
  public l d;
  
  public f d;
  
  public int d;
  
  public int e;
  
  int c;
  
  public int b;
  
  boolean d;
  
  public boolean e;
  
  boolean c;
  
  public e(l paraml) {
    this.d = paraml;
  }
  
  public final void d(int paramInt, Object paramObject) {
    this.d.d[this.e + paramInt] = paramObject;
  }
  
  public final Object d(int paramInt) {
    return this.d.d[this.e + paramInt];
  }
  
  public final int d(Object paramObject) {
    int i = d();
    e(i + 1);
    d(i, paramObject);
    return 1;
  }
  
  private int d(Object paramObject1, Object paramObject2) {
    int i = d();
    e(i + 2);
    d(i, paramObject1);
    d(i + 1, paramObject2);
    return 2;
  }
  
  private int e() {
    return d((Object)null);
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ll;
    //   4: aload_0
    //   5: getfield e : I
    //   8: iload_1
    //   9: iadd
    //   10: aload_0
    //   11: getfield e : I
    //   14: iload_2
    //   15: iadd
    //   16: iload_3
    //   17: invokevirtual d : (III)V
    //   20: return
  }
  
  public final void d(int paramInt1, int paramInt2) {
    while (paramInt1 <= paramInt2) {
      this.d.d[this.e + paramInt1] = null;
      paramInt1++;
    } 
  }
  
  public final void d(int paramInt) {
    if (d() < paramInt)
      e(paramInt); 
    d(paramInt, d() - 1);
  }
  
  public final void e(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ll;
    //   4: aload_0
    //   5: getfield e : I
    //   8: iload_1
    //   9: iadd
    //   10: invokevirtual d : (I)V
    //   13: return
  }
  
  public final void c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ll;
    //   4: aload_0
    //   5: getfield e : I
    //   8: iload_1
    //   9: iadd
    //   10: invokevirtual e : (I)V
    //   13: return
  }
  
  public final s d(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ll;
    //   4: aload_0
    //   5: getfield e : I
    //   8: iload_1
    //   9: iadd
    //   10: istore_2
    //   11: dup
    //   12: astore_1
    //   13: getfield d : Ljava/util/Vector;
    //   16: invokevirtual size : ()I
    //   19: istore_3
    //   20: goto -> 56
    //   23: aload_1
    //   24: getfield d : Ljava/util/Vector;
    //   27: iload_3
    //   28: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   31: checkcast s
    //   34: dup
    //   35: astore #4
    //   37: getfield d : I
    //   40: iload_2
    //   41: if_icmpne -> 47
    //   44: aload #4
    //   46: areturn
    //   47: aload #4
    //   49: getfield d : I
    //   52: iload_2
    //   53: if_icmplt -> 63
    //   56: iinc #3, -1
    //   59: iload_3
    //   60: ifge -> 23
    //   63: new s
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: dup
    //   71: astore #4
    //   73: aload_1
    //   74: putfield d : Ll;
    //   77: aload #4
    //   79: iload_2
    //   80: putfield d : I
    //   83: aload_1
    //   84: getfield d : Ljava/util/Vector;
    //   87: aload #4
    //   89: iload_3
    //   90: iconst_1
    //   91: iadd
    //   92: invokevirtual insertElementAt : (Ljava/lang/Object;I)V
    //   95: aload #4
    //   97: areturn
  }
  
  public final int d() {
    boolean bool;
    return (bool = this.d).d - this.e;
  }
  
  public final void d() {
    if (e()) {
      this.d = false;
      if (((h)this.d.d).d != null) {
        this.e += this.b;
        e(((h)this.d.d).c);
        int i = Math.min(this.b, ((h)this.d.d).d);
        d(-this.b, 0, i);
        return;
      } 
      e(((h)this.d.d).c);
    } 
  }
  
  public final void e() {
    if (e())
      e(((h)this.d.d).c); 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    String str = ((h)this.d.d).d;
    int j;
    if ((j = this.b - str) < 0)
      j = 0; 
    if (paramInt2 == -1) {
      paramInt2 = j;
      e(paramInt1 + paramInt2);
    } 
    if (j > paramInt2)
      j = paramInt2; 
    d(-this.b + str, paramInt1, j);
    int i;
    if ((i = paramInt2 - j) > 0)
      d(paramInt1 + j, paramInt1 + paramInt2 - 1); 
  }
  
  public final j d() {
    return (j)(e() ? this.d.d : this.d.d);
  }
  
  public final boolean d() {
    return !e();
  }
  
  public final boolean e() {
    return (this.d != null);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */