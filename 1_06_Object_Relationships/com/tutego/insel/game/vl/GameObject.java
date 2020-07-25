package com.tutego.insel.game.vl;

import java.io.Serializable;

public abstract class GameObject implements Serializable {

  protected String name;
  
  protected GameObject( String name ) {
    this.name = name;
    
  }
}
