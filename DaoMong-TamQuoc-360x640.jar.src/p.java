import java.io.DataInputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import javax.microedition.io.HttpConnection;

public final class p extends r implements d, j {
  private static final Hashtable d;
  
  private static final byte d = 0;
  
  private static final byte e = 1;
  
  private j d;
  
  static {
    (d = (j)new Hashtable(4)).put("d", new Byte((byte)0));
    d.put("get", new Byte((byte)1));
  }
  
  private static void d(i parami) {
    // Byte code:
    //   0: new m
    //   3: dup
    //   4: new n
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: invokespecial <init> : (Ln;)V
    //   14: astore_1
    //   15: aload_0
    //   16: dup
    //   17: astore_0
    //   18: getfield d : Ll;
    //   21: getfield d : Lj;
    //   24: ldc 'Secure'
    //   26: aload_1
    //   27: invokeinterface d : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   32: return
  }
  
  private void d(e parame, String paramString, Object paramObject) {
    try {
      Object[] arrayOfObject;
      HttpConnection httpConnection = (HttpConnection)holyeyed.open(paramString);
      if (this.d != null) {
        httpConnection.setRequestMethod("POST");
        Object object = null;
        String str = "";
        while ((object = this.d.e(object)) != null) {
          Object object1;
          if ((object1 = this.d.d(object)) != null)
            str = String.valueOf(str) + "&" + object.toString() + "=" + a.d(object1.toString()); 
        } 
        if (!"".equals(str)) {
          httpConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          httpConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
          OutputStream outputStream;
          (outputStream = httpConnection.openOutputStream()).write(str.getBytes());
        } 
      } else {
        httpConnection.setRequestMethod("GET");
      } 
      if (httpConnection.getResponseCode() == 200) {
        this.d = null;
        i i2 = new i();
        i i1;
        DataInputStream dataInputStream;
        f f = h.d(dataInputStream = httpConnection.openDataInputStream(), ((l)(i1 = i2).d).d);
        (new Object[1])[0] = paramObject;
        arrayOfObject = (paramObject == null) ? null : new Object[1];
        i2.d(f, arrayOfObject);
        dataInputStream.close();
        return;
      } 
      if (httpConnection.getResponseCode() == 301 || httpConnection.getResponseCode() == 302) {
        String str = httpConnection.getHeaderField("location");
        d((e)arrayOfObject, str, paramObject);
        httpConnection.close();
        return;
      } 
    } catch (Exception exception) {
      (paramString = null).printStackTrace();
    } 
  }
  
  public final void d(Object paramObject1, Object paramObject2) {
    byte b;
    if (paramObject1 = d.get(paramObject1) instanceof Byte && (b = ((Byte)paramObject1).byteValue()) == 0)
      this.d = (j)paramObject2; 
  }
  
  public final Object d(Object paramObject) {
    byte b;
    return ((paramObject = d.get(paramObject)) == null) ? null : ((paramObject instanceof Byte) ? (((b = ((Byte)paramObject).byteValue()) == 0) ? this.d : new c(this, b)) : b);
  }
  
  public final int d(int paramInt) {
    return 0;
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */