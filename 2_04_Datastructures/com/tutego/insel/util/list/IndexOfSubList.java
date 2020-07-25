package com.tutego.insel.util.list;

import java.util.Arrays;
import java.util.List;

public class IndexOfSubList {
  public static void main( String[] args ) {
    List<Integer> list = Arrays.asList( 1, 3, 4, 1 );
    Integer o = 1;
    
    for ( int i = list.indexOf( o ), j = -1;
          i > j;
          j = i, i += list.subList( i + 1, list.size() ).indexOf( o ) + 1 ) {
      System.out.println( i );
    }
  }
}
