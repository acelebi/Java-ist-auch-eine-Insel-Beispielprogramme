public class ToStringFromSuper {

  public ToStringFromSuper() {
    System.out.println( super.toString() );
  }
  
  @Override public String toString() {
    return "Nein";
  }

  public static void main( String[] args ) {
    new ToStringFromSuper();       // ToStringFromSuper@3e25a5
  }
}
