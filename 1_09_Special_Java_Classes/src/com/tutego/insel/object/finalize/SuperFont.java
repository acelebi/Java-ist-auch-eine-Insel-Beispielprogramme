package com.tutego.insel.object.finalize;

import java.awt.Font;

public class SuperFont extends Font {
  
  public SuperFont( String name, int style, int size ) {
    super( name, style, size );
  }

  @Override
  protected void finalize() throws Throwable {
    try {
      // ...
    }
    finally {
      super.finalize();
    }
  }
}