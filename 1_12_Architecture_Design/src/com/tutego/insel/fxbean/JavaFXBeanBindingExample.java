package com.tutego.insel.fxbean;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXBeanBindingExample extends Application {

  public static void main( String[] args ) {
    launch( args );
  }

  @Override
  public void start( Stage primaryStage ) {
    Slider slider = new Slider( 10, 100, 40 );
    Circle circle = new Circle();
    circle.radiusProperty().bind( slider.valueProperty() );
    TextField radius = new TextField();
    radius.textProperty().bind( slider.valueProperty().asString( "%.2f" ) );
    TextField area = new TextField();
    area.textProperty().bind( slider.valueProperty().multiply( slider.valueProperty() )
                                                    .multiply( Math.PI ).asString( "%.2f" ) );
    Node[] nodes = { slider, new Label( "Radius:" ), radius,
                     new Label( "Fläche:" ), area, circle };
    primaryStage.setScene( new Scene( new VBox( 4, nodes ), 300, 400 ) );
    primaryStage.show();
  }
}
