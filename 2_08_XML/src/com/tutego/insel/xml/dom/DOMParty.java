package com.tutego.insel.xml.dom;

import java.io.InputStream;
import java.nio.file.*;
import javax.xml.parsers.*;
import org.w3c.dom.Document;

public class DOMParty {
  public static void main( String[] args ) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    try ( InputStream in = Files.newInputStream( Paths.get( "party.xml" ) ) ) {
      Document document = builder.parse( in );
      System.out.println( document.getFirstChild().getTextContent() );
    }
  }
}