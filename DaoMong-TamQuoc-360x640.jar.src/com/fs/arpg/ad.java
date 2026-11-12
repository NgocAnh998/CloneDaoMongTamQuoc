package com.fs.arpg;

import b;
import e;

public final class ad implements b, Runnable {
  private int d;
  
  private Object d;
  
  private Object e;
  
  private ac d;
  
  public ad(ac paramac, int paramInt) {
    this.d = paramac;
    this.d = paramInt;
  }
  
  public ad(ac paramac, Object paramObject1, Object paramObject2) {
    this.d = paramac;
    this.d = (ac)paramObject1;
    this.e = paramObject2;
  }
  
  public final void run() {
    try {
      if (ac.d != null && this.d != null) {
        ac.d.d(this.d, null);
        return;
      } 
    } catch (Exception exception) {
      if (ac.d != null && this.e != null)
        ac.d.d(this.e, null); 
    } 
  }
  
  public final int d(e parame, int paramInt) {
    return this.d.d(this.d, parame, paramInt);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */