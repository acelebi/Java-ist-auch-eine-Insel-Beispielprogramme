public class WhileLoop {

  public static void main( String[] args ) {
    int cnt = 100;
    
    while ( cnt >= 40 ) {
      System.out.printf( "Ich erblickte das Licht der Welt in Form einer %d-Watt-Glühbirne.%n", cnt );
    
      cnt -= 10;
    }
  }
}