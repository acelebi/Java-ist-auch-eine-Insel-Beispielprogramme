package com.tutego.insel.net;

import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoderDemo {
  public static void main( String[] args ) {
    try {
      PrintStream o = System.out;
      String utf = StandardCharsets.UTF_8.name();
      o.println( URLEncoder.encode( "L e e r z eichen", utf ) ); // L+e+e+r+z+eichen
      o.println( URLEncoder.encode( "20%Prozent%", utf ) ); // 20%25Prozent%25
      o.println( URLEncoder.encode( "hat+ein+Plus", utf ) ); // hat%2Bein%2BPlus
      o.println( URLEncoder.encode( "/temp/data/", utf ) ); // %2Ftemp%2Fdata%2F
      o.println( URLEncoder.encode( "Sagt \"Gänse\"", utf ) ); // Sagt+%22G%C3%A4nse%22
      o.println( URLEncoder.encode( ":Doppelpunkt:", utf ) ); // %3ADoppelpunkt%3A
      o.println( URLEncoder.encode( "a=b=c", utf ) ); // a%3Db%3Dc
      o.println( URLEncoder.encode( "Und&Co", utf ) ); // Und%26Co
      o.println( URLEncoder.encode( "..Punkte..", utf ) ); // ..Punkte..
    }
    catch ( UnsupportedEncodingException e ) {
      e.printStackTrace();
    }
  }
}
