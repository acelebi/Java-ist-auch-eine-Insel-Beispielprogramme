package com.tutego.insel.ui.swing;

import javax.swing.*;

public class SwingNoSyncDemo
{
  public static void main( String[] args )
  {
    final DefaultListModel<String> model = new DefaultListModel<>();

    JFrame frame = new JFrame();
    frame.add( new JList<>( model ) );
    frame.setSize( 200, 100 );
    frame.setVisible( true );

    new Thread() {
      @Override public void run() {
        setPriority( Thread.MIN_PRIORITY );
        while ( true )
          model.addElement( "Dumm gelaufen" );
      }
    }.start();

    new Thread() {
      @Override public void run() {
        setPriority( Thread.MIN_PRIORITY );
        while ( true )
          model.removeElement( "Dumm gelaufen" );
      }
    }.start();
  }
}