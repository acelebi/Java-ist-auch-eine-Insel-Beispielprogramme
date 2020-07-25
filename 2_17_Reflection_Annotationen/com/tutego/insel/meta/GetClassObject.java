package com.tutego.insel.meta;

import java.util.Date;

public class GetClassObject {
  public static void main( String[] args ) {
    Class<Date> c1 = java.util.Date.class;
    System.out.println( c1 );        // class java.util.Date

    Class<? extends Date> c2 = new java.util.Date().getClass();
    System.out.println( c2 );        // class java.util.Date
    
    try {
      Class<?> c3 = Class.forName( "java.util.Date" );
      System.out.println( c3 );      // class java.util.Date
    }
    catch ( ClassNotFoundException e ) { e.printStackTrace(); }
  }
}