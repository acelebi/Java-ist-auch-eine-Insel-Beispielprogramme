package com.tutego.insel.net.udp;

import java.io.IOException;
import java.net.*;

public class UDPServer {
  public static void main( String[] args ) throws IOException {
    try ( DatagramSocket socket = new DatagramSocket( 4711 ) ) {
      while ( true ) {
        // Auf Anfrage warten
  
        DatagramPacket packet = new DatagramPacket( new byte[1024], 1024 );
        socket.receive( packet );
  
        // Empfänger auslesen
  
        InetAddress address = packet.getAddress();
        int         port    = packet.getPort();
        int         len     = packet.getLength();
        byte        data[]  = packet.getData();
  
        System.out.printf( "Anfrage von %s vom Port %d mit der Länge %d:%n%s%n",
                           address, port, len, new String( data, 0, len ) );
      }
    }
  }
}