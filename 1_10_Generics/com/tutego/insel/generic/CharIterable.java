package com.tutego.insel.generic;

public interface CharIterable<E extends Exception> {
  boolean hasNext() throws E;
  char    next()    throws E;
}
