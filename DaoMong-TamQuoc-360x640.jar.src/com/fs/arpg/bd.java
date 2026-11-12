package com.fs.arpg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;

public final class bd {
  private static bd d;
  
  private String[] e;
  
  private int k;
  
  public int d;
  
  public int e;
  
  public int c;
  
  public int b;
  
  public int a;
  
  public int z;
  
  public int h;
  
  public int g;
  
  public int f;
  
  public int i;
  
  private Hashtable d;
  
  private String[] c;
  
  private long[] d;
  
  public int j;
  
  long d;
  
  public String[] d;
  
  private String[] b;
  
  private String[] a;
  
  public short[] d;
  
  public boolean[] d;
  
  private int[] d = (int[])new Hashtable();
  
  private short[] e;
  
  private int[] e = (int[])new String[12];
  
  private int[] c = new String[] { 
      "Thăng cấp", "Đập bình rượu", "Đập thùng gỗ", "Đạt được thẻ võ tướng", "Đạt được trang bị", "Mua tiền", "Tiền hiện có", "Mở khóa", "Nhiệm vụ phụ", "Tiêu diệt bộ binh", 
      "Tiêu diệt kỵ binh", "Tiêu diệt cung tiễn", "Tiêu diệt kẻ địch", "Hồi sinh lần thứ nhất", "Chế tạo trang bị", "Vũ khí tuyệt phẩm", "Trang bị tuyệt phẩm", "Thuốc hồi phục", "Phát Tất Sát Kỹ", "Hoàn thành ngụy trang", 
      "Thoát lui về sau", "Tìm được Tiểu Phượng", "Mang Thác Hải về" };
  
  private int[] b;
  
  private int[] a;
  
  private int[] z;
  
  private int[] h;
  
  private int[] g;
  
  private int[] f;
  
  private int[] i;
  
  private bd() {
    this.d = (int[])new String[] { 
        "Thăng cấp!", "10 cấp", "20 cấp", "30 cấp", "40 cấp", "50 cấp", "60 cấp", "70 cấp", "80 cấp", "90 cấp", 
        "Đại viên mãn", "Kiêng rượu tiêu sầu", "Phá hoại", "Vũ dũng", "Tài nghệ trấn áp quần hùng", "Một cái cũng không thể thiếu", "Chúc mừng phát tài", "Núi vàng núi bạc", "Phú khả địch quốc", "Thợ khóa", 
        "Thần kỳ", "Nhiệm vụ phụ hoàn thành", "Nhiệt tâm", "Khát máu", "Không thể phá vỡ", "Bước vạn dặm", "Hóa thân vi ma", "Bay thành thần", "Hồi sinh máu tại chỗ", "Học nghề rèn", 
        "Bậc thầy vũ khí", "Không còn hòa thượng", "Thuốc không thể ngừng", "Bản lĩnh thần kỹ", "Bậc thầy ngụy trang", "Sinh mệnh mong manh", "Dũng cảm", "Cứu thế giới" };
    this.b = (int[])new String[] { 
        "Đẳng cấp đạt tới 2 cấp.", "Đẳng cấp đạt tới 10 cấp.", "Đẳng cấp đạt tới 20 cấp.", "Đẳng cấp đạt tới 30 cấp.", "Đẳng cấp đạt tới 40 cấp.", "Đẳng cấp đạt tới 50 cấp.", "Đẳng cấp đạt tới 60 cấp.", "Đẳng cấp đạt tới 70 cấp.", "Đẳng cấp đạt tới 80 cấp.", "Đẳng cấp đạt tới 90 cấp.", 
        "Đẳng cấp đạt tới 100 cấp.", "Đập nát 50 bình rượu.", "Đập nát 50 chiếc thùng gỗ.", "Đạt được thẻ võ tướng thứ nhất.", "Đạt được tất cả thẻ võ tướng.", "Đạt được tất cả trang bị", "Mua sắm tiền tài lần đầu", "Tài phú đạt tới 10 vạn", "Tài phú đạt tới 50 vạn", "Mở khóa lần đầu", 
        "Mở 15 bảo rương bị khóa", "Nhiệm vụ phụ đầu tiên", "Hoàn thành 10 nhiệm vụ phụ", "Tiêu diệt 50 bộ binh", "Tiêu diệt 50 kỵ binh", "Tiêu diệt 50 binh cung tiễn", "Tiêu diệt 500 kẻ địch", "Tiêu diệt 1000 kẻ địch", "Hồi sinh lần thứ nhất.", "Chế tạo trang bị lần đầu.", 
        "Có thể chế tạo vũ khí tuyệt phẩm.", "Tất cả các gói đều là tuyệt phẩm.", "Sử dụng 50 viên thuốc hồi phục", "Phát 100 Tất Sát Kỹ", "Hoàn thành nhiệm vụ phụ đánh cắp tin tình báo", "Hoàn thành nhiệm vụ phụ Thoát Ly Phụng Chưởng", "Hoàn thành tìm kiếm Tiểu Phượng", "Bem Tiểu Phượng về cho Thác Hải" };
    this.a = (int[])new String[] { 
        "", "", "", "", "", "", "", "", "", "", 
        "20000 kim", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", 
        "", "20000 kim", "", "Thần Thủy *10", "", "", "", "" };
    this.d = (int[])new short[] { 
        10, 15, 20, 25, 30, 40, 50, 60, 70, 80, 
        150, 15, 50, 100, 100, 100, 50, 100, 150, 20, 
        100, 15, 100, 25, 25, 25, 80, 150, 50, 50, 
        100, 10, 100, 50, 20, 50, 70, 100 };
    this.d = (int[])new boolean[64];
    this.d = new int[] { 
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
        10 };
    this.e = (int[])new short[] { 
        2, 10, 20, 30, 40, 50, 60, 70, 80, 90, 
        100 };
    this.e = new int[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    this.c = new int[] { 50, 50, 1, 9, 46, 1, 100000, 500000, 1, 15 };
    this.b = new int[] { 1, 2, 3, 3, 4, 5, 6, 6, 7, 7 };
    this.a = new int[] { 
        21, 22, 23, 24, 25, 26, 27, 34, 35, 36, 
        37 };
    this.z = new int[] { 
        1, 10, 50, 50, 50, 500, 1000, 1, 1, 1, 
        1 };
    this.h = new int[] { 
        8, 8, 9, 10, 11, 12, 12, 19, 20, 21, 
        22 };
    this.g = new int[] { 28, 29, 30, 31, 32, 33 };
    this.f = new int[] { 1, 1, 5, 20, 50, 100 };
    this.i = new int[] { 13, 14, 15, 16, 17, 18 };
    this.d = (int[])new long[64];
  }
  
  public static bd d() {
    if (d == null)
      d = (int[])new bd(); 
    return (bd)d;
  }
  
  public final String[] d() {
    this.e[0] = this.k;
    this.e[1] = this.d;
    this.e[2] = this.e;
    this.e[3] = ba.d("Tiêu diệt kẻ địch");
    this.e[4] = (this.c == null) ? "Không" : d(this.c);
    this.e[5] = (this.b == null) ? "Không" : d(this.b);
    this.e[6] = (this.a == null) ? "Không" : d(this.a);
    this.e[7] = (this.z == null) ? "Không" : d(this.z);
    this.e[8] = (this.h == null) ? "Không" : d(this.h);
    this.e[9] = (this.g == null) ? "Không" : d(this.g);
    this.e[10] = (this.f == null) ? "Không" : d(this.f);
    this.e[11] = (this.i == null) ? "Không" : d(this.i);
    return (String[])this.e;
  }
  
  private static String d(int paramInt) {
    return (paramInt < 60) ? (paramInt + "s") : ((paramInt / 60) + "m" + (paramInt % 60) + "s");
  }
  
  public final void d(int paramInt) {
    if (this.k > paramInt)
      return; 
    this.k = paramInt;
  }
  
  public final void d(DataOutputStream paramDataOutputStream) {
    try {
      byte b1 = 0;
      int i = this.d.length;
      while (b1 < i) {
        paramDataOutputStream.writeLong(this.d[b1]);
        paramDataOutputStream.writeBoolean(this.d[b1]);
        b1++;
      } 
      paramDataOutputStream.writeInt(this.j);
      paramDataOutputStream.writeInt(this.k);
      paramDataOutputStream.writeInt(this.d);
      paramDataOutputStream.writeInt(this.e);
      paramDataOutputStream.writeInt(this.c);
      paramDataOutputStream.writeInt(this.b);
      paramDataOutputStream.writeInt(this.a);
      paramDataOutputStream.writeInt(this.z);
      paramDataOutputStream.writeInt(this.h);
      paramDataOutputStream.writeInt(this.g);
      paramDataOutputStream.writeInt(this.f);
      paramDataOutputStream.writeInt(this.i);
      b1 = 0;
      byte b2 = 0;
      int j = this.c.length;
      while (b2 < j) {
        i = ba.d(this.c[b2]);
        this.d.put(this.c[b2], new Integer(i));
        b2++;
      } 
      Enumeration enumeration = this.d.elements();
      while (enumeration.hasMoreElements()) {
        if (((Integer)enumeration.nextElement()).intValue() > 0)
          b1++; 
      } 
      paramDataOutputStream.writeShort(b1);
      Enumeration enumeration1 = this.d.keys();
      while (enumeration1.hasMoreElements()) {
        String str = enumeration1.nextElement();
        if ((i = ((Integer)this.d.get(str)).intValue()) > 0) {
          paramDataOutputStream.writeUTF(str);
          paramDataOutputStream.writeShort(i);
        } 
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void d(DataInputStream paramDataInputStream) {
    try {
      short s = 0;
      int i = this.d.length;
      while (s < i) {
        this.d[s] = paramDataInputStream.readLong();
        this.d[s] = paramDataInputStream.readBoolean();
        s++;
      } 
      this.j = paramDataInputStream.readInt();
      this.k = paramDataInputStream.readInt();
      this.d = paramDataInputStream.readInt();
      this.e = paramDataInputStream.readInt();
      this.c = paramDataInputStream.readInt();
      this.b = paramDataInputStream.readInt();
      this.a = paramDataInputStream.readInt();
      this.z = paramDataInputStream.readInt();
      this.h = paramDataInputStream.readInt();
      this.g = paramDataInputStream.readInt();
      this.f = paramDataInputStream.readInt();
      this.i = paramDataInputStream.readInt();
      s = paramDataInputStream.readShort();
      for (i = 0; i < s; i++) {
        String str = paramDataInputStream.readUTF();
        short s1 = paramDataInputStream.readShort();
        this.d.put(str, new Integer(s1));
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final char[] d(int paramInt) {
    // Byte code:
    //   0: new java/lang/StringBuffer
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: dup
    //   8: astore_2
    //   9: aload_0
    //   10: getfield b : [Ljava/lang/String;
    //   13: iload_1
    //   14: aaload
    //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   18: pop
    //   19: aload_0
    //   20: aload_2
    //   21: iconst_0
    //   22: istore #5
    //   24: astore #4
    //   26: astore_3
    //   27: iload_1
    //   28: aload_3
    //   29: getfield d : [I
    //   32: arraylength
    //   33: if_icmplt -> 308
    //   36: iload_1
    //   37: aload_3
    //   38: getfield d : [I
    //   41: arraylength
    //   42: aload_3
    //   43: getfield e : [I
    //   46: arraylength
    //   47: iadd
    //   48: if_icmpge -> 130
    //   51: iload_1
    //   52: aload_3
    //   53: getfield e : [I
    //   56: invokestatic d : (I[I)I
    //   59: istore #5
    //   61: aload_3
    //   62: getfield c : [I
    //   65: iload #5
    //   67: iaload
    //   68: iconst_2
    //   69: if_icmple -> 127
    //   72: aload_3
    //   73: getfield d : [Z
    //   76: iload_1
    //   77: baload
    //   78: ifne -> 127
    //   81: aload #4
    //   83: ldc '&('
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   88: aload_3
    //   89: getfield c : [Ljava/lang/String;
    //   92: aload_3
    //   93: getfield b : [I
    //   96: iload #5
    //   98: iaload
    //   99: aaload
    //   100: invokestatic d : (Ljava/lang/String;)I
    //   103: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   106: ldc '/'
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   111: aload_3
    //   112: getfield c : [I
    //   115: iload #5
    //   117: iaload
    //   118: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   121: ldc ')'
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   126: pop
    //   127: goto -> 308
    //   130: iload_1
    //   131: aload_3
    //   132: getfield d : [I
    //   135: arraylength
    //   136: aload_3
    //   137: getfield e : [I
    //   140: arraylength
    //   141: iadd
    //   142: aload_3
    //   143: getfield a : [I
    //   146: arraylength
    //   147: iadd
    //   148: iconst_2
    //   149: isub
    //   150: if_icmpge -> 232
    //   153: iload_1
    //   154: aload_3
    //   155: getfield a : [I
    //   158: invokestatic d : (I[I)I
    //   161: istore #5
    //   163: aload_3
    //   164: getfield z : [I
    //   167: iload #5
    //   169: iaload
    //   170: iconst_2
    //   171: if_icmple -> 229
    //   174: aload_3
    //   175: getfield d : [Z
    //   178: iload_1
    //   179: baload
    //   180: ifne -> 229
    //   183: aload #4
    //   185: ldc '&('
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   190: aload_3
    //   191: getfield c : [Ljava/lang/String;
    //   194: aload_3
    //   195: getfield h : [I
    //   198: iload #5
    //   200: iaload
    //   201: aaload
    //   202: invokestatic d : (Ljava/lang/String;)I
    //   205: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   208: ldc '/'
    //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   213: aload_3
    //   214: getfield z : [I
    //   217: iload #5
    //   219: iaload
    //   220: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   223: ldc ')'
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   228: pop
    //   229: goto -> 308
    //   232: iload_1
    //   233: aload_3
    //   234: getfield g : [I
    //   237: invokestatic d : (I[I)I
    //   240: istore #5
    //   242: aload_3
    //   243: getfield f : [I
    //   246: iload #5
    //   248: iaload
    //   249: iconst_2
    //   250: if_icmple -> 308
    //   253: aload_3
    //   254: getfield d : [Z
    //   257: iload_1
    //   258: baload
    //   259: ifne -> 308
    //   262: aload #4
    //   264: ldc '&('
    //   266: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   269: aload_3
    //   270: getfield c : [Ljava/lang/String;
    //   273: aload_3
    //   274: getfield i : [I
    //   277: iload #5
    //   279: iaload
    //   280: aaload
    //   281: invokestatic d : (Ljava/lang/String;)I
    //   284: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   287: ldc '/'
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   292: aload_3
    //   293: getfield f : [I
    //   296: iload #5
    //   298: iaload
    //   299: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   302: ldc ')'
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   307: pop
    //   308: aload_0
    //   309: getfield a : [Ljava/lang/String;
    //   312: iload_1
    //   313: aaload
    //   314: invokevirtual length : ()I
    //   317: ifle -> 336
    //   320: aload_2
    //   321: ldc '& Ban thưởng: '
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   326: aload_0
    //   327: getfield a : [Ljava/lang/String;
    //   330: iload_1
    //   331: aaload
    //   332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   335: pop
    //   336: aload_2
    //   337: invokevirtual toString : ()Ljava/lang/String;
    //   340: invokevirtual toCharArray : ()[C
    //   343: areturn
  }
  
  private static int d(int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramArrayOfint.length;
    while (b < i) {
      if (paramInt == paramArrayOfint[b])
        return b; 
      b++;
    } 
    return 0;
  }
  
  public final void d() {
    this.d = (int[])new boolean[64];
    this.d = (int[])new long[64];
    for (byte b = 0; b < 64; b++)
      this.d[b] = (64 - b); 
    this.j = 0;
    this.k = 0;
    this.e = false;
    this.d = false;
    this.c = false;
    this.b = false;
    this.a = false;
    this.z = false;
    this.h = false;
    this.g = false;
    this.f = false;
    this.i = false;
    this.d.clear();
  }
  
  public final int[] d(int paramInt) {
    int[] arrayOfInt = null;
    if (paramInt == 0) {
      arrayOfInt = new int[this.d.length];
      System.arraycopy(this.d, 0, arrayOfInt, 0, arrayOfInt.length);
    } 
    if (paramInt == 1) {
      arrayOfInt = new int[this.e.length];
      System.arraycopy(this.e, 0, arrayOfInt, 0, arrayOfInt.length);
    } 
    if (paramInt == 2) {
      arrayOfInt = new int[this.a.length];
      System.arraycopy(this.a, 0, arrayOfInt, 0, arrayOfInt.length);
    } 
    if (paramInt == 3) {
      arrayOfInt = new int[this.g.length];
      System.arraycopy(this.g, 0, arrayOfInt, 0, arrayOfInt.length);
    } 
    paramInt = 0;
    int i = arrayOfInt.length;
    while (paramInt < i) {
      for (int j = paramInt + 1; j < i; j++) {
        if (this.d[arrayOfInt[paramInt]] < this.d[arrayOfInt[j]]) {
          arrayOfInt[paramInt] = arrayOfInt[paramInt] ^ arrayOfInt[j];
          arrayOfInt[j] = arrayOfInt[paramInt] ^ arrayOfInt[j];
          arrayOfInt[paramInt] = arrayOfInt[paramInt] ^ arrayOfInt[j];
        } 
      } 
      paramInt++;
    } 
    return arrayOfInt;
  }
  
  private void d(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    byte b = 0;
    int i = paramArrayOfint1.length;
    while (b < i) {
      if (this.d[paramArrayOfint1[b]] == 0 && ba.d(this.c[paramArrayOfint2[b]]) >= paramArrayOfint3[b]) {
        this.d[paramArrayOfint1[b]] = aq.d;
        this.d[paramArrayOfint1[b]] = 1;
        e(paramArrayOfint1[b]);
        this.d |= 1L << paramArrayOfint1[b];
        this.j += this.d[paramArrayOfint1[b]];
      } 
      b++;
    } 
  }
  
  public final void e() {
    this.d = 0L;
    bd bd1 = this;
    byte b = 0;
    int i = bd1.d.length;
    while (b < i) {
      if (bd1.d[bd1.d[b]] == 0 && ba.d.e() >= bd1.e[b]) {
        bd1.d[bd1.d[b]] = aq.d;
        bd1.d[bd1.d[b]] = 1;
        e(bd1.d[b]);
        bd1.d |= 1L << bd1.d[b];
        bd1.j += bd1.d[bd1.d[b]];
      } 
      b++;
    } 
    d(this.e, this.b, this.c);
    d(this.a, this.h, this.z);
    d(this.g, this.i, this.f);
  }
  
  private static void e(int paramInt) {
    switch (paramInt) {
      case 10:
      case 31:
        ((p)ba.d).W += 20000;
        ba.d.d("Đạt được 2000 kim".toCharArray());
        return;
      case 33:
        ba.d.d((short)17, 10);
        ba.d.d("Đạt được 10 Thần Thủy".toCharArray());
        break;
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bd.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */