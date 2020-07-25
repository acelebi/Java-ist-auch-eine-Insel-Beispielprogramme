package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ButtonSetOnActionDemo extends Application {

  @Override
  public void start( Stage stage )
  {
    final Button b = new Button( "OK" );
    b.setFont( Font.font( "Calibri", 30 ) );
    Image image = new Image( getClass().getResourceAsStream( "/images/ok.png" ) );
    b.setGraphic( new ImageView( image ) );
    b.setOnAction( new EventHandler<ActionEvent>() {
      @Override public void handle( ActionEvent e ) {
        b.setDisable( true );
      }
    } );

    stage.setScene( new Scene( b ) );
    stage.show();
  }

  public static void main( String[] args ) {
    launch( args );
  }
}