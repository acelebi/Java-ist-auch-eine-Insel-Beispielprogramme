class Recursion {

  static void down1( int n ) {
    if ( n <= 0 )
      return;

    System.out.print( n + ", " );

    down1( n - 1 );
  }

  static void down2( int n ) {
    if ( n <= 0 )
      return;

    down2( n - 1 );

    System.out.print( n + ", " );
  }

  public static void main( String[] args ) {
    down2( 10 );
    down2( -10 );
  }
}