package com.tutego.insel.date;

import java.util.Calendar;

class Knuckles {

  public static void main( String[] args ) {
    Calendar cal = Calendar.getInstance();
    
    System.out.println( cal.getTime() );
    
    for ( int month = Calendar.JANUARY;
          month <= cal.getActualMaximum( Calendar.MONTH );
          month++ ) {
      cal.set( Calendar.MONTH, month );
    
      System.out.printf( "%d. Monat hat %d Tage%n",
                         month + 1,
                         cal.getActualMaximum(Calendar.DAY_OF_MONTH) );
    }
  }
}