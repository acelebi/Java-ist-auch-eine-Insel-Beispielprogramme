package com.tutego.insel.javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class FXMLDemo extends Application {

  @Override
  public void start( Stage stage ) throws IOException
  {
    Parent p = FXMLLoader.load( getClass().getResource( "covert2UpperCase.fxml" ) );
    stage.setScene( new Scene( p, 500, 400 ) );
    stage.show();
  }

  public static void main( String[] args ) {
    launch( args );
  }
}