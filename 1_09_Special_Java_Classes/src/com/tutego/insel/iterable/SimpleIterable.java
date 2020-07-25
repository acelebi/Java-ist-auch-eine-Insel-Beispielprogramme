package com.tutego.insel.iterable;

public class SimpleIterable {
  
  public static void main( String[] args ) {
    for ( String s : new String[]{ "Eclipse", "NetBeans", "IntelliJ" } )
      System.out.printf( "%s ist toll.%n", s );
  }
}
