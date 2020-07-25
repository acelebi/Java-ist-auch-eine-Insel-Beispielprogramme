package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;

public class RealAndAbsolutePath {
  public static void main( String[] args ) {
    Path p2 = Paths.get( "../.." );
    System.out.println( p2.toAbsolutePath() ); // C:\Users\Christian\Documents\My Dropbox\Insel\programme\2_06_Files\..\..

    try {
      System.out.println( p2.toRealPath( LinkOption.NOFOLLOW_LINKS ) ); // C:\Users\Christian\Documents\My Dropbox\Insel
      
      System.out.println( Paths.get( "../0x" ).toRealPath( LinkOption.NOFOLLOW_LINKS ) );
    }
    catch ( IOException e ) { e.printStackTrace(); } 
  }
}