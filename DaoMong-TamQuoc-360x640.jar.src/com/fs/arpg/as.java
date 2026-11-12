package com.fs.arpg;

import java.io.DataInputStream;

public final class as {
  public aa d;
  
  public aa e;
  
  private aa c;
  
  private aa b;
  
  private aa a;
  
  private aa z;
  
  public int d;
  
  public int e;
  
  public int c;
  
  public int b;
  
  public int a;
  
  public short[] d;
  
  public int z;
  
  public int h;
  
  public boolean d;
  
  public boolean e;
  
  public boolean c;
  
  public boolean b = true;
  
  public boolean a;
  
  public boolean z;
  
  aw[] d;
  
  int g;
  
  int f;
  
  short d;
  
  public final aa d(int paramInt) {
    switch (paramInt) {
      case 1:
        return this.d;
      case 2:
        return this.e;
      case 4:
        return this.c;
      case 3:
        return this.z;
      case 7:
        return this.a;
      case 5:
        return this.b;
    } 
    return null;
  }
  
  final void d(String paramString) {
    try {
      DataInputStream dataInputStream1;
      (dataInputStream1 = l.d().d(paramString)).readShort();
      dataInputStream1.readUTF();
      DataInputStream dataInputStream2 = dataInputStream1;
      as as1;
      (as1 = this).d = aa.d(dataInputStream2);
      as1.e = aa.d(dataInputStream2);
      as1.c = aa.d(dataInputStream2);
      as1.b = aa.d(dataInputStream2);
      as1.a = aa.d(dataInputStream2);
      dataInputStream2 = dataInputStream1;
      (as1 = this).d = dataInputStream2.readShort();
      as1.e = dataInputStream2.readShort();
      as1.c = dataInputStream2.readShort();
      as1.b = dataInputStream2.readShort();
      dataInputStream2 = dataInputStream1;
      as1 = this;
      dataInputStream2.readShort();
      dataInputStream2.read();
      as1.a = dataInputStream2.readShort();
      dataInputStream2.read();
      dataInputStream2.readShort();
      as1.z = dataInputStream2.readByte();
      as1.h = dataInputStream2.readByte();
      as1.e = dataInputStream2.readBoolean();
      as1.d = dataInputStream2.readBoolean();
      as1.c = dataInputStream2.readBoolean();
      as1.b = dataInputStream2.readBoolean();
      as1.a = dataInputStream2.readBoolean();
      as1.z = dataInputStream2.readBoolean();
      as1.z = aa.d(dataInputStream2);
      int i = dataInputStream2.readShort() * 3;
      as1.d = new short[i];
      for (byte b = 0; b < i; b++)
        as1.d[b] = dataInputStream2.readShort(); 
      dataInputStream2 = dataInputStream1;
      as1 = this;
      short s = dataInputStream2.readShort();
      as1.d = new aw[s];
      for (i = 0; i < s; i++) {
        aw aw1;
        (aw1 = new aw()).d(dataInputStream2);
        as1.d[i] = aw1;
      } 
      dataInputStream2 = dataInputStream1;
      as1 = this;
      s = dataInputStream2.readShort();
      for (i = 0; i < s; i++) {
        switch (dataInputStream2.readShort()) {
          case 0:
            as1.g = dataInputStream2.readShort();
            break;
          case 1:
            dataInputStream2.readShort();
            break;
          case 3:
            dataInputStream2.readShort();
            break;
          case 2:
            as1.f = dataInputStream2.readShort();
            break;
          case 4:
            dataInputStream2.readShort();
            break;
        } 
      } 
      dataInputStream1.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void d(x paramx) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: astore_2
    //   3: dup
    //   4: astore_1
    //   5: getfield d : [Lcom/fs/arpg/aw;
    //   8: ifnull -> 237
    //   11: aload_2
    //   12: getfield m : Z
    //   15: ifeq -> 115
    //   18: aload_1
    //   19: getfield d : [Lcom/fs/arpg/aw;
    //   22: aload_2
    //   23: getfield o : I
    //   26: aaload
    //   27: aload_2
    //   28: invokevirtual e : (Lcom/fs/arpg/x;)Z
    //   31: ifne -> 48
    //   34: aload_1
    //   35: getfield d : [Lcom/fs/arpg/aw;
    //   38: aload_2
    //   39: getfield o : I
    //   42: aaload
    //   43: aload_2
    //   44: invokevirtual e : (Lcom/fs/arpg/x;)V
    //   47: return
    //   48: aload_1
    //   49: getfield d : [Lcom/fs/arpg/aw;
    //   52: aload_2
    //   53: getfield o : I
    //   56: aaload
    //   57: aload_2
    //   58: invokevirtual d : (Lcom/fs/arpg/x;)V
    //   61: aload_2
    //   62: iconst_m1
    //   63: putfield s : I
    //   66: aload_2
    //   67: dup
    //   68: getfield q : I
    //   71: iconst_1
    //   72: iadd
    //   73: putfield q : I
    //   76: aload_2
    //   77: getfield q : I
    //   80: aload_1
    //   81: getfield d : [Lcom/fs/arpg/aw;
    //   84: aload_2
    //   85: getfield o : I
    //   88: aaload
    //   89: getfield d : [S
    //   92: arraylength
    //   93: if_icmpge -> 110
    //   96: aload_1
    //   97: getfield d : [Lcom/fs/arpg/aw;
    //   100: aload_2
    //   101: getfield o : I
    //   104: aaload
    //   105: aload_2
    //   106: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   109: return
    //   110: aload_2
    //   111: iconst_0
    //   112: putfield m : Z
    //   115: iconst_0
    //   116: istore_3
    //   117: aload_1
    //   118: getfield d : [Lcom/fs/arpg/aw;
    //   121: arraylength
    //   122: istore #4
    //   124: iload_3
    //   125: iload #4
    //   127: if_icmpge -> 237
    //   130: aload_1
    //   131: getfield d : Z
    //   134: ifne -> 146
    //   137: aload_1
    //   138: getfield d : S
    //   141: bipush #62
    //   143: if_icmpne -> 154
    //   146: aload_2
    //   147: iload_3
    //   148: invokestatic d : (Lcom/fs/arpg/x;I)Z
    //   151: ifne -> 231
    //   154: iconst_0
    //   155: putstatic com/fs/arpg/aw.d : I
    //   158: aload_1
    //   159: getfield d : [Lcom/fs/arpg/aw;
    //   162: iload_3
    //   163: aaload
    //   164: aload_2
    //   165: invokevirtual d : (Lcom/fs/arpg/x;)Z
    //   168: ifeq -> 231
    //   171: aload_2
    //   172: iconst_1
    //   173: putfield m : Z
    //   176: aload_2
    //   177: iload_3
    //   178: putfield o : I
    //   181: aload_2
    //   182: iconst_0
    //   183: putfield q : I
    //   186: aload_2
    //   187: getstatic com/fs/arpg/aq.c : I
    //   190: i2l
    //   191: putfield e : J
    //   194: aload_1
    //   195: getfield d : [Lcom/fs/arpg/aw;
    //   198: iload_3
    //   199: aaload
    //   200: aload_2
    //   201: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   204: getstatic com/fs/arpg/aw.d : I
    //   207: ifeq -> 237
    //   210: aload_2
    //   211: iload_3
    //   212: getstatic com/fs/arpg/aq.c : I
    //   215: i2l
    //   216: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   219: getfield d : J
    //   222: lsub
    //   223: l2i
    //   224: getstatic com/fs/arpg/aw.d : I
    //   227: invokestatic d : (Lcom/fs/arpg/x;III)V
    //   230: return
    //   231: iinc #3, 1
    //   234: goto -> 124
    //   237: return
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\as.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */