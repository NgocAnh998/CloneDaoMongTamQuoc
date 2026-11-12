package com.fs.arpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Hashtable;

public final class at {
  private Hashtable d;
  
  private int[] d;
  
  private int[] e;
  
  private int d;
  
  private String d;
  
  private Hashtable e;
  
  private static byte d;
  
  public at(String paramString1, String paramString2) {
    try {
      d(paramString1);
    } catch (Exception exception) {}
    this.d = paramString2;
  }
  
  public final boolean d(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/util/Hashtable;
    //   4: aload_1
    //   5: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   8: ireturn
  }
  
  private void d(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic d : (Ljava/lang/String;)Ljava/io/DataInputStream;
    //   4: astore_1
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual readShort : ()S
    //   10: putfield d : I
    //   13: aload_0
    //   14: new java/util/Hashtable
    //   17: dup
    //   18: aload_0
    //   19: getfield d : I
    //   22: iconst_1
    //   23: ishl
    //   24: invokespecial <init> : (I)V
    //   27: putfield d : Ljava/util/Hashtable;
    //   30: aload_0
    //   31: aload_0
    //   32: getfield d : I
    //   35: newarray int
    //   37: putfield d : [I
    //   40: aload_0
    //   41: aload_0
    //   42: getfield d : I
    //   45: newarray int
    //   47: putfield e : [I
    //   50: iconst_0
    //   51: istore_2
    //   52: iload_2
    //   53: aload_0
    //   54: getfield d : I
    //   57: if_icmpge -> 108
    //   60: aload_1
    //   61: invokevirtual readUTF : ()Ljava/lang/String;
    //   64: astore_3
    //   65: aload_0
    //   66: getfield e : [I
    //   69: iload_2
    //   70: aload_1
    //   71: invokevirtual readInt : ()I
    //   74: iastore
    //   75: aload_0
    //   76: getfield d : [I
    //   79: iload_2
    //   80: aload_1
    //   81: invokevirtual readInt : ()I
    //   84: iastore
    //   85: aload_0
    //   86: getfield d : Ljava/util/Hashtable;
    //   89: aload_3
    //   90: new java/lang/Integer
    //   93: dup
    //   94: iload_2
    //   95: invokespecial <init> : (I)V
    //   98: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: iinc #2, 1
    //   105: goto -> 52
    //   108: aload_1
    //   109: invokevirtual close : ()V
    //   112: return
    //   113: pop
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   108	112	113	java/lang/Exception
  }
  
  public final byte[] d(String paramString) {
    // Byte code:
    //   0: getstatic com/fs/arpg/at.d : B
    //   3: ifne -> 72
    //   6: new i
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual getClass : ()Ljava/lang/Class;
    //   18: ldc '/dcn.bin'
    //   20: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   23: dup
    //   24: astore #4
    //   26: aload_2
    //   27: dup
    //   28: astore_3
    //   29: getfield d : Ll;
    //   32: getfield d : Lj;
    //   35: invokestatic d : (Ljava/io/InputStream;Lj;)Lf;
    //   38: astore_3
    //   39: aload #4
    //   41: invokevirtual close : ()V
    //   44: aload_2
    //   45: aload_3
    //   46: aconst_null
    //   47: invokevirtual d : (Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    //   50: dup
    //   51: astore_2
    //   52: iconst_1
    //   53: aaload
    //   54: checkcast java/lang/Integer
    //   57: invokevirtual byteValue : ()B
    //   60: putstatic com/fs/arpg/at.d : B
    //   63: goto -> 72
    //   66: dup
    //   67: astore #4
    //   69: invokevirtual printStackTrace : ()V
    //   72: aload_0
    //   73: getfield d : Ljava/util/Hashtable;
    //   76: aload_1
    //   77: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast java/lang/Integer
    //   83: dup
    //   84: astore_2
    //   85: ifnonnull -> 96
    //   88: new java/lang/RuntimeException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload_2
    //   97: invokevirtual intValue : ()I
    //   100: istore_3
    //   101: aload_0
    //   102: getfield d : [I
    //   105: iload_3
    //   106: iaload
    //   107: bipush #24
    //   109: iushr
    //   110: istore #4
    //   112: aconst_null
    //   113: astore_2
    //   114: aload_0
    //   115: invokevirtual getClass : ()Ljava/lang/Class;
    //   118: new java/lang/StringBuffer
    //   121: dup
    //   122: aload_0
    //   123: getfield d : Ljava/lang/String;
    //   126: iconst_0
    //   127: aload_0
    //   128: getfield d : Ljava/lang/String;
    //   131: invokevirtual length : ()I
    //   134: iconst_4
    //   135: isub
    //   136: invokevirtual substring : (II)Ljava/lang/String;
    //   139: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   142: invokespecial <init> : (Ljava/lang/String;)V
    //   145: iload #4
    //   147: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   150: ldc '.pkg'
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   161: dup
    //   162: astore_1
    //   163: aload_0
    //   164: getfield d : [I
    //   167: iload_3
    //   168: iaload
    //   169: ldc 16777215
    //   171: iand
    //   172: i2l
    //   173: invokevirtual skip : (J)J
    //   176: pop2
    //   177: aload_0
    //   178: getfield e : [I
    //   181: iload_3
    //   182: iaload
    //   183: dup
    //   184: istore_3
    //   185: newarray byte
    //   187: astore_2
    //   188: iconst_0
    //   189: istore #4
    //   191: goto -> 218
    //   194: aload_1
    //   195: aload_2
    //   196: iload #4
    //   198: iload_3
    //   199: iload #4
    //   201: isub
    //   202: invokevirtual read : ([BII)I
    //   205: dup
    //   206: istore #5
    //   208: ifle -> 218
    //   211: iload #4
    //   213: iload #5
    //   215: iadd
    //   216: istore #4
    //   218: iload #4
    //   220: iload_3
    //   221: if_icmplt -> 194
    //   224: aload_1
    //   225: invokevirtual close : ()V
    //   228: getstatic com/fs/arpg/at.d : B
    //   231: istore #5
    //   233: iload_3
    //   234: bipush #20
    //   236: if_icmple -> 242
    //   239: bipush #20
    //   241: istore_3
    //   242: iconst_0
    //   243: istore_1
    //   244: goto -> 259
    //   247: aload_2
    //   248: iload_1
    //   249: dup2
    //   250: baload
    //   251: iload #5
    //   253: ixor
    //   254: i2b
    //   255: bastore
    //   256: iinc #1, 1
    //   259: iload_1
    //   260: iload_3
    //   261: if_icmplt -> 247
    //   264: goto -> 272
    //   267: dup
    //   268: astore_1
    //   269: invokevirtual printStackTrace : ()V
    //   272: aload_2
    //   273: areturn
    // Exception table:
    //   from	to	target	type
    //   14	66	66	java/lang/Exception
    //   114	267	267	java/lang/Exception
  }
  
  public final DataInputStream d(String paramString) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(d(paramString));
    return new DataInputStream(byteArrayInputStream);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\at.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */