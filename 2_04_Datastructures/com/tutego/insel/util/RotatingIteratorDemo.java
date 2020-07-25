package com.tutego.insel.util;

public class RotatingIteratorDemo {
  public static void main( String[] args ) {
    int i = 0;
    for ( String s : new RotatingIterator<>( "Bohnen", "Eintopf" ) ) {
      System.out.println( "Toll, heute gibt es " + s );

      if ( i++ == 7 )
        break;
    }
  }
}
