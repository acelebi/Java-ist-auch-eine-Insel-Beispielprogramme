import java.util.*;
import java.text.*;

class CollatorStrengthDemo {

  static void compare( Collator col, String a, String b ) {
    if ( col.compare( a, b ) < 0 )
      System.out.println( a + " < " + b );

    if ( col.compare( a, b ) == 0 )
      System.out.println( a + " = " + b );

    if ( col.compare( a, b ) > 0 )
      System.out.println( a + " > " + b );
  }

  public static void main( String[] args ) {
    Collator col = Collator.getInstance( Locale.GERMAN );

    System.out.println( "Strength = PRIMARY" );
    col.setStrength( Collator.PRIMARY );
    compare( col, "abc", "ABC" );
    compare( col, "Quäken", "Quaken" );
    compare( col, "boß", "boss" );
    compare( col, "boß", "boxen" );

    System.out.printf( "%nStrength =  SECONDARY%n" );
    col.setStrength( Collator.SECONDARY );
    compare( col, "abc", "ABC" );
    compare( col, "Quäken", "Quaken" );
    compare( col, "boß", "boss" );
    compare( col, "boß", "boxen" );

    System.out.printf( "%nStrength =  TERTIARY%n" );
    col.setStrength( Collator.TERTIARY );
    compare( col, "abc", "ABC" );
    compare( col, "Quäken", "Quaken" );
    compare( col, "boß", "boss" );
    compare( col, "boß", "boxen" );
  }
}