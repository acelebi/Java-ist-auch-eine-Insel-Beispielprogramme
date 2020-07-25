package com.tutego.insel.net.multicast;

import java.net.*;
import java.io.*;

public class _MutliCastTimeClient {
  public static void main( String[] args ) throws IOException {
    try ( MulticastSocket socket = new MulticastSocket( 4711 ) ) {

      InetAddress address = InetAddress.getByName( "224.0.1.27" );

      // socket.joinGroup( address );

      System.out.println( "Gruppe beigetreten" );

      for ( int i = 0; i < 10; i++ ) {
        byte[] buf = new byte[256];

        DatagramPacket packet = new DatagramPacket( buf, buf.length );

        socket.receive( packet );

        String time = new String( packet.getData() );

        System.out.println( "Zeit ist " + time );
      }

      socket.leaveGroup( address );

      System.out.println( "Gruppe verlassen" );
    }
  }
}