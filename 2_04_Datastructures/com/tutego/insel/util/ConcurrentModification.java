package com.tutego.insel.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModification {
  public static void main( String[] args ) {
    List<String> list = new ArrayList<>( Arrays.asList( "Trullo", "Zippus" ) );
    int posOfZippus = list.indexOf( "Zippus" );
    System.out.println( list.get( posOfZippus ) ); // Zippus
    list.add( 0, "Apulien" );
    System.out.println( list.get( posOfZippus ) ); // Trullo
  }
}
