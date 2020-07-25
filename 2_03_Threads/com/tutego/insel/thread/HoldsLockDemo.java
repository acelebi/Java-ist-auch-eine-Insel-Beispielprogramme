package com.tutego.insel.thread;

public class HoldsLockDemo {

  public static void main( String[] args ) {
    final Object obj = new Object();

    System.out.println( Thread.holdsLock( obj ) ); // false

    synchronized ( obj ) {
      System.out.println( Thread.holdsLock( obj ) ); // true
    }

    // System.out.println( Thread.holdsLock(this) );
  }
}