package com.tutego.insel.net;

import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MulServer {

  public static void main( String[] args ) throws IOException {
    try ( ServerSocket server = new ServerSocket( 3141 ) ) {
      while ( true )
        try ( Socket client = server.accept() ) {
          handleConnection( client );
        }
        catch ( IOException e ) {
          e.printStackTrace();
        }
    }
  }
  
  @SuppressWarnings( "resource" ) // Socket wird in main() geschlossen
  private static void handleConnection( Socket client ) throws IOException {
    Scanner in = new Scanner( client.getInputStream(), StandardCharsets.UTF_8.name() );
    String factor1 = in.nextLine();
    String factor2 = in.nextLine();
    PrintWriter out = new PrintWriter( new OutputStreamWriter( client.getOutputStream(), StandardCharsets.UTF_8.name() ), true );
    out.println( new BigInteger( factor1 ).multiply( new BigInteger( factor2 ) ) );
    out.flush();
  }
}