package com.tutego.insel.xml.stax;

import javax.xml.stream.EventFilter;
import javax.xml.stream.events.XMLEvent;

/**
 * A filter who ignores closing tags.
 */
public class PartyEventFilter implements EventFilter {
  /**
   * The filter will just accept closing tags.
   * 
   * @param event The event from the EventReader.
   * @return {@code true} if element is not an end tag, {@code false} otherwise.
   */
  @Override
  public boolean accept( XMLEvent event ) {
    return !event.isEndElement();
  }
}
