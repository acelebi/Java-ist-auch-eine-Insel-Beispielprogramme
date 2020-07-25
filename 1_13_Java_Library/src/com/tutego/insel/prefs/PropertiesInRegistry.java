package com.tutego.insel.prefs;

import java.io.*;
import java.util.prefs.*;

public class PropertiesInRegistry {
  static Preferences prefs = Preferences.userRoot().node( "/com/tutego/insel" );

  static void fillRegistry() {
    for ( Object o : System.getProperties().keySet() ) {
      String key = o.toString();

      if ( key.startsWith( "user." ) && !System.getProperty( key ).isEmpty() )
        prefs.put( key, System.getProperty( key ) );
    }
  }

  static void display() {
    try {
      for ( String key : prefs.keys() )
        System.out.println( key + ": " + prefs.get( key, "---" ) );
    }
    catch ( BackingStoreException e ) {
      System.err.println( "Knoten können nicht ausgelesen werden: " + e );
    }
  }

  static void saveAsXml() {
    ByteArrayOutputStream sos = new ByteArrayOutputStream();

    try {
      prefs.exportNode( sos );
      System.out.println( sos.toString() );
    }
    catch ( IOException | BackingStoreException e ) {
      System.err.println( "Knoten können nicht exportiert werden: " + e );
    }
  }

  static void clean() {
    try {
      prefs.removeNode();
    }
    catch ( BackingStoreException e ) {
      System.err.println( "Knoten können nicht gelöscht werden: " + e );
    }
  }

  static void addListener() {
    NodePreferenceChangeListener listener = new NodePreferenceChangeListener();

    prefs.addNodeChangeListener( listener );
    prefs.addPreferenceChangeListener( listener );
  }

  public static void main( String[] args ) {
    // addListener();
    fillRegistry();
    // display();
    // saveAsXml();
    // clean();
  }
}