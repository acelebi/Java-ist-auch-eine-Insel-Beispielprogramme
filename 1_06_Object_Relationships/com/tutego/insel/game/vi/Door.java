package com.tutego.insel.game.vi;

public class Door extends GameObject {

  int     id;
  boolean isOpen;

  @Override public boolean useOn( GameObject object ) {
    return false;
  }
}
