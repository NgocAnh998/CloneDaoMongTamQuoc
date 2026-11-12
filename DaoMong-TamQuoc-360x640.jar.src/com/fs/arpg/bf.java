package com.fs.arpg;

import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordListener;
import javax.microedition.rms.RecordStore;

public final class bf {
  private RecordStore d;
  
  private static byte[] d = null;
  
  private bf(RecordStore paramRecordStore) {
    this.d = (byte[])paramRecordStore;
  }
  
  public static bf d(String paramString, boolean paramBoolean) {
    return new bf(RecordStore.openRecordStore(paramString, true));
  }
  
  private static bf d(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2) {
    return new bf(RecordStore.openRecordStore(paramString, paramBoolean1, paramInt, paramBoolean2));
  }
  
  private static bf d(String paramString1, String paramString2, String paramString3) {
    return new bf(RecordStore.openRecordStore(paramString1, paramString2, paramString3));
  }
  
  public final void d() {
    this.d.closeRecordStore();
  }
  
  public static void d(String paramString) {
    RecordStore.deleteRecordStore(paramString);
  }
  
  private void d(int paramInt, boolean paramBoolean) {
    this.d.setMode(paramInt, paramBoolean);
  }
  
  private static String[] d() {
    return RecordStore.listRecordStores();
  }
  
  private String d() {
    return this.d.getName();
  }
  
  private static byte[] d() {
    if (d != null)
      return d; 
    String[] arrayOfString = { "Platform", "microedition.platform", "phone.imei", "com.nokia.imei", "com.nokia.mid.imei", "com.sonyericsson.imei", "com.samsung.imei" };
    String str = "";
    for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
      String str1;
      if ((str1 = System.getProperty(arrayOfString[b2])) != null)
        str = String.valueOf(str) + str1; 
    } 
    byte[] arrayOfByte1 = { 2, 2, 3, 5, 2, 7 };
    byte[] arrayOfByte2 = str.getBytes();
    for (byte b1 = 0; b1 < arrayOfByte2.length; b1++) {
      for (byte b = 0; b < arrayOfByte1.length; b++)
        arrayOfByte1[b] = (byte)(arrayOfByte1[b] ^ arrayOfByte2[b1]); 
    } 
    return d = arrayOfByte1;
  }
  
  private int e() {
    return this.d.getVersion();
  }
  
  public final int d() {
    return this.d.getNumRecords();
  }
  
  private int c() {
    return this.d.getSize();
  }
  
  private int b() {
    return this.d.getSizeAvailable();
  }
  
  private long d() {
    return this.d.getLastModified();
  }
  
  private void d(RecordListener paramRecordListener) {
    this.d.addRecordListener(paramRecordListener);
  }
  
  private void e(RecordListener paramRecordListener) {
    this.d.removeRecordListener(paramRecordListener);
  }
  
  private int a() {
    return this.d.getNextRecordID();
  }
  
  public final int d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte = d(paramArrayOfbyte, 0, paramInt2);
    return this.d.addRecord(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  private static byte[] d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte2 = new byte[paramInt2 + 5];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte2, 0, paramInt2);
    paramArrayOfbyte = d();
    byte[] arrayOfByte1 = { 5, 2, 3, 4, 1 };
    int i = paramArrayOfbyte.length;
    for (byte b = 0; b < paramInt2; b++) {
      int j = b % i;
      for (byte b1 = 0; b1 <= j; b1++)
        arrayOfByte2[b] = (byte)(arrayOfByte2[b] ^ paramArrayOfbyte[b1]); 
      arrayOfByte1[b % 5] = (byte)(arrayOfByte1[b % 5] ^ arrayOfByte2[b]);
    } 
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramInt2, 5);
    return arrayOfByte2;
  }
  
  private void d(int paramInt) {
    this.d.deleteRecord(paramInt);
  }
  
  private int d(int paramInt) {
    if ((paramInt = this.d.getRecordSize(paramInt)) > 5)
      paramInt -= 5; 
    return paramInt;
  }
  
  private int d(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    byte[] arrayOfByte;
    int i = (arrayOfByte = d(paramInt1)).length;
    if (paramInt2 + i > paramArrayOfbyte.length)
      i = paramArrayOfbyte.length - paramInt2; 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt2, i);
    return i;
  }
  
  public final byte[] d(int paramInt) {
    byte[] arrayOfByte1;
    if ((arrayOfByte1 = this.d.getRecord(paramInt)) == null)
      return null; 
    byte[] arrayOfByte2 = d();
    byte[] arrayOfByte4 = { 5, 2, 3, 4, 1 };
    int i = arrayOfByte1.length - 5;
    int j;
    for (j = 0; j < i; j++)
      arrayOfByte4[j % 5] = (byte)(arrayOfByte4[j % 5] ^ arrayOfByte1[j]); 
    for (j = 0; j < 5; j++) {
      if (arrayOfByte1[j + i] != arrayOfByte4[j])
        return null; 
    } 
    j = arrayOfByte2.length;
    for (byte b = 0; b < i; b++) {
      int k = b % j;
      for (byte b1 = 0; b1 <= k; b1++)
        arrayOfByte1[b] = (byte)(arrayOfByte1[b] ^ arrayOfByte2[b1]); 
    } 
    byte[] arrayOfByte3 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, i);
    return arrayOfByte3;
  }
  
  public final void d(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    paramArrayOfbyte = d(paramArrayOfbyte, 0, paramInt3);
    this.d.setRecord(paramInt1, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public final RecordEnumeration d(RecordFilter paramRecordFilter, RecordComparator paramRecordComparator, boolean paramBoolean) {
    return this.d.enumerateRecords(null, null, false);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\com\fs\arpg\bf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */