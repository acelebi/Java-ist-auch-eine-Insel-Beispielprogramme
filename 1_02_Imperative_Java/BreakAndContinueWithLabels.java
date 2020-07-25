public class BreakAndContinueWithLabels {

  @SuppressWarnings( "unused" )
  public static void main( String[] args ) {
    heaven:
    while ( true ) {
      hell:
      while ( true )
        break /* continue */ heaven;
      // System.out.println( "hell" );
    }
    System.out.println( "heaven" );

//    heaven:
//    while ( true )
//    {
//      hell:
//      while ( true )
//      {
//        break /* continue */ hell;
//      }
//      System.out.println( "hell" );
//    }
////        System.out.println( "heaven" );
  }
}
