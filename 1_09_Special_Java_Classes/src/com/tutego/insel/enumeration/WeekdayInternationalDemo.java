package com.tutego.insel.enumeration;

import java.util.Locale;

public class WeekdayInternationalDemo {
  
  public static void main( String[] args ) {
    System.out.println( WeekdayInternational.SATURDAY );                         // Samstag
    System.out.println( WeekdayInternational.SATURDAY.toString() );              // Samstag
    System.out.println( WeekdayInternational.SATURDAY.toString(Locale.FRANCE) ); // samedi
    System.out.println( WeekdayInternational.SATURDAY.toString(Locale.ITALY) );  // sabato
  }
}