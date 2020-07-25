package com.tutego.insel.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class UnsupportedOperationExceptionDemo {
  public static void main( String[] args ) {
    Collection<Integer> set = new HashSet<>();
    set.add( 1 );
    Collection<Integer> set2 = Collections.unmodifiableCollection( set );
    System.out.println( set2 ); // [1]
    set2.clear(); // Exception in thread "main" java.lang.UnsupportedOperationException
  }
}