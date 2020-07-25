package com.tutego.insel.util.queue;

import java.util.*;

public class ImportancePriorityQueue {
  public static void main( String[] args ) {
    ImportanceComparator comp = new ImportanceComparator();
    PriorityQueue<String> queue = new PriorityQueue<>( 11, comp );

    queue.add( "Schönes Wetter heute." );
    System.out.println( queue );
    // [Schönes Wetter heute.]
    queue.add( "Sofort nach den Blumen schauen!" );
    System.out.println( queue );
    // [Sofort nach den Blumen schauen!, Schönes Wetter heute.]
    queue.add( "Chices Kleid!" );
    System.out.println( queue );
    // [Sofort nach den Blumen schauen!, Schönes Wetter heute., Chices Kleid!]
    queue.remove();
    System.out.println( queue );
    // [Chices Kleid!, Schönes Wetter heute.]
    queue.add( "Wichtig! An Lakritz denken!" );
    System.out.println( queue );
    // [Wichtig! An Lakritz denken!, Schönes Wetter heute., Chices Kleid!]
  }
}