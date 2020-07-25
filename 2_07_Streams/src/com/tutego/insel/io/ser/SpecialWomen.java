package com.tutego.insel.io.ser;

import java.io.*;

public class SpecialWomen implements Serializable {

  private static final long serialVersionUID = 2584203323009771108L;

  String name = "Madonna";
  transient int age = 30;

  private void writeObject( ObjectOutputStream oos ) throws IOException {
    oos.defaultWriteObject(); // Schreibe Name, aber kein Alter
  }

  private void readObject( ObjectInputStream ois ) throws IOException {
    try {
      ois.defaultReadObject(); // Lies Name, aber kein Alter
      age = 30;
    }
    catch ( ClassNotFoundException e ) {
      throw new IOException( "No class found. HELP!!" );
    }
  }
}
