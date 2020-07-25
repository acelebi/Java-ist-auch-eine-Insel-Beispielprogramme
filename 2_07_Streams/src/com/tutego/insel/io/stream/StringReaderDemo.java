package com.tutego.insel.io.stream;

import java.io.*;

class StringReaderDemo {
  @SuppressWarnings( "unused" )
  public static void main( String[] args ) throws IOException {
    String s = "Hölle Hölle Hölle";
    Reader sr = new StringReader( s );

    char H = (char) sr.read();
    char ö = (char) sr.read();

    for ( int c; (c = sr.read()) != -1; )
      System.out.print( (char) c );
  }
}
