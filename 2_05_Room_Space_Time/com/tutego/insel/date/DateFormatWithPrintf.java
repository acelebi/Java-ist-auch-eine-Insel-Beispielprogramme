package com.tutego.insel.date;

import java.util.Calendar;
import java.util.Locale;

public class DateFormatWithPrintf {

  public static void main( String[] args ) {
    Calendar cal = Calendar.getInstance();
    
    System.out.printf( "%tR%n", cal );                 // 06:17
    System.out.printf( "%tT%n", cal );                 // 06:17:05
    System.out.printf( "%tD%n", cal );                 // 09/25/07
    System.out.printf( "%tF%n", cal );                 // 2007-09-25
    
    System.out.printf( Locale.CHINA, "%tD%n", cal );   // 09/25/07 (!)
    System.out.printf( Locale.GERMANY, "%tD%n", cal ); // 09/25/07 (!)
  }
}