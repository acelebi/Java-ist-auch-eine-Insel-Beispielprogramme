package com.tutego.insel.util;

import java.util.*;

public class MyFirstCollection {
  private static void fill( Collection<String> c ) {
    c.add( "Juvy" );
    c.add( "Tina" );
    c.add( "Joy" );
  }

  public static void main( String[] args ) {
    List<String> c = new LinkedList<>();
    fill( c );
    System.out.println( c );     // [Juvy, Tina, Joy]
    Collections.sort( c );
    System.out.println( c );     // [Joy, Juvy, Tina]
  }
}
