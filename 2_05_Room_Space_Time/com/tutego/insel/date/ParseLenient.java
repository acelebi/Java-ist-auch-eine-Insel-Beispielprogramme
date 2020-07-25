package com.tutego.insel.date;

import java.text.*;

public class ParseLenient {

  public static void main( String[] args ) {
    try {
      DateFormat formatter1 = new SimpleDateFormat( "dd-MM-yyyy" );
      System.out.printf( "%tF%n", formatter1.parse( "29-02-2008" ) ); // 2008-02-29
      System.out.printf( "%tF%n", formatter1.parse( "29-02-2007" ) ); // 2007-03-01
      System.out.printf( "%tF%n", formatter1.parse( "33-02-2008" ) ); // 2008-03-04
    
      formatter1.setLenient( false );
      System.out.println( formatter1.parse( "29-02-2007" ) );  //  ☠
    }
    catch ( ParseException e ) {
      e.printStackTrace();
    }
  }
}
