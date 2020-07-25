package com.tutego.insel.thread.concurrent;

import java.awt.Point;

public class ParallelPointInit {

  public static void main( String[] args ) {
    final Point p = new Point();

    Runnable r = new Runnable() {
      @Override public void run() {
        int x = (int) (Math.random() * 1000), y = x;

        while ( true ) {
          p.x = x;
          p.y = y;                   // *

          int xc = p.x, yc = p.y;    // *

          if ( xc != yc )
            System.out.println( "Aha: x=" + xc + ", y=" + yc );
        }
      }
    };

    new Thread( r ).start();
    new Thread( r ).start();
  }
}