package com.tutego.insel.logging.log4j;

import org.apache.log4j.*;

public class Log4jDemo {

  private final static Logger log = Logger.getLogger( Log4jDemo.class );

  public static void main( String[] args ) {
//     BasicConfigurator.configure();
    //
    log.info( "Dann mal los." );

    try {
      ((Object) null).toString();
    }
    catch ( Exception e ) {
      log.error( "oh oh", e );
    }

    log.info( "Ging alles glatt." );
  }
}