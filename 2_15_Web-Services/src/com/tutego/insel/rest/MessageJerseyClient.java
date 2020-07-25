package com.tutego.insel.rest;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class MessageJerseyClient {
  public static void main( String[] args ) {
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target( "http://localhost:8080/rest" );
    WebTarget resourceTarget = target.path( "message" );
    Invocation.Builder request = resourceTarget.request( MediaType.TEXT_PLAIN );
    Response response = request.get();
    System.out.println( response.readEntity( String.class ) );
  }
}