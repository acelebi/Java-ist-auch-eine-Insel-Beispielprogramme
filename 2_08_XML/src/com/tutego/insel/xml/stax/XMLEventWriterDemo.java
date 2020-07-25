package com.tutego.insel.xml.stax;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;

public class XMLEventWriterDemo {
  public static void main( String[] args ) {
    // <?xml version="1.0"?>
    // <party datum="31.12.01">
    // <gast name="Albert Angsthase">
    // <getraenk>Wein</getraenk>
    // <getraenk>Bier</getraenk>
    // <zustand ledig="true" nuechtern="false"/>
    // </gast>
    // </party>

    // Erzeuge einen XMLStreamWriter
    try ( Writer out = Files.newBufferedWriter( Paths.get( "writenParty.xml" ), StandardCharsets.UTF_8 ) ) {
      XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter( out );
      XMLEventFactory eventFactory = XMLEventFactory.newInstance();

      XMLEvent header = eventFactory.createStartDocument();

      XMLEvent startRoot = eventFactory.createStartElement( "", "", "party" );
      XMLEvent datumAttribut = eventFactory.createAttribute( "datum", "31.12.01" );
      XMLEvent endRoot = eventFactory.createEndElement( "", "", "party" );

      XMLEvent startGast = eventFactory.createStartElement( "", "", "gast" );
      XMLEvent name = eventFactory.createAttribute( "name", "Albert Angsthase" );
      XMLEvent endGast = eventFactory.createEndElement( "", "", "gast" );

      // Anschließend werden XMLEvents für das Element <getraenk> erzeugt
      XMLEvent startGetraenk = eventFactory.createStartElement( "", "", "getraenk" );
      XMLEvent charWein = eventFactory.createCharacters( "Wein" );
      XMLEvent charBier = eventFactory.createCharacters( "Bier" );
      XMLEvent endGetraenk = eventFactory.createEndElement( "", "", "getraenk" );

      // Falls mehrere Attribute als Iterator vorliegen können diese auch
      // direkt einem Element zugeordnet werden.
      Collection<XMLEvent> zustaende = new ArrayList<>();
      XMLEvent ledig = eventFactory.createAttribute( "ledig", "true" );
      XMLEvent nuechtern = eventFactory.createAttribute( "nuechtern", "true" );
      zustaende.add( ledig );
      zustaende.add( nuechtern );
      XMLEvent startZustand = eventFactory.createStartElement( "", "", "zustand", zustaende.iterator(), null );
      XMLEvent endZustand = eventFactory.createEndElement( "", "", "zustand" );

      // Schreiben der Struktur
      XMLEvent endDocument = eventFactory.createEndDocument();
      writer.add( header );
      writer.add( startRoot );
      writer.add( datumAttribut );
      writer.add( startGast );
      writer.add( name );
      writer.add( endGast );
      writer.add( startGetraenk );
      writer.add( charWein );
      writer.add( endGetraenk );
      writer.add( startGetraenk );
      writer.add( charBier );
      writer.add( endGetraenk );
      writer.add( startZustand );
      writer.add( endZustand );
      writer.add( endRoot );
      writer.add( endDocument );

      writer.close();
    }
    catch ( IOException | XMLStreamException e ) {
      e.printStackTrace();
    }
  }
}