package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

  @Override
  public void start( Stage stage )
  {
    GridPane grid = new GridPane();
    grid.setHgap( 10 );
    grid.setVgap( 10 );
    grid.setPadding( new Insets( 10, 10, 10, 10 ) );

    Label header = new Label( "Kontaktdaten" );
    header.setFont( new Font( 20 ) );
    GridPane.setHalignment( header, HPos.CENTER );

    grid.add( header,
              0 /*x*/, 0 /*y*/,
              2 /*colSpan*/, 1 /*rowSpan*/ );
    grid.add( new Label( "Vorname" ), 0, 1 );
    grid.add( new TextField(), 1, 1 );
    grid.add( new Label( "Nachname" ), 0, 2 );
    grid.add( new TextField(), 1, 2 );

    stage.setScene( new Scene( grid ) );
    stage.show();
  }

  public static void main( String[] args ) {
    launch( args );
  }
}