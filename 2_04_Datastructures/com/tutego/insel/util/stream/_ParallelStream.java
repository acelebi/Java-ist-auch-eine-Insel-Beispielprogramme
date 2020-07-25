package com.tutego.insel.util.stream;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import java.util.function.*;
import java.util.stream.*;

public class _ParallelStream {

  public static void main( String[] args ) {

    Supplier<Long> count1 = () -> IntStream.range( 1, 1_000_000 )
        .filter( n -> BigInteger.valueOf( n ).isProbablePrime( 100 ) )
        .count();

    Supplier<Long> count2 = () -> IntStream.range( 1, 1_000_000 )
        .parallel()
        .filter( n -> BigInteger.valueOf( n ).isProbablePrime( 100 ) )
        .count();

    Function<Supplier<Long>, Long> timer = producer -> {
      long start = System.nanoTime();
      long result = producer.get();
      System.out.println( TimeUnit.NANOSECONDS.toSeconds( System.nanoTime() - start ) + " sec" );
      return result;
    };

    // 78498 Primzahlen zwischen 0 und 1 Millionen
    System.out.println( timer.apply( count1 ) ); // 78498 
    System.out.println( timer.apply( count2 ) ); // 78498 
    System.out.println( timer.apply( count2 ) ); // 78498 
    System.out.println( timer.apply( count1 ) ); // 78498 
  }
}

/*
 * // Where are the threads? A parallel stream is split into tasks
        // which are executed by the "common fork-join thread pool," new in
        // Java SE 8. See java.util.concurrent.ForkJoinPool.
         * 
12 sec
78498
6 sec
78498
6 sec
78498
12 sec
78498
*/