package com.tutego.insel.util.list;

import java.util.*;

public class HowDoesYourRouteLooksLike {
  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    List<String> cities = new ArrayList<>();

    while ( true ) {
      System.out.println( "Welche neue Stadt kommt hinzu?" );
      String newCity = new Scanner( System.in ).nextLine();
      cities.add( newCity );

      System.out.printf( "Wie sieht die gesamte Route aus? (Tipp: %d %s)%n",
                         cities.size(),
                         cities.size() == 1 ? "Stadt" : "Städte" ); 

      for ( String city : cities ) {
        String guess = new Scanner( System.in ).nextLine();
        if ( !city.equalsIgnoreCase( guess ) ) {
          System.out.printf( "%s ist nicht richtig, %s wäre korrekt. Schade!%n",
                             guess, city );
          return;
        }
      }
      System.out.println( "Prima, alle Städte in der richtigen Reihenfolge!" );
    }
  }
}