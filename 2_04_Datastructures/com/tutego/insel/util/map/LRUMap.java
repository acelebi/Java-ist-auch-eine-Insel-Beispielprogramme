package com.tutego.insel.util.map;

import java.util.*;

public class LRUMap<K,V> extends LinkedHashMap<K,V> {
  private final int capacity;

  public LRUMap( int capacity ) {
    super( capacity, 0.75f, true );
    this.capacity = capacity;
  }

  @Override
  protected boolean removeEldestEntry( Map.Entry<K,V> eldest ) {
    return size() > capacity;
  }
}
