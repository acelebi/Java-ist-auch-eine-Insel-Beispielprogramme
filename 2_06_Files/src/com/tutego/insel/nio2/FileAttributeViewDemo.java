package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class FileAttributeViewDemo {
  public static void main( String[] args ) throws IOException {
    Path p = Paths.get( "src/lyrics.txt" );
    DosFileAttributeView fileAttributeView = Files.getFileAttributeView( p, DosFileAttributeView.class );
    System.out.println( fileAttributeView.readAttributes().isArchive() );  // true
    fileAttributeView.setArchive( false );
    System.out.println( fileAttributeView.readAttributes().isArchive() );  // false
    fileAttributeView.setArchive( true );
    System.out.println( fileAttributeView.readAttributes().isArchive() );  // true
  }
}