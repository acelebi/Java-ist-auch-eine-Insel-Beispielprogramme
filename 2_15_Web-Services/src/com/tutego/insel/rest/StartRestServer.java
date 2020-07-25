package com.tutego.insel.rest;

import java.net.URI;
import javax.swing.JOptionPane;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class StartRestServer {
  public static void main( String[] args ) throws Exception {
    ResourceConfig rc = new ResourceConfig().packages( "com.tutego.insel.rest" );
    HttpServer server = JdkHttpServerFactory.createHttpServer(
                           URI.create( "http://localhost:8080/rest" ), rc);
    JOptionPane.showMessageDialog( null, "Ende" );
    server.stop( 0 );
  }
}