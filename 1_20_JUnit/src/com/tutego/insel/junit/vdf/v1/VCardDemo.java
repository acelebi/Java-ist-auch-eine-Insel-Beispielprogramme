package com.tutego.insel.junit.vdf.v1;

import java.io.IOException;

public class VCardDemo {

  public static void main( String[] args ) throws IOException {
    VCard vCard = new VCard();
    vCard.formattedName = "Mr. Fischzerleger";
    vCard.email = "info@fischzerleger.de";
    vCard.export( "fischzerleger.vcard" );
  }
}
