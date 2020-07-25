package com.tutego.insel.ui.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonAction {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new FlowLayout() );

    Action exitAction = new AbstractAction( "Ende" ) {
      @Override public void actionPerformed( ActionEvent e ) {
        System.exit( 0 );
      }
    };

    JButton button2 = new JButton( exitAction );
    frame.add( button2 );

    frame.pack();
    frame.setVisible( true );
  }
}
