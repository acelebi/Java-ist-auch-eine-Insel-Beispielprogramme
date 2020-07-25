package com.tutego.insel.javafx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class FillRuleDemo extends Application {

  public static void main( String[] args ) {
    launch( args );
  }

  private static Path makeRect( int x, int y, int width, int height ) {
    Path p = new Path(
      new MoveTo( x + width/2, y - height/2 ), new VLineTo( y + height/2 ),
      new HLineTo( x - width/2 ), new VLineTo( y - height/2 ),
      new ClosePath(),
      new MoveTo( x + width/4, y - height/4 ), new VLineTo( y + height/4 ),
      new HLineTo( x - width/4 ), new VLineTo( y - height/4 ),
      new ClosePath() );
  
    return p;
  }
  
  @Override
  public void start( Stage stage ) {
  
    Rectangle rect1 = new Rectangle( 70, 70, 130, 50 );
    rect1.setFill( Color.YELLOW );
  
    Path rect2 = makeRect( 100, 80, 50, 50 );
    rect2.setFill( Color.BLUE );
    rect2.setFillRule( FillRule.NON_ZERO );
  
    Path rect3 =  makeRect( 200, 80, 50, 50 );
    rect3.setFill( Color.RED );
    rect3.setFillRule( FillRule.EVEN_ODD );
  
    Group group = new Group( rect1, rect2, rect3 );
    stage.setScene( new Scene( group, 300, 200 ) );
    stage.show();
  }
}