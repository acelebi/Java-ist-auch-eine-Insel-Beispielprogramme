package com.tutego.insel.net;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class MulClient {

  @SuppressWarnings( "resource" ) // try-mit-Ressourcen schließt Socket
  public static void main( String[] args ) throws IOException {

    // Berechne 2 * 4
    try ( Socket socket = new Socket( "localhost", 3141 ) ) { 
      Scanner in = new Scanner( socket.getInputStream(), StandardCharsets.UTF_8.name() );
      PrintWriter out = new PrintWriter( new OutputStreamWriter( socket.getOutputStream(), StandardCharsets.UTF_8.name() ), true );

      out.println( "2" );
      out.println( "4" );
      System.out.println( in.nextLine() );
    }
    
    // Berechne 23895737895 * 434589358935857
    try ( Socket socket = new Socket( "localhost", 3141 ) ) { 
      Scanner in = new Scanner( socket.getInputStream(), StandardCharsets.UTF_8.name() );
      PrintWriter out = new PrintWriter( new OutputStreamWriter( socket.getOutputStream(), StandardCharsets.UTF_8.name() ), true );

      out.println( "23895737895" );
      out.println( "434589358935857" );
      System.out.println( in.nextLine() );
    }
  }
}