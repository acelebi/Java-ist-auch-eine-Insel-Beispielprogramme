package com.tutego.insel.net;

import java.io.IOException;
import java.net.*;
import java.nio.file.*;
import java.util.Enumeration;
import java.util.jar.*;

public class JarUrl {
  public static void main( String[] args ) throws IOException {

    Path path = Paths.get( System.getProperty("java.home" ) ).resolve( "lib/rt.jar" );
    URL url = new URL( "jar:" + path.toUri() + "!/" );
    JarURLConnection conn = (JarURLConnection) url.openConnection();
    try ( JarFile jarFile = conn.getJarFile() ) {
      for ( Enumeration<JarEntry> it = jarFile.entries(); it.hasMoreElements(); ) {
        JarEntry entry = it.nextElement();
        if ( ! entry.isDirectory() )
          System.out.println( entry + ", " + entry.getSize() );
      }
    }
  }
}