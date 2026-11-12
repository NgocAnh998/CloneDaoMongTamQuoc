package com.fs.arpg;

import java.io.DataInputStream;

public final class w extends al {
  private String d;
  
  public final void d(DataInputStream paramDataInputStream) {
    super.d(paramDataInputStream);
    this.d = paramDataInputStream.readUTF();
  }
  
  public final void d() {
    super.d();
    ba.d(this.d, 0);
  }
  
  public final void e() {
    if (e())
      return; 
    if (ba.d(this.d) > 0) {
      this.d = '\001';
      e();
      return;
    } 
    x x;
    if ((x = l.d().d(this.d)) != null)
      x.a(true); 
    this.d = Character.MIN_VALUE;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\w.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */