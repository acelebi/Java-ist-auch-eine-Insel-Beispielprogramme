package com.tutego.insel.io.zip;

import java.io.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.zip.*;

public class unzip {

  public static void main( String[] args ) {
    if ( args.length != 2 )
      System.out.println( "Benutzung: unzip <zipfile> <destination>" );
    else {
      try ( ZipFile zipFile = new ZipFile( args[ 0 ] ) ) {
        for ( ZipEntry entry : Collections.list( zipFile.entries() ) ) {
          System.out.print( entry.getName() + "." );
          extractEntry( zipFile, entry, args[ 1 ] );
          System.out.println( ".. entpackt" );
        }
      }
      catch ( FileNotFoundException e ) {
        System.err.println( "Fehler: Zip-Datei nicht gefunden!" );
      }
      catch ( IOException e ) {
        System.err.println( "Fehler: Allgemeiner Ein-/Ausgabefehler!" );
      }
    }
  }

  private static void extractEntry( ZipFile zipFile, ZipEntry entry, String destDir )
      throws IOException {
    Path destPath = Paths.get( destDir, entry.getName() );

    if ( entry.isDirectory() )
      Files.createDirectories( destPath );
    else {
      Files.createDirectories( destPath.getParent() );

      try ( InputStream  is = zipFile.getInputStream( entry ) ) {
        Files.copy( is, destPath );
      }
    }
  }
}