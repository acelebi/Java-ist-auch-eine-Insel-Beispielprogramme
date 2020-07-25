package com.tutego.insel.util.set;

import java.text.BreakIterator;
import java.util.*;

public class WhereHaveYouBeen {
  public static String join( Iterable<?> iterable ) {
    StringBuilder result = new StringBuilder();
    for ( Object o : iterable ) {
      if ( result.length() != 0 )
        result.append( ", " );
      result.append( o.toString() );
    }
    return result.toString();
  }

  public static void main( String[] args ) {
    // Menge mit Städten aufbauen
    
    Set<String> allCities = new HashSet<>();
    allCities.add( "Sonsbeck" );
    allCities.add( "Düsseldorf" );
    allCities.add( "Manila" );
    allCities.add( "Seol" );
    allCities.add( "Siquijor" );

    // Menge für besuchte Städte aufbauen

    Set<String> visitedCities = new TreeSet<>();

    // Satz parsen und in Wörter zerlegen. Alle gefundenen Städte
    // in neue Datenstruktur aufnehmen
    
    String sentence = "Von Sonsbeck fahre ich nach Düsseldorf und fliege nach Manila.";
    BreakIterator iter = BreakIterator.getWordInstance();
    iter.setText( sentence );

    for ( int first = iter.first(), last = iter.next();
          last != BreakIterator.DONE;
          first = last, last = iter.next() ) {
      String word = sentence.substring( first, last );
      if ( allCities.contains( word ) )
        visitedCities.add( word );
    }

    // Kleine Statistik

    System.out.println( "Anzahl besuchter Städte: " + visitedCities.size() );
    System.out.println( "Anzahl nicht besuchter Städte: " +
                        (allCities.size() - visitedCities.size()) );
    System.out.println( "Besuchte Städte: " + join( visitedCities ) );
    Set<String> unvisitedCities = new TreeSet<>( allCities );
    unvisitedCities.removeAll( visitedCities );
    System.out.println( "Unbesuchte Städte: " + join( unvisitedCities ) );
  }
}