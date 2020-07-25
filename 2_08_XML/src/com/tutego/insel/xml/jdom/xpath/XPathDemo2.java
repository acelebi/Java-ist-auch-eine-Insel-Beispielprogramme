package com.tutego.insel.xml.jdom.xpath;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.*;

public class XPathDemo2 {
  public static void main( String[] args ) throws Exception {
    Document doc = new SAXBuilder().build( "party.xml" );
    XPathExpression<Object> xpath = XPathFactory.instance().compile( "/party/gast/getraenk" );
    for ( Object object : xpath.evaluate( doc ) )
      System.out.println( ((Element)object).getValue() );
  }
}