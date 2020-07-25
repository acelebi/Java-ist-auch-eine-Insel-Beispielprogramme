package com.tutego.insel.assertion;

public class AssertKeyword {

  public static double subAndSqrt( double a, double b ) {
    double result = Math.sqrt( a - b );

    assert ! Double.isNaN( result ) : "Berechnungsergebnis ist NaN!";

    return result;
  }

  public static void main( String[] args ) {
    System.out.println( "Sqrt(10-2)=" + subAndSqrt(10, 2) );
    System.out.println( "Sqrt(2-10)=" + subAndSqrt(2, 10) );
  }
}