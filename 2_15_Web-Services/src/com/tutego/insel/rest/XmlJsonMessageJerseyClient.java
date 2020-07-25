package com.tutego.insel.rest;

import javax.ws.rs.client.*;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;

public class XmlJsonMessageJerseyClient {
  public static void main( String[] args ) {
    WebTarget wr1 = ClientBuilder.newClient().target( "http://localhost:8080/rest" );
    Builder b1 = wr1.path( "message" ).path( "serverinfo" )
                                      .request( MediaType.APPLICATION_JSON );
    System.out.println( b1.get( ServerInfo.class ).server );  // Windows Vista 6.0
    
    WebTarget wr2 = ClientBuilder.newClient().target( "http://localhost:8080/rest" );
    Builder b2 = wr2.path( "message" ).path( "serverinfo" ).request( MediaType.TEXT_XML );
    System.out.println( b2.get( ServerInfo.class ).server );  // Windows Vista 6.0
    
    WebTarget wr3 = ClientBuilder.newClient().target( "http://localhost:8080/rest" );
    Builder b3 = wr3.path( "message" ).path( "serverinfo" ).request( MediaType.TEXT_PLAIN );
    System.out.println( b3.get( ServerInfo.class ).server );  // NotAcceptableException
  }
}