package com.fs.arpg;

import javax.microedition.lcdui.Graphics;

public final class an extends r implements Runnable {
  private char[] d;
  
  private int d;
  
  private int e;
  
  private int c;
  
  private static int b = true;
  
  private ah d;
  
  private short[] d;
  
  private char[][] d = null;
  
  private int a;
  
  private int z;
  
  static boolean c;
  
  static boolean b;
  
  public an() {
    this.d = (char[][])new short[] { 
        6, 8, 9, 10, 11, 12, 13, 14, 16, 17, 
        18, 19, 20 };
    bg bg = bg.d();
    this.d = (char[][])bg.d((short)4);
    this.d = this.d.length;
    this.d = (char[][])ah.d();
    this.e = 328;
    this.d = true;
    this.z = this.d.length;
    this.d = new char[this.z][];
    for (byte b = 0; b < this.z; b++)
      this.d[b] = bg.d(this.d[b]); 
    an an1;
    (an1 = this).a = ba.d(0, an1.z - 1);
  }
  
  public final void e() {
    if (c)
      return; 
    c = true;
    (new Thread(this)).start();
  }
  
  public final synchronized void run() {
    while (c) {
      if (b && ((aq)ba.d).d == 0L)
        ba.d.repaint(); 
      try {
        Thread.sleep(500L);
      } catch (Exception exception) {}
    } 
  }
  
  public final void d(Graphics paramGraphics) {
    bi.d(paramGraphics, 0);
    paramGraphics.setColor(16777215);
    bi.d(paramGraphics, this.d[this.a], 220);
    ah.d(paramGraphics, (char[])this.d, 0, this.d - b + this.c, 10, this.e);
    this.c++;
    if (this.c > b)
      this.c = false; 
    if (ba.d == null)
      return; 
    if (((p)ba.d).r == 0)
      return; 
    int i = this.e - 20;
    ((p)ba.d).e.d(paramGraphics, 7, this.c, 30, i, (be)ba.d);
  }
  
  public final void d() {}
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\an.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */