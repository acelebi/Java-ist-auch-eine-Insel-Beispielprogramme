package com.tutego.insel.ui.swing;

import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIconDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new FlowLayout() );

    URL resource1 = ImageIconDemo.class.getResource( "/images/user-trash-full.png" );
    URL resource2 = ImageIconDemo.class.getResource( "/images/user-trash.png" );
    Icon icon1 = new ImageIcon( resource1 );
    Icon icon2 = new ImageIcon( resource2 );

    JButton button = new JButton();
    button.setIcon( icon1 );
    frame.add( button );
    frame.add( new JLabel( icon2 ) );

    frame.pack();
    frame.setVisible( true );
  }
}