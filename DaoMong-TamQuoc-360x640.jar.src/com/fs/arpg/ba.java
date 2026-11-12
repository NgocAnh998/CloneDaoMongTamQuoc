package com.fs.arpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Display;
import t;
import u;

public final class ba {
  public static GameMidlet d;
  
  public static aq d;
  
  public static Display d;
  
  public static int d;
  
  public static String d;
  
  public static String e;
  
  public static p d;
  
  public static am d;
  
  public static am e;
  
  public static am c;
  
  public static t d = new t();
  
  public static boolean d;
  
  private static long d = System.currentTimeMillis();
  
  public static m d;
  
  public static m e;
  
  public static b d = new b();
  
  public static ai d;
  
  public static byte[] d = new byte[0];
  
  private static Hashtable c = new Hashtable();
  
  private static bh d;
  
  static ac d = null;
  
  static char[] d = null;
  
  static char[] e = null;
  
  public static Hashtable d;
  
  public static int e = false;
  
  public static Hashtable e = new Hashtable();
  
  public static boolean d(int paramInt) {
    if (d != null) {
      d = false;
      return true;
    } 
    return (paramInt >= d(0, 100));
  }
  
  public static int d(int paramInt1, int paramInt2) {
    return (int)(d = d * 10807L & 0x7FFFFFFFL) % (paramInt2 - paramInt1 + 1) + paramInt1;
  }
  
  public static boolean d() {
    return (d != null && d.length > 0);
  }
  
  public static void d() {
    int i = d("PHONEMODEL");
    int j = d("POINTER");
    c.clear();
    c.put("PHONEMODEL", new Integer(i));
    c.put("POINTER", new Integer(j));
  }
  
  public static void d(String paramString, int paramInt) {
    paramString = m.d(paramString);
    c.put(paramString, new Integer(paramInt));
  }
  
  public static int d(String paramString) {
    paramString = m.d(paramString);
    Integer integer;
    return ((integer = (Integer)c.get(paramString)) == null) ? 0 : integer.intValue();
  }
  
  public static void e(String paramString, int paramInt) {
    int i = d(paramString = m.d(paramString));
    d(paramString, i + paramInt);
  }
  
  public static void d(DataOutputStream paramDataOutputStream) {
    Enumeration enumeration = c.elements();
    int i = 0;
    while (enumeration.hasMoreElements()) {
      if (((Integer)enumeration.nextElement()).intValue() > 0)
        i++; 
    } 
    paramDataOutputStream.writeShort(i);
    Enumeration enumeration1 = c.keys();
    while (enumeration1.hasMoreElements()) {
      String str = enumeration1.nextElement();
      if ((i = ((Integer)c.get(str)).intValue()) > 0) {
        paramDataOutputStream.writeUTF(str);
        paramDataOutputStream.writeShort(i);
      } 
    } 
  }
  
  public static void d(DataInputStream paramDataInputStream) {
    d();
    short s = paramDataInputStream.readShort();
    for (byte b1 = 0; b1 < s; b1++) {
      String str = paramDataInputStream.readUTF();
      short s1 = paramDataInputStream.readShort();
      c.put(str, new Integer(s1));
    } 
  }
  
  public static void e() {
    try {
      DataInputStream dataInputStream;
      short s = (dataInputStream = new DataInputStream(new ByteArrayInputStream(bi.d("/items.dat")))).readShort();
      d = (Hashtable)new bh(s);
      for (byte b1 = 0; b1 < s; b1++) {
        short s1 = dataInputStream.readShort();
        g g2;
        (g2 = new g()).d = (byte)s1;
        g g1;
        (g1 = g2).d(dataInputStream);
        d.d(g1.d, g1);
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static g d(short paramShort) {
    return (g)d.d(paramShort);
  }
  
  public static void c() {
    d.d((u)d);
    try {
      bf bf;
      if ((bf = bf.d("arpg5.fs", true)).d() == 0) {
        d = (Hashtable)new byte[0];
        bf.d((byte[])d, 0, 0);
        bf.d();
        return;
      } 
      d = (Hashtable)bf.d(1);
      bf.d();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void d(byte[] paramArrayOfbyte) {
    d = (Hashtable)paramArrayOfbyte;
    try {
      bf bf;
      (bf = bf.d("arpg5.fs", true)).d(1, (byte[])d, 0, d.length);
      bf.d();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void b() {
    d = (Hashtable)bg.d().d((short)72);
    String str;
    if ((str = bi.d("/info.fs")) != null) {
      int i = str.indexOf('&');
      String str1 = str.substring(0, i);
      str = str.substring(i + 1);
      StringBuffer stringBuffer;
      (stringBuffer = new StringBuffer()).append(str1);
      stringBuffer.append((char[])d);
      d = (Hashtable)stringBuffer.toString().toCharArray();
      e = (Hashtable)str.toCharArray();
    } 
  }
  
  public static void a() {
    // Byte code:
    //   0: new java/io/DataInputStream
    //   3: dup
    //   4: new java/io/ByteArrayInputStream
    //   7: dup
    //   8: ldc '/npcdata.dat'
    //   10: invokestatic d : (Ljava/lang/String;)[B
    //   13: invokespecial <init> : ([B)V
    //   16: invokespecial <init> : (Ljava/io/InputStream;)V
    //   19: dup
    //   20: astore_0
    //   21: invokevirtual readShort : ()S
    //   24: putstatic com/fs/arpg/x.k : I
    //   27: aload_0
    //   28: invokevirtual readShort : ()S
    //   31: putstatic com/fs/arpg/x.l : I
    //   34: getstatic com/fs/arpg/x.k : I
    //   37: getstatic com/fs/arpg/x.l : I
    //   40: imul
    //   41: newarray int
    //   43: putstatic com/fs/arpg/x.b : [I
    //   46: iconst_0
    //   47: istore_1
    //   48: iload_1
    //   49: getstatic com/fs/arpg/x.k : I
    //   52: getstatic com/fs/arpg/x.l : I
    //   55: imul
    //   56: if_icmpge -> 74
    //   59: getstatic com/fs/arpg/x.b : [I
    //   62: iload_1
    //   63: aload_0
    //   64: invokevirtual readInt : ()I
    //   67: iastore
    //   68: iinc #1, 1
    //   71: goto -> 48
    //   74: new java/io/DataInputStream
    //   77: dup
    //   78: new java/io/ByteArrayInputStream
    //   81: dup
    //   82: ldc '/scenelv.dat'
    //   84: invokestatic d : (Ljava/lang/String;)[B
    //   87: invokespecial <init> : ([B)V
    //   90: invokespecial <init> : (Ljava/io/InputStream;)V
    //   93: dup
    //   94: astore_0
    //   95: invokevirtual readShort : ()S
    //   98: istore_1
    //   99: aload_0
    //   100: invokevirtual readShort : ()S
    //   103: putstatic com/fs/arpg/ba.e : I
    //   106: new java/util/Hashtable
    //   109: dup
    //   110: iload_1
    //   111: invokespecial <init> : (I)V
    //   114: putstatic com/fs/arpg/ba.d : Ljava/util/Hashtable;
    //   117: iconst_0
    //   118: istore_2
    //   119: iload_2
    //   120: iload_1
    //   121: if_icmpge -> 178
    //   124: aload_0
    //   125: invokevirtual readShort : ()S
    //   128: istore_3
    //   129: aload_0
    //   130: invokevirtual readShort : ()S
    //   133: dup
    //   134: istore #4
    //   136: newarray byte
    //   138: astore #5
    //   140: aload_0
    //   141: aload #5
    //   143: iconst_0
    //   144: iload #4
    //   146: invokevirtual readFully : ([BII)V
    //   149: getstatic com/fs/arpg/ba.d : Ljava/util/Hashtable;
    //   152: new java/lang/StringBuffer
    //   155: dup
    //   156: invokespecial <init> : ()V
    //   159: iload_3
    //   160: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: aload #5
    //   168: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   171: pop
    //   172: iinc #2, 1
    //   175: goto -> 119
    //   178: aload_0
    //   179: invokevirtual close : ()V
    //   182: return
    //   183: pop
    //   184: return
    // Exception table:
    //   from	to	target	type
    //   0	182	183	java/lang/Exception
  }
  
  public static void z() {
    String[] arrayOfString = { "dropbox", "dropkey" };
    byte b1 = 0;
    int i = arrayOfString.length;
    while (b1 < i) {
      m m1 = new m(arrayOfString[b1]);
      e.put(arrayOfString[b1], m1);
      b1++;
    } 
  }
  
  static {
    Integer integer1 = new Integer(5800);
    Integer integer2 = new Integer(0);
    c.put("PHONEMODEL", integer1);
    c.put("POINTER", integer2);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\ba.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */