package com.tutego.insel.util;

import java.util.*;

public class BestCard {
  
  enum Cards { ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }

  public static void main( String[] args ) {
    // Initialisiere Kartenspiel, beginne mit 14 Karten
    List<Cards> cards = new ArrayList<>( EnumSet.allOf( Cards.class ) );

    // Verdopple zweimal die Karten auf insgesamt 56
    cards.addAll( cards );
    cards.addAll( cards );

    // Vermische Karten
    Collections.shuffle( cards );
    
    // Der erste Spieler bekommt die ersten 10 Karten
    List<Cards> player1 = new ArrayList<>( cards.subList( 0, 10 ) );

    // Der zweite Spieler bekommt die nächsten 10 Karten
    List<Cards> player2 = new ArrayList<>( cards.subList( 11, 20 ) );

    // Größte Karte suchen, also die Karte mit der größten Ordinalzahl
    System.out.printf( "Spieler 1: %s%nSpieler 2: %s%n", player1, player2 );
    Cards bestCardPlayer1 = Collections.max( player1 );
    Cards bestCardPlayer2 = Collections.max( player2 );
    System.out.println( "Beste Karte Spieler 1: " + bestCardPlayer1 );
    System.out.println( "Beste Karte Spieler 2: " + bestCardPlayer2 );

    // Enums implementieren Comparable. Ausgeben, wer die beste Karte hat
    int winner = bestCardPlayer1.compareTo( bestCardPlayer2 );
    if ( winner > 0 )
      System.out.println( "Spieler 1 gewinnt" );
    else if ( winner < 0 )
      System.out.println( "Spieler 2 gewinnt" );
    else
      System.out.println( "Beide Spieler gewinnen" );
  }
}