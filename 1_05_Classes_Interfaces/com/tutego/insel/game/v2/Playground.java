package com.tutego.insel.game.v2;

class Playground {

  public static void main( String[] args ) {
    Player p = new Player();
    p.name = "Mutiger Manfred";
    p.item = "Schlips";
    
    System.out.printf( "%s nimmt einen %s mit.", p.name, p.item ); 
  }
}
