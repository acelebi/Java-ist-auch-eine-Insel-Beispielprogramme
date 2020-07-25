package com.tutego.insel.xml.jdom;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

class ReadXmlFile {
  public static void main( String[] args ) throws IOException, JDOMException {

    try ( Reader in = Files.newBufferedReader( Paths.get( "party.xml" ), StandardCharsets.UTF_8 ) ) {
      Document doc = new SAXBuilder().build( in );
      XMLOutputter fmt = new XMLOutputter();
      fmt.output( doc, System.out );
    }
  }
}
