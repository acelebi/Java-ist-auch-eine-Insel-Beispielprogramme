package com.tutego.insel.io.ser;

import java.io.*;
import java.nio.file.*;

public class DeSerializePlayer {
  public static void main( String[] args ) throws Exception {
    try ( InputStream fis = Files.newInputStream( Paths.get( "player.ser" ) );
          ObjectInputStream ois = new ObjectInputStream( fis ) ) {
      Player player = (Player) ois.readObject();
      System.out.println( player );
    }
  }
}