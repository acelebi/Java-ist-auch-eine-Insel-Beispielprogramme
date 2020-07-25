package com.tutego.insel.meta;

import java.lang.reflect.*;

class GetFieldElements {
  public static void main( String[] args ) {
    Object   o = new java.awt.Rectangle( 11, 22, 33, 44 );
    Class<?> c = o.getClass();

    try {
      Field heightField = c.getField( "height" ),
            widthField  = c.getField( "width" ),
            xField      = c.getField( "x" ),
            yField      = c.getField( "y" );

      Integer height = (Integer) heightField.get( o );

      int width = widthField.getInt( o ),
              x = xField.getInt( o ),
              y = yField.getInt( o );

      String s = c.getName() + "[x=" + x + ",y=" + y +
                 ",width=" + width + ",height=" + height + "]";

      System.out.println( s ); // java.awt.Rectangle[x=11,y=22,width=33,height=44]
      System.out.println( o ); // java.awt.Rectangle[x=11,y=22,width=33,height=44]
    }
    catch ( ReflectiveOperationException e ) {
      e.printStackTrace();
    }
  }
}