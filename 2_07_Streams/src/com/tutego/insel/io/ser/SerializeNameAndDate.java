package com.tutego.insel.io.ser;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class SerializeNameAndDate {
  public static void main( String[] args ) {
    try ( OutputStream fos = Files.newOutputStream( Paths.get( "name_date.ser" ) );
          ObjectOutputStream oos = new ObjectOutputStream( fos ) ) {
      oos.writeObject( "Chris" );
      oos.writeObject( LocalDate.now() );
    }
    catch ( IOException e ) {
      System.err.println( e );
    }
  }
}