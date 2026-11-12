package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class az extends al {
  private al[] d;
  
  public final void d(DataInputStream paramDataInputStream) {
    super.d(paramDataInputStream);
    short s = paramDataInputStream.readShort();
    this.d = new al[s];
    for (byte b = 0; b < s; b++) {
      al al1;
      (al1 = d.d(paramDataInputStream.readShort())).d(paramDataInputStream);
      this.d[b] = al1;
    } 
  }
  
  public final int d() {
    if (this.d == null || ((al)this.d).d == null)
      return this.d; 
    if (this.d == null) {
      byte b = 0;
      int i = this.d.length;
      while (b < i) {
        if ((this.d[b]).d == null)
          return this.d[b].d(); 
        b++;
      } 
      return this.d;
    } 
    return ((al)this.d).d;
  }
  
  public final void b() {
    byte b = 0;
    int i = this.d.length;
    while (b < i) {
      this.d[b].b();
      b++;
    } 
  }
  
  public final String[] d() {
    String[] arrayOfString1 = new String[20];
    int i = 0;
    byte b = 0;
    int j = this.d.length;
    while (b < j) {
      String[] arrayOfString;
      if ((arrayOfString = this.d[b].d()) != null) {
        System.arraycopy(arrayOfString, 0, arrayOfString1, i, arrayOfString.length);
        i += arrayOfString.length;
      } 
      b++;
    } 
    String[] arrayOfString2 = new String[i];
    System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, i);
    return arrayOfString2;
  }
  
  public final void d() {
    super.d();
    byte b = 0;
    int i = this.d.length;
    while (b < i) {
      this.d[b].d();
      b++;
    } 
  }
  
  public final int d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if (this.d != null && this.d != null)
      return this.d.d(paramGraphics, paramInt1, paramInt2, paramInt3); 
    int i = paramInt2;
    byte b = 0;
    int j = this.d.length;
    while (b < j) {
      int k = this.d[b].d(paramGraphics, paramInt1, i, paramInt3);
      i += k;
      b++;
    } 
    return i - paramInt2;
  }
  
  public final void e() {
    if (e())
      return; 
    this.d = true;
    byte b = 0;
    int i = this.d.length;
    while (b < i) {
      this.d[b].e();
      if ((this.d[b]).d == null)
        this.d = false; 
      b++;
    } 
    e();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\az.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */