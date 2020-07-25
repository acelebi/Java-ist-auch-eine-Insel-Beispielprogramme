class PlusString {

  public static void main( String[] args ) {
    System.out.println( 1 + 2 );                 // 3
    System.out.println( "1" + 2 + 3 );           // 123
    System.out.println( 1 + 2 + "3" );           // 33
    System.out.println( 1 + 2 + "3" + 4 + 5 );   // 3345
    System.out.println( 1 + 2 + "3" + (4 + 5) ); // 339

    System.out.println( '0' + 2 );     // 50  - ASCII value for '0' is 48
    System.out.println( 'A' + 'a' );   // 162 - 'A'=65, 'a'=97
  }
}
