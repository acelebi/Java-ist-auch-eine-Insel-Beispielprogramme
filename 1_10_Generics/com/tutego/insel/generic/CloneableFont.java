package com.tutego.insel.generic;

import java.awt.Font;

public class CloneableFont extends Font implements Cloneable {
  
  public CloneableFont( String name, int style, int size ) {
    super( name, style, size );
  }

  @Override public Font clone() {
    return new Font( getAttributes() );
  }
}