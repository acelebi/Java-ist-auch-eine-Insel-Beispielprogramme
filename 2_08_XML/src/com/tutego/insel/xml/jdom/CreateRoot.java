package com.tutego.insel.xml.jdom;

import org.jdom2.*;
import org.jdom2.output.XMLOutputter;

class CreateRoot {
  public static void main( String[] args ) throws Exception {
    Document doc = new Document( new Element( "party" ) );

    XMLOutputter fmt = new XMLOutputter();
    fmt.output( doc, System.out );
  }
}
