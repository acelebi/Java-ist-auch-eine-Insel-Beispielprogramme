package com.tutego.insel.httpserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HttpServerDemo {
  public static void main( String[] args ) throws IOException {
    HttpServer server = HttpServer.create( new InetSocketAddress( 80 ), 0 );
    server.createContext( "/", new DateHandler() );
    server.start();
  }
}

class DateHandler implements HttpHandler {
  @Override
  public void handle( HttpExchange httpExchange ) throws IOException {
    httpExchange.getResponseHeaders().add( "Content-type", "text/html" );
    String response = "<b>" + LocalDateTime.now() + "</b> for " + httpExchange.getRequestURI();
    httpExchange.sendResponseHeaders( HttpURLConnection.HTTP_OK, response.length() );

    try ( OutputStream os = httpExchange.getResponseBody() ) {
      os.write( response.getBytes( StandardCharsets.UTF_8.name() ) );
    }
  }
}