public class SuppressedClosed2 {
  public static void main( String[] args ) {
    try ( NotCloseable res1 = new NotCloseable();
          NotCloseable res2 = new NotCloseable() ) {
       throw new NullPointerException();
   }
  }
}
