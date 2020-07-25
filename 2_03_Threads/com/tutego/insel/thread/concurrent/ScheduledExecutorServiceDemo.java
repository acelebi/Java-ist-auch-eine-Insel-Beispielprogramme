package com.tutego.insel.thread.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

  public static void main( String[] args ) {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool( 1 );
    
    scheduler.scheduleAtFixedRate(
        new Runnable() {
          @Override public void run() {
            System.out.println( "Tata" );
          }
        },
        1 /* initial delay */,
        2 /* period */,
        TimeUnit.SECONDS );
  }
}