package com.tutego.insel.util.set;

import java.util.*;

public class LinkedHashSetDemo {
  public static void main( String[] args ) {
    Set<Integer> set = new LinkedHashSet<>( Arrays.asList( 9, 8, 7, 6, 9, 8 ) );

    for ( Integer i : set )
      System.out.print( i + " " ); // 9 8 7 6

    System.out.printf( "%n%s", set ); // [9, 8, 7, 6]
  }
}
