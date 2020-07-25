package com.tutego.insel.meta;

import java.awt.*;
import java.lang.reflect.*;

class InvokeMethod {
  public static void main( String[] args ) throws Exception {
    Point p = new Point( 10, 0 );

    Method method = p.getClass().getMethod( "getX" );
    String returnType = method.getReturnType().getName();

    Object returnValue = method.invoke( p );
    System.out.printf( "(%s) %s", returnType, returnValue ); // (double) 10.0
  }
}
