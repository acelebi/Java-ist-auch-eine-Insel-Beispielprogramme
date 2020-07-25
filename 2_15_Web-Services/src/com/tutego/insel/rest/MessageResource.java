package com.tutego.insel.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import javax.xml.bind.annotation.XmlRootElement;

@Path( "message" )
public class MessageResource {

  @GET
  @Produces( MediaType.TEXT_PLAIN )
  public String message() {
    return "Yea!";
  }

  @GET
  @Path( "user/{user}" )
  @Produces( MediaType.TEXT_PLAIN )
  public String message( @PathParam( "user" ) String user ) {
    return String.format( "Benutzer = %s", user );
  }

  @GET
  @Produces( MediaType.TEXT_PLAIN )
  @Path( "user/{user}/search/{search}" )
  public String message( @PathParam( "user" ) String user, @PathParam( "search" ) String search ) {
    return String.format( "Benutzer = %s, Suchstring = %s", user, search );
  }

  @GET
  @Path( "serverinfo" )
  @Produces( {
      MediaType.TEXT_XML, "application/json"
  } )
  public ServerInfo serverinfo() {
    ServerInfo info = new ServerInfo();
    info.server = System.getProperty( "os.name" ) + " " + System.getProperty( "os.version" );
    return info;
  }

  @PUT
  @Path( "user/{user}" )
  @Consumes( MediaType.TEXT_PLAIN )
  public Response postMessage( @PathParam( "user" ) String user, String message ) {
    System.out.printf( "%s sendet '%s'%n", user, message );
    return Response.noContent().build();
  }
}

@XmlRootElement
class ServerInfo {
  public String server;
}