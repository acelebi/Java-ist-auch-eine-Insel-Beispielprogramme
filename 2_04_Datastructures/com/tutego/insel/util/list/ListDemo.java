package com.tutego.insel.util.list;

import java.util.*;

public class ListDemo {
  public static void main( String[] args ) {
    List<String> list1 = new ArrayList<>();
    list1.add( "Eva" );
    list1.add( 0, "Charisma" );
    list1.add( "Pallas" );

    List<String> list2 = Arrays.asList( "Tina", "Wilhelmine" );
    list1.addAll( 3, list2 );
    list1.add( "XXX" );
    list1.set( 5, "Eva" );
    
    System.out.println( list1 );        // [Charisma, Eva, Pallas, Tina, Wilhelmine, Eva]
    System.out.println( list1.size() ); // 6

    //
    
    boolean b = list1.contains( "Tina" );
    System.out.println( b );            // true
    
    b = list1.containsAll( Arrays.asList( "Tina", "Eva" ) );
    System.out.println( b );            // true
    
    Object o = list1.get( 1 );
    System.out.println( o );            // Eva
    
    int i = list1.indexOf( "Eva" );
    System.out.println( i );            // 1
    
    i = list1.lastIndexOf( "Eva" );
    System.out.println( i );            // 5
    
    System.out.println( list1.isEmpty() ); // false

    //

    String[] array = list1.toArray( new String[list1.size()] );
    System.out.println( array[3] );     // "Tina"

    List<String> list3 = new LinkedList<>( list1 );
    System.out.println( list3 );        // [Charisma, Eva, Pallas, Tina, Wilhelmine, Eva]
    
    list3.retainAll( Arrays.asList( "Tina", "Eva" ) );
    System.out.println( list3 );        // [Eva, Tina, Eva]

    //
    
    System.out.println( list1 );     // [Charisma, Eva, Pallas, Tina, Wilhelmine, Eva]
    list1.remove( 1 );
    System.out.println( list1 );     // [Charisma, Pallas, Tina, Wilhelmine, Eva]
    
    list1.remove( "Wilhelmine" );
    System.out.println( list1 );     // [Charisma, Pallas, Tina, Eva]
    
    list1.removeAll( Arrays.asList( "Pallas", "Eva" ) );
    System.out.println( list1 );     // [Charisma, Tina]
    
    list1.clear();
    System.out.println( list1 );     // []
  }
}