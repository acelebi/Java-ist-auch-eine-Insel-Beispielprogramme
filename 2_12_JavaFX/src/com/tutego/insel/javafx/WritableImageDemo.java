package com.tutego.insel.javafx;

import java.io.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WritableImageDemo extends Application {

  private ImageView getImageView( String filename ) {
    try ( InputStream stream = getClass().getResourceAsStream( filename  ) ) {
      if ( stream == null )
        return new ImageView();
  
      Image img1 = new Image( stream );
      final WritableImage img2 = new WritableImage( img1.getPixelReader(),
                                    (int) img1.getWidth(), (int) img1.getHeight() );
      ImageView imageView = new ImageView( img2 );
  
      imageView.setOnMouseMoved( new EventHandler<MouseEvent>() {
        @Override public void handle( MouseEvent e ) {
          Color c = img2.getPixelReader().getColor( (int) e.getX(), (int) e.getY() );
          img2.getPixelWriter().setColor( (int) e.getX(), (int) e.getY(), c.invert() );
        }
      } );
      return imageView;
    }
    catch ( IOException e ) { // Exception von close()
      throw new UncheckedIOException( e );
    }
  }

  @Override
  public void start( Stage stage ) {
    stage.setScene( new Scene( new Group( getImageView( "/gatesInAlbuquerque.jpg" ) ) ) );
    stage.show();
  }

  public static void main( String[] args ) {
    launch( args );
  }
}