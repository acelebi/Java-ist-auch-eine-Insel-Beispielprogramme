package com.tutego.insel.io.ser;

import java.io.*;

class Base implements Serializable {

  private void writeObject( ObjectOutputStream oos ) {
    System.err.println( "Base" );
  }
}

public class WriteTop extends Base {
  
  public static void main( String[] args ) throws IOException {
    try ( ObjectOutputStream oos = new ObjectOutputStream( System.out ) ) {
      oos.writeObject( new WriteTop() );
    }
  }

  private void writeObject( ObjectOutputStream oos ) {
    System.err.println( "Top" );
  }
}
