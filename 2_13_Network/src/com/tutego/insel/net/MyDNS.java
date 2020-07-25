package com.tutego.insel.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyDNS {
  public static void main( String[] args ) throws UnknownHostException {
    InetAddress inet = InetAddress.getByName( "www.tutego.com" );
    System.out.println( inet.getCanonicalHostName() ); // web1.networkaholics.de
    System.out.println( inet.getHostAddress() );       // 82.96.100.30
    System.out.println( inet.getHostName() );          // www.tutego.com
    System.out.println( inet.toString() );             // www.tutego.com/82.96.100.30
    
    inet = InetAddress.getByName( "193.99.144.71" );
    System.out.println( inet.getHostName() );          // web.heise.de
  }
}
