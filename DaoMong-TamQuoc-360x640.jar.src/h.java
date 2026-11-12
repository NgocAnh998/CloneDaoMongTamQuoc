import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class h {
  public int[] d;
  
  public Object[] d;
  
  public h[] d;
  
  public int d;
  
  public boolean d;
  
  private String d;
  
  public int e;
  
  public int c;
  
  public final void d() {
    this.d = null;
    this.d = null;
    if (this.d != null) {
      for (byte b = 0; b < this.d.length; b++)
        this.d[b].d(); 
      this.d = null;
    } 
    this.d = null;
  }
  
  public h() {}
  
  private h(DataInputStream paramDataInputStream, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokestatic d : (Ljava/io/DataInputStream;)Ljava/lang/String;
    //   9: putfield d : Ljava/lang/String;
    //   12: aload_0
    //   13: getfield d : Ljava/lang/String;
    //   16: ifnonnull -> 24
    //   19: aload_0
    //   20: aload_2
    //   21: putfield d : Ljava/lang/String;
    //   24: aload_1
    //   25: invokevirtual readInt : ()I
    //   28: pop
    //   29: aload_1
    //   30: invokevirtual readInt : ()I
    //   33: pop
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual read : ()I
    //   39: putfield e : I
    //   42: aload_0
    //   43: aload_1
    //   44: invokevirtual read : ()I
    //   47: putfield d : I
    //   50: aload_1
    //   51: invokevirtual read : ()I
    //   54: istore_2
    //   55: aload_0
    //   56: iload_2
    //   57: iconst_2
    //   58: iand
    //   59: ifeq -> 66
    //   62: iconst_1
    //   63: goto -> 67
    //   66: iconst_0
    //   67: putfield d : Z
    //   70: aload_0
    //   71: aload_1
    //   72: invokevirtual read : ()I
    //   75: putfield c : I
    //   78: aload_1
    //   79: invokevirtual readInt : ()I
    //   82: istore_2
    //   83: aload_0
    //   84: iload_2
    //   85: newarray int
    //   87: putfield d : [I
    //   90: iconst_0
    //   91: istore_3
    //   92: goto -> 108
    //   95: aload_0
    //   96: getfield d : [I
    //   99: iload_3
    //   100: aload_1
    //   101: invokevirtual readInt : ()I
    //   104: iastore
    //   105: iinc #3, 1
    //   108: iload_3
    //   109: iload_2
    //   110: if_icmplt -> 95
    //   113: aload_1
    //   114: invokevirtual readInt : ()I
    //   117: istore_3
    //   118: aload_0
    //   119: iload_3
    //   120: anewarray java/lang/Object
    //   123: putfield d : [Ljava/lang/Object;
    //   126: iconst_0
    //   127: istore_2
    //   128: goto -> 260
    //   131: aconst_null
    //   132: astore #4
    //   134: aload_1
    //   135: invokevirtual read : ()I
    //   138: dup
    //   139: istore #5
    //   141: tableswitch default -> 224, 0 -> 176, 1 -> 179, 2 -> 224, 3 -> 203, 4 -> 215
    //   176: goto -> 249
    //   179: aload_1
    //   180: invokevirtual read : ()I
    //   183: dup
    //   184: istore #4
    //   186: ifne -> 195
    //   189: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   192: goto -> 198
    //   195: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   198: astore #4
    //   200: goto -> 249
    //   203: aload_1
    //   204: invokevirtual readInt : ()I
    //   207: invokestatic d : (I)Ljava/lang/Integer;
    //   210: astore #4
    //   212: goto -> 249
    //   215: aload_1
    //   216: invokestatic d : (Ljava/io/DataInputStream;)Ljava/lang/String;
    //   219: astore #4
    //   221: goto -> 249
    //   224: new java/io/IOException
    //   227: dup
    //   228: new java/lang/StringBuffer
    //   231: dup
    //   232: ldc 'unknown constant type: '
    //   234: invokespecial <init> : (Ljava/lang/String;)V
    //   237: iload #5
    //   239: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   242: invokevirtual toString : ()Ljava/lang/String;
    //   245: invokespecial <init> : (Ljava/lang/String;)V
    //   248: athrow
    //   249: aload_0
    //   250: getfield d : [Ljava/lang/Object;
    //   253: iload_2
    //   254: aload #4
    //   256: aastore
    //   257: iinc #2, 1
    //   260: iload_2
    //   261: iload_3
    //   262: if_icmplt -> 131
    //   265: aload_1
    //   266: invokevirtual readInt : ()I
    //   269: istore_2
    //   270: aload_0
    //   271: iload_2
    //   272: anewarray h
    //   275: putfield d : [Lh;
    //   278: iconst_0
    //   279: istore #4
    //   281: goto -> 306
    //   284: aload_0
    //   285: getfield d : [Lh;
    //   288: iload #4
    //   290: new h
    //   293: dup
    //   294: aload_1
    //   295: aload_0
    //   296: getfield d : Ljava/lang/String;
    //   299: invokespecial <init> : (Ljava/io/DataInputStream;Ljava/lang/String;)V
    //   302: aastore
    //   303: iinc #4, 1
    //   306: iload #4
    //   308: iload_2
    //   309: if_icmplt -> 284
    //   312: aload_1
    //   313: invokevirtual readInt : ()I
    //   316: pop
    //   317: aload_1
    //   318: invokevirtual readInt : ()I
    //   321: pop
    //   322: aload_1
    //   323: invokevirtual readInt : ()I
    //   326: pop
    //   327: return
  }
  
  public final String toString() {
    return this.d;
  }
  
  private static String d(DataInputStream paramDataInputStream) {
    short s;
    if ((s = paramDataInputStream.readShort()) == 0)
      return ""; 
    d((s < 65536), "Too long str: " + s);
    byte[] arrayOfByte = new byte[s];
    int i = 0;
    int j = s;
    for (byte b = 0; b < 100 && j > 0; b++) {
      int k = paramDataInputStream.read(arrayOfByte, i, j);
      i += k;
      j -= k;
    } 
    d((j == 0), "strload");
    return new String(arrayOfByte, "utf-8");
  }
  
  private static f d(DataInputStream paramDataInputStream, j paramj) {
    int i;
    d(((i = paramDataInputStream.read()) == 27), "Signature 1");
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    paramDataInputStream.read();
    h h1 = new h(paramDataInputStream, null);
    f f;
    return f = new f(h1, paramj);
  }
  
  private static void d(boolean paramBoolean, String paramString) {
    if (!paramBoolean)
      throw new IOException("Couldn't load bytecode:" + paramString); 
  }
  
  public static f d(InputStream paramInputStream, j paramj) {
    if (!(paramInputStream instanceof DataInputStream))
      paramInputStream = new DataInputStream(paramInputStream); 
    paramj = paramj;
    int i;
    d(((i = (paramInputStream = paramInputStream).read()) == 27), "Signature 1");
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    paramInputStream.read();
    h h1 = new h((DataInputStream)paramInputStream, null);
    f f;
    return f = new f(h1, paramj);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */