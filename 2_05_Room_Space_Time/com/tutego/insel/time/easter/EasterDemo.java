package com.tutego.insel.time.easter;

import java.time.*;

public class EasterDemo {
  public static void main( String[] args ) {
    String format = "%1$ta %1$tD%n";
    LocalDate date = Easter.easterSunday( Year.now().getValue() );
    System.out.printf( format, date );                          // z.b. So 04/20/14
    System.out.printf( format, Easter.easterSunday( 2012 ) );   // So 04/08/12
    System.out.printf( format, Easter.easterSunday( 2013 ) );   // So 03/31/13
  }
}
