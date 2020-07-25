package com.tutego.insel.thread.concurrent;

import java.util.concurrent.*;

public class SemaphoreDemo {
  
//  static Semaphore semaphore = new Semaphore( 2 );
  static Semaphore semaphore = new Semaphore( 2, true );

  static Runnable r = new Runnable() {
    @Override public void run() {
      while ( true ) {
        try {
          semaphore.acquire();
          try {
            System.out.println( "Thread=" + Thread.currentThread().getName() +
                                ", Available Permits=" + semaphore.availablePermits() );
            TimeUnit.SECONDS.sleep( 2 );
          }
          finally {
            semaphore.release();
          }
        }
        catch ( InterruptedException e ) {
          e.printStackTrace();
          Thread.currentThread().interrupt();
          break;
        }
      }
    }
  };

  public static void main( String[] args ) {
    new Thread( r ).start();
    new Thread( r ).start();
    new Thread( r ).start();
  }
}