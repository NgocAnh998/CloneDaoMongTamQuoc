package com.fs.arpg;

import java.io.DataInputStream;
import java.util.Hashtable;

public final class v {
  bh d;
  
  Hashtable d;
  
  private at d;
  
  private static v d;
  
  public static v d() {
    if (d == null)
      d = new v(); 
    return d;
  }
  
  private v() {
    try {
      this.d = (v)new at("/ani.idx", "/ani.pkg");
      d("/anis.dat");
    } catch (Exception exception) {}
    this.d = (v)new Hashtable();
  }
  
  private void d(String paramString) {
    DataInputStream dataInputStream;
    short s = (dataInputStream = bi.d(paramString)).readShort();
    this.d = (v)new bh(s);
    for (byte b = 0; b < s; b++) {
      short s1 = dataInputStream.readShort();
      k k2 = new k();
      this.d.d(s1, k2);
      DataInputStream dataInputStream1 = dataInputStream;
      k k1;
      (k1 = k2).d = (String[])dataInputStream1.readUTF();
      byte b1;
      if ((b1 = dataInputStream1.readByte()) == 1) {
        k1.d = dataInputStream1.readShort();
        if (dataInputStream1.readBoolean())
          k1.e = dataInputStream1.readUTF(); 
      } else {
        k1.d = false;
        k1.d = (String[])new short[b1];
        k1.d = new String[b1];
        for (byte b2 = 0; b2 < b1; b2++) {
          k1.d[b2] = dataInputStream1.readShort();
          if (dataInputStream1.readBoolean())
            k1.d[b2] = dataInputStream1.readUTF(); 
        } 
      } 
    } 
    dataInputStream.close();
  }
  
  public final bc d(short paramShort) {
    k k;
    if ((k = (k)this.d.d(paramShort)) == null)
      return null; 
    bc bc;
    if ((bc = (bc)this.d.get(k.d)) != null)
      return bc; 
    try {
      DataInputStream dataInputStream;
      if ((dataInputStream = this.d.d((String)k.d)) == null)
        dataInputStream = bi.d("/" + k.d); 
      (bc = new bc(dataInputStream)).d = paramShort;
      try {
        dataInputStream.close();
      } catch (Exception exception) {}
      this.d.put(k.d, bc);
      return bc;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final void d(short paramShort, be parambe) {
    bc bc = d(paramShort);
    parambe.e = bc;
    ((k)this.d.d(paramShort)).d(parambe);
  }
  
  public final void d(int paramInt) {
    k k;
    if ((k = (k)this.d.d((short)paramInt)) == null)
      return; 
    n.d().d(k.d);
    if (k.d != null) {
      String[] arrayOfString = k.d;
      n n = n.d();
      for (byte b = 0; b < arrayOfString.length; b++)
        n.d.d(arrayOfString[b]); 
    } 
    this.d.remove(k.d);
  }
  
  public final void d(bc parambc) {
    if (parambc == null)
      return; 
    d(parambc.d);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\v.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */