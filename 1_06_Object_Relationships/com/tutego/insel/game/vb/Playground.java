package com.tutego.insel.game.vb;

class Playground {

  public static void main( String[] args ) {
    Player buster = new Player();
    Room   tower  = new Room();

    buster.room  = tower;
    tower.player = buster;
  }
}
