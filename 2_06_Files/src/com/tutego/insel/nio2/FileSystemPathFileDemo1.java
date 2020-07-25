package com.tutego.insel.nio2;

import java.nio.file.*;

public class FileSystemPathFileDemo1 {
  public static void main( String[] args ) {
    Path p = Paths.get( "C:/Windows/Fonts/" );

    System.out.println( p.toString() );       // C:\Windows\Fonts
    System.out.println( p.isAbsolute() );     // true
    System.out.println( p.getRoot() );        // C:\
    System.out.println( p.getParent() );      // Fonts
    System.out.println( p.getNameCount() );   // 2
    System.out.println( p.getName(p.getNameCount()-1) );// Fonts
  }
}