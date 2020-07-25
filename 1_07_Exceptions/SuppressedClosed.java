public class SuppressedClosed {
  public static void main( String[] args ) {
    try ( NotCloseable res = new NotCloseable() ) {
//      throw new NullPointerException();
    }
  }
}
