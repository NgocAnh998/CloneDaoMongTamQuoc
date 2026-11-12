package com.fs.arpg;

public final class ak implements bl {
  private int d;
  
  private String d;
  
  private short d;
  
  private int e;
  
  private short e = 0;
  
  private int c;
  
  private int b;
  
  ak(int paramInt) {
    this.b = paramInt;
  }
  
  public final void d(bj parambj) {
    switch (this.b) {
      case 9:
        return;
      case 8:
        this.e = parambj.d();
        return;
      case 1:
        this.d = parambj.d();
        return;
      case 6:
        this.d = parambj.d();
        this.e = parambj.d();
        return;
      case 3:
        this.e = parambj.d();
        return;
      case 7:
        this.c = parambj.d();
        return;
      case 4:
        this.e = parambj.d();
        return;
      case 5:
        this.e = parambj.d();
        return;
      case 0:
        this.d = parambj.d();
        break;
    } 
  }
  
  public final int d() {
    al al;
    switch (this.b) {
      case 9:
        return ba.d.e();
      case 1:
        return ba.d(this.d);
      case 6:
        return (ba.d.d(this.d) >= this.e) ? 1 : 0;
      case 8:
        return (d.d().d(this.e)).b ? 1 : 0;
      case 3:
        return (d.d().d(this.e)).c ? 1 : 0;
      case 7:
        return (((p)ba.d).W >= this.c) ? 1 : 0;
      case 4:
        return ((al = d.d().d(this.e)).c && al.d != null) ? 1 : 0;
      case 5:
        return (!(al = d.d().d(this.e)).c && (al.d != null || al.b)) ? 1 : 0;
      case 0:
        return this.d;
    } 
    return 0;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ak.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */