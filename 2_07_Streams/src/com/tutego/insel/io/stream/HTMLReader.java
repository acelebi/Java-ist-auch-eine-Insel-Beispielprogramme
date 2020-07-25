package com.tutego.insel.io.stream;

import java.io.*;

public class HTMLReader extends FilterReader {
  private boolean inTag = false;

  public HTMLReader( Reader in ) {
    super( in );
  }

  @Override
  public int read() throws IOException {
    char[] buf = new char[1];
    return read( buf, 0, 1 ) == -1 ? -1 : buf[0];
  }

  @Override
  public int read( char[] cbuf, int off, int len ) throws IOException {
    int numchars = 0;

    while ( numchars == 0 ) {
      numchars = in.read( cbuf, off, len );

      if ( numchars == -1 ) // EOF?
        return -1;

      int last = off;

      for ( int i = off; i < off + numchars; i++ ) {
        if ( ! inTag ) {
          if ( cbuf[i] == '<' )
            inTag = true;
          else
            cbuf[last++] = cbuf[i];
        }
        else if ( cbuf[i] == '>' )
          inTag = false;
      }
      numchars = last - off;
    }
    return numchars;
  }
}