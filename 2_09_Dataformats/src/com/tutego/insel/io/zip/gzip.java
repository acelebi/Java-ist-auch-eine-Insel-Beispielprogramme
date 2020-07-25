package com.tutego.insel.io.zip;

import java.io.*;
import java.nio.file.*;
import java.util.zip.GZIPOutputStream;

public class gzip {

  public static void main( String[] args ) {
    if ( args.length != 1 ) {
      System.err.println( "Benutzung: gzip <source>" );
      return;
    }

    Path gzPath = Paths.get( args[ 0 ] + ".gz" );
    try ( OutputStream gos = new GZIPOutputStream( Files.newOutputStream( gzPath ) ) ) {
      Files.copy( Paths.get( args[ 0 ] ), gos );
    }
    catch ( IOException e ) {
      System.err.println( "Fehler: Kann nicht packen " + args[ 0 ] );
    }
  }
}