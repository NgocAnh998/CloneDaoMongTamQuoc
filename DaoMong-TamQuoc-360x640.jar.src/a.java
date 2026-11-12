import java.io.UnsupportedEncodingException;
import javax.wireless.messaging.TextMessage;

public final class a implements b {
  private static final Runtime d;
  
  private static final int d = 0;
  
  private static final int e = 1;
  
  private static final int c = 2;
  
  private static final int b = 3;
  
  private static final int a = 4;
  
  private static final int z = 5;
  
  private static final int h = 6;
  
  private static final int g = 7;
  
  private static final int f = 8;
  
  private static final int i = 9;
  
  private static final int j = 10;
  
  private static final int k = 11;
  
  private static final int l = 12;
  
  private static final int m = 13;
  
  private static final int n = 14;
  
  private static final int p = 15;
  
  private static final int o = 16;
  
  private static final int q = 17;
  
  private static final int s = 18;
  
  private static final int r = 19;
  
  private static final int t = 20;
  
  private static final int u = 21;
  
  private static final int v = 22;
  
  private static final int w = 23;
  
  private static final int x = 24;
  
  private static final Object d = new Integer(1);
  
  private static String d = "nil";
  
  private static String e = "string";
  
  private static String c = "number";
  
  private static String b = "boolean";
  
  private static String a = "function";
  
  private static String z = "table";
  
  private static String h = "thread";
  
  private static String g = "userdata";
  
  private int y;
  
  private static a[] d;
  
  private static Class d;
  
  private a(int paramInt) {
    this.y = paramInt;
  }
  
  public static void d(i parami) {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: dup
    //   6: astore_1
    //   7: iconst_0
    //   8: ldc 'pcall'
    //   10: aastore
    //   11: aload_1
    //   12: iconst_1
    //   13: ldc 'print'
    //   15: aastore
    //   16: aload_1
    //   17: iconst_2
    //   18: ldc 'select'
    //   20: aastore
    //   21: aload_1
    //   22: iconst_3
    //   23: ldc 'type'
    //   25: aastore
    //   26: aload_1
    //   27: iconst_4
    //   28: ldc 'tostring'
    //   30: aastore
    //   31: aload_1
    //   32: iconst_5
    //   33: ldc 'tonumber'
    //   35: aastore
    //   36: aload_1
    //   37: bipush #6
    //   39: ldc 'error'
    //   41: aastore
    //   42: aload_1
    //   43: bipush #7
    //   45: ldc 'unpack'
    //   47: aastore
    //   48: aload_1
    //   49: bipush #8
    //   51: ldc 'next'
    //   53: aastore
    //   54: aload_1
    //   55: bipush #9
    //   57: ldc 'setfenv'
    //   59: aastore
    //   60: aload_1
    //   61: bipush #10
    //   63: ldc 'getfenv'
    //   65: aastore
    //   66: aload_1
    //   67: bipush #11
    //   69: ldc 'rawequal'
    //   71: aastore
    //   72: aload_1
    //   73: bipush #12
    //   75: ldc '_s'
    //   77: aastore
    //   78: aload_1
    //   79: bipush #13
    //   81: ldc '_ss'
    //   83: aastore
    //   84: aload_1
    //   85: bipush #14
    //   87: ldc '_t'
    //   89: aastore
    //   90: aload_1
    //   91: bipush #15
    //   93: ldc '_a'
    //   95: aastore
    //   96: aload_1
    //   97: bipush #16
    //   99: ldc 'rp'
    //   101: aastore
    //   102: aload_1
    //   103: bipush #17
    //   105: ldc '_cn'
    //   107: aastore
    //   108: aload_1
    //   109: bipush #18
    //   111: ldc '_r'
    //   113: aastore
    //   114: aload_1
    //   115: bipush #19
    //   117: ldc '_o'
    //   119: aastore
    //   120: aload_1
    //   121: bipush #20
    //   123: ldc '_c'
    //   125: aastore
    //   126: aload_1
    //   127: bipush #21
    //   129: ldc '_sp'
    //   131: aastore
    //   132: aload_1
    //   133: bipush #22
    //   135: ldc 's3'
    //   137: aastore
    //   138: aload_1
    //   139: bipush #23
    //   141: ldc 's4'
    //   143: aastore
    //   144: getstatic a.d : [La;
    //   147: ifnonnull -> 185
    //   150: bipush #24
    //   152: anewarray a
    //   155: putstatic a.d : [La;
    //   158: iconst_0
    //   159: istore_2
    //   160: goto -> 179
    //   163: getstatic a.d : [La;
    //   166: iload_2
    //   167: new a
    //   170: dup
    //   171: iload_2
    //   172: invokespecial <init> : (I)V
    //   175: aastore
    //   176: iinc #2, 1
    //   179: iload_2
    //   180: bipush #24
    //   182: if_icmplt -> 163
    //   185: iconst_0
    //   186: istore_2
    //   187: goto -> 215
    //   190: aload_0
    //   191: dup
    //   192: astore_3
    //   193: getfield d : Ll;
    //   196: getfield d : Lj;
    //   199: aload_1
    //   200: iload_2
    //   201: aaload
    //   202: getstatic a.d : [La;
    //   205: iload_2
    //   206: aaload
    //   207: invokeinterface d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   212: iinc #2, 1
    //   215: iload_2
    //   216: bipush #24
    //   218: if_icmplt -> 190
    //   221: aload_0
    //   222: dup
    //   223: astore_3
    //   224: getfield d : Ll;
    //   227: getfield d : Lj;
    //   230: ldc '_co'
    //   232: getstatic a.d : Ljava/lang/Class;
    //   235: dup
    //   236: ifnonnull -> 264
    //   239: pop
    //   240: ldc 'javax.microedition.io.Connector'
    //   242: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   245: dup
    //   246: putstatic a.d : Ljava/lang/Class;
    //   249: goto -> 264
    //   252: new java/lang/NoClassDefFoundError
    //   255: dup_x1
    //   256: swap
    //   257: invokevirtual getMessage : ()Ljava/lang/String;
    //   260: invokespecial <init> : (Ljava/lang/String;)V
    //   263: athrow
    //   264: invokeinterface d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   269: return
    // Exception table:
    //   from	to	target	type
    //   240	245	252	java/lang/ClassNotFoundException
  }
  
  private static int e(e parame, int paramInt) {
    Object object;
    if (paramInt == 1 && object = parame.d(0) instanceof TextMessage) {
      parame.d(((TextMessage)object).getAddress());
      return 1;
    } 
    return 0;
  }
  
  public final int d(e parame, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield y : I
    //   4: tableswitch default -> 1653, 0 -> 116, 1 -> 138, 2 -> 246, 3 -> 248, 4 -> 379, 5 -> 555, 6 -> 658, 7 -> 660, 8 -> 666, 9 -> 769, 10 -> 944, 11 -> 1101, 12 -> 1230, 13 -> 1308, 14 -> 1351, 15 -> 1373, 16 -> 1415, 17 -> 1449, 18 -> 1486, 19 -> 1542, 20 -> 1568, 21 -> 1620, 22 -> 1163, 23 -> 1211
    //   116: aload_1
    //   117: iload_2
    //   118: istore_2
    //   119: dup
    //   120: astore_1
    //   121: getfield d : Ll;
    //   124: getfield d : Li;
    //   127: aload_1
    //   128: getfield d : Ll;
    //   131: iload_2
    //   132: iconst_1
    //   133: isub
    //   134: invokevirtual d : (Ll;I)I
    //   137: ireturn
    //   138: aload_1
    //   139: iload_2
    //   140: istore_2
    //   141: dup
    //   142: astore_1
    //   143: getfield d : Ll;
    //   146: getfield d : Li;
    //   149: dup
    //   150: astore_3
    //   151: dup
    //   152: astore #5
    //   154: getfield d : Ll;
    //   157: getfield d : Lj;
    //   160: dup
    //   161: astore #4
    //   163: ldc 'tostring'
    //   165: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   168: astore #5
    //   170: new java/lang/StringBuffer
    //   173: dup
    //   174: invokespecial <init> : ()V
    //   177: astore #6
    //   179: iconst_0
    //   180: istore #7
    //   182: goto -> 226
    //   185: aload_3
    //   186: aload #5
    //   188: aload_1
    //   189: iload #7
    //   191: invokevirtual d : (I)Ljava/lang/Object;
    //   194: aconst_null
    //   195: aconst_null
    //   196: invokevirtual d : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: astore #8
    //   201: aload #6
    //   203: aload #8
    //   205: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   208: pop
    //   209: iload #7
    //   211: iload_2
    //   212: if_icmpge -> 223
    //   215: aload #6
    //   217: ldc '\\t'
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   222: pop
    //   223: iinc #7, 1
    //   226: iload #7
    //   228: iload_2
    //   229: if_icmplt -> 185
    //   232: aload_3
    //   233: getfield d : Ljava/io/PrintStream;
    //   236: aload #6
    //   238: invokevirtual toString : ()Ljava/lang/String;
    //   241: invokevirtual println : (Ljava/lang/String;)V
    //   244: iconst_0
    //   245: ireturn
    //   246: iconst_0
    //   247: ireturn
    //   248: aload_1
    //   249: iload_2
    //   250: istore_2
    //   251: astore_1
    //   252: iload_2
    //   253: ifle -> 260
    //   256: iconst_1
    //   257: goto -> 261
    //   260: iconst_0
    //   261: ldc 'nea'
    //   263: invokestatic d : (ZLjava/lang/String;)V
    //   266: aload_1
    //   267: iconst_0
    //   268: invokevirtual d : (I)Ljava/lang/Object;
    //   271: astore_3
    //   272: aload_1
    //   273: aload_3
    //   274: dup
    //   275: astore #4
    //   277: ifnonnull -> 285
    //   280: ldc 'nil'
    //   282: goto -> 373
    //   285: aload #4
    //   287: instanceof java/lang/String
    //   290: ifeq -> 298
    //   293: ldc 'string'
    //   295: goto -> 373
    //   298: aload #4
    //   300: instanceof java/lang/Integer
    //   303: ifeq -> 311
    //   306: ldc 'number'
    //   308: goto -> 373
    //   311: aload #4
    //   313: instanceof java/lang/Boolean
    //   316: ifeq -> 324
    //   319: ldc 'boolean'
    //   321: goto -> 373
    //   324: aload #4
    //   326: instanceof b
    //   329: ifne -> 340
    //   332: aload #4
    //   334: instanceof f
    //   337: ifeq -> 345
    //   340: ldc 'function'
    //   342: goto -> 373
    //   345: aload #4
    //   347: instanceof j
    //   350: ifeq -> 358
    //   353: ldc 'table'
    //   355: goto -> 373
    //   358: aload #4
    //   360: instanceof l
    //   363: ifeq -> 371
    //   366: ldc 'thread'
    //   368: goto -> 373
    //   371: ldc 'userdata'
    //   373: invokevirtual d : (Ljava/lang/Object;)I
    //   376: pop
    //   377: iconst_1
    //   378: ireturn
    //   379: aload_1
    //   380: iload_2
    //   381: istore_2
    //   382: astore_1
    //   383: iload_2
    //   384: ifle -> 391
    //   387: iconst_1
    //   388: goto -> 392
    //   391: iconst_0
    //   392: ldc 'nea'
    //   394: invokestatic d : (ZLjava/lang/String;)V
    //   397: aload_1
    //   398: iconst_0
    //   399: invokevirtual d : (I)Ljava/lang/Object;
    //   402: dup
    //   403: astore_3
    //   404: aload_1
    //   405: getfield d : Ll;
    //   408: getfield d : Li;
    //   411: pop
    //   412: dup
    //   413: astore #5
    //   415: ifnonnull -> 423
    //   418: ldc 'nil'
    //   420: goto -> 544
    //   423: aload #5
    //   425: instanceof java/lang/String
    //   428: ifeq -> 439
    //   431: aload #5
    //   433: checkcast java/lang/String
    //   436: goto -> 544
    //   439: aload #5
    //   441: instanceof java/lang/Boolean
    //   444: ifeq -> 467
    //   447: aload #5
    //   449: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   452: if_acmpne -> 461
    //   455: ldc_w 'true'
    //   458: goto -> 544
    //   461: ldc_w 'false'
    //   464: goto -> 544
    //   467: aload #5
    //   469: instanceof b
    //   472: ifne -> 483
    //   475: aload #5
    //   477: instanceof f
    //   480: ifeq -> 507
    //   483: new java/lang/StringBuffer
    //   486: dup
    //   487: ldc_w 'function 0x'
    //   490: invokespecial <init> : (Ljava/lang/String;)V
    //   493: aload #5
    //   495: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   498: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   501: invokevirtual toString : ()Ljava/lang/String;
    //   504: goto -> 544
    //   507: aload #5
    //   509: instanceof j
    //   512: ifeq -> 539
    //   515: new java/lang/StringBuffer
    //   518: dup
    //   519: ldc_w 'table 0x'
    //   522: invokespecial <init> : (Ljava/lang/String;)V
    //   525: aload #5
    //   527: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   530: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   533: invokevirtual toString : ()Ljava/lang/String;
    //   536: goto -> 544
    //   539: aload #5
    //   541: invokevirtual toString : ()Ljava/lang/String;
    //   544: astore #4
    //   546: aload_1
    //   547: aload #4
    //   549: invokevirtual d : (Ljava/lang/Object;)I
    //   552: pop
    //   553: iconst_1
    //   554: ireturn
    //   555: aload_1
    //   556: iload_2
    //   557: istore_2
    //   558: astore_1
    //   559: iload_2
    //   560: ifle -> 567
    //   563: iconst_1
    //   564: goto -> 568
    //   567: iconst_0
    //   568: ldc 'nea'
    //   570: invokestatic d : (ZLjava/lang/String;)V
    //   573: aload_1
    //   574: iconst_0
    //   575: invokevirtual d : (I)Ljava/lang/Object;
    //   578: astore_3
    //   579: iload_2
    //   580: iconst_1
    //   581: if_icmpne -> 595
    //   584: aload_1
    //   585: aload_3
    //   586: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   589: invokevirtual d : (Ljava/lang/Object;)I
    //   592: pop
    //   593: iconst_1
    //   594: ireturn
    //   595: aload_3
    //   596: checkcast java/lang/String
    //   599: astore #4
    //   601: aload_1
    //   602: iconst_1
    //   603: invokevirtual d : (I)Ljava/lang/Object;
    //   606: dup
    //   607: astore #5
    //   609: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   612: dup
    //   613: astore #6
    //   615: ifnull -> 622
    //   618: iconst_1
    //   619: goto -> 623
    //   622: iconst_0
    //   623: ldc_w '2mn'
    //   626: invokestatic d : (ZLjava/lang/String;)V
    //   629: aload #6
    //   631: dup
    //   632: astore #5
    //   634: checkcast java/lang/Integer
    //   637: invokevirtual intValue : ()I
    //   640: istore #7
    //   642: aload #4
    //   644: iload #7
    //   646: invokestatic d : (Ljava/lang/String;I)Ljava/lang/Integer;
    //   649: astore_2
    //   650: aload_1
    //   651: aload_2
    //   652: invokevirtual d : (Ljava/lang/Object;)I
    //   655: pop
    //   656: iconst_1
    //   657: ireturn
    //   658: iconst_0
    //   659: ireturn
    //   660: aload_1
    //   661: iload_2
    //   662: invokestatic h : (Le;I)I
    //   665: ireturn
    //   666: aload_1
    //   667: iload_2
    //   668: istore_2
    //   669: astore_1
    //   670: iload_2
    //   671: ifle -> 678
    //   674: iconst_1
    //   675: goto -> 679
    //   678: iconst_0
    //   679: ldc 'nea'
    //   681: invokestatic d : (ZLjava/lang/String;)V
    //   684: aload_1
    //   685: iconst_0
    //   686: invokevirtual d : (I)Ljava/lang/Object;
    //   689: checkcast j
    //   692: astore #4
    //   694: aconst_null
    //   695: astore #5
    //   697: iload_2
    //   698: iconst_2
    //   699: if_icmplt -> 709
    //   702: aload_1
    //   703: iconst_1
    //   704: invokevirtual d : (I)Ljava/lang/Object;
    //   707: astore #5
    //   709: aload #4
    //   711: aload #5
    //   713: invokeinterface e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   718: dup
    //   719: astore #6
    //   721: ifnonnull -> 737
    //   724: aload_1
    //   725: iconst_1
    //   726: invokevirtual e : (I)V
    //   729: aload_1
    //   730: iconst_0
    //   731: aconst_null
    //   732: invokevirtual d : (ILjava/lang/Object;)V
    //   735: iconst_1
    //   736: ireturn
    //   737: aload #4
    //   739: aload #6
    //   741: invokeinterface d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   746: astore #7
    //   748: aload_1
    //   749: iconst_2
    //   750: invokevirtual e : (I)V
    //   753: aload_1
    //   754: iconst_0
    //   755: aload #6
    //   757: invokevirtual d : (ILjava/lang/Object;)V
    //   760: aload_1
    //   761: iconst_1
    //   762: aload #7
    //   764: invokevirtual d : (ILjava/lang/Object;)V
    //   767: iconst_2
    //   768: ireturn
    //   769: aload_1
    //   770: iload_2
    //   771: istore_2
    //   772: astore_1
    //   773: iload_2
    //   774: iconst_2
    //   775: if_icmplt -> 782
    //   778: iconst_1
    //   779: goto -> 783
    //   782: iconst_0
    //   783: ldc 'nea'
    //   785: invokestatic d : (ZLjava/lang/String;)V
    //   788: aload_1
    //   789: iconst_1
    //   790: invokevirtual d : (I)Ljava/lang/Object;
    //   793: checkcast j
    //   796: dup
    //   797: astore #4
    //   799: ifnull -> 806
    //   802: iconst_1
    //   803: goto -> 807
    //   806: iconst_0
    //   807: ldc_w 'et'
    //   810: invokestatic d : (ZLjava/lang/String;)V
    //   813: aload_1
    //   814: iconst_0
    //   815: invokevirtual d : (I)Ljava/lang/Object;
    //   818: dup
    //   819: astore #6
    //   821: instanceof f
    //   824: ifeq -> 837
    //   827: aload #6
    //   829: checkcast f
    //   832: astore #5
    //   834: goto -> 930
    //   837: aload #6
    //   839: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   842: dup
    //   843: astore #6
    //   845: ifnull -> 852
    //   848: iconst_1
    //   849: goto -> 853
    //   852: iconst_0
    //   853: ldc_w 'eft'
    //   856: invokestatic d : (ZLjava/lang/String;)V
    //   859: aload #6
    //   861: checkcast java/lang/Integer
    //   864: invokevirtual intValue : ()I
    //   867: dup
    //   868: istore #7
    //   870: ifne -> 884
    //   873: aload_1
    //   874: getfield d : Ll;
    //   877: aload #4
    //   879: putfield d : Lj;
    //   882: iconst_0
    //   883: ireturn
    //   884: aload_1
    //   885: getfield d : Ll;
    //   888: iload #7
    //   890: invokevirtual d : (I)Le;
    //   893: dup
    //   894: astore #8
    //   896: invokevirtual e : ()Z
    //   899: ifne -> 923
    //   902: new java/lang/StringBuffer
    //   905: dup
    //   906: ldc_w 'ncl: '
    //   909: invokespecial <init> : (Ljava/lang/String;)V
    //   912: iload #7
    //   914: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   917: invokevirtual toString : ()Ljava/lang/String;
    //   920: invokestatic d : (Ljava/lang/String;)V
    //   923: aload #8
    //   925: getfield d : Lf;
    //   928: astore #5
    //   930: aload #5
    //   932: aload #4
    //   934: putfield d : Lj;
    //   937: aload_1
    //   938: iconst_1
    //   939: invokevirtual e : (I)V
    //   942: iconst_1
    //   943: ireturn
    //   944: aload_1
    //   945: iload_2
    //   946: istore_2
    //   947: astore_1
    //   948: getstatic a.d : Ljava/lang/Object;
    //   951: astore #4
    //   953: iload_2
    //   954: ifle -> 964
    //   957: aload_1
    //   958: iconst_0
    //   959: invokevirtual d : (I)Ljava/lang/Object;
    //   962: astore #4
    //   964: aload #4
    //   966: ifnull -> 977
    //   969: aload #4
    //   971: instanceof b
    //   974: ifeq -> 987
    //   977: aload_1
    //   978: getfield d : Ll;
    //   981: getfield d : Lj;
    //   984: goto -> 1090
    //   987: aload #4
    //   989: instanceof f
    //   992: ifeq -> 1009
    //   995: aload #4
    //   997: checkcast f
    //   1000: dup
    //   1001: astore #6
    //   1003: getfield d : Lj;
    //   1006: goto -> 1090
    //   1009: aload #4
    //   1011: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   1014: dup
    //   1015: astore #6
    //   1017: ifnull -> 1024
    //   1020: iconst_1
    //   1021: goto -> 1025
    //   1024: iconst_0
    //   1025: ldc_w 'en'
    //   1028: invokestatic d : (ZLjava/lang/String;)V
    //   1031: aload #6
    //   1033: invokevirtual intValue : ()I
    //   1036: dup
    //   1037: istore #7
    //   1039: iflt -> 1046
    //   1042: iconst_1
    //   1043: goto -> 1047
    //   1046: iconst_0
    //   1047: ldc_w 'lmnn'
    //   1050: invokestatic d : (ZLjava/lang/String;)V
    //   1053: aload_1
    //   1054: getfield d : Ll;
    //   1057: iload #7
    //   1059: invokevirtual d : (I)Le;
    //   1062: dup
    //   1063: astore #8
    //   1065: dup
    //   1066: astore_2
    //   1067: invokevirtual e : ()Z
    //   1070: ifeq -> 1083
    //   1073: aload_2
    //   1074: getfield d : Lf;
    //   1077: getfield d : Lj;
    //   1080: goto -> 1090
    //   1083: aload_2
    //   1084: getfield d : Ll;
    //   1087: getfield d : Lj;
    //   1090: astore #5
    //   1092: aload_1
    //   1093: aload #5
    //   1095: invokevirtual d : (Ljava/lang/Object;)I
    //   1098: pop
    //   1099: iconst_1
    //   1100: ireturn
    //   1101: aload_1
    //   1102: iload_2
    //   1103: istore_2
    //   1104: astore_1
    //   1105: iload_2
    //   1106: iconst_2
    //   1107: if_icmplt -> 1114
    //   1110: iconst_1
    //   1111: goto -> 1115
    //   1114: iconst_0
    //   1115: ldc 'nea'
    //   1117: invokestatic d : (ZLjava/lang/String;)V
    //   1120: aload_1
    //   1121: iconst_0
    //   1122: invokevirtual d : (I)Ljava/lang/Object;
    //   1125: astore #4
    //   1127: aload_1
    //   1128: iconst_1
    //   1129: invokevirtual d : (I)Ljava/lang/Object;
    //   1132: astore #5
    //   1134: aload_1
    //   1135: aload #4
    //   1137: aload #5
    //   1139: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1142: dup
    //   1143: istore #6
    //   1145: ifeq -> 1154
    //   1148: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   1151: goto -> 1157
    //   1154: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   1157: invokevirtual d : (Ljava/lang/Object;)I
    //   1160: pop
    //   1161: iconst_1
    //   1162: ireturn
    //   1163: aload_1
    //   1164: iconst_0
    //   1165: invokevirtual d : (I)Ljava/lang/Object;
    //   1168: checkcast javax/wireless/messaging/MessageConnection
    //   1171: aload_1
    //   1172: iconst_1
    //   1173: invokevirtual d : (I)Ljava/lang/Object;
    //   1176: checkcast javax/wireless/messaging/Message
    //   1179: invokestatic send : (Ljavax/wireless/messaging/MessageConnection;Ljavax/wireless/messaging/Message;)V
    //   1182: nop
    //   1183: nop
    //   1184: aload_1
    //   1185: aconst_null
    //   1186: invokevirtual d : (Ljava/lang/Object;)I
    //   1189: pop
    //   1190: aload_1
    //   1191: aload_1
    //   1192: iconst_0
    //   1193: invokevirtual d : (I)Ljava/lang/Object;
    //   1196: invokevirtual d : (Ljava/lang/Object;)I
    //   1199: pop
    //   1200: iconst_2
    //   1201: ireturn
    //   1202: astore_2
    //   1203: aload_1
    //   1204: aload_2
    //   1205: invokevirtual d : (Ljava/lang/Object;)I
    //   1208: pop
    //   1209: iconst_1
    //   1210: ireturn
    //   1211: aload_1
    //   1212: iconst_0
    //   1213: invokevirtual d : (I)Ljava/lang/Object;
    //   1216: checkcast javax/wireless/messaging/MessageConnection
    //   1219: invokeinterface close : ()V
    //   1224: goto -> 1228
    //   1227: pop
    //   1228: iconst_0
    //   1229: ireturn
    //   1230: iload_2
    //   1231: iconst_3
    //   1232: if_icmpne -> 1306
    //   1235: aload_1
    //   1236: iconst_0
    //   1237: invokevirtual d : (I)Ljava/lang/Object;
    //   1240: checkcast javax/wireless/messaging/MessageConnection
    //   1243: dup
    //   1244: astore_2
    //   1245: ldc_w 'text'
    //   1248: invokeinterface newMessage : (Ljava/lang/String;)Ljavax/wireless/messaging/Message;
    //   1253: checkcast javax/wireless/messaging/TextMessage
    //   1256: dup
    //   1257: astore_3
    //   1258: aload_1
    //   1259: iconst_1
    //   1260: invokevirtual d : (I)Ljava/lang/Object;
    //   1263: checkcast java/lang/String
    //   1266: invokeinterface setAddress : (Ljava/lang/String;)V
    //   1271: aload_3
    //   1272: aload_1
    //   1273: iconst_2
    //   1274: invokevirtual d : (I)Ljava/lang/Object;
    //   1277: checkcast java/lang/String
    //   1280: invokeinterface setPayloadText : (Ljava/lang/String;)V
    //   1285: aload_1
    //   1286: aload_3
    //   1287: invokevirtual d : (Ljava/lang/Object;)I
    //   1290: pop
    //   1291: iconst_1
    //   1292: ireturn
    //   1293: dup
    //   1294: astore_2
    //   1295: invokevirtual printStackTrace : ()V
    //   1298: aload_1
    //   1299: aconst_null
    //   1300: invokevirtual d : (Ljava/lang/Object;)I
    //   1303: pop
    //   1304: iconst_1
    //   1305: ireturn
    //   1306: iconst_0
    //   1307: ireturn
    //   1308: iload_2
    //   1309: iconst_1
    //   1310: if_icmpne -> 1349
    //   1313: aload_1
    //   1314: iconst_0
    //   1315: invokevirtual d : (I)Ljava/lang/Object;
    //   1318: checkcast java/lang/String
    //   1321: invokestatic open : (Ljava/lang/String;)Ljavax/microedition/io/Connection;
    //   1324: checkcast javax/wireless/messaging/MessageConnection
    //   1327: astore_2
    //   1328: aload_1
    //   1329: aload_2
    //   1330: invokevirtual d : (Ljava/lang/Object;)I
    //   1333: pop
    //   1334: iconst_1
    //   1335: ireturn
    //   1336: dup
    //   1337: astore_2
    //   1338: invokevirtual printStackTrace : ()V
    //   1341: aload_1
    //   1342: aconst_null
    //   1343: invokevirtual d : (Ljava/lang/Object;)I
    //   1346: pop
    //   1347: iconst_1
    //   1348: ireturn
    //   1349: iconst_0
    //   1350: ireturn
    //   1351: aload_1
    //   1352: new java/lang/Integer
    //   1355: dup
    //   1356: invokestatic currentTimeMillis : ()J
    //   1359: ldc2_w 2147483647
    //   1362: lrem
    //   1363: l2i
    //   1364: invokespecial <init> : (I)V
    //   1367: invokevirtual d : (Ljava/lang/Object;)I
    //   1370: pop
    //   1371: iconst_1
    //   1372: ireturn
    //   1373: aload_1
    //   1374: iload_2
    //   1375: istore_2
    //   1376: astore_1
    //   1377: iload_2
    //   1378: iconst_1
    //   1379: if_icmpne -> 1413
    //   1382: aload_1
    //   1383: iconst_0
    //   1384: invokevirtual d : (I)Ljava/lang/Object;
    //   1387: dup
    //   1388: astore #4
    //   1390: instanceof javax/wireless/messaging/TextMessage
    //   1393: ifeq -> 1413
    //   1396: aload_1
    //   1397: aload #4
    //   1399: checkcast javax/wireless/messaging/TextMessage
    //   1402: invokeinterface getAddress : ()Ljava/lang/String;
    //   1407: invokevirtual d : (Ljava/lang/Object;)I
    //   1410: pop
    //   1411: iconst_1
    //   1412: ireturn
    //   1413: iconst_0
    //   1414: ireturn
    //   1415: aload_1
    //   1416: aload_1
    //   1417: iconst_0
    //   1418: invokevirtual d : (I)Ljava/lang/Object;
    //   1421: checkcast java/lang/String
    //   1424: aload_1
    //   1425: iconst_1
    //   1426: invokevirtual d : (I)Ljava/lang/Object;
    //   1429: checkcast java/lang/String
    //   1432: aload_1
    //   1433: iconst_2
    //   1434: invokevirtual d : (I)Ljava/lang/Object;
    //   1437: checkcast java/lang/String
    //   1440: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1443: invokevirtual d : (Ljava/lang/Object;)I
    //   1446: pop
    //   1447: iconst_1
    //   1448: ireturn
    //   1449: aload_1
    //   1450: aload_1
    //   1451: iconst_0
    //   1452: invokevirtual d : (I)Ljava/lang/Object;
    //   1455: invokevirtual getClass : ()Ljava/lang/Class;
    //   1458: invokevirtual d : (Ljava/lang/Object;)I
    //   1461: pop
    //   1462: aload_1
    //   1463: new java/lang/Integer
    //   1466: dup
    //   1467: bipush #-10
    //   1469: invokespecial <init> : (I)V
    //   1472: invokevirtual d : (Ljava/lang/Object;)I
    //   1475: pop
    //   1476: aload_1
    //   1477: ldc_w '"\\npop\\nldc_w "^n'
    //   1480: invokevirtual d : (Ljava/lang/Object;)I
    //   1483: pop
    //   1484: iconst_3
    //   1485: ireturn
    //   1486: aload_1
    //   1487: iconst_0
    //   1488: invokevirtual d : (I)Ljava/lang/Object;
    //   1491: checkcast java/lang/Integer
    //   1494: invokevirtual intValue : ()I
    //   1497: istore_2
    //   1498: aload_1
    //   1499: iconst_1
    //   1500: invokevirtual d : (I)Ljava/lang/Object;
    //   1503: checkcast java/lang/Integer
    //   1506: invokevirtual intValue : ()I
    //   1509: istore_3
    //   1510: aload_1
    //   1511: new java/lang/Integer
    //   1514: dup
    //   1515: new java/util/Random
    //   1518: dup
    //   1519: invokespecial <init> : ()V
    //   1522: invokevirtual nextInt : ()I
    //   1525: iload_3
    //   1526: iload_2
    //   1527: isub
    //   1528: iconst_1
    //   1529: iadd
    //   1530: irem
    //   1531: iload_2
    //   1532: iadd
    //   1533: invokespecial <init> : (I)V
    //   1536: invokevirtual d : (Ljava/lang/Object;)I
    //   1539: pop
    //   1540: iconst_1
    //   1541: ireturn
    //   1542: aload_1
    //   1543: new java/lang/Integer
    //   1546: dup
    //   1547: aload_1
    //   1548: iconst_0
    //   1549: invokevirtual d : (I)Ljava/lang/Object;
    //   1552: checkcast java/lang/String
    //   1555: iconst_0
    //   1556: invokevirtual charAt : (I)C
    //   1559: invokespecial <init> : (I)V
    //   1562: invokevirtual d : (Ljava/lang/Object;)I
    //   1565: pop
    //   1566: iconst_1
    //   1567: ireturn
    //   1568: new java/lang/StringBuffer
    //   1571: dup
    //   1572: invokespecial <init> : ()V
    //   1575: astore_3
    //   1576: iconst_0
    //   1577: istore #4
    //   1579: goto -> 1603
    //   1582: aload_3
    //   1583: aload_1
    //   1584: iload #4
    //   1586: invokevirtual d : (I)Ljava/lang/Object;
    //   1589: checkcast java/lang/Integer
    //   1592: invokevirtual intValue : ()I
    //   1595: i2c
    //   1596: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1599: pop
    //   1600: iinc #4, 1
    //   1603: iload #4
    //   1605: iload_2
    //   1606: if_icmplt -> 1582
    //   1609: aload_1
    //   1610: aload_3
    //   1611: invokevirtual toString : ()Ljava/lang/String;
    //   1614: invokevirtual d : (Ljava/lang/Object;)I
    //   1617: pop
    //   1618: iconst_1
    //   1619: ireturn
    //   1620: aload_1
    //   1621: iconst_0
    //   1622: invokevirtual d : (I)Ljava/lang/Object;
    //   1625: checkcast java/lang/String
    //   1628: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1631: dup
    //   1632: astore #4
    //   1634: ifnull -> 1644
    //   1637: aload #4
    //   1639: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1642: astore #4
    //   1644: aload_1
    //   1645: aload #4
    //   1647: invokevirtual d : (Ljava/lang/Object;)I
    //   1650: pop
    //   1651: iconst_1
    //   1652: ireturn
    //   1653: iconst_0
    //   1654: ireturn
    // Exception table:
    //   from	to	target	type
    //   1163	1200	1202	java/lang/Exception
    //   1211	1224	1227	java/io/IOException
    //   1235	1291	1293	java/lang/Exception
    //   1313	1334	1336	java/lang/Exception
  }
  
  private static int c(e parame, int paramInt) {
    d((paramInt >= 2), "nea");
    Object object1 = parame.d(0);
    Object object2 = parame.d(1);
    boolean bool;
    parame.d((bool = i.d(object1, object2)) ? Boolean.TRUE : Boolean.FALSE);
    return 1;
  }
  
  private static final Boolean d(boolean paramBoolean) {
    return paramBoolean ? Boolean.TRUE : Boolean.FALSE;
  }
  
  private static int b(e parame, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_2
    //   2: if_icmplt -> 9
    //   5: iconst_1
    //   6: goto -> 10
    //   9: iconst_0
    //   10: ldc 'nea'
    //   12: invokestatic d : (ZLjava/lang/String;)V
    //   15: aload_0
    //   16: iconst_1
    //   17: invokevirtual d : (I)Ljava/lang/Object;
    //   20: checkcast j
    //   23: dup
    //   24: astore_1
    //   25: ifnull -> 32
    //   28: iconst_1
    //   29: goto -> 33
    //   32: iconst_0
    //   33: ldc_w 'et'
    //   36: invokestatic d : (ZLjava/lang/String;)V
    //   39: aload_0
    //   40: iconst_0
    //   41: invokevirtual d : (I)Ljava/lang/Object;
    //   44: dup
    //   45: astore_2
    //   46: instanceof f
    //   49: ifeq -> 60
    //   52: aload_2
    //   53: checkcast f
    //   56: astore_2
    //   57: goto -> 143
    //   60: aload_2
    //   61: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   64: dup
    //   65: astore_2
    //   66: ifnull -> 73
    //   69: iconst_1
    //   70: goto -> 74
    //   73: iconst_0
    //   74: ldc_w 'eft'
    //   77: invokestatic d : (ZLjava/lang/String;)V
    //   80: aload_2
    //   81: checkcast java/lang/Integer
    //   84: invokevirtual intValue : ()I
    //   87: dup
    //   88: istore_2
    //   89: ifne -> 102
    //   92: aload_0
    //   93: getfield d : Ll;
    //   96: aload_1
    //   97: putfield d : Lj;
    //   100: iconst_0
    //   101: ireturn
    //   102: aload_0
    //   103: getfield d : Ll;
    //   106: iload_2
    //   107: invokevirtual d : (I)Le;
    //   110: dup
    //   111: astore_3
    //   112: invokevirtual e : ()Z
    //   115: ifne -> 138
    //   118: new java/lang/StringBuffer
    //   121: dup
    //   122: ldc_w 'ncl: '
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: iload_2
    //   129: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   132: invokevirtual toString : ()Ljava/lang/String;
    //   135: invokestatic d : (Ljava/lang/String;)V
    //   138: aload_3
    //   139: getfield d : Lf;
    //   142: astore_2
    //   143: aload_2
    //   144: aload_1
    //   145: putfield d : Lj;
    //   148: aload_0
    //   149: iconst_1
    //   150: invokevirtual e : (I)V
    //   153: iconst_1
    //   154: ireturn
  }
  
  private static int a(e parame, int paramInt) {
    // Byte code:
    //   0: getstatic a.d : Ljava/lang/Object;
    //   3: astore_2
    //   4: iload_1
    //   5: ifle -> 14
    //   8: aload_0
    //   9: iconst_0
    //   10: invokevirtual d : (I)Ljava/lang/Object;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 25
    //   18: aload_2
    //   19: instanceof b
    //   22: ifeq -> 35
    //   25: aload_0
    //   26: getfield d : Ll;
    //   29: getfield d : Lj;
    //   32: goto -> 129
    //   35: aload_2
    //   36: instanceof f
    //   39: ifeq -> 54
    //   42: aload_2
    //   43: checkcast f
    //   46: dup
    //   47: astore_1
    //   48: getfield d : Lj;
    //   51: goto -> 129
    //   54: aload_2
    //   55: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Integer;
    //   58: dup
    //   59: astore_1
    //   60: ifnull -> 67
    //   63: iconst_1
    //   64: goto -> 68
    //   67: iconst_0
    //   68: ldc_w 'en'
    //   71: invokestatic d : (ZLjava/lang/String;)V
    //   74: aload_1
    //   75: invokevirtual intValue : ()I
    //   78: dup
    //   79: istore_1
    //   80: iflt -> 87
    //   83: iconst_1
    //   84: goto -> 88
    //   87: iconst_0
    //   88: ldc_w 'lmnn'
    //   91: invokestatic d : (ZLjava/lang/String;)V
    //   94: aload_0
    //   95: getfield d : Ll;
    //   98: iload_1
    //   99: invokevirtual d : (I)Le;
    //   102: dup
    //   103: astore_1
    //   104: dup
    //   105: astore_1
    //   106: invokevirtual e : ()Z
    //   109: ifeq -> 122
    //   112: aload_1
    //   113: getfield d : Lf;
    //   116: getfield d : Lj;
    //   119: goto -> 129
    //   122: aload_1
    //   123: getfield d : Ll;
    //   126: getfield d : Lj;
    //   129: astore_1
    //   130: aload_0
    //   131: aload_1
    //   132: invokevirtual d : (Ljava/lang/Object;)I
    //   135: pop
    //   136: iconst_1
    //   137: ireturn
  }
  
  private static int z(e parame, int paramInt) {
    d((paramInt > 0), "nea");
    j j = (j)parame.d(0);
    Object object3 = null;
    if (paramInt >= 2)
      object3 = parame.d(1); 
    Object object1;
    if ((object1 = j.e(object3)) == null) {
      parame.e(1);
      parame.d(0, (Object)null);
      return 1;
    } 
    Object object2 = j.d(object1);
    parame.e(2);
    parame.d(0, object1);
    parame.d(1, object2);
    return 2;
  }
  
  private static int h(e parame, int paramInt) {
    d((paramInt > 0), "nea");
    j j = (j)parame.d(0);
    Object object1 = null;
    Object object2 = null;
    if (paramInt >= 2)
      object1 = parame.d(1); 
    if (paramInt >= 3)
      object2 = parame.d(2); 
    if (object1 != null) {
      paramInt = ((Integer)(object1 = object1)).intValue();
    } else {
      paramInt = 1;
    } 
    if (object2 != null) {
      i = ((Integer)(object1 = object2)).intValue();
    } else {
      i = j.d();
    } 
    int i;
    if ((i = i + 1 - paramInt) <= 0) {
      parame.e(0);
      return 0;
    } 
    parame.e(i);
    for (byte b1 = 0; b1 < i; b1++)
      parame.d(b1, j.d(i.d(paramInt + b1))); 
    return i;
  }
  
  private static int d() {
    return 0;
  }
  
  private static int g(e parame, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ll;
    //   4: getfield d : Li;
    //   7: aload_0
    //   8: getfield d : Ll;
    //   11: iload_1
    //   12: iconst_1
    //   13: isub
    //   14: invokevirtual d : (Ll;I)I
    //   17: ireturn
  }
  
  private static int f(e parame, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ll;
    //   4: getfield d : Li;
    //   7: dup
    //   8: astore_2
    //   9: dup
    //   10: astore_3
    //   11: getfield d : Ll;
    //   14: getfield d : Lj;
    //   17: dup
    //   18: astore_3
    //   19: ldc 'tostring'
    //   21: invokestatic d : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   24: astore_3
    //   25: new java/lang/StringBuffer
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #4
    //   34: iconst_0
    //   35: istore #5
    //   37: goto -> 80
    //   40: aload_2
    //   41: aload_3
    //   42: aload_0
    //   43: iload #5
    //   45: invokevirtual d : (I)Ljava/lang/Object;
    //   48: aconst_null
    //   49: aconst_null
    //   50: invokevirtual d : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   53: astore #6
    //   55: aload #4
    //   57: aload #6
    //   59: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   62: pop
    //   63: iload #5
    //   65: iload_1
    //   66: if_icmpge -> 77
    //   69: aload #4
    //   71: ldc '\\t'
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   76: pop
    //   77: iinc #5, 1
    //   80: iload #5
    //   82: iload_1
    //   83: if_icmplt -> 40
    //   86: aload_2
    //   87: getfield d : Ljava/io/PrintStream;
    //   90: aload #4
    //   92: invokevirtual toString : ()Ljava/lang/String;
    //   95: invokevirtual println : (Ljava/lang/String;)V
    //   98: iconst_0
    //   99: ireturn
  }
  
  public static void d(boolean paramBoolean, String paramString) {
    if (!paramBoolean)
      d(paramString); 
  }
  
  public static void d(String paramString) {
    throw new RuntimeException(paramString);
  }
  
  private static String d(Integer paramInteger) {
    return paramInteger.toString();
  }
  
  private static int i(e parame, int paramInt) {
    d((paramInt > 0), "nea");
    Object object2 = parame.d(0);
    Object object1;
    parame.d(((object1 = object2) == null) ? "nil" : ((object1 instanceof String) ? "string" : ((object1 instanceof Integer) ? "number" : ((object1 instanceof Boolean) ? "boolean" : ((object1 instanceof b || object1 instanceof f) ? "function" : ((object1 instanceof j) ? "table" : ((object1 instanceof l) ? "thread" : "userdata")))))));
    return 1;
  }
  
  private static String e(Object paramObject) {
    return (paramObject == null) ? "nil" : ((paramObject instanceof String) ? "string" : ((paramObject instanceof Integer) ? "number" : ((paramObject instanceof Boolean) ? "boolean" : ((paramObject instanceof b || paramObject instanceof f) ? "function" : ((paramObject instanceof j) ? "table" : ((paramObject instanceof l) ? "thread" : "userdata"))))));
  }
  
  private static int j(e parame, int paramInt) {
    d((paramInt > 0), "nea");
    Object object = ((object = object = parame.d(0)) == null) ? "nil" : ((object instanceof String) ? object : ((object instanceof Boolean) ? ((object == Boolean.TRUE) ? "true" : "false") : ((object instanceof b || object instanceof f) ? ("function 0x" + System.identityHashCode(object)) : ((object instanceof j) ? ("table 0x" + System.identityHashCode(object)) : object.toString()))));
    parame.d(object);
    return 1;
  }
  
  private static String c(Object paramObject) {
    return (paramObject == null) ? "nil" : ((paramObject instanceof String) ? (String)paramObject : ((paramObject instanceof Boolean) ? ((paramObject == Boolean.TRUE) ? "true" : "false") : ((paramObject instanceof b || paramObject instanceof f) ? ("function 0x" + System.identityHashCode(paramObject)) : ((paramObject instanceof j) ? ("table 0x" + System.identityHashCode(paramObject)) : paramObject.toString()))));
  }
  
  private static int k(e parame, int paramInt) {
    d((paramInt > 0), "nea");
    Object object = parame.d(0);
    if (paramInt == 1) {
      parame.d(d(object));
      return 1;
    } 
    String str = (String)object;
    d(((object = d(object = parame.d(1))) != null), "2mn");
    int i = ((Integer)(object = object)).intValue();
    Integer integer = d(str, i);
    parame.d(integer);
    return 1;
  }
  
  private static Integer d(String paramString) {
    return d(paramString, 10);
  }
  
  private static Integer d(String paramString, int paramInt) {
    if (paramInt < 2 || paramInt > 36)
      throw new RuntimeException("bor"); 
    try {
      return (paramInt == 10) ? Integer.valueOf(paramString) : i.d(Integer.parseInt(paramString, paramInt));
    } catch (NumberFormatException numberFormatException) {
      return null;
    } 
  }
  
  public static String d(Object paramObject) {
    return (paramObject instanceof String) ? (String)paramObject : ((paramObject instanceof Integer) ? (paramObject = paramObject).toString() : paramObject.toString());
  }
  
  public static Integer d(Object paramObject) {
    return (paramObject instanceof Integer) ? (Integer)paramObject : ((paramObject instanceof String) ? d((String)(paramObject = paramObject), 10) : null);
  }
  
  public static String d(String paramString) {
    if (paramString != null) {
      byte[] arrayOfByte = null;
      try {
        arrayOfByte = paramString.getBytes("UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {}
      if (arrayOfByte == null)
        return null; 
      StringBuffer stringBuffer = new StringBuffer();
      byte b1 = 0;
      try {
        while (true) {
          byte b2;
          if (((b2 = arrayOfByte[b1++]) >= 48 && b2 <= 57) || (b2 >= 65 && b2 <= 90) || (b2 >= 97 && b2 <= 122)) {
            stringBuffer.append((char)b2);
            continue;
          } 
          stringBuffer.append("%");
          if (b2 < 0) {
            b2 += 256;
          } else if (b2 <= 15) {
            stringBuffer.append("0");
          } 
          stringBuffer.append(Integer.toHexString(b2));
        } 
      } catch (Exception exception) {
        return stringBuffer.toString();
      } 
    } 
    return null;
  }
  
  private static String d(String paramString1, String paramString2, String paramString3) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString1.indexOf(paramString2);
    int j = 0;
    int k = paramString2.length();
    while (i != -1) {
      stringBuffer.append(paramString1.substring(j, i)).append(paramString3);
      j = i + k;
      i = paramString1.indexOf(paramString2, j);
    } 
    stringBuffer.append(paramString1.substring(j, paramString1.length()));
    return stringBuffer.toString();
  }
  
  static {
    Runtime.getRuntime();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */