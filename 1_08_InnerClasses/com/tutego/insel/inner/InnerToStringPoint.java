package com.tutego.insel.inner;

import java.awt.Point;

public class InnerToStringPoint {

  public static void main( String[] args ) {
    Point p = new Point( 10, 12 ) {
      @Override
      public String toString() {
        return "(" + x + "," + y + ")";
      }
    };

    System.out.println( p );    // (10,12)
  }
}