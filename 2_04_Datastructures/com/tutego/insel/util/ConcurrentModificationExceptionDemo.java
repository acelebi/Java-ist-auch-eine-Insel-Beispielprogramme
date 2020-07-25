package com.tutego.insel.util;

import java.util.*;

public class ConcurrentModificationExceptionDemo {
  public static void main( String[] args ) {
    List<String> list = new ArrayList<>( Arrays.asList( "Stunden", "der" ) );
    Iterator<String> iterator = list.iterator();
    System.out.println( list.get( 0 ) ); // Stunden
    list.add( "Entspannung" );
    iterator.next(); // Exception in thread "main" java.util.ConcurrentModificationException
  }
}