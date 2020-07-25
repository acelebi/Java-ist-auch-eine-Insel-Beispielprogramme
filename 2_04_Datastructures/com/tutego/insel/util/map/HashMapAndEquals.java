package com.tutego.insel.util.map;

import java.awt.Point;
import java.util.*;

public class HashMapAndEquals {
  public static void main( String[] args ) {
    Map<Point, String> map = new HashMap<>();
    Point p1 = new Point( 10, 20 );
    map.put( p1, "Point p1" );

    Point p2 = new Point( 10, 20 );
    System.out.println( map.get( p2 ) ); // ???
  }
}
