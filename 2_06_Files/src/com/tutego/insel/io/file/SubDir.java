package com.tutego.insel.io.file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class SubDir {
  public static void main( String[] args ) {
    File dir = new File( "c:/" );

    File[] subDirs = dir.listFiles( new FileFilter() {
      @Override public boolean accept( File d ) {
        return d.isDirectory();
      }
    } );

    System.out.println( Arrays.asList( subDirs ) );
  }
}
