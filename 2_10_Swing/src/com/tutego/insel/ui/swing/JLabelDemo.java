package com.tutego.insel.ui.swing;

import java.awt.Color;
import javax.swing.*;

public class JLabelDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JLabel l = new JLabel( "Lebe immer First-Class, sonst tun es deine Erben!" );
    l.setForeground( Color.BLUE );
    frame.add( l );

    frame.pack();
    frame.setVisible( true );
  }
}