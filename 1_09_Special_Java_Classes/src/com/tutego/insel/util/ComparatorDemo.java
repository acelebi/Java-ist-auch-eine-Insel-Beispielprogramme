package com.tutego.insel.util;

import java.util.*;

public class ComparatorDemo {
  public static void main( String[] args ) {
    List<Room> list = Arrays.asList( new Room( 100 ), new Room( 1123 ), new Room( 123 ) );

//    Comparator<Room> comp = Comparator.comparingInt( (Room r) -> r.getSqm() );
    Comparator<Room> comp = Comparator.comparingInt( Room::getSqm );
    Collections.sort( list, comp );
    System.out.println( list.get( 0 ).getSqm() ); // 100
  }
}
