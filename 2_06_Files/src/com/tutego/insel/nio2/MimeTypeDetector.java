package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MimeTypeDetector {
  public static void main( String[] args ) throws IOException {
    Path path1 = Paths.get( "../lyrics.txt" );
    System.out.println( Files.probeContentType( path1 ) );  // text/plain

    Path path2 = Paths.get( "C:/Windows/Web/Wallpaper/img1.jpg" );
    System.out.println( Files.probeContentType( path2 ) );  // image/jpeg
  }
}