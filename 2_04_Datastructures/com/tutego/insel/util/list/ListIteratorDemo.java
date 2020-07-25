package com.tutego.insel.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
  public static void main( String[] args ) {
    List<String> list = new ArrayList<>();
    Collections.addAll( list, "b", "c", "d" );
    
    ListIterator<String> it = list.listIterator();
    
    it.add( "a" );                     // Vorne anfügen
    System.out.println( list );        // [a, b, c, d]
    
    it.next();                         // Position vor
    it.remove();                       // Element löschen
    System.out.println( list );        // [a, c, d]
    
    it.next();                         // Position vor
    it.set( "C" );                     // Element ersetzen
    System.out.println( list );        // [a, C, d]
    
    it = list.listIterator( 1 );       // Neuen Iterator mit Startpos. 1
    it.add( "B" );                     // B hinzufügen
    System.out.println( list );        // [a, B, C, d]
    
    it = list.listIterator( list.size() );
    
    it.previous();                     // Eine Stelle nach vorne
    it.remove();                       // Und letztes Element löschen
    System.out.println( list );        // [a, B, C]
  }
}