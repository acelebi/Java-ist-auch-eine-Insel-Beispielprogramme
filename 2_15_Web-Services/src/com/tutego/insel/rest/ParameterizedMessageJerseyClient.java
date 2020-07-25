package com.tutego.insel.rest;

import javax.ws.rs.client.ClientBuilder;

public class ParameterizedMessageJerseyClient {
  public static void main( String[] args ) {
    System.out.println( ClientBuilder.newClient().target( "http://localhost:8080/rest" )
      .path( "message" ).path( "user" ).path("chris")
      .request().get(String.class) ); // Benutzer = chris
    
    System.out.println( ClientBuilder.newClient().target( "http://localhost:8080/rest" )
      .path( "message" ).path( "user" )
      .path("chris").path("search").path("kitesurfing")
      .request().get(String.class) ); // Benutzer = chris, Suchstring = kitesurfing
  }
}
