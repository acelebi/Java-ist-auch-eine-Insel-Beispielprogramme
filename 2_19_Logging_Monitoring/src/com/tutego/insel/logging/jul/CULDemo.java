package com.tutego.insel.logging.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CULDemo {

  private static final Logger log = Logger.getLogger( CULDemo.class.getName() );

  public static void main( String[] args ) {
    log.fine( "Dann mal los." );

    try {
      ((Object) null).toString();
    }
    catch ( Exception e ) {
      log.log( Level.SEVERE, "oh oh", e );
    }

    log.info( "Ging alles glatt." );
  }
}