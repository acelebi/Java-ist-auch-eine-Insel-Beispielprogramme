package com.tutego.insel.xml.jdom.xpath;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.*;

public class XPathDemo3 {
  public static void main( String[] args ) throws Exception {
    Document doc = new SAXBuilder().build( "party.xml" );
    XPathExpression<Object> xpath = XPathFactory.instance().compile( "/party/gast[1]/@name" );
    Object firstGuest = xpath.evaluateFirst( doc );
    System.out.println( ((Attribute) firstGuest).getValue() );
  }
}