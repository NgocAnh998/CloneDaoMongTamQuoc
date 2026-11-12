import java.util.Hashtable;

public class o extends r implements d, j {
  private Hashtable d;
  
  public final int d(int paramInt) {
    return 0;
  }
  
  public final void d(Object paramObject1, Object paramObject2) {
    if (paramObject2 != null) {
      if (this.d == null)
        this.d = new Hashtable(4); 
      this.d.put(paramObject1, paramObject2);
      return;
    } 
    if (this.d != null)
      this.d.remove(paramObject1); 
  }
  
  public final Object d(Object paramObject) {
    return (this.d == null) ? null : this.d.get(paramObject);
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */