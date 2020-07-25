package com.tutego.insel.xml.stax;

import java.io.*;
import java.nio.file.*;
import javax.xml.stream.*;

public class XMLStreamWriterDemo {
  public static void main( String[] args ) {
    // <?xml version="1.0"?>
    // <party datum="31.12.01">
    // <gast name="Albert Angsthase">
    // <getraenk>Wein</getraenk>
    // <getraenk>Bier</getraenk>
    // <zustand ledig="true" nuechtern="false"/>
    // </gast>
    // </party>

    XMLOutputFactory factory = XMLOutputFactory.newInstance();

    try ( OutputStream stream = Files.newOutputStream( Paths.get( "writenParty.xml" ) ) ) {
      XMLStreamWriter writer = factory.createXMLStreamWriter( stream );

      // Der XML-Header wird erzeugt
      writer.writeStartDocument();

      // Zuerst wird das Wurzelelement mit einem Attribut geschrieben
      writer.writeStartElement( "party" );
      writer.writeAttribute( "datum", "31.12.01" );

      // Unter diesem Element wird das Element gast mit einem Attribut erzeugt
      writer.writeStartElement( "gast" );
      writer.writeAttribute( "name", "Albert Angsthase" );

      // Für diesen Gast werden die Getränke erzeugt
      writer.writeStartElement( "getraenk" );
      writer.writeCharacters( "Wein" );
      writer.writeEndElement();

      writer.writeStartElement( "getraenk" );
      writer.writeCharacters( "Bier" );
      writer.writeEndElement();

      // Zum Schluss wird noch das Element Zustand eingefügt
      writer.writeEmptyElement( "zustand" );
      writer.writeAttribute( "ledig", "true" );
      writer.writeAttribute( "nuechtern", "true" );
      writer.writeEndElement();

      // Das Element party muss geschlossen werden
      writer.writeEndElement();
      writer.writeEndDocument();

      // Das Dokument wird abgeschlossen
      writer.close();
    }
    catch ( IOException | XMLStreamException e )
    {
      e.printStackTrace();
    }
  }
}