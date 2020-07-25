package com.tutego.insel.util.set;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class HashSetDoubleAdd {
  public static void main( String[] args ) {
    Set<Point> set = new HashSet<>();
    Point p1 = new Point(), p2 = new Point();
    System.out.println( set.add( p1 ) ); // true
    System.out.println( set.add( p1 ) ); // false
    System.out.println( set.add( p2 ) ); // false
    System.out.println( set.contains( p1 ) ); // true
    System.out.println( set.contains( p2 ) ); // true
  }
}
