package com.tutego.insel.ui.swing;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame( "Tolle Fernsehserien" );
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    Icon unchecked = new ImageIcon( JCheckBoxDemo.class.getResource( "/images/cancel.png" ) );
    Icon checked   = new ImageIcon( JCheckBoxDemo.class.getResource( "/images/ok.png" ) );

    JCheckBox cb1 = new JCheckBox( "Ein Colt für alle Fälle", true );
    cb1.setIcon( unchecked );
    cb1.setSelectedIcon( checked );
    f.add( cb1, BorderLayout.PAGE_START );

    JCheckBox cb2 = new JCheckBox( "MacGyver", false );
    cb2.setIcon( unchecked );
    cb2.setSelectedIcon( checked );
    f.add( cb2, BorderLayout.PAGE_END );

    ItemListener herosListener = new ItemListener() {
      @Override public void itemStateChanged( ItemEvent e ) {
        System.out.print( ((JCheckBox) e.getItem()).getText() );
        System.out.println( e.getStateChange() == ItemEvent.SELECTED ? " selected" : " unselected" ); 
      }
    };

    cb1.addItemListener( herosListener );
    cb2.addItemListener( herosListener );

    f.pack();
    f.setVisible( true );
  }
}
