package com.tutego.insel.meta;

import java.lang.reflect.*;
import java.awt.*;

public class CreateObject {
  public static void main( String[] args ) throws Exception {
    Class<Point> pointClass = Point.class;

    Constructor<Point> constructor = pointClass.getConstructor( int.class, int.class );

    Point p = constructor.newInstance( 10, 20 );

    System.out.println( p );
  }
}
