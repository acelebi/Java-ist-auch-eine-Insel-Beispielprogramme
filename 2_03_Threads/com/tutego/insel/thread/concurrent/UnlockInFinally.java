package com.tutego.insel.thread.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class UnlockInFinally {

  public static void main( String[] args ) {
    ReentrantLock lock = new ReentrantLock();

    try {
      lock.lock();
      try {
        System.out.println( lock.getHoldCount() ); // 1
        System.out.println( 12 / 0 );
      }
      finally {
        lock.unlock();
      }
    }
    catch ( Exception e ) {
      System.out.println( e.getMessage() ); // / by zero
    }
    System.out.println( lock.getHoldCount() ); // 0
  }
}
