package com.tutego.insel.io.file;

import java.io.*;

public class Dir {
  public static void main( String[] args ) {
    File userdir = new File( System.getProperty( "user.dir" ) );
    System.out.println( userdir );

    for ( File file : userdir.listFiles( new TxtFilenameFilter() ) )
      System.out.println( file );
  }
}
