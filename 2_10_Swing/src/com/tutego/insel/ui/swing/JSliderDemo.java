package com.tutego.insel.ui.swing;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setLayout( new GridLayout( 4, 0, 0, 7 ) );

    JSlider slider1 = new JSlider( 0, 100, 50 );
    frame.add( slider1 );

    JSlider slider2 = new JSlider( 0, 100, 50 );
    slider2.setPaintTicks( true );
    slider2.setMinorTickSpacing( 5 );
    frame.add( slider2 );

    JSlider slider3 = new JSlider( 0, 100, 50 );
    slider3.setPaintTicks( true );
    slider3.setMajorTickSpacing( 10 );
    frame.add( slider3 );

    JSlider slider4 = new JSlider( 0, 100, 50 );
    slider4.setPaintTicks( true );
    slider4.setMajorTickSpacing( 10 );
    slider4.setMinorTickSpacing( 2 );
    slider4.setPaintTrack( false );
    slider4.addChangeListener( new ChangeListener() {
      @Override public void stateChanged( ChangeEvent e ) {
        System.out.println( ((JSlider) e.getSource()).getValue() );
      }
    } );
    frame.add( slider4 );

    frame.pack();
    frame.setVisible( true );
  }
}
