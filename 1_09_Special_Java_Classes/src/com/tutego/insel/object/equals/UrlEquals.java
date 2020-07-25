package com.tutego.insel.object.equals;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlEquals {
  public static void main( String[] args ) throws MalformedURLException {
    URL url1 = new URL( "http://tutego.com/" );
    URL url2 = new URL( "http://www.tutego.com/" );
    System.out.println( url1.equals( url2 ) ); // true
  }
}
