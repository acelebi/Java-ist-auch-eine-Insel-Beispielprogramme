package com.tutego.insel.io.stream;

import java.io.*;

public class cp {

  private static void copy( InputStream in, OutputStream out ) throws IOException {
    byte[] buffer = new byte[0xFFFF];

    for ( int len; (len = in.read( buffer )) != -1; )
      out.write( buffer, 0, len );
  }

  private static void copyFile( String srcFilename, String destFilename ) {
    try ( FileInputStream fis = new FileInputStream( srcFilename );
         FileOutputStream fos = new FileOutputStream( destFilename ) ) {
      copy( fis, fos );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }

  public static void main( String[] args ) {
    if ( args.length != 2 )
      System.err.println( "Benutzung: FileCopy <src> <dest>" );
    else
      copyFile( args[ 0 ], args[ 1 ] );
  }
}