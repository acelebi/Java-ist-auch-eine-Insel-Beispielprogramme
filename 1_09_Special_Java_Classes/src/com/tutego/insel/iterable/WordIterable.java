package com.tutego.insel.iterable;

import java.util.*;

class WordIterable implements Iterable<String>, Iterator<String> {
  
  private StringTokenizer st;

  public WordIterable( String s ) {
    st = new StringTokenizer( s );
  }

  // Method from interface Iterable

  @Override public Iterator<String> iterator() {
    return this;
  }

  // Methods from interface Iterator

  @Override public boolean hasNext() {
    return st.hasMoreTokens();
  }

  @Override public String next() {
    return st.nextToken();
  }
}