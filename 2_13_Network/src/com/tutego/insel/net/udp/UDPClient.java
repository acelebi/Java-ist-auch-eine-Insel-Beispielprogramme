package com.tutego.insel.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

class UDPClient {
  public static void main( String[] args ) throws IOException, InterruptedException {
    InetAddress ia = InetAddress.getByName( "localhost" );
    
    while ( true ) {
      byte[] raw = LocalDate.now().toString().getBytes();
    
      DatagramPacket packet = new DatagramPacket( raw, raw.length, ia, 4711 );
    
      try ( DatagramSocket dSocket = new DatagramSocket() ) {
        dSocket.send( packet );
        System.out.println( "Weg is' es" );
      }
      TimeUnit.SECONDS.sleep( 1 );
    }
}
}