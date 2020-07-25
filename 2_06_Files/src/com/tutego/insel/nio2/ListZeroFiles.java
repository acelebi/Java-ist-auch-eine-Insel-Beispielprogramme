package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ListZeroFiles {
  static final class EmptyFilesFilter implements DirectoryStream.Filter<Path> {
    @Override public boolean accept( Path path ) throws IOException
    {
      BasicFileAttributes attrib =
        Files.readAttributes( path,BasicFileAttributes.class );
  
      return attrib.isRegularFile() && attrib.size() == 0;
    }
  }

  public static void main( String[] args ) throws IOException {
    try ( DirectoryStream<Path> files = Files.newDirectoryStream(
                                          Paths.get( "c:/Windows" ),
                                          new EmptyFilesFilter() ) ) {
      for ( Path path : files )
        System.out.println( path.getFileName() );
    }
  }
}