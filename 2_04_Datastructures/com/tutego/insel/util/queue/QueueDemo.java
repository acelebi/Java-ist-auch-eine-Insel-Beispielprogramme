package com.tutego.insel.util.queue;

import java.util.*;

public class QueueDemo {
  public static void main( String[] args ) {
    Queue<String> queue = new LinkedList<>();
    queue.offer( "Fischers" );
    queue.offer( "Fritze" );
    queue.offer( "fischt" );
    queue.offer( "frische" );
    queue.offer( "Fische" );

    queue.poll();

    queue.offer( "Nein, es war Paul!" );

    while ( !queue.isEmpty() )
      System.out.println( queue.poll() );
  }
}
