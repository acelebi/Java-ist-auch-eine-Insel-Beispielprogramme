package com.tutego.insel.net;

import java.net.MalformedURLException;
import java.net.URL;

class ParseURL {
  public static void main( String[] args ) {
    try {
      URL url = new URL( "http://www.tutego.com:80/java/faq.html?key=val#Lang" );
      
      System.out.println( url.getProtocol() );  // http
      System.out.println( url.getHost() );      // www.tutego.com
      System.out.println( url.getPort() );      // 80
      System.out.println( url.getFile() );      // /java/faq.html?key=val
      System.out.println( url.getPath() );      // /java/faq.html
      System.out.println( url.getQuery() );     // key=val
      System.out.println( url.getRef() );       // Lang
    }
    catch ( MalformedURLException e ) {
      e.printStackTrace();
    }
  }
}
