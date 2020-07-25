package com.tutego.insel.io.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class NewBufferedReaderDemo {

  public static void main( String[] args ) {
    try ( BufferedReader in = Files.newBufferedReader( Paths.get( "lyrics.txt" ), StandardCharsets.ISO_8859_1 ) ) {
     for ( String line; (line = in.readLine()) != null; )
      System.out.println( line );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
