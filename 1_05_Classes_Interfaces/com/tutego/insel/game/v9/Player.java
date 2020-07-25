package com.tutego.insel.game.v9;

public class Player {

  public String name;
  public String item;

  public Player() {
    this( "", "" );
  }

  public Player( Player player ) {
    this( player.name, player.item );
  }

  public Player( String name, String item ) {
    this.name = name.trim();
    this.item = item.trim();
  }
}