package com.tutego.insel.thread;

class ThreadStopRecovery {
  @SuppressWarnings( "deprecation" )
  public static void main( String[] args ) {
    Runnable unstoppable = () -> {
      try {
        while ( true )
          System.out.println( "I Like To Move It." );
      }
      catch ( ThreadDeath td ) {
        System.out.println( "Das Leben ist nicht totzukriegen." );
        throw td;
      }
    };
    Thread t = new Thread( unstoppable );
    t.start();
    try {
      Thread.sleep( 2 );
    } catch ( Exception e ) { e.printStackTrace(); }
    t.stop();
  }
}
