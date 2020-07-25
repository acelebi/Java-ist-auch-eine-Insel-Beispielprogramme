package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class PosixFileAttributesDemo {
  public static void main( String[] args ) throws IOException {
    //    Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
//    System.out.println( PosixFilePermissions.toString( perms ) ); // rwxr-x---
    
    Path p = Paths.get( "src/lyrics.txt" );
    PosixFileAttributes attrs = Files.readAttributes( p, PosixFileAttributes.class ); 
    System.out.println( attrs.group() );
    System.out.println( attrs.permissions() );
    System.out.println( PosixFilePermissions.toString( attrs.permissions() ) );
    System.out.println( attrs.owner() );
  }
}
