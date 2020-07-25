package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    WebView htmlViewer1 = new WebView();
    htmlViewer1.getEngine().loadContent( "<html>Hallo <b>WebView</b>.</html>" );
    
    WebView htmlViewer2 = new WebView();
    htmlViewer2.getEngine().load( "http://javafx.com/" );
    
    SplitPane splitPane = new SplitPane();
    ScrollPane scrollPane = new ScrollPane( htmlViewer2 );
    scrollPane.setFitToWidth( true );
    splitPane.getItems().addAll( htmlViewer1, scrollPane );
    splitPane.setDividerPositions( 0.2f );
    stage.setScene( new Scene( splitPane ) );
    stage.show();
  }
  
  public static void main( String[] args )
  {
    launch( args );
  }
}
