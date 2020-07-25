package com.tutego.insel.date;

import java.util.Calendar;

public class CalendarDemo {

  public static void main( String[] args ) {
    Calendar cal = Calendar.getInstance();
    printCalendar( cal );

    cal.set( Calendar.DATE, 12 );
    cal.set( Calendar.MONTH, Calendar.MARCH );
    cal.set( Calendar.YEAR, 1973 );
    printCalendar( cal );
  }

  private static final String[] DAYS = { "Sonntag", "Montag", "Dienstag",
                                         "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

  public static void printCalendar( Calendar cal ) {
    String dayOfWeek = DAYS[ cal.get(Calendar.DAY_OF_WEEK) - 1 ];  // Sonntag = 1

    System.out.printf( "%s, %s.%s.%s, %02d:%02d:%02d und %d ms%n",
                       dayOfWeek, 
                       cal.get(Calendar.DATE), 
                       cal.get(Calendar.MONTH) + 1,
                       cal.get(Calendar.YEAR),
                       cal.get(Calendar.HOUR_OF_DAY),
                       cal.get(Calendar.MINUTE),
                       cal.get(Calendar.SECOND),
                       cal.get(Calendar.MILLISECOND));

    System.out.printf( "Es ist die %d. Woche im Jahr und %d. Woche im Monat%n",
                       cal.get(Calendar.WEEK_OF_YEAR),
                       cal.get(Calendar.WEEK_OF_MONTH) );
  }
}