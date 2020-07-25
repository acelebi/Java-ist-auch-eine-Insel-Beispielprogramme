package com.tutego.insel.ui.event;

import java.awt.event.*;
import java.util.concurrent.*;
import javax.swing.*;

public class SwingWorkerDemo extends JFrame {
  private JButton button = new JButton( "Change my mind!" );

  SwingWorkerDemo() {
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    add( button );

    ActionListener al = new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        new ClockPrecision().execute();
      }
    };

    button.addActionListener( al );

    pack();
  }

  class ClockPrecision extends SwingWorker<Long,Object> {
    @Override public Long doInBackground() {
      long startNano = System.nanoTime();
      try {
        TimeUnit.SECONDS.sleep( 2 );
      }
      catch ( InterruptedException e ) { }
      return (System.nanoTime() - startNano) / (1000 * 1000);
    }

    @Override protected void done() {
      try {
        button.setText( "" + get() );
      }
      catch ( InterruptedException | ExecutionException e ) {
        e.printStackTrace();
      }
    }
  }

  public static void main( String[] args ) {
    new SwingWorkerDemo().setVisible( true );
  }
}