package com.fs.arpg;

import javax.microedition.lcdui.Graphics;

public final class s extends e {
  au d;
  
  private int j;
  
  private int k;
  
  private boolean l;
  
  long e;
  
  boolean j = true;
  
  boolean k;
  
  private int l = 1;
  
  private int m;
  
  public final void d(au paramau) {
    this.d = paramau;
    this.j = paramau.d.d(0);
    this.k = paramau.d.d(2);
    this.d = (au)paramau.d;
    if (paramau.d == 92) {
      s s1;
      (s1 = this).l = 40;
      s1.m = 80;
    } 
  }
  
  public final void d(be parambe) {
    int i;
    if (this.d.a) {
      i = 160 + ((ai)ba.d).d;
      int j = 180 + ((ai)ba.d).e;
      ba.c.d(this, i, j);
      return;
    } 
    if (this.d.b != 0) {
      i = ((p)ba.d).ab;
      int j = ((p)ba.d).ac + 2;
      ba.c.d(this, i, j);
      return;
    } 
    ba.c.d(this, i.ab, i.ac);
    if (!this.d.c && this.d.d != null)
      this.b = true; 
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    h h = null;
    if (((this.d.b & 0x1) == 1)) {
      h = (l.d()).d;
      paramGraphics.setColor(16711680);
      paramGraphics.drawLine(this.ab - paramInt1, this.ac - paramInt2, ((e)h).ab - paramInt1, ((e)h).ac - paramInt2);
    } 
    e(paramGraphics, paramInt1, paramInt2);
  }
  
  public final void d() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield d : B
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield e : B
    //   10: aload_0
    //   11: aload_0
    //   12: getfield e : Lcom/fs/arpg/bc;
    //   15: aload_0
    //   16: getfield c : S
    //   19: invokevirtual d : (I)I
    //   22: iconst_1
    //   23: isub
    //   24: putfield aa : I
    //   27: aload_0
    //   28: invokevirtual w : ()V
    //   31: return
  }
  
  final void p() {
    if (this.d == this.d.e) {
      this.j = false;
      return;
    } 
    if (this.e < ((aa)this.d).d - 1) {
      this.e++;
      this.c = this.d.d(this.b, this.e);
      d();
      this.d.d(this);
      return;
    } 
    this.d.d(this);
    d();
    super.p();
  }
  
  public final void n() {
    au au1 = this.d;
    x();
    int i;
    if (this.d != au1 && (i = this.d.d(this.e, this.d)) >= 0)
      ba.d.b(i); 
  }
  
  public final void c() {
    ba.c.d(this, this.ab, this.ac);
  }
  
  public final void e() {
    if (!this.j)
      return; 
    if (this.k && this.d != 7 && this.d.e != null && !this.d.e.d()) {
      this.d = 7;
      this.d = (au)this.d.e;
      z();
      return;
    } 
    int i = this.ab - ((ai)ba.d).d;
    int j = this.ac - ((ai)ba.d).e;
    if (this.d.d != null && !this.d.a && this.l == 0 && this.m == 0) {
      if (i < 0 || i > 320 || j < 0 || j > 360) {
        this.j = false;
        if (this.d != null) {
          this.d.d(j, this.d);
          this.d = null;
        } 
        return;
      } 
    } else if ((this.l != 0 || this.m != 0) && ((!this.b && j < this.m) || (this.b == true && j > ((ai)ba.d).o - this.m) || (this.b == 2 && i < this.l) || (this.b == 3 && i > ((ai)ba.d).p - this.l))) {
      if (this.d.d == 92 && ((p)ba.d).m)
        ((p)ba.d).m = false; 
      this.j = false;
      this.k = false;
    } 
    s s1;
    (s1 = this).g();
    j = 0;
    int k = 0;
    if (s1.d.e != null) {
      int m = ((p)ba.d).ab;
      int n = ((p)ba.d).ac;
      boolean bool1 = s1.j;
      boolean bool2 = s1.k;
      j = Math.abs(m - s1.ab);
      int i1 = Math.abs(n - s1.ac);
      if (aq.d - s1.e < 1000L) {
        if (j < i1)
          s1.j = Math.abs(m - s1.ab) * s1.j / Math.abs(n - s1.ac); 
        if (i1 < j)
          s1.k = Math.abs(n - s1.ac) * s1.k / Math.abs(m - s1.ab); 
      } 
      if (j > s1.j) {
        j = s1.ab + ((m > s1.ab) ? s1.j : -s1.j);
      } else {
        j = m;
      } 
      if (i1 > s1.k) {
        k = s1.ac + ((n > s1.ac) ? s1.k : -s1.k);
      } else {
        k = n;
      } 
      if (j == m && k == n) {
        if (ba.d == null) {
          ba.d.d(s1);
        } else if (s1.d != null) {
          s1.d.d(i1, s1.d);
          s1.d = null;
        } 
        s1.j = false;
      } else {
        s1.j = bool1;
        s1.k = bool2;
        ba.c.d(s1, j, k);
      } 
    } else {
      if (s1.l != 0) {
        switch (s1.b) {
          case false:
            k = 0 - s1.k;
            j = 0 + s1.j;
            break;
          case true:
            k = 0 + s1.k;
            j = 0 + s1.j;
            break;
          case true:
            j = 0 - s1.j;
            k = 0 + s1.k;
            break;
          case true:
            j = 0 + s1.j;
            k = 0 + s1.k;
            break;
        } 
      } else {
        switch (s1.b) {
          case false:
            j = 0 - s1.j;
            k = 0 - s1.k;
            break;
          case true:
            j = 0 + s1.j;
            k = 0 + s1.k;
            break;
          case true:
            j = 0 - s1.j;
            k = 0 + s1.k;
            break;
          case true:
            j = 0 + s1.j;
            k = 0 - s1.k;
            break;
        } 
      } 
      s1.f = s1.ab + j;
      s1.i = s1.ac + k;
      ba.c.d(s1, s1.f, s1.i);
    } 
    if (aq.b - this.e >= this.d.e && this.j) {
      if (this.d.d == null && this.d.d == 92)
        ba.d.b(0); 
      this.j = false;
      if (this.d != null) {
        this.d.d(0, null);
        this.d = null;
      } 
    } 
  }
  
  public final void g() {
    boolean bool1 = this.j;
    boolean bool2 = this.k;
    if (this.l != 0)
      switch (this.b) {
        case false:
        case true:
          this.j = (bool1 > bool2) ? bool2 : bool1;
          this.k = (bool1 < bool2) ? bool2 : bool1;
          break;
        case true:
        case true:
          this.j = (bool1 < bool2) ? bool2 : bool1;
          this.k = (bool1 > bool2) ? bool2 : bool1;
          break;
      }  
    if (this.d.e != null) {
      this.j = !this.j ? this.k : this.j;
      this.k = !this.k ? this.j : this.k;
      return;
    } 
  }
  
  public final void f() {
    if (this.d.d == null || this.d.e != null || !this.d.c)
      return; 
    int i = ((p)ba.d).ab - this.ab;
    int j = ((p)ba.d).ac - this.ac;
    int k = Math.abs(i);
    int m = Math.abs(j);
    if (k == 0)
      k++; 
    if (m == 0)
      m++; 
    this.l = 1;
    if (this.j == this.k) {
      if (!this.j)
        return; 
      this.l = 0;
    } 
    if (this.l != 0) {
      g();
      return;
    } 
    if (i < 0 && j < 0) {
      d(0);
    } else if (i < 0 && j > 0) {
      d(2);
    } else if (i > 0 && j < 0) {
      d(3);
    } else {
      d(1);
    } 
    if (k > m) {
      this.j = k * this.k / m;
      return;
    } 
    this.k = m * this.j / k;
  }
  
  public final void d(int paramInt) {
    this.b = paramInt;
    s s1 = this;
    v.d().d(((aa)s1.d).d, s1);
    s1.c = s1.d.d(s1.b, 0);
    s1.d();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\s.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */