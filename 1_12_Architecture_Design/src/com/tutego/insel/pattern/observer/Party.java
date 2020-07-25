package com.tutego.insel.pattern.observer;

import java.util.Observer;

public class Party {
  
  public static void main( String[] args ) {
    Observer achim    = new JokeListener( "Achim" );
    Observer michael  = new JokeListener( "Michael" );
    JokeTeller chris  = new JokeTeller();

    chris.addObserver( achim );

    chris.tellJoke();
    chris.tellJoke();

    chris.addObserver( michael );

    chris.tellJoke();

    chris.deleteObserver( achim );

    chris.tellJoke();
  }
}