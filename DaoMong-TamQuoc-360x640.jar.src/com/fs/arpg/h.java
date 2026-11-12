package com.fs.arpg;

public final class h {
  public int d;
  
  public int e;
  
  public int c;
  
  public int b;
  
  public h() {
    d();
  }
  
  public h(int paramInt) {
    d(0, 0, 320, paramInt);
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 < paramInt3) {
      this.d = paramInt1;
      this.c = paramInt3;
    } else {
      this.d = paramInt3;
      this.c = paramInt1;
    } 
    if (paramInt2 < paramInt4) {
      this.e = paramInt2;
      this.b = paramInt4;
      return;
    } 
    this.e = paramInt4;
    this.b = paramInt2;
  }
  
  public final void d() {
    this.d = Integer.MIN_VALUE;
    this.c = Integer.MIN_VALUE;
    this.e = Integer.MIN_VALUE;
    this.b = Integer.MIN_VALUE;
  }
  
  public final boolean d() {
    return (this.d == Integer.MIN_VALUE);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (this.d != Integer.MIN_VALUE) {
      this.d += paramInt1;
      this.c += paramInt1;
      this.e += paramInt2;
      this.b += paramInt2;
    } 
  }
  
  public final boolean d(h paramh) {
    return (d() || paramh.d()) ? false : ((this.d <= paramh.c && paramh.d <= this.c && this.e <= paramh.b && paramh.e <= this.b));
  }
  
  public final boolean d(int paramInt1, int paramInt2) {
    return (this.d <= paramInt1 && paramInt1 <= this.c && this.e <= paramInt2 && paramInt2 <= this.b);
  }
  
  public final int d() {
    return this.b - this.e;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\h.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */