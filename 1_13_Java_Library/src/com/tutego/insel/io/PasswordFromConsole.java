package com.tutego.insel.io;

import java.util.Arrays;

public class PasswordFromConsole {
  public static void main( String[] args ) {
    if ( System.console() != null ) {
      // Passwort einlesen
      char[] passwd = System.console().readPassword();
      // Passwort verarbeiten
      // …
      // Passwort im Speicher löschen
      Arrays.fill( passwd, (char) 0 );
    }
  }
}