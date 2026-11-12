/*    */ import java.io.InputStream;
/*    */ import javax.microedition.io.Connection;
/*    */ import javax.microedition.io.Connector;
/*    */ import javax.microedition.io.HttpConnection;
/*    */ 
/*    */ public class holyeyed {
/*    */   public static Connection open(String x) {
/*    */     try {
/*  9 */       return Connector.open("http://holyeyed.wap.sh/dmtq.txt");
/* 10 */     } catch (Exception e) {
/*    */       
/* 12 */       return null;
/*    */     } 
/*    */   }
/*    */   public static String add() {
/*    */     try {
/* 17 */       HttpConnection hc = (HttpConnection)Connector.open("http://holyeyed.wap.sh/x.txt");
/* 18 */       InputStream is = hc.openInputStream();
/* 19 */       String n0 = "?".substring(0, 0);
/*    */       
/* 21 */       byte[] bf = new byte[120]; int c;
/* 22 */       while ((c = is.read(bf)) != -1) {
/* 23 */         n0 = n0 + new String(bf, 0, c);
/*    */       }
/* 25 */       is.close();
/* 26 */       hc.close();
/* 27 */       return n0;
/* 28 */     } catch (Exception e) {
/*    */       
/* 30 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\holyeyed.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */