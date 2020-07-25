package com.tutego.insel.nongeneric;

import java.util.Iterator;

@SuppressWarnings("all")
public class EndlessRandomIterator implements Iterator {

  public boolean hasNext() {
    return true;
  }

  public Object next() {
    return Double.valueOf( Math.random() );
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}