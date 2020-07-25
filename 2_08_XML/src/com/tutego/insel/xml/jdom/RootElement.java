package com.tutego.insel.xml.jdom;

import java.io.IOException;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

class RootElement {
  public static void main( String[] args ) throws JDOMException, IOException {
    SAXBuilder builder = new SAXBuilder();
    Document doc = builder.build( "party.xml" );

    Element party = doc.getRootElement();

    System.out.println( "Wurzelelement: " + party.toString() );

    XMLOutputter fmt = new XMLOutputter();
    fmt.output( doc, System.out );
  }
}