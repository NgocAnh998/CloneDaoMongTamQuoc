package com.fs.arpg;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class av extends al {
  private int e;
  
  private int c;
  
  private int b;
  
  private int a;
  
  public final void d(DataInputStream paramDataInputStream) {
    super.d(paramDataInputStream);
    this.e = paramDataInputStream.readInt();
    this.b = paramDataInputStream.readInt();
    this.c = paramDataInputStream.readByte();
  }
  
  public final String[] d() {
    String[] arrayOfString = new String[1];
    g g = ba.d((short)this.e);
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer()).append("Mất đi");
    stringBuffer.append(g.e);
    stringBuffer.append(this.b);
    stringBuffer.append('个');
    arrayOfString[0] = stringBuffer.toString();
    return arrayOfString;
  }
  
  public final void b() {
    ba.d.e((short)this.e, this.b);
    ba.d.r();
  }
  
  public final int d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if (this.d != null && this.d != null)
      return this.d.d(paramGraphics, paramInt1, paramInt2, paramInt3); 
    paramInt2 += 3;
    StringBuffer stringBuffer = new StringBuffer();
    g g = ba.d((short)this.e);
    int i = ba.d.d((short)this.e);
    String[] arrayOfString = ((ai)ba.d).e;
    paramGraphics.drawImage((Image)arrayOfString, paramInt1, paramInt2, 0);
    g.d(paramGraphics, paramInt1 + 2, paramInt2 + 2);
    if (i >= this.b) {
      stringBuffer.append(g.e).append(" (").append(this.b).append('/').append(this.b).append(')');
    } else {
      stringBuffer.append(g.e).append(" (").append(i).append('/').append(this.b).append(')');
    } 
    ah.d().d(paramGraphics, stringBuffer.toString().toCharArray(), paramInt1 + arrayOfString.getWidth() + 3, paramInt2 + 3);
    ah.d();
    return 21;
  }
  
  public final void e() {
    g g = ba.d((short)this.e);
    int i = ba.d.d((short)this.e);
    if (ba.d.d(g, this.c))
      i++; 
    if (i == this.a) {
      if (this.a >= this.b) {
        this.d = true;
        if (this.d == null) {
          a();
          return;
        } 
        if (e())
          return; 
        return;
      } 
      this.d = false;
    } else {
      if (this.a >= this.b && i >= this.b) {
        this.d = true;
        e();
        return;
      } 
      this.a = (byte)i;
      ba.d.d(((ba.d((short)this.e)).e + i + "/" + this.b).toCharArray());
      if (this.a >= this.b && ((ai)ba.d).c == 2) {
        StringBuffer stringBuffer;
        (stringBuffer = new StringBuffer()).append("Vật phẩm: ").append(g.e).append("Thu thập đủ!");
        ((ai)ba.d).d.d(stringBuffer.toString());
        this.d = true;
        e();
        return;
      } 
      this.d = false;
    } 
    if (e())
      return; 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\av.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */