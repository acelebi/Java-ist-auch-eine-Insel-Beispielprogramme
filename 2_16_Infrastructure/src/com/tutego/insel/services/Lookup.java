package com.tutego.insel.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Lookup {

  public static <T> T lookup( Class<T> clazz ) {
    Iterator<T> iterator = ServiceLoader.load( clazz ).iterator();
    return iterator.hasNext() ? iterator.next() : null;
  }

  public static <T> Collection<? extends T> lookupAll( Class<T> clazz ) {
    Collection<T> result = new ArrayList<>();
    for ( T e : ServiceLoader.load( clazz ) )
      result.add( e );
    return result;
  }
}
