package com.tutego.insel.io.stream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class NewBufferedWriterDemo {

  public static void main( String[] args ) {
    try ( Writer out = Files.newBufferedWriter( Paths.get( "out.bak.txt" ),
                                                StandardCharsets.ISO_8859_1 ) ) {
      out.write( "Zwei Jäger treffen sich..." );
      out.write( System.lineSeparator() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}