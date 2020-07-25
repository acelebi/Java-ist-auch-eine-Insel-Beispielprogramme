package com.tutego.insel.ui.text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldDemo {
  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    final JTextField input = new JTextField( "12 * 3 + 2", 20 );
    input.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        try {
          input.setText( "" +
            new ScriptEngineManager().getEngineByName( "JavaScript" ).eval( input.getText() ) );
        }
        catch ( ScriptException ex ) {
          ex.printStackTrace();
        }
      }
    } );
    frame.add( input );
    frame.pack();
    frame.setVisible( true );
  }
}
