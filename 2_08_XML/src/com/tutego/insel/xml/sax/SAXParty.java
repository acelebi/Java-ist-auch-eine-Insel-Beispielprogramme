package com.tutego.insel.xml.sax;

import java.io.InputStream;
import java.nio.file.*;
import javax.xml.parsers.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParty
{
  public static void main( String[] args ) throws Exception
  {
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser = factory.newSAXParser();
    DefaultHandler handler = new PartyHandler();
    try ( InputStream in = Files.newInputStream( Paths.get( "party.xml" ) ) ) {
      saxParser.parse( in, handler );
    }
  }
}
