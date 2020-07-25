package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.stage.Stage;

public class BarChartDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    CategoryAxis xAxis = new CategoryAxis();
    xAxis.setLabel( "Jahrgang" );

    NumberAxis yAxis = new NumberAxis( "Bevölkerung",
                                       0        /* lowerBound */,
                                       90000000 /* upperBound */,
                                       30000000 /* tickUnit */ );
   
    @SuppressWarnings( "unchecked" )
    ObservableList<XYChart.Data<String,Number>> series
        = FXCollections.observableArrayList(
           new XYChart.Data<String,Number>( "1950", 69346297 ),
           new XYChart.Data<String,Number>( "1960", 73146809 ),
           new XYChart.Data<String,Number>( "1970", 78069482 ),
           new XYChart.Data<String,Number>( "1980", 78397483 ),
           new XYChart.Data<String,Number>( "1990", 79753227 ),
           new XYChart.Data<String,Number>( "2000", 82259540 ),
           new XYChart.Data<String,Number>( "2009", 81802257 )
        );

    ObservableList<XYChart.Series<String,Number>> data =
         FXCollections.observableArrayList();
    data.add( new BarChart.Series<>( series ) );

    BarChart<String,Number> chart = new BarChart<>( xAxis, yAxis );
    chart.setTitle( "Bevölkerungsentwicklung in Deutschland" );
    chart.setData( data );

    stage.setScene( new Scene( new Group( chart ), 500, 400 ) );
    stage.show();
  }
  
  public static void main( String[] args )
  {
    launch( args );
  }
}
