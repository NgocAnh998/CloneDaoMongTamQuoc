import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class t implements Runnable {
  private u d;
  
  private int d;
  
  private int e;
  
  private String d;
  
  private String e;
  
  private int c;
  
  private int b;
  
  private boolean d;
  
  private boolean e;
  
  private MessageConnection d;
  
  private w d;
  
  private final String c;
  
  private String b;
  
  private String a;
  
  private String z;
  
  private String h;
  
  private int a;
  
  private int z;
  
  private String g;
  
  private boolean c;
  
  private boolean b = false;
  
  private boolean a;
  
  private static boolean e() {
    return false;
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2) {
    this.d = paramInt1;
    this.e = paramInt2;
    this.e = paramString1;
    this.d = (w)paramString2;
    this.c = paramInt3;
    this.b = paramInt4;
    this.d = true;
    this.e = false;
    (new Thread(this)).start();
  }
  
  public final void run() {
    try {
      for (byte b = 0; b < this.e; b++) {
        while (this.d == null) {
          Thread.yield();
          if (this.e)
            return; 
        } 
        t t1;
        if (!(t1 = this).b || t1.c < t1.b) {
          byte[] arrayOfByte = { 115, 109, 115, 58, 47, 47 };
          t t2;
          t1.e = (t2 = t1).c ? t2.a : t2.h;
          t1.d = (w)(new String(arrayOfByte, "UTF-8") + ((t2 = t1).c ? t2.b : t2.z));
          t1.d = (w)Connector.open((String)t1.d);
          TextMessage textMessage;
          (textMessage = (TextMessage)t1.d.newMessage("text")).setAddress((String)t1.d);
          textMessage.setPayloadText(t1.e);
          t1.d.send((Message)textMessage);
          try {
            Thread.sleep(50L);
          } catch (Exception exception) {}
          try {
            t1.d.close();
          } catch (Exception exception) {}
        } 
        if (this.c) {
          this.c = false;
        } else {
          this.c += this.d;
          if (b < this.e) {
            this.d = false;
            this.d.h();
          } 
        } 
      } 
      this.d.g();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      if (exception1 instanceof SecurityException) {
        this.d.g();
        return;
      } 
      if (exception1 instanceof NullPointerException) {
        this.d.g();
        return;
      } 
      if (exception1 instanceof ArrayIndexOutOfBoundsException) {
        this.d.g();
        return;
      } 
      if (exception1 instanceof ArithmeticException) {
        this.d.g();
        return;
      } 
      if (exception1 instanceof IllegalAccessException) {
        this.d.g();
        return;
      } 
      if (exception1 instanceof java.io.IOException) {
        this.d.g();
        return;
      } 
      if (exception1 instanceof ClassNotFoundException) {
        this.d.g();
        return;
      } 
      this.d.g();
      return;
    } 
  }
  
  public final void d(u paramu) {
    this.d = (w)paramu;
  }
  
  public final void d(boolean paramBoolean) {
    if (this.d == null && paramBoolean) {
      this.d = true;
      return;
    } 
    if (!paramBoolean)
      this.d.g(); 
  }
  
  public final void d() {
    this.d.g();
    this.e = true;
  }
  
  private Connection d() {
    return (Connection)this.d;
  }
  
  public final void e() {
    t t1;
    (t1 = this).a = true;
    t1.b = false;
    t1.c = false;
  }
  
  public final void d(StringBuffer paramStringBuffer, int paramInt1, int paramInt2, int paramInt3) {
    if (this.a) {
      String str;
      int m = paramInt1;
      t t1 = this;
      int n = m + 1;
      if (m < 9)
        str = "0" + (m + 1); 
      t1.d = v.d("512", "013", str, (String)null, paramInt2);
      t1.b = t1.d.b();
      t1.a = t1.d.c();
      t1.z = t1.d.e();
      t1.h = t1.d.d();
      t1.a = t1.d.d();
      t1.z = t1.d.e();
      t1.g = t1.d.a();
      if (t1.b != null && t1.a != null)
        t1.b = true; 
      this.a = false;
    } 
    int i = this.z;
    boolean bool = this.a;
    int j = paramInt3 / i;
    int k = bool - j;
    boolean bool1 = false;
    if (this.b && paramInt3 == 0) {
      paramStringBuffer.append("Cần gửi đi 1 SMS miễn phí và" + bool + "Phí SMS, " + i + "Đồng / tin, cộng lại" + paramInt2 + "Đồng ( không bao gồm phí tin tức ), số chăm sóc khách hàng: 010-58815500-888|");
    } else {
      paramStringBuffer.append("Cần gửi đi" + bool + "Phí SMS, " + i + "Đồng / tin, cộng lại" + paramInt2 + "Đồng ( không bao gồm phí tin tức ), số chăm sóc khách hàng: 010-58815500-886|");
    } 
    paramStringBuffer.append(this.g + "|");
    paramStringBuffer.append("Bạn đã gửi đi" + j + "Phí SMS, còn cần gửi đi" + k + "Phí SMS.");
    if (this.b && paramInt3 == 0) {
      paramStringBuffer.append("Các tin nhắn SMS miễn phí đầu tiên được sử dụng để nhận thông tin về trò chơi.");
      bool1 = true;
      this.c = true;
    } 
    this.d.d(bool1, paramStringBuffer.toString(), i);
  }
  
  public final boolean d() {
    return false;
  }
  
  public static String d() {
    return null;
  }
  
  public static String e() {
    return null;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\t.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */