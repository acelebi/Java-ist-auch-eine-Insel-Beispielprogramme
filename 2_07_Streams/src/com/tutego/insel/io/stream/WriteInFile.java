package com.tutego.insel.io.stream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

public class WriteInFile {
  public static void main( String[] args ) {
    try ( PrintWriter out = new PrintWriter( "datei.txt", StandardCharsets.ISO_8859_1.name() ) ) {
      out.println( "Hallo Welt!" );
      out.print( "Es ist " );
      out.printf( "%tR Uhr.", LocalTime.now() );
    }
    catch ( FileNotFoundException | UnsupportedEncodingException e ) {
      e.printStackTrace();
    }
  }
}