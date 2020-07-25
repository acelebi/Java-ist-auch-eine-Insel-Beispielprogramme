package com.tutego.insel.exceptions.v1;

class Player {

  int age;

  Player( int age ) {
    if ( age <= 0 )
      throw new IllegalArgumentException( "Kein Alter <= 0 erlaubt!" );

    this.age = age;
  }

//  public static void main( String[] args )
//  {
//    try
//    {
//      Player d = new Player( -100 );
//      System.out.println( d );
//    }
//    catch ( IllegalArgumentException e )
//    {
//      e.printStackTrace();
//    }
//  }

  public static void main( String[] args ) {
    Player d = new Player( -100 );
    System.out.println( d );
  }
}