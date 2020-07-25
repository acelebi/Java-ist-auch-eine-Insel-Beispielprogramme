package com.tutego.insel.util;

import java.util.*;

public class CollectionsSortDemo {
  public static void main( String[] args ) {
    List<String> list = Arrays.asList( "Saskia", "Regina", "Angela", "Astrid", "Manuela", "Silke",
                                       "Linda", "Daniela", "Silvia", "Samah", "Radhia", "Mejda",
                                       "Tanja" );
    Collections.sort( list );
    System.out.println( list );
  }
}
