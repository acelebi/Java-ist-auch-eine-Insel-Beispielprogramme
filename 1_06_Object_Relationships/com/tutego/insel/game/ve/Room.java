package com.tutego.insel.game.ve;

public class Room extends GameObject {

  public int size;

  @Override public String toString() {
    return String.format( "%s[name=%s, size=%d]", getClass().getSimpleName(), name, size );
  }
}