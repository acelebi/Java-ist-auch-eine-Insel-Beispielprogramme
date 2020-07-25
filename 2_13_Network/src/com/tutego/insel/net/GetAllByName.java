package com.tutego.insel.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByName {
  public static void main( String[] args ) throws UnknownHostException {
    String localHost = InetAddress.getLocalHost().getHostName();

    for ( InetAddress ia : InetAddress.getAllByName( localHost ) )
      System.out.println( ia );
  }
}
