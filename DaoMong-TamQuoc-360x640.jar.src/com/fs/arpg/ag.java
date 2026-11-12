package com.fs.arpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.media.Control;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class ag {
  private static ag d;
  
  public boolean d;
  
  private Player d;
  
  private boolean b;
  
  private String d;
  
  boolean e;
  
  private VolumeControl d;
  
  public int d;
  
  public boolean c;
  
  private String e;
  
  private at d = true;
  
  int e;
  
  private int c;
  
  private ag() {
    this.d = 3;
    this.d = new at("/music.idx", "/music.pkg");
  }
  
  public static synchronized ag d() {
    if (d == null)
      d = (at)new ag(); 
    return (ag)d;
  }
  
  final void d(DataInputStream paramDataInputStream) {
    try {
      this.b = true;
      this.d = (at)paramDataInputStream.readUTF();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  final void d(DataOutputStream paramDataOutputStream) {
    try {
      paramDataOutputStream.writeUTF((String)this.d);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void d() {
    h();
    if (this.d != null) {
      this.d.close();
      this.d = null;
    } 
    this.e = null;
  }
  
  public final void e() {
    if (this.d < 5) {
      this.d++;
      if (this.d > null)
        this.d = true; 
    } else {
      this.d = false;
      this.d = false;
      h();
    } 
    d(this.d);
  }
  
  public final void c() {
    if (this.d > null) {
      this.d--;
      if (this.d == null) {
        this.d = false;
        h();
      } 
    } else {
      this.d = 5;
      this.d = true;
    } 
    d(this.d);
  }
  
  private void d(int paramInt) {
    this.d = paramInt;
    if (this.d == null)
      return; 
    this.d.setLevel(paramInt * 20);
  }
  
  private void e(String paramString) {
    if (this.d != null && paramString != null && paramString.equals(this.e))
      return; 
    String str1 = paramString;
    ag ag1;
    (ag1 = this).e = str1;
    String str2 = "audio/midi";
    try {
      ag1.h();
      byte[] arrayOfByte = ag1.d.d(str1);
      ag1.d = (at)Manager.createPlayer(new ByteArrayInputStream(arrayOfByte), str2);
      Thread.sleep(20L);
      ag1.d.prefetch();
      Thread.sleep(20L);
      Control[] arrayOfControl = ag1.d.getControls();
      for (byte b = 0; b < arrayOfControl.length; b++) {
        if (arrayOfControl[b] instanceof VolumeControl) {
          ag1.d = (at)arrayOfControl[b];
          break;
        } 
      } 
      ag1.d(ag1.d);
    } catch (Exception exception) {
      ag1.d = false;
    } 
    if ((ag1 = this).d != null)
      try {
        ag1.d.setLoopCount(-1);
        return;
      } catch (Exception exception) {} 
  }
  
  private void z() {
    if (this.d == null)
      return; 
    if (this.d == null)
      return; 
    if (this.c != 0)
      return; 
    try {
      if (this.e != 0)
        return; 
      this.d.start();
      this.c = 1;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void b() {
    h();
  }
  
  private void h() {
    if (this.d == null)
      return; 
    try {
      this.c = 0;
      this.d.stop();
      this.d.close();
      this.d = null;
      this.d = null;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a() {
    this.c++;
    if (this.e != 0)
      return; 
    if (this.e > 0) {
      this.e--;
      return;
    } 
    if (this.b) {
      ag ag1;
      (ag1 = this).b = false;
      if (ag1.d == null) {
        ag1.e = ag1.d;
        return;
      } 
      if (ag1.d == null) {
        ag1.e = ag1.d;
        return;
      } 
      if (ag1.d != null && !ag1.d.equals(ag1.e)) {
        ag1.h();
        ag1.e = ag1.d;
      } 
      return;
    } 
    if (this.d != null) {
      ag ag1;
      if ((ag1 = this).e != null) {
        if (ag1.d == null) {
          ag1.e(ag1.e);
          ag1.c = 0;
          ag1.z();
          return;
        } 
        if (ag1.c == 0)
          ag1.z(); 
      } 
      return;
    } 
  }
  
  public final void d(String paramString) {
    if (paramString == null)
      return; 
    this.b = true;
    this.d = (at)paramString;
    e(paramString);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ag.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */