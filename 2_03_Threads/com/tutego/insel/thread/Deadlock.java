package com.tutego.insel.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class Deadlock {

  public static void main( String[] args ) {
    Lock lock1 = new ReentrantLock(),
         lock2 = new ReentrantLock();
    
    Runnable runnable1 = () -> {
      lock1.lock();
      System.out.println( "1. Thread: Lock auf lock1 bekommen" );
    
      try { TimeUnit.SECONDS.sleep( 1 ); } catch ( InterruptedException e ) { }
    
      lock2.lock();
      System.out.println( "1. Thread: Lock auf lock2 bekommen" );
    
      lock2.unlock();
      lock1.unlock();
    };
    
    Runnable runnable2 = () -> {
      lock2.lock();
      System.out.println( "2. Thread: Lock auf lock2 bekommen" );
    
      lock1.lock();
      System.out.println( "2. Thread: Lock auf lock1 bekommen" );
    
      lock1.unlock();
      lock2.unlock();
    };
    
    new Thread( runnable1 ).start();
    new Thread( runnable2 ).start();
  }
}