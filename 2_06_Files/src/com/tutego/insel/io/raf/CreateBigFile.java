package com.tutego.insel.io.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateBigFile {
  public static void main( String[] args ) throws IOException {
    try ( RandomAccessFile file = new RandomAccessFile( "c:/test.bin", "rw" ) ) {
      file.seek( 999 );
      file.write( -1 );
    }
  }
}