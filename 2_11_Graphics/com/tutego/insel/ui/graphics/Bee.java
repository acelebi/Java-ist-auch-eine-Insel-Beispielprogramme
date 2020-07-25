package com.tutego.insel.ui.graphics;

import java.awt.*;
import java.awt.event.*;

public class Bee extends Frame {

  private static final long serialVersionUID = -3800165321162121122L;

  public Bee() {
    setSize( 500, 100 );

    addWindowListener( new WindowAdapter() {
      @Override public void windowClosing( WindowEvent e ) {
        System.exit( 0 );
      }
    } );
  }

  @Override
  public void paint( Graphics g ) {
    g.drawString( "\"Maja, wo bist du?\" (Mittermeier)", 120, 60 );
  }

  public static void main( String[] args ) {
    new Bee().setVisible( true );
  }
}