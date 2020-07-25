package com.tutego.insel.thread;

public class SleepInInnerClass {
  public static void main( String[] args ) {
    new Thread() {
      @Override
      public void run() {
        try {
          Thread.sleep( 2000 );
          System.out.println( "Zeit ist um." );
        }
        catch ( InterruptedException e ) {
          e.printStackTrace();
        }
      }
    }.start();
  }
}
