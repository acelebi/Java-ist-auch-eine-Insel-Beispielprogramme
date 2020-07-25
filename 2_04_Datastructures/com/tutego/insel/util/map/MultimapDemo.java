package com.tutego.insel.util.map;

import java.util.*;

public class MultimapDemo {

  public static void main( String[] args ) {
    Multimap<Integer, String> mm = new Multimap<>();
    System.out.println( mm.get( 1 ) ); // []
    mm.put( 1, "eins" );
    System.out.println( mm.get( 1 ) ); // [eins]
    mm.put( 1, "one" );
    System.out.println( mm.get( 1 ) ); // [eins, one]
  }
}

class Multimap<K, V> {

  private final Map<K, Collection<V>> map = new HashMap<>();

  public Collection<V> get( K key ) {
    return map.getOrDefault( key, Collections.<V> emptyList() );
  }

  public void put( K key, V value ) {
    map.computeIfAbsent( key, k -> new ArrayList<>() )
       .add( value );
  }
}