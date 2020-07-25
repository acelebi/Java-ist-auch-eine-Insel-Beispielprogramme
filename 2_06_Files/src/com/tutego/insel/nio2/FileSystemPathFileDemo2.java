package com.tutego.insel.nio2;

import java.nio.file.*;

public class FileSystemPathFileDemo2 {
  public static void main( String[] args ) {
   Path p = Paths.get( "../.." );
    System.out.println( p.toString() );       // ..\..
    System.out.println( p.isAbsolute() );     // false
    System.out.println( p.getRoot() );        // null
    System.out.println( p.getParent() );      // ..
    System.out.println( p.getNameCount() );   // 2
    System.out.println( p.getName(p.getNameCount()-1) ); // ..
    System.out.println( p.normalize() );
  }
}