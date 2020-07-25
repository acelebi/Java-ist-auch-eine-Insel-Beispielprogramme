package com.tutego.insel.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An {@link Iterator} that goes over a given {@link Collection} 
 * but rolls back to the start when it reaches the end.
 * If the underling {@link Collection} contains no elements the method
 * {@link #hasNext()} will return {@code false}. Removing elements is
 * supported if the Iterator of the underlying Collection
 * supports {@link Iterator#remove()}. Iterating over the underling
 * Collection and modifying it at the same time will probably result in a
 * {@link ConcurrentModificationException}.
 */
public class RotatingIterator<E> implements Iterator<E>, Iterable<E> {
  
  private final Collection<? extends E> collection;
  private Iterator<? extends E>         iterator;

  public RotatingIterator( Collection<? extends E> collection ) {
    if ( collection == null )
      throw new IllegalArgumentException( "Collection darf nicht null sein" );

    this.collection = collection;
    iterator = collection.iterator();
  }

  @SafeVarargs
  public RotatingIterator( E... elements ) {
    this( Arrays.asList( elements ) );
  }

  @Override
  public boolean hasNext() {
    return !collection.isEmpty();
  }

  @Override
  public E next() {
    if ( !hasNext() )
      throw new NoSuchElementException( "Keine Elemente in der Collection" );

    if ( !iterator.hasNext() )
      iterator = collection.iterator();

    return iterator.next();
  }

  @Override
  public void remove() {
    iterator.remove();
  }

  @Override
  public Iterator<E> iterator() {
    return this;
  }
}