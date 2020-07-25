package com.tutego.insel.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class LocalIpAddress {
  public static void main( String[] args ) throws SocketException {
    Enumeration<NetworkInterface> netInter = NetworkInterface.getNetworkInterfaces();
    int n = 0;

    while ( netInter.hasMoreElements() ) {
      NetworkInterface ni = netInter.nextElement();

      System.out.println( "NetworkInterface " + n++ + ": " + ni.getDisplayName() );

      for ( InetAddress iaddress : Collections.list( ni.getInetAddresses() ) ) {
        System.out.println( "CanonicalHostName: " + iaddress.getCanonicalHostName() );

        System.out.println( "IP: " + iaddress.getHostAddress() );

        System.out.println( "Loopback? " + iaddress.isLoopbackAddress() );
        System.out.println( "SiteLocal? " + iaddress.isSiteLocalAddress() );
        System.out.println();
      }
    }
  }
}
