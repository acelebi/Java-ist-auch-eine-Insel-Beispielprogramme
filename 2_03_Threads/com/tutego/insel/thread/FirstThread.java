package com.tutego.insel.thread;

public class FirstThread {
  public static void main( String[] args ) {
    Thread t1 = new Thread( new DateCommand() );
    t1.start();

    // new DateThreadAutoStart();
    //
    // Thread t = new DateThread();
    // t.start();

    Thread t2 = new Thread( new CounterCommand() );
    t2.start();
  }
}
