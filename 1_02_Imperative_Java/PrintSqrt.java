public class PrintSqrt {

  static void printSqrt( double d ) {
    if ( d < 0 ) {
      System.out.println( "Keine Wurzel aus negativen Zahlen!" );
      return;
    }
    System.out.println( Math.sqrt( d ) );
  }
}
