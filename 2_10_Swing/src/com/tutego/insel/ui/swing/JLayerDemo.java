package com.tutego.insel.ui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.plaf.LayerUI;

public class JLayerDemo {
  public static void main( String[] args ) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setLayout( new BorderLayout( 2, 2 ) );

    f.add( new JSeparator(), BorderLayout.PAGE_START );
    f.add( new JLabel( "Name:" ), BorderLayout.LINE_START );

    final JTextField textField = new JTextField();

    LayerUI<JComponent> layerUI = new LayerUI<JComponent>() {
      @Override public void paint( Graphics g, JComponent component ) {
        super.paint( g, component );

        if ( textField.getText().equalsIgnoreCase( "pu" ) ) {
          g.setColor( new Color( 255, 0, 0, 100 ) );
          g.fillOval( 0, component.getHeight() - 10, 10, 10 );
        }
      }
    };

    JLayer<JComponent> layer = new JLayer<>( textField );
    layer.setUI( layerUI );
    f.add( layer );
    f.add( new JSeparator(), BorderLayout.PAGE_END );

    f.pack();
    f.setVisible( true );
  }
}
