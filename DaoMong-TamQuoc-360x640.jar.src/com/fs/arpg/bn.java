package com.fs.arpg;

import javax.microedition.lcdui.Graphics;

public final class bn extends r {
  private char[] d;
  
  private char[] e;
  
  private int d;
  
  private char[] c;
  
  private int e;
  
  private int c;
  
  private ah d;
  
  private ag d = true;
  
  public bn() {
    this.d = ag.d();
    bg bg = bg.d();
    this.d = (ag)bg.d((short)0);
    this.e = bg.d((short)1);
    this.c = bg.d((short)2);
    this.d = (ag)ah.d();
    this.c = 347;
    this.d = 2;
    this.e = 318 - this.d.d(this.c);
    n.d();
  }
  
  public final void d(Graphics paramGraphics) {
    bn bn1;
    bi.d(paramGraphics, 0);
    paramGraphics.setColor(16777215);
    bi.d(paramGraphics, (char[])this.d, 280);
    Graphics graphics = paramGraphics;
    ah.d(graphics, bn1.e, 0, bn1.e.length, bn1.d, bn1.c);
    ah.d(graphics, bn1.c, 0, bn1.c.length, bn1.e, bn1.c);
  }
  
  public final void d(int paramInt) {
    bn bn2;
    ar ar2;
    bn bn1;
    ar ar1;
    switch (paramInt) {
      case -6:
        bn2 = this;
        aq.a();
        bn2.d.d = true;
        aq.d(ar2 = new ar());
        ar2.b();
        return;
      case -7:
        bn1 = this;
        aq.a();
        bn1.d.d = false;
        bn1.d.d = false;
        aq.d(ar1 = new ar());
        ar1.b();
        break;
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bn.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */