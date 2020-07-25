package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.stage.Stage;

public class PieChartDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    ObservableList<PieChart.Data> data =
      FXCollections.observableArrayList(
        new PieChart.Data( "Black Sun", 123 ),
        new PieChart.Data( "Long Delight", 88 ),
        new PieChart.Data( "Careless Whisper", 45 ),
        new PieChart.Data( "Silky Milky", 30 ) );

    PieChart chart = new PieChart( data );
    chart.setTitle( "Die beliebtesten Haarpflegeprodukte" );

    stage.setScene( new Scene( chart ) );
    stage.show();
  }
  
  public static void main( String[] args )
  {
    launch( args );
  }
}
