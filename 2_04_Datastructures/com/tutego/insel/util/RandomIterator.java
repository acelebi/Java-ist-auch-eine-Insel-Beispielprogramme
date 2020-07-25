package com.tutego.insel.util;

import java.util.*;

/**
 * Iterator for pseudorandom numbers.
 */
public class RandomIterator implements Iterator<Integer> {

  private final Random random = new Random();
  private final int bound;

  /**
   * Initializes this iterator with a maximum value (exclusive) for
   * pseudorandom numbers.
   * @param bound  Maximum (exclusive) pseudorandom
   */
  public RandomIterator( int bound ) {
    this.bound = bound;
  }

  /**
   * Always true.
   * @return {@code true}.
   */
  @Override
  public boolean hasNext() {
    return true;
  }

  /**
   * Returns a pseudorandom, uniformly distributed {@code Integer} value
   * between 0 (inclusive) and the specified value (exclusive).
   * @return Next pseudorandom.
   */
  @Override
  public Integer next() {
    return random.nextInt( bound );
  }

  /**
   * Not supported.
   * @throws UnsupportedOperationException
   */
  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
