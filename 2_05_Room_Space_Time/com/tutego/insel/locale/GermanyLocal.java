package com.tutego.insel.locale;

import static java.util.Locale.GERMANY;
import static java.lang.System.out;

public class GermanyLocal {

  public static void main( String[] args ) {
    out.println( GERMANY.getCountry() );        // DE
    out.println( GERMANY.getLanguage() );       // de
    out.println( GERMANY.getVariant() );        //
    out.println( GERMANY.getDisplayCountry() ); // Deutschland
    out.println( GERMANY.getDisplayLanguage() );// Deutsch
    out.println( GERMANY.getDisplayName()  );   // Deutsch (Deutschland)
    out.println( GERMANY.getDisplayVariant() ); //  
    out.println( GERMANY.getISO3Country() );    // DEU
    out.println( GERMANY.getISO3Language() );   // deu
  }
}
