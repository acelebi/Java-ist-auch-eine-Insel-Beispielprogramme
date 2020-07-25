package com.tutego.insel.io.ser;

import java.io.*;

@SuppressWarnings( "serial" )
class NotTransientNotSerializable implements Serializable {

  Thread t = new Thread();
  // transient Thread t = new Thread();
  String s = "Fremde sind Freunde, die man nur noch nicht kennengelernt hat.";
}

public class SerializeTransient {
  public static void main( String[] args ) {
    try ( OutputStream bytearray = new ByteArrayOutputStream();
          ObjectOutputStream oos = new ObjectOutputStream( bytearray ) ) {
      oos.writeObject( new NotTransientNotSerializable() );
      System.out.println( bytearray.toString() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}