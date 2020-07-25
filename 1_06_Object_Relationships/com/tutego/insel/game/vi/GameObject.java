package com.tutego.insel.game.vi;

public abstract class GameObject {
  public String name;
  public abstract boolean useOn( GameObject object );
}
