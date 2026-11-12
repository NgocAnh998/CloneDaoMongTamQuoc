package com.fs.arpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;

public final class m {
  private static Hashtable d = new Hashtable();
  
  private static at d = null;
  
  int d;
  
  boolean d;
  
  public int e;
  
  private int c;
  
  public String d;
  
  private byte[] d;
  
  private bj d;
  
  private m d = false;
  
  private int b;
  
  private int a;
  
  private int z;
  
  private boolean e;
  
  private String e;
  
  private boolean c;
  
  private static int h;
  
  public static void d() {
    if (d == null)
      d = (m)new at("/out.idx", "/out.pkg"); 
  }
  
  public m() {}
  
  public m(String paramString) {
    String str = paramString;
    m m1;
    (m1 = this).d = (m)str;
    try {
      if (m1.d.equals("ts1.dat")) {
        m1.d = (m)bi.e("/" + m1.d);
      } else {
        m1.d = (m)d.d((String)m1.d);
      } 
    } catch (Exception exception) {}
    this.d = (m)new bj();
    this.d.d((byte[])this.d);
    this.c = this.d.d();
  }
  
  public static String d(String paramString) {
    String str;
    return d.isEmpty() ? paramString : (((str = (String)d.get(paramString)) == null) ? paramString : str);
  }
  
  private static String e(String paramString) {
    if (d.isEmpty())
      return paramString; 
    Enumeration enumeration = d.keys();
    while (enumeration.hasMoreElements()) {
      String str1 = paramString;
      paramString = enumeration.nextElement();
      String str2 = (String)d.get(paramString);
      paramString = (str1.indexOf(str1) == -1) ? str1 : bi.d(str1, paramString, str2);
    } 
    return paramString;
  }
  
  public final boolean d() {
    while (this.d != null)
      this = this.d; 
    return (!e() && this.d == null);
  }
  
  public final void e() {
    ((bj)this.d).d = 0;
    this.d = false;
    this.e = Character.MIN_VALUE;
    this.d.d(2);
    d.clear();
  }
  
  public final void c() {
    this.d = false;
    this.e = this.c;
  }
  
  public final void b() {
    this.d = true;
  }
  
  public final void a() {
    while (this.d != null && this.d.d())
      this = this.d; 
    this.d = false;
  }
  
  public final void z() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual d : ()Z
    //   4: ifne -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield d : Lcom/fs/arpg/m;
    //   12: ifnull -> 49
    //   15: aload_0
    //   16: getfield d : Lcom/fs/arpg/m;
    //   19: invokevirtual d : ()Z
    //   22: ifeq -> 49
    //   25: aload_0
    //   26: getfield d : Lcom/fs/arpg/m;
    //   29: invokevirtual z : ()V
    //   32: aload_0
    //   33: getfield d : Lcom/fs/arpg/m;
    //   36: invokevirtual e : ()Z
    //   39: ifeq -> 48
    //   42: aload_0
    //   43: iconst_0
    //   44: aconst_null
    //   45: invokevirtual d : (ILjava/lang/Object;)V
    //   48: return
    //   49: aload_0
    //   50: getfield e : I
    //   53: aload_0
    //   54: getfield c : I
    //   57: if_icmpge -> 5914
    //   60: aload_0
    //   61: dup
    //   62: astore_1
    //   63: getfield d : Lcom/fs/arpg/bj;
    //   66: invokevirtual d : ()S
    //   69: pop
    //   70: aload_1
    //   71: aload_1
    //   72: getfield d : Lcom/fs/arpg/bj;
    //   75: invokevirtual d : ()B
    //   78: putfield d : I
    //   81: aload_1
    //   82: getfield d : I
    //   85: tableswitch default -> 5892, 2 -> 1109, 3 -> 1205, 4 -> 1401, 5 -> 1508, 6 -> 1707, 7 -> 1932, 8 -> 1939, 9 -> 2233, 10 -> 2273, 11 -> 2291, 12 -> 2319, 13 -> 2326, 14 -> 2333, 15 -> 2333, 16 -> 2336, 17 -> 2362, 18 -> 2388, 19 -> 2431, 20 -> 2657, 21 -> 2628, 22 -> 2463, 23 -> 2635, 24 -> 820, 25 -> 2664, 26 -> 5892, 27 -> 2771, 28 -> 2851, 29 -> 4398, 30 -> 2858, 31 -> 5892, 32 -> 4043, 33 -> 2865, 34 -> 2997, 35 -> 5892, 36 -> 901, 37 -> 3411, 38 -> 3461, 39 -> 919, 40 -> 5892, 41 -> 5892, 42 -> 4638, 43 -> 3503, 44 -> 5892, 45 -> 3658, 46 -> 3767, 47 -> 5892, 48 -> 3834, 49 -> 3909, 50 -> 3949, 51 -> 4409, 52 -> 4568, 53 -> 3956, 54 -> 5892, 55 -> 3963, 56 -> 5892, 57 -> 4608, 58 -> 631, 59 -> 5892, 60 -> 4590, 61 -> 926, 62 -> 5892, 63 -> 4033, 64 -> 4036, 65 -> 5892, 66 -> 898, 67 -> 867, 68 -> 5892, 69 -> 5892, 70 -> 5892, 71 -> 5892, 72 -> 5892, 73 -> 5892, 74 -> 5892, 75 -> 4358, 76 -> 4675, 77 -> 5892, 78 -> 4719, 79 -> 4837, 80 -> 4943, 81 -> 5069, 82 -> 5112, 83 -> 5275, 84 -> 5293, 85 -> 5410, 86 -> 5434, 87 -> 5461, 88 -> 5539, 89 -> 5587, 90 -> 5594, 91 -> 796, 92 -> 778, 93 -> 775, 94 -> 735, 95 -> 5597, 96 -> 3370, 97 -> 3319, 98 -> 3202, 99 -> 5643, 100 -> 5786, 101 -> 5857, 102 -> 5793, 103 -> 2470, 104 -> 2608, 105 -> 2621, 106 -> 728, 107 -> 721, 108 -> 693, 109 -> 653, 110 -> 601, 111 -> 540
    //   540: aload_1
    //   541: dup
    //   542: astore_1
    //   543: getfield d : Lcom/fs/arpg/bj;
    //   546: invokevirtual d : ()Ljava/lang/String;
    //   549: astore_2
    //   550: aload_1
    //   551: getfield d : Lcom/fs/arpg/bj;
    //   554: invokevirtual d : ()Ljava/lang/String;
    //   557: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   560: astore_3
    //   561: new java/lang/StringBuffer
    //   564: dup
    //   565: invokespecial <init> : ()V
    //   568: getstatic com/fs/arpg/m.d : Ljava/util/Hashtable;
    //   571: aload_2
    //   572: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   575: checkcast java/lang/String
    //   578: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   581: aload_3
    //   582: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   585: invokevirtual toString : ()Ljava/lang/String;
    //   588: astore_3
    //   589: getstatic com/fs/arpg/m.d : Ljava/util/Hashtable;
    //   592: aload_2
    //   593: aload_3
    //   594: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   597: pop
    //   598: goto -> 5896
    //   601: aload_1
    //   602: dup
    //   603: astore_1
    //   604: getfield d : Lcom/fs/arpg/bj;
    //   607: invokevirtual d : ()Ljava/lang/String;
    //   610: astore_2
    //   611: aload_1
    //   612: getfield d : Lcom/fs/arpg/bj;
    //   615: invokevirtual d : ()Ljava/lang/String;
    //   618: astore_3
    //   619: getstatic com/fs/arpg/m.d : Ljava/util/Hashtable;
    //   622: aload_2
    //   623: aload_3
    //   624: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   627: pop
    //   628: goto -> 5896
    //   631: aload_1
    //   632: getfield d : Lcom/fs/arpg/bj;
    //   635: invokevirtual d : ()B
    //   638: sipush #255
    //   641: iand
    //   642: istore_2
    //   643: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   646: iload_2
    //   647: invokevirtual z : (I)V
    //   650: goto -> 5896
    //   653: aload_1
    //   654: dup
    //   655: astore_1
    //   656: getfield d : Lcom/fs/arpg/bj;
    //   659: invokevirtual d : ()Z
    //   662: istore_2
    //   663: aload_1
    //   664: getfield d : Lcom/fs/arpg/bj;
    //   667: invokevirtual d : ()I
    //   670: istore_3
    //   671: aload_1
    //   672: getfield d : Lcom/fs/arpg/bj;
    //   675: invokevirtual d : ()Ljava/lang/String;
    //   678: astore #5
    //   680: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   683: aload #5
    //   685: iload_3
    //   686: iload_2
    //   687: invokevirtual d : (Ljava/lang/String;IZ)V
    //   690: goto -> 5896
    //   693: aload_1
    //   694: getfield d : Lcom/fs/arpg/bj;
    //   697: invokevirtual d : ()Z
    //   700: ifeq -> 712
    //   703: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   706: invokevirtual e : ()V
    //   709: goto -> 5896
    //   712: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   715: invokevirtual d : ()V
    //   718: goto -> 5896
    //   721: aload_1
    //   722: invokespecial k : ()V
    //   725: goto -> 5896
    //   728: aload_1
    //   729: invokespecial l : ()V
    //   732: goto -> 5896
    //   735: aload_1
    //   736: dup
    //   737: astore_1
    //   738: getfield d : Lcom/fs/arpg/bj;
    //   741: invokevirtual d : ()Z
    //   744: istore_2
    //   745: aload_1
    //   746: getfield d : Lcom/fs/arpg/bj;
    //   749: invokevirtual d : ()B
    //   752: istore_3
    //   753: aload_1
    //   754: getfield d : Lcom/fs/arpg/bj;
    //   757: invokevirtual d : ()I
    //   760: istore #5
    //   762: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   765: iload_2
    //   766: iload_3
    //   767: iload #5
    //   769: invokevirtual d : (ZII)V
    //   772: goto -> 5896
    //   775: goto -> 5896
    //   778: aload_1
    //   779: getfield d : Lcom/fs/arpg/bj;
    //   782: invokevirtual d : ()Ljava/lang/String;
    //   785: astore_2
    //   786: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   789: aload_2
    //   790: invokevirtual e : (Ljava/lang/String;)V
    //   793: goto -> 5896
    //   796: aload_1
    //   797: dup
    //   798: astore_1
    //   799: iconst_1
    //   800: putfield d : Z
    //   803: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   806: aload_1
    //   807: putfield e : Lcom/fs/arpg/m;
    //   810: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   813: iconst_1
    //   814: invokevirtual d : (Z)V
    //   817: goto -> 5896
    //   820: aload_1
    //   821: dup
    //   822: astore_1
    //   823: iconst_1
    //   824: putfield d : Z
    //   827: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   830: aload_1
    //   831: putfield e : Lcom/fs/arpg/m;
    //   834: aload_1
    //   835: aload_1
    //   836: getfield d : Lcom/fs/arpg/bj;
    //   839: invokevirtual d : ()S
    //   842: putfield b : I
    //   845: invokestatic d : ()Lcom/fs/arpg/n;
    //   848: aload_1
    //   849: getfield b : I
    //   852: i2s
    //   853: invokevirtual d : (S)Ljavax/microedition/lcdui/Image;
    //   856: astore_2
    //   857: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   860: aload_2
    //   861: invokevirtual d : (Ljavax/microedition/lcdui/Image;)V
    //   864: goto -> 5896
    //   867: aload_1
    //   868: getfield d : Lcom/fs/arpg/bj;
    //   871: invokevirtual d : ()Z
    //   874: istore_2
    //   875: invokestatic d : ()Lcom/fs/arpg/l;
    //   878: invokevirtual z : ()V
    //   881: iload_2
    //   882: putstatic com/fs/arpg/l.d : Z
    //   885: iload_2
    //   886: ifeq -> 895
    //   889: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   892: invokevirtual m : ()V
    //   895: goto -> 5896
    //   898: goto -> 5896
    //   901: aload_1
    //   902: getfield d : Lcom/fs/arpg/bj;
    //   905: invokevirtual d : ()Z
    //   908: istore_2
    //   909: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   912: iload_2
    //   913: invokevirtual e : (Z)V
    //   916: goto -> 5896
    //   919: aload_1
    //   920: invokespecial m : ()V
    //   923: goto -> 5896
    //   926: aload_1
    //   927: dup
    //   928: astore_1
    //   929: iconst_1
    //   930: putfield d : Z
    //   933: aload_1
    //   934: getfield d : Lcom/fs/arpg/bj;
    //   937: invokevirtual d : ()B
    //   940: istore_3
    //   941: new java/lang/String
    //   944: dup
    //   945: invokestatic d : ()Lcom/fs/arpg/bg;
    //   948: bipush #113
    //   950: invokevirtual d : (S)[C
    //   953: invokespecial <init> : ([C)V
    //   956: astore #5
    //   958: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ac;
    //   961: aload_1
    //   962: putfield d : Lcom/fs/arpg/m;
    //   965: iload_3
    //   966: ifne -> 988
    //   969: getstatic com/fs/arpg/ac.z : Z
    //   972: ifeq -> 988
    //   975: aload #5
    //   977: iconst_1
    //   978: invokestatic d : (Ljava/lang/String;I)V
    //   981: aload_1
    //   982: invokevirtual a : ()V
    //   985: goto -> 5896
    //   988: iload_3
    //   989: iconst_5
    //   990: if_icmpne -> 1012
    //   993: getstatic com/fs/arpg/ac.b : Z
    //   996: ifeq -> 1012
    //   999: aload #5
    //   1001: iconst_1
    //   1002: invokestatic d : (Ljava/lang/String;I)V
    //   1005: aload_1
    //   1006: invokevirtual a : ()V
    //   1009: goto -> 5896
    //   1012: aload #5
    //   1014: iconst_0
    //   1015: invokestatic d : (Ljava/lang/String;I)V
    //   1018: new java/lang/StringBuffer
    //   1021: dup
    //   1022: invokespecial <init> : ()V
    //   1025: astore #7
    //   1027: iload_3
    //   1028: ifne -> 1050
    //   1031: aload #7
    //   1033: ldc 'Mở ra toàn bộ nội dung tiếp theo của trò chơi hưởng thụ niềm vui thú! Tặng {20000 kim, 5 Tứ Đẳng Thiết, 5  Tứ Đẳng Bố, 3 Thần Thủy }.'
    //   1035: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1038: pop
    //   1039: aload #7
    //   1041: ldc '& Lập tức mở toàn bộ nội dung trò chơi không?'
    //   1043: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1046: pop
    //   1047: goto -> 1071
    //   1050: iload_3
    //   1051: iconst_5
    //   1052: if_icmpne -> 1071
    //   1055: aload #7
    //   1057: ldc 'Phá Bảo Quyết: Mở bảo rương bị khóa { không cần chìa khóa }; Đồng thời tặng { gấp đôi tiền tài }.'
    //   1059: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1062: pop
    //   1063: aload #7
    //   1065: ldc '& Có lập tức mở Phá Bảo Quyết không?'
    //   1067: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1070: pop
    //   1071: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1074: getfield d : Lcom/fs/arpg/j;
    //   1077: bipush #20
    //   1079: putfield d : I
    //   1082: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1085: getfield d : Lcom/fs/arpg/j;
    //   1088: aload #7
    //   1090: invokevirtual toString : ()Ljava/lang/String;
    //   1093: invokevirtual toCharArray : ()[C
    //   1096: invokevirtual c : ([C)V
    //   1099: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ac;
    //   1102: iload_3
    //   1103: putfield d : I
    //   1106: goto -> 5896
    //   1109: aload_1
    //   1110: getfield d : Lcom/fs/arpg/bj;
    //   1113: invokevirtual d : ()Ljava/lang/String;
    //   1116: astore_2
    //   1117: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1120: ifnull -> 1134
    //   1123: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1126: ldc 'CreateActor ERROR:Actor has existed!'
    //   1128: invokevirtual println : (Ljava/lang/String;)V
    //   1131: goto -> 5896
    //   1134: new com/fs/arpg/p
    //   1137: dup
    //   1138: invokespecial <init> : ()V
    //   1141: dup
    //   1142: astore_3
    //   1143: aload_2
    //   1144: putfield d : Ljava/lang/String;
    //   1147: aload_3
    //   1148: putstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1151: aload_3
    //   1152: ldc 'role1.dat'
    //   1154: invokevirtual d : (Ljava/lang/String;)V
    //   1157: aload_3
    //   1158: invokevirtual i : ()V
    //   1161: invokestatic e : ()V
    //   1164: aload_3
    //   1165: iconst_1
    //   1166: putfield b : I
    //   1169: aload_3
    //   1170: invokevirtual z : ()V
    //   1173: aload_3
    //   1174: iconst_m1
    //   1175: putfield R : I
    //   1178: aload_3
    //   1179: invokevirtual j : ()V
    //   1182: aload_3
    //   1183: invokevirtual s : ()V
    //   1186: aload_3
    //   1187: aload_3
    //   1188: getfield g : I
    //   1191: putfield z : I
    //   1194: aload_3
    //   1195: aload_3
    //   1196: getfield t : I
    //   1199: putfield q : I
    //   1202: goto -> 5896
    //   1205: aload_1
    //   1206: dup
    //   1207: astore_1
    //   1208: getfield d : Lcom/fs/arpg/bj;
    //   1211: invokevirtual d : ()Ljava/lang/String;
    //   1214: astore_2
    //   1215: aload_1
    //   1216: getfield d : Lcom/fs/arpg/bj;
    //   1219: invokevirtual d : ()Ljava/lang/String;
    //   1222: astore_3
    //   1223: aload_1
    //   1224: getfield d : Lcom/fs/arpg/bj;
    //   1227: invokevirtual d : ()B
    //   1230: istore #5
    //   1232: invokestatic d : ()Lcom/fs/arpg/l;
    //   1235: dup
    //   1236: astore #6
    //   1238: aload_2
    //   1239: astore #9
    //   1241: astore #8
    //   1243: aload #9
    //   1245: invokestatic d : (Ljava/lang/String;)S
    //   1248: istore_1
    //   1249: aload #8
    //   1251: getfield d : Lcom/fs/arpg/bh;
    //   1254: iload_1
    //   1255: invokevirtual d : (S)Ljava/lang/Object;
    //   1258: checkcast com/fs/arpg/as
    //   1261: dup
    //   1262: astore_2
    //   1263: ifnonnull -> 1295
    //   1266: new com/fs/arpg/as
    //   1269: dup
    //   1270: invokespecial <init> : ()V
    //   1273: dup
    //   1274: astore_2
    //   1275: iload_1
    //   1276: putfield d : S
    //   1279: aload_2
    //   1280: aload #9
    //   1282: invokevirtual d : (Ljava/lang/String;)V
    //   1285: aload #8
    //   1287: getfield d : Lcom/fs/arpg/bh;
    //   1290: iload_1
    //   1291: aload_2
    //   1292: invokevirtual d : (SLjava/lang/Object;)V
    //   1295: aload_2
    //   1296: astore #4
    //   1298: aload #6
    //   1300: getfield d : Ljava/util/Hashtable;
    //   1303: aload_3
    //   1304: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1307: ifne -> 1398
    //   1310: new com/fs/arpg/x
    //   1313: dup
    //   1314: invokespecial <init> : ()V
    //   1317: dup
    //   1318: astore #7
    //   1320: aload #4
    //   1322: invokevirtual d : (Lcom/fs/arpg/as;)V
    //   1325: aload #7
    //   1327: aload_3
    //   1328: putfield d : Ljava/lang/String;
    //   1331: aload #7
    //   1333: iload #5
    //   1335: putfield m : I
    //   1338: aload #7
    //   1340: iconst_0
    //   1341: invokevirtual d : (I)V
    //   1344: aload #7
    //   1346: aload #4
    //   1348: getfield b : Z
    //   1351: putfield l : Z
    //   1354: aload #7
    //   1356: iconst_2
    //   1357: putfield d : I
    //   1360: aload #4
    //   1362: getfield h : I
    //   1365: iconst_1
    //   1366: if_icmpne -> 1381
    //   1369: aload #7
    //   1371: iconst_0
    //   1372: putfield o : Z
    //   1375: aload #7
    //   1377: iconst_0
    //   1378: invokevirtual b : (Z)V
    //   1381: aload #7
    //   1383: invokevirtual z : ()V
    //   1386: aload #7
    //   1388: invokevirtual k : ()V
    //   1391: aload #6
    //   1393: aload #7
    //   1395: invokevirtual e : (Lcom/fs/arpg/x;)V
    //   1398: goto -> 5896
    //   1401: aload_1
    //   1402: dup
    //   1403: astore_1
    //   1404: getfield d : Lcom/fs/arpg/bj;
    //   1407: invokevirtual d : ()Ljava/lang/String;
    //   1410: astore_2
    //   1411: aload_1
    //   1412: getfield d : Lcom/fs/arpg/bj;
    //   1415: invokevirtual d : ()B
    //   1418: sipush #255
    //   1421: iand
    //   1422: istore_3
    //   1423: invokestatic d : ()Lcom/fs/arpg/l;
    //   1426: dup
    //   1427: astore #5
    //   1429: aload_2
    //   1430: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   1433: dup
    //   1434: astore #6
    //   1436: ifnull -> 1453
    //   1439: aload #6
    //   1441: iload_3
    //   1442: putfield b : I
    //   1445: aload #6
    //   1447: invokevirtual z : ()V
    //   1450: goto -> 5896
    //   1453: aload_2
    //   1454: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1457: getfield d : Ljava/lang/String;
    //   1460: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1463: ifeq -> 1482
    //   1466: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1469: iload_3
    //   1470: putfield b : I
    //   1473: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1476: invokevirtual z : ()V
    //   1479: goto -> 5896
    //   1482: aload #5
    //   1484: aload_2
    //   1485: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/ae;
    //   1488: dup
    //   1489: astore #4
    //   1491: ifnull -> 1505
    //   1494: aload #4
    //   1496: iload_3
    //   1497: putfield b : I
    //   1500: aload #4
    //   1502: invokevirtual a : ()V
    //   1505: goto -> 5896
    //   1508: aload_1
    //   1509: dup
    //   1510: astore_1
    //   1511: getfield d : Lcom/fs/arpg/bj;
    //   1514: invokevirtual d : ()Ljava/lang/String;
    //   1517: astore_2
    //   1518: aload_1
    //   1519: getfield d : Lcom/fs/arpg/bj;
    //   1522: invokevirtual d : ()S
    //   1525: istore_3
    //   1526: aload_1
    //   1527: getfield d : Lcom/fs/arpg/bj;
    //   1530: invokevirtual d : ()S
    //   1533: istore #5
    //   1535: aload_1
    //   1536: getfield d : Lcom/fs/arpg/bj;
    //   1539: invokevirtual d : ()Z
    //   1542: istore #6
    //   1544: invokestatic d : ()Lcom/fs/arpg/l;
    //   1547: dup
    //   1548: astore #4
    //   1550: aload_2
    //   1551: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   1554: dup
    //   1555: astore #7
    //   1557: ifnull -> 1594
    //   1560: aload #7
    //   1562: iload_3
    //   1563: iload #5
    //   1565: invokevirtual e : (II)V
    //   1568: aload #7
    //   1570: iload_3
    //   1571: iload #5
    //   1573: invokevirtual d : (II)V
    //   1576: aload #7
    //   1578: invokevirtual b : ()Z
    //   1581: ifeq -> 1591
    //   1584: aload #7
    //   1586: iload #6
    //   1588: invokevirtual b : (Z)V
    //   1591: goto -> 5896
    //   1594: aload_2
    //   1595: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1598: getfield d : Ljava/lang/String;
    //   1601: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1604: ifeq -> 1673
    //   1607: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1610: iload_3
    //   1611: iload #5
    //   1613: invokevirtual e : (II)V
    //   1616: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1619: invokevirtual m : ()V
    //   1622: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1625: dup
    //   1626: astore #9
    //   1628: getfield s : Z
    //   1631: ifne -> 1670
    //   1634: aload #9
    //   1636: getfield r : Z
    //   1639: ifne -> 1670
    //   1642: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1645: ifnull -> 1670
    //   1648: aload #9
    //   1650: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1653: getfield ab : I
    //   1656: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1659: getfield ac : I
    //   1662: invokevirtual e : (II)V
    //   1665: aload #9
    //   1667: invokevirtual f : ()V
    //   1670: goto -> 5896
    //   1673: aload #4
    //   1675: aload_2
    //   1676: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/ae;
    //   1679: dup
    //   1680: astore #8
    //   1682: ifnull -> 1704
    //   1685: aload #8
    //   1687: iload_3
    //   1688: iload #5
    //   1690: istore_2
    //   1691: istore_1
    //   1692: astore #9
    //   1694: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1697: aload #9
    //   1699: iload_1
    //   1700: iload_2
    //   1701: invokevirtual d : (Lcom/fs/arpg/be;II)V
    //   1704: goto -> 5896
    //   1707: aload_1
    //   1708: dup
    //   1709: astore_1
    //   1710: getfield d : Lcom/fs/arpg/bj;
    //   1713: invokevirtual d : ()Ljava/lang/String;
    //   1716: astore_2
    //   1717: aload_1
    //   1718: getfield d : Lcom/fs/arpg/bj;
    //   1721: invokevirtual d : ()Z
    //   1724: istore_3
    //   1725: invokestatic d : ()Lcom/fs/arpg/l;
    //   1728: dup
    //   1729: astore #5
    //   1731: aload_2
    //   1732: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   1735: dup
    //   1736: astore #6
    //   1738: ifnull -> 1818
    //   1741: iload_3
    //   1742: ifne -> 1759
    //   1745: aload #6
    //   1747: invokevirtual i : ()V
    //   1750: aload #6
    //   1752: iconst_0
    //   1753: putfield g : Z
    //   1756: goto -> 5896
    //   1759: aload #6
    //   1761: getfield g : Z
    //   1764: ifne -> 1815
    //   1767: aload #6
    //   1769: iconst_1
    //   1770: putfield g : Z
    //   1773: aload #5
    //   1775: aload #6
    //   1777: invokevirtual d : (Lcom/fs/arpg/x;)V
    //   1780: aload #6
    //   1782: invokevirtual z : ()V
    //   1785: aload #6
    //   1787: getfield d : Lcom/fs/arpg/as;
    //   1790: getfield a : Z
    //   1793: ifeq -> 1807
    //   1796: getstatic com/fs/arpg/ba.c : Lcom/fs/arpg/am;
    //   1799: aload #6
    //   1801: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   1804: goto -> 5896
    //   1807: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1810: aload #6
    //   1812: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   1815: goto -> 5896
    //   1818: aload #5
    //   1820: aload_2
    //   1821: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/ae;
    //   1824: dup
    //   1825: astore #4
    //   1827: ifnull -> 1868
    //   1830: iload_3
    //   1831: ifne -> 1851
    //   1834: aload #4
    //   1836: iconst_0
    //   1837: putfield g : Z
    //   1840: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1843: aload #4
    //   1845: invokevirtual d : (Lcom/fs/arpg/be;)V
    //   1848: goto -> 5896
    //   1851: aload #4
    //   1853: iconst_1
    //   1854: putfield g : Z
    //   1857: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1860: aload #4
    //   1862: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   1865: goto -> 5896
    //   1868: aload_2
    //   1869: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1872: getfield d : Ljava/lang/String;
    //   1875: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1878: ifeq -> 1929
    //   1881: iload_3
    //   1882: ifne -> 1904
    //   1885: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1888: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1891: invokevirtual d : (Lcom/fs/arpg/be;)V
    //   1894: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1897: iconst_0
    //   1898: putfield g : Z
    //   1901: goto -> 5896
    //   1904: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1907: getfield g : Z
    //   1910: ifne -> 1929
    //   1913: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1916: iconst_1
    //   1917: putfield g : Z
    //   1920: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   1923: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1926: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   1929: goto -> 5896
    //   1932: aload_1
    //   1933: invokespecial x : ()V
    //   1936: goto -> 5896
    //   1939: aload_1
    //   1940: dup
    //   1941: astore_1
    //   1942: iconst_1
    //   1943: putfield d : Z
    //   1946: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1949: dup
    //   1950: astore_2
    //   1951: aload_1
    //   1952: getfield d : Lcom/fs/arpg/bj;
    //   1955: invokevirtual d : ()Ljava/lang/String;
    //   1958: invokevirtual toCharArray : ()[C
    //   1961: putfield d : [C
    //   1964: aload_2
    //   1965: aload_1
    //   1966: getfield d : Lcom/fs/arpg/bj;
    //   1969: invokevirtual d : ()Ljava/lang/String;
    //   1972: invokevirtual toCharArray : ()[C
    //   1975: putfield e : [C
    //   1978: new java/lang/String
    //   1981: dup
    //   1982: aload_2
    //   1983: getfield e : [C
    //   1986: invokespecial <init> : ([C)V
    //   1989: dup
    //   1990: astore_3
    //   1991: ldc 'Nhấn nút 9 để phát chiêu Chung kết kỹ.'
    //   1993: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1996: ifeq -> 2002
    //   1999: ldc 'Nhấn nút D để phát chiêu Chung kết kỹ.'
    //   2001: astore_3
    //   2002: aload_2
    //   2003: aload_3
    //   2004: invokevirtual toCharArray : ()[C
    //   2007: putfield e : [C
    //   2010: aload_2
    //   2011: aload_1
    //   2012: getfield d : Lcom/fs/arpg/bj;
    //   2015: invokevirtual d : ()S
    //   2018: putfield d : S
    //   2021: aload_2
    //   2022: aload_1
    //   2023: getfield d : Lcom/fs/arpg/bj;
    //   2026: invokevirtual d : ()B
    //   2029: i2s
    //   2030: putfield e : S
    //   2033: aload_2
    //   2034: aload_1
    //   2035: getfield d : Lcom/fs/arpg/bj;
    //   2038: invokevirtual d : ()Z
    //   2041: putfield z : Z
    //   2044: aload_2
    //   2045: astore #5
    //   2047: new com/fs/arpg/h
    //   2050: dup
    //   2051: invokespecial <init> : ()V
    //   2054: astore #6
    //   2056: aload #5
    //   2058: bipush #10
    //   2060: putfield h : I
    //   2063: aload #5
    //   2065: iconst_0
    //   2066: putfield g : I
    //   2069: aload #5
    //   2071: iconst_0
    //   2072: putfield f : I
    //   2075: aload #5
    //   2077: iconst_0
    //   2078: putfield i : I
    //   2081: aload #5
    //   2083: iconst_0
    //   2084: putfield j : I
    //   2087: aload #5
    //   2089: getfield d : S
    //   2092: ifle -> 2115
    //   2095: aload #5
    //   2097: getfield d : S
    //   2100: bipush #69
    //   2102: if_icmpeq -> 2115
    //   2105: aload #5
    //   2107: getfield d : S
    //   2110: bipush #72
    //   2112: if_icmpne -> 2124
    //   2115: aload #5
    //   2117: iconst_0
    //   2118: putfield d : S
    //   2121: goto -> 2205
    //   2124: aload #5
    //   2126: getfield d : Lcom/fs/arpg/v;
    //   2129: aload #5
    //   2131: getfield d : S
    //   2134: aload #5
    //   2136: getfield c : Lcom/fs/arpg/be;
    //   2139: invokevirtual d : (SLcom/fs/arpg/be;)V
    //   2142: aload #5
    //   2144: getfield c : Lcom/fs/arpg/be;
    //   2147: aload #5
    //   2149: getfield e : S
    //   2152: putfield c : S
    //   2155: aload #5
    //   2157: getfield c : Lcom/fs/arpg/be;
    //   2160: invokevirtual d : ()V
    //   2163: aload #5
    //   2165: iconst_3
    //   2166: putfield a : I
    //   2169: aload #5
    //   2171: getfield c : Lcom/fs/arpg/be;
    //   2174: aload #6
    //   2176: invokevirtual c : (Lcom/fs/arpg/h;)V
    //   2179: aload #5
    //   2181: aload #6
    //   2183: getfield b : I
    //   2186: putfield z : I
    //   2189: aload #5
    //   2191: getfield z : Z
    //   2194: ifne -> 2205
    //   2197: aload #5
    //   2199: sipush #317
    //   2202: putfield a : I
    //   2205: aload #5
    //   2207: iconst_1
    //   2208: putfield h : Z
    //   2211: aload #5
    //   2213: iconst_1
    //   2214: putfield a : Z
    //   2217: aload_2
    //   2218: aload_1
    //   2219: putfield e : Lcom/fs/arpg/m;
    //   2222: aload_2
    //   2223: getfield d : Lcom/fs/arpg/t;
    //   2226: iconst_0
    //   2227: putfield d : I
    //   2230: goto -> 5896
    //   2233: aload_1
    //   2234: getfield d : Lcom/fs/arpg/bj;
    //   2237: invokevirtual d : ()Z
    //   2240: dup
    //   2241: istore_2
    //   2242: ifne -> 2252
    //   2245: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2248: iconst_0
    //   2249: putfield q : Z
    //   2252: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2255: iload_2
    //   2256: putfield g : Z
    //   2259: iload_2
    //   2260: ifne -> 2270
    //   2263: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   2266: iconst_0
    //   2267: putfield m : Z
    //   2270: goto -> 5896
    //   2273: aload_1
    //   2274: getfield d : Lcom/fs/arpg/bj;
    //   2277: invokevirtual d : ()Z
    //   2280: istore_2
    //   2281: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2284: iload_2
    //   2285: putfield f : Z
    //   2288: goto -> 5896
    //   2291: aload_1
    //   2292: getfield d : Lcom/fs/arpg/bj;
    //   2295: invokevirtual d : ()Ljava/lang/String;
    //   2298: astore_2
    //   2299: new com/fs/arpg/b
    //   2302: dup
    //   2303: aload_2
    //   2304: invokespecial <init> : (Ljava/lang/String;)V
    //   2307: putstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   2310: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2313: invokevirtual p : ()V
    //   2316: goto -> 5896
    //   2319: aload_1
    //   2320: invokespecial n : ()V
    //   2323: goto -> 5896
    //   2326: aload_1
    //   2327: invokespecial n : ()V
    //   2330: goto -> 5896
    //   2333: goto -> 5896
    //   2336: aload_1
    //   2337: dup
    //   2338: astore_1
    //   2339: getfield d : Lcom/fs/arpg/bj;
    //   2342: invokevirtual d : ()Ljava/lang/String;
    //   2345: astore_2
    //   2346: aload_1
    //   2347: getfield d : Lcom/fs/arpg/bj;
    //   2350: invokevirtual d : ()I
    //   2353: istore_3
    //   2354: aload_2
    //   2355: iload_3
    //   2356: invokestatic d : (Ljava/lang/String;I)V
    //   2359: goto -> 5896
    //   2362: aload_1
    //   2363: dup
    //   2364: astore_1
    //   2365: getfield d : Lcom/fs/arpg/bj;
    //   2368: invokevirtual d : ()Ljava/lang/String;
    //   2371: astore_2
    //   2372: aload_1
    //   2373: getfield d : Lcom/fs/arpg/bj;
    //   2376: invokevirtual d : ()I
    //   2379: istore_3
    //   2380: aload_2
    //   2381: iload_3
    //   2382: invokestatic e : (Ljava/lang/String;I)V
    //   2385: goto -> 5896
    //   2388: aload_1
    //   2389: dup
    //   2390: astore_1
    //   2391: iconst_1
    //   2392: putfield d : Z
    //   2395: aload_1
    //   2396: getfield d : Lcom/fs/arpg/bj;
    //   2399: invokevirtual d : ()S
    //   2402: istore_2
    //   2403: aload_1
    //   2404: getfield d : Lcom/fs/arpg/bj;
    //   2407: invokevirtual d : ()S
    //   2410: istore_3
    //   2411: aload_1
    //   2412: getfield d : Lcom/fs/arpg/bj;
    //   2415: invokevirtual d : ()Z
    //   2418: istore #5
    //   2420: aload_1
    //   2421: iload_2
    //   2422: iload_3
    //   2423: iload #5
    //   2425: invokespecial d : (IIZ)V
    //   2428: goto -> 5896
    //   2431: aload_1
    //   2432: dup
    //   2433: astore_1
    //   2434: getfield d : Lcom/fs/arpg/bj;
    //   2437: invokevirtual d : ()Ljava/lang/String;
    //   2440: astore_2
    //   2441: aload_1
    //   2442: getfield d : Lcom/fs/arpg/bj;
    //   2445: invokevirtual d : ()Z
    //   2448: istore_3
    //   2449: invokestatic d : ()Lcom/fs/arpg/l;
    //   2452: aload_2
    //   2453: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   2456: iload_3
    //   2457: putfield l : Z
    //   2460: goto -> 5896
    //   2463: aload_1
    //   2464: invokespecial v : ()V
    //   2467: goto -> 5896
    //   2470: aload_1
    //   2471: dup
    //   2472: astore_1
    //   2473: iconst_1
    //   2474: putfield d : Z
    //   2477: aload_1
    //   2478: getfield d : Lcom/fs/arpg/bj;
    //   2481: invokevirtual d : ()S
    //   2484: istore_2
    //   2485: aload_1
    //   2486: getfield d : Lcom/fs/arpg/bj;
    //   2489: invokevirtual d : ()S
    //   2492: istore_3
    //   2493: aload_1
    //   2494: getfield d : Lcom/fs/arpg/bj;
    //   2497: invokevirtual d : ()S
    //   2500: istore #5
    //   2502: aload_1
    //   2503: getfield d : Lcom/fs/arpg/bj;
    //   2506: invokevirtual d : ()S
    //   2509: istore #6
    //   2511: aload_1
    //   2512: getfield d : Lcom/fs/arpg/bj;
    //   2515: invokevirtual d : ()S
    //   2518: istore #4
    //   2520: aload_1
    //   2521: getfield d : Lcom/fs/arpg/bj;
    //   2524: invokevirtual d : ()S
    //   2527: istore #7
    //   2529: new com/fs/arpg/be
    //   2532: dup
    //   2533: invokespecial <init> : ()V
    //   2536: astore #8
    //   2538: invokestatic d : ()Lcom/fs/arpg/v;
    //   2541: iload_2
    //   2542: i2s
    //   2543: aload #8
    //   2545: invokevirtual d : (SLcom/fs/arpg/be;)V
    //   2548: aload #8
    //   2550: iload_3
    //   2551: i2s
    //   2552: putfield c : S
    //   2555: aload #8
    //   2557: iload #5
    //   2559: putfield ab : I
    //   2562: aload #8
    //   2564: iload #6
    //   2566: putfield ac : I
    //   2569: aload #8
    //   2571: invokevirtual v : ()V
    //   2574: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2577: aload_1
    //   2578: putfield e : Lcom/fs/arpg/m;
    //   2581: invokestatic d : ()Lcom/fs/arpg/n;
    //   2584: aload #8
    //   2586: getfield d : Ljavax/microedition/lcdui/Image;
    //   2589: invokevirtual d : (Ljavax/microedition/lcdui/Image;)V
    //   2592: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2595: aload #8
    //   2597: iconst_1
    //   2598: iload #4
    //   2600: iload #7
    //   2602: invokevirtual d : (Lcom/fs/arpg/be;ZII)V
    //   2605: goto -> 5896
    //   2608: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2611: aconst_null
    //   2612: iconst_0
    //   2613: iconst_0
    //   2614: iconst_0
    //   2615: invokevirtual d : (Lcom/fs/arpg/be;ZII)V
    //   2618: goto -> 5896
    //   2621: aload_1
    //   2622: invokespecial i : ()V
    //   2625: goto -> 5896
    //   2628: aload_1
    //   2629: invokespecial u : ()V
    //   2632: goto -> 5896
    //   2635: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2638: aload_1
    //   2639: putfield e : Lcom/fs/arpg/m;
    //   2642: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2645: invokevirtual b : ()V
    //   2648: invokestatic d : ()Lcom/fs/arpg/d;
    //   2651: invokevirtual d : ()V
    //   2654: goto -> 5896
    //   2657: aload_1
    //   2658: invokespecial t : ()V
    //   2661: goto -> 5896
    //   2664: aload_1
    //   2665: dup
    //   2666: astore_1
    //   2667: iconst_1
    //   2668: putfield d : Z
    //   2671: aload_1
    //   2672: getfield d : Lcom/fs/arpg/bj;
    //   2675: invokevirtual d : ()S
    //   2678: istore_2
    //   2679: invokestatic d : ()Lcom/fs/arpg/d;
    //   2682: iload_2
    //   2683: invokevirtual d : (S)Lcom/fs/arpg/al;
    //   2686: dup
    //   2687: astore #5
    //   2689: getfield c : Z
    //   2692: ifne -> 2768
    //   2695: aload #5
    //   2697: iconst_1
    //   2698: putfield c : Z
    //   2701: aload #5
    //   2703: invokevirtual d : ()V
    //   2706: new java/lang/StringBuffer
    //   2709: dup
    //   2710: invokespecial <init> : ()V
    //   2713: astore #6
    //   2715: invokestatic d : ()Lcom/fs/arpg/bg;
    //   2718: bipush #23
    //   2720: aload #6
    //   2722: invokevirtual d : (SLjava/lang/StringBuffer;)V
    //   2725: aload #6
    //   2727: ldc ':'
    //   2729: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2732: pop
    //   2733: aload #6
    //   2735: aload #5
    //   2737: getfield d : [C
    //   2740: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   2743: pop
    //   2744: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2747: aload_1
    //   2748: putfield e : Lcom/fs/arpg/m;
    //   2751: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2754: getfield d : Lcom/fs/arpg/j;
    //   2757: aload #6
    //   2759: invokevirtual toString : ()Ljava/lang/String;
    //   2762: invokevirtual toCharArray : ()[C
    //   2765: invokevirtual d : ([C)V
    //   2768: goto -> 5896
    //   2771: aload_1
    //   2772: dup
    //   2773: astore_1
    //   2774: iconst_1
    //   2775: putfield d : Z
    //   2778: iconst_1
    //   2779: putstatic com/fs/arpg/an.b : Z
    //   2782: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2785: iconst_0
    //   2786: putfield k : Z
    //   2789: aload_1
    //   2790: getfield d : Lcom/fs/arpg/bj;
    //   2793: invokevirtual d : ()Ljava/lang/String;
    //   2796: astore_2
    //   2797: aload_1
    //   2798: getfield d : Lcom/fs/arpg/bj;
    //   2801: invokevirtual d : ()Ljava/lang/String;
    //   2804: dup
    //   2805: astore_3
    //   2806: ifnull -> 2829
    //   2809: aload_3
    //   2810: invokevirtual length : ()I
    //   2813: ifle -> 2829
    //   2816: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2819: aload_3
    //   2820: invokevirtual toCharArray : ()[C
    //   2823: putfield c : [C
    //   2826: goto -> 2836
    //   2829: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2832: aconst_null
    //   2833: putfield c : [C
    //   2836: aload_1
    //   2837: new com/fs/arpg/m
    //   2840: dup
    //   2841: aload_2
    //   2842: invokespecial <init> : (Ljava/lang/String;)V
    //   2845: putfield d : Lcom/fs/arpg/m;
    //   2848: goto -> 5896
    //   2851: aload_1
    //   2852: invokespecial r : ()V
    //   2855: goto -> 5896
    //   2858: aload_1
    //   2859: invokespecial s : ()V
    //   2862: goto -> 5896
    //   2865: aload_1
    //   2866: dup
    //   2867: astore_1
    //   2868: getfield d : Lcom/fs/arpg/bj;
    //   2871: invokevirtual d : ()Z
    //   2874: istore_2
    //   2875: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2878: astore_3
    //   2879: iload_2
    //   2880: ifeq -> 2972
    //   2883: iconst_0
    //   2884: putstatic com/fs/arpg/an.c : Z
    //   2887: aload_3
    //   2888: getfield b : Z
    //   2891: ifeq -> 2911
    //   2894: aload_3
    //   2895: dup
    //   2896: astore #5
    //   2898: iconst_2
    //   2899: putfield c : I
    //   2902: aload #5
    //   2904: iconst_0
    //   2905: putfield b : Z
    //   2908: invokestatic a : ()V
    //   2911: aload_3
    //   2912: invokevirtual n : ()V
    //   2915: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   2918: invokevirtual b : ()V
    //   2921: invokestatic d : ()Lcom/fs/arpg/d;
    //   2924: invokevirtual d : ()V
    //   2927: invokestatic q : ()V
    //   2930: aload_3
    //   2931: getfield c : [C
    //   2934: ifnull -> 2945
    //   2937: aload_3
    //   2938: getfield c : [C
    //   2941: arraylength
    //   2942: ifne -> 2948
    //   2945: goto -> 5896
    //   2948: aload_3
    //   2949: aload_1
    //   2950: putfield e : Lcom/fs/arpg/m;
    //   2953: aload_3
    //   2954: getfield d : Lcom/fs/arpg/j;
    //   2957: aload_3
    //   2958: getfield c : [C
    //   2961: invokevirtual e : ([C)V
    //   2964: aload_1
    //   2965: iconst_1
    //   2966: putfield d : Z
    //   2969: goto -> 5896
    //   2972: invokestatic d : ()Lcom/fs/arpg/ag;
    //   2975: invokevirtual d : ()V
    //   2978: aload_3
    //   2979: getfield b : Z
    //   2982: ifne -> 2994
    //   2985: aload_3
    //   2986: invokevirtual h : ()V
    //   2989: aload_3
    //   2990: invokevirtual d : ()Lcom/fs/arpg/an;
    //   2993: pop
    //   2994: goto -> 5896
    //   2997: aload_1
    //   2998: dup
    //   2999: astore_1
    //   3000: iconst_1
    //   3001: putfield d : Z
    //   3004: aload_1
    //   3005: getfield d : Lcom/fs/arpg/bj;
    //   3008: invokevirtual d : ()Z
    //   3011: istore_2
    //   3012: aload_1
    //   3013: getfield d : Lcom/fs/arpg/bj;
    //   3016: invokevirtual d : ()S
    //   3019: istore_3
    //   3020: aload_1
    //   3021: getfield d : Lcom/fs/arpg/bj;
    //   3024: invokevirtual d : ()S
    //   3027: istore #5
    //   3029: aconst_null
    //   3030: astore #6
    //   3032: iload_3
    //   3033: lookupswitch default -> 3093, 0 -> 3060, 2 -> 3074
    //   3060: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3063: getfield d : [Lcom/fs/arpg/ax;
    //   3066: iload #5
    //   3068: aaload
    //   3069: astore #6
    //   3071: goto -> 3093
    //   3074: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3077: getfield e : [Lcom/fs/arpg/ax;
    //   3080: iload #5
    //   3082: aaload
    //   3083: astore #6
    //   3085: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3088: iload #5
    //   3090: putfield R : I
    //   3093: iload_2
    //   3094: ifne -> 3110
    //   3097: aload #6
    //   3099: iconst_0
    //   3100: putfield d : Z
    //   3103: aload_1
    //   3104: invokevirtual a : ()V
    //   3107: goto -> 5896
    //   3110: aload #6
    //   3112: getfield d : Z
    //   3115: ifne -> 3142
    //   3118: iload_3
    //   3119: ifne -> 3136
    //   3122: iload #5
    //   3124: ifne -> 3136
    //   3127: aload #6
    //   3129: iconst_0
    //   3130: putfield d : I
    //   3133: goto -> 3142
    //   3136: aload #6
    //   3138: iconst_1
    //   3139: putfield d : Z
    //   3142: new java/lang/StringBuffer
    //   3145: dup
    //   3146: invokespecial <init> : ()V
    //   3149: dup
    //   3150: astore #4
    //   3152: ldc 'Đạt được kỹ năng: '
    //   3154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3157: pop
    //   3158: aload #4
    //   3160: aload #6
    //   3162: getfield d : [C
    //   3165: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   3168: pop
    //   3169: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3172: aload_1
    //   3173: putfield e : Lcom/fs/arpg/m;
    //   3176: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3179: invokevirtual s : ()V
    //   3182: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3185: getfield d : Lcom/fs/arpg/j;
    //   3188: aload #4
    //   3190: invokevirtual toString : ()Ljava/lang/String;
    //   3193: invokevirtual toCharArray : ()[C
    //   3196: invokevirtual d : ([C)V
    //   3199: goto -> 5896
    //   3202: aload_1
    //   3203: dup
    //   3204: astore_1
    //   3205: getfield d : Lcom/fs/arpg/bj;
    //   3208: invokevirtual d : ()S
    //   3211: istore_2
    //   3212: aload_1
    //   3213: getfield d : Lcom/fs/arpg/bj;
    //   3216: invokevirtual d : ()S
    //   3219: istore_3
    //   3220: invokestatic d : ()Lcom/fs/arpg/d;
    //   3223: iload_2
    //   3224: invokevirtual d : (S)Lcom/fs/arpg/al;
    //   3227: astore #5
    //   3229: iload_3
    //   3230: lookupswitch default -> 3316, 0 -> 3248
    //   3248: aload #5
    //   3250: iconst_0
    //   3251: putfield c : Z
    //   3254: aload #5
    //   3256: iconst_1
    //   3257: putfield b : Z
    //   3260: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3263: getfield d : Lcom/fs/arpg/j;
    //   3266: new java/lang/StringBuffer
    //   3269: dup
    //   3270: invokespecial <init> : ()V
    //   3273: aload #5
    //   3275: getfield d : [C
    //   3278: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   3281: ldc ' '
    //   3283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3286: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3289: getfield g : [C
    //   3292: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   3295: invokevirtual toString : ()Ljava/lang/String;
    //   3298: invokevirtual toCharArray : ()[C
    //   3301: invokevirtual d : ([C)V
    //   3304: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3307: invokevirtual b : ()V
    //   3310: invokestatic d : ()Lcom/fs/arpg/d;
    //   3313: invokevirtual d : ()V
    //   3316: goto -> 5896
    //   3319: aload_1
    //   3320: dup
    //   3321: astore_1
    //   3322: getfield d : Lcom/fs/arpg/bj;
    //   3325: invokevirtual d : ()Z
    //   3328: istore_2
    //   3329: aload_1
    //   3330: getfield d : Lcom/fs/arpg/bj;
    //   3333: invokevirtual d : ()S
    //   3336: istore_3
    //   3337: aload_1
    //   3338: getfield d : Lcom/fs/arpg/bj;
    //   3341: invokevirtual d : ()I
    //   3344: istore #5
    //   3346: aload_1
    //   3347: getfield d : Lcom/fs/arpg/bj;
    //   3350: invokevirtual d : ()I
    //   3353: istore #6
    //   3355: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3358: iload_3
    //   3359: iload_2
    //   3360: iload #5
    //   3362: iload #6
    //   3364: invokevirtual d : (IZII)V
    //   3367: goto -> 5896
    //   3370: aload_1
    //   3371: dup
    //   3372: astore_1
    //   3373: getfield d : Lcom/fs/arpg/bj;
    //   3376: invokevirtual d : ()Z
    //   3379: istore_2
    //   3380: aload_1
    //   3381: getfield d : Lcom/fs/arpg/bj;
    //   3384: invokevirtual d : ()Ljava/lang/String;
    //   3387: astore_3
    //   3388: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3391: aload_3
    //   3392: astore #4
    //   3394: dup
    //   3395: astore #5
    //   3397: iload_2
    //   3398: putfield r : Z
    //   3401: aload #5
    //   3403: aload #4
    //   3405: putfield d : Ljava/lang/String;
    //   3408: goto -> 5896
    //   3411: aload_1
    //   3412: dup
    //   3413: astore_1
    //   3414: getfield d : Lcom/fs/arpg/bj;
    //   3417: invokevirtual d : ()Z
    //   3420: pop
    //   3421: aload_1
    //   3422: getfield d : Lcom/fs/arpg/bj;
    //   3425: invokevirtual d : ()Ljava/lang/String;
    //   3428: astore_3
    //   3429: invokestatic d : ()Lcom/fs/arpg/ag;
    //   3432: aload_3
    //   3433: invokevirtual d : (Ljava/lang/String;)V
    //   3436: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   3439: new java/lang/StringBuffer
    //   3442: dup
    //   3443: ldc 'LoadMusic '
    //   3445: invokespecial <init> : (Ljava/lang/String;)V
    //   3448: aload_3
    //   3449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3452: invokevirtual toString : ()Ljava/lang/String;
    //   3455: invokevirtual println : (Ljava/lang/String;)V
    //   3458: goto -> 5896
    //   3461: aload_1
    //   3462: dup
    //   3463: astore_1
    //   3464: getfield d : Lcom/fs/arpg/bj;
    //   3467: invokevirtual d : ()Z
    //   3470: istore_2
    //   3471: aload_1
    //   3472: getfield d : Lcom/fs/arpg/bj;
    //   3475: invokevirtual d : ()I
    //   3478: istore_3
    //   3479: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3482: iload_2
    //   3483: iload_3
    //   3484: invokevirtual d : (ZI)V
    //   3487: iload_2
    //   3488: ifeq -> 3497
    //   3491: invokestatic d : ()V
    //   3494: goto -> 5896
    //   3497: invokestatic e : ()V
    //   3500: goto -> 5896
    //   3503: aload_1
    //   3504: dup
    //   3505: astore_1
    //   3506: iconst_1
    //   3507: putfield d : Z
    //   3510: aload_1
    //   3511: getfield d : Lcom/fs/arpg/bj;
    //   3514: invokevirtual d : ()Z
    //   3517: istore_2
    //   3518: aload_1
    //   3519: getfield d : Lcom/fs/arpg/bj;
    //   3522: invokevirtual d : ()S
    //   3525: istore_3
    //   3526: aload_1
    //   3527: getfield d : Lcom/fs/arpg/bj;
    //   3530: invokevirtual d : ()S
    //   3533: istore #5
    //   3535: new java/lang/StringBuffer
    //   3538: dup
    //   3539: invokespecial <init> : ()V
    //   3542: astore #6
    //   3544: iload_3
    //   3545: bipush #11
    //   3547: if_icmpne -> 3557
    //   3550: aload_1
    //   3551: invokevirtual a : ()V
    //   3554: goto -> 5896
    //   3557: iload_2
    //   3558: ifeq -> 3578
    //   3561: aload #6
    //   3563: invokestatic d : ()Lcom/fs/arpg/bg;
    //   3566: bipush #24
    //   3568: invokevirtual d : (S)[C
    //   3571: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   3574: pop
    //   3575: goto -> 3592
    //   3578: aload #6
    //   3580: invokestatic d : ()Lcom/fs/arpg/bg;
    //   3583: bipush #25
    //   3585: invokevirtual d : (S)[C
    //   3588: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   3591: pop
    //   3592: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3595: iload_3
    //   3596: iload_2
    //   3597: ifeq -> 3605
    //   3600: iload #5
    //   3602: goto -> 3608
    //   3605: iload #5
    //   3607: ineg
    //   3608: invokevirtual d : (II)V
    //   3611: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3614: aload_1
    //   3615: putfield e : Lcom/fs/arpg/m;
    //   3618: aload #6
    //   3620: iload_3
    //   3621: invokestatic d : (I)Ljava/lang/String;
    //   3624: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3627: iload #5
    //   3629: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3632: pop
    //   3633: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3636: getfield d : Lcom/fs/arpg/j;
    //   3639: aload #6
    //   3641: invokevirtual toString : ()Ljava/lang/String;
    //   3644: invokevirtual toCharArray : ()[C
    //   3647: invokevirtual d : ([C)V
    //   3650: aload_1
    //   3651: iload_3
    //   3652: putfield b : I
    //   3655: goto -> 5896
    //   3658: aload_1
    //   3659: dup
    //   3660: astore_1
    //   3661: iconst_1
    //   3662: putfield d : Z
    //   3665: aload_1
    //   3666: getfield d : Lcom/fs/arpg/bj;
    //   3669: invokevirtual d : ()Ljava/lang/String;
    //   3672: dup
    //   3673: astore_2
    //   3674: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   3677: astore_2
    //   3678: aload_1
    //   3679: getfield d : Lcom/fs/arpg/bj;
    //   3682: invokevirtual d : ()Z
    //   3685: istore_3
    //   3686: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3689: aload_1
    //   3690: putfield e : Lcom/fs/arpg/m;
    //   3693: aload_2
    //   3694: ldc 'Nhấn nút 2, 4, 6, 8 để di chuyển nhân vật'
    //   3696: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3699: ifeq -> 3708
    //   3702: ldc 'Nhấn nút phương hướng để di chuyển nhân vật'
    //   3704: astore_2
    //   3705: goto -> 3720
    //   3708: aload_2
    //   3709: ldc 'Nhấn {nút 5} để đánh quái, nhấn nhiều lần để phát chiêu liên tục.'
    //   3711: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3714: ifeq -> 3720
    //   3717: ldc 'Nhấn {nút giữa} để đánh quái, nhấn nhiều lần để phát chiêu liên tục.'
    //   3719: astore_2
    //   3720: iload_3
    //   3721: ifeq -> 3751
    //   3724: aload_1
    //   3725: getfield d : Lcom/fs/arpg/bj;
    //   3728: invokevirtual d : ()J
    //   3731: lstore #5
    //   3733: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3736: getfield d : Lcom/fs/arpg/j;
    //   3739: aload_2
    //   3740: invokevirtual toCharArray : ()[C
    //   3743: lload #5
    //   3745: invokevirtual d : ([CJ)V
    //   3748: goto -> 5896
    //   3751: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3754: getfield d : Lcom/fs/arpg/j;
    //   3757: aload_2
    //   3758: invokevirtual toCharArray : ()[C
    //   3761: invokevirtual d : ([C)V
    //   3764: goto -> 5896
    //   3767: aload_1
    //   3768: getfield d : Lcom/fs/arpg/bj;
    //   3771: invokevirtual d : ()B
    //   3774: dup
    //   3775: istore_2
    //   3776: iconst_2
    //   3777: if_icmpne -> 3787
    //   3780: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3783: iconst_0
    //   3784: invokevirtual b : (I)V
    //   3787: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3790: iconst_0
    //   3791: putfield m : Z
    //   3794: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3797: iconst_0
    //   3798: putfield k : Z
    //   3801: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3804: iload_2
    //   3805: putfield d : I
    //   3808: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3811: invokevirtual z : ()V
    //   3814: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3817: iconst_0
    //   3818: invokevirtual z : (I)V
    //   3821: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3824: getfield d : Lcom/fs/arpg/t;
    //   3827: iconst_0
    //   3828: putfield d : I
    //   3831: goto -> 5896
    //   3834: aload_1
    //   3835: dup
    //   3836: astore_1
    //   3837: iconst_1
    //   3838: putfield d : Z
    //   3841: aload_1
    //   3842: getfield d : Lcom/fs/arpg/bj;
    //   3845: invokevirtual d : ()Z
    //   3848: istore_2
    //   3849: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3852: getfield ab : I
    //   3855: istore_3
    //   3856: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3859: getfield ac : I
    //   3862: istore #5
    //   3864: invokestatic d : ()Lcom/fs/arpg/l;
    //   3867: getfield d : Lcom/fs/arpg/x;
    //   3870: ifnull -> 3898
    //   3873: iload #5
    //   3875: sipush #170
    //   3878: if_icmplt -> 3898
    //   3881: iload #5
    //   3883: sipush #170
    //   3886: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3889: getfield o : I
    //   3892: iconst_1
    //   3893: ishr
    //   3894: isub
    //   3895: isub
    //   3896: istore #5
    //   3898: aload_1
    //   3899: iload_3
    //   3900: iload #5
    //   3902: iload_2
    //   3903: invokespecial d : (IIZ)V
    //   3906: goto -> 5896
    //   3909: aload_1
    //   3910: dup
    //   3911: astore_1
    //   3912: getfield d : Lcom/fs/arpg/bj;
    //   3915: invokevirtual d : ()Ljava/lang/String;
    //   3918: astore_2
    //   3919: aload_1
    //   3920: getfield d : Lcom/fs/arpg/bj;
    //   3923: invokevirtual d : ()Z
    //   3926: istore_3
    //   3927: invokestatic d : ()Lcom/fs/arpg/l;
    //   3930: aload_2
    //   3931: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   3934: dup
    //   3935: astore #5
    //   3937: ifnull -> 3946
    //   3940: aload #5
    //   3942: iload_3
    //   3943: invokevirtual h : (Z)V
    //   3946: goto -> 5896
    //   3949: aload_1
    //   3950: invokespecial o : ()V
    //   3953: goto -> 5896
    //   3956: aload_1
    //   3957: invokespecial p : ()V
    //   3960: goto -> 5896
    //   3963: aload_1
    //   3964: dup
    //   3965: astore_1
    //   3966: iconst_1
    //   3967: putfield d : Z
    //   3970: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3973: iconst_2
    //   3974: putfield d : I
    //   3977: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   3980: invokevirtual z : ()V
    //   3983: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3986: iconst_0
    //   3987: invokevirtual b : (I)V
    //   3990: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   3993: dup
    //   3994: astore_2
    //   3995: iconst_1
    //   3996: putfield m : Z
    //   3999: aload_2
    //   4000: sipush #-200
    //   4003: putfield s : I
    //   4006: aload_2
    //   4007: aload_1
    //   4008: getfield d : Lcom/fs/arpg/bj;
    //   4011: invokevirtual d : ()Ljava/lang/String;
    //   4014: invokevirtual toCharArray : ()[C
    //   4017: putfield b : [C
    //   4020: aload_2
    //   4021: aload_1
    //   4022: putfield e : Lcom/fs/arpg/m;
    //   4025: aload_1
    //   4026: iconst_1
    //   4027: putfield d : Z
    //   4030: goto -> 5896
    //   4033: goto -> 5896
    //   4036: aload_1
    //   4037: invokespecial y : ()V
    //   4040: goto -> 5896
    //   4043: getstatic com/fs/arpg/m.h : I
    //   4046: iconst_1
    //   4047: iadd
    //   4048: putstatic com/fs/arpg/m.h : I
    //   4051: aload_1
    //   4052: getfield d : Lcom/fs/arpg/bj;
    //   4055: invokevirtual d : ()Ljava/lang/String;
    //   4058: astore_2
    //   4059: aload_1
    //   4060: getfield d : Lcom/fs/arpg/bj;
    //   4063: invokevirtual d : ()Ljava/lang/String;
    //   4066: astore_3
    //   4067: aload_1
    //   4068: getfield d : Lcom/fs/arpg/bj;
    //   4071: invokevirtual d : ()Ljava/lang/String;
    //   4074: astore #5
    //   4076: aload_1
    //   4077: getfield d : Lcom/fs/arpg/bj;
    //   4080: invokevirtual d : ()Ljava/lang/String;
    //   4083: astore #6
    //   4085: aload_1
    //   4086: getfield d : Lcom/fs/arpg/bj;
    //   4089: invokevirtual d : ()Ljava/lang/String;
    //   4092: astore #4
    //   4094: aload_1
    //   4095: getfield d : Lcom/fs/arpg/bj;
    //   4098: invokevirtual d : ()Ljava/lang/String;
    //   4101: dup
    //   4102: astore #7
    //   4104: invokevirtual length : ()I
    //   4107: ifne -> 4130
    //   4110: new java/lang/StringBuffer
    //   4113: dup
    //   4114: ldc 'Bảo rương tên'
    //   4116: invokespecial <init> : (Ljava/lang/String;)V
    //   4119: getstatic com/fs/arpg/m.h : I
    //   4122: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4125: invokevirtual toString : ()Ljava/lang/String;
    //   4128: astore #7
    //   4130: new java/lang/StringBuffer
    //   4133: dup
    //   4134: invokespecial <init> : ()V
    //   4137: dup
    //   4138: astore #8
    //   4140: aload #7
    //   4142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   4145: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4148: getfield h : [C
    //   4151: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   4154: pop
    //   4155: aload #8
    //   4157: invokevirtual toString : ()Ljava/lang/String;
    //   4160: invokestatic d : (Ljava/lang/String;)I
    //   4163: ifne -> 4355
    //   4166: invokestatic d : ()Lcom/fs/arpg/l;
    //   4169: dup
    //   4170: astore #9
    //   4172: aload_2
    //   4173: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/o;
    //   4176: astore_1
    //   4177: aload_3
    //   4178: iconst_0
    //   4179: invokevirtual charAt : (I)C
    //   4182: invokestatic isDigit : (C)Z
    //   4185: ifeq -> 4196
    //   4188: aload_3
    //   4189: invokestatic parseInt : (Ljava/lang/String;)I
    //   4192: istore_2
    //   4193: goto -> 4201
    //   4196: aload_3
    //   4197: invokestatic d : (Ljava/lang/String;)I
    //   4200: istore_2
    //   4201: aload #5
    //   4203: iconst_0
    //   4204: invokevirtual charAt : (I)C
    //   4207: invokestatic isDigit : (C)Z
    //   4210: ifeq -> 4222
    //   4213: aload #5
    //   4215: invokestatic parseInt : (Ljava/lang/String;)I
    //   4218: istore_3
    //   4219: goto -> 4228
    //   4222: aload #5
    //   4224: invokestatic d : (Ljava/lang/String;)I
    //   4227: istore_3
    //   4228: new com/fs/arpg/ae
    //   4231: dup
    //   4232: aload #7
    //   4234: iload_2
    //   4235: iload_3
    //   4236: invokespecial <init> : (Ljava/lang/String;II)V
    //   4239: dup
    //   4240: astore_2
    //   4241: aload_1
    //   4242: putfield d : Lcom/fs/arpg/o;
    //   4245: invokestatic d : ()Lcom/fs/arpg/v;
    //   4248: aload_1
    //   4249: getfield d : S
    //   4252: aload_2
    //   4253: invokevirtual d : (SLcom/fs/arpg/be;)V
    //   4256: aconst_null
    //   4257: astore_1
    //   4258: aconst_null
    //   4259: astore_3
    //   4260: aload #6
    //   4262: invokevirtual length : ()I
    //   4265: ifle -> 4288
    //   4268: aload #6
    //   4270: ldc 'null'
    //   4272: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4275: ifne -> 4288
    //   4278: new com/fs/arpg/m
    //   4281: dup
    //   4282: aload #6
    //   4284: invokespecial <init> : (Ljava/lang/String;)V
    //   4287: astore_1
    //   4288: aload #4
    //   4290: invokevirtual length : ()I
    //   4293: ifle -> 4316
    //   4296: aload #4
    //   4298: ldc 'null'
    //   4300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4303: ifne -> 4316
    //   4306: new com/fs/arpg/m
    //   4309: dup
    //   4310: aload #4
    //   4312: invokespecial <init> : (Ljava/lang/String;)V
    //   4315: astore_3
    //   4316: aload_2
    //   4317: aload_1
    //   4318: aload_3
    //   4319: astore #4
    //   4321: astore_3
    //   4322: dup
    //   4323: astore_1
    //   4324: aload_3
    //   4325: putfield e : Lcom/fs/arpg/m;
    //   4328: aload_1
    //   4329: aload #4
    //   4331: putfield c : Lcom/fs/arpg/m;
    //   4334: aload_2
    //   4335: invokevirtual a : ()V
    //   4338: aload_2
    //   4339: invokevirtual v : ()V
    //   4342: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   4345: aload_2
    //   4346: invokevirtual e : (Lcom/fs/arpg/be;)V
    //   4349: aload #9
    //   4351: aload_2
    //   4352: invokevirtual d : (Lcom/fs/arpg/ae;)V
    //   4355: goto -> 5896
    //   4358: aload_1
    //   4359: dup
    //   4360: astore_1
    //   4361: getfield d : Lcom/fs/arpg/bj;
    //   4364: invokevirtual d : ()S
    //   4367: istore_2
    //   4368: aload_1
    //   4369: iload_2
    //   4370: invokespecial d : (I)V
    //   4373: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   4376: new java/lang/StringBuffer
    //   4379: dup
    //   4380: ldc 'Jump '
    //   4382: invokespecial <init> : (Ljava/lang/String;)V
    //   4385: iload_2
    //   4386: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   4389: invokevirtual toString : ()Ljava/lang/String;
    //   4392: invokevirtual println : (Ljava/lang/String;)V
    //   4395: goto -> 5896
    //   4398: aload_1
    //   4399: aload_1
    //   4400: getfield c : I
    //   4403: putfield e : I
    //   4406: goto -> 5896
    //   4409: aload_1
    //   4410: dup
    //   4411: astore_1
    //   4412: getfield d : Lcom/fs/arpg/bj;
    //   4415: invokevirtual d : ()Ljava/lang/String;
    //   4418: astore_2
    //   4419: aload_1
    //   4420: getfield d : Lcom/fs/arpg/bj;
    //   4423: invokevirtual d : ()S
    //   4426: istore_3
    //   4427: aload_1
    //   4428: getfield d : Lcom/fs/arpg/bj;
    //   4431: invokevirtual d : ()S
    //   4434: istore #5
    //   4436: aload_1
    //   4437: getfield d : Lcom/fs/arpg/bj;
    //   4440: invokevirtual d : ()S
    //   4443: istore #6
    //   4445: aload_1
    //   4446: getfield d : Lcom/fs/arpg/bj;
    //   4449: invokevirtual d : ()S
    //   4452: istore #4
    //   4454: aload_1
    //   4455: getfield d : Lcom/fs/arpg/bj;
    //   4458: invokevirtual d : ()Z
    //   4461: istore #7
    //   4463: aload_1
    //   4464: aload_1
    //   4465: getfield d : Lcom/fs/arpg/bj;
    //   4468: invokevirtual d : ()Z
    //   4471: putfield e : Z
    //   4474: aload_1
    //   4475: getfield e : Z
    //   4478: ifeq -> 4486
    //   4481: aload_1
    //   4482: iconst_1
    //   4483: putfield d : Z
    //   4486: aload_1
    //   4487: getfield d : Lcom/fs/arpg/bj;
    //   4490: invokevirtual d : ()Z
    //   4493: istore #8
    //   4495: new com/fs/arpg/be
    //   4498: dup
    //   4499: invokespecial <init> : ()V
    //   4502: astore #9
    //   4504: invokestatic d : ()Lcom/fs/arpg/v;
    //   4507: iload_3
    //   4508: i2s
    //   4509: aload #9
    //   4511: invokevirtual d : (SLcom/fs/arpg/be;)V
    //   4514: aload #9
    //   4516: iload #5
    //   4518: i2s
    //   4519: putfield c : S
    //   4522: aload #9
    //   4524: iload #6
    //   4526: putfield ab : I
    //   4529: aload #9
    //   4531: iload #4
    //   4533: putfield ac : I
    //   4536: aload #9
    //   4538: invokevirtual v : ()V
    //   4541: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4544: aload_1
    //   4545: putfield e : Lcom/fs/arpg/m;
    //   4548: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4551: aload #9
    //   4553: aload_2
    //   4554: iload #7
    //   4556: aload_1
    //   4557: getfield e : Z
    //   4560: iload #8
    //   4562: invokevirtual d : (Lcom/fs/arpg/be;Ljava/lang/String;ZZZ)V
    //   4565: goto -> 5896
    //   4568: aload_1
    //   4569: getfield d : Lcom/fs/arpg/bj;
    //   4572: invokevirtual d : ()Ljava/lang/String;
    //   4575: astore_2
    //   4576: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4579: aconst_null
    //   4580: aload_2
    //   4581: iconst_1
    //   4582: iconst_0
    //   4583: iconst_0
    //   4584: invokevirtual d : (Lcom/fs/arpg/be;Ljava/lang/String;ZZZ)V
    //   4587: goto -> 5896
    //   4590: aload_1
    //   4591: getfield d : Lcom/fs/arpg/bj;
    //   4594: invokevirtual d : ()S
    //   4597: istore_2
    //   4598: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   4601: iload_2
    //   4602: invokevirtual e : (I)V
    //   4605: goto -> 5896
    //   4608: aload_1
    //   4609: getfield d : Lcom/fs/arpg/bj;
    //   4612: invokevirtual d : ()Z
    //   4615: istore_2
    //   4616: invokestatic d : ()Lcom/fs/arpg/l;
    //   4619: astore_3
    //   4620: iload_2
    //   4621: ifeq -> 4631
    //   4624: aload_3
    //   4625: invokevirtual g : ()V
    //   4628: goto -> 5896
    //   4631: aload_3
    //   4632: invokevirtual f : ()V
    //   4635: goto -> 5896
    //   4638: aload_1
    //   4639: dup
    //   4640: astore_1
    //   4641: iconst_1
    //   4642: putfield d : Z
    //   4645: aload_1
    //   4646: getfield d : Lcom/fs/arpg/bj;
    //   4649: invokevirtual d : ()S
    //   4652: istore_2
    //   4653: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4656: aload_1
    //   4657: astore #5
    //   4659: dup
    //   4660: astore_3
    //   4661: aload #5
    //   4663: putfield e : Lcom/fs/arpg/m;
    //   4666: aload_3
    //   4667: iload_2
    //   4668: i2l
    //   4669: putfield e : J
    //   4672: goto -> 5896
    //   4675: invokestatic d : ()Lcom/fs/arpg/v;
    //   4678: pop
    //   4679: aload_1
    //   4680: getfield d : Lcom/fs/arpg/bj;
    //   4683: invokevirtual d : ()S
    //   4686: istore_3
    //   4687: aload_1
    //   4688: getfield d : Lcom/fs/arpg/bj;
    //   4691: invokevirtual d : ()S
    //   4694: istore #5
    //   4696: aload_1
    //   4697: getfield d : Lcom/fs/arpg/bj;
    //   4700: invokevirtual d : ()B
    //   4703: istore #6
    //   4705: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   4708: iload_3
    //   4709: iload #5
    //   4711: iload #6
    //   4713: invokevirtual d : (SSB)V
    //   4716: goto -> 5896
    //   4719: aload_1
    //   4720: dup
    //   4721: astore_1
    //   4722: iconst_1
    //   4723: putfield d : Z
    //   4726: aload_1
    //   4727: getfield d : Lcom/fs/arpg/bj;
    //   4730: invokevirtual d : ()B
    //   4733: sipush #255
    //   4736: iand
    //   4737: istore_2
    //   4738: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4741: aload_1
    //   4742: putfield e : Lcom/fs/arpg/m;
    //   4745: iload_2
    //   4746: iconst_1
    //   4747: if_icmpne -> 4772
    //   4750: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4753: dup
    //   4754: astore_3
    //   4755: iconst_1
    //   4756: putfield n : Z
    //   4759: aload_3
    //   4760: iconst_0
    //   4761: putfield r : I
    //   4764: aload_3
    //   4765: iconst_0
    //   4766: putfield t : I
    //   4769: goto -> 5896
    //   4772: iload_2
    //   4773: ifne -> 4786
    //   4776: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4779: iconst_2
    //   4780: putfield r : I
    //   4783: goto -> 5896
    //   4786: iload_2
    //   4787: iconst_2
    //   4788: if_icmpne -> 4818
    //   4791: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4794: dup
    //   4795: astore_3
    //   4796: iconst_1
    //   4797: putfield n : Z
    //   4800: aload_3
    //   4801: iconst_1
    //   4802: putfield r : I
    //   4805: aload_3
    //   4806: bipush #40
    //   4808: putfield t : I
    //   4811: aload_1
    //   4812: invokevirtual a : ()V
    //   4815: goto -> 5896
    //   4818: iload_2
    //   4819: iconst_3
    //   4820: if_icmpne -> 4834
    //   4823: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4826: iconst_0
    //   4827: putfield n : Z
    //   4830: aload_1
    //   4831: invokevirtual a : ()V
    //   4834: goto -> 5896
    //   4837: aload_1
    //   4838: dup
    //   4839: astore_1
    //   4840: iconst_1
    //   4841: putfield d : Z
    //   4844: aload_1
    //   4845: getfield d : Lcom/fs/arpg/bj;
    //   4848: invokevirtual d : ()I
    //   4851: istore_2
    //   4852: aload_1
    //   4853: getfield d : Lcom/fs/arpg/bj;
    //   4856: invokevirtual d : ()I
    //   4859: istore_3
    //   4860: aload_1
    //   4861: getfield d : Lcom/fs/arpg/bj;
    //   4864: invokevirtual d : ()Ljava/lang/String;
    //   4867: invokevirtual toCharArray : ()[C
    //   4870: astore #5
    //   4872: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   4875: dup
    //   4876: astore #6
    //   4878: aload_1
    //   4879: putfield e : Lcom/fs/arpg/m;
    //   4882: aload #6
    //   4884: aload #5
    //   4886: astore #7
    //   4888: dup
    //   4889: astore #4
    //   4891: iconst_1
    //   4892: putfield p : Z
    //   4895: aload #4
    //   4897: aload #7
    //   4899: putfield a : [C
    //   4902: aload #4
    //   4904: iload_2
    //   4905: putfield u : I
    //   4908: aload #4
    //   4910: iload_3
    //   4911: putfield v : I
    //   4914: aload #4
    //   4916: iconst_0
    //   4917: putfield w : I
    //   4920: aload #4
    //   4922: iconst_0
    //   4923: putfield x : I
    //   4926: aload #4
    //   4928: sipush #255
    //   4931: putfield y : I
    //   4934: aload #4
    //   4936: iconst_0
    //   4937: putfield o : Z
    //   4940: goto -> 5896
    //   4943: aload_1
    //   4944: getfield d : Lcom/fs/arpg/bj;
    //   4947: invokevirtual d : ()Ljava/lang/String;
    //   4950: astore_2
    //   4951: invokestatic d : ()Lcom/fs/arpg/l;
    //   4954: dup
    //   4955: astore_3
    //   4956: aload_2
    //   4957: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   4960: dup
    //   4961: astore #5
    //   4963: ifnull -> 4991
    //   4966: aload #5
    //   4968: invokevirtual i : ()V
    //   4971: aload #5
    //   4973: iconst_0
    //   4974: putfield g : Z
    //   4977: aload_3
    //   4978: aload #5
    //   4980: invokevirtual c : (Lcom/fs/arpg/x;)V
    //   4983: aload #5
    //   4985: invokevirtual l : ()V
    //   4988: goto -> 5896
    //   4991: aload_3
    //   4992: aload_2
    //   4993: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/ae;
    //   4996: dup
    //   4997: astore #6
    //   4999: ifnull -> 5030
    //   5002: aload #6
    //   5004: iconst_0
    //   5005: putfield g : Z
    //   5008: aload_3
    //   5009: aload #6
    //   5011: invokevirtual e : (Lcom/fs/arpg/ae;)V
    //   5014: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   5017: aload #6
    //   5019: invokevirtual d : (Lcom/fs/arpg/be;)V
    //   5022: aload #6
    //   5024: invokevirtual l : ()V
    //   5027: goto -> 5896
    //   5030: aload_2
    //   5031: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5034: getfield d : Ljava/lang/String;
    //   5037: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5040: ifeq -> 5062
    //   5043: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   5046: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5049: invokevirtual d : (Lcom/fs/arpg/be;)V
    //   5052: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5055: iconst_0
    //   5056: putfield g : Z
    //   5059: goto -> 5896
    //   5062: aload_3
    //   5063: invokevirtual b : ()V
    //   5066: goto -> 5896
    //   5069: aload_1
    //   5070: dup
    //   5071: astore_1
    //   5072: iconst_1
    //   5073: putfield d : Z
    //   5076: aload_1
    //   5077: getfield d : Lcom/fs/arpg/bj;
    //   5080: invokevirtual d : ()B
    //   5083: istore_2
    //   5084: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5087: aload_1
    //   5088: putfield e : Lcom/fs/arpg/m;
    //   5091: iload_2
    //   5092: ifne -> 5102
    //   5095: iconst_1
    //   5096: bipush #8
    //   5098: invokestatic d : (II)I
    //   5101: istore_2
    //   5102: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5105: iload_2
    //   5106: invokevirtual c : (I)V
    //   5109: goto -> 5896
    //   5112: aload_1
    //   5113: dup
    //   5114: astore_1
    //   5115: getfield d : Lcom/fs/arpg/bj;
    //   5118: invokevirtual d : ()Ljava/lang/String;
    //   5121: astore_2
    //   5122: aload_1
    //   5123: getfield d : Lcom/fs/arpg/bj;
    //   5126: invokevirtual d : ()B
    //   5129: istore_3
    //   5130: aload_2
    //   5131: ldc 'curbox'
    //   5133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5136: ifeq -> 5149
    //   5139: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5142: getfield d : Lcom/fs/arpg/ae;
    //   5145: getfield d : Ljava/lang/String;
    //   5148: astore_2
    //   5149: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5152: aload_2
    //   5153: astore #6
    //   5155: dup
    //   5156: astore #5
    //   5158: getfield d : Lcom/fs/arpg/l;
    //   5161: aload #6
    //   5163: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/ae;
    //   5166: dup
    //   5167: astore_1
    //   5168: ifnull -> 5272
    //   5171: iload_3
    //   5172: tableswitch default -> 5272, 0 -> 5200, 1 -> 5262, 2 -> 5212
    //   5200: aload_1
    //   5201: iconst_2
    //   5202: putfield d : I
    //   5205: aload_1
    //   5206: invokevirtual a : ()V
    //   5209: goto -> 5896
    //   5212: new java/lang/StringBuffer
    //   5215: dup
    //   5216: invokespecial <init> : ()V
    //   5219: dup
    //   5220: astore_2
    //   5221: aload #6
    //   5223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   5226: aload #5
    //   5228: getfield h : [C
    //   5231: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   5234: pop
    //   5235: aload_2
    //   5236: invokevirtual toString : ()Ljava/lang/String;
    //   5239: iconst_1
    //   5240: invokestatic d : (Ljava/lang/String;I)V
    //   5243: aload #5
    //   5245: getfield d : Lcom/fs/arpg/l;
    //   5248: aload_1
    //   5249: invokevirtual e : (Lcom/fs/arpg/ae;)V
    //   5252: getstatic com/fs/arpg/ba.e : Lcom/fs/arpg/am;
    //   5255: aload_1
    //   5256: invokevirtual d : (Lcom/fs/arpg/be;)V
    //   5259: goto -> 5896
    //   5262: aload_1
    //   5263: bipush #7
    //   5265: putfield d : I
    //   5268: aload_1
    //   5269: invokevirtual a : ()V
    //   5272: goto -> 5896
    //   5275: aload_1
    //   5276: getfield d : Lcom/fs/arpg/bj;
    //   5279: invokevirtual d : ()Z
    //   5282: istore_2
    //   5283: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5286: iload_2
    //   5287: putfield s : Z
    //   5290: goto -> 5896
    //   5293: aload_1
    //   5294: dup
    //   5295: astore_1
    //   5296: getfield d : Lcom/fs/arpg/bj;
    //   5299: invokevirtual d : ()B
    //   5302: tableswitch default -> 5386, 0 -> 5356, 1 -> 5359, 2 -> 5362, 3 -> 5365, 4 -> 5368, 5 -> 5371, 6 -> 5374, 7 -> 5377, 8 -> 5380, 9 -> 5383
    //   5356: goto -> 5896
    //   5359: goto -> 5896
    //   5362: goto -> 5896
    //   5365: goto -> 5896
    //   5368: goto -> 5896
    //   5371: goto -> 5896
    //   5374: goto -> 5896
    //   5377: goto -> 5896
    //   5380: goto -> 5896
    //   5383: goto -> 5896
    //   5386: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5389: iconst_1
    //   5390: putfield t : Z
    //   5393: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5396: iconst_0
    //   5397: putfield B : I
    //   5400: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5403: aload_1
    //   5404: putfield e : Lcom/fs/arpg/m;
    //   5407: goto -> 5896
    //   5410: aload_1
    //   5411: getfield d : Lcom/fs/arpg/bj;
    //   5414: invokevirtual d : ()S
    //   5417: istore_2
    //   5418: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/b;
    //   5421: iload_2
    //   5422: putfield d : I
    //   5425: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5428: invokevirtual p : ()V
    //   5431: goto -> 5896
    //   5434: aload_1
    //   5435: dup
    //   5436: dup
    //   5437: astore_1
    //   5438: getfield d : Lcom/fs/arpg/bj;
    //   5441: invokevirtual d : ()B
    //   5444: putfield b : I
    //   5447: aload_1
    //   5448: aload_1
    //   5449: getfield d : Lcom/fs/arpg/bj;
    //   5452: invokevirtual d : ()B
    //   5455: putfield a : I
    //   5458: goto -> 5896
    //   5461: aload_1
    //   5462: dup
    //   5463: astore_1
    //   5464: getfield d : Lcom/fs/arpg/bj;
    //   5467: invokevirtual d : ()Ljava/lang/String;
    //   5470: astore_2
    //   5471: aload_1
    //   5472: getfield d : Lcom/fs/arpg/bj;
    //   5475: invokevirtual d : ()Z
    //   5478: istore_3
    //   5479: aload_1
    //   5480: getfield d : Lcom/fs/arpg/bj;
    //   5483: invokevirtual d : ()S
    //   5486: pop
    //   5487: aload_1
    //   5488: getfield d : Lcom/fs/arpg/bj;
    //   5491: invokevirtual d : ()Ljava/lang/String;
    //   5494: astore #6
    //   5496: invokestatic d : ()Lcom/fs/arpg/l;
    //   5499: aload_2
    //   5500: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   5503: dup
    //   5504: astore #7
    //   5506: ifnull -> 5536
    //   5509: aload #6
    //   5511: ifnull -> 5530
    //   5514: aload #6
    //   5516: invokevirtual length : ()I
    //   5519: ifeq -> 5530
    //   5522: new com/fs/arpg/m
    //   5525: aload #6
    //   5527: invokespecial <init> : (Ljava/lang/String;)V
    //   5530: aload #7
    //   5532: iload_3
    //   5533: putfield o : Z
    //   5536: goto -> 5896
    //   5539: aload_1
    //   5540: dup
    //   5541: astore_1
    //   5542: getfield d : Lcom/fs/arpg/bj;
    //   5545: invokevirtual d : ()Ljava/lang/String;
    //   5548: astore_2
    //   5549: aload_1
    //   5550: getfield d : Lcom/fs/arpg/bj;
    //   5553: invokevirtual d : ()S
    //   5556: istore_3
    //   5557: aload_1
    //   5558: getfield d : Lcom/fs/arpg/bj;
    //   5561: invokevirtual d : ()Ljava/lang/String;
    //   5564: pop
    //   5565: invokestatic d : ()Lcom/fs/arpg/l;
    //   5568: aload_2
    //   5569: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   5572: dup
    //   5573: astore #4
    //   5575: ifnull -> 5584
    //   5578: aload #4
    //   5580: iload_3
    //   5581: putfield w : I
    //   5584: goto -> 5896
    //   5587: aload_1
    //   5588: invokespecial w : ()V
    //   5591: goto -> 5896
    //   5594: goto -> 5896
    //   5597: aload_1
    //   5598: getfield d : Lcom/fs/arpg/bj;
    //   5601: invokevirtual d : ()Ljava/lang/String;
    //   5604: astore_2
    //   5605: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5608: aload_2
    //   5609: invokevirtual toCharArray : ()[C
    //   5612: astore #6
    //   5614: dup
    //   5615: astore #5
    //   5617: iconst_1
    //   5618: putfield u : Z
    //   5621: aload #5
    //   5623: aload #6
    //   5625: putfield z : [C
    //   5628: aload #5
    //   5630: iconst_0
    //   5631: putfield w : I
    //   5634: aload #5
    //   5636: iconst_0
    //   5637: putfield x : I
    //   5640: goto -> 5896
    //   5643: aload_1
    //   5644: dup
    //   5645: astore_1
    //   5646: getfield d : Lcom/fs/arpg/bj;
    //   5649: invokevirtual d : ()B
    //   5652: tableswitch default -> 5783, 0 -> 5688, 1 -> 5717, 2 -> 5740, 3 -> 5783, 4 -> 5763
    //   5688: ldc 'Bài giảng Phụ Ma'
    //   5690: iconst_1
    //   5691: invokestatic d : (Ljava/lang/String;I)V
    //   5694: aload_1
    //   5695: iconst_1
    //   5696: putfield d : Z
    //   5699: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5702: aload_1
    //   5703: putfield e : Lcom/fs/arpg/m;
    //   5706: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5709: ldc 't31'
    //   5711: invokevirtual c : (Ljava/lang/String;)V
    //   5714: goto -> 5896
    //   5717: aload_1
    //   5718: iconst_1
    //   5719: putfield d : Z
    //   5722: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5725: aload_1
    //   5726: putfield e : Lcom/fs/arpg/m;
    //   5729: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5732: ldc 't32'
    //   5734: invokevirtual c : (Ljava/lang/String;)V
    //   5737: goto -> 5896
    //   5740: aload_1
    //   5741: iconst_1
    //   5742: putfield d : Z
    //   5745: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5748: aload_1
    //   5749: putfield e : Lcom/fs/arpg/m;
    //   5752: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5755: ldc 't33'
    //   5757: invokevirtual c : (Ljava/lang/String;)V
    //   5760: goto -> 5896
    //   5763: aload_1
    //   5764: iconst_1
    //   5765: putfield d : Z
    //   5768: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5771: aload_1
    //   5772: putfield e : Lcom/fs/arpg/m;
    //   5775: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5778: ldc 't34'
    //   5780: invokevirtual c : (Ljava/lang/String;)V
    //   5783: goto -> 5896
    //   5786: aload_1
    //   5787: invokespecial j : ()V
    //   5790: goto -> 5896
    //   5793: aload_1
    //   5794: dup
    //   5795: astore_1
    //   5796: getfield d : Lcom/fs/arpg/bj;
    //   5799: invokevirtual d : ()Ljava/lang/String;
    //   5802: astore_2
    //   5803: aload_1
    //   5804: getfield d : Lcom/fs/arpg/bj;
    //   5807: invokevirtual d : ()S
    //   5810: istore_3
    //   5811: aload_1
    //   5812: getfield d : Lcom/fs/arpg/bj;
    //   5815: invokevirtual d : ()S
    //   5818: istore #5
    //   5820: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5823: getfield r : I
    //   5826: ifeq -> 5840
    //   5829: iload #5
    //   5831: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5834: getfield r : I
    //   5837: isub
    //   5838: istore #5
    //   5840: iload_3
    //   5841: iload #5
    //   5843: invokestatic d : (II)I
    //   5846: istore #6
    //   5848: aload_2
    //   5849: iload #6
    //   5851: invokestatic d : (Ljava/lang/String;I)V
    //   5854: goto -> 5896
    //   5857: aload_1
    //   5858: dup
    //   5859: astore_1
    //   5860: getfield d : Lcom/fs/arpg/bj;
    //   5863: invokevirtual d : ()Z
    //   5866: ifne -> 5879
    //   5869: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5872: aconst_null
    //   5873: putfield d : [S
    //   5876: goto -> 5896
    //   5879: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   5882: aload_1
    //   5883: putfield e : Lcom/fs/arpg/m;
    //   5886: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   5889: invokevirtual g : ()V
    //   5892: goto -> 5896
    //   5895: pop
    //   5896: aload_0
    //   5897: dup
    //   5898: getfield e : I
    //   5901: iconst_1
    //   5902: iadd
    //   5903: putfield e : I
    //   5906: aload_0
    //   5907: getfield d : Z
    //   5910: ifeq -> 49
    //   5913: return
    //   5914: return
    // Exception table:
    //   from	to	target	type
    //   60	5892	5895	java/lang/Exception
  }
  
  public final boolean e() {
    return (this.e >= this.c && this.d == null);
  }
  
  private void i() {
    int[][] arrayOfInt;
    int i;
    short s = this.d.d();
    int j = this.d.d();
    this.b = s;
    this.a = j;
    String str = d(this.d.d());
    if (s == 1) {
      this.d = true;
      ba.d.a(j);
      ba.d.h(j);
      ((ai)ba.d).e = (String[])this;
      return;
    } 
    if (s == 2) {
      if (j == 1) {
        int k = ba.d("progessBuffer");
        ba.d("progess", k);
        ((ai)ba.d).D = 0;
        this.d = true;
        if (ba.d(str) < ((ai)ba.d).Z)
          ba.d(str, ((ai)ba.d).Z); 
        ((ai)ba.d).e = (String[])this;
        ba.d.i();
        ba.d.s();
        return;
      } 
      if (j == 2) {
        int k = ba.d("progessBuffer");
        ba.d("progess", k);
        ((ai)ba.d).D = 0;
        ((ai)ba.d).Z = 0;
        ((ai)ba.d).A = false;
        return;
      } 
      if (j == 0) {
        ba.d.r();
        return;
      } 
      if (j == 3) {
        int k = ba.d("progessBuffer");
        ba.d("progess", k);
        ((ai)ba.d).D = 0;
        ((ai)ba.d).Z = 0;
        ba.d.j();
        return;
      } 
      if (j == 4) {
        int k = ba.d("progess");
        ba.d("progess", 2200);
        ba.d("progessBuffer", k);
        return;
      } 
    } 
    if (s == 3) {
      this.b = s;
      this.d = true;
      ((ai)ba.d).e = (String[])this;
      ba.d.d(str);
      return;
    } 
    if (s == 4) {
      if (j == 0) {
        if (((p)ba.d).d[0] != null)
          ((p)ba.d).d[0].b(); 
        if (((p)ba.d).d[2] != null)
          ((p)ba.d).d[2].b(); 
        if (((p)ba.d).d[1] != null)
          ((p)ba.d).d[1].b(); 
        (new i((short)129)).c();
        (new i((short)158)).c();
        (new i((short)187)).c();
        return;
      } 
      if (j == 1) {
        (new i((short)129)).b();
        (new i((short)158)).b();
        (new i((short)187)).b();
        if (((p)ba.d).d[0] != null)
          ((p)ba.d).d[0].c(); 
        if (((p)ba.d).d[2] != null)
          ((p)ba.d).d[2].c(); 
        if (((p)ba.d).d[1] != null)
          ((p)ba.d).d[1].c(); 
        return;
      } 
      return;
    } 
    if (s == 5) {
      if (j == 0) {
        ((ai)ba.d).Z = 0;
        ((ai)ba.d).D = 0;
        return;
      } 
      ((ai)ba.d).Z = j;
      ba.d("Phụ bản Nan Độ", j);
      int k = Integer.parseInt(str);
      arrayOfInt = new int[][] { { 0, 2, 4 }, { 0, 2, 4 }, { 0, 2, 4 }, { 0, 3, 5 }, { 0, 3, 5 }, { 0, 3, 5 }, { 0, 4, 7 }, { 0, 4, 7 }, { 0, 4, 7 } };
      ((ai)ba.d).D = arrayOfInt[k][j - 1];
      return;
    } 
    if (arrayOfInt == 6) {
      i i1;
      (i1 = ba.d.d((short)j)).d = (short)((i1 = ba.d.d((short)j)).d + 1);
      ((p)ba.d).W -= (i1.d == 2) ? 2000 : 3000;
      return;
    } 
    if (arrayOfInt == 7) {
      int k = ((b)ba.d).e - 320;
      i = ((b)ba.d).c - 321;
      bj bj1 = ((ai)ba.d).d;
      String[] arrayOfString = ((ai)ba.d).e;
      if (k < 0)
        ((ai)ba.d).d = -(-k >> 1); 
      if (i < 0)
        ((ai)ba.d).e = -(-i >> 1); 
      i = (j >> 8 & 0xFF) << 4;
      j = (j & 0xFF) << 4;
      i += 8;
      j -= 8;
      i -= ((ai)ba.d).d;
      j -= ((ai)ba.d).e;
      ((ai)ba.d).d = bj1;
      ((ai)ba.d).e = arrayOfString;
      j = i << 16 | j & 0xFFFF;
      if (str.equals("ON")) {
        ba.d.e(true, j);
        return;
      } 
      ba.d.e(false, j);
      return;
    } 
    if (i == 8) {
      if (j == 0)
        ba.d.f(); 
      if (j == 1)
        ((p)ba.d).X = 0; 
      ((p)ba.d).n = true;
      return;
    } 
    if (i == 9) {
      ((p)ba.d).d[5].b();
      ((p)ba.d).d[5] = null;
      short s1;
      for (s1 = 0; s1 < i; s1 = (short)(s1 + 1))
        ba.d.e(s1); 
      ((p)ba.d).e = -1;
      if (((ai)ba.d).d != null) {
        v.d().d(((as)((ai)ba.d).d).e.d);
        ((ai)ba.d).d = null;
      } 
      if (((ai)ba.d).e != null) {
        v.d().d(((aa)((au)((ai)ba.d).e).d).d);
        ((ai)ba.d).e = null;
        ((ai)ba.d).c = null;
        ((ai)ba.d).b = null;
      } 
      ((p)ba.d).R = -1;
      return;
    } 
    if (i == 10) {
      Hashtable hashtable;
      ((ai)(hashtable = ba.d)).G = j;
      if (((ai)hashtable).G >= 0) {
        ((ai)hashtable).I = ah.d(((ai)hashtable).e[((ai)hashtable).G]);
        ((ai)hashtable).H = 320;
      } 
      return;
    } 
  }
  
  private void j() {
    int i = this.d.d();
    int j = this.d.d();
    byte b = this.d.d();
    if (i < 0 || j < 0) {
      i = ba.d("BOSSX");
      j = ba.d("BOSSY");
    } 
    short[] arrayOfShort = new short[b];
    for (byte b1 = 0; b1 < b; b1++)
      arrayOfShort[b1] = this.d.d(); 
    ((p)ba.d).d = (v)arrayOfShort;
    ((p)ba.d).l = i;
    ((p)ba.d).m = j;
  }
  
  private void k() {
    this.d = true;
    short s = this.d.d();
    this.b = s;
    this.a = 0;
    for (byte b = 0; b < s; b++) {
      Hashtable hashtable2;
      String str = this.d.d();
      int i;
      int[] arrayOfInt1 = new int[i = this.d.d() & 0xFF];
      int[] arrayOfInt2 = new int[i];
      int[] arrayOfInt3 = new int[i];
      boolean[] arrayOfBoolean = new boolean[i];
      for (byte b1 = 0; b1 < i; b1++) {
        arrayOfInt1[b1] = this.d.d() & 0xFF;
        arrayOfInt2[b1] = this.d.d() & 0xFF;
        arrayOfInt3[b1] = this.d.d() & 0xFF;
        arrayOfBoolean[b1] = this.d.d();
      } 
      x x;
      if ((x = l.d().d(str)) == null)
        hashtable2 = ba.d; 
      arrayOfInt3 = arrayOfInt3;
      arrayOfInt2 = arrayOfInt2;
      arrayOfInt1 = arrayOfInt1;
      Hashtable hashtable1;
      ((e)(hashtable1 = hashtable2)).a = false;
      ((e)hashtable1).c = true;
      ((e)hashtable1).d = (m)arrayOfInt1;
      ((e)hashtable1).e = (m)arrayOfInt2;
      ((e)hashtable1).c = arrayOfInt3;
      ((e)hashtable1).d = (m)arrayOfBoolean;
      ((ai)ba.d).e = (String[])this;
    } 
  }
  
  private void l() {
    String str = this.d.d();
    short[] arrayOfShort = new short[((b)ba.d).d.d()];
    byte b1 = 0;
    byte b2 = 0;
    int i = ((b)ba.d).d.d();
    while (b2 < i) {
      if (((m)((b)ba.d).d.d(b2)).d.equals(str)) {
        arrayOfShort[b1] = ((b)ba.d).d.d(b2);
        b1++;
      } 
      b2++;
    } 
    for (b2 = 0; b2 < b1; b2++)
      ((b)ba.d).d.d(arrayOfShort[b2]); 
  }
  
  public final void h() {
    n.d().d((short)this.b);
    a();
  }
  
  public final void g() {
    a();
  }
  
  private void m() {
    short s = this.d.d();
    l l = l.d();
    for (byte b = 0; b < s; b++) {
      Hashtable hashtable;
      String str = this.d.d();
      x x;
      if ((x = l.d(str)) == null)
        hashtable = ba.d; 
      if (((e)hashtable).d != null) {
        ((e)hashtable).e = ((e)hashtable).d;
        ((e)hashtable).c = ((e)hashtable).d;
        hashtable.v();
        ((e)hashtable).d = null;
        hashtable.z();
        ((e)hashtable).a = false;
      } 
    } 
  }
  
  private void d(int paramInt) {
    this.e++;
    while (this.e != paramInt && this.e < this.c) {
      short s = this.d.d();
      this.d.d(s);
      this.e++;
    } 
    this.e--;
  }
  
  public final void d(int paramInt, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: tableswitch default -> 1378, 7 -> 552, 8 -> 557, 9 -> 1378, 10 -> 1378, 11 -> 1378, 12 -> 1378, 13 -> 1378, 14 -> 1378, 15 -> 1378, 16 -> 1378, 17 -> 1378, 18 -> 562, 19 -> 1378, 20 -> 567, 21 -> 1378, 22 -> 1378, 23 -> 485, 24 -> 527, 25 -> 573, 26 -> 1378, 27 -> 594, 28 -> 610, 29 -> 1378, 30 -> 627, 31 -> 1378, 32 -> 1378, 33 -> 1236, 34 -> 1241, 35 -> 1378, 36 -> 1378, 37 -> 1378, 38 -> 1378, 39 -> 1378, 40 -> 1378, 41 -> 1378, 42 -> 1279, 43 -> 1284, 44 -> 1378, 45 -> 1289, 46 -> 1378, 47 -> 1378, 48 -> 1294, 49 -> 1378, 50 -> 1299, 51 -> 533, 52 -> 1378, 53 -> 1314, 54 -> 1378, 55 -> 1319, 56 -> 1378, 57 -> 1378, 58 -> 1378, 59 -> 1378, 60 -> 1378, 61 -> 538, 62 -> 1378, 63 -> 1378, 64 -> 1324, 65 -> 1378, 66 -> 532, 67 -> 1378, 68 -> 1378, 69 -> 1378, 70 -> 1378, 71 -> 1378, 72 -> 1378, 73 -> 1378, 74 -> 1378, 75 -> 1378, 76 -> 1378, 77 -> 1378, 78 -> 1325, 79 -> 1330, 80 -> 1378, 81 -> 1335, 82 -> 1378, 83 -> 1378, 84 -> 1340, 85 -> 1378, 86 -> 1345, 87 -> 1378, 88 -> 1378, 89 -> 1378, 90 -> 1378, 91 -> 471, 92 -> 1378, 93 -> 1378, 94 -> 1378, 95 -> 1378, 96 -> 1378, 97 -> 1378, 98 -> 1378, 99 -> 1346, 100 -> 1378, 101 -> 466, 102 -> 465, 103 -> 460, 104 -> 1378, 105 -> 424, 106 -> 1378, 107 -> 1351
    //   424: aload_0
    //   425: dup
    //   426: astore_1
    //   427: invokevirtual a : ()V
    //   430: aload_1
    //   431: getfield b : I
    //   434: iconst_2
    //   435: if_icmpne -> 459
    //   438: aload_1
    //   439: getfield a : I
    //   442: iconst_1
    //   443: if_icmpne -> 459
    //   446: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   449: iconst_0
    //   450: putfield Z : I
    //   453: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   456: invokevirtual j : ()V
    //   459: return
    //   460: aload_0
    //   461: invokevirtual a : ()V
    //   464: return
    //   465: return
    //   466: aload_0
    //   467: invokevirtual a : ()V
    //   470: return
    //   471: aload_0
    //   472: astore_1
    //   473: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   476: iconst_0
    //   477: invokevirtual d : (Z)V
    //   480: aload_1
    //   481: invokevirtual a : ()V
    //   484: return
    //   485: aload_0
    //   486: iload_1
    //   487: istore_3
    //   488: astore_1
    //   489: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   492: getfield d : Lcom/fs/arpg/al;
    //   495: dup
    //   496: astore_2
    //   497: ifnull -> 526
    //   500: aload_2
    //   501: iload_3
    //   502: invokevirtual d : (I)Z
    //   505: ifeq -> 526
    //   508: aload_1
    //   509: invokevirtual a : ()V
    //   512: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   515: aconst_null
    //   516: putfield e : Lcom/fs/arpg/m;
    //   519: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   522: aconst_null
    //   523: putfield d : Lcom/fs/arpg/al;
    //   526: return
    //   527: aload_0
    //   528: invokevirtual h : ()V
    //   531: return
    //   532: return
    //   533: aload_0
    //   534: invokevirtual a : ()V
    //   537: return
    //   538: aload_0
    //   539: astore_1
    //   540: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ac;
    //   543: aconst_null
    //   544: putfield d : Lcom/fs/arpg/m;
    //   547: aload_1
    //   548: invokevirtual a : ()V
    //   551: return
    //   552: aload_0
    //   553: invokevirtual f : ()V
    //   556: return
    //   557: aload_0
    //   558: invokevirtual a : ()V
    //   561: return
    //   562: aload_0
    //   563: invokevirtual a : ()V
    //   566: return
    //   567: aload_0
    //   568: aload_2
    //   569: invokevirtual d : (Ljava/lang/Object;)V
    //   572: return
    //   573: aload_0
    //   574: invokevirtual a : ()V
    //   577: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   580: invokevirtual b : ()V
    //   583: invokestatic d : ()Lcom/fs/arpg/d;
    //   586: invokevirtual d : ()V
    //   589: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   592: pop
    //   593: return
    //   594: aload_0
    //   595: astore_1
    //   596: iconst_0
    //   597: putstatic com/fs/arpg/an.b : Z
    //   600: aload_1
    //   601: aconst_null
    //   602: putfield d : Lcom/fs/arpg/m;
    //   605: aload_1
    //   606: invokevirtual a : ()V
    //   609: return
    //   610: aload_0
    //   611: iload_1
    //   612: istore_3
    //   613: dup
    //   614: astore_1
    //   615: getfield e : Ljava/lang/String;
    //   618: iload_3
    //   619: invokestatic d : (Ljava/lang/String;I)V
    //   622: aload_1
    //   623: invokevirtual a : ()V
    //   626: return
    //   627: aload_0
    //   628: iload_1
    //   629: istore_3
    //   630: dup
    //   631: astore_1
    //   632: dup
    //   633: getfield z : I
    //   636: iconst_1
    //   637: iadd
    //   638: putfield z : I
    //   641: aload_1
    //   642: getfield b : I
    //   645: bipush #16
    //   647: ishr
    //   648: istore_2
    //   649: aload_1
    //   650: getfield z : I
    //   653: iconst_1
    //   654: if_icmpne -> 1062
    //   657: bipush #24
    //   659: newarray short
    //   661: dup
    //   662: iconst_0
    //   663: bipush #101
    //   665: sastore
    //   666: dup
    //   667: iconst_1
    //   668: bipush #107
    //   670: sastore
    //   671: dup
    //   672: iconst_2
    //   673: bipush #112
    //   675: sastore
    //   676: dup
    //   677: iconst_3
    //   678: bipush #119
    //   680: sastore
    //   681: dup
    //   682: iconst_4
    //   683: bipush #125
    //   685: sastore
    //   686: dup
    //   687: iconst_5
    //   688: sipush #130
    //   691: sastore
    //   692: dup
    //   693: bipush #6
    //   695: sipush #136
    //   698: sastore
    //   699: dup
    //   700: bipush #7
    //   702: sipush #142
    //   705: sastore
    //   706: dup
    //   707: bipush #8
    //   709: sipush #148
    //   712: sastore
    //   713: dup
    //   714: bipush #9
    //   716: sipush #154
    //   719: sastore
    //   720: dup
    //   721: bipush #10
    //   723: sipush #159
    //   726: sastore
    //   727: dup
    //   728: bipush #11
    //   730: sipush #165
    //   733: sastore
    //   734: dup
    //   735: bipush #12
    //   737: sipush #171
    //   740: sastore
    //   741: dup
    //   742: bipush #13
    //   744: sipush #177
    //   747: sastore
    //   748: dup
    //   749: bipush #14
    //   751: sipush #183
    //   754: sastore
    //   755: dup
    //   756: bipush #15
    //   758: sipush #188
    //   761: sastore
    //   762: dup
    //   763: bipush #16
    //   765: sipush #194
    //   768: sastore
    //   769: dup
    //   770: bipush #17
    //   772: sipush #200
    //   775: sastore
    //   776: dup
    //   777: bipush #18
    //   779: sipush #206
    //   782: sastore
    //   783: dup
    //   784: bipush #19
    //   786: sipush #212
    //   789: sastore
    //   790: dup
    //   791: bipush #20
    //   793: sipush #217
    //   796: sastore
    //   797: dup
    //   798: bipush #21
    //   800: sipush #223
    //   803: sastore
    //   804: dup
    //   805: bipush #22
    //   807: sipush #229
    //   810: sastore
    //   811: dup
    //   812: bipush #23
    //   814: sipush #235
    //   817: sastore
    //   818: astore #4
    //   820: iconst_0
    //   821: istore #5
    //   823: aload #4
    //   825: arraylength
    //   826: istore #6
    //   828: iload #5
    //   830: iload #6
    //   832: if_icmpge -> 854
    //   835: iload_2
    //   836: aload #4
    //   838: iload #5
    //   840: saload
    //   841: if_icmpne -> 848
    //   844: iconst_1
    //   845: goto -> 855
    //   848: iinc #5, 1
    //   851: goto -> 828
    //   854: iconst_0
    //   855: ifeq -> 879
    //   858: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   861: aload_1
    //   862: putfield e : Lcom/fs/arpg/m;
    //   865: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   868: getfield d : Lcom/fs/arpg/j;
    //   871: ldc 'Có trang bị mới có thể chế tạo!'
    //   873: invokevirtual d : (Ljava/lang/String;)V
    //   876: goto -> 1186
    //   879: iload_2
    //   880: invokestatic d : (S)Lcom/fs/arpg/g;
    //   883: getfield d : B
    //   886: bipush #6
    //   888: if_icmpne -> 964
    //   891: iload_2
    //   892: ifeq -> 1231
    //   895: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   898: aload_1
    //   899: putfield e : Lcom/fs/arpg/m;
    //   902: new java/lang/StringBuffer
    //   905: dup
    //   906: invokespecial <init> : ()V
    //   909: dup
    //   910: astore #4
    //   912: ldc 'Bạn có muốn trang bị thẻ võ tướng mới không {'
    //   914: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   917: iload_2
    //   918: invokestatic d : (S)Lcom/fs/arpg/g;
    //   921: getfield e : [C
    //   924: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   927: ldc '}?'
    //   929: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   932: pop
    //   933: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   936: getfield d : Lcom/fs/arpg/j;
    //   939: bipush #115
    //   941: putfield d : I
    //   944: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   947: getfield d : Lcom/fs/arpg/j;
    //   950: aload #4
    //   952: invokevirtual toString : ()Ljava/lang/String;
    //   955: invokevirtual toCharArray : ()[C
    //   958: invokevirtual c : ([C)V
    //   961: goto -> 1186
    //   964: iload_2
    //   965: invokestatic d : (S)Lcom/fs/arpg/g;
    //   968: getfield d : B
    //   971: bipush #8
    //   973: if_icmpne -> 1055
    //   976: ldc 'Bài giảng Phụ Ma'
    //   978: invokestatic d : (Ljava/lang/String;)I
    //   981: iconst_1
    //   982: if_icmpne -> 1055
    //   985: iload_2
    //   986: invokestatic d : (S)Lcom/fs/arpg/g;
    //   989: astore #4
    //   991: new java/lang/StringBuffer
    //   994: dup
    //   995: ldc 'Đạt được {'
    //   997: invokespecial <init> : (Ljava/lang/String;)V
    //   1000: aload #4
    //   1002: getfield e : [C
    //   1005: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   1008: ldc '}, Chức năng: '
    //   1010: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1013: aload #4
    //   1015: getfield d : [C
    //   1018: invokevirtual append : ([C)Ljava/lang/StringBuffer;
    //   1021: ldc 'Có ngay lập tức Phụ Ma không?'
    //   1023: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1026: astore_1
    //   1027: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1030: getfield d : Lcom/fs/arpg/j;
    //   1033: bipush #118
    //   1035: putfield d : I
    //   1038: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1041: getfield d : Lcom/fs/arpg/j;
    //   1044: aload_1
    //   1045: invokevirtual toString : ()Ljava/lang/String;
    //   1048: invokevirtual toCharArray : ()[C
    //   1051: invokevirtual c : ([C)V
    //   1054: return
    //   1055: aload_1
    //   1056: invokevirtual a : ()V
    //   1059: goto -> 1186
    //   1062: aload_1
    //   1063: getfield z : I
    //   1066: iconst_2
    //   1067: if_icmpne -> 1186
    //   1070: iload_3
    //   1071: sipush #200
    //   1074: if_icmpne -> 1154
    //   1077: iload_2
    //   1078: invokestatic d : (S)Lcom/fs/arpg/g;
    //   1081: getfield d : B
    //   1084: bipush #6
    //   1086: if_icmpne -> 1154
    //   1089: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1092: getfield d : [Lcom/fs/arpg/i;
    //   1095: iconst_5
    //   1096: aaload
    //   1097: ifnull -> 1111
    //   1100: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1103: getfield d : [Lcom/fs/arpg/i;
    //   1106: iconst_5
    //   1107: aaload
    //   1108: invokevirtual b : ()V
    //   1111: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1114: iload_2
    //   1115: invokevirtual d : (S)Lcom/fs/arpg/i;
    //   1118: dup
    //   1119: astore #4
    //   1121: invokevirtual c : ()V
    //   1124: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1127: getfield d : [Lcom/fs/arpg/i;
    //   1130: iconst_5
    //   1131: aload #4
    //   1133: aastore
    //   1134: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1137: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/p;
    //   1140: getfield d : [Lcom/fs/arpg/i;
    //   1143: iconst_5
    //   1144: aaload
    //   1145: getfield d : Lcom/fs/arpg/g;
    //   1148: getfield d : S
    //   1151: putfield e : S
    //   1154: iload_3
    //   1155: sipush #200
    //   1158: if_icmpne -> 1181
    //   1161: iload_2
    //   1162: invokestatic d : (S)Lcom/fs/arpg/g;
    //   1165: getfield d : B
    //   1168: bipush #8
    //   1170: if_icmpne -> 1181
    //   1173: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1176: iload_2
    //   1177: invokevirtual d : (S)V
    //   1180: return
    //   1181: aload_1
    //   1182: invokevirtual a : ()V
    //   1185: return
    //   1186: iload_3
    //   1187: sipush #200
    //   1190: if_icmpeq -> 1205
    //   1193: iload_2
    //   1194: invokestatic d : (S)Lcom/fs/arpg/g;
    //   1197: getfield d : B
    //   1200: bipush #8
    //   1202: if_icmpeq -> 1235
    //   1205: iload_3
    //   1206: sipush #200
    //   1209: if_icmpne -> 1231
    //   1212: iload_2
    //   1213: invokestatic d : (S)Lcom/fs/arpg/g;
    //   1216: getfield d : B
    //   1219: bipush #8
    //   1221: if_icmpne -> 1231
    //   1224: getstatic com/fs/arpg/ba.d : Lcom/fs/arpg/ai;
    //   1227: iconst_0
    //   1228: putfield x : Z
    //   1231: aload_1
    //   1232: invokevirtual a : ()V
    //   1235: return
    //   1236: aload_0
    //   1237: invokevirtual a : ()V
    //   1240: return
    //   1241: aload_0
    //   1242: astore_1
    //   1243: new java/lang/String
    //   1246: dup
    //   1247: invokestatic d : ()Lcom/fs/arpg/bg;
    //   1250: bipush #118
    //   1252: invokevirtual d : (S)[C
    //   1255: invokespecial <init> : ([C)V
    //   1258: dup
    //   1259: astore #4
    //   1261: invokestatic d : (Ljava/lang/String;)I
    //   1264: ifne -> 1274
    //   1267: aload #4
    //   1269: iconst_1
    //   1270: invokestatic d : (Ljava/lang/String;I)V
    //   1273: return
    //   1274: aload_1
    //   1275: invokevirtual a : ()V
    //   1278: return
    //   1279: aload_0
    //   1280: invokevirtual a : ()V
    //   1283: return
    //   1284: aload_0
    //   1285: invokevirtual a : ()V
    //   1288: return
    //   1289: aload_0
    //   1290: invokevirtual a : ()V
    //   1293: return
    //   1294: aload_0
    //   1295: invokevirtual a : ()V
    //   1298: return
    //   1299: aload_0
    //   1300: iload_1
    //   1301: istore_3
    //   1302: astore_1
    //   1303: iload_3
    //   1304: bipush #100
    //   1306: if_icmpne -> 1313
    //   1309: aload_1
    //   1310: invokevirtual a : ()V
    //   1313: return
    //   1314: aload_0
    //   1315: invokevirtual a : ()V
    //   1318: return
    //   1319: aload_0
    //   1320: invokevirtual a : ()V
    //   1323: return
    //   1324: return
    //   1325: aload_0
    //   1326: invokevirtual a : ()V
    //   1329: return
    //   1330: aload_0
    //   1331: invokevirtual a : ()V
    //   1334: return
    //   1335: aload_0
    //   1336: invokevirtual a : ()V
    //   1339: return
    //   1340: aload_0
    //   1341: invokevirtual a : ()V
    //   1344: return
    //   1345: return
    //   1346: aload_0
    //   1347: invokevirtual a : ()V
    //   1350: return
    //   1351: aload_0
    //   1352: dup
    //   1353: astore_1
    //   1354: dup
    //   1355: getfield a : I
    //   1358: iconst_1
    //   1359: iadd
    //   1360: putfield a : I
    //   1363: aload_1
    //   1364: getfield a : I
    //   1367: aload_1
    //   1368: getfield b : I
    //   1371: if_icmplt -> 1378
    //   1374: aload_1
    //   1375: invokevirtual a : ()V
    //   1378: return
  }
  
  private void n() {
    ab ab;
    (ab = new ab()).d((bj)this.d);
    short s = this.d.d();
    if (ab.d() != 0)
      return; 
    d(s);
  }
  
  private void p() {
    this.d = true;
    byte b;
    be[] arrayOfBe = new be[b = this.d.d()];
    v v = v.d();
    l l = l.d();
    h h = new h();
    for (byte b1 = 0; b1 < b; b1++) {
      Hashtable hashtable;
      String str = this.d.d();
      short s = (short)this.d.d();
      x x = l.d(str);
      be be = new be();
      arrayOfBe[b1] = be;
      if (x == null) {
        (hashtable = ba.d).c(h);
        (arrayOfBe[b1]).ac = ((e)hashtable).ac - 40;
      } else {
        hashtable.c(h);
        (arrayOfBe[b1]).ac = ((e)hashtable).ac - h.d();
      } 
      v.d((short)73, be);
      be.c = s;
      be.v();
      be.ab = ((e)hashtable).ab;
    } 
    ba.d.d(arrayOfBe, this);
  }
  
  private void o() {
    this.d = true;
    short s;
    short[] arrayOfShort1 = new short[s = this.d.d()];
    for (byte b1 = 0; b1 < s; b1++)
      arrayOfShort1[b1] = this.d.d(); 
    short[] arrayOfShort2 = new short[s];
    s = 0;
    byte b2 = 0;
    int i = arrayOfShort2.length;
    while (b2 < i) {
      if ((arrayOfShort1[b2] != 13 || i.e < 3) && (arrayOfShort1[b2] != 14 || i.c < 3)) {
        arrayOfShort2[s] = arrayOfShort1[b2];
        s++;
      } 
      b2++;
    } 
    arrayOfShort1 = new short[s];
    System.arraycopy(arrayOfShort2, 0, arrayOfShort1, 0, s);
    ((ai)ba.d).e = (String[])this;
    ba.d.d(arrayOfShort1);
  }
  
  private static void q() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])ba.d.get(((b)ba.d).d)) == null)
      return; 
    int i;
    if ((i = ba.d("progess") / 100) > ba.e)
      return; 
    try {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
      short s;
      for (s = 0; s < i; s++) {
        short s1;
        if ((s1 = dataInputStream.readShort()) != 0)
          dataInputStream.skip(s1); 
      } 
      if (dataInputStream.readShort() == 0)
        return; 
      s = dataInputStream.readShort();
      i = dataInputStream.readShort();
      l l = l.d();
      byte b;
      for (b = 0; b < l.d.size(); b++) {
        h h;
        if ((h = l.d[b]) != null && (((x)h).l || ((as)((x)h).d).b)) {
          ((x)h).m = s;
          if (((as)((x)h).d).d != 0 && ((ai)ba.d).Z != 0) {
            ((x)h).m += ((ai)ba.d).Z - 1;
          } else if (((ai)ba.d).Z != 0) {
            ((x)h).m += ((ai)ba.d).D;
          } 
          h.k();
        } 
      } 
      if (i == 0) {
        dataInputStream.close();
        return;
      } 
      for (b = 0; b < i; b++) {
        String str = dataInputStream.readUTF();
        s = dataInputStream.readShort();
        x x;
        if ((x = (x)l.d.get(str)) != null) {
          x.m = s;
          if (((as)x.d).d != 0 && ((ai)ba.d).Z != 0) {
            x.m += ((ai)ba.d).Z - 1;
          } else if (((ai)ba.d).Z != 0) {
            x.m += ((ai)ba.d).D;
          } 
          x.k();
        } 
      } 
      dataInputStream.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void s() {
    this.d = true;
    this.e = this.d.d();
    short s = this.d.d();
    byte b1 = this.d.d();
    byte b2 = this.d.d();
    if (this.e == null) {
      ba.d.e(s, b1);
      a();
      return;
    } 
    ((ai)ba.d).e = (String[])this;
    if ((ba.d(s)).d != 7) {
      ((ai)ba.d).d.d(this.e, ba.d(s), b2, b1);
    } else if ((ba.d(s)).d == 7 && this.e != null) {
      ba.d.d(s, b1);
      a();
      return;
    } 
    if (this.e != null)
      if (i.d(s)) {
        i i = new i(s);
        while (b1 > 0) {
          i.e();
          b1--;
        } 
      } else {
        ba.d.d(s, b1);
      }  
    this.b = s << 16 | b1 & 0xFFFF;
    this.a = b2;
    this.z = 0;
  }
  
  private void r() {
    this.d = true;
    String str = e(str = this.d.d());
    this.e = this.d.d();
    ba.d(this.e, 0);
    byte b = this.d.d();
    StringBuffer stringBuffer = new StringBuffer();
    int[] arrayOfInt = new int[b];
    for (byte b1 = 0; b1 < b; b1++) {
      String str1 = this.d.d();
      stringBuffer.append(str1);
      arrayOfInt[b1] = str1.length();
    } 
    ((ai)ba.d).e = (String[])this;
    ((ai)ba.d).d.d(stringBuffer.toString().toCharArray(), str.toCharArray(), arrayOfInt);
  }
  
  private void t() {
    this.c = this.d.d();
    this.a = this.d.d();
    if (this.c && ((ai)ba.d).b == null) {
      this.b = 0;
      this.d = true;
    } 
    l l = l.d();
    v v = v.d();
    for (byte b = 0; b < this.a; b++) {
      ae ae;
      Hashtable hashtable;
      String str = this.d.d();
      short s1 = this.d.d();
      short s2 = this.d.d();
      boolean bool1 = this.d.d();
      boolean bool2 = this.d.d();
      x x;
      if ((x = l.d(str)) == null)
        ae = l.d(str); 
      if (ae == null)
        hashtable = ba.d; 
      if (((e)hashtable).d == null) {
        ((e)hashtable).d = ((e)hashtable).e;
        ((e)hashtable).d = ((e)hashtable).c;
      } 
      ((e)hashtable).a = false;
      ((e)hashtable).h = false;
      ((e)hashtable).r = false;
      ((e)hashtable).z = false;
      v.d(s1, (be)hashtable);
      ((e)hashtable).c = s2;
      ((e)hashtable).d = this.c;
      hashtable.v();
      ((e)hashtable).d = this;
      if (!bool1 && !bool2) {
        ((e)hashtable).a = true;
        ((e)hashtable).h = false;
      } else if (!bool1 && bool2) {
        ((e)hashtable).a = false;
        ((e)hashtable).h = true;
      } else if (bool1 && !bool2) {
        ((e)hashtable).a = false;
        ((e)hashtable).h = false;
      } else if (bool1 && bool2) {
        ((e)hashtable).z = true;
      } 
    } 
  }
  
  public final void d(Object paramObject) {
    e e = (e)paramObject;
    if (paramObject == null)
      return; 
    if (e.d != null)
      this.b++; 
    e.d = null;
    if (e.z)
      if ((paramObject = l.d().d((String)e.d)) != null) {
        l.d().c((x)paramObject);
        paramObject.i();
        paramObject.l();
      } else {
        paramObject = l.d().d((String)e.d);
        l.d().e((ae)paramObject);
        paramObject.l();
        ba.e.d((be)paramObject);
      }  
    if (this.b >= this.a && this.c) {
      a();
      this.b = 0;
    } 
  }
  
  private void u() {
    String str = this.d.d();
    m m1 = new m(str);
    byte b = this.d.d();
    for (byte b1 = 0; b1 < b; b1++) {
      short s1 = this.d.d();
      short s2 = this.d.d();
      ba.d.d(m1, s1 >> 4, s2 >> 4);
    } 
  }
  
  private void v() {
    m m1;
    int i;
    String str1 = this.d.d();
    byte b = this.d.d();
    String str2 = this.d.d();
    l l = l.d();
    m m3 = new m(str2);
    if (str1.startsWith("Tất cả NPC")) {
      String[] arrayOfString = null;
      i = 0;
      if (!str1.equals("Tất cả NPC"))
        i = (arrayOfString = bi.d(str1.substring(6), '^')).length; 
      for (byte b1 = 0; b1 < l.d.size(); b1++) {
        h h;
        if ((h = l.d[b1]) != null) {
          boolean bool = true;
          for (byte b2 = 0; b2 < i; b2++) {
            if (((x)h).d.indexOf(arrayOfString[b2]) != -1) {
              bool = false;
              break;
            } 
          } 
          if (bool && (h.d(b) == null || !(h.d(b)).d.equals(m3.d))) {
            m1 = m3;
            m m4;
            (m4 = new m()).d = m1.d;
            m4.d = (m)new bj();
            m4.d.d((byte[])m1.d);
            m4.c = m4.d.d();
            h.d(m4, b);
          } 
        } 
      } 
      return;
    } 
    x x = l.d((String)m1);
    m m2 = new m(i);
    if (x == null && m1.equals(((p)ba.d).d)) {
      ((p)ba.d).e = (i)m2;
      return;
    } 
    x.d(m2, b);
  }
  
  private final void w() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/fs/arpg/bj;
    //   4: invokevirtual d : ()S
    //   7: istore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iload_2
    //   11: iload_1
    //   12: if_icmpge -> 122
    //   15: aload_0
    //   16: getfield d : Lcom/fs/arpg/bj;
    //   19: invokevirtual d : ()Ljava/lang/String;
    //   22: astore_3
    //   23: aload_0
    //   24: getfield d : Lcom/fs/arpg/bj;
    //   27: invokevirtual d : ()S
    //   30: istore #4
    //   32: invokestatic d : ()Lcom/fs/arpg/l;
    //   35: dup
    //   36: astore #5
    //   38: aload_3
    //   39: invokevirtual d : (Ljava/lang/String;)Lcom/fs/arpg/x;
    //   42: dup
    //   43: astore #6
    //   45: ifnonnull -> 104
    //   48: aload_3
    //   49: ldc 'Tất cả NPC'
    //   51: invokevirtual equals : (Ljava/lang/Object;)Z
    //   54: ifeq -> 116
    //   57: iconst_0
    //   58: istore_3
    //   59: aload #5
    //   61: getfield d : Ljava/util/Hashtable;
    //   64: invokevirtual size : ()I
    //   67: istore #6
    //   69: iload_3
    //   70: iload #6
    //   72: if_icmpge -> 101
    //   75: aload #5
    //   77: getfield d : [Lcom/fs/arpg/x;
    //   80: iload_3
    //   81: aaload
    //   82: dup
    //   83: astore #7
    //   85: iload #4
    //   87: putfield m : I
    //   90: aload #7
    //   92: invokevirtual k : ()V
    //   95: iinc #3, 1
    //   98: goto -> 69
    //   101: goto -> 116
    //   104: aload #6
    //   106: iload #4
    //   108: putfield m : I
    //   111: aload #6
    //   113: invokevirtual k : ()V
    //   116: iinc #2, 1
    //   119: goto -> 10
    //   122: return
  }
  
  private void d(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      ba.d.e(paramInt1, paramInt2);
      ba.d.f();
      a();
      return;
    } 
    int j = paramInt2;
    int i = paramInt1;
    m m1 = this;
    Hashtable hashtable;
    ((ai)(hashtable = ba.d)).e = (String[])m1;
    hashtable.e(i, j);
    ((ai)hashtable).i = true;
    ((ai)hashtable).m = (((ai)hashtable).k >= ((ai)hashtable).d) ? 15 : -15;
    ((ai)hashtable).n = (((ai)hashtable).l >= ((ai)hashtable).e) ? 15 : -15;
  }
  
  private void x() {
    this.d = true;
    short s = this.d.d();
    l l = l.d();
    for (byte b = 0; b < s; b++) {
      String str = this.d.d();
      int i;
      int[] arrayOfInt1 = new int[i = this.d.d() & 0xFF];
      int[] arrayOfInt2 = new int[i];
      for (byte b1 = 0; b1 < i; b1++) {
        arrayOfInt1[b1] = this.d.d() & 0xFFFF;
        arrayOfInt2[b1] = this.d.d() & 0xFFFF;
      } 
      x x;
      if ((x = l.d(str)) != null) {
        x.d(this, arrayOfInt1, arrayOfInt2);
      } else {
        ba.d.d(this, arrayOfInt1, arrayOfInt2);
      } 
    } 
    this.b = s;
    this.a = 0;
  }
  
  public final void f() {
    this.a++;
    if (this.a >= this.b)
      a(); 
  }
  
  private void y() {
    String str;
    int i = Integer.parseInt((str = this.d.d()).substring(4, str.indexOf(".")));
    int j;
    short[] arrayOfShort1 = new short[j = this.d.d() & 0xFF];
    short[] arrayOfShort2 = new short[j];
    short[] arrayOfShort3 = new short[j];
    byte b;
    for (b = 0; b < j; b++) {
      arrayOfShort1[b] = this.d.d();
      arrayOfShort2[b] = this.d.d();
      arrayOfShort3[b] = this.d.d();
    } 
    for (b = 0; b < j; b++) {
      s s;
      (s = new s()).e = aq.b;
      s.d(l.d().d((short)i));
      s.d(arrayOfShort3[b]);
      ba.c.d(s, s.ab + arrayOfShort1[b], s.ac + arrayOfShort2[b]);
      s.f();
      l.d().d(s);
    } 
    this.z = j;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\m.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */