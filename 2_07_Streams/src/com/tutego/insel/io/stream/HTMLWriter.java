package com.tutego.insel.io.stream;

import java.io.*;

class HTMLWriter extends FilterWriter {
  
  private boolean newLine;

  /**
   * Creates a new filtered HTML writer with a title for the web page.
   *
   * @param out  a Writer object to provide the underlying stream.
   * @throws IOException if the header cannot be written
   */
  public HTMLWriter( Writer out, String title ) throws IOException {
    super( out );

    out.write( "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\"" +
    		       " \"http://www.w3.org/TR/html4/strict.dtd\">\n"  );
    out.write( "<html><head><title>" + title + "</title></head>\n<body><p>\n" );
  }

  /**
   * Creates a new filtered HTML writer with no title for the web page.
   *
   * @param out  a Writer object to provide the underlying stream.
   */
  public HTMLWriter( Writer out ) {
    super( out );
  }

  /**
   * Writes a single character.
   */
  @Override
  public void write( int c ) throws IOException {
    switch ( c ) {
      case '<':
        out.write( "&lt;" );
        newLine = false;
        break;
      case '>':
        out.write( "&gt;" );
        newLine = false;
        break;
      case '&':
        out.write( "&amp;" );
        newLine = false;
        break;
      case '\n':
        if ( newLine ) {
          out.write( "<br/>\n" );
          newLine = false;
        }
        else
          out.write( "\n" );
        newLine = true;
        break;
      case '\r':
        break; // ignore

      default :
        out.write( c );
        newLine = false;
    }
  }

  /**
   * Writes a portion of an array of characters.
   *
   * @param  cbuf Buffer of characters to be written
   * @param  off  Offset from which to start reading characters
   * @param  len  Number of characters to be written
   * @exception   IOException If an I/O error occurs
   */
  @Override
  public void write( char[] cbuf, int off, int len ) throws IOException {
    for ( int i = off; i < len; i++ )
      write( cbuf[ i ] );
  }

  /**
   * Writes a portion of a string.
   *
   * @param  str  String to be written.
   * @param  off  Offset from which to start reading characters
   * @param  len  Number of characters to be written
   * @exception   IOException If an I/O error occurs
   */
  @Override
  public void write( String str, int off, int len ) throws IOException {
    for ( int i = off; i < len; i++ )
      write( str.charAt( i ) );
  }

  /**
   * Closes the stream.
   *
   * @throws IOException If the prolog can not be written or the underlying stream not be closed
   */
  @Override
  public void close() throws IOException {
    try {
      out.write( "</p></body></html>" );
    }
    finally {
      out.close();  // Ignoriere, falls out.close() und out.write() knallt
    }
  }
}