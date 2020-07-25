package com.tutego.insel.util;

import java.util.Iterator;

public class RandomIteratorDemo {
  public static void main( String[] args ) {
    Iterator<Integer> random = new RandomIterator( 6 );
    int dice1 = random.next();
    int dice2 = random.next();
    System.out.println( dice1 );
    System.out.println( dice2 );
  }
}