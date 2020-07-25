package com.tutego.insel.util.map;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Properties;

class SaveProperties {
  public static void main( String[] args ) {
    Path path = Paths.get( "properties.txt" );
    
    try ( Writer writer = Files.newBufferedWriter( path, StandardCharsets.UTF_8 ) ) {
      Properties prop1 = new Properties( System.getProperties() );
      prop1.setProperty( "MeinNameIst", "Forrest Gump" );
      prop1.store( writer, "Eine Insel mit zwei Bergen" );
    
      try ( Reader reader = Files.newBufferedReader( path, StandardCharsets.UTF_8 ) ) {
        Properties prop2 = new Properties();
        prop2.load( reader );
        prop2.list( System.out );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}