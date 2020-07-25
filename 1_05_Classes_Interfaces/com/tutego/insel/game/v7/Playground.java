package com.tutego.insel.game.v7;

class Playground {

  public static void main( String[] args ) {
    Player patric = new Player();
    patric.name = "Patric Circle";
    patric.item = "Knoten";
    
    Player tryk = new Player( patric );
    System.out.println( tryk.name );  // Patric Circle
    System.out.println( tryk.item );  // Knoten
  }
}
