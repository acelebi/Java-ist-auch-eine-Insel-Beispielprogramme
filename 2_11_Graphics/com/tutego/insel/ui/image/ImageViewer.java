package com.tutego.insel.ui.image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class ImageComponent extends JComponent {

  private static final long serialVersionUID = 8055865896136562197L;

  private BufferedImage image;

  public void setImage( BufferedImage image ) {
    this.image = image;
    setPreferredSize( new Dimension(image.getWidth(), image.getHeight()) );
    repaint();
    invalidate();
  }

  @Override
  protected void paintComponent( Graphics g ) {
    if ( image != null )
      g.drawImage( image, 0, 0, this );
  }
}

class FileOpenAction extends AbstractAction {
  
  private final ImageComponent viewComponent;

  public FileOpenAction( ImageComponent viewComponent ) {
    this.viewComponent = viewComponent;

    putValue( NAME,            "Öffnen" );
    putValue( ACCELERATOR_KEY, KeyStroke.getKeyStroke( KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK ) );
    putValue( MNEMONIC_KEY,    (int) 'f' );
  }

  @Override
  public void actionPerformed( ActionEvent e ) {
    JFileChooser fileDialog = new JFileChooser();
    fileDialog.setFileFilter( new FileNameExtensionFilter("*.jpg;*.gif", "jpg", "gif") );
    fileDialog.showOpenDialog( viewComponent );
    final File file = fileDialog.getSelectedFile();

    if ( file != null ) {
      new SwingWorker<BufferedImage, Void>() {
        @Override protected BufferedImage doInBackground() throws IOException {
          return ImageIO.read( file );
        }
        @Override protected void done() {
          try { viewComponent.setImage( get() ); } catch ( InterruptedException | ExecutionException e ) { }
        }
      }.execute();
    }
  }
}

public class ImageViewer {
  public static void main( String[] args ) {
    JFrame f = new JFrame( "Bildbetrachter" );

    ImageComponent imageComponent = new ImageComponent();
    f.add( new JScrollPane(imageComponent) );
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu( "Datei" );
    menu.setMnemonic( 'D' );
    menu.add( new JMenuItem( new FileOpenAction(imageComponent) ) );
    menuBar.add( menu );
    f.setJMenuBar( menuBar );

    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 600, 400 );
    f.setVisible( true );
  }
}
