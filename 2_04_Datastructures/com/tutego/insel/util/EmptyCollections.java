package com.tutego.insel.util;

import java.util.*;

public class EmptyCollections {
  public static List<String> words( String sentence ) {
    if ( sentence == null || sentence.trim().isEmpty() )
      return Collections.emptyList();
//       return new ArrayList<>( 0 );

    return Collections.unmodifiableList( Arrays.asList( sentence.split( "[^\\wäöüÄÖÜß]+" ) ) ); 
  }

  public static void main( String[] args ) {
    System.out.println( words( "Du bist,  was du programmierst! !" ) ); // [Du, bist, was, du, programmierst]
    System.out.println( words( " \n   \t" ) );                          // []
    System.out.println( words( null ) );                                // []

    for ( String word : words("The Eagle has landed.") )
      System.out.println( word );
    
    //    Scanner in = new Scanner( "" );
    //    List<List<String>> allLines = new ArrayList<>();
    //    while ( in.hasNextLine() )
    //      allLines.add( words(in.nextLine()) );
  }
}
