package com.tutego.insel.ui.awt;

import java.awt.Frame;

public class HelloAwtFrame {
  public static void main( String[] args ) {
    Frame f = new Frame( "Das Fenster zur Welt" );
    f.setSize( 300, 200 );
    f.setVisible( true );
  }
}