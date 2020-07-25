package com.tutego.insel.io.file;

import java.io.*;

public class PermissionDemo {
  public static void main( String[] args ) throws IOException {
    File f = File.createTempFile( "bla", "blub" );
    System.out.printf( "readable=%s, writable=%s%n", f.canRead(), f.canWrite() );
    f.setReadOnly();
    System.out.printf( "readable=%s, writable=%s%n", f.canRead(), f.canWrite() );
    f.setWritable( true );
    System.out.printf( "readable=%s, writable=%s%n", f.canRead(), f.canWrite() );
    f.deleteOnExit();
  }
}
