package com.tutego.insel.javafx;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScaleTransitionDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    final Button button = new Button( "Klick mich" );
    button.setOnAction( new EventHandler<ActionEvent>() { 
      @Override public void handle( ActionEvent e ) {
        ScaleTransition t = new ScaleTransition( Duration.seconds( 2 ), button );
        t.setFromX( 1 );
        t.setFromY( 1 );
        t.setToX( 2 );
        t.setToY( 0 );
        t.play();
      }
    } );
  
    stage.setScene( new Scene( new VBox( new Label("Vor"), button, new Label("Nach") ) ) );
    stage.show();
  }
  
  public static void main( String[] args )
  {
    launch( args );
  }
}
