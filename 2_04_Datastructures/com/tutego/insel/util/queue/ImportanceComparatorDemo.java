package com.tutego.insel.util.queue;

import java.util.*;

public class ImportanceComparatorDemo {
  public static void main( String[] args ) {
    ImportanceComparator comp = new ImportanceComparator();
    
    String s1 = "Schönes Wetter heute.";
    String s2 = "Chices Kleid!";
    
    // Beides nicht wichtig, daher ist das Ergebnis 0
    System.out.println( comp.compare( s1, s2 ) );      // 0
    
    String s3 = "Sofort nach den Blumen schauen!";
    
    // Zweiter String wichtiger als der erste String
    System.out.println( comp.compare( s1, s3 ) );      // 1
    
    // Erster String wichtiger als der zweite String
    System.out.println( comp.compare( s3, s1 ) );      // -1
    
    String s4 = "Wichtig! An Lakritz denken!";
    
    // Beide Strings gleich wichtig
    System.out.println( comp.compare( s3, s4 ) );      // 0
    
    List<String> list = new ArrayList<>();
    Collections.addAll( list, s1, s2, s3, s4, s1 );
    System.out.println( list );
    Collections.sort( list, comp );
    System.out.println( list );
  }
}