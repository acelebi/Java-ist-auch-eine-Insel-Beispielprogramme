package com.tutego.insel.net.multicast;

import java.net.*;
import java.io.*;
import java.util.*;

public class _MultiCastTimeServer {
  public static void main( String[] args ) throws IOException {
    try ( MulticastSocket socket = new MulticastSocket( 4711 ) ) {

      while ( true ) {
        try {
          byte[] buf = new Date().toString().getBytes();

          InetAddress group = InetAddress.getByName( "224.0.1.27" );

          DatagramPacket packet = new DatagramPacket( buf, buf.length, group, 8889 );

          socket.send( packet );

          System.out.println( "Gesendet" );

          Thread.sleep( 2000 );

        }
        catch ( Exception e ) {
          System.out.println( e );
          break;
        }
      }

      socket.close();
    }
  }
}