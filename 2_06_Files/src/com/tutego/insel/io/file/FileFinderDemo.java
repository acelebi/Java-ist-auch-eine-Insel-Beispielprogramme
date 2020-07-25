package com.tutego.insel.io.file;

import java.io.File;
import java.util.List;

public class FileFinderDemo {
  public static void main( String[] args ) {
    String path = new File( System.getProperty( "user.dir" ) ).getParent();

    System.out.println( "Suche im Pfad: " + path );

    List<File> files = FileFinder.find( path, "(.*\\.gif$)|(.*\\.jpg$)" );

    System.out.printf( "Fand %d Datei%s.%n", files.size(), files.size() == 1 ? "" : "en" );

    for ( File f : files )
      System.out.println( f.getAbsolutePath() );
  }
}
