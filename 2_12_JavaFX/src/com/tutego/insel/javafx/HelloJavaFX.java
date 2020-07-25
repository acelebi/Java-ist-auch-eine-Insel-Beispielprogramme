package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.effect.Reflection;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

  public static void main( String[] args ) {
    launch( args );
  }

  @Override
  public void start( Stage stage ) {
    Text t = new Text( "Die Java-Insel grüßt JavaFX" );
    t.setX( 10.0f );
    t.setY( 50.0f );
    t.setFont( Font.font( "Calibri", FontWeight.NORMAL, 30 ) );
    t.setEffect( new Reflection() );

    Group root = new Group( t );
    Scene scene = new Scene( root, 400, 100 );
    stage.setScene( scene );
    stage.setTitle( "JavaFX Demo" );
    stage.show();
  }
}