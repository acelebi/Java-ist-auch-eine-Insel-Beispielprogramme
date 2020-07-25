package com.tutego.insel.meta;

import java.lang.reflect.*;

public class ShowConstructors {
  public static void main( String[] args ) {
    for ( Constructor<?> c : java.awt.Color.class.getConstructors() )
      System.out.println( c );
  }
}
