import java.util.Vector;

public final class l {
  public j d;
  
  public l d;
  
  public String d;
  
  public Vector d;
  
  private static int e = 1000;
  
  private static int c = 10;
  
  private static final int b = 100;
  
  private static final int a = 10;
  
  public Object[] d;
  
  public int d;
  
  private e[] d;
  
  private int z;
  
  public i d;
  
  private int h;
  
  public boolean d = "";
  
  public final l d() {
    l l1;
    return l1 = new l(this.d, this.d);
  }
  
  public l() {}
  
  public l(i parami, j paramj) {
    this.d = parami;
    this.d = paramj;
    this.d = new Object[10];
    this.d = new e[10];
    this.d = new Vector();
  }
  
  public final e d(f paramf, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2) {
    b(this.z + 1);
    e e1;
    (e1 = d()).e = paramInt1;
    e1.c = paramInt2;
    e1.b = paramInt3;
    e1.d = paramBoolean1;
    e1.e = paramBoolean2;
    e1.d = paramf;
    return e1;
  }
  
  public final void d() {
    if (d())
      throw new RuntimeException("Stack underflow"); 
    b(this.z - 1);
  }
  
  private void e(e parame) {
    if (d())
      throw new RuntimeException("Stack underflow"); 
    if (d() == parame)
      b(this.z - 1); 
  }
  
  private final void c(int paramInt) {
    if (paramInt > 100)
      throw new RuntimeException("Stack overflow"); 
    int k;
    int m;
    for (m = k = this.d.length; m <= paramInt; m <<= 1);
    if (m > k) {
      e[] arrayOfE = new e[m];
      System.arraycopy(this.d, 0, arrayOfE, 0, k);
      this.d = arrayOfE;
    } 
  }
  
  private void b(int paramInt) {
    if (paramInt > this.z) {
      int k = paramInt;
      l l1 = this;
      if (k > 100)
        throw new RuntimeException("Stack overflow"); 
      int m;
      int n;
      for (n = m = l1.d.length; n <= k; n <<= 1);
      if (n > m) {
        e[] arrayOfE = new e[n];
        System.arraycopy(l1.d, 0, arrayOfE, 0, m);
        l1.d = arrayOfE;
      } 
    } else {
      d(paramInt, this.z - 1);
    } 
    this.z = paramInt;
  }
  
  private void d(int paramInt1, int paramInt2) {
    while (paramInt1 <= paramInt2) {
      boolean bool;
      if ((bool = this.d[paramInt1]) != null)
        (this.d[paramInt1]).d = null; 
      paramInt1++;
    } 
  }
  
  private final void a(int paramInt) {
    if (paramInt > 1000)
      throw new RuntimeException("Stack overflow"); 
    int k;
    int m;
    for (m = k = this.d.length; m <= paramInt; m <<= 1);
    if (m > k) {
      Object[] arrayOfObject = new Object[m];
      System.arraycopy(this.d, 0, arrayOfObject, 0, k);
      this.d = arrayOfObject;
    } 
  }
  
  public final void d(int paramInt) {
    if (this.d < paramInt) {
      int k = paramInt;
      l l1 = this;
      if (k > 1000)
        throw new RuntimeException("Stack overflow"); 
      int m;
      int n;
      for (n = m = l1.d.length; n <= k; n <<= 1);
      if (n > m) {
        Object[] arrayOfObject = new Object[n];
        System.arraycopy(l1.d, 0, arrayOfObject, 0, m);
        l1.d = arrayOfObject;
      } 
    } else {
      e(paramInt, this.d - 1);
    } 
    this.d = paramInt;
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 > 0 && paramInt1 != paramInt2)
      System.arraycopy(this.d, paramInt1, this.d, paramInt2, paramInt3); 
  }
  
  private void e(int paramInt1, int paramInt2) {
    while (paramInt1 <= paramInt2) {
      this.d[paramInt1] = null;
      paramInt1++;
    } 
  }
  
  public final void e(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/util/Vector;
    //   4: invokevirtual size : ()I
    //   7: istore_2
    //   8: goto -> 58
    //   11: aload_0
    //   12: getfield d : Ljava/util/Vector;
    //   15: iload_2
    //   16: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   19: checkcast s
    //   22: dup
    //   23: astore_3
    //   24: getfield d : I
    //   27: iload_1
    //   28: if_icmpge -> 32
    //   31: return
    //   32: aload_3
    //   33: aload_0
    //   34: getfield d : [Ljava/lang/Object;
    //   37: aload_3
    //   38: getfield d : I
    //   41: aaload
    //   42: putfield d : Ljava/lang/Object;
    //   45: aload_3
    //   46: aconst_null
    //   47: putfield d : Ll;
    //   50: aload_0
    //   51: getfield d : Ljava/util/Vector;
    //   54: iload_2
    //   55: invokevirtual removeElementAt : (I)V
    //   58: iinc #2, -1
    //   61: iload_2
    //   62: ifge -> 11
    //   65: return
  }
  
  public final s d(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/util/Vector;
    //   4: invokevirtual size : ()I
    //   7: istore_2
    //   8: goto -> 41
    //   11: aload_0
    //   12: getfield d : Ljava/util/Vector;
    //   15: iload_2
    //   16: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   19: checkcast s
    //   22: dup
    //   23: astore_3
    //   24: getfield d : I
    //   27: iload_1
    //   28: if_icmpne -> 33
    //   31: aload_3
    //   32: areturn
    //   33: aload_3
    //   34: getfield d : I
    //   37: iload_1
    //   38: if_icmplt -> 48
    //   41: iinc #2, -1
    //   44: iload_2
    //   45: ifge -> 11
    //   48: new s
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: dup
    //   56: astore_3
    //   57: aload_0
    //   58: putfield d : Ll;
    //   61: aload_3
    //   62: iload_1
    //   63: putfield d : I
    //   66: aload_0
    //   67: getfield d : Ljava/util/Vector;
    //   70: aload_3
    //   71: iload_2
    //   72: iconst_1
    //   73: iadd
    //   74: invokevirtual insertElementAt : (Ljava/lang/Object;I)V
    //   77: aload_3
    //   78: areturn
  }
  
  public final e d() {
    e e1;
    if (d())
      return null; 
    boolean bool;
    if ((bool = this.d[this.z - 1]) == null) {
      e1 = new e(this);
      this.d[this.z - 1] = e1;
    } 
    return e1;
  }
  
  public final int d() {
    return this.d;
  }
  
  public final e d(int paramInt) {
    a.d((paramInt >= 0), "Level must be non-negative");
    a.d(((paramInt = this.z - paramInt - 1) >= 0), "Level too high");
    return this.d[paramInt];
  }
  
  public final void d(e parame) {
    e e1;
    while ((e1 = d()) != null && e1 != parame)
      d(); 
  }
  
  public final boolean d() {
    return (this.z == 0);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */