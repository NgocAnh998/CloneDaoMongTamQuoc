import java.io.PrintStream;
import java.util.Random;

public final class i {
  private static int d = 50;
  
  private static int e = 0;
  
  private static int c = 1;
  
  private static int b = 2;
  
  private static int a = 3;
  
  private static int z = 4;
  
  private static int h = 5;
  
  private static int g = 6;
  
  private static int f = 7;
  
  private static int i = 8;
  
  private static int j = 9;
  
  private static int k = 10;
  
  private static int l = 11;
  
  private static int m = 12;
  
  private static int n = 13;
  
  private static int p = 14;
  
  private static int o = 15;
  
  private static int q = 16;
  
  private static int s = 17;
  
  private static int r = 18;
  
  private static int t = 19;
  
  private static int u = 20;
  
  private static int v = 21;
  
  private static int w = 22;
  
  private static int x = 23;
  
  private static int y = 24;
  
  private static int B = 25;
  
  private static int A = 26;
  
  private static int C = 27;
  
  private static int Z = 28;
  
  private static int D = 29;
  
  private static int F = 30;
  
  private static int G = 31;
  
  private static int H = 32;
  
  private static int I = 33;
  
  private static int E = 34;
  
  private static int J = 35;
  
  private static int K = 36;
  
  private static int L = 37;
  
  private static int M = 38;
  
  public l d;
  
  private Random d;
  
  public PrintStream d;
  
  private i(PrintStream paramPrintStream) {
    this(paramPrintStream, true);
  }
  
  public i() {
    this(System.out, true);
  }
  
  private i(PrintStream paramPrintStream, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: new java/util/Random
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: aload_1
    //   12: putfield d : Ljava/io/PrintStream;
    //   15: aload_0
    //   16: dup
    //   17: astore_1
    //   18: new l
    //   21: dup
    //   22: aload_1
    //   23: new k
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: invokespecial <init> : (Li;Lj;)V
    //   33: putfield d : Ll;
    //   36: aload_1
    //   37: dup
    //   38: astore_2
    //   39: getfield d : Ll;
    //   42: getfield d : Lj;
    //   45: ldc '_G'
    //   47: aload_1
    //   48: dup
    //   49: astore_2
    //   50: getfield d : Ll;
    //   53: getfield d : Lj;
    //   56: invokeinterface d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   61: aload_1
    //   62: invokestatic d : (Li;)V
    //   65: return
  }
  
  private void d() {
    // Byte code:
    //   0: aload_0
    //   1: new l
    //   4: dup
    //   5: aload_0
    //   6: new k
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: invokespecial <init> : (Li;Lj;)V
    //   16: putfield d : Ll;
    //   19: aload_0
    //   20: dup
    //   21: astore_1
    //   22: getfield d : Ll;
    //   25: getfield d : Lj;
    //   28: ldc '_G'
    //   30: aload_0
    //   31: dup
    //   32: astore_1
    //   33: getfield d : Ll;
    //   36: getfield d : Lj;
    //   39: invokeinterface d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: invokestatic d : (Li;)V
    //   48: return
  }
  
  private int e(l paraml, int paramInt) {
    return c(paraml, paramInt);
  }
  
  private int c(l paraml, int paramInt) {
    boolean bool1;
    l l2;
    int k = (bool1 = (l2 = paraml).d) - paramInt - 1;
    boolean bool2;
    if ((bool2 = paraml.d[k]) == null)
      throw new RuntimeException("call nil"); 
    if (bool2 instanceof b)
      return d(paraml, (b)bool2, k + 1, k, paramInt); 
    if (!(bool2 instanceof f))
      throw new RuntimeException("call a non-func"); 
    e e;
    (e = paraml.d((f)bool2, k + 1, k, paramInt, false, false)).d();
    d(paraml);
    l l1;
    int j = (l1 = paraml).d - k;
    paraml.d = "";
    return j;
  }
  
  private static int d(l paraml, b paramb, int paramInt1, int paramInt2, int paramInt3) {
    int k = 0;
    e e = (paraml = paraml).d(null, paramInt1, paramInt2, paramInt3, false, false);
    paraml.d();
    try {
      k = paramb.d(e, paramInt3);
    } catch (ClassCastException classCastException) {
      (paraml = null).printStackTrace();
      System.out.println("func");
    } 
    int j = (j = e.d()) - k;
    e.d(j, -1, k);
    e.e(k - 1);
    return k;
  }
  
  private final void d(l paraml) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual d : ()Le;
    //   4: dup
    //   5: astore_2
    //   6: getfield d : Lf;
    //   9: dup
    //   10: astore_3
    //   11: getfield d : Lh;
    //   14: dup
    //   15: astore #4
    //   17: getfield d : [I
    //   20: astore #5
    //   22: aload_2
    //   23: getfield c : I
    //   26: istore #10
    //   28: aload #5
    //   30: aload_2
    //   31: dup
    //   32: getfield d : I
    //   35: dup_x1
    //   36: iconst_1
    //   37: iadd
    //   38: putfield d : I
    //   41: iaload
    //   42: dup
    //   43: istore #8
    //   45: bipush #63
    //   47: iand
    //   48: istore #9
    //   50: iload #8
    //   52: bipush #6
    //   54: iushr
    //   55: sipush #255
    //   58: iand
    //   59: istore #6
    //   61: iload #9
    //   63: tableswitch default -> 3070, 0 -> 228, 1 -> 254, 2 -> 278, 3 -> 338, 4 -> 360, 5 -> 390, 6 -> 421, 7 -> 477, 8 -> 516, 9 -> 549, 10 -> 611, 11 -> 631, 12 -> 700, 13 -> 700, 14 -> 700, 15 -> 700, 16 -> 700, 17 -> 700, 18 -> 3070, 19 -> 792, 20 -> 836, 21 -> 924, 22 -> 1127, 23 -> 1144, 24 -> 1144, 25 -> 1144, 26 -> 1591, 27 -> 1640, 28 -> 1711, 29 -> 2010, 30 -> 2336, 31 -> 2529, 32 -> 2470, 33 -> 2649, 34 -> 2742, 35 -> 2872, 36 -> 2881, 37 -> 3049
    //   228: iload #8
    //   230: bipush #23
    //   232: iushr
    //   233: sipush #511
    //   236: iand
    //   237: istore #7
    //   239: aload_2
    //   240: iload #6
    //   242: aload_2
    //   243: iload #7
    //   245: invokevirtual d : (I)Ljava/lang/Object;
    //   248: invokevirtual d : (ILjava/lang/Object;)V
    //   251: goto -> 28
    //   254: iload #8
    //   256: bipush #14
    //   258: iushr
    //   259: istore #7
    //   261: aload_2
    //   262: iload #6
    //   264: aload #4
    //   266: getfield d : [Ljava/lang/Object;
    //   269: iload #7
    //   271: aaload
    //   272: invokevirtual d : (ILjava/lang/Object;)V
    //   275: goto -> 28
    //   278: iload #8
    //   280: bipush #23
    //   282: iushr
    //   283: sipush #511
    //   286: iand
    //   287: istore #7
    //   289: iload #8
    //   291: bipush #14
    //   293: iushr
    //   294: sipush #511
    //   297: iand
    //   298: istore #8
    //   300: aload_2
    //   301: iload #6
    //   303: iload #7
    //   305: ifne -> 314
    //   308: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   311: goto -> 317
    //   314: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   317: invokevirtual d : (ILjava/lang/Object;)V
    //   320: iload #8
    //   322: ifeq -> 28
    //   325: aload_2
    //   326: dup
    //   327: getfield d : I
    //   330: iconst_1
    //   331: iadd
    //   332: putfield d : I
    //   335: goto -> 28
    //   338: iload #8
    //   340: bipush #23
    //   342: iushr
    //   343: sipush #511
    //   346: iand
    //   347: istore #7
    //   349: aload_2
    //   350: iload #6
    //   352: iload #7
    //   354: invokevirtual d : (II)V
    //   357: goto -> 28
    //   360: iload #8
    //   362: bipush #23
    //   364: iushr
    //   365: sipush #511
    //   368: iand
    //   369: istore #7
    //   371: aload_2
    //   372: iload #6
    //   374: aload_3
    //   375: getfield d : [Ls;
    //   378: iload #7
    //   380: aaload
    //   381: invokevirtual d : ()Ljava/lang/Object;
    //   384: invokevirtual d : (ILjava/lang/Object;)V
    //   387: goto -> 28
    //   390: iload #8
    //   392: bipush #14
    //   394: iushr
    //   395: istore #7
    //   397: aload_2
    //   398: iload #6
    //   400: aload_3
    //   401: getfield d : Lj;
    //   404: aload #4
    //   406: getfield d : [Ljava/lang/Object;
    //   409: iload #7
    //   411: aaload
    //   412: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   415: invokevirtual d : (ILjava/lang/Object;)V
    //   418: goto -> 28
    //   421: iload #8
    //   423: bipush #23
    //   425: iushr
    //   426: sipush #511
    //   429: iand
    //   430: istore #7
    //   432: iload #8
    //   434: bipush #14
    //   436: iushr
    //   437: sipush #511
    //   440: iand
    //   441: istore #8
    //   443: aload_2
    //   444: iload #7
    //   446: invokevirtual d : (I)Ljava/lang/Object;
    //   449: astore #11
    //   451: aload_2
    //   452: iload #8
    //   454: aload #4
    //   456: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   459: astore #12
    //   461: aload_2
    //   462: iload #6
    //   464: aload #11
    //   466: aload #12
    //   468: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   471: invokevirtual d : (ILjava/lang/Object;)V
    //   474: goto -> 28
    //   477: iload #8
    //   479: bipush #14
    //   481: iushr
    //   482: istore #7
    //   484: aload_2
    //   485: iload #6
    //   487: invokevirtual d : (I)Ljava/lang/Object;
    //   490: astore #11
    //   492: aload #4
    //   494: getfield d : [Ljava/lang/Object;
    //   497: iload #7
    //   499: aaload
    //   500: astore #12
    //   502: aload_3
    //   503: getfield d : Lj;
    //   506: aload #12
    //   508: aload #11
    //   510: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   513: goto -> 28
    //   516: iload #8
    //   518: bipush #23
    //   520: iushr
    //   521: sipush #511
    //   524: iand
    //   525: istore #7
    //   527: aload_3
    //   528: getfield d : [Ls;
    //   531: iload #7
    //   533: aaload
    //   534: dup
    //   535: astore #11
    //   537: aload_2
    //   538: iload #6
    //   540: invokevirtual d : (I)Ljava/lang/Object;
    //   543: invokevirtual d : (Ljava/lang/Object;)V
    //   546: goto -> 28
    //   549: iload #8
    //   551: bipush #23
    //   553: iushr
    //   554: sipush #511
    //   557: iand
    //   558: istore #7
    //   560: iload #8
    //   562: bipush #14
    //   564: iushr
    //   565: sipush #511
    //   568: iand
    //   569: istore #8
    //   571: aload_2
    //   572: iload #6
    //   574: invokevirtual d : (I)Ljava/lang/Object;
    //   577: astore #11
    //   579: aload_2
    //   580: iload #7
    //   582: aload #4
    //   584: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   587: astore #12
    //   589: aload_2
    //   590: iload #8
    //   592: aload #4
    //   594: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   597: astore #13
    //   599: aload #11
    //   601: aload #12
    //   603: aload #13
    //   605: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   608: goto -> 28
    //   611: new k
    //   614: dup
    //   615: invokespecial <init> : ()V
    //   618: astore #11
    //   620: aload_2
    //   621: iload #6
    //   623: aload #11
    //   625: invokevirtual d : (ILjava/lang/Object;)V
    //   628: goto -> 28
    //   631: iload #8
    //   633: bipush #23
    //   635: iushr
    //   636: sipush #511
    //   639: iand
    //   640: istore #7
    //   642: iload #8
    //   644: bipush #14
    //   646: iushr
    //   647: sipush #511
    //   650: iand
    //   651: istore #8
    //   653: aload_2
    //   654: iload #8
    //   656: aload #4
    //   658: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   661: astore #11
    //   663: aload_2
    //   664: iload #7
    //   666: invokevirtual d : (I)Ljava/lang/Object;
    //   669: dup
    //   670: astore #12
    //   672: aload #11
    //   674: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   677: astore #13
    //   679: aload_2
    //   680: iload #6
    //   682: aload #13
    //   684: invokevirtual d : (ILjava/lang/Object;)V
    //   687: aload_2
    //   688: iload #6
    //   690: iconst_1
    //   691: iadd
    //   692: aload #12
    //   694: invokevirtual d : (ILjava/lang/Object;)V
    //   697: goto -> 28
    //   700: iload #8
    //   702: bipush #23
    //   704: iushr
    //   705: sipush #511
    //   708: iand
    //   709: istore #7
    //   711: iload #8
    //   713: bipush #14
    //   715: iushr
    //   716: sipush #511
    //   719: iand
    //   720: istore #8
    //   722: aload_2
    //   723: iload #7
    //   725: aload #4
    //   727: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   730: astore #11
    //   732: aload_2
    //   733: iload #8
    //   735: aload #4
    //   737: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   740: astore #12
    //   742: aconst_null
    //   743: astore #14
    //   745: aconst_null
    //   746: astore #8
    //   748: aload #11
    //   750: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   753: dup
    //   754: astore #13
    //   756: ifnull -> 781
    //   759: aload #12
    //   761: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   764: dup
    //   765: astore #14
    //   767: ifnull -> 781
    //   770: aload #13
    //   772: aload #14
    //   774: iload #9
    //   776: invokestatic d : (Ljava/lang/Integer;Ljava/lang/Integer;I)Ljava/lang/Integer;
    //   779: astore #8
    //   781: aload_2
    //   782: iload #6
    //   784: aload #8
    //   786: invokevirtual d : (ILjava/lang/Object;)V
    //   789: goto -> 28
    //   792: iload #8
    //   794: bipush #23
    //   796: iushr
    //   797: sipush #511
    //   800: iand
    //   801: istore #7
    //   803: aload_2
    //   804: iload #7
    //   806: invokevirtual d : (I)Ljava/lang/Object;
    //   809: astore #11
    //   811: aload_2
    //   812: iload #6
    //   814: aload #11
    //   816: invokestatic d : (Ljava/lang/Object;)Z
    //   819: ifeq -> 826
    //   822: iconst_0
    //   823: goto -> 827
    //   826: iconst_1
    //   827: invokestatic d : (Z)Ljava/lang/Boolean;
    //   830: invokevirtual d : (ILjava/lang/Object;)V
    //   833: goto -> 28
    //   836: iload #8
    //   838: bipush #23
    //   840: iushr
    //   841: sipush #511
    //   844: iand
    //   845: istore #7
    //   847: aload_2
    //   848: iload #7
    //   850: invokevirtual d : (I)Ljava/lang/Object;
    //   853: dup
    //   854: astore #11
    //   856: instanceof j
    //   859: ifeq -> 883
    //   862: aload #11
    //   864: checkcast j
    //   867: dup
    //   868: astore #13
    //   870: invokeinterface d : ()I
    //   875: invokestatic d : (I)Ljava/lang/Integer;
    //   878: astore #12
    //   880: goto -> 913
    //   883: aload #11
    //   885: instanceof java/lang/String
    //   888: ifeq -> 910
    //   891: aload #11
    //   893: checkcast java/lang/String
    //   896: dup
    //   897: astore #13
    //   899: invokevirtual length : ()I
    //   902: invokestatic d : (I)Ljava/lang/Integer;
    //   905: astore #12
    //   907: goto -> 913
    //   910: aconst_null
    //   911: astore #12
    //   913: aload_2
    //   914: iload #6
    //   916: aload #12
    //   918: invokevirtual d : (ILjava/lang/Object;)V
    //   921: goto -> 28
    //   924: iload #8
    //   926: bipush #23
    //   928: iushr
    //   929: sipush #511
    //   932: iand
    //   933: istore #7
    //   935: iload #8
    //   937: bipush #14
    //   939: iushr
    //   940: sipush #511
    //   943: iand
    //   944: istore #8
    //   946: iload #7
    //   948: istore #11
    //   950: iload #8
    //   952: istore #12
    //   954: aload_2
    //   955: iload #12
    //   957: invokevirtual d : (I)Ljava/lang/Object;
    //   960: astore #13
    //   962: iinc #12, -1
    //   965: goto -> 1109
    //   968: aload #13
    //   970: invokestatic d : (Ljava/lang/Object;)Ljava/lang/String;
    //   973: astore #14
    //   975: aload #13
    //   977: ifnull -> 1092
    //   980: iconst_0
    //   981: istore #8
    //   983: iload #12
    //   985: istore #7
    //   987: goto -> 1012
    //   990: aload_2
    //   991: iload #7
    //   993: invokevirtual d : (I)Ljava/lang/Object;
    //   996: astore #9
    //   998: iinc #7, -1
    //   1001: aload #9
    //   1003: invokestatic d : (Ljava/lang/Object;)Ljava/lang/String;
    //   1006: ifnull -> 1019
    //   1009: iinc #8, 1
    //   1012: iload #11
    //   1014: iload #7
    //   1016: if_icmple -> 990
    //   1019: iload #8
    //   1021: ifle -> 1092
    //   1024: new java/lang/StringBuffer
    //   1027: dup
    //   1028: invokespecial <init> : ()V
    //   1031: astore #9
    //   1033: iload #12
    //   1035: iload #8
    //   1037: isub
    //   1038: iconst_1
    //   1039: iadd
    //   1040: istore #7
    //   1042: goto -> 1063
    //   1045: aload #9
    //   1047: aload_2
    //   1048: iload #7
    //   1050: invokevirtual d : (I)Ljava/lang/Object;
    //   1053: invokestatic d : (Ljava/lang/Object;)Ljava/lang/String;
    //   1056: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1059: pop
    //   1060: iinc #7, 1
    //   1063: iload #7
    //   1065: iload #12
    //   1067: if_icmple -> 1045
    //   1070: aload #9
    //   1072: aload #14
    //   1074: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1077: pop
    //   1078: aload #9
    //   1080: invokevirtual toString : ()Ljava/lang/String;
    //   1083: astore #13
    //   1085: iload #12
    //   1087: iload #8
    //   1089: isub
    //   1090: istore #12
    //   1092: iload #11
    //   1094: iload #12
    //   1096: if_icmpgt -> 1109
    //   1099: aload_2
    //   1100: iload #12
    //   1102: invokevirtual d : (I)Ljava/lang/Object;
    //   1105: pop
    //   1106: iinc #12, -1
    //   1109: iload #11
    //   1111: iload #12
    //   1113: if_icmple -> 968
    //   1116: aload_2
    //   1117: iload #6
    //   1119: aload #13
    //   1121: invokevirtual d : (ILjava/lang/Object;)V
    //   1124: goto -> 28
    //   1127: aload_2
    //   1128: dup
    //   1129: getfield d : I
    //   1132: iload #8
    //   1134: invokestatic d : (I)I
    //   1137: iadd
    //   1138: putfield d : I
    //   1141: goto -> 28
    //   1144: iload #8
    //   1146: bipush #23
    //   1148: iushr
    //   1149: sipush #511
    //   1152: iand
    //   1153: istore #7
    //   1155: iload #8
    //   1157: bipush #14
    //   1159: iushr
    //   1160: sipush #511
    //   1163: iand
    //   1164: istore #8
    //   1166: aload_2
    //   1167: iload #7
    //   1169: aload #4
    //   1171: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   1174: astore #11
    //   1176: aload_2
    //   1177: iload #8
    //   1179: aload #4
    //   1181: invokestatic d : (Le;ILh;)Ljava/lang/Object;
    //   1184: astore #12
    //   1186: aload #11
    //   1188: instanceof java/lang/Integer
    //   1191: ifeq -> 1344
    //   1194: aload #12
    //   1196: instanceof java/lang/Integer
    //   1199: ifeq -> 1344
    //   1202: aload #11
    //   1204: invokestatic d : (Ljava/lang/Object;)I
    //   1207: istore #13
    //   1209: aload #12
    //   1211: invokestatic d : (Ljava/lang/Object;)I
    //   1214: istore #14
    //   1216: iload #9
    //   1218: bipush #23
    //   1220: if_icmpne -> 1261
    //   1223: iload #13
    //   1225: iload #14
    //   1227: if_icmpne -> 1234
    //   1230: iconst_1
    //   1231: goto -> 1235
    //   1234: iconst_0
    //   1235: iload #6
    //   1237: ifne -> 1244
    //   1240: iconst_1
    //   1241: goto -> 1245
    //   1244: iconst_0
    //   1245: if_icmpne -> 28
    //   1248: aload_2
    //   1249: dup
    //   1250: getfield d : I
    //   1253: iconst_1
    //   1254: iadd
    //   1255: putfield d : I
    //   1258: goto -> 28
    //   1261: iload #9
    //   1263: bipush #24
    //   1265: if_icmpne -> 1306
    //   1268: iload #13
    //   1270: iload #14
    //   1272: if_icmpge -> 1279
    //   1275: iconst_1
    //   1276: goto -> 1280
    //   1279: iconst_0
    //   1280: iload #6
    //   1282: ifne -> 1289
    //   1285: iconst_1
    //   1286: goto -> 1290
    //   1289: iconst_0
    //   1290: if_icmpne -> 28
    //   1293: aload_2
    //   1294: dup
    //   1295: getfield d : I
    //   1298: iconst_1
    //   1299: iadd
    //   1300: putfield d : I
    //   1303: goto -> 28
    //   1306: iload #13
    //   1308: iload #14
    //   1310: if_icmpgt -> 1317
    //   1313: iconst_1
    //   1314: goto -> 1318
    //   1317: iconst_0
    //   1318: iload #6
    //   1320: ifne -> 1327
    //   1323: iconst_1
    //   1324: goto -> 1328
    //   1327: iconst_0
    //   1328: if_icmpne -> 28
    //   1331: aload_2
    //   1332: dup
    //   1333: getfield d : I
    //   1336: iconst_1
    //   1337: iadd
    //   1338: putfield d : I
    //   1341: goto -> 28
    //   1344: aload #11
    //   1346: instanceof java/lang/String
    //   1349: ifeq -> 1502
    //   1352: aload #12
    //   1354: instanceof java/lang/String
    //   1357: ifeq -> 1502
    //   1360: iload #9
    //   1362: bipush #23
    //   1364: if_icmpne -> 1400
    //   1367: aload #11
    //   1369: aload #12
    //   1371: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1374: iload #6
    //   1376: ifne -> 1383
    //   1379: iconst_1
    //   1380: goto -> 1384
    //   1383: iconst_0
    //   1384: if_icmpne -> 28
    //   1387: aload_2
    //   1388: dup
    //   1389: getfield d : I
    //   1392: iconst_1
    //   1393: iadd
    //   1394: putfield d : I
    //   1397: goto -> 28
    //   1400: aload #11
    //   1402: checkcast java/lang/String
    //   1405: astore #13
    //   1407: aload #12
    //   1409: checkcast java/lang/String
    //   1412: astore #14
    //   1414: aload #13
    //   1416: aload #14
    //   1418: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1421: istore #8
    //   1423: iload #9
    //   1425: bipush #24
    //   1427: if_icmpne -> 1466
    //   1430: iload #8
    //   1432: ifge -> 1439
    //   1435: iconst_1
    //   1436: goto -> 1440
    //   1439: iconst_0
    //   1440: iload #6
    //   1442: ifne -> 1449
    //   1445: iconst_1
    //   1446: goto -> 1450
    //   1449: iconst_0
    //   1450: if_icmpne -> 28
    //   1453: aload_2
    //   1454: dup
    //   1455: getfield d : I
    //   1458: iconst_1
    //   1459: iadd
    //   1460: putfield d : I
    //   1463: goto -> 28
    //   1466: iload #8
    //   1468: ifgt -> 1475
    //   1471: iconst_1
    //   1472: goto -> 1476
    //   1475: iconst_0
    //   1476: iload #6
    //   1478: ifne -> 1485
    //   1481: iconst_1
    //   1482: goto -> 1486
    //   1485: iconst_0
    //   1486: if_icmpne -> 28
    //   1489: aload_2
    //   1490: dup
    //   1491: getfield d : I
    //   1494: iconst_1
    //   1495: iadd
    //   1496: putfield d : I
    //   1499: goto -> 28
    //   1502: iconst_0
    //   1503: istore #13
    //   1505: aload #11
    //   1507: aload #12
    //   1509: if_acmpne -> 1518
    //   1512: iconst_1
    //   1513: istore #13
    //   1515: goto -> 1563
    //   1518: iload #9
    //   1520: bipush #23
    //   1522: if_icmpne -> 1537
    //   1525: aload #11
    //   1527: aload #12
    //   1529: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1532: istore #13
    //   1534: goto -> 1563
    //   1537: new java/lang/StringBuffer
    //   1540: dup
    //   1541: iload #9
    //   1543: invokestatic valueOf : (I)Ljava/lang/String;
    //   1546: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1549: invokespecial <init> : (Ljava/lang/String;)V
    //   1552: ldc ' not defined for operand'
    //   1554: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1557: invokevirtual toString : ()Ljava/lang/String;
    //   1560: invokestatic d : (Ljava/lang/String;)V
    //   1563: iload #13
    //   1565: iload #6
    //   1567: ifne -> 1574
    //   1570: iconst_1
    //   1571: goto -> 1575
    //   1574: iconst_0
    //   1575: if_icmpne -> 28
    //   1578: aload_2
    //   1579: dup
    //   1580: getfield d : I
    //   1583: iconst_1
    //   1584: iadd
    //   1585: putfield d : I
    //   1588: goto -> 28
    //   1591: iload #8
    //   1593: bipush #14
    //   1595: iushr
    //   1596: sipush #511
    //   1599: iand
    //   1600: istore #8
    //   1602: aload_2
    //   1603: iload #6
    //   1605: invokevirtual d : (I)Ljava/lang/Object;
    //   1608: dup
    //   1609: astore #11
    //   1611: invokestatic d : (Ljava/lang/Object;)Z
    //   1614: iload #8
    //   1616: ifne -> 1623
    //   1619: iconst_1
    //   1620: goto -> 1624
    //   1623: iconst_0
    //   1624: if_icmpne -> 28
    //   1627: aload_2
    //   1628: dup
    //   1629: getfield d : I
    //   1632: iconst_1
    //   1633: iadd
    //   1634: putfield d : I
    //   1637: goto -> 28
    //   1640: iload #8
    //   1642: bipush #23
    //   1644: iushr
    //   1645: sipush #511
    //   1648: iand
    //   1649: istore #7
    //   1651: iload #8
    //   1653: bipush #14
    //   1655: iushr
    //   1656: sipush #511
    //   1659: iand
    //   1660: istore #8
    //   1662: aload_2
    //   1663: iload #7
    //   1665: invokevirtual d : (I)Ljava/lang/Object;
    //   1668: dup
    //   1669: astore #11
    //   1671: invokestatic d : (Ljava/lang/Object;)Z
    //   1674: iload #8
    //   1676: ifne -> 1683
    //   1679: iconst_1
    //   1680: goto -> 1684
    //   1683: iconst_0
    //   1684: if_icmpeq -> 1698
    //   1687: aload_2
    //   1688: iload #6
    //   1690: aload #11
    //   1692: invokevirtual d : (ILjava/lang/Object;)V
    //   1695: goto -> 28
    //   1698: aload_2
    //   1699: dup
    //   1700: getfield d : I
    //   1703: iconst_1
    //   1704: iadd
    //   1705: putfield d : I
    //   1708: goto -> 28
    //   1711: iload #8
    //   1713: bipush #23
    //   1715: iushr
    //   1716: sipush #511
    //   1719: iand
    //   1720: istore #7
    //   1722: iload #8
    //   1724: bipush #14
    //   1726: iushr
    //   1727: sipush #511
    //   1730: iand
    //   1731: istore #8
    //   1733: iload #7
    //   1735: iconst_1
    //   1736: isub
    //   1737: dup
    //   1738: istore #11
    //   1740: iconst_m1
    //   1741: if_icmpeq -> 1758
    //   1744: aload_2
    //   1745: iload #6
    //   1747: iload #11
    //   1749: iadd
    //   1750: iconst_1
    //   1751: iadd
    //   1752: invokevirtual e : (I)V
    //   1755: goto -> 1769
    //   1758: aload_2
    //   1759: invokevirtual d : ()I
    //   1762: iload #6
    //   1764: isub
    //   1765: iconst_1
    //   1766: isub
    //   1767: istore #11
    //   1769: aload_2
    //   1770: iload #8
    //   1772: ifeq -> 1779
    //   1775: iconst_1
    //   1776: goto -> 1780
    //   1779: iconst_0
    //   1780: putfield c : Z
    //   1783: aload_2
    //   1784: getfield e : I
    //   1787: dup
    //   1788: istore #12
    //   1790: iload #6
    //   1792: iadd
    //   1793: dup
    //   1794: istore #13
    //   1796: iconst_1
    //   1797: iadd
    //   1798: istore #14
    //   1800: aload_2
    //   1801: iload #6
    //   1803: invokevirtual d : (I)Ljava/lang/Object;
    //   1806: dup
    //   1807: astore #8
    //   1809: ifnonnull -> 1827
    //   1812: aload #8
    //   1814: ifnull -> 1821
    //   1817: iconst_1
    //   1818: goto -> 1822
    //   1821: iconst_0
    //   1822: ldc 'call nil'
    //   1824: invokestatic d : (ZLjava/lang/String;)V
    //   1827: aload #8
    //   1829: instanceof f
    //   1832: ifeq -> 1891
    //   1835: aload_1
    //   1836: aload #8
    //   1838: checkcast f
    //   1841: iload #14
    //   1843: iload #13
    //   1845: iload #11
    //   1847: iconst_1
    //   1848: aload_2
    //   1849: getfield e : Z
    //   1852: invokevirtual d : (Lf;IIIZZ)Le;
    //   1855: dup
    //   1856: astore #7
    //   1858: invokevirtual d : ()V
    //   1861: aload #7
    //   1863: astore_2
    //   1864: aload #7
    //   1866: getfield d : Lf;
    //   1869: dup
    //   1870: astore_3
    //   1871: getfield d : Lh;
    //   1874: dup
    //   1875: astore #4
    //   1877: getfield d : [I
    //   1880: astore #5
    //   1882: aload_2
    //   1883: getfield c : I
    //   1886: istore #10
    //   1888: goto -> 28
    //   1891: aload #8
    //   1893: instanceof b
    //   1896: ifeq -> 1985
    //   1899: aload_1
    //   1900: aload #8
    //   1902: checkcast b
    //   1905: iload #12
    //   1907: iload #6
    //   1909: iadd
    //   1910: iconst_1
    //   1911: iadd
    //   1912: iload #12
    //   1914: iload #6
    //   1916: iadd
    //   1917: iload #11
    //   1919: invokestatic d : (Ll;Lb;III)I
    //   1922: pop
    //   1923: aload_1
    //   1924: invokevirtual d : ()Le;
    //   1927: dup
    //   1928: astore_2
    //   1929: invokevirtual d : ()Z
    //   1932: ifeq -> 1936
    //   1935: return
    //   1936: aload_2
    //   1937: getfield d : Lf;
    //   1940: ifnull -> 1966
    //   1943: aload_2
    //   1944: getfield d : Lf;
    //   1947: dup
    //   1948: astore_3
    //   1949: getfield d : Lh;
    //   1952: dup
    //   1953: astore #4
    //   1955: getfield d : [I
    //   1958: astore #5
    //   1960: aload_2
    //   1961: getfield c : I
    //   1964: istore #10
    //   1966: aload_2
    //   1967: getfield c : Z
    //   1970: ifeq -> 28
    //   1973: aload_2
    //   1974: aload #4
    //   1976: getfield c : I
    //   1979: invokevirtual e : (I)V
    //   1982: goto -> 28
    //   1985: new java/lang/RuntimeException
    //   1988: dup
    //   1989: new java/lang/StringBuffer
    //   1992: dup
    //   1993: ldc 'Call non-func: '
    //   1995: invokespecial <init> : (Ljava/lang/String;)V
    //   1998: aload #8
    //   2000: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   2003: invokevirtual toString : ()Ljava/lang/String;
    //   2006: invokespecial <init> : (Ljava/lang/String;)V
    //   2009: athrow
    //   2010: aload_2
    //   2011: getfield e : I
    //   2014: istore #11
    //   2016: aload_1
    //   2017: iload #11
    //   2019: invokevirtual e : (I)V
    //   2022: iload #8
    //   2024: bipush #23
    //   2026: iushr
    //   2027: sipush #511
    //   2030: iand
    //   2031: dup
    //   2032: istore #7
    //   2034: iconst_1
    //   2035: isub
    //   2036: dup
    //   2037: istore #12
    //   2039: iconst_m1
    //   2040: if_icmpne -> 2054
    //   2043: aload_2
    //   2044: invokevirtual d : ()I
    //   2047: iload #6
    //   2049: isub
    //   2050: iconst_1
    //   2051: isub
    //   2052: istore #12
    //   2054: aload_2
    //   2055: iconst_0
    //   2056: putfield c : Z
    //   2059: aload_2
    //   2060: iload #6
    //   2062: invokevirtual d : (I)Ljava/lang/Object;
    //   2065: dup
    //   2066: astore #13
    //   2068: ifnonnull -> 2086
    //   2071: aload #13
    //   2073: ifnull -> 2080
    //   2076: iconst_1
    //   2077: goto -> 2081
    //   2080: iconst_0
    //   2081: ldc 'Tried to call nil'
    //   2083: invokestatic d : (ZLjava/lang/String;)V
    //   2086: iload #10
    //   2088: iconst_1
    //   2089: iadd
    //   2090: istore #14
    //   2092: aload_1
    //   2093: iload #11
    //   2095: iload #6
    //   2097: iadd
    //   2098: iload #10
    //   2100: iload #12
    //   2102: iconst_1
    //   2103: iadd
    //   2104: invokevirtual d : (III)V
    //   2107: aload_1
    //   2108: iload #10
    //   2110: iload #12
    //   2112: iadd
    //   2113: iconst_1
    //   2114: iadd
    //   2115: invokevirtual d : (I)V
    //   2118: aload #13
    //   2120: instanceof f
    //   2123: ifeq -> 2154
    //   2126: aload_2
    //   2127: iload #14
    //   2129: putfield e : I
    //   2132: aload_2
    //   2133: iload #12
    //   2135: putfield b : I
    //   2138: aload_2
    //   2139: aload #13
    //   2141: checkcast f
    //   2144: putfield d : Lf;
    //   2147: aload_2
    //   2148: invokevirtual d : ()V
    //   2151: goto -> 2310
    //   2154: aload #13
    //   2156: instanceof b
    //   2159: ifne -> 2182
    //   2162: new java/lang/StringBuffer
    //   2165: dup
    //   2166: ldc 'Tried to call a non-function: '
    //   2168: invokespecial <init> : (Ljava/lang/String;)V
    //   2171: aload #13
    //   2173: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   2176: invokevirtual toString : ()Ljava/lang/String;
    //   2179: invokestatic d : (Ljava/lang/String;)V
    //   2182: aload_1
    //   2183: astore #8
    //   2185: aload_1
    //   2186: aload #13
    //   2188: checkcast b
    //   2191: iload #14
    //   2193: iload #10
    //   2195: iload #12
    //   2197: invokestatic d : (Ll;Lb;III)I
    //   2200: pop
    //   2201: aload_1
    //   2202: invokevirtual d : ()Le;
    //   2205: astore_2
    //   2206: aload #8
    //   2208: invokevirtual d : ()V
    //   2211: aload #8
    //   2213: aload_1
    //   2214: if_acmpeq -> 2276
    //   2217: aload #8
    //   2219: invokevirtual d : ()Z
    //   2222: ifeq -> 2263
    //   2225: aload_1
    //   2226: getfield d : Ll;
    //   2229: aload #8
    //   2231: if_acmpne -> 2263
    //   2234: aload_1
    //   2235: aload #8
    //   2237: getfield d : Ll;
    //   2240: putfield d : Ll;
    //   2243: aload #8
    //   2245: aconst_null
    //   2246: putfield d : Ll;
    //   2249: aload_1
    //   2250: getfield d : Ll;
    //   2253: invokevirtual d : ()Le;
    //   2256: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   2259: invokevirtual d : (Ljava/lang/Object;)I
    //   2262: pop
    //   2263: aload_1
    //   2264: invokevirtual d : ()Le;
    //   2267: dup
    //   2268: astore_2
    //   2269: invokevirtual d : ()Z
    //   2272: ifeq -> 2310
    //   2275: return
    //   2276: aload_2
    //   2277: getfield d : Z
    //   2280: ifne -> 2284
    //   2283: return
    //   2284: aload_1
    //   2285: invokevirtual d : ()Le;
    //   2288: dup
    //   2289: astore_2
    //   2290: getfield c : Z
    //   2293: ifeq -> 2310
    //   2296: aload_2
    //   2297: aload_2
    //   2298: getfield d : Lf;
    //   2301: getfield d : Lh;
    //   2304: getfield c : I
    //   2307: invokevirtual e : (I)V
    //   2310: aload_2
    //   2311: getfield d : Lf;
    //   2314: dup
    //   2315: astore_3
    //   2316: getfield d : Lh;
    //   2319: dup
    //   2320: astore #4
    //   2322: getfield d : [I
    //   2325: astore #5
    //   2327: aload_2
    //   2328: getfield c : I
    //   2331: istore #10
    //   2333: goto -> 28
    //   2336: iload #8
    //   2338: bipush #23
    //   2340: iushr
    //   2341: sipush #511
    //   2344: iand
    //   2345: iconst_1
    //   2346: isub
    //   2347: istore #7
    //   2349: aload_2
    //   2350: getfield e : I
    //   2353: istore #11
    //   2355: aload_1
    //   2356: iload #11
    //   2358: invokevirtual e : (I)V
    //   2361: iload #7
    //   2363: iconst_m1
    //   2364: if_icmpne -> 2376
    //   2367: aload_2
    //   2368: invokevirtual d : ()I
    //   2371: iload #6
    //   2373: isub
    //   2374: istore #7
    //   2376: aload_1
    //   2377: aload_2
    //   2378: getfield e : I
    //   2381: iload #6
    //   2383: iadd
    //   2384: iload #10
    //   2386: iload #7
    //   2388: invokevirtual d : (III)V
    //   2391: aload_1
    //   2392: iload #10
    //   2394: iload #7
    //   2396: iadd
    //   2397: invokevirtual d : (I)V
    //   2400: aload_2
    //   2401: getfield d : Z
    //   2404: ifeq -> 2465
    //   2407: aload_1
    //   2408: invokevirtual d : ()V
    //   2411: aload_1
    //   2412: invokevirtual d : ()Le;
    //   2415: dup
    //   2416: astore_2
    //   2417: getfield d : Lf;
    //   2420: ifnull -> 2446
    //   2423: aload_2
    //   2424: getfield d : Lf;
    //   2427: dup
    //   2428: astore_3
    //   2429: getfield d : Lh;
    //   2432: dup
    //   2433: astore #4
    //   2435: getfield d : [I
    //   2438: astore #5
    //   2440: aload_2
    //   2441: getfield c : I
    //   2444: istore #10
    //   2446: aload_2
    //   2447: getfield c : Z
    //   2450: ifeq -> 28
    //   2453: aload_2
    //   2454: aload #4
    //   2456: getfield c : I
    //   2459: invokevirtual e : (I)V
    //   2462: goto -> 28
    //   2465: aload_1
    //   2466: invokevirtual d : ()V
    //   2469: return
    //   2470: iload #8
    //   2472: invokestatic d : (I)I
    //   2475: istore #7
    //   2477: aload_2
    //   2478: iload #6
    //   2480: invokevirtual d : (I)Ljava/lang/Object;
    //   2483: invokestatic d : (Ljava/lang/Object;)I
    //   2486: istore #11
    //   2488: aload_2
    //   2489: iload #6
    //   2491: iconst_2
    //   2492: iadd
    //   2493: invokevirtual d : (I)Ljava/lang/Object;
    //   2496: invokestatic d : (Ljava/lang/Object;)I
    //   2499: istore #12
    //   2501: aload_2
    //   2502: iload #6
    //   2504: iload #11
    //   2506: iload #12
    //   2508: isub
    //   2509: invokestatic d : (I)Ljava/lang/Integer;
    //   2512: invokevirtual d : (ILjava/lang/Object;)V
    //   2515: aload_2
    //   2516: dup
    //   2517: getfield d : I
    //   2520: iload #7
    //   2522: iadd
    //   2523: putfield d : I
    //   2526: goto -> 28
    //   2529: aload_2
    //   2530: iload #6
    //   2532: invokevirtual d : (I)Ljava/lang/Object;
    //   2535: invokestatic d : (Ljava/lang/Object;)I
    //   2538: istore #11
    //   2540: aload_2
    //   2541: iload #6
    //   2543: iconst_1
    //   2544: iadd
    //   2545: invokevirtual d : (I)Ljava/lang/Object;
    //   2548: invokestatic d : (Ljava/lang/Object;)I
    //   2551: istore #12
    //   2553: aload_2
    //   2554: iload #6
    //   2556: iconst_2
    //   2557: iadd
    //   2558: invokevirtual d : (I)Ljava/lang/Object;
    //   2561: invokestatic d : (Ljava/lang/Object;)I
    //   2564: istore #13
    //   2566: iload #11
    //   2568: iload #13
    //   2570: iadd
    //   2571: dup
    //   2572: istore #11
    //   2574: invokestatic d : (I)Ljava/lang/Integer;
    //   2577: astore #14
    //   2579: aload_2
    //   2580: iload #6
    //   2582: aload #14
    //   2584: invokevirtual d : (ILjava/lang/Object;)V
    //   2587: iload #13
    //   2589: ifle -> 2602
    //   2592: iload #11
    //   2594: iload #12
    //   2596: if_icmpgt -> 2640
    //   2599: goto -> 2609
    //   2602: iload #11
    //   2604: iload #12
    //   2606: if_icmplt -> 2640
    //   2609: iload #8
    //   2611: invokestatic d : (I)I
    //   2614: istore #7
    //   2616: aload_2
    //   2617: dup
    //   2618: getfield d : I
    //   2621: iload #7
    //   2623: iadd
    //   2624: putfield d : I
    //   2627: aload_2
    //   2628: iload #6
    //   2630: iconst_3
    //   2631: iadd
    //   2632: aload #14
    //   2634: invokevirtual d : (ILjava/lang/Object;)V
    //   2637: goto -> 28
    //   2640: aload_2
    //   2641: iload #6
    //   2643: invokevirtual d : (I)V
    //   2646: goto -> 28
    //   2649: iload #8
    //   2651: bipush #14
    //   2653: iushr
    //   2654: sipush #511
    //   2657: iand
    //   2658: istore #8
    //   2660: aload_2
    //   2661: iload #6
    //   2663: bipush #6
    //   2665: iadd
    //   2666: invokevirtual e : (I)V
    //   2669: aload_2
    //   2670: iload #6
    //   2672: iload #6
    //   2674: iconst_3
    //   2675: iadd
    //   2676: iconst_3
    //   2677: invokevirtual d : (III)V
    //   2680: aload_0
    //   2681: aload_1
    //   2682: iconst_2
    //   2683: invokespecial e : (Ll;I)I
    //   2686: pop
    //   2687: aload_2
    //   2688: iload #6
    //   2690: iconst_3
    //   2691: iadd
    //   2692: iload #8
    //   2694: iadd
    //   2695: invokevirtual d : (I)V
    //   2698: aload_2
    //   2699: invokevirtual e : ()V
    //   2702: aload_2
    //   2703: iload #6
    //   2705: iconst_3
    //   2706: iadd
    //   2707: invokevirtual d : (I)Ljava/lang/Object;
    //   2710: dup
    //   2711: astore #11
    //   2713: ifnull -> 2729
    //   2716: aload_2
    //   2717: iload #6
    //   2719: iconst_2
    //   2720: iadd
    //   2721: aload #11
    //   2723: invokevirtual d : (ILjava/lang/Object;)V
    //   2726: goto -> 28
    //   2729: aload_2
    //   2730: dup
    //   2731: getfield d : I
    //   2734: iconst_1
    //   2735: iadd
    //   2736: putfield d : I
    //   2739: goto -> 28
    //   2742: iload #8
    //   2744: bipush #23
    //   2746: iushr
    //   2747: sipush #511
    //   2750: iand
    //   2751: istore #7
    //   2753: iload #8
    //   2755: bipush #14
    //   2757: iushr
    //   2758: sipush #511
    //   2761: iand
    //   2762: istore #8
    //   2764: iload #7
    //   2766: ifne -> 2780
    //   2769: aload_2
    //   2770: invokevirtual d : ()I
    //   2773: iload #6
    //   2775: isub
    //   2776: iconst_1
    //   2777: isub
    //   2778: istore #7
    //   2780: iload #8
    //   2782: ifne -> 2801
    //   2785: aload #5
    //   2787: aload_2
    //   2788: dup
    //   2789: getfield d : I
    //   2792: dup_x1
    //   2793: iconst_1
    //   2794: iadd
    //   2795: putfield d : I
    //   2798: iaload
    //   2799: istore #8
    //   2801: iload #8
    //   2803: iconst_1
    //   2804: isub
    //   2805: bipush #50
    //   2807: imul
    //   2808: istore #11
    //   2810: aload_2
    //   2811: iload #6
    //   2813: invokevirtual d : (I)Ljava/lang/Object;
    //   2816: checkcast j
    //   2819: astore #12
    //   2821: iconst_1
    //   2822: istore #13
    //   2824: goto -> 2862
    //   2827: iload #11
    //   2829: iload #13
    //   2831: iadd
    //   2832: invokestatic d : (I)Ljava/lang/Integer;
    //   2835: astore #14
    //   2837: aload_2
    //   2838: iload #6
    //   2840: iload #13
    //   2842: iadd
    //   2843: invokevirtual d : (I)Ljava/lang/Object;
    //   2846: astore #8
    //   2848: aload #12
    //   2850: aload #14
    //   2852: aload #8
    //   2854: invokeinterface d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   2859: iinc #13, 1
    //   2862: iload #13
    //   2864: iload #7
    //   2866: if_icmple -> 2827
    //   2869: goto -> 28
    //   2872: aload_2
    //   2873: iload #6
    //   2875: invokevirtual c : (I)V
    //   2878: goto -> 28
    //   2881: iload #8
    //   2883: bipush #14
    //   2885: iushr
    //   2886: istore #7
    //   2888: aload #4
    //   2890: getfield d : [Lh;
    //   2893: iload #7
    //   2895: aaload
    //   2896: astore #11
    //   2898: new f
    //   2901: dup
    //   2902: aload #11
    //   2904: aload_3
    //   2905: getfield d : Lj;
    //   2908: invokespecial <init> : (Lh;Lj;)V
    //   2911: astore #12
    //   2913: aload_2
    //   2914: iload #6
    //   2916: aload #12
    //   2918: invokevirtual d : (ILjava/lang/Object;)V
    //   2921: aload #11
    //   2923: getfield e : I
    //   2926: istore #13
    //   2928: iconst_0
    //   2929: istore #14
    //   2931: goto -> 3039
    //   2934: aload #5
    //   2936: aload_2
    //   2937: dup
    //   2938: getfield d : I
    //   2941: dup_x1
    //   2942: iconst_1
    //   2943: iadd
    //   2944: putfield d : I
    //   2947: iaload
    //   2948: dup
    //   2949: istore #8
    //   2951: bipush #63
    //   2953: iand
    //   2954: istore #9
    //   2956: iload #8
    //   2958: bipush #23
    //   2960: iushr
    //   2961: sipush #511
    //   2964: iand
    //   2965: istore #7
    //   2967: iload #9
    //   2969: tableswitch default -> 3036, 0 -> 3004, 1 -> 3036, 2 -> 3036, 3 -> 3036, 4 -> 3021
    //   3004: aload #12
    //   3006: getfield d : [Ls;
    //   3009: iload #14
    //   3011: aload_2
    //   3012: iload #7
    //   3014: invokevirtual d : (I)Ls;
    //   3017: aastore
    //   3018: goto -> 3036
    //   3021: aload #12
    //   3023: getfield d : [Ls;
    //   3026: iload #14
    //   3028: aload_3
    //   3029: getfield d : [Ls;
    //   3032: iload #7
    //   3034: aaload
    //   3035: aastore
    //   3036: iinc #14, 1
    //   3039: iload #14
    //   3041: iload #13
    //   3043: if_icmplt -> 2934
    //   3046: goto -> 28
    //   3049: iload #8
    //   3051: bipush #23
    //   3053: iushr
    //   3054: sipush #511
    //   3057: iand
    //   3058: iconst_1
    //   3059: isub
    //   3060: istore #7
    //   3062: aload_2
    //   3063: iload #6
    //   3065: iload #7
    //   3067: invokevirtual e : (II)V
    //   3070: goto -> 28
    //   3073: dup
    //   3074: astore #11
    //   3076: invokevirtual printStackTrace : ()V
    //   3079: aload_1
    //   3080: invokevirtual d : ()Le;
    //   3083: dup
    //   3084: astore_2
    //   3085: invokevirtual e : ()Z
    //   3088: ifne -> 3098
    //   3091: aload_1
    //   3092: invokevirtual d : ()V
    //   3095: goto -> 3079
    //   3098: iconst_1
    //   3099: istore #12
    //   3101: aload_1
    //   3102: invokevirtual d : ()Le;
    //   3105: dup
    //   3106: astore_2
    //   3107: ifnonnull -> 3207
    //   3110: aload_1
    //   3111: getfield d : Ll;
    //   3114: dup
    //   3115: astore #13
    //   3117: ifnull -> 3218
    //   3120: aload_1
    //   3121: aconst_null
    //   3122: putfield d : Ll;
    //   3125: aload #13
    //   3127: invokevirtual d : ()Le;
    //   3130: dup
    //   3131: astore #14
    //   3133: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   3136: invokevirtual d : (Ljava/lang/Object;)I
    //   3139: pop
    //   3140: aload #14
    //   3142: aload #11
    //   3144: invokevirtual getMessage : ()Ljava/lang/String;
    //   3147: invokevirtual d : (Ljava/lang/Object;)I
    //   3150: pop
    //   3151: aload #14
    //   3153: aload_1
    //   3154: getfield d : Ljava/lang/String;
    //   3157: invokevirtual d : (Ljava/lang/Object;)I
    //   3160: pop
    //   3161: aload_1
    //   3162: getfield d : Li;
    //   3165: aload #13
    //   3167: putfield d : Ll;
    //   3170: aload #13
    //   3172: dup
    //   3173: astore_1
    //   3174: invokevirtual d : ()Le;
    //   3177: dup
    //   3178: astore_2
    //   3179: getfield d : Lf;
    //   3182: dup
    //   3183: astore_3
    //   3184: getfield d : Lh;
    //   3187: dup
    //   3188: astore #4
    //   3190: getfield d : [I
    //   3193: astore #5
    //   3195: aload_2
    //   3196: getfield c : I
    //   3199: istore #10
    //   3201: iconst_0
    //   3202: istore #12
    //   3204: goto -> 3218
    //   3207: aload_1
    //   3208: invokevirtual d : ()V
    //   3211: aload_2
    //   3212: getfield d : Z
    //   3215: ifne -> 3101
    //   3218: aload_2
    //   3219: ifnull -> 3227
    //   3222: aload_2
    //   3223: iconst_0
    //   3224: invokevirtual c : (I)V
    //   3227: iload #12
    //   3229: ifeq -> 28
    //   3232: aload #11
    //   3234: athrow
    // Exception table:
    //   from	to	target	type
    //   28	1935	3073	java/lang/RuntimeException
    //   1936	2275	3073	java/lang/RuntimeException
    //   2276	2283	3073	java/lang/RuntimeException
    //   2284	2469	3073	java/lang/RuntimeException
    //   2470	3070	3073	java/lang/RuntimeException
  }
  
  private static final Object d(e parame, int paramInt, h paramh) {
    int j;
    return ((j = paramInt - 256) < 0) ? parame.d(paramInt) : paramh.d[j];
  }
  
  private static final int d(int paramInt) {
    return (paramInt >>> 14) - 131071;
  }
  
  private static final Integer d(Integer paramInteger1, Integer paramInteger2, int paramInt) {
    Integer integer;
    int j = (integer = paramInteger1).intValue();
    int k = (integer = paramInteger2).intValue();
    int m = 0;
    switch (paramInt) {
      case 12:
        m = j + k;
        break;
      case 13:
        m = j - k;
        break;
      case 14:
        m = j * k;
        break;
      case 15:
        m = j / k;
        break;
      case 16:
        m = j % k;
        break;
    } 
    return d(m);
  }
  
  public final Object d(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    boolean bool1;
    boolean bool2 = ((l)(paramObject4 = this.d)).d;
    this.d.d(bool2 + 1 + 3);
    boolean bool3;
    (bool3 = ((l)this.d).d)[bool2] = paramObject1;
    bool3[bool2 + 1] = paramObject2;
    bool3[bool2 + 2] = null;
    bool3[bool2 + 3] = null;
    byte b = 3;
    paramObject1 = this.d;
    i i1;
    int j = (i1 = this).c((l)paramObject1, b);
    Object object = null;
    if (j > 0)
      bool1 = ((l)this.d).d[bool2]; 
    this.d.d(bool2);
    return bool1;
  }
  
  private Object d(Object paramObject, Object[] paramArrayOfObject) {
    boolean bool1;
    PrintStream printStream2;
    boolean bool2 = ((l)(printStream2 = this.d)).d;
    byte b3 = (paramArrayOfObject == null) ? 0 : paramArrayOfObject.length;
    this.d.d(bool2 + 1 + b3);
    ((l)this.d).d[bool2] = paramObject;
    for (byte b1 = 1; b1 <= b3; b1++)
      ((l)this.d).d[bool2 + b1] = paramArrayOfObject[b1 - 1]; 
    byte b2 = b3;
    PrintStream printStream1 = this.d;
    i i1;
    int j = (i1 = this).c((l)printStream1, b2);
    Object object = null;
    if (j > 0)
      bool1 = ((l)this.d).d[bool2]; 
    this.d.d(bool2);
    return bool1;
  }
  
  public static final Object d(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof j)) {
      if (paramObject1 instanceof String && paramObject2 instanceof Integer) {
        int k = ((Integer)paramObject2).intValue();
        return ((String)paramObject1).substring(k - 1, k);
      } 
      return null;
    } 
    int j = ((Integer)paramObject2).intValue();
    Object object;
    return (paramObject2 instanceof Integer && (object = ((j)paramObject1).d(j)) != null) ? object : ((j)paramObject1).d(paramObject2);
  }
  
  private static void d(Object paramObject1, Object paramObject2, Object paramObject3) {
    try {
      ((j)paramObject1).d(paramObject2, paramObject3);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      System.out.println(paramObject2);
      System.out.println(paramObject3);
      System.out.println(paramObject1);
      return;
    } 
  }
  
  public final Object[] d(Object paramObject, Object[] paramArrayOfObject) {
    byte b = (paramArrayOfObject == null) ? 0 : paramArrayOfObject.length;
    PrintStream printStream = this.d;
    l l1;
    l l2;
    boolean bool = (l2 = l1 = l1 = new l(((l)printStream).d, ((l)printStream).d)).d;
    l1.d(bool + 1 + b);
    l1.d[bool] = paramObject;
    if (b > 0)
      System.arraycopy(paramArrayOfObject, 0, l1.d, bool + 1, b); 
    int j = d(l1, b);
    a.d(true, "Thread changed in pcall");
    paramArrayOfObject = new Object[j];
    System.arraycopy(l1.d, bool, paramArrayOfObject, 0, j);
    l1.d(bool);
    return paramArrayOfObject;
  }
  
  public final Object[] d(Object paramObject) {
    return d(paramObject, (Object[])null);
  }
  
  public final int d(l paraml, int paramInt) {
    Object object;
    Throwable throwable;
    l l1;
    e e1 = (l1 = paraml).d();
    l1.d = "";
    l l3;
    int j = (l3 = l1).d - paramInt - 1;
    try {
      int m = c(paraml, paramInt);
      int k = j + m + 1;
      l1.d(k);
      l1.d(j, j + 1, m);
      l1.d[j] = Boolean.TRUE;
      return m + 1;
    } catch (g g2) {
      g g1 = null;
      object = g1.d;
      g1.printStackTrace();
    } catch (Throwable throwable2) {
      Throwable throwable1 = null;
      object = throwable1.getMessage();
      throwable1.printStackTrace();
    } 
    a.d(true, "Thread changed in pcall");
    if (e1 != null)
      e1.c(0); 
    e e2 = e1;
    l l2 = l1;
    e e3;
    while ((e3 = l2.d()) != null && e3 != e2)
      l2.d(); 
    if (object instanceof String)
      object = object; 
    l1.d(j + 4);
    l1.d[j] = Boolean.FALSE;
    l1.d[j + 1] = object;
    l1.d[j + 2] = l1.d;
    l1.d[j + 3] = throwable;
    l1.d = "";
    return 4;
  }
  
  public final j d() {
    return ((l)this.d).d;
  }
  
  public static boolean d(Object paramObject1, Object paramObject2) {
    if (paramObject1 == null || paramObject2 == null)
      return (paramObject1 == paramObject2); 
    if (paramObject1 instanceof Integer && paramObject2 instanceof Integer) {
      paramObject1 = paramObject1;
      paramObject2 = paramObject2;
      return (paramObject1.intValue() == paramObject2.intValue());
    } 
    return (paramObject1 instanceof Boolean && paramObject2 instanceof Boolean) ? paramObject1.equals(paramObject2) : ((paramObject1 == paramObject2));
  }
  
  private static double d(Object paramObject) {
    return ((Double)paramObject).intValue();
  }
  
  public static int d(Object paramObject) {
    return ((Integer)paramObject).intValue();
  }
  
  public static Integer d(int paramInt) {
    return new Integer(paramInt);
  }
  
  private static Double d(double paramDouble) {
    return new Double(paramDouble);
  }
  
  private static Integer d(long paramLong) {
    return d((int)paramLong);
  }
  
  private static Double d(long paramLong) {
    return new Double(paramLong);
  }
  
  private static boolean d(Object paramObject) {
    return !Boolean.FALSE.equals(paramObject);
  }
  
  private static Boolean d(boolean paramBoolean) {
    return paramBoolean ? Boolean.TRUE : Boolean.FALSE;
  }
  
  private static void e() {}
  
  private static void c() {}
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */