package com.tutego.insel.ui.swing;

import javax.swing.*;

public class Tooltip {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    String text = "<html>Ich brauch' Hilfe.<p>Schnell!</html>";
    JButton button = new JButton( text );

    String help = "<html>Hier ist sie, die <b>Hilfe:</b>"
                  + "<ul><li>Cool bleiben<li>Handbuch lesen</ul></html>";
    button.setToolTipText( help );

    frame.add( button );
    frame.setSize( 250, 250 );
    frame.setVisible( true );
  }
}
