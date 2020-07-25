package com.tutego.insel.generic;

import java.io.IOException;

public class CharReadableExample {
  public static void main( String[] args ) {
    CharIterable<RuntimeException> iter1 = new StringIterable( "Shasha" );
    while ( iter1.hasNext() )
      System.out.print( iter1.next() );

    System.out.println();

    try {
      CharIterable<IOException> iter2 = new WebIterable( "http://tutego.de/javabuch/aufgaben/bond.txt" );
      while ( iter2.hasNext() )
        System.out.print( iter2.next() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}