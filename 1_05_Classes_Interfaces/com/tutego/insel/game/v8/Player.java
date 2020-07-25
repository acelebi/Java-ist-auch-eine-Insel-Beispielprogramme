package com.tutego.insel.game.v8;

public class Player {

  public String name;
  public String item;

  public Player( Player player ) {
    name = player.name.trim();
    item = player.item.trim();
  }

  public Player( String name, String item ) {
    this.name = name.trim();
    this.item = item.trim();
  }
}