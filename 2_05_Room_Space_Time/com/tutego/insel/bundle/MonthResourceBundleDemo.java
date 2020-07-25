package com.tutego.insel.bundle;

import java.util.*;

public class MonthResourceBundleDemo {
  public static void main( String[] args ) {
    ResourceBundle bundle = ResourceBundle.getBundle( "com.tutego.insel.bundle.MonthResourceBundle" );
    System.out.println( bundle.getString( "jan" ) ); // Jan
    System.out.println( Arrays.toString( bundle.getStringArray( "month" ) ) ); // [Jan, Feb, ...
    System.out.println( Collections.list( bundle.getKeys() ) ); // [month, jan]
  }
}