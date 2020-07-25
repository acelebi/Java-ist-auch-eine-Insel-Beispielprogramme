package com.tutego.insel.javafx;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorDemo extends Application {

  @Override
  public void start( Stage stage ) {
    Group group = new Group();
    stage.setResizable( true );
    stage.setScene( new Scene( group, 400, 400 ) );
    Random r = new Random();
    for ( int y = 6; y <  stage.getScene().getHeight() - 25; y += 30 )
      for ( int x = 6; x < stage.getScene().getWidth() - 25; x += 30 ) {
        Rectangle rect = new Rectangle( x, y, 25, 25 );
        Color color = Color.rgb( r.nextInt( 256 ), r.nextInt( 256 ), r.nextInt( 256 ) );
        rect.setFill( color );
        rect.setStroke( color.grayscale() );
        group.getChildren().add( rect );
      }
  
    stage.show();
  }

  public static void main( String[] args ) {
    launch( args );
  }
}