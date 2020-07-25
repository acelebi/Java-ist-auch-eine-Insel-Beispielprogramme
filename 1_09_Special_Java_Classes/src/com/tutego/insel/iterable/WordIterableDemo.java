package com.tutego.insel.iterable;

public class WordIterableDemo {
  
  public static void main( String[] args ) {
    String s = "Am Anfang war das Wort, am Ende die Phrase. (Stanislaw Jerzy Lec)";

    for ( String word : new WordIterable(s) )
      System.out.println( word );
  }
}
