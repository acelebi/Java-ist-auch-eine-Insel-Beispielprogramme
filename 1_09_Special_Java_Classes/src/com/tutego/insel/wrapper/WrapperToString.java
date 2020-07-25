package com.tutego.insel.wrapper;

public class WrapperToString {
  
  public static void main( String[] args ) {
    String s1 = Integer.toString( 1234567891 ),
           s2 = Long.toString( 123456789123L ),
           s3 = Float.toString( 12.345678912f ),
           s4 = Double.toString( 12.345678912 ),
           s5 = Boolean.toString( true );

    System.out.println( s1 );  // 1234567891
    System.out.println( s2 );  // 123456789123
    System.out.println( s3 );  // 12.345679
    System.out.println( s4 );  // 12.345678912
    System.out.println( s5 );  // true
  }
}