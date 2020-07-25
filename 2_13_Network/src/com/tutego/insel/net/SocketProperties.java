package com.tutego.insel.net;

import java.io.IOException;
import java.net.Socket;
import static java.lang.System.out;

public class SocketProperties {
  public static void main( String[] args ) throws IOException {
    try ( Socket s = new Socket( "www.tutego.com", 80 ) ) {
      out.println( s.getKeepAlive() );           // false
      out.println( s.getLocalAddress() );        // /192.168.2.138
      out.println( s.getLocalPort() );           // 1456
      out.println( s.getLocalSocketAddress() );  // /192.168.2.138:1202
      out.println( s.getOOBInline() );           // false
      out.println( s.getPort() );                // 80
      out.println( s.getRemoteSocketAddress() ); // www.tutego.com/82.96.100.30:80
      out.println( s.getReuseAddress() );        // false
      out.println( s.getReceiveBufferSize() );   // 8192
      out.println( s.getSendBufferSize() );      // 8192
      out.println( s.getSoLinger() );            // -1
      out.println( s.getTcpNoDelay() );          // false
      out.println( s.getTrafficClass() );        // 0
    }
  }
}
