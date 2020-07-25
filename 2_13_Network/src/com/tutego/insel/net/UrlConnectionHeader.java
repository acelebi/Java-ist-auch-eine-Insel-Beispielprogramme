package com.tutego.insel.net;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;

public class UrlConnectionHeader {
  public static void main( String[] args ) throws IOException {
    URL url = new URL( "http://www.tutego.com/index.html" );
    URLConnection con = url.openConnection();
    System.out.println( con );
    
    System.out.printf( "Date            : " + Instant.ofEpochMilli( con.getDate() ) );
    System.out.printf( "Last Modified   : " + Instant.ofEpochMilli( con.getLastModified() ) );
    System.out.printf( "Content encoding: " + con.getContentEncoding() );
    System.out.printf( "Content type    : " + con.getContentType() );
    System.out.printf( "Content length  : " + con.getContentLength() );
  }
}
