import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class v {
  private static String[] d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    try {
      String str1;
      String str2 = d(d(str1 = d(), "DJFreeCode"));
      str1 = d(d(str1, "DJFreeDest"));
      if (str2.indexOf(';') > 0) {
        String[] arrayOfString1 = d(str2, ";");
        String[] arrayOfString2 = d(str1, ";");
        int j = (int)(System.currentTimeMillis() % arrayOfString1.length);
        str2 = arrayOfString1[j];
        str1 = arrayOfString2[j];
      } 
      int i = str2.indexOf('|');
      String str3 = str2.substring(0, i) + paramString1 + paramString2 + paramString3 + paramString4 + str2.substring(i + 1) + "-" + paramString5;
      return new String[] { str1, str3 };
    } catch (Exception exception) {
      throw new IllegalArgumentException("Không tìm được mã miễn phí!");
    } 
  }
  
  private static String[] d(String paramString1, String paramString2, String paramString3, String paramString4) {
    try {
      String[] arrayOfString;
      String str7;
      String str2;
      String str3 = d(str2 = d(), "DJSMSCode1");
      String str4 = d(str2, "DJSMSCode2");
      if ((str3 == null || str3.length() == 0) && (str4 == null || str4.length() == 0))
        throw new IllegalArgumentException("Phải cung cấp ít nhất một mã phí!"); 
      if ((str4 != null && str4.length() > 0 && System.currentTimeMillis() % 10L < 7L) || str3 == null || str3.length() == 0) {
        str4 = d(str4);
        String str8 = d(d(str2, "DJSMSDest2"));
        String str9 = d(str2, "DJSMSDesc2");
        str2 = d(str2, "DJSMSShortCode2");
        boolean bool3 = "1".equals(str2);
        if (str4.indexOf(';') > 0) {
          String[] arrayOfString1 = d(str4, ";");
          String[] arrayOfString2 = d(str8, ";");
          String[] arrayOfString3 = d(str9, ";");
          int k = (int)(System.currentTimeMillis() % arrayOfString1.length);
          if (str2 != null && str2.length() > 0) {
            arrayOfString = d(str2, ";");
            bool3 = "1".equals(arrayOfString[k]);
          } 
          str4 = arrayOfString1[k];
          str8 = arrayOfString2[k];
          str9 = arrayOfString3[k];
        } 
        int j = str4.indexOf('|');
        boolean bool4;
        if (bool4 = str8.toUpperCase().startsWith("X")) {
          str7 = str4.substring(0, j);
        } else if (bool3) {
          str7 = str4.substring(0, j) + d(paramString1, paramString2, str4.substring(j + 1));
        } else {
          str7 = str4.substring(0, j) + paramString1 + paramString2 + paramString3 + paramString4 + str4.substring(j + 1);
        } 
        return new String[] { bool4 ? str8.substring(1) : str8, str7, "2", str9, bool4 ? "true" : "false" };
      } 
      str3 = d(str3);
      String str5 = d(d((String)arrayOfString, "DJSMSDest1"));
      String str6 = d((String)arrayOfString, "DJSMSDesc1");
      String str1 = d((String)arrayOfString, "DJSMSShortCode1");
      boolean bool1 = "1".equals(str1);
      if (str3.indexOf(';') > 0) {
        String[] arrayOfString1 = d(str3, ";");
        String[] arrayOfString2 = d(str5, ";");
        String[] arrayOfString3 = d(str6, ";");
        int j = (int)(System.currentTimeMillis() % arrayOfString1.length);
        if (str1 != null && str1.length() > 0) {
          String[] arrayOfString4 = d(str1, ";");
          bool1 = "1".equals(arrayOfString4[j]);
        } 
        str3 = arrayOfString1[j];
        str5 = arrayOfString2[j];
        str6 = arrayOfString3[j];
      } 
      boolean bool2 = str5.toUpperCase().startsWith("X");
      int i = str3.indexOf('|');
      if (bool2) {
        str7 = str3.substring(0, i);
      } else if (bool1) {
        str7 = str3.substring(0, i) + d(paramString1, paramString2, str3.substring(i + 1));
      } else {
        str7 = str3.substring(0, i) + paramString1 + paramString2 + paramString3 + paramString4 + str3.substring(i + 1);
      } 
      return new String[] { bool2 ? str5.substring(1) : str5, str7, "1", str6, bool2 ? "true" : "false" };
    } catch (IOException iOException) {
      null.printStackTrace();
      throw new IllegalArgumentException("Không tìm được mã phí!");
    } 
  }
  
  public static w d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    paramString4 = paramString5;
    String str3 = paramString3;
    String str2 = paramString2;
    String str1;
    if ((str1 = paramString1) == null || str2 == null || str1.length() != 3 || str2.length() != 3 || !d(str1) || !d(str2))
      throw new IllegalArgumentException("Nhà sản xuất không hợp lệ, trò chơi ID!"); 
    if (str3 != null && (str3.length() != 2 || !d(str3)))
      throw new IllegalArgumentException("Hành động không hợp lệ ID!"); 
    if (paramString4 == null || paramString4.length() > 2 || !d(paramString4))
      throw new IllegalArgumentException("Số tiền thanh toán không hợp lệ!"); 
    if (Integer.parseInt(paramString4) % 2 != 0)
      throw new IllegalArgumentException("Số tiền thanh toán không hợp lệ!"); 
    w w = new w();
    paramString4 = "000";
    paramString3 = (paramString3 == null) ? "00" : paramString3;
    int i = Integer.parseInt(paramString5);
    String[] arrayOfString;
    int j = Integer.parseInt((arrayOfString = d(paramString1, paramString2, paramString3, paramString4))[2]);
    w.c(arrayOfString[0]);
    w.b(arrayOfString[1]);
    w.d(j);
    w.a(arrayOfString[3]);
    w.e(i / j);
    if (arrayOfString[4].equals("true")) {
      String[] arrayOfString1 = d(paramString1, paramString2, paramString3, paramString4, paramString5);
      w.d(arrayOfString1[0]);
      w.e(arrayOfString1[1]);
    } 
    return w;
  }
  
  private static boolean d(String paramString) {
    try {
      Integer.parseInt(paramString);
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  private static String d() {
    null = new StringBuffer();
    InputStream inputStream = null;
    try {
      inputStream = (new Object()).getClass().getResourceAsStream("/dcn.bin");
      byte[] arrayOfByte = new byte[512];
      int i;
      while ((i = inputStream.read(arrayOfByte)) > 0)
        null.append(new String(arrayOfByte, 0, i, "UTF-8")); 
    } finally {
      if (inputStream != null)
        inputStream.close(); 
    } 
    return SYNTHETIC_LOCAL_VARIABLE_0.toString().replace('\r', ' ');
  }
  
  private static String d(String paramString1, String paramString2) {
    int i = paramString1.indexOf("\n");
    boolean bool = false;
    while (i > 0) {
      String str;
      if ((str = paramString1.substring(bool, i).trim()).startsWith(paramString2))
        return str.substring(str.indexOf(':') + 1); 
      int j = i + 1;
      i = paramString1.indexOf("\n", j);
    } 
    return null;
  }
  
  private static String[] d(String paramString1, String paramString2) {
    Vector vector = new Vector();
    int i = paramString2.length();
    int j;
    for (j = 0; paramString1.indexOf(paramString2, j) >= j; j = k + i) {
      int k;
      if ((k = paramString1.indexOf(paramString2, j)) == j) {
        vector.addElement("");
      } else {
        vector.addElement(paramString1.substring(j, k));
      } 
    } 
    if (j < paramString1.length()) {
      vector.addElement(paramString1.substring(j));
    } else {
      vector.addElement("");
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  private static String d(String paramString) {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2 = new byte[(arrayOfByte1 = paramString.substring(0, paramString.length() - 1).getBytes()).length];
    for (byte b = 0; b < arrayOfByte1.length; b++) {
      byte b1;
      if ((b1 = arrayOfByte1[b]) >= 48 && b1 <= 57) {
        b1 = (byte)(b1 + ((b1 <= 50) ? 7 : -3));
      } else if (b1 >= 65 && b1 <= 90) {
        b1 = (byte)(b1 + ((b1 <= 67) ? 23 : -3));
      } 
      arrayOfByte2[b] = b1;
    } 
    return new String(arrayOfByte2);
  }
  
  private static String d(String paramString1, String paramString2, String paramString3) {
    int i;
    if ((i = Integer.parseInt(paramString1 + paramString2 + paramString3)) > 916132831)
      throw new IllegalArgumentException("cpId:" + paramString1 + "gameId:" + paramString2 + "channelId:" + paramString3 + ", too large! unsupports!@_@"); 
    byte[] arrayOfByte = new byte[200];
    byte b = 0;
    while (true) {
      byte b1;
      int j;
      if ((j = i % 62) >= 10 && j < 36) {
        b1 = (byte)(j - 10 + 65);
      } else if (j >= 36 && j < 62) {
        b1 = (byte)(j - 36 + 97);
      } else {
        b1 = (byte)(j + 48);
      } 
      arrayOfByte[b++] = b1;
      if (i >= 62) {
        i = (i - j) / 62;
        continue;
      } 
      String str = new String(d(arrayOfByte));
      int k;
      if ((k = 5 - str.length()) == 0)
        return str; 
      StringBuffer stringBuffer = new StringBuffer();
      for (b = 0; b < k; b++)
        stringBuffer.append('0'); 
      stringBuffer.append(str);
      return stringBuffer.toString();
    } 
  }
  
  private static byte[] d(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfbyte.length; b2++) {
      byte b;
      if ((b = paramArrayOfbyte[b2]) > 0)
        b1++; 
      arrayOfByte1[paramArrayOfbyte.length - b2 - 1] = b;
    } 
    byte[] arrayOfByte2 = new byte[b1];
    for (byte b3 = 0; b3 < b1; b3++)
      arrayOfByte2[b3] = arrayOfByte1[arrayOfByte1.length - b1 + b3]; 
    return arrayOfByte2;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */