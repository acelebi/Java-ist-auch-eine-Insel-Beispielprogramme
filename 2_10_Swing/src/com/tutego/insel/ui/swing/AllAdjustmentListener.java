package com.tutego.insel.ui.swing;

import java.awt.Adjustable;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AllAdjustmentListener implements AdjustmentListener {
  @Override public void adjustmentValueChanged( AdjustmentEvent e ) {
    System.out.println( e.getAdjustable().getOrientation() == Adjustable.HORIZONTAL ?
                        "Adjustable.HORIZONTAL" : "Adjustable.VERTICAL" );

    switch ( e.getAdjustmentType() ) {
      case AdjustmentEvent.UNIT_INCREMENT:
        System.out.println( "AdjustmentEvent.UNIT_INCREMENT" );
        break;
      case AdjustmentEvent.UNIT_DECREMENT:
        System.out.println( "AdjustmentEvent.UNIT_DECREMENT" );
        break;
      case AdjustmentEvent.BLOCK_DECREMENT:
        System.out.println( "AdjustmentEvent.BLOCK_DECREMENT" );
        break;
      case AdjustmentEvent.BLOCK_INCREMENT:
        System.out.println( "AdjustmentEvent.BLOCK_INCREMENT" );
        break;
      case AdjustmentEvent.TRACK:
        System.out.println( "AdjustmentEvent.TRACK" );
        break;
    }
    System.out.println( " Wert: " + e.getValue() );
  }
}
