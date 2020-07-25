package com.tutego.insel.meta;

import java.lang.reflect.*;
import java.awt.*;

class SetFieldElements {
  public static void main( String[] args ) {
    Point p = new Point( 11, 22 );
    System.out.println( p ); // java.awt.Point[x=11,y=22]

    try {
      Field fieldX = p.getClass().getField( "x" );
      fieldX.set( p, 1111 );

      Field fieldY = p.getClass().getField( "y" );
      fieldY.setInt( p, 2222 );

      System.out.println( p ); // java.awt.Point[x=1111,y=2222]

      Field fieldZ = p.getClass().getField( "z" );
      fieldZ.set( p, 0 ); // java.lang.NoSuchFieldException: z
    }
    catch ( ReflectiveOperationException e ) {
      e.printStackTrace();
    }
  }
}