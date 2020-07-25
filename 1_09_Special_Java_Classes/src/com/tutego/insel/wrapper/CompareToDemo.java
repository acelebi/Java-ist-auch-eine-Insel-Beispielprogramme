package com.tutego.insel.wrapper;

public class CompareToDemo {
  
  public static void main( String[] args ) {
    System.out.println( Integer.compare(1, 2) );        // -1
    System.out.println( Integer.compare(1, 1) );        //  0
    System.out.println( Integer.compare(2, 1) );        //  1

    System.out.println( Double.compare(2.0, 2.1) );     // -1
    System.out.println( Double.compare(Double.NaN, 0) );// 1
    
    System.out.println( Boolean.compare(true, false) ); //  1
    System.out.println( Boolean.compare(false, true) ); // -1
  }
}