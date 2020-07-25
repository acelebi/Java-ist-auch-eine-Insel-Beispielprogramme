package com.tutego.insel.thread;

class DaemonThread extends Thread {
  DaemonThread() {
    setDaemon( true );
  }

  @Override
  public void run() {
    while ( true )
      System.out.println( "Lauf Thread, lauf" );
  }

  public static void main( String[] args ) {
    new DaemonThread().start();
  }
}
