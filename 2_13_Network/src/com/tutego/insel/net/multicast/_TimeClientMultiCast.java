package com.tutego.insel.net.multicast;

import java.net.*;
import java.io.*;

public class _TimeClientMultiCast {
  public static void main( String[] args ) throws IOException {
    try ( MulticastSocket socket = new MulticastSocket( 4711 ) ) {

      InetAddress address = InetAddress.getByName( "231.1.1.1" );
      socket.joinGroup( address );

      for ( int i = 0; i < 10; i++ ) {
        byte[] buf = new byte[256];

        DatagramPacket packet = new DatagramPacket( buf, buf.length );
        socket.receive( packet );
        String received = new String( packet.getData() );
        System.out.println( "Time: " + received );
      }

      socket.leaveGroup( address );
    }
  }
}