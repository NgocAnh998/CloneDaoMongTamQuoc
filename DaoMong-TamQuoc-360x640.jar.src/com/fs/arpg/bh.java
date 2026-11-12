package com.fs.arpg;

public final class bh {
  private short[] d;
  
  private Object[] d;
  
  private int d;
  
  public bh(int paramInt) {
    if (paramInt <= 0)
      paramInt = 10; 
    d(paramInt);
  }
  
  public bh() {
    d(10);
  }
  
  private void d(int paramInt) {
    this.d = new short[paramInt];
    this.d = new Object[paramInt];
    this.d = 0;
  }
  
  public static int d(short[] paramArrayOfshort, int paramInt, short paramShort) {
    int i = 0;
    while (i <= --paramInt) {
      if (paramArrayOfshort[i] == paramShort)
        return i; 
      if (paramArrayOfshort[paramInt] == paramShort)
        return paramInt; 
      int j = i + paramInt >> 1;
      if (paramArrayOfshort[j] == paramShort)
        return j; 
      if (paramArrayOfshort[j] > paramShort) {
        i++;
        paramInt = j - 1;
        continue;
      } 
      i = j + 1;
      paramInt--;
    } 
    return -1;
  }
  
  public final void d(short paramShort, Object paramObject) {
    if (this.d >= this.d.length) {
      int k;
      int m;
      short[] arrayOfShort = new short[m = (k = this.d.length) << 1];
      System.arraycopy(this.d, 0, arrayOfShort, 0, k);
      Object[] arrayOfObject = new Object[m];
      System.arraycopy(this.d, 0, arrayOfObject, 0, k);
      this.d = null;
      this.d = arrayOfShort;
      this.d = null;
      this.d = arrayOfObject;
    } 
    if (this.d == 0) {
      this.d[0] = paramShort;
      this.d[0] = paramObject;
      this.d++;
      return;
    } 
    int i;
    if ((i = d(this.d, this.d, paramShort)) >= 0) {
      this.d[i] = paramObject;
      return;
    } 
    int j;
    for (j = 0; j < this.d; j++) {
      if (this.d[j] > paramShort) {
        i = j;
        break;
      } 
    } 
    if (i >= 0) {
      for (j = this.d - 1; j >= i; j--) {
        this.d[j + 1] = this.d[j];
        this.d[j + 1] = this.d[j];
      } 
      this.d[i] = paramShort;
      this.d[i] = paramObject;
      this.d++;
      return;
    } 
    this.d[this.d] = paramShort;
    this.d[this.d] = paramObject;
    this.d++;
  }
  
  public final Object d(short paramShort) {
    int i;
    return ((i = d(this.d, this.d, paramShort)) < 0) ? null : this.d[i];
  }
  
  public final void d(short paramShort) {
    int i;
    if ((i = d(this.d, this.d, paramShort)) < 0)
      return; 
    while (i < this.d - 1) {
      this.d[i] = this.d[i + 1];
      this.d[i] = this.d[i + 1];
      i++;
    } 
    this.d[this.d - 1] = null;
    this.d--;
  }
  
  public final int d() {
    return this.d;
  }
  
  public final short d(int paramInt) {
    return this.d[paramInt];
  }
  
  public final Object d(int paramInt) {
    return this.d[paramInt];
  }
  
  public final void d() {
    for (byte b = 0; b < this.d; b++) {
      this.d[b] = null;
      this.d[b] = 0;
    } 
    this.d = 0;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bh.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */