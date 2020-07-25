package com.tutego.insel.javafx;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.embed.swing.JFXPanel;
import javafx.scene.*;
import javafx.scene.chart.PieChart;
import javax.swing.*;

public class JFXPanelDemo
{
  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    final JFXPanel fxPanel = new JFXPanel();
    f.add( new JScrollPane( fxPanel ) );
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setBounds( 100, 100, 600, 600 );
    f.setVisible( true );

    Platform.runLater( new Runnable() {
      @Override public void run() {
        PieChart chart = new PieChart(
                          FXCollections.observableArrayList(
                            new PieChart.Data( "Java", 199 ),
                            new PieChart.Data( "Rest", 12 ) ) );
  
        fxPanel.setScene( new Scene( chart ) );
      }
    } );
  }
}
