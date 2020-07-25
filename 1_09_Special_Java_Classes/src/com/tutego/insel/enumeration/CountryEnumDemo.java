package com.tutego.insel.enumeration;

public class CountryEnumDemo {

  public static void main( String[] args ) {
    System.out.println( Country.GERMANY.getISO3Country() );
    System.out.println( Country.CHINA.getISO3Country() );
    System.out.println( Country.UK.getISO3Country() );

    Country c = Country.GERMANY;

    switch ( c ) {
      case GERMANY:
        System.out.println( "Aha. Ein Krauti" );  // Aha. Ein Krauti
        System.out.println( c.getISO3Country() ); // DEU
        break;
      default:      System.out.println( "Anderes Land" );
    }
  }
}