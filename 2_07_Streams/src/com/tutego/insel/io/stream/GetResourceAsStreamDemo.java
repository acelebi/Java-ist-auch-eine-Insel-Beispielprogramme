package com.tutego.insel.io.stream;

import java.io.*;
import java.util.Objects;

public class GetResourceAsStreamDemo {

  public static void main( String[] args ) {
    String filename = "onebyte.txt";
    try ( InputStream is = Objects.requireNonNull(
            GetResourceAsStreamDemo.class.getResourceAsStream( filename ),
            "Datei gibt es nicht!" ) ) {
      System.out.println( is.read() );  // 49
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
