package com.fs.arpg;

import javax.microedition.lcdui.Graphics;

public final class am {
  private q d = null;
  
  private static q[] d = new q[200];
  
  public static void d() {
    for (byte b = 0; b < 'È'; b++) {
      (d[b]).d = -1000;
      (d[b]).d = null;
      (d[b]).d = null;
    } 
  }
  
  private static q d() {
    for (byte b = 0; b < 'È'; b++) {
      if ((d[b]).d == -1000) {
        (d[b]).d = false;
        return d[b];
      } 
    } 
    return null;
  }
  
  public final void e() {
    this.d = null;
  }
  
  public final void d(Graphics paramGraphics, int paramInt1, int paramInt2) {
    q[] arrayOfQ = this.d;
    while (arrayOfQ != null) {
      q q2 = ((q)arrayOfQ).d;
      while (q2 != null) {
        q2.d(paramGraphics, paramInt1, paramInt2);
        int i = ((be)q2).e;
      } 
      q q1 = ((q)arrayOfQ).d;
    } 
  }
  
  public final void c() {
    q[] arrayOfQ = this.d;
    while (arrayOfQ != null) {
      q q2 = ((q)arrayOfQ).d;
      while (q2 != null) {
        q2.n();
        int i = ((be)q2).e;
      } 
      q q1 = ((q)arrayOfQ).d;
    } 
  }
  
  public final void d(be parambe) {
    if (parambe == null)
      return; 
    if (this.d == null)
      return; 
    if (((q)this.d).d > parambe.ac)
      return; 
    q[] arrayOfQ1 = this.d;
    q[] arrayOfQ2 = this.d;
    while (arrayOfQ1 != null) {
      if (((q)arrayOfQ1).d > parambe.ac)
        return; 
      if (((q)arrayOfQ1).d < parambe.ac) {
        arrayOfQ2 = arrayOfQ1;
        q1 = ((q)arrayOfQ1).d;
        continue;
      } 
      if (q1.d > parambe.ac)
        return; 
      q q2;
      if ((q2 = q1.d) == parambe) {
        q1.d = ((be)q2).e;
        if (q1.d == null) {
          if (q1 == this.d) {
            this.d = (q[])q1.d;
          } else {
            ((q)arrayOfQ2).d = q1.d;
          } 
          (q1 = q1).d = -1000;
          q1.d = null;
          q1.d = null;
        } 
        parambe.e = null;
        return;
      } 
      q q1 = q2;
      while (q2 != null) {
        if (q2 == parambe) {
          ((be)q1).e = ((be)q2).e;
          parambe.e = null;
          return;
        } 
        q1 = q2;
        int i = ((be)q2).e;
      } 
    } 
  }
  
  public final void e(be parambe) {
    if (parambe == null)
      return; 
    if (this.d == null) {
      this.d = (q[])d();
      ((q)this.d).d = (q)parambe;
      ((q)this.d).d = parambe.ac;
      return;
    } 
    if (((q)this.d).d > parambe.ac) {
      q q2;
      (q2 = d()).d = parambe.ac;
      q2.d = (q)parambe;
      q2.d = (q)this.d;
      this.d = (q[])q2;
      return;
    } 
    q[] arrayOfQ1 = this.d;
    q[] arrayOfQ2 = this.d;
    while (arrayOfQ1 != null) {
      q q2;
      int i;
      if (((q)arrayOfQ1).d > parambe.ac) {
        q q5;
        (q5 = d()).d = parambe.ac;
        q5.d = (q)parambe;
        q5.d = (q)arrayOfQ1;
        ((q)arrayOfQ2).d = q5;
        return;
      } 
      if (((q)arrayOfQ1).d < parambe.ac) {
        arrayOfQ2 = arrayOfQ1;
        q2 = ((q)arrayOfQ1).d;
        continue;
      } 
      q q3;
      if (((be)(q3 = q2.d)).ab > parambe.ab) {
        q2.d = (q)parambe;
        parambe.e = q3;
        return;
      } 
      q q4 = q3;
      while (q3 != null) {
        if (((be)q3).ab > parambe.ab) {
          ((be)q4).e = parambe;
          parambe.e = q3;
          return;
        } 
        if (q3 == parambe)
          return; 
        q4 = q3;
        i = ((be)q3).e;
      } 
      if (i == null) {
        ((be)q4).e = parambe;
        return;
      } 
    } 
    q q1;
    (q1 = d()).d = parambe.ac;
    q1.d = (q)parambe;
    ((q)arrayOfQ2).d = q1;
  }
  
  public final void d(be parambe, int paramInt1, int paramInt2) {
    d(parambe);
    parambe.ab = paramInt1;
    parambe.ac = paramInt2;
    e(parambe);
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/fs/arpg/q;
    //   4: astore_1
    //   5: invokestatic d : ()Lcom/fs/arpg/v;
    //   8: pop
    //   9: aload_1
    //   10: ifnull -> 57
    //   13: aload_1
    //   14: getfield d : Lcom/fs/arpg/be;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull -> 49
    //   22: aload_2
    //   23: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   26: if_acmpne -> 37
    //   29: aload_2
    //   30: getfield e : Lcom/fs/arpg/be;
    //   33: astore_2
    //   34: goto -> 18
    //   37: aload_2
    //   38: invokevirtual l : ()V
    //   41: aload_2
    //   42: getfield e : Lcom/fs/arpg/be;
    //   45: astore_2
    //   46: goto -> 18
    //   49: aload_1
    //   50: getfield d : Lcom/fs/arpg/q;
    //   53: astore_1
    //   54: goto -> 9
    //   57: return
  }
  
  static {
    for (byte b = 0; b < 'È'; b++) {
      d[b] = new q();
      (d[b]).d = -1000;
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\am.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */