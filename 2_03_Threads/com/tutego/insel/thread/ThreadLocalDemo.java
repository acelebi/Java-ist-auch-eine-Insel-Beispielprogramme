package com.tutego.insel.thread;

public class ThreadLocalDemo {

  public static void main( String[] args ) {
    Runnable runnable = new SimpleRunnable();
    new Thread( runnable ).start();
    new Thread( runnable ).start();
    runnable.run();
  }
}

class SimpleRunnable implements Runnable {

  private static final ThreadLocal<Integer> mem = new ThreadLocal<Integer>() {
    @Override protected Integer initialValue() {
      return 1;
    }
  };

  @Override
  public void run() {
    while ( true ) {
      System.out.println( Thread.currentThread().getName() + ", " + mem.get() );
      mem.set( mem.get() + 1 );
    }
  }
}
