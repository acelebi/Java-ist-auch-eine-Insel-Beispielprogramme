package com.tutego.insel.game.v7;

public class Player {

  public String name;
  public String item;

  public Player() { }

  public Player( Player player ) {
    name = player.name;
    item = player.item;
  }  
}