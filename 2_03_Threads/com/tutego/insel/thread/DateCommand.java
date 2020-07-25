package com.tutego.insel.thread;

public class DateCommand implements Runnable {
  @Override public void run() {
    for ( int i = 0; i < 20; i++ )
      System.out.println( java.time.LocalDate.now() );
  }
}
