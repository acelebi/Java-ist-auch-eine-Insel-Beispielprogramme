package com.tutego.insel.util.queue;

import java.util.*;

public class PriorityQueueDemo {
  public static void main( String[] args ) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    q.addAll( Arrays.asList( 9, 2, 3, 1, 3, 8, 1 ) );
    System.out.println( q );            // [1, 2, 1, 9, 3, 8, 3]
    System.out.println( q.remove() ) ;  // 1
    System.out.println( q );            // [1, 2, 3, 9, 3, 8]
    System.out.println( q.remove() ) ;  // 1
    System.out.println( q );            // [2, 3, 3, 9, 8]
    System.out.println( q.remove() ) ;  // 2
    System.out.println( q );            // [3, 8, 3, 9]
    System.out.println( q.remove() ) ;  // 3
    System.out.println( q.remove() ) ;  // 3
    System.out.println( q.remove() ) ;  // 8
    System.out.println( q );            // [9]
    System.out.println( q.remove() ) ;  // 9
    System.out.println( q );            // []
  }
}