package com.tutego.insel.util;

import java.util.*;

class RoomComparator implements Comparator<Room> {
  @Override public int compare( Room room1, Room room2 ) {
    return Integer.compare( room1.getSqm(), room2.getSqm() );
  }
}

public class RoomComparatorDemo {
  
  public static void main( String[] args ) {
    Room[] rooms = { new Room(100), new Room(1123), new Room(123) };
    Arrays.sort( rooms, new RoomComparator() );
    System.out.println( rooms[0].getSqm() );      // 100
  }
}