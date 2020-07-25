package com.tutego.insel.io.stream;

import java.io.*;

class PushbackReaderDemo
{
  public static void main( String[] args ) throws IOException {
    String s = "134Erste Zeile\n234Zeile";

    PushbackReader in = new PushbackReader( new StringReader( s ) );

    for ( int c;; ) {
      try {
        int number = 0;

        // Read until no digit

        while ( Character.isDigit((char)(c = in.read())) )
          number = number * 10 + Character.digit( c, 10 );
          
        if ( c == -1 )         // Ende erreicht? Dann aufhören
          break;

        in.unread( c );        // Gelesenes Zeichen zurücklegen

        System.out.print( number + ":" );

        while ( (c = in.read()) != -1 ) {
          System.out.print( (char) c );

          if ( c == '\n' )
            break;
        }
        if ( c == -1 )
          break;
      }
      catch ( EOFException e ) {
        break;
      }
    }
  }
}