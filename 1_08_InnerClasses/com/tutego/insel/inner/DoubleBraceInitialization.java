package com.tutego.insel.inner;

import java.time.LocalTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.*;

public class DoubleBraceInitialization {
  public static void main( String[] args ) {

    String s = new DateTimeFormatterBuilder()
        .appendText( ChronoField.AMPM_OF_DAY,
                     new HashMap<Long, String>() {{ put( 0L, "früh" ); put( 1L, "spät" ); }} )
        .toFormatter().format( LocalTime.now() );
    System.out.println( s );

    Map<String,Object> map = new HashMap<String,Object>() {{
      put( "name", "Chris" );
      put( "address", new HashMap<String,Object>() {{
        put( "street", "Feenallee 1" );
        put( "city", "Elefenberg" );
      }} );
    }};
    System.out.println( map );
  }
}
