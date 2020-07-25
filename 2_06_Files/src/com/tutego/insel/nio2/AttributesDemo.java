package com.tutego.insel.nio2;

import java.io.IOException;
import java.nio.file.*;

public class AttributesDemo {
  public static void main( String[] args ) throws IOException {
    Path p = Paths.get( "src/lyrics.txt" ).toAbsolutePath();
    System.out.println( Files.getAttribute( p, "basic:isRegularFile" ) );// true
    System.out.println( Files.getAttribute( p, "isDirectory" ) );      // false
    System.out.println( Files.getAttribute( p, "isSymbolicLink" ) );   // false
    System.out.println( Files.getAttribute( p, "isOther" ) );          // false
    System.out.println( Files.getAttribute( p, "fileKey" ) );          // null
    System.out.println( Files.getAttribute( p, "lastModifiedTime" ) ); // 2006-05-23T12:36:54Z
    System.out.println( Files.getAttribute( p, "lastAccessTime" ) );   // 2009-07-17T12:24:33Z
    System.out.println( Files.getAttribute( p, "creationTime" ) );     // 2006-05-23T12:36:54Z
    System.out.println( Files.getAttribute( p, "size" ) );             // 14
    System.out.println( Files.getAttribute( p, "dos:readonly" ) );     // false
    System.out.println( Files.getAttribute( p, "dos:hidden" ) );       // false
    System.out.println( Files.getAttribute( p, "dos:system" ) );       // false
    System.out.println( Files.getAttribute( p, "dos:archive" ) );      // true
//    System.out.println( Files.getAttribute( p, "posix:permissions" ) );
//    System.out.println( Files.getAttribute( p, "posix:group" ) ); 
  }
}