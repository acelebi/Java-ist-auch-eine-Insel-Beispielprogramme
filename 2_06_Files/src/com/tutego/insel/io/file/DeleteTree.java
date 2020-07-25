package com.tutego.insel.io.file;

import java.io.File;

public class DeleteTree {
  public static void deleteTree( File path ) {
    for ( File file : path.listFiles() ) {
      if ( file.isDirectory() )
        deleteTree( file );
      else if ( !file.delete() )
        System.err.println( file + " konnte nicht gelöscht werden!" );
    }

    if ( !path.delete() )
      System.err.println( path + " konnte nicht gelöscht werden!" );
  }

  public static void main( String[] args ) {
    deleteTree( new File( "c:/ati/" ) );
  }
}
