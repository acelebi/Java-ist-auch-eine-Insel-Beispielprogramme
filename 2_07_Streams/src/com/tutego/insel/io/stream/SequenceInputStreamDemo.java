package com.tutego.insel.io.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SequenceInputStreamDemo {
  public static void main( String[] args )  {
    String s = "Gezeitenrechnung\nfür\nSchlickrutscher\n";
    
    try ( InputStream bais = new ByteArrayInputStream( s.getBytes( StandardCharsets.ISO_8859_1 ) );
          InputStream reis = SequenceInputStreamDemo.class.getResourceAsStream( "/lyrics.txt" );
          InputStream sis = new SequenceInputStream( bais, reis );
          InputStreamReader isr = new InputStreamReader( sis, StandardCharsets.ISO_8859_1 );
          LineNumberReader  lnr = new LineNumberReader( isr ) ) {
      for ( String line; (line = lnr.readLine()) != null; )
        System.out.printf( "%2d:%s%n", lnr.getLineNumber(), line );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}