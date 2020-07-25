package com.tutego.insel.rest;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class PostMessageJerseyClient {
  public static void main( String[] args ) {
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target( "http://localhost:8080/rest" );
    Response response = target.path( "message" ).path( "user" ).path( "chris" ).request().put( Entity.text("Hey Chris") );
    System.out.println( response );
  }
}
