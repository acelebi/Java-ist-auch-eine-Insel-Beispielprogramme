package com.tutego.insel.ui.text;

import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;

public class JBrowser extends JEditorPane implements HyperlinkListener {

  public JBrowser( String url ) {
    setEditable( false );
    addHyperlinkListener( this );

    try {
      setPage( new URL(url) );
    }
    catch ( IOException e ) { e.printStackTrace(); }
  }

  @Override public void hyperlinkUpdate( HyperlinkEvent event ) {
    HyperlinkEvent.EventType type = event.getEventType();

    if ( type == HyperlinkEvent.EventType.ACTIVATED ) {
      try {
        setPage( event.getURL() );
      }
      catch( IOException e ) {
        JOptionPane.showMessageDialog( this,
                                      "Kann dem Link nicht folgen: "
                                        + event.getURL().toExternalForm(),
                                      "Ladefehler",
                                      JOptionPane.ERROR_MESSAGE );
      }
    }
  }

  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 600, 500 );
    f.add( new JScrollPane(new JBrowser("http://computer.museum/")) );
    f.setVisible( true );
  }
}