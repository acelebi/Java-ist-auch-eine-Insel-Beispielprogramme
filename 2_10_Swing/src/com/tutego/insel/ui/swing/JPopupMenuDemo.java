package com.tutego.insel.ui.swing;

import java.awt.event.*;
import javax.swing.*;

public class JPopupMenuDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    final JPopupMenu popmen = new JPopupMenu();
    final JTextArea textArea = new JTextArea();

    f.add( new JScrollPane(textArea) );

    popmen.add( new JMenuItem( "Kompaktstaubsauger" ) );
    popmen.addSeparator();

    for ( String s : ("AEG Vampyrino SX,Electrolux Clario Z 1941," + 
                     "Quelle Privileg Piccolino,Siemens Super T120VS12A00," +
                     "Hoover Micro Power Electronic SC 150,Rowenta dymbo RS 014").split(",") ) {
      popmen.add( new AbstractAction(s) {
        @Override public void actionPerformed( ActionEvent e ) {
          textArea.append( e.getActionCommand() + "\n" );
        }
      } );
    }

    textArea.addMouseListener( new PopupMenuMouseListener(popmen) );

    f.setSize( 300, 300 );
    f.setVisible( true );
  }
}