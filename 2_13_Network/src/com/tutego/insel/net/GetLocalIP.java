package com.tutego.insel.net;

import java.net.*;

class GetLocalIP {
  public static void main( String[] args ) throws Exception {
    System.out.println( "Host Name/Adresse: " + InetAddress.getLocalHost() );
  }
}
