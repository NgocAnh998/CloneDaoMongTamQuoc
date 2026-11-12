package com.fs.arpg;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class d {
  private static d d = null;
  
  private bh d;
  
  public static d d() {
    if (d == null)
      d = (bh)new d(); 
    return (d)d;
  }
  
  private d() {
    c();
  }
  
  public final void d(DataOutputStream paramDataOutputStream) {
    byte b = 0;
    int i = this.d.d();
    while (b < i) {
      al al = (al)this.d.d(b);
      paramDataOutputStream.writeBoolean(al.b);
      paramDataOutputStream.writeBoolean(al.c);
      paramDataOutputStream.writeBoolean(al.d);
      paramDataOutputStream.writeBoolean((al.d != null));
      if (al.d != null)
        paramDataOutputStream.writeBoolean(((al)al.d).d); 
      b++;
    } 
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    byte b = 0;
    int i = this.d.d();
    while (b < i) {
      al al;
      (al = (al)this.d.d(b)).b = paramDataInputStream.readBoolean();
      al.c = paramDataInputStream.readBoolean();
      al.d = paramDataInputStream.readBoolean();
      if (paramDataInputStream.readBoolean())
        ((al)al.d).d = paramDataInputStream.readBoolean(); 
      b++;
    } 
  }
  
  public final al d(short paramShort) {
    return (al)this.d.d(paramShort);
  }
  
  public final void d() {
    int i = this.d.d();
    for (byte b = 0; b < i; b++) {
      al al;
      if ((al = (al)this.d.d(b)).c)
        al.e(); 
    } 
  }
  
  public final void e() {
    int i = this.d.d();
    for (byte b = 0; b < i; b++) {
      al al;
      (al = (al)this.d.d(b)).d();
      al.c = false;
    } 
  }
  
  private void c() {
    try {
      DataInputStream dataInputStream;
      short s = (dataInputStream = bi.d("/m.mission")).readShort();
      this.d = new bh(s);
      for (byte b = 0; b < s; b++) {
        al al;
        (al = d(dataInputStream.readShort())).d(dataInputStream);
        this.d.d(al.d, al);
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static al d(int paramInt) {
    af af;
    w w;
    az az;
    av av;
    c c = null;
    switch (paramInt) {
      case 1:
        c = new c();
        break;
      case 2:
        af = new af();
        break;
      case 3:
        w = new w();
        break;
      case 4:
        az = new az();
        break;
      case 5:
        av = new av();
        break;
    } 
    return av;
  }
  
  public final int d() {
    byte b = 0;
    int i = this.d.d();
    while (b < i) {
      al al;
      if ((al = (al)this.d.d(b)).e != 0 && al.c)
        return al.d(); 
      b++;
    } 
    return -1;
  }
  
  public final al[] d() {
    byte b1 = 0;
    byte b2 = 0;
    int i = this.d.d();
    while (b2 < i) {
      if (((al)this.d.d(b2)).e != 0)
        b1++; 
      b2++;
    } 
    al[] arrayOfAl = new al[b1];
    b1 = 0;
    i = 0;
    int j = this.d.d();
    while (i < j) {
      al al;
      if ((al = (al)this.d.d(i)).e != 0) {
        arrayOfAl[b1] = al;
        b1++;
      } 
      i++;
    } 
    return arrayOfAl;
  }
  
  public final al[] e() {
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    byte b5 = 0;
    int i = this.d.d();
    while (b5 < i) {
      al al;
      if ((al = (al)this.d.d(b5)).e == 0) {
        b1++;
        if (!al.c && al.d != null)
          b2++; 
        if (al.c)
          b3++; 
        if (!al.c && al.d == null)
          b4++; 
      } 
      b5++;
    } 
    if (b1 == 0)
      return null; 
    al[] arrayOfAl1 = new al[b2];
    al[] arrayOfAl2 = new al[b3];
    al[] arrayOfAl3 = new al[b4];
    b1 = 0;
    b2 = 0;
    b3 = 0;
    b4 = 0;
    byte b6 = 0;
    int j = this.d.d();
    while (b6 < j) {
      al al;
      if ((al = (al)this.d.d(b6)).e == 0) {
        b1++;
        if (!al.c && al.d != null) {
          arrayOfAl1[b2] = al;
          b2++;
        } 
        if (al.c) {
          arrayOfAl2[b3] = al;
          b3++;
        } 
        if (!al.c && al.d == null) {
          arrayOfAl3[b4] = al;
          b4++;
        } 
      } 
      b6++;
    } 
    al[] arrayOfAl4 = new al[b1];
    System.arraycopy(arrayOfAl2, 0, arrayOfAl4, 0, arrayOfAl2.length);
    System.arraycopy(arrayOfAl1, 0, arrayOfAl4, arrayOfAl2.length, arrayOfAl1.length);
    System.arraycopy(arrayOfAl3, 0, arrayOfAl4, arrayOfAl2.length + arrayOfAl1.length, arrayOfAl3.length);
    return arrayOfAl4;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\d.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */