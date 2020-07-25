package com.tutego.insel.util.concurrent;

import java.io.File;
import java.util.concurrent.*;

import javax.swing.JOptionPane;

public class LoggingInQueue {

  private static final BlockingQueue<String> messages =
    new LinkedBlockingQueue<>();

  private static class MessageOutputter extends Thread {
    @Override public void run() {
      while ( true )
        try        {
          long startTime = System.currentTimeMillis();
          System.out.printf( "%s (Wartete %d ms)%n",
                             messages.take(),
                             System.currentTimeMillis() - startTime );
        }
        catch ( InterruptedException e ) { }
    }
  }

  private static class UserMessageProducer extends Thread {
    @Override public void run() {
      for( int i = 0; ; i++ )
        messages.add( "msg " + i + " " +
                      JOptionPane.showInputDialog( "Meldung eingeben" ) );
    }
  }

  private static class DiskspaceMessageProducer extends Thread {
    @Override public void run() {
      for( int i = 0; ; i++ ) {
        String dir = System.getProperty( "user.dir" );
        messages.add( "spc " + i + " " + new File( dir ).getFreeSpace() );
        try { TimeUnit.SECONDS.sleep( 1 ); }
        catch ( InterruptedException e ) { }
      }
    }
  }

  public static void main( String[] args ) {
    new MessageOutputter().start();
    new UserMessageProducer().start();
    new DiskspaceMessageProducer().start();
  }
}