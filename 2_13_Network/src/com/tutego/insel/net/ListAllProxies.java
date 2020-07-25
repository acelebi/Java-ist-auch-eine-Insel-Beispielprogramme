package com.tutego.insel.net;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

public class ListAllProxies {
  public static void main( String[] args ) throws Exception {
    //    System.setProperty( "java.net.useSystemProxies", "true" );
    List<Proxy> proxies = ProxySelector.getDefault().select( new URI( "http://tutego.de/" ) );

    for ( Proxy proxy : proxies ) {
      System.out.println( "Proxy Typ: " + proxy.type() );
    
      InetSocketAddress addr = (InetSocketAddress) proxy.address();
    
      if ( addr == null )
        System.out.println( "Kein Proxy" );
      else
        System.out.printf( "Proxy Hostname %s und Port %s.", addr.getHostName(), addr.getPort() );
    }
  }
}
