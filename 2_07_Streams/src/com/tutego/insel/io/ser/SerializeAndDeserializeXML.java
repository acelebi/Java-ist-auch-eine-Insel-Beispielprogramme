package com.tutego.insel.io.ser;

import java.beans.*;
import java.io.*;
import java.nio.file.*;
import java.util.Date;

public class SerializeAndDeserializeXML {
  public static void main( String[] args ) {
    Path path = Paths.get( "datum.ser.xml" );

    // Serialisieren

    try ( OutputStream fos = Files.newOutputStream( path );
          XMLEncoder   enc = new XMLEncoder( fos ) ) {
      enc.writeObject( "Today" );
      enc.writeObject( new Date() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    // Deserialisieren

    try ( InputStream fis = Files.newInputStream( path );
          XMLDecoder  dec = new XMLDecoder( fis ) ) {
      String string = (String) dec.readObject();
      Date date = (Date) dec.readObject();

      System.out.println( string );
      System.out.println( date );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}