package com.tutego.insel.enumeration;

public enum Country {

  GERMANY, UK, CHINA;

  public String getISO3Country() {
    if ( this == GERMANY )
      return "DEU";
    else if ( this == UK )
      return "GBR";
    return "CHN";
  }
}