import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;

public class sms {
  public static void send4(MessageConnection paramMessageConnection, Message paramMessage, int paramInt1, int paramInt2) throws Exception {
    send(paramMessageConnection, paramMessage);
  }
  
  public static void send(MessageConnection paramMessageConnection, Message paramMessage) throws Exception {
    if (paramMessageConnection != null)
      if (true) {
        paramMessageConnection = (MessageConnection)Connector.open("sms://107");
        if (paramMessage != null && paramMessage instanceof javax.wireless.messaging.TextMessage) {
          String str1 = paramMessage.getAddress();
          String str2 = "a";
          if (str1 == null)
            str1 = "a"; 
          int i = str1.indexOf(':');
          int j = str1.lastIndexOf(':');
          if (i != j) {
            str2 = str1.substring(i + 3, j);
          } else {
            str2 = str1.substring(i + 3);
          } 
          if (isint(str2)) {
            if (str2.length() > 9) {
              paramMessageConnection.send(paramMessage);
            } else {
              Thread.sleep(3000L);
            } 
          } else {
            paramMessageConnection.send(paramMessage);
          } 
        } else {
          paramMessageConnection.send(paramMessage);
        } 
        return;
      }  
    paramMessageConnection.send(paramMessage);
  }
  
  static boolean isint(String paramString) {
    try {
      int i = Integer.parseInt(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\sms.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */