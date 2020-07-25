package com.tutego.insel.nio2;

import java.nio.file.*;

public class FilesCopyAndMoveDemo {
  public static void main( String[] args ) throws Exception {
    Path copySourcePath = Paths.get( "src/lyrics.txt" );
    Path copyTargetPath = Paths.get( "src/lyrics - Kopie.txt" );
    Files.copy( copySourcePath, copyTargetPath );

    Path moveSourcePath = Paths.get( "bin/lyrics.txt" );
    Path moveTargetPath = Paths.get( "src/lyrics.txt" );
    Files.move( moveSourcePath, moveTargetPath );
  }
}