package com.fs.arpg;

public final class t {
  int d;
  
  private long e;
  
  long d;
  
  public static int d(int paramInt) {
    switch (paramInt) {
      case 48:
        return 0;
      case 49:
        return 1;
      case 50:
        return 2;
      case 51:
        return 3;
      case 52:
        return 4;
      case 53:
        return 5;
      case 54:
        return 6;
      case 55:
        return 7;
      case 56:
        return 8;
      case 57:
        return 9;
      case 42:
        return 15;
      case 35:
        return 16;
      case -1:
        return 11;
      case -2:
        return 13;
      case -3:
        return 10;
      case -4:
        return 12;
      case -5:
        return 14;
      case -6:
        return 17;
      case -7:
        return 18;
    } 
    return -1;
  }
  
  public final void d(int paramInt) {
    if ((paramInt = d(paramInt)) < 0)
      return; 
    this.d = 0L;
    if ((this.d & 1 << paramInt) != 0)
      return; 
    this.d |= 1 << paramInt;
    System.currentTimeMillis();
  }
  
  public final boolean d(int paramInt) {
    return ((this.d & 1 << paramInt) != 0);
  }
  
  public final void d() {
    this.d = 0L;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\t.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */