package com.tutego.insel.thread;

public class InheritableThreadLocalDemo {
  public static void main( String[] args ) {
    new InheritingThread().start();
  }
}

class InheritingThread extends Thread {
  // private static final ThreadLocal<String> mem = new ThreadLocal<>();
  private static final InheritableThreadLocal<String> mem = new InheritableThreadLocal<>();

  @Override
  public void run() {
    System.out.println( Thread.currentThread() + " bekommt " + mem.get() );
    mem.set( Thread.currentThread().getName() );

    new InheritingThread().start();
  }
}
