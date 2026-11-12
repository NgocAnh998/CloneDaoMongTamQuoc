package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class ao {
  public boolean d;
  
  private int z;
  
  public int d = 1;
  
  public int e;
  
  public int c;
  
  public int b;
  
  public int a;
  
  public final boolean d() {
    return !(this.c < ba.d(0, 100) && this.d != 5);
  }
  
  public final boolean d(x paramx) {
    return (((as)paramx.d).d == 0 && paramx.d == null) ? ((this.d == 3 && ((as)paramx.d).g == 1) ? false : (!(this.d == 2 && (paramx.d.d(3) == null || paramx.d.d(3).d())))) : false;
  }
  
  public final ao d() {
    if (!d())
      return null; 
    ao ao1;
    (ao1 = new ao()).d = this.d;
    ao1.e = this.e;
    ao1.c = this.c;
    ao1.b = this.b;
    ao1.z = aq.c;
    return ao1;
  }
  
  public final void d(e parame) {
    this.d = 0;
    if (parame.d == 3) {
      parame.d = 2;
      parame.z();
    } 
    parame.i = false;
    ((p)ba.d).m = false;
  }
  
  public final void d(Graphics paramGraphics, e parame) {
    if (this.d == 0)
      return; 
    if (this.d == 0)
      return; 
    bj bj = null;
    switch (this.d) {
      case 1:
        ((be)(bj = ((ai)ba.d).d[0])).ab = parame.ab;
        ((be)bj).ac = parame.ac;
        break;
      case 3:
        ((be)(bj = ((ai)ba.d).d[2])).ab = parame.ab;
        ((be)bj).ac = parame.ac;
        break;
    } 
    if (bj == null)
      return; 
    bj.d(paramGraphics, ((ai)ba.d).d, ((ai)ba.d).e);
  }
  
  public final void e(e parame) {
    ao ao1;
    e e1;
    int i;
    int j;
    if (this.d == 0)
      return; 
    if (this.e != 0 && aq.c - this.z >= this.e) {
      d(parame);
      this.d = 0;
      return;
    } 
    switch (this.d) {
      case 1:
        e1 = parame;
        ao1 = this;
        if ((aq.c - ao1.z & 0xF) == 0) {
          int k = ao1.b * ba.d.c() / 100;
          e1.z -= k;
          if (e1.z) {
            e1.d = 7;
            e1.z();
          } 
          ba.d.d(e1, k, false);
        } 
        return;
      case 2:
        if (((e)ao1).d != 3) {
          ((e)ao1).d = 3;
          ao1.z();
          return;
        } 
        break;
      case 3:
        ((e)ao1).i = true;
        return;
      case 4:
        ao1 = this;
        ba.d.b(((p)ba.d).z * ao1.b / 100);
        ((p)ba.d).p = true;
        ao1.d = 0;
        return;
      case 6:
        ao1 = this;
        i = ((p)ba.d).ab;
        j = ((p)ba.d).ac;
        switch (ao1.a) {
          case 0:
            j -= ao1.b;
            break;
          case 1:
            j += ao1.b;
            break;
          case 2:
            i -= ao1.b;
            break;
          case 3:
            i += ao1.b;
            break;
        } 
        ba.e.d((be)ba.d, i, j);
        break;
    } 
  }
  
  public final void d(bj parambj) {
    this.d = parambj.d();
    switch (this.d) {
      case 0:
        this.d = 0;
        return;
      case 1:
        this.b = parambj.d() & 0xFFFF;
        this.e = (parambj.d() & 0xFFFF) / 100;
        this.c = parambj.d();
        return;
      case 2:
        this.b = parambj.d();
        this.e = (parambj.d() & 0xFFFF) / 100;
        this.c = parambj.d();
        return;
      case 3:
        this.e = (parambj.d() & 0xFFFF) / 100;
        this.c = parambj.d();
        return;
      case 4:
        this.e = (parambj.d() & 0xFFFF) / 100;
        this.b = parambj.d();
        this.c = parambj.d();
        return;
      case 5:
        this.b = parambj.d();
        this.c = parambj.d();
        return;
      case 6:
        this.e = 3;
        this.b = parambj.d();
        this.a = parambj.d();
        this.c = parambj.d();
        break;
    } 
  }
  
  public static ao d(DataInputStream paramDataInputStream) {
    DataInputStream dataInputStream = paramDataInputStream;
    ao ao1;
    ao ao2;
    (ao1 = ao2 = new ao()).d = dataInputStream.readByte();
    switch (ao1.d) {
      case 0:
        ao1.d = 0;
        break;
      case 1:
        ao1.b = dataInputStream.readShort() & 0xFFFF;
        ao1.e = (dataInputStream.readShort() & 0xFFFF) / 100;
        ao1.c = dataInputStream.readByte();
        break;
      case 2:
        ao1.b = dataInputStream.readShort();
        ao1.e = (dataInputStream.readShort() & 0xFFFF) / 100;
        ao1.c = dataInputStream.readByte();
        break;
      case 3:
        ao1.e = (dataInputStream.readShort() & 0xFFFF) / 100;
        ao1.c = dataInputStream.readByte();
        break;
      case 4:
        ao1.e = dataInputStream.readShort() & 0xFFFF;
        ao1.b = dataInputStream.readShort();
        ao1.c = dataInputStream.readByte();
        ao1.e = Integer.MAX_VALUE;
        break;
      case 5:
        ao1.b = dataInputStream.readByte();
        ao1.c = dataInputStream.readByte();
        break;
      case 6:
        ao1.e = 3;
        ao1.b = dataInputStream.readShort();
        ao1.a = dataInputStream.readShort();
        ao1.c = dataInputStream.readByte();
        break;
    } 
    return ao2;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ao.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */