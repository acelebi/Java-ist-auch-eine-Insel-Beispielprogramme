package com.tutego.insel.game.vb;

class InvalidPlayground {

  public static void main( String[] args ) {
    Player buster = new Player();
    Room   tower = new Room();
    buster.room  = tower;
    tower.player = buster;
    Room toilet = new Room();
    toilet.player = buster;
    
    System.out.println( buster );       // com.tutego.insel.game.vb.Player@addbf1
    System.out.println( tower );        // com.tutego.insel.game.vb.Room@42e816
    System.out.println( toilet );       // com.tutego.insel.game.vb.Room@9304b1
    System.out.println( buster.room );  // com.tutego.insel.game.vb.Room@42e816
    System.out.println( tower.player ); // com.tutego.insel.game.vb.Player@addbf1
    System.out.println( toilet.player );// com.tutego.insel.game.vb.Player@addbf1
  }
}