package com.fs.arpg;

import java.io.DataInputStream;

public final class au {
  int d;
  
  boolean d;
  
  int e;
  
  int c;
  
  boolean e;
  
  boolean c;
  
  boolean b;
  
  boolean a;
  
  aa d;
  
  aa e;
  
  ao d;
  
  int b;
  
  final void d(String paramString) {
    try {
      DataInputStream dataInputStream = l.d().d(paramString);
      this.d = l.d(paramString);
      dataInputStream.readShort();
      dataInputStream.readUTF();
      this.d = dataInputStream.readBoolean();
      this.e = dataInputStream.readBoolean();
      this.b = dataInputStream.readBoolean();
      this.a = dataInputStream.readBoolean();
      this.c = dataInputStream.readBoolean();
      this.c = dataInputStream.readShort();
      int i = dataInputStream.readShort() & 0xFFFF;
      this.b = dataInputStream.readShort();
      this.e = i / 100;
      this.d = ao.d(dataInputStream);
      this.d = (ao)aa.d(dataInputStream);
      this.e = aa.d(dataInputStream);
      dataInputStream.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\au.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */