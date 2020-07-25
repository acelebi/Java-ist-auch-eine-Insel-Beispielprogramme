package com.tutego.insel.io.zip;

import java.io.*;
import java.nio.file.*;
import java.util.zip.GZIPInputStream;

public class gunzip {

  public static void main( String[] args ) {
    if ( args.length != 1 ) {
      System.err.println( "Benutzung: gunzip <source>" );
      return;
    }

    String filename = args[ 0 ];
    Path srcPath, destPath;

    if ( filename.toLowerCase().endsWith( ".gz" ) ) {
      srcPath  = Paths.get( filename );
      destPath = Paths.get( filename.replaceAll( "\\.gz$", "" ) );
    }
    else {
      srcPath  = Paths.get( filename + ".gz" );
      destPath = Paths.get( filename );
    }

    try ( InputStream is  = new GZIPInputStream( Files.newInputStream( srcPath ) ) ) {
      Files.copy( is, destPath );
    }
    catch ( IOException e ) {
      System.err.println( "Fehler: Kann nicht entpacken " + filename );
    }
  }
}