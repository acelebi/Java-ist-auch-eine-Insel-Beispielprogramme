package com.tutego.insel.net.multicast;
import java.net.*; 
import java.util.*; 

class _TimeServerMultiCast
{ 
  public static void main( String[] args )
  { 
    try ( MulticastSocket socket = new MulticastSocket( 4711 ) ) {
      while ( true ) {
        byte[] buf = new byte[256];
 
        String timeofday = new Date().toString();
        buf = timeofday.getBytes();

        InetAddress group = InetAddress.getByName("231.1.1.1");

        DatagramPacket packet = new DatagramPacket( buf, buf.length, group, 8889 );
        socket.send(packet); 
      
        Thread.sleep( 2000 );
      }
    }
    catch ( Exception e ) { System.out.println( e ); }
  }
}