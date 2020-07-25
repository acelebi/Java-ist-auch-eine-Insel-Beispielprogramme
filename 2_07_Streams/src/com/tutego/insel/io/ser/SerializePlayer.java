package com.tutego.insel.io.ser;

import java.io.*;
import java.nio.file.*;

public class SerializePlayer {
  public static void main( String[] args ) throws Exception {
    try ( OutputStream fos = Files.newOutputStream( Paths.get( "player.ser" ) );
          ObjectOutputStream oos = new ObjectOutputStream( fos ) ) {
      oos.writeObject( new Player() );
    }
  }
}