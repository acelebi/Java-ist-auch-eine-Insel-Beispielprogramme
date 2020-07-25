package com.tutego.insel.pattern.listener;

public class RadioDemo {
  
  public static void main( String args[] ) {
    Radio r = new Radio();
    
    class ComplainingAdListener implements AdListener {
      @Override public void advertisement( AdEvent e ) {
        System.out.println( "Oh nein, schon wieder Werbung: " + e.getSlogan() );
      }
    }
    
  r.addAdListener( new ComplainingAdListener() );
  }
}