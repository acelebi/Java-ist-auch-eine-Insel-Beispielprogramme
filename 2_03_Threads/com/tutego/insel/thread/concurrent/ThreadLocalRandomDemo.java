package com.tutego.insel.thread.concurrent;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
  public static void main( String[] args ) {
    ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
    System.out.println( threadLocalRandom.nextInt( 1, 10 + 1 ) );
    System.out.println( threadLocalRandom.nextInt( 1, 10 + 1 ) );
  }
}