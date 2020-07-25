package com.tutego.insel.game.v6;

class Playground {

  public static void main( String[] args ) {
    Player spuderman = new Player( "Spuderman" ) ;
    System.out.println( spuderman.name ); // Spuderman
    System.out.println( spuderman.item ); // null

    Player holk      = new Player( "Holk", "green color" );
    System.out.println( holk.name );      // Holk
    System.out.println( holk.item );      // green color
    
//    Player p = new Player(); // The constructor Player() is undefined
  }
}