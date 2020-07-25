package com.tutego.insel.xml.jaxb;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import javax.xml.bind.JAXB;

public class RoomMarshaller {
  public static void main( String[] args ) {
    Player john = new Player();
    john.setName( "John Peel" );
    
    Player tweet = new Player();
    tweet.setName( "Zwitscher Zoe" );
    
    Room room = new Room();
    room.setPlayers( Arrays.asList( john, tweet ) );

    Path path = Paths.get( "room.xml" );
    try ( Writer out = Files.newBufferedWriter( path, StandardCharsets.UTF_8 ) ) {
      JAXB.marshal( room, out );
    
      Room room2 = JAXB.unmarshal( path.toFile(), Room.class );
      System.out.println( room2.getPlayers().get( 0 ).getName() ); // John Peel
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}