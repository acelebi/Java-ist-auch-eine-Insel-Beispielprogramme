public class CircuitNotCircuitOperator {

  @SuppressWarnings( "unused" )
  public static void main( String[] args ) {

    int a = 0, b = 0, c = 0 , d = 0;
    System.out.println( true || a++ == 0 );  // true, a wird nicht erhöht
    System.out.println( a );                 // 0
    System.out.println( true | b++ == 0 );   // true, b wird erhöht
    System.out.println( b );                 // 1
    System.out.println( false && c++ == 0 ); // false, c wird nicht erhöht
    System.out.println( c );                 // 0
    System.out.println( false & d++ == 0 );  // false, d wird erhöht
    System.out.println( d );                 // 1
  }
}