package com.tutego.insel.thread.concurrent;

import java.awt.Point;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ParallelPointInitSync {

  public static void main( String[] args ) {
    final Lock lock = new ReentrantLock();
    final Point p = new Point();

    Runnable r = new Runnable() {
      @Override
      public void run() {
        int x = (int) (Math.random() * 1000), y = x;

        while ( true ) {
          lock.lock();

          p.x = x;
          p.y = y;                   // *
          int xc = p.x, yc = p.y;    // *

          lock.unlock();

          if ( xc != yc )
            System.out.println( "Aha: x=" + xc + ", y=" + yc );
        }
      }
    };

    new Thread( r ).start();
    new Thread( r ).start();
  }
}