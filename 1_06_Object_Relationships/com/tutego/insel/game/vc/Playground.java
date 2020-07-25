package com.tutego.insel.game.vc;

class Playground {

  public static void main( String[] args ) {
    Room oceanLiner  = new Room();
    oceanLiner.addPlayer( new Player( "Tim" ) );
    oceanLiner.addPlayer( new Player( "Jorry" ) );
    oceanLiner.listPlayers();         // Tim Jorry
  }
}