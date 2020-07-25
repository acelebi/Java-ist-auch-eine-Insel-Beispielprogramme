package com.tutego.insel.pattern.oberserver.generic;

interface Observer<T> {
  public void update( Observable<T> o, T arg );
}
