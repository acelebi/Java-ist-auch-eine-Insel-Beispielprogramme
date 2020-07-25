package com.tutego.insel.io.stream;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringWriterDemo {
  public static void main( String[] args ) {
    StringWriter buffer = new StringWriter();
    PrintWriter out = new PrintWriter( buffer );
    out.print( "Christian" );
    out.printf( "ist lieb.%n" );
    out.println();
    String result = buffer.toString();
    System.out.println( result ); // Christian ist lieb.\n\n
  }
}
