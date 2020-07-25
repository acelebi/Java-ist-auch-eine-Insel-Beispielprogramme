package com.tutego.insel.thread.concurrent;

import java.util.concurrent.*;

class MaxElementInArrayFinder {

  private static final ForkJoinPool fjPool = new ForkJoinPool();

  private static class MaxElemTask extends RecursiveTask<Integer> {
    private final int[] array;
    private final int start, end;

    MaxElemTask( int[] array, int start, int end ) {
      assert array != null && start >= 0 && start <= end;

      this.array = array;
      this.start = start;
      this.end = end;
    }

    @Override
    protected Integer compute() {
      assert array != null && array.length > 0;

      System.out.printf( "max( start=%d, end=%d )%n", start, end );

      if ( end - start < 4 ) {
        int max = array[ start ];
        for ( int i = start + 1; i <= end; i++ )
          if ( array[ i ] > max )
            max = array[ i ];

        return max;
      }

      int middle = (start + end) / 2;

      MaxElemTask leftTask = new MaxElemTask( array, start, middle );
      leftTask.fork();

      MaxElemTask rightTask = new MaxElemTask( array, middle + 1, end );

      int rightMax = rightTask.compute();
      int leftMax = leftTask.join();

      return Math.max( rightMax, leftMax );
    }
  }

  public static int findMax( int[] array ) {
    return fjPool.invoke( new MaxElemTask( array, 0, array.length - 1 ) );
  }
}

public class ForkJoinPoolDemo {

  public static void main( String[] args ) {
    int[] array = {
        0, 9, 10, 111, 1, 12, 13, 14, 17
    };

    System.out.println( MaxElementInArrayFinder.findMax( array ) );
  }
}