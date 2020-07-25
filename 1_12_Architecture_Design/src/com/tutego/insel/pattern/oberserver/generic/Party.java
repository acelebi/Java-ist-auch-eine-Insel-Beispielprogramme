package com.tutego.insel.pattern.oberserver.generic;

public class Party {
  
  public static void main( String[] args ) {
    Observer<String> achim    = new JokeListener( "Achim" );
    Observer<String> michael  = new JokeListener( "Michael" );
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