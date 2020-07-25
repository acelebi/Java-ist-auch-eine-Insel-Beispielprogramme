package com.tutego.insel.date;

import java.util.*;
import java.text.*;

public class FormatAndParseDate {

  public static void main( String[] args ) {
    try {
      DateFormat formatter = DateFormat.getDateTimeInstance();
    
      Date d  = formatter.parse( "24.12.2007 16:59:12" );
      System.out.println( d );                  // Mon Dec 24 16:59:12 CET 2007
    
      String s = formatter.format( new Date() );
      System.out.println( formatter.parse(s) ); // Wed Mar 21 21:29:02 CET 2007
    }
    catch ( ParseException e ) { e.printStackTrace(); }
  }
}
