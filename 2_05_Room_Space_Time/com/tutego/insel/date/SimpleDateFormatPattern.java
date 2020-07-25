package com.tutego.insel.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatPattern
{
  public static void main( String[] args )
  {
    DateFormat dfmt = new SimpleDateFormat( "E.', den' dd.MM.yy 'um' hh:mm:ss" );
    System.out.println( dfmt.format(new Date()) );   // Mi., den 21.03.07 um 09:14:20
    
    SimpleDateFormat sdfmt = new SimpleDateFormat();
    sdfmt.applyPattern( "EEEE', 'dd. MMMM yyyy hh:mm" );
    System.out.println( sdfmt.format(new Date()) ); // Mittwoch, 21. März 2007 09:14 
  }
}
