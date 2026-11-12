package com.fs.arpg;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class i {
  static final int[] d = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
  
  public g d;
  
  public short d;
  
  private int z;
  
  private byte[] d;
  
  public int d = true;
  
  private static bj d = new bj();
  
  static i d = new i();
  
  static boolean d;
  
  static int e;
  
  static int c;
  
  static int b;
  
  static int a;
  
  short e;
  
  private int h;
  
  private int g;
  
  private int f;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  public i(short paramShort) {
    this.d = true;
    this.e = -1;
    this.d = ba.d(paramShort);
  }
  
  public i(g paramg) {
    this.d = true;
    this.e = -1;
    this.d = paramg;
  }
  
  public i() {
    this.d = true;
    this.e = -1;
  }
  
  public final boolean d() {
    return (this.e >= 0);
  }
  
  public final void d() {
    this.e = -1;
    this.h = 0;
    this.g = 0;
    this.k = 0;
    this.j = 0;
    this.f = 0;
    this.i = 0;
    this.z = 0;
    this.d = null;
  }
  
  public final short d() {
    return this.d.d;
  }
  
  public final int d() {
    return this.d.d;
  }
  
  public final void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/fs/arpg/g;
    //   4: getfield d : S
    //   7: bipush #9
    //   9: if_icmplt -> 30
    //   12: aload_0
    //   13: getfield d : Lcom/fs/arpg/g;
    //   16: getfield d : S
    //   19: bipush #12
    //   21: if_icmpgt -> 30
    //   24: ldc 'Hồi_phục_dược'
    //   26: iconst_1
    //   27: invokestatic e : (Ljava/lang/String;I)V
    //   30: aload_0
    //   31: getfield d : Lcom/fs/arpg/g;
    //   34: getfield d : S
    //   37: bipush #17
    //   39: if_icmpne -> 50
    //   42: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   45: bipush #100
    //   47: putfield Y : I
    //   50: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   53: dup
    //   54: astore_1
    //   55: getfield g : I
    //   58: istore_2
    //   59: aload_1
    //   60: getfield t : I
    //   63: istore_3
    //   64: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   67: aload_0
    //   68: getfield d : Lcom/fs/arpg/g;
    //   71: getfield d : [B
    //   74: invokevirtual d : ([B)V
    //   77: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   80: invokevirtual d : ()S
    //   83: istore #4
    //   85: aload_0
    //   86: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   89: iload #4
    //   91: invokespecial d : (Lcom/fs/arpg/bj;I)V
    //   94: aload_0
    //   95: getfield z : I
    //   98: ifle -> 122
    //   101: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   104: aload_0
    //   105: getfield d : [B
    //   108: invokevirtual d : ([B)V
    //   111: aload_0
    //   112: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   115: aload_0
    //   116: getfield z : I
    //   119: invokespecial d : (Lcom/fs/arpg/bj;I)V
    //   122: aload_1
    //   123: invokevirtual j : ()V
    //   126: aload_0
    //   127: getfield d : Lcom/fs/arpg/g;
    //   130: getfield d : S
    //   133: bipush #13
    //   135: if_icmpne -> 152
    //   138: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   141: dup
    //   142: astore_1
    //   143: iconst_1
    //   144: putfield v : Z
    //   147: aload_1
    //   148: iload_2
    //   149: putfield A : I
    //   152: aload_0
    //   153: getfield d : Lcom/fs/arpg/g;
    //   156: getfield d : S
    //   159: bipush #14
    //   161: if_icmpne -> 180
    //   164: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   167: iload_3
    //   168: istore_2
    //   169: dup
    //   170: astore_1
    //   171: iconst_1
    //   172: putfield w : Z
    //   175: aload_1
    //   176: iload_2
    //   177: putfield C : I
    //   180: return
  }
  
  public final void d(i parami) {
    // Byte code:
    //   0: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   3: aload_0
    //   4: getfield d : Lcom/fs/arpg/g;
    //   7: getfield d : [B
    //   10: invokevirtual d : ([B)V
    //   13: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   16: invokevirtual d : ()S
    //   19: istore_2
    //   20: aload_0
    //   21: aload_1
    //   22: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   25: iload_2
    //   26: invokespecial d : (Lcom/fs/arpg/i;Lcom/fs/arpg/bj;I)V
    //   29: aload_0
    //   30: getfield z : I
    //   33: ifle -> 58
    //   36: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   39: aload_0
    //   40: getfield d : [B
    //   43: invokevirtual d : ([B)V
    //   46: aload_0
    //   47: aload_1
    //   48: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   51: aload_0
    //   52: getfield z : I
    //   55: invokespecial d : (Lcom/fs/arpg/i;Lcom/fs/arpg/bj;I)V
    //   58: return
  }
  
  private static void d(bj parambj) {
    byte b = parambj.d();
    Hashtable hashtable = ba.d;
    n n = n.d();
    k k = (k)(v.d()).d.d(((bc)((p)hashtable).e).d);
    for (byte b1 = 0; b1 < b; b1++) {
      short s;
      int m = (s = parambj.d()) >> 12 & 0xF;
      int j;
      if ((j = s & 0xFFF) == 0)
        j = 421; 
      v v = ((p)hashtable).d[m];
      ((p)hashtable).d[m] = (v)n.d((short)j);
      k.d[m] = (short)j;
      n.d((Image)v);
    } 
  }
  
  private static String d(bj parambj) {
    int k;
    short[] arrayOfShort = new short[k = parambj.d() & 0xFF];
    int[] arrayOfInt = new int[k];
    short s;
    for (s = 0; s < k; s++) {
      arrayOfShort[s] = parambj.d();
      arrayOfInt[s] = parambj.d();
    } 
    s = parambj.d();
    int m = parambj.d();
    int j = parambj.d() & 0xFF;
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer()).append(s).append(" ").append(j).append(" ").append(m).append(" ").append(k).append(" ");
    for (j = 0; j < k; j++) {
      stringBuffer.append(arrayOfShort[j]).append(" ");
      stringBuffer.append(arrayOfInt[j]).append(" ");
    } 
    return stringBuffer.toString();
  }
  
  private void d(bj parambj, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: iload_2
    //   4: if_icmpge -> 886
    //   7: aload_1
    //   8: invokevirtual d : ()S
    //   11: pop
    //   12: aload_1
    //   13: dup
    //   14: astore #5
    //   16: invokevirtual d : ()S
    //   19: tableswitch default -> 880, 0 -> 148, 1 -> 208, 2 -> 178, 3 -> 217, 4 -> 272, 5 -> 280, 6 -> 226, 7 -> 249, 8 -> 382, 9 -> 405, 10 -> 428, 11 -> 288, 12 -> 880, 13 -> 880, 14 -> 310, 15 -> 880, 16 -> 880, 17 -> 880, 18 -> 534, 19 -> 880, 20 -> 355, 21 -> 880, 22 -> 880, 23 -> 880, 24 -> 880, 25 -> 880, 26 -> 516, 27 -> 470, 28 -> 493
    //   148: aload #5
    //   150: invokevirtual d : ()I
    //   153: istore #5
    //   155: getstatic com/fs/arpg/ac.a : Z
    //   158: ifeq -> 167
    //   161: iload #5
    //   163: iconst_1
    //   164: ishl
    //   165: istore #5
    //   167: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   170: iload #5
    //   172: invokevirtual b : (I)V
    //   175: goto -> 880
    //   178: aload #5
    //   180: invokevirtual d : ()I
    //   183: istore #5
    //   185: getstatic com/fs/arpg/ac.a : Z
    //   188: ifeq -> 197
    //   191: iload #5
    //   193: iconst_1
    //   194: ishl
    //   195: istore #5
    //   197: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   200: iload #5
    //   202: invokevirtual a : (I)V
    //   205: goto -> 880
    //   208: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   211: invokevirtual k : ()V
    //   214: goto -> 880
    //   217: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   220: invokevirtual a_ : ()V
    //   223: goto -> 880
    //   226: aload #5
    //   228: invokevirtual d : ()I
    //   231: istore #5
    //   233: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   236: dup
    //   237: getfield K : I
    //   240: iload #5
    //   242: iadd
    //   243: putfield K : I
    //   246: goto -> 880
    //   249: aload #5
    //   251: invokevirtual d : ()I
    //   254: istore #5
    //   256: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   259: dup
    //   260: getfield L : I
    //   263: iload #5
    //   265: iadd
    //   266: putfield L : I
    //   269: goto -> 880
    //   272: aload #5
    //   274: invokestatic e : (Lcom/fs/arpg/bj;)V
    //   277: goto -> 880
    //   280: aload #5
    //   282: invokestatic c : (Lcom/fs/arpg/bj;)V
    //   285: goto -> 880
    //   288: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   291: getfield d : Lcom/fs/arpg/ao;
    //   294: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   297: invokevirtual d : (Lcom/fs/arpg/e;)V
    //   300: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   303: aconst_null
    //   304: putfield d : Lcom/fs/arpg/ao;
    //   307: goto -> 880
    //   310: aload #5
    //   312: invokevirtual d : ()Ljava/lang/String;
    //   315: astore #5
    //   317: getstatic com/fs/arpg/ba.e : Ljava/util/Hashtable;
    //   320: aload #5
    //   322: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   325: checkcast com/fs/arpg/m
    //   328: dup
    //   329: astore #6
    //   331: invokevirtual e : ()V
    //   334: aload #6
    //   336: invokevirtual z : ()V
    //   339: aload #6
    //   341: invokevirtual e : ()Z
    //   344: ifne -> 352
    //   347: aload #6
    //   349: putstatic com/fs/arpg/ba.e : Lcom/fs/arpg/m;
    //   352: goto -> 880
    //   355: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   358: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   361: getfield g : I
    //   364: invokevirtual b : (I)V
    //   367: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   370: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   373: getfield t : I
    //   376: invokevirtual a : (I)V
    //   379: goto -> 880
    //   382: aload #5
    //   384: invokevirtual d : ()I
    //   387: istore #5
    //   389: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   392: dup
    //   393: getfield M : I
    //   396: iload #5
    //   398: iadd
    //   399: putfield M : I
    //   402: goto -> 880
    //   405: aload #5
    //   407: invokevirtual d : ()I
    //   410: istore #5
    //   412: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   415: dup
    //   416: getfield N : I
    //   419: iload #5
    //   421: iadd
    //   422: putfield N : I
    //   425: goto -> 880
    //   428: aload #5
    //   430: invokevirtual d : ()I
    //   433: istore #5
    //   435: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   438: dup
    //   439: getfield O : I
    //   442: iload #5
    //   444: iadd
    //   445: putfield O : I
    //   448: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   451: getfield O : I
    //   454: bipush #100
    //   456: if_icmple -> 467
    //   459: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   462: bipush #100
    //   464: putfield O : I
    //   467: goto -> 880
    //   470: aload #5
    //   472: invokevirtual d : ()I
    //   475: istore #5
    //   477: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   480: dup
    //   481: getfield s : I
    //   484: iload #5
    //   486: iadd
    //   487: putfield s : I
    //   490: goto -> 880
    //   493: aload #5
    //   495: invokevirtual d : ()I
    //   498: istore #5
    //   500: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   503: dup
    //   504: getfield r : I
    //   507: iload #5
    //   509: iadd
    //   510: putfield r : I
    //   513: goto -> 880
    //   516: aload #5
    //   518: invokevirtual d : ()I
    //   521: istore #5
    //   523: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   526: iload #5
    //   528: putfield Y : I
    //   531: goto -> 880
    //   534: aload #5
    //   536: dup
    //   537: astore #4
    //   539: invokevirtual d : ()B
    //   542: sipush #255
    //   545: iand
    //   546: dup
    //   547: istore #5
    //   549: newarray short
    //   551: astore #6
    //   553: iload #5
    //   555: newarray int
    //   557: astore #7
    //   559: iconst_0
    //   560: istore #8
    //   562: iload #8
    //   564: iload #5
    //   566: if_icmpge -> 595
    //   569: aload #6
    //   571: iload #8
    //   573: aload #4
    //   575: invokevirtual d : ()S
    //   578: sastore
    //   579: aload #7
    //   581: iload #8
    //   583: aload #4
    //   585: invokevirtual d : ()S
    //   588: iastore
    //   589: iinc #8, 1
    //   592: goto -> 562
    //   595: aload #4
    //   597: invokevirtual d : ()S
    //   600: istore #8
    //   602: aload #4
    //   604: invokevirtual d : ()I
    //   607: istore #9
    //   609: aload #4
    //   611: invokevirtual d : ()B
    //   614: sipush #255
    //   617: iand
    //   618: invokestatic d : (I)Z
    //   621: istore #4
    //   623: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   626: dup
    //   627: getfield W : I
    //   630: iload #9
    //   632: isub
    //   633: putfield W : I
    //   636: aconst_null
    //   637: astore #9
    //   639: iconst_0
    //   640: istore #10
    //   642: iconst_0
    //   643: istore #11
    //   645: iload #11
    //   647: iload #5
    //   649: if_icmpge -> 744
    //   652: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   655: aload #6
    //   657: iload #11
    //   659: saload
    //   660: invokevirtual d : (S)Lcom/fs/arpg/i;
    //   663: astore #9
    //   665: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   668: aload #9
    //   670: getfield d : Lcom/fs/arpg/g;
    //   673: iconst_1
    //   674: invokevirtual d : (Lcom/fs/arpg/g;I)Z
    //   677: ifeq -> 683
    //   680: iconst_1
    //   681: istore #10
    //   683: iload #4
    //   685: ifne -> 717
    //   688: aload #9
    //   690: getfield d : Lcom/fs/arpg/g;
    //   693: getfield d : B
    //   696: bipush #9
    //   698: if_icmpne -> 717
    //   701: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   704: aload #6
    //   706: iload #11
    //   708: saload
    //   709: aload #7
    //   711: iload #11
    //   713: iaload
    //   714: invokevirtual e : (SI)V
    //   717: iload #4
    //   719: ifeq -> 738
    //   722: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   725: aload #6
    //   727: iload #11
    //   729: saload
    //   730: aload #7
    //   732: iload #11
    //   734: iaload
    //   735: invokevirtual e : (SI)V
    //   738: iinc #11, 1
    //   741: goto -> 645
    //   744: iload #4
    //   746: ifeq -> 880
    //   749: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   752: iload #8
    //   754: invokevirtual d : (S)V
    //   757: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   760: iload #8
    //   762: invokevirtual d : (S)Lcom/fs/arpg/i;
    //   765: dup
    //   766: astore #11
    //   768: aload #9
    //   770: getfield e : S
    //   773: putfield e : S
    //   776: aload #11
    //   778: aload #9
    //   780: getfield h : I
    //   783: putfield h : I
    //   786: aload #11
    //   788: aload #9
    //   790: getfield g : I
    //   793: putfield g : I
    //   796: aload #11
    //   798: aload #9
    //   800: getfield i : I
    //   803: putfield i : I
    //   806: aload #11
    //   808: aload #9
    //   810: getfield f : I
    //   813: putfield f : I
    //   816: aload #11
    //   818: aload #9
    //   820: getfield k : I
    //   823: putfield k : I
    //   826: aload #11
    //   828: aload #9
    //   830: getfield j : I
    //   833: putfield j : I
    //   836: iload #10
    //   838: ifeq -> 880
    //   841: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   844: getfield d : [Lcom/fs/arpg/i;
    //   847: aload #9
    //   849: getfield d : Lcom/fs/arpg/g;
    //   852: getfield d : B
    //   855: iconst_1
    //   856: isub
    //   857: aload #11
    //   859: aastore
    //   860: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   863: getfield d : [Lcom/fs/arpg/i;
    //   866: aload #9
    //   868: getfield d : Lcom/fs/arpg/g;
    //   871: getfield d : B
    //   874: iconst_1
    //   875: isub
    //   876: aaload
    //   877: invokevirtual c : ()V
    //   880: iinc #3, 1
    //   883: goto -> 2
    //   886: return
  }
  
  private void d(i parami, bj parambj, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      bj bj1;
      int j;
      i i2;
      ao ao1;
      ao ao2;
      parambj.d();
      i i3 = parami;
      bj bj2 = parambj;
      i i1 = this;
      short s = bj2.d();
      i3.e = i1.d.d;
      switch (s) {
        case 12:
          i2 = i3;
          bj1 = bj2;
          try {
            (ao2 = new ao()).d(bj1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream;
            (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeShort(0);
            dataOutputStream.writeShort(12);
            ao2 = ao2;
            dataOutputStream.writeByte(ao2.d);
            switch (ao2.d) {
              case 0:
                ao2.d = 0;
                break;
              case 1:
                dataOutputStream.writeShort(ao2.b);
                dataOutputStream.writeShort(ao2.e * 100);
                dataOutputStream.writeByte(ao2.c);
                break;
              case 2:
                dataOutputStream.writeShort(ao2.b);
                dataOutputStream.writeShort(ao2.e * 100);
                dataOutputStream.writeByte(ao2.c);
                break;
              case 3:
                dataOutputStream.writeShort(ao2.e * 100);
                dataOutputStream.writeByte(ao2.c);
                break;
              case 4:
                dataOutputStream.writeShort(ao2.e);
                dataOutputStream.writeShort(ao2.b);
                dataOutputStream.writeByte(ao2.c);
                break;
              case 5:
                dataOutputStream.writeByte(ao2.b);
                dataOutputStream.writeByte(ao2.c);
                break;
              case 6:
                ao2.e = 3;
                dataOutputStream.writeShort(ao2.b);
                dataOutputStream.writeShort(ao2.a);
                dataOutputStream.writeByte(ao2.c);
                break;
            } 
            i2.z = 1;
            i2.d = byteArrayOutputStream.toByteArray();
          } catch (Exception exception) {}
          break;
        case 23:
          i2.d();
          break;
        case 3:
          ((p)ba.d).q = ((p)ba.d).t;
          break;
        case 6:
          ao1 = ao2;
          j = i2.d();
          ((i)ao1).h += j * ao1.d()[0] / 100;
          break;
        case 7:
          ao1 = ao2;
          j = ao1.d();
          ((i)ao1).g += j;
          break;
        case 4:
          e((bj)ao1);
          break;
        case 5:
          c((bj)ao1);
          break;
        case 8:
          ao1 = ao2;
          j = ao1.d();
          ((i)ao1).f += j;
          break;
        case 10:
          ao1 = ao2;
          j = ao1.d();
          ((i)ao1).i += j;
          if (((i)ao1).i > 100)
            ((i)ao1).i = 100; 
          break;
        case 27:
          ao1 = ao2;
          j = ao1.d();
          ((i)ao1).j += j;
          break;
        case 21:
          ao1 = ao2;
          j = ao1.d();
          ((i)ao1).l = j;
          break;
        case 28:
          ao1 = ao2;
          j = ao1.d();
          ((i)ao1).k += j;
          break;
      } 
    } 
  }
  
  public final int[] d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : S
    //   4: istore_1
    //   5: aload_0
    //   6: iconst_1
    //   7: putfield d : S
    //   10: bipush #7
    //   12: newarray int
    //   14: astore_2
    //   15: aload_0
    //   16: aload_2
    //   17: astore #4
    //   19: astore_3
    //   20: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   23: aload_3
    //   24: getfield d : Lcom/fs/arpg/g;
    //   27: getfield d : [B
    //   30: invokevirtual d : ([B)V
    //   33: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   36: invokevirtual d : ()S
    //   39: istore #5
    //   41: aload_3
    //   42: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   45: iload #5
    //   47: aload #4
    //   49: invokespecial d : (Lcom/fs/arpg/bj;I[I)V
    //   52: aload_0
    //   53: getfield z : I
    //   56: ifle -> 81
    //   59: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   62: aload_0
    //   63: getfield d : [B
    //   66: invokevirtual d : ([B)V
    //   69: aload_0
    //   70: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   73: aload_0
    //   74: getfield z : I
    //   77: aload_2
    //   78: invokespecial d : (Lcom/fs/arpg/bj;I[I)V
    //   81: aload_0
    //   82: iload_1
    //   83: putfield d : S
    //   86: aload_2
    //   87: areturn
  }
  
  private void d(bj parambj, int paramInt, int[] paramArrayOfint) {
    for (byte b = 0; b < paramInt; b++) {
      short s = parambj.d();
      d(parambj, paramArrayOfint, s);
    } 
  }
  
  private void d(bj parambj, int[] paramArrayOfint, int paramInt) {
    i i1;
    bj bj1;
    int[] arrayOfInt;
    int j;
    boolean bool;
    byte b1;
    byte b;
    byte b2;
    int k;
    switch (parambj.d()) {
      case 4:
        j = parambj.d();
        paramArrayOfint[2] = paramArrayOfint[2] + j;
        return;
      case 5:
        j = parambj.d();
        paramArrayOfint[3] = paramArrayOfint[3] + j;
        return;
      case 6:
        j = parambj.d();
        paramArrayOfint[0] = paramArrayOfint[0] + j;
        return;
      case 7:
        j = parambj.d();
        paramArrayOfint[1] = paramArrayOfint[1] + j;
        return;
      case 8:
        j = parambj.d();
        paramArrayOfint[5] = paramArrayOfint[5] + j;
        return;
      case 9:
        j = parambj.d();
        paramArrayOfint[4] = paramArrayOfint[4] + j;
        return;
      case 10:
        j = parambj.d();
        paramArrayOfint[6] = paramArrayOfint[6] + j;
        return;
      case 15:
        arrayOfInt = paramArrayOfint;
        bj1 = parambj;
        bool = (i1 = this).d;
        b = bj1.d();
        if (bool >= b)
          b1 = b; 
        for (b2 = 1; b2 < b1; b2++) {
          short s = bj1.d();
          bj1.d(s);
        } 
        bj1.d();
        bj1.d();
        bj1.d();
        bj1.d();
        b2 = bj1.d();
        for (k = 0; k < b2; k++) {
          short s = bj1.d();
          i1.d(bj1, arrayOfInt, s);
        } 
        for (k = b1 + 1; k < b; k++) {
          short s = bj1.d();
          bj1.d(s);
        } 
        return;
    } 
    i1.d(arrayOfInt - 2);
  }
  
  public final void c() {
    // Byte code:
    //   0: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   3: aload_0
    //   4: getfield d : Lcom/fs/arpg/g;
    //   7: getfield d : [B
    //   10: invokevirtual d : ([B)V
    //   13: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   16: invokevirtual d : ()S
    //   19: istore_1
    //   20: aload_0
    //   21: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   24: iload_1
    //   25: invokespecial e : (Lcom/fs/arpg/bj;I)V
    //   28: aload_0
    //   29: getfield z : I
    //   32: ifle -> 56
    //   35: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   38: aload_0
    //   39: getfield d : [B
    //   42: invokevirtual d : ([B)V
    //   45: aload_0
    //   46: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   49: aload_0
    //   50: getfield z : I
    //   53: invokespecial e : (Lcom/fs/arpg/bj;I)V
    //   56: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   59: dup
    //   60: astore_1
    //   61: dup
    //   62: getfield C : I
    //   65: aload_0
    //   66: getfield h : I
    //   69: iadd
    //   70: putfield C : I
    //   73: aload_1
    //   74: dup
    //   75: getfield Z : I
    //   78: aload_0
    //   79: getfield g : I
    //   82: iadd
    //   83: putfield Z : I
    //   86: aload_1
    //   87: dup
    //   88: getfield D : I
    //   91: aload_0
    //   92: getfield f : I
    //   95: iadd
    //   96: putfield D : I
    //   99: aload_1
    //   100: dup
    //   101: getfield r : I
    //   104: aload_0
    //   105: getfield k : I
    //   108: iconst_5
    //   109: idiv
    //   110: iconst_1
    //   111: ishl
    //   112: iadd
    //   113: putfield r : I
    //   116: aload_1
    //   117: dup
    //   118: getfield s : I
    //   121: aload_0
    //   122: getfield j : I
    //   125: iadd
    //   126: putfield s : I
    //   129: aload_1
    //   130: dup
    //   131: getfield H : I
    //   134: aload_0
    //   135: getfield l : I
    //   138: iadd
    //   139: putfield H : I
    //   142: aload_1
    //   143: getfield D : I
    //   146: bipush #100
    //   148: if_icmple -> 157
    //   151: aload_1
    //   152: bipush #100
    //   154: putfield D : I
    //   157: aload_1
    //   158: dup
    //   159: getfield G : I
    //   162: aload_0
    //   163: getfield i : I
    //   166: iadd
    //   167: putfield G : I
    //   170: aload_1
    //   171: getfield G : I
    //   174: bipush #100
    //   176: if_icmple -> 185
    //   179: aload_1
    //   180: bipush #100
    //   182: putfield G : I
    //   185: aload_1
    //   186: getfield r : I
    //   189: bipush #80
    //   191: if_icmple -> 200
    //   194: aload_1
    //   195: bipush #80
    //   197: putfield r : I
    //   200: aload_1
    //   201: getfield H : I
    //   204: iconst_5
    //   205: if_icmple -> 213
    //   208: aload_1
    //   209: iconst_5
    //   210: putfield H : I
    //   213: aload_1
    //   214: getfield s : I
    //   217: bipush #10
    //   219: if_icmple -> 228
    //   222: aload_1
    //   223: bipush #10
    //   225: putfield s : I
    //   228: return
  }
  
  public final boolean e() {
    return d(this.d.d);
  }
  
  public static boolean d(int paramInt) {
    return (paramInt == 0 || paramInt == 8 || paramInt == 9 || paramInt == 7);
  }
  
  public static boolean d(short paramShort) {
    return (paramShort >= 13 && paramShort <= 16);
  }
  
  public static boolean e(short paramShort) {
    return (paramShort >= 9 && paramShort <= 12);
  }
  
  public final boolean c() {
    // Byte code:
    //   0: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   3: aload_0
    //   4: getfield d : Lcom/fs/arpg/g;
    //   7: getfield d : [B
    //   10: invokevirtual d : ([B)V
    //   13: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   16: invokevirtual d : ()S
    //   19: istore_1
    //   20: iconst_0
    //   21: istore_2
    //   22: iload_2
    //   23: iload_1
    //   24: if_icmpge -> 82
    //   27: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   30: invokevirtual d : ()S
    //   33: istore_3
    //   34: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   37: invokevirtual d : ()S
    //   40: bipush #15
    //   42: if_icmpeq -> 57
    //   45: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   48: iload_3
    //   49: iconst_2
    //   50: isub
    //   51: invokevirtual d : (I)V
    //   54: goto -> 76
    //   57: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   60: invokevirtual d : ()B
    //   63: istore_1
    //   64: aload_0
    //   65: getfield d : S
    //   68: iload_1
    //   69: if_icmplt -> 74
    //   72: iconst_0
    //   73: ireturn
    //   74: iconst_1
    //   75: ireturn
    //   76: iinc #2, 1
    //   79: goto -> 22
    //   82: iconst_0
    //   83: ireturn
  }
  
  private void e(bj parambj, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      parambj.d();
      a(parambj);
    } 
  }
  
  public final void b() {
    // Byte code:
    //   0: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   3: aload_0
    //   4: getfield d : Lcom/fs/arpg/g;
    //   7: getfield d : [B
    //   10: invokevirtual d : ([B)V
    //   13: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   16: invokevirtual d : ()S
    //   19: istore_1
    //   20: aload_0
    //   21: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   24: iload_1
    //   25: invokespecial c : (Lcom/fs/arpg/bj;I)V
    //   28: aload_0
    //   29: getfield z : I
    //   32: ifle -> 60
    //   35: new com/fs/arpg/bj
    //   38: dup
    //   39: aload_0
    //   40: getfield d : [B
    //   43: invokespecial <init> : ([B)V
    //   46: putstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   49: aload_0
    //   50: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   53: aload_0
    //   54: getfield z : I
    //   57: invokespecial c : (Lcom/fs/arpg/bj;I)V
    //   60: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   63: dup
    //   64: astore_1
    //   65: dup
    //   66: getfield C : I
    //   69: aload_0
    //   70: getfield h : I
    //   73: isub
    //   74: putfield C : I
    //   77: aload_1
    //   78: dup
    //   79: getfield Z : I
    //   82: aload_0
    //   83: getfield g : I
    //   86: isub
    //   87: putfield Z : I
    //   90: aload_1
    //   91: dup
    //   92: getfield r : I
    //   95: aload_0
    //   96: getfield k : I
    //   99: iconst_5
    //   100: idiv
    //   101: iconst_1
    //   102: ishl
    //   103: isub
    //   104: putfield r : I
    //   107: aload_1
    //   108: dup
    //   109: getfield s : I
    //   112: aload_0
    //   113: getfield j : I
    //   116: isub
    //   117: putfield s : I
    //   120: aload_1
    //   121: dup
    //   122: getfield D : I
    //   125: aload_0
    //   126: getfield f : I
    //   129: isub
    //   130: putfield D : I
    //   133: aload_1
    //   134: dup
    //   135: getfield H : I
    //   138: aload_0
    //   139: getfield l : I
    //   142: isub
    //   143: putfield H : I
    //   146: aload_1
    //   147: dup
    //   148: getfield G : I
    //   151: aload_0
    //   152: getfield i : I
    //   155: isub
    //   156: putfield G : I
    //   159: aload_1
    //   160: getfield D : I
    //   163: ifge -> 171
    //   166: aload_1
    //   167: iconst_0
    //   168: putfield D : I
    //   171: aload_1
    //   172: getfield H : I
    //   175: ifge -> 183
    //   178: aload_1
    //   179: iconst_0
    //   180: putfield H : I
    //   183: aload_1
    //   184: getfield r : I
    //   187: ifge -> 195
    //   190: aload_1
    //   191: iconst_0
    //   192: putfield r : I
    //   195: aload_1
    //   196: getfield s : I
    //   199: ifge -> 207
    //   202: aload_1
    //   203: iconst_0
    //   204: putfield s : I
    //   207: aload_1
    //   208: getfield G : I
    //   211: ifge -> 219
    //   214: aload_1
    //   215: iconst_0
    //   216: putfield G : I
    //   219: return
  }
  
  private void c(bj parambj, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      parambj.d();
      z(parambj);
    } 
  }
  
  public final String d() {
    // Byte code:
    //   0: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   3: aload_0
    //   4: getfield d : Lcom/fs/arpg/g;
    //   7: getfield d : [B
    //   10: invokevirtual d : ([B)V
    //   13: new java/lang/StringBuffer
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore_1
    //   21: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   24: invokevirtual d : ()S
    //   27: istore_2
    //   28: aload_0
    //   29: getstatic com/fs/arpg/i.d : Lcom/fs/arpg/bj;
    //   32: iload_2
    //   33: aload_1
    //   34: invokespecial d : (Lcom/fs/arpg/bj;ILjava/lang/StringBuffer;)V
    //   37: aload_1
    //   38: invokevirtual toString : ()Ljava/lang/String;
    //   41: areturn
  }
  
  private void d(bj parambj, int paramInt, StringBuffer paramStringBuffer) {
    int j = paramInt - 1;
    for (byte b = 0; b < paramInt; b++) {
      short s = parambj.d();
      String str;
      if ((str = d(parambj, s)) != null) {
        paramStringBuffer.append(str);
        if (str.length() > 0 && b != j)
          paramStringBuffer.append(" "); 
      } 
    } 
  }
  
  public final void d(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeShort(this.d.d);
    paramDataOutputStream.writeShort(this.d);
    paramDataOutputStream.writeInt(this.d);
    if (this.d != null) {
      paramDataOutputStream.writeBoolean(true);
      paramDataOutputStream.writeShort(this.z);
      paramDataOutputStream.writeShort(this.d.length);
      paramDataOutputStream.write(this.d);
    } else {
      paramDataOutputStream.writeBoolean(false);
    } 
    paramDataOutputStream.writeShort(this.e);
    paramDataOutputStream.writeShort(this.h);
    paramDataOutputStream.writeShort(this.i);
    paramDataOutputStream.writeShort(this.f);
    paramDataOutputStream.writeShort(this.g);
    paramDataOutputStream.writeShort(this.k);
    paramDataOutputStream.writeByte(this.j);
    paramDataOutputStream.writeByte(this.l);
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    short s = paramDataInputStream.readShort();
    short s1 = s;
    DataInputStream dataInputStream = paramDataInputStream;
    i i1;
    (i1 = this).d = ba.d(s1);
    i1.d = dataInputStream.readShort();
    i1.d = dataInputStream.readInt();
    if (dataInputStream.readBoolean()) {
      i1.z = dataInputStream.readShort();
      s1 = dataInputStream.readShort();
      i1.d = new byte[s1];
      dataInputStream.readFully(i1.d);
    } 
    i1.e = dataInputStream.readShort();
    i1.h = dataInputStream.readShort();
    i1.i = dataInputStream.readShort();
    i1.f = dataInputStream.readShort();
    i1.g = dataInputStream.readShort();
    i1.k = dataInputStream.readShort();
    i1.j = dataInputStream.readByte() & 0xFF;
    i1.l = dataInputStream.readByte() & 0xFF;
  }
  
  private String d(bj parambj, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual d : ()S
    //   4: istore_3
    //   5: aload_0
    //   6: aload_1
    //   7: iload_3
    //   8: iload_2
    //   9: istore #4
    //   11: istore_3
    //   12: astore_2
    //   13: astore_1
    //   14: iload_3
    //   15: tableswitch default -> 519, 0 -> 147, 1 -> 169, 2 -> 172, 3 -> 194, 4 -> 197, 5 -> 219, 6 -> 241, 7 -> 263, 8 -> 285, 9 -> 307, 10 -> 329, 11 -> 373, 12 -> 144, 13 -> 351, 14 -> 376, 15 -> 387, 16 -> 519, 17 -> 519, 18 -> 514, 19 -> 394, 20 -> 384, 21 -> 426, 22 -> 519, 23 -> 492, 24 -> 519, 25 -> 519, 26 -> 470, 27 -> 404, 28 -> 448
    //   144: ldc ''
    //   146: areturn
    //   147: aload_2
    //   148: invokevirtual d : ()I
    //   151: istore_1
    //   152: new java/lang/StringBuffer
    //   155: dup
    //   156: ldc '+Sinh_mệnh '
    //   158: invokespecial <init> : (Ljava/lang/String;)V
    //   161: iload_1
    //   162: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   165: invokevirtual toString : ()Ljava/lang/String;
    //   168: areturn
    //   169: ldc 'Đầy_sinh_mệnh '
    //   171: areturn
    //   172: aload_2
    //   173: invokevirtual d : ()I
    //   176: istore_1
    //   177: new java/lang/StringBuffer
    //   180: dup
    //   181: ldc '+Chân_khí '
    //   183: invokespecial <init> : (Ljava/lang/String;)V
    //   186: iload_1
    //   187: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   190: invokevirtual toString : ()Ljava/lang/String;
    //   193: areturn
    //   194: ldc 'Đầy_chân_khí '
    //   196: areturn
    //   197: aload_2
    //   198: invokevirtual d : ()I
    //   201: istore_1
    //   202: new java/lang/StringBuffer
    //   205: dup
    //   206: ldc 'Max_sinh_mệnh '
    //   208: invokespecial <init> : (Ljava/lang/String;)V
    //   211: iload_1
    //   212: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: areturn
    //   219: aload_2
    //   220: invokevirtual d : ()I
    //   223: istore_1
    //   224: new java/lang/StringBuffer
    //   227: dup
    //   228: ldc '+Chân_khí '
    //   230: invokespecial <init> : (Ljava/lang/String;)V
    //   233: iload_1
    //   234: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   237: invokevirtual toString : ()Ljava/lang/String;
    //   240: areturn
    //   241: aload_2
    //   242: invokevirtual d : ()I
    //   245: istore_1
    //   246: new java/lang/StringBuffer
    //   249: dup
    //   250: ldc 'Công_kích '
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: iload_1
    //   256: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   259: invokevirtual toString : ()Ljava/lang/String;
    //   262: areturn
    //   263: aload_2
    //   264: invokevirtual d : ()I
    //   267: istore_1
    //   268: new java/lang/StringBuffer
    //   271: dup
    //   272: ldc 'Phòng_ngự '
    //   274: invokespecial <init> : (Ljava/lang/String;)V
    //   277: iload_1
    //   278: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   281: invokevirtual toString : ()Ljava/lang/String;
    //   284: areturn
    //   285: aload_2
    //   286: invokevirtual d : ()I
    //   289: istore_1
    //   290: new java/lang/StringBuffer
    //   293: dup
    //   294: ldc '+Bạo_kích '
    //   296: invokespecial <init> : (Ljava/lang/String;)V
    //   299: iload_1
    //   300: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   303: invokevirtual toString : ()Ljava/lang/String;
    //   306: areturn
    //   307: aload_2
    //   308: invokevirtual d : ()I
    //   311: istore_1
    //   312: new java/lang/StringBuffer
    //   315: dup
    //   316: ldc '+Trúng_đích '
    //   318: invokespecial <init> : (Ljava/lang/String;)V
    //   321: iload_1
    //   322: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   325: invokevirtual toString : ()Ljava/lang/String;
    //   328: areturn
    //   329: aload_2
    //   330: invokevirtual d : ()I
    //   333: istore_1
    //   334: new java/lang/StringBuffer
    //   337: dup
    //   338: ldc '+Né_tránh '
    //   340: invokespecial <init> : (Ljava/lang/String;)V
    //   343: iload_1
    //   344: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   347: invokevirtual toString : ()Ljava/lang/String;
    //   350: areturn
    //   351: aload_2
    //   352: invokevirtual d : ()I
    //   355: istore_1
    //   356: new java/lang/StringBuffer
    //   359: dup
    //   360: ldc '+Tốc_độ '
    //   362: invokespecial <init> : (Ljava/lang/String;)V
    //   365: iload_1
    //   366: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   369: invokevirtual toString : ()Ljava/lang/String;
    //   372: areturn
    //   373: ldc 'Thanh trừ trạng thái bất lương của nhân vật'
    //   375: areturn
    //   376: aload_2
    //   377: invokevirtual d : ()Ljava/lang/String;
    //   380: pop
    //   381: goto -> 519
    //   384: ldc 'Hồi_sinh'
    //   386: areturn
    //   387: aload_1
    //   388: aload_2
    //   389: iconst_2
    //   390: invokespecial e : (Lcom/fs/arpg/bj;I)Ljava/lang/String;
    //   393: areturn
    //   394: aload_2
    //   395: iload #4
    //   397: iconst_2
    //   398: isub
    //   399: invokevirtual d : (I)V
    //   402: aconst_null
    //   403: areturn
    //   404: aload_2
    //   405: invokevirtual d : ()I
    //   408: istore_1
    //   409: new java/lang/StringBuffer
    //   412: dup
    //   413: ldc 'Chân_khí_khôi_phục '
    //   415: invokespecial <init> : (Ljava/lang/String;)V
    //   418: iload_1
    //   419: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   422: invokevirtual toString : ()Ljava/lang/String;
    //   425: areturn
    //   426: aload_2
    //   427: invokevirtual d : ()I
    //   430: istore_1
    //   431: new java/lang/StringBuffer
    //   434: dup
    //   435: ldc '+Khôi_phục_thần_lực '
    //   437: invokespecial <init> : (Ljava/lang/String;)V
    //   440: iload_1
    //   441: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   444: invokevirtual toString : ()Ljava/lang/String;
    //   447: areturn
    //   448: aload_2
    //   449: invokevirtual d : ()I
    //   452: istore_1
    //   453: new java/lang/StringBuffer
    //   456: dup
    //   457: ldc 'Rơi_bảo_+ '
    //   459: invokespecial <init> : (Ljava/lang/String;)V
    //   462: iload_1
    //   463: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   466: invokevirtual toString : ()Ljava/lang/String;
    //   469: areturn
    //   470: aload_2
    //   471: invokevirtual d : ()I
    //   474: istore_1
    //   475: new java/lang/StringBuffer
    //   478: dup
    //   479: ldc '+Thần_lực '
    //   481: invokespecial <init> : (Ljava/lang/String;)V
    //   484: iload_1
    //   485: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   488: invokevirtual toString : ()Ljava/lang/String;
    //   491: areturn
    //   492: aload_2
    //   493: invokevirtual d : ()I
    //   496: istore_1
    //   497: new java/lang/StringBuffer
    //   500: dup
    //   501: ldc '+Linh_lực '
    //   503: invokespecial <init> : (Ljava/lang/String;)V
    //   506: iload_1
    //   507: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   510: invokevirtual toString : ()Ljava/lang/String;
    //   513: areturn
    //   514: aload_2
    //   515: invokestatic d : (Lcom/fs/arpg/bj;)Ljava/lang/String;
    //   518: areturn
    //   519: ldc ''
    //   521: areturn
  }
  
  private static void e(bj parambj) {
    int j = parambj.d();
    ((p)ba.d).E += j;
  }
  
  private static void c(bj parambj) {
    int j = parambj.d();
    ((p)ba.d).J += j;
  }
  
  private static void d(bj parambj, i parami) {
    try {
      ao ao;
      (ao = new ao()).d(parambj);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream;
      (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeShort(0);
      dataOutputStream.writeShort(12);
      ao = ao;
      dataOutputStream.writeByte(ao.d);
      switch (ao.d) {
        case 0:
          ao.d = 0;
          break;
        case 1:
          dataOutputStream.writeShort(ao.b);
          dataOutputStream.writeShort(ao.e * 100);
          dataOutputStream.writeByte(ao.c);
          break;
        case 2:
          dataOutputStream.writeShort(ao.b);
          dataOutputStream.writeShort(ao.e * 100);
          dataOutputStream.writeByte(ao.c);
          break;
        case 3:
          dataOutputStream.writeShort(ao.e * 100);
          dataOutputStream.writeByte(ao.c);
          break;
        case 4:
          dataOutputStream.writeShort(ao.e);
          dataOutputStream.writeShort(ao.b);
          dataOutputStream.writeByte(ao.c);
          break;
        case 5:
          dataOutputStream.writeByte(ao.b);
          dataOutputStream.writeByte(ao.c);
          break;
        case 6:
          ao.e = 3;
          dataOutputStream.writeShort(ao.b);
          dataOutputStream.writeShort(ao.a);
          dataOutputStream.writeByte(ao.c);
          break;
      } 
      parami.z = 1;
      parami.d = byteArrayOutputStream.toByteArray();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void b(bj parambj) {
    e(parambj, 0);
  }
  
  private String e(bj parambj, int paramInt) {
    byte b1;
    boolean bool = this.d;
    byte b = parambj.d();
    if (bool >= b)
      b1 = b; 
    byte b2;
    for (b2 = 1; b2 < b1; b2++) {
      short s = parambj.d();
      parambj.d(s);
    } 
    parambj.d();
    parambj.d();
    parambj.d();
    parambj.d();
    b2 = parambj.d();
    StringBuffer stringBuffer = new StringBuffer();
    int j;
    for (j = 0; j < b2; j++) {
      String str;
      short s = parambj.d();
      switch (paramInt) {
        case 0:
          a(parambj);
          break;
        case 1:
          z(parambj);
          break;
        case 2:
          if ((str = d(parambj, s)) != null) {
            stringBuffer.append(str);
            if (j != b2 - 1)
              stringBuffer.append(" "); 
          } 
          break;
      } 
    } 
    for (j = b1 + 1; j < b; j++) {
      short s = parambj.d();
      parambj.d(s);
    } 
    return stringBuffer.toString();
  }
  
  private void a(bj parambj) {
    int k;
    ao ao;
    int j;
    short s = parambj.d();
    System.out.println("effectType=" + s);
    switch (s) {
      case 25:
        k = parambj.d();
        ((p)ba.d).Q = k;
        return;
      case 24:
        k = parambj.d();
        ((p)ba.d).P = k;
        return;
      case 4:
        k = parambj.d();
        ((p)ba.d).B += k;
        return;
      case 5:
        k = parambj.d();
        ((p)ba.d).A += k;
        return;
      case 6:
        k = parambj.d();
        ((p)ba.d).C += k;
        return;
      case 7:
        k = parambj.d();
        ((p)ba.d).Z += k;
        return;
      case 8:
        k = parambj.d();
        ((p)ba.d).D += k;
        return;
      case 9:
        k = parambj.d();
        ((p)ba.d).F += k;
        return;
      case 10:
        k = parambj.d();
        ((p)ba.d).G += k;
        return;
      case 13:
        k = parambj.d();
        ba.d.d().d(k);
        ((p)ba.d).d.d((e)ba.d);
        ((p)ba.d).I += k;
        return;
      case 27:
        k = parambj.d();
        ((p)ba.d).s += k;
        return;
      case 28:
        k = parambj.d();
        ((p)ba.d).r += k;
        return;
      case 12:
        (ao = new ao()).d(parambj);
        ((p)ba.d).e = (i)ao;
        return;
      case 19:
        d(parambj);
        return;
      case 15:
        b(parambj);
        return;
      case 22:
        j = parambj.d();
        ((p)ba.d).y += j;
        return;
    } 
    throw new RuntimeException("Không tìm được vật phẩm thích hợp:" + this.d.d + ";Hiệu_quả =" + j + ";name=" + new String(this.d.e));
  }
  
  private void z(bj parambj) {
    int j;
    bj bj1;
    switch (parambj.d()) {
      case 25:
        parambj.d();
        ((p)ba.d).Q = 0;
        return;
      case 24:
        parambj.d();
        ((p)ba.d).P = 0;
        return;
      case 4:
        j = parambj.d();
        ((p)ba.d).B -= j;
        return;
      case 5:
        j = parambj.d();
        ((p)ba.d).A -= j;
        return;
      case 6:
        j = parambj.d();
        ((p)ba.d).C -= j;
        return;
      case 12:
        (new ao()).d(parambj);
        ((p)ba.d).e = null;
        return;
      case 7:
        j = parambj.d();
        ((p)ba.d).Z -= j;
        return;
      case 8:
        j = parambj.d();
        ((p)ba.d).D -= j;
        return;
      case 9:
        j = parambj.d();
        ((p)ba.d).F -= j;
        return;
      case 27:
        j = parambj.d();
        ((p)ba.d).s -= j;
        return;
      case 28:
        j = parambj.d();
        ((p)ba.d).r -= j;
        return;
      case 10:
        j = parambj.d();
        ((p)ba.d).G -= j;
        return;
      case 13:
        j = parambj.d();
        ba.d.d().d(j);
        ((p)ba.d).d.d((e)ba.d);
        ((p)ba.d).I -= j;
        return;
      case 22:
        j = parambj.d();
        ((p)ba.d).y -= j;
        return;
      case 19:
        j = parambj.d();
        parambj.d(j << 1);
        return;
      case 15:
        e(bj1 = parambj, 1);
        return;
    } 
  }
  
  static int d(int paramInt) {
    switch (paramInt) {
      case 0:
        return 11856577;
      case 1:
        return 10218496;
      case 2:
        return 1220095;
      case 3:
        return 13177599;
      case 4:
        return 16682253;
    } 
    return 16195869;
  }
  
  static {
    (new int[5])[0] = 4;
    (new int[5])[1] = 5;
    (new int[5])[2] = 8;
    (new int[5])[3] = 9;
    (new int[5])[4] = 10;
    (new byte[4])[0] = 0;
    (new byte[4])[1] = 0;
    (new byte[4])[2] = 0;
    (new byte[4])[3] = 35;
    (new byte[5][])[0] = new byte[4];
    (new byte[4])[0] = 0;
    (new byte[4])[1] = 0;
    (new byte[4])[2] = 0;
    (new byte[4])[3] = 15;
    (new byte[5][])[1] = new byte[4];
    (new byte[4])[0] = 0;
    (new byte[4])[1] = 0;
    (new byte[4])[2] = 0;
    (new byte[4])[3] = 1;
    (new byte[5][])[2] = new byte[4];
    (new byte[4])[0] = 0;
    (new byte[4])[1] = 0;
    (new byte[4])[2] = 0;
    (new byte[4])[3] = 1;
    (new byte[5][])[3] = new byte[4];
    (new byte[4])[0] = 0;
    (new byte[4])[1] = 0;
    (new byte[4])[2] = 0;
    (new byte[4])[3] = 1;
    (new byte[5][])[4] = new byte[4];
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\i.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */