package com.tutego.insel.io.ser;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class DeSerializeNameAndDate {
  public static void main( String[] args ) {
    try ( InputStream fis = Files.newInputStream( Paths.get( "name_date.ser" ) );
          ObjectInputStream ois = new ObjectInputStream( fis ) ) {
      String    name = (String) ois.readObject();
      LocalDate date = (LocalDate) ois.readObject();

      System.out.println( name );
      System.out.println( date );
    }
    catch ( IOException | ClassNotFoundException e ) {
      e.printStackTrace();
    }
  }
}