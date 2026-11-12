public final class g extends RuntimeException {
  private static final long d = 1L;
  
  public Object d;
  
  private g(Object paramObject) {
    this.d = paramObject;
  }
  
  public final String getMessage() {
    return (this.d == null) ? "nil" : this.d.toString();
  }
}


/* Location:              C:\Users\PC\Downloads\DaoMong-TamQuoc-360x640.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */