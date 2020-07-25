package com.tutego.insel.net;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class PrintFileFromUrl {
  public static void main( String[] args ) {
    try {
      URL url = new URL( "http://www.tutego.com/javabuch/aufgaben/bond.txt" );
      try ( InputStream is = url.openStream();
            Scanner scanner = new Scanner( is, StandardCharsets.UTF_8.name() ) ) {
        System.out.println( scanner.useDelimiter( "\\Z" ).next() );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}