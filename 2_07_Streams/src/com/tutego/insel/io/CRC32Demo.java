package com.tutego.insel.io;

import java.io.*;
import java.util.zip.*;

class CRC32Demo {
  static public void main( String[] args ) {
    CRC32 crc = new CRC32();
    try ( InputStream in = CRC32Demo.class.getResourceAsStream( "/lyrics.txt" );
          InputStream cis = new CheckedInputStream( in, crc );
          InputStream bis = new BufferedInputStream( cis ) ) {
      while ( cis.read() != -1 ) { /* Bis zum Ende */ }
    
      System.out.printf( "%08X", crc.getValue() ); // F9A39CFC
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}