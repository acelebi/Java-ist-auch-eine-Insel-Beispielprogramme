package com.tutego.insel.pattern.listener;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.event.EventListenerList;

public class Radio {
  
  /** List of listeners. */
  private EventListenerList listeners = new EventListenerList();

  /** All advertisements. */
  private List<String> ads = Arrays.asList( "Jetzt explodiert auch der Haarknoten",
                                            "Red Fish verleiht Flossen",
                                            "Bom Chia Wowo",
                                            "Wunder Whip. Iss milder." );

  /** Radio with frequent ads. */
  public Radio() {
    new Timer().schedule( new TimerTask() {
      @Override public void run() {
        Collections.shuffle( ads );
        notifyAdvertisement( new AdEvent( this, ads.get(0) ) );
      }
    }, 0, 500 );
  }

  /**
   * Adds an {@code AdListener} to the radio.
   * @param l the {@code AdListener} to be added
   */
  public void addAdListener( AdListener listener ) {
    listeners.add( AdListener.class, listener );
  }

  /**
   * Removes an {@code AdListener} from the radio.
   * @param l the listener to be removed
   */
  public void removeAdListener( AdListener listener ) {
    listeners.remove( AdListener.class, listener );
  }

  /**
   * Notifies all {@code AdListener}s that have registered interest for
   * notification on an {@code AdEvent}.
   * @param event  the {@code AdEvent} object
   * @see EventListenerList
   */
  protected synchronized void notifyAdvertisement( AdEvent event ) {
    for ( AdListener l : listeners.getListeners( AdListener.class ) )
      l.advertisement( event );
  }
}