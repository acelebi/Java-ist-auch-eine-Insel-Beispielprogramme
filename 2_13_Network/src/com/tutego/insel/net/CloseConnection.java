package com.tutego.insel.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CloseConnection {
  @SuppressWarnings( "resource" )
  public static void main( String[] args ) throws Exception {
    new ServerSocket( 12345 );

    final Socket socket = new Socket( "localhost", 12345 );

    new Thread( new Runnable() {
      @Override public void run() {
        try {
          System.out.println( "Gleich hängt er!" );
          System.out.println( socket.getInputStream().read() );
          System.out.println( "Hier hängt er!" );
        }
        catch ( IOException e ) {
          System.out.println( "Blockierung gelöst" );
        }
      }
    } ).start();

    Thread.sleep( 2000 );

    socket.close(); // Releases the block
  }
}
