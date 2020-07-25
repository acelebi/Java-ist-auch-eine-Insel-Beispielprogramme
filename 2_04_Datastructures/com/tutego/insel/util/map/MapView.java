package com.tutego.insel.util.map;

import java.util.HashMap;
import java.util.Map;

public class MapView {
  public static void main( String[] args ) {
    Map<Integer, String> m = new HashMap<>();
    m.put( 1, "Eins" );
    m.put( 2, "ZZZZZWWWWEEEEEIIII" );
    m.put( 3, "drei" );
    System.out.println( m ); // {1=Eins, 2=ZZZZZWWWWEEEEEIIII, 3=drei}
    
    m.keySet().remove( 2 );
    System.out.println( m ); // {1=Eins, 3=drei}
    
    m.values().remove( "Eins" );
    System.out.println( m ); // {3=drei}
    
    m.entrySet().clear();
    System.out.println( m ); // {}
  }
}
