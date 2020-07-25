package com.tutego.insel.javafx;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ParallelTransitionDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    final Button b = new Button( "Klick mich" );
    b.setOnAction( new EventHandler<ActionEvent>() { 
      @Override public void handle( ActionEvent e ) {
        ScaleTransition t1 = new ScaleTransition( Duration.seconds( 2 ), b );
        t1.setToY( 0 );

        FadeTransition t2 = new FadeTransition( Duration.seconds( 2 ), b );
        t2.setToValue( 0.0f );

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll( t1, t2 );
        parallelTransition.play();
      }
    } );
    stage.setScene( new Scene( b ) );
    stage.show();
  }
  
  public static void main( String[] args )
  {
    launch( args );
  }
}
