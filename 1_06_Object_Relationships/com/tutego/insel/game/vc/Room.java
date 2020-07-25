package com.tutego.insel.game.vc;

import java.util.ArrayList;

public class Room {

  private ArrayList<Player> players = new ArrayList<>();

  public void addPlayer( Player player ) {
    players.add( player );
  }
  
  public void listPlayers() {
    for ( Player player : players )
      System.out.println( player.name );
  }
}