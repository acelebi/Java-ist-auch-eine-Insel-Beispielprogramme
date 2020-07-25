package com.tutego.insel.javafx;

import java.util.PrimitiveIterator.OfInt;
import java.util.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ShapeDemo extends Application {

  @Override
  public void start( Stage stage ) {
    Shape text = new Text( 10, 50, "Die Java-Insel grüßt JavaFX" );
    Shape arc = new Arc( 100, 100, 20, 40, 0, 180 );
    Shape circle = new Ellipse( 100, 200, 20, 20 );
    OfInt rnd = new Random().ints( 10, 780 ).iterator();
    Shape poly1 = new Polyline( rnd.nextInt(), rnd.nextInt(), rnd.nextInt(),
                                rnd.nextInt(), rnd.nextInt(), rnd.nextInt() );
    Shape poly2 = new Polygon( rnd.nextInt(), rnd.nextInt(), rnd.nextInt(),
                               rnd.nextInt(), rnd.nextInt(), rnd.nextInt() );
    SVGPath svg = new SVGPath();
    svg.setContent( "M300 50 L175 200 L425 200 Z" );
    
    Group group = new Group( text, arc, circle, poly1, poly2, svg );
    stage.setScene( new Scene( group, 800, 800 ) );
    stage.show();
  }
  
  public static void main( String[] args ) {
    launch( args );
  }
}