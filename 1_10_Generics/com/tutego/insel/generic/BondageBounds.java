package com.tutego.insel.generic;

public class BondageBounds {
  
  public static <T extends CharSequence> T random( T m, T n ) {
    return Math.random() > 0.5 ? m : n;
  }

  public static <T extends Comparable<T>> T max( T m, T n ) {
    return m.compareTo( n ) > 0 ? m : n;
  }

  public static void main( String[] args ) {
    String random = random( "Shinju", "Karada" );
    System.out.println( random );
    
    CharSequence random2 = random("Ushiro", new StringBuffer("Takatekote"));
    System.out.println( random2 );

    // System.out.println( random( "", new Point() ) );
    // Bound mismatch: The generic method random(T, T) of type BondageBounds is not applicable for the arguments (String, Point). The inferred type Serializable is not a valid substitute for the bounded parameter <T extends CharSequence>
    
    System.out.println( max( "Kino", "Lesen" ) );                    // Lesen
    System.out.println( max( 12, 100 ) );                            // 100
  }
}