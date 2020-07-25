package com.tutego.insel.pattern.oberserver.generic;

import java.util.*;

public class Observable<T> {

  private final List<Observer<T>> observers = new ArrayList<>();

  public void addObserver( Observer<T> observer ) {
    Objects.requireNonNull( observer );
    
    if ( ! observers.contains( observer ) )
      observers.add( observer );
  }

  public void deleteObserver( Observer<T> observer ) {
    Objects.requireNonNull( observer );

    observers.remove( observer );
  }

  public void notifyObservers( T arg ) {
    for ( Observer<T> observer : observers )
      observer.update( this, arg );
  }
}