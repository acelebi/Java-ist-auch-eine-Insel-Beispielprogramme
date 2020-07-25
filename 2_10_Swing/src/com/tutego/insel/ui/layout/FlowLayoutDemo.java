package com.tutego.insel.ui.layout;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    f.setLayout( new FlowLayout() );

    JComboBox<String> choice = new JComboBox<>();
    choice.addItem( "Mike: Mein Gott Walter" );
    choice.addItem( "Sweet: Co Co" );

    f.add( choice );
    f.add( new JButton( new ImageIcon( FlowLayoutDemo.class.getResource( "/images/play.png" ) ) ) );

    f.pack();
    f.setVisible( true );
  }
}