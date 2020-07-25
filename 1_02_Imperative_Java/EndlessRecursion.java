class EndlessRecursion {

  static void down( int n ) {
    System.out.print( n + ", " );
    down( n - 1 );
  }

  public static void main( String[] args ) {
    down( 100 );
  }
}