package com.tutego.insel.date;

import static java.lang.System.out;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeInstance {

  public static void main( String[] args ) {
    Date d = new Date();

    DateFormat df;
    df = DateFormat.getDateTimeInstance( /* dateStyle */ DateFormat.FULL,
                                         /* timeStyle */ DateFormat.MEDIUM );
    out.println( df.format(d) ); // Montag, 18. Mai 2015 14:55:36
    
    df = DateFormat.getDateTimeInstance( DateFormat.FULL, DateFormat.MEDIUM, Locale.ITALY );
    out.println( df.format(d) ); // marted� 25 settembre 2007 17.28.03
    
    df = DateFormat.getDateTimeInstance( DateFormat.SHORT, DateFormat.FULL, Locale.CANADA_FRENCH );
    out.println( df.format(d) ); // 07-09-25 17 h 28 CEST
  }
}
