package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkZipFile {
  public static void main( String[] args ) throws IOException {
    Path path = Paths.get( System.getProperty( "java.home" ), "lib", "rt.jar" );

    try ( FileSystem fs = FileSystems.newFileSystem( path, null ) ) {
      Files.walkFileTree( fs.getPath( "/" ), new SimpleFileVisitor<Path>() {
        String indent = "";

        @Override
        public FileVisitResult visitFile( Path path, BasicFileAttributes attrs ) {
          System.out.println( "   " + indent + path );
          return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory( Path path, BasicFileAttributes attrs ) {
          System.out.println( "cd " + indent + path );
          indent += "  ";
          return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory( Path path, IOException ioe ) {
          indent = indent.substring( 2 );
          return FileVisitResult.CONTINUE;
        }
      } );
    }
  }
}