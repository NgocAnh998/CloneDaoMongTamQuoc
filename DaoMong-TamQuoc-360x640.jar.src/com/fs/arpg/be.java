package com.fs.arpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class be {
  protected h d;
  
  bc e;
  
  public short c;
  
  public byte d;
  
  public byte e;
  
  int aa;
  
  private int d;
  
  int ab;
  
  int ac;
  
  be e;
  
  static h e = new h();
  
  private int e;
  
  private int c;
  
  public boolean s = true;
  
  public Image d;
  
  public Image[] d = aq.e;
  
  public int[] a;
  
  boolean r;
  
  public void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    e(paramGraphics, paramInt1, paramInt2);
  }
  
  public void n() {
    x();
  }
  
  public final void g(int paramInt) {
    if (this.d == null)
      return; 
    int i = this.d.getWidth();
    int j = this.d.getHeight();
    int[] arrayOfInt = new int[i * j];
    this.d.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
    byte b = 0;
    int k = arrayOfInt.length;
    while (b < k) {
      if ((arrayOfInt[b] & 0xFFFFFF) == 0 || (arrayOfInt[b] & 0xFFFFFF) == 16777215) {
        arrayOfInt[b] = 0;
      } else {
        arrayOfInt[b] = arrayOfInt[b] & 0xFFFFFF;
        arrayOfInt[b] = arrayOfInt[b] | paramInt << 24;
      } 
      b++;
    } 
    this.d = (Image[])Image.createRGBImage(arrayOfInt, i, j, true);
  }
  
  public final void e(Graphics paramGraphics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lcom/fs/arpg/bc;
    //   4: aload_0
    //   5: getfield c : S
    //   8: aload_0
    //   9: getfield d : B
    //   12: getstatic com/fs/arpg/be.e : Lcom/fs/arpg/h;
    //   15: invokevirtual d : (IILcom/fs/arpg/h;)Lcom/fs/arpg/h;
    //   18: pop
    //   19: aload_0
    //   20: aload_0
    //   21: getfield ab : I
    //   24: iload_2
    //   25: isub
    //   26: putfield e : I
    //   29: aload_0
    //   30: aload_0
    //   31: getfield ac : I
    //   34: iload_3
    //   35: isub
    //   36: putfield c : I
    //   39: getstatic com/fs/arpg/be.e : Lcom/fs/arpg/h;
    //   42: aload_0
    //   43: getfield e : I
    //   46: aload_0
    //   47: getfield c : I
    //   50: invokevirtual d : (II)V
    //   53: aload_0
    //   54: getfield d : Lcom/fs/arpg/h;
    //   57: getstatic com/fs/arpg/be.e : Lcom/fs/arpg/h;
    //   60: invokevirtual d : (Lcom/fs/arpg/h;)Z
    //   63: ifne -> 67
    //   66: return
    //   67: aload_0
    //   68: getfield e : Lcom/fs/arpg/bc;
    //   71: aload_1
    //   72: aload_0
    //   73: getfield c : S
    //   76: aload_0
    //   77: getfield d : B
    //   80: aload_0
    //   81: getfield e : I
    //   84: aload_0
    //   85: getfield c : I
    //   88: aload_0
    //   89: invokevirtual d : (Ljavax/microedition/lcdui/Graphics;IIIILcom/fs/arpg/be;)V
    //   92: return
  }
  
  public final void e(h paramh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lcom/fs/arpg/bc;
    //   4: aload_0
    //   5: getfield c : S
    //   8: aload_0
    //   9: getfield d : B
    //   12: aload_1
    //   13: invokevirtual e : (IILcom/fs/arpg/h;)Lcom/fs/arpg/h;
    //   16: pop
    //   17: return
  }
  
  public void d(h paramh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lcom/fs/arpg/bc;
    //   4: aload_0
    //   5: getfield c : S
    //   8: aload_0
    //   9: getfield d : B
    //   12: aload_1
    //   13: invokevirtual c : (IILcom/fs/arpg/h;)Lcom/fs/arpg/h;
    //   16: pop
    //   17: return
  }
  
  public final void c(h paramh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lcom/fs/arpg/bc;
    //   4: aload_0
    //   5: getfield c : S
    //   8: aload_0
    //   9: getfield d : B
    //   12: aload_1
    //   13: invokevirtual d : (IILcom/fs/arpg/h;)Lcom/fs/arpg/h;
    //   16: pop
    //   17: return
  }
  
  public final void u() {
    this.e = (byte)(this.e + 1);
    if (this.e < this.d)
      return; 
    this.e = 0;
    if (this.d < this.aa) {
      this.d = (byte)(this.d + 1);
      w();
      return;
    } 
  }
  
  public final boolean a() {
    return (this.d == this.aa && this.e == this.d - 1);
  }
  
  public void d() {
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
  
  public final void v() {
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
  
  public final void w() {
    Image[] arrayOfImage = this.d;
    int j = this.c;
    int i;
    j = (i = this.e).d[j];
    this.d = i.d[j + arrayOfImage];
    if (this.d == null)
      this.d = true; 
  }
  
  public final void x() {
    if (a()) {
      p();
      return;
    } 
    u();
  }
  
  void p() {
    d();
  }
  
  public void l() {
    v.d().d(this.e);
    if (this.s) {
      n.d().d((Image)this.d);
      return;
    } 
    Image[] arrayOfImage = this.d;
    n n = n.d();
    for (byte b = 0; b > arrayOfImage.length; b++)
      n.d(arrayOfImage[b]); 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\be.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */