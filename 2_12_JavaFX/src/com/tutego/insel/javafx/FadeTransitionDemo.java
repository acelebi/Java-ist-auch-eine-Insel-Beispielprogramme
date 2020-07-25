package com.tutego.insel.javafx;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    final Button b = new Button( "Klick mich" );
    b.setOnAction( new EventHandler<ActionEvent>() { 
      @Override public void handle( ActionEvent e ) {
        FadeTransition t = new FadeTransition( Duration.seconds( 0.5 ), b );
        t.setFromValue( 1.0f );
        t.setToValue( 0.0f );
        t.play();
      }
    } );
    stage.setScene( new Scene( new Group( b ) ) );
    stage.show();
  }
  
  public static void main( String[] args )
  {
    launch( args );
  }
}
