package com.tutego.insel.ws;

import com.tutego.insel.ws.gen.chrisws.*;
import com.tutego.insel.ws.gen.geoipservice.*;

public class ClientForGeneratedStubs {
  public static void main( String[] args ) {
    GeoIPServiceSoap ipService = new GeoIPService().getGeoIPServiceSoap();
    GeoIP geoIP = ipService.getGeoIP( "193.99.144.85" );
    System.out.println( "IP-Adresse kommt aus " +
                        geoIP.getCountryCode()  ); // IP-Adresse kommt aus DEU

    ChrisWebServices port = new MyWebServicesService().getChrisWebServicesPort();
    System.out.printf( "%s Dein BMI ist %.1f%n",
                       port.hello( "Chris" ),
                       port.bodyMassIndex( 183, 84 ) );
  }
}
