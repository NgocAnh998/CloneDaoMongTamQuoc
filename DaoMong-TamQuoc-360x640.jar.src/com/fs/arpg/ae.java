package com.fs.arpg;

import javax.microedition.lcdui.Graphics;

public final class ae extends e {
  public o d;
  
  m e;
  
  m c;
  
  public ae(String paramString, int paramInt1, int paramInt2) {
    this.d = (o)paramString;
    this.ab = paramInt1;
    this.ac = paramInt2;
  }
  
  final void e(boolean paramBoolean) {
    if (paramBoolean)
      v.d().d(this.d.d, this); 
    this.c = this.d.d(this.b);
    this.e = false;
    d();
  }
  
  final void z() {
    a();
    e(true);
    v();
  }
  
  final void h() {
    e(false);
  }
  
  public final m d() {
    return (this.d == 2) ? this.e : this.c;
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    e(paramGraphics, paramInt1, paramInt2);
  }
  
  public final void a() {
    if (this.d == 2) {
      this.c = this.d.d(this.b);
    } else {
      this.c = this.d.e;
    } 
    d();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ae.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */