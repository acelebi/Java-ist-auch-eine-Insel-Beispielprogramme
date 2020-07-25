package com.tutego.insel.thread.concurrent;

import java.util.*;
import java.util.concurrent.*;

public class CallableGetDemo {

  public static void main( String[] args ) {
    byte[] bytes = new byte[4000000];
    new Random().nextBytes( bytes );
    Callable<byte[]> c = new SorterCallable( bytes );

    ExecutorService executor = Executors.newCachedThreadPool();

    Future<byte[]> result = executor.submit( c );

    System.out.println( result.isDone() );

    try {
      byte[] bs = result.get();
      System.out.printf( "%d, %d, %d%n", bs[ 0 ], bs[ 1 ], bs[ bs.length - 1 ] ); // -128, -128, 127
    }
    catch ( InterruptedException | ExecutionException e ) {
      e.printStackTrace();
    }

    System.out.println( result.isDone() );

    executor.shutdown();
  }
}