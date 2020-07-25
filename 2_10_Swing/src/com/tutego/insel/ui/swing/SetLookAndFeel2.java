package com.tutego.insel.ui.swing;

import java.awt.*;
import javax.swing.*;

public class SetLookAndFeel2 {
  public static void main( String[] args ) {
    try {
      // UIManager.setLookAndFeel( "javax.swing.plaf.metal.MetalLookAndFeel" );
      // UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
      // UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
      UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" );
    }
    catch ( ClassNotFoundException | InstantiationException |
            IllegalAccessException | UnsupportedLookAndFeelException e ) {
      e.printStackTrace();
    }

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    frame.add( new JButton( "Ask Dr. Bob" ) );

    frame.pack();
    frame.setVisible( true );

    for ( Frame f : Frame.getFrames() ) {
      SwingUtilities.updateComponentTreeUI( f );
      for ( Window w : f.getOwnedWindows() )
        SwingUtilities.updateComponentTreeUI( w );
    }
  }
}