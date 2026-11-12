import java.lang.ref.WeakReference;

public final class k implements j {
  private static final int d = 4;
  
  private Object[] d;
  
  private Object[] e;
  
  private int[] d;
  
  private int e;
  
  private boolean d;
  
  private boolean e;
  
  private static int d(int paramInt) {
    return (paramInt < 4) ? 4 : ((paramInt = (paramInt = (paramInt = (paramInt = (paramInt = --paramInt | paramInt >> 1) | paramInt >> 2) | paramInt >> 4) | paramInt >> 8) | paramInt >> 16) + 1);
  }
  
  private k(int paramInt) {
    int i = 4;
    k k1 = this;
    i = d(i);
    k1.d = new Object[i];
    k1.e = new Object[i];
    k1.d = new int[i];
    k1.e = i;
  }
  
  private void d(int paramInt) {
    paramInt = d(paramInt);
    this.d = new Object[paramInt];
    this.e = new Object[paramInt];
    this.d = new int[paramInt];
    this.e = paramInt;
  }
  
  public k() {
    this(4);
  }
  
  private int d(Object paramObject) {
    int i = this.d.length;
    int m;
    Object object;
    return ((paramObject = paramObject instanceof Integer) ? (((m = ((Integer)(object = paramObject = paramObject)).intValue()) == 0) ? 0 : paramObject.hashCode()) : ((paramObject instanceof String) ? paramObject.hashCode() : System.identityHashCode(paramObject))) & i - 1;
  }
  
  private final Object c(Object paramObject) {
    return !d(paramObject) ? paramObject : ((WeakReference)paramObject).get();
  }
  
  private final Object b(Object paramObject) {
    return !d(paramObject) ? paramObject : new WeakReference(paramObject);
  }
  
  private static boolean d(Object paramObject) {
    return !(paramObject == null || paramObject instanceof String || paramObject instanceof Integer || paramObject instanceof Boolean || paramObject instanceof b);
  }
  
  private Object e(int paramInt) {
    boolean bool = this.d[paramInt];
    return this.d ? c(bool) : bool;
  }
  
  private final void e(int paramInt, Object paramObject) {
    if (this.d)
      paramObject = b(paramObject); 
    this.d[paramInt] = paramObject;
  }
  
  private Object c(int paramInt) {
    boolean bool = this.e[paramInt];
    return this.e ? c(bool) : bool;
  }
  
  private void c(int paramInt, Object paramObject) {
    if (this.e)
      paramObject = b(paramObject); 
    this.e[paramInt] = paramObject;
  }
  
  private int d(Object paramObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokespecial e : (I)Ljava/lang/Object;
    //   5: dup
    //   6: astore_3
    //   7: ifnonnull -> 12
    //   10: iconst_m1
    //   11: ireturn
    //   12: aload_1
    //   13: instanceof java/lang/Integer
    //   16: ifeq -> 78
    //   19: aload_1
    //   20: dup
    //   21: astore #4
    //   23: checkcast java/lang/Integer
    //   26: invokevirtual intValue : ()I
    //   29: istore_1
    //   30: aload_3
    //   31: instanceof java/lang/Integer
    //   34: ifeq -> 55
    //   37: aload_3
    //   38: dup
    //   39: astore #4
    //   41: checkcast java/lang/Integer
    //   44: invokevirtual intValue : ()I
    //   47: istore_3
    //   48: iload_1
    //   49: iload_3
    //   50: if_icmpne -> 55
    //   53: iload_2
    //   54: ireturn
    //   55: aload_0
    //   56: getfield d : [I
    //   59: iload_2
    //   60: iaload
    //   61: dup
    //   62: istore_2
    //   63: iconst_m1
    //   64: if_icmpne -> 69
    //   67: iconst_m1
    //   68: ireturn
    //   69: aload_0
    //   70: iload_2
    //   71: invokespecial e : (I)Ljava/lang/Object;
    //   74: astore_3
    //   75: goto -> 30
    //   78: aload_1
    //   79: instanceof java/lang/String
    //   82: ifeq -> 118
    //   85: aload_1
    //   86: aload_3
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifeq -> 95
    //   93: iload_2
    //   94: ireturn
    //   95: aload_0
    //   96: getfield d : [I
    //   99: iload_2
    //   100: iaload
    //   101: dup
    //   102: istore_2
    //   103: iconst_m1
    //   104: if_icmpne -> 109
    //   107: iconst_m1
    //   108: ireturn
    //   109: aload_0
    //   110: iload_2
    //   111: invokespecial e : (I)Ljava/lang/Object;
    //   114: astore_3
    //   115: goto -> 85
    //   118: aload_1
    //   119: aload_3
    //   120: if_acmpne -> 125
    //   123: iload_2
    //   124: ireturn
    //   125: aload_0
    //   126: getfield d : [I
    //   129: iload_2
    //   130: iaload
    //   131: dup
    //   132: istore_2
    //   133: iconst_m1
    //   134: if_icmpne -> 139
    //   137: iconst_m1
    //   138: ireturn
    //   139: aload_0
    //   140: iload_2
    //   141: invokespecial e : (I)Ljava/lang/Object;
    //   144: astore_3
    //   145: goto -> 118
  }
  
  private int e(Object paramObject, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokespecial e : (I)Ljava/lang/Object;
    //   5: dup
    //   6: astore_3
    //   7: ifnonnull -> 25
    //   10: aload_0
    //   11: iload_2
    //   12: aload_1
    //   13: invokespecial e : (ILjava/lang/Object;)V
    //   16: aload_0
    //   17: getfield d : [I
    //   20: iload_2
    //   21: iconst_m1
    //   22: iastore
    //   23: iload_2
    //   24: ireturn
    //   25: aload_0
    //   26: aload_0
    //   27: dup
    //   28: getfield e : I
    //   31: iconst_1
    //   32: isub
    //   33: dup_x1
    //   34: putfield e : I
    //   37: invokespecial e : (I)Ljava/lang/Object;
    //   40: ifnonnull -> 25
    //   43: goto -> 230
    //   46: pop
    //   47: aload_0
    //   48: dup
    //   49: astore_2
    //   50: getfield d : Z
    //   53: istore_3
    //   54: aload_2
    //   55: getfield e : Z
    //   58: istore #4
    //   60: aload_2
    //   61: iconst_0
    //   62: iconst_0
    //   63: invokevirtual d : (ZZ)V
    //   66: aload_2
    //   67: getfield d : [Ljava/lang/Object;
    //   70: astore #5
    //   72: aload_2
    //   73: getfield e : [Ljava/lang/Object;
    //   76: astore #6
    //   78: aload #5
    //   80: arraylength
    //   81: istore #7
    //   83: iconst_0
    //   84: istore #8
    //   86: iload #7
    //   88: istore #9
    //   90: goto -> 116
    //   93: aload_2
    //   94: getfield d : [Ljava/lang/Object;
    //   97: iload #9
    //   99: aaload
    //   100: ifnull -> 116
    //   103: aload_2
    //   104: getfield e : [Ljava/lang/Object;
    //   107: iload #9
    //   109: aaload
    //   110: ifnull -> 116
    //   113: iinc #8, 1
    //   116: iload #9
    //   118: iinc #9, -1
    //   121: ifgt -> 93
    //   124: iconst_2
    //   125: iload #8
    //   127: invokestatic d : (I)I
    //   130: imul
    //   131: istore #8
    //   133: aload_2
    //   134: iload #8
    //   136: anewarray java/lang/Object
    //   139: putfield d : [Ljava/lang/Object;
    //   142: aload_2
    //   143: iload #8
    //   145: anewarray java/lang/Object
    //   148: putfield e : [Ljava/lang/Object;
    //   151: aload_2
    //   152: iload #8
    //   154: newarray int
    //   156: putfield d : [I
    //   159: aload_2
    //   160: iload #8
    //   162: putfield e : I
    //   165: iload #7
    //   167: istore #9
    //   169: goto -> 202
    //   172: aload #5
    //   174: iload #9
    //   176: aaload
    //   177: dup
    //   178: astore #7
    //   180: ifnull -> 202
    //   183: aload #6
    //   185: iload #9
    //   187: aaload
    //   188: dup
    //   189: astore #8
    //   191: ifnull -> 202
    //   194: aload_2
    //   195: aload #7
    //   197: aload #8
    //   199: invokevirtual d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   202: iload #9
    //   204: iinc #9, -1
    //   207: ifgt -> 172
    //   210: aload_2
    //   211: iload_3
    //   212: iload #4
    //   214: invokevirtual d : (ZZ)V
    //   217: aload_0
    //   218: aload_1
    //   219: invokespecial d : (Ljava/lang/Object;)I
    //   222: istore_2
    //   223: aload_0
    //   224: aload_1
    //   225: astore_1
    //   226: astore_0
    //   227: goto -> 0
    //   230: aload_0
    //   231: aload_3
    //   232: invokespecial d : (Ljava/lang/Object;)I
    //   235: dup
    //   236: istore_3
    //   237: iload_2
    //   238: if_icmpne -> 277
    //   241: aload_0
    //   242: aload_0
    //   243: getfield e : I
    //   246: aload_1
    //   247: invokespecial e : (ILjava/lang/Object;)V
    //   250: aload_0
    //   251: getfield d : [I
    //   254: aload_0
    //   255: getfield e : I
    //   258: aload_0
    //   259: getfield d : [I
    //   262: iload_2
    //   263: iaload
    //   264: iastore
    //   265: aload_0
    //   266: getfield d : [I
    //   269: iload_2
    //   270: aload_0
    //   271: getfield e : I
    //   274: dup_x2
    //   275: iastore
    //   276: ireturn
    //   277: aload_0
    //   278: getfield d : [Ljava/lang/Object;
    //   281: aload_0
    //   282: getfield e : I
    //   285: aload_0
    //   286: getfield d : [Ljava/lang/Object;
    //   289: iload_2
    //   290: aaload
    //   291: aastore
    //   292: aload_0
    //   293: getfield e : [Ljava/lang/Object;
    //   296: aload_0
    //   297: getfield e : I
    //   300: aload_0
    //   301: getfield e : [Ljava/lang/Object;
    //   304: iload_2
    //   305: aaload
    //   306: aastore
    //   307: aload_0
    //   308: getfield d : [I
    //   311: aload_0
    //   312: getfield e : I
    //   315: aload_0
    //   316: getfield d : [I
    //   319: iload_2
    //   320: iaload
    //   321: iastore
    //   322: aload_0
    //   323: iload_2
    //   324: aload_1
    //   325: invokespecial e : (ILjava/lang/Object;)V
    //   328: aload_0
    //   329: getfield d : [I
    //   332: iload_2
    //   333: iconst_m1
    //   334: iastore
    //   335: iload_3
    //   336: istore_1
    //   337: aload_0
    //   338: getfield d : [I
    //   341: iload_1
    //   342: iaload
    //   343: dup
    //   344: istore_3
    //   345: iload_2
    //   346: if_icmpne -> 362
    //   349: aload_0
    //   350: getfield d : [I
    //   353: iload_1
    //   354: aload_0
    //   355: getfield e : I
    //   358: iastore
    //   359: goto -> 367
    //   362: iload_3
    //   363: istore_1
    //   364: goto -> 337
    //   367: iload_2
    //   368: ireturn
    // Exception table:
    //   from	to	target	type
    //   25	43	46	java/lang/ArrayIndexOutOfBoundsException
  }
  
  private void d() {
    boolean bool1 = this.d;
    boolean bool2 = this.e;
    d(false, false);
    boolean bool3 = this.d;
    boolean bool4 = this.e;
    int i = bool3.length;
    int m = 0;
    int n = i;
    while (n-- > 0) {
      if (this.d[n] != null && this.e[n] != null)
        m++; 
    } 
    m = 2 * d(m);
    this.d = new Object[m];
    this.e = new Object[m];
    this.d = new int[m];
    this.e = m;
    n = i;
    while (n-- > 0) {
      boolean bool5;
      boolean bool6;
      if ((bool5 = bool3[n]) != null && (bool6 = bool4[n]) != null)
        d(bool5, bool6); 
    } 
    d(bool1, bool2);
  }
  
  public final void d(Object paramObject1, Object paramObject2) {
    d(paramObject1);
    int m = d(paramObject1);
    int n;
    if ((n = d(paramObject1, m)) < 0)
      n = e(paramObject1, m); 
    Object object = paramObject2;
    int i = n;
    if (((k)(paramObject1 = this)).e)
      object = paramObject1.b(object); 
    ((k)paramObject1).e[i] = object;
  }
  
  public final Object d(Object paramObject) {
    d(paramObject);
    int m = d(paramObject);
    int i;
    return ((i = d(paramObject, m)) >= 0) ? c(i) : null;
  }
  
  private static void d(Object paramObject) {
    a.d((paramObject != null), "table index is nil");
  }
  
  public final Object e(Object paramObject) {
    int i = 0;
    if (paramObject != null) {
      int m = d(paramObject);
      a.d(((i = 1 + d(paramObject, m)) > 0), "invalid key to 'next'");
    } 
    while (true) {
      if (i == this.d.length)
        return null; 
      Object object;
      if ((object = e(i)) != null && c(i) != null)
        return object; 
      i++;
    } 
  }
  
  public final int d() {
    int i = this.d.length;
    for (int m = 0; m < i; m = n) {
      int n;
      Integer integer = i.d(n = i + m + 1 >> 1);
      Object object;
      if ((object = d(integer)) == null) {
        i = n - 1;
        continue;
      } 
    } 
    return m;
  }
  
  private static int e(Object paramObject) {
    return (paramObject instanceof Integer) ? (((i = ((Integer)(object = paramObject = paramObject)).intValue()) == 0) ? 0 : paramObject.hashCode()) : ((paramObject instanceof String) ? paramObject.hashCode() : System.identityHashCode(paramObject));
  }
  
  public final void d(boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 != this.d) {
      d(this.d, paramBoolean1);
      this.d = paramBoolean1;
    } 
    if (paramBoolean2 != this.e) {
      d(this.e, paramBoolean2);
      this.e = paramBoolean2;
    } 
  }
  
  private void d(Object[] paramArrayOfObject, boolean paramBoolean) {
    for (int i = paramArrayOfObject.length - 1; i >= 0; i--) {
      Object object = paramArrayOfObject[i];
      paramArrayOfObject[i] = paramBoolean ? b(object) : c(object);
    } 
  }
  
  public final Object d(int paramInt) {
    return d(i.d(paramInt));
  }
  
  public final void d(int paramInt, Object paramObject) {
    d(i.d(paramInt), paramObject);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */