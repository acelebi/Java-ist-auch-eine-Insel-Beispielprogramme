package com.tutego.insel.io.stream;

import java.io.*;

class LowerCaseWriter extends FilterWriter {
  public LowerCaseWriter( Writer writer ) {
    super( writer );
  }

  @Override
  public void write( int c ) throws IOException {
    out.write( Character.toLowerCase( (char) c ) );
  }

  @Override
  public void write( char[] cbuf, int off, int len ) throws IOException {
    write( String.valueOf( cbuf ), off, len );
  }

  @Override
  public void write( String s, int off, int len ) throws IOException {
    out.write( s.toLowerCase(), off, len );
  }
}

public class LowerCaseWriterDemo {
  @SuppressWarnings( "resource" )
  public static void main( String[] args ) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter( new LowerCaseWriter( sw ) );
    pw.println( "Eine Zeile für klein und groß" );
    System.out.println( sw.toString() );
  }
}
