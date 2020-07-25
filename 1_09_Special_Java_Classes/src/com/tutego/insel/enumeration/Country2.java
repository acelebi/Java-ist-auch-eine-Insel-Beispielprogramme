package com.tutego.insel.enumeration;

public enum Country2 {

  GERMANY( "DEU" ), UK( "GBR" ), CHINA( "CHN" );

  String iso3Country;

  Country2( String iso3Country ) {
    this.iso3Country = iso3Country;
  }

  public String getISO3Country() {
    return iso3Country;
  }
}