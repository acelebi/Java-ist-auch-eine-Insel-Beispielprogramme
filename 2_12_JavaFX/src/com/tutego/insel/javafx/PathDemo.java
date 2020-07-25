package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class PathDemo extends Application {

  public static void main( String[] args ) {
    launch( args );
  }

  @Override
  public void start( Stage stage ) {
    Shape path = new Path( new MoveTo( 10, 10 ), new LineTo( 100, 20 ) );
//    Path path = new Path();
//    path.getElements().add( new MoveTo( 10, 10 ) );
//    path.getElements().add( new LineTo( 100, 20 ) );
    Group group = new Group( path );
    stage.setScene( new Scene( group ) );
    stage.show();
  }
}