package com.tutego.insel.ui.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class JTabbedPaneDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.addTab( "Reiter 1", new JButton( "Reiter 1" ) );
    tabbedPane.addTab( "Reiter 2", new JTextArea() );

    frame.add( tabbedPane );

    frame.pack();
    frame.setVisible( true );
  }
}