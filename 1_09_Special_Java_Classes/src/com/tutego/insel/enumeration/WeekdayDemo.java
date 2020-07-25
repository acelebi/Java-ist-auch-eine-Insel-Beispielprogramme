package com.tutego.insel.enumeration;

public class WeekdayDemo {
  
  public static void main( String[] args ) {
    for ( Weekday d : Weekday.values() )       // oder Weekday.class.getEnumConstants() 
      System.out.println( "Name=" + d.name() );

    //

    System.out.println( Weekday.FRIDAY );                 // FRIDAY

    //

    System.out.println( getOrdinal( "MONDAY" ) );
    System.out.println( getOrdinal( "FEIERTAG" ) );
  }
  
  static int getOrdinal( String name ) {
    try {
      return Weekday.valueOf( name ).ordinal();
    }
    catch ( IllegalArgumentException e ) {
      return -1;
    }
  }
}