package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class af extends al {
  private String d;
  
  private String e;
  
  public final void d(DataInputStream paramDataInputStream) {
    super.d(paramDataInputStream);
    this.d = paramDataInputStream.readUTF();
    this.e = paramDataInputStream.readUTF();
  }
  
  public final void d() {
    ba.d(this.e, 0);
    super.d();
  }
  
  public final void c() {
    x x;
    if ((x = l.d().d(this.d)) != null)
      x.z(true); 
  }
  
  public final void e() {
    x x = l.d().d(this.d);
    if (e())
      return; 
    if (ba.d(this.e) > 0) {
      this.d = '\001';
      e();
      if (x != null) {
        x.a(false);
        x.z(false);
      } 
      return;
    } 
    if (x != null) {
      x.z(false);
      x.a(true);
    } 
    this.d = Character.MIN_VALUE;
  }
  
  public final int d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if (this.d != null && this.d != null)
      return this.d.d(paramGraphics, paramInt1, paramInt2, paramInt3); 
    StringBuffer stringBuffer = new StringBuffer();
    if (this.d != null && this.d.length() != 0) {
      stringBuffer.append("Và").append(this.d).append("Đối thoại");
    } else {
      stringBuffer.append("Và").append(this.e).append("Đối thoại");
    } 
    if (this.d != null) {
      stringBuffer.append("( hoàn thành )");
    } else {
      stringBuffer.append("( Chưa xong )");
    } 
    ah.d().d(paramGraphics, stringBuffer.toString().toCharArray(), paramInt1, paramInt2 + 3);
    return 16;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\af.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */