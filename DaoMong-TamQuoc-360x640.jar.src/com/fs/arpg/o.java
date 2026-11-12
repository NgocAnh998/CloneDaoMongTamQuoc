package com.fs.arpg;

import java.io.DataInputStream;

public final class o {
  short d;
  
  private short c;
  
  private short b;
  
  private short a;
  
  private short z;
  
  short e;
  
  int d;
  
  final void d(String paramString) {
    try {
      DataInputStream dataInputStream;
      (dataInputStream = l.d().d(paramString)).readShort();
      dataInputStream.readUTF();
      bk bk = (bk)aa.d(dataInputStream);
      this.d = bk.d;
      v.d().d(this.d);
      this.c = bk.d(0, 0);
      this.b = bk.d(0, 1);
      this.a = bk.d(0, 2);
      this.z = bk.d(0, 3);
      if ((bk = (bk)aa.d(dataInputStream)) != null)
        this.e = bk.d(0, 0); 
      dataInputStream.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final short d(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.c;
      case 1:
        return this.b;
      case 2:
        return this.a;
      case 3:
        return this.z;
    } 
    return this.b;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\o.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */