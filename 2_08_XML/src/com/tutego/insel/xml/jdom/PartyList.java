package com.tutego.insel.xml.jdom;

import java.util.*;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

class PartyList {
  public static void main( String[] args ) throws Exception {
    Document doc = new SAXBuilder().build( "party.xml" );

    Element party = doc.getRootElement();

    List<Content> partyInfo = party.getContent();
    Iterator<Content> partyIterator = partyInfo.iterator();
    while ( partyIterator.hasNext() )
      System.out.println( partyIterator.next() );
  }
}
