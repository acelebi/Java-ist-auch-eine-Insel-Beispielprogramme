package com.tutego.insel.lang;

import java.io.*;
import java.util.Scanner;

public class ExecDir {

  public static void main( String[] args ) {
    ProcessBuilder builder = new ProcessBuilder( "cmd", "/c", "dir" );
    builder.directory( new File( "c:/" ) );
    try {
      Process process = builder.start();
      try ( InputStream  in = process.getInputStream();
            Scanner scanner = new Scanner( in ) ) {
        System.out.println( scanner.useDelimiter( "\\Z" ).next() );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}