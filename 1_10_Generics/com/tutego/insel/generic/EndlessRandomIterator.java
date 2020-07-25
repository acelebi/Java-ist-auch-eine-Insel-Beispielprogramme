package com.tutego.insel.generic;

import java.util.Iterator;

public class EndlessRandomIterator implements Iterator<Double> {
  
  @Override public boolean hasNext() {
    return true;
  }

  @Override public Double next() {
    return Math.random();
  }

  @Override public void remove() {
    throw new UnsupportedOperationException();
  }
}
