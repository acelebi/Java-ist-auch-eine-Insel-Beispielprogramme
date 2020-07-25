package com.tutego.insel.util.map;

import java.awt.Point;
import java.util.*;

public class MapImmutable {
  public static void main( String[] args ) {
    Map<Point, String> map = new HashMap<>();
    Point q = new Point( 1, 1 );
    map.put( q, "Punkt q" );
    q.x = 12345;
    System.out.println( map.get( q ) ); // ???
    q.x = 1;
    System.out.println( map.get( q ) ); // ???
  }
}
