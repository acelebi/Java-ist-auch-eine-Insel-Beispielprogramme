package com.tutego.insel.io.file;

import java.io.File;

public class DiscSpace {
  public static void main( String[] args ) {
    System.out.println( "Laufwerk  Total        Frei    Nutzbar" );
    System.out.println( "--------------------------------------" );
    
    for ( File dir : File.listRoots() )
      System.out.printf( "%s   %6d MB   %6d MB  %6d MB%n", dir,
                        dir.getTotalSpace() / (1024*1024),
                        dir.getFreeSpace() / (1024*1024),
                        dir.getUsableSpace() / (1024*1024) );
  }
}
