package com.tutego.insel.javafx;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CubicCurveDemo extends Application
{
  @Override
  public void start( Stage stage )
  {
    double startX = 200, startY = 200;
    DoubleProperty controlX1 = new SimpleDoubleProperty( 20 );
    DoubleProperty controlY1 = new SimpleDoubleProperty( 20 );
    DoubleProperty controlX2 = new SimpleDoubleProperty( 400 );
    DoubleProperty controlY2 = new SimpleDoubleProperty( 20 );
    double endX = 300, endY = 200;
  
    // Linie von [controlX1, controlY1] nach [startX, startY]
    Line line1 = new Line( 0, 0, startX, startY );
    line1.startXProperty().bind( controlX1 );
    line1.startYProperty().bind( controlY1 );
    line1.setStrokeWidth( 2 );
  
    // Linie von [controlX2, controlY2] nach [endX, endY]
    Line line2 = new Line( 0, 0, endX, endY );
    line2.startXProperty().bind( controlX2 );
    line2.startYProperty().bind( controlY2 );
    line2.setStrokeWidth( 2 );
  
    // Animierte Kontrollpunkte
    Timeline timeline = new Timeline( new KeyFrame( Duration.millis( 1000 ),
                                        new KeyValue( controlX1, 300 ),
                                        new KeyValue( controlY2, 300 ) ) );
    timeline.setCycleCount( Timeline.INDEFINITE );
    timeline.setAutoReverse( true );
    timeline.play();
  
    CubicCurve curve = new CubicCurve( startX, startY, 0, 0, 0, 0, endX, endY );
    curve.controlX1Property().bind( controlX1 );
    curve.controlY1Property().bind( controlY1 );
    curve.controlX2Property().bind( controlX2 );
    curve.controlY2Property().bind( controlY2 );
    curve.setFill( null );
    curve.setStroke( Color.BLUEVIOLET );
    curve.setStrokeWidth( 3 );
  
    stage.setScene( new Scene( new Group( line1, line2, curve ), 450, 300 ) );
    stage.show();
  }

  public static void main( String[] args )
  {
    launch( args );
  }
}