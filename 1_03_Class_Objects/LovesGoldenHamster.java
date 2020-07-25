class LovesGoldenHamster {

  public static void main( String[] args ) {
    if ( args.length == 0 )
      System.out.println( "Was?! Keiner liebt kleine Hamster?" );
    else {
      System.out.print( "Liebt kleine Hamster: " );
  
      for ( String s : args )
        System.out.format( "%s ", s );
  
      System.out.println();
    }
  }
}
