package com.tutego.insel.net;

import java.io.IOException;
import java.net.InetAddress;

public class IsReachable {
  public static void main( String[] args ) throws IOException {
    System.out.println( InetAddress.getByName( "193.99.144.71" ).isReachable( 2000 ) );
    System.out.println( InetAddress.getByName( "100.100.100.100" ).isReachable( 2000 ) );
  }
}
