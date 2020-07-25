package com.tutego.insel.thread.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ArraySummer {

  public static void main( String[] args ) {
    int[] array = new int[1000];

    Random r = new Random();
    for ( int i = 0; i < array.length; i++ )
      array[ i ] = Math.abs( r.nextInt() / 2 );

    parallSummer( array );
  }

  public static void parallSummer( int[] array ) {
    int prozessors = 2; // Runtime.getRuntime().availableProcessors();

    final List<Long> longs = new ArrayList<>();

    Runnable merger = new Runnable() {
      @Override
      public void run() {
        long sum = 0;
        for ( long i : longs )
          sum += i;
        System.out.println( sum );
      }
    };

    CyclicBarrier barrier = new CyclicBarrier( prozessors, merger );

    for ( int part = 0; part < prozessors; part++ )
      new Thread( new AtomarSummer( barrier, array, prozessors, part, longs ) ).start();
  }
}

class AtomarSummer implements Runnable {
  
  private final CyclicBarrier barrier;
  private final int[] array;
  private final List<Long> longs;
  private int start, end;

  public AtomarSummer( CyclicBarrier barrier, int[] array, int maxPart, int currentPart,
                       List<Long> longs ) {
    this.barrier = barrier;
    this.array = array;
    this.longs = longs;

    start = (int) ((double) array.length / maxPart * currentPart);
    end = (int) ((double) array.length / maxPart * (currentPart + 1) - 1);
  }

  @Override
  public void run() {
    long sum = 0;

    for ( int i = start; i < end; i++ )
      sum += array[ i ];

    longs.add( sum );

    try {
      barrier.await();
    }
    catch ( InterruptedException | BrokenBarrierException e ) {
      e.printStackTrace();
    }
  }
}