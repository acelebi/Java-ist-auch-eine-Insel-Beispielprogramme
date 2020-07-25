/**
 * Erstes Java-Beispielprogramm.
 * @version 1.02    26 Dez 2013
 * @author Christian Ullenboom
 */
public class Quadrat {
  
  static int quadrat( int n ) {
    return n * n;
  }

  static void ausgabe( int n ) {
    for ( int i = 1; i <= n; i = i + 1 ) {
      String s = "Quadrat(" + i + ") = " + quadrat(i);
      System.out.println( s );
    }
  }

  public static void main( String[] args ) {
    ausgabe( 4 );
  }
}
