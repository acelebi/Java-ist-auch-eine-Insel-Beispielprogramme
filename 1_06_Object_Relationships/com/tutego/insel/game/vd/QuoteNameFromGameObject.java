package com.tutego.insel.game.vd;

public class QuoteNameFromGameObject {

  public static void quote( GameObject go ) {
    System.out.println( "'" + go.name + "'" );
  }

  public static void main( String[] args ) {
    Player player = new Player();
    player.name = "Godman";
    quote( player );            // 'Godman'

    GameObject room = new Room();
    room.name = "Hogwurz";
    quote( room );             // 'Hogwurz'
  }
}
