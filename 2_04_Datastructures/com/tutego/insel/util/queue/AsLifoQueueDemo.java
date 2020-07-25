package com.tutego.insel.util.queue;

import java.util.*;

public class AsLifoQueueDemo {
  public static void main( String[] args ) {
    Queue<String> stack = Collections.asLifoQueue( new LinkedList<String>() );
    stack.add( "Tanja" );
    stack.add( "Tina" );
    stack.addAll( Arrays.asList( "Morris", "Krissy" ) );
    while ( ! stack.isEmpty() )
      System.out.println( stack.remove() ); // Krissy Morris Tina Tanja
  }
}
