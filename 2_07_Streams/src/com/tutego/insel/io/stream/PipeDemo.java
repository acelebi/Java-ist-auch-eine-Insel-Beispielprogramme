package com.tutego.insel.io.stream;

import java.io.*;

class PipeRandomWriter extends PipedWriter implements Runnable {
  @Override public void run() {
    while ( true )
      try {
        write( String.format( "%f%n", Math.random() ) );
        Thread.sleep( 200 );
      }
      catch ( Exception e ) { e.printStackTrace(); }
  }
}

class PipeRandomReader extends PipedReader implements Runnable {
  @Override public void run() {
    BufferedReader br = new BufferedReader( this );
    while ( true )
      try {
        System.out.println( br.readLine() );
      }
      catch ( IOException e ) { e.printStackTrace(); }
  }
}

public class PipeDemo {
  public static void main( String[] args ) throws Exception {
    PipeRandomWriter out = new PipeRandomWriter();
    PipeRandomReader in  = new PipeRandomReader();

    in.connect( out );

    new Thread( out ).start();
    new Thread( in ).start();
  }
}