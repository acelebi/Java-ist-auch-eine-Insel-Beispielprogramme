package com.tutego.insel.xml.stax;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import javax.xml.stream.*;

public class XMLStreamReaderDemo {
  public static void main( String[] args ) {
    try ( Reader in = Files.newBufferedReader( Paths.get( "party.xml" ), StandardCharsets.UTF_8 ) ) {
      XMLStreamReader parser = XMLInputFactory.newInstance().createXMLStreamReader( in );

      StringBuilder spacer = new StringBuilder();
      
      while ( parser.hasNext() ) {
        System.out.println( "Event: " + parser.getEventType() );
      
        switch ( parser.getEventType() )
        {
          case XMLStreamConstants.START_DOCUMENT:
            System.out.println( "START_DOCUMENT: " + parser.getVersion() );
            break;
            
          case XMLStreamConstants.END_DOCUMENT:
            System.out.println( "END_DOCUMENT: " );
            parser.close();
            break;
            
          case XMLStreamConstants.NAMESPACE:
            System.out.println( "NAMESPACE: " + parser.getNamespaceURI() );
            break;
            
          case XMLStreamConstants.START_ELEMENT:
            spacer.append( "  " );
            System.out.println( spacer + "START_ELEMENT: " + parser.getLocalName() );
      
            // Der Event XMLStreamConstants.ATTRIBUTE wird nicht geliefert!
            for ( int i = 0; i < parser.getAttributeCount(); i++ )
              System.out.println( spacer + "  Attribut: "
                                  + parser.getAttributeLocalName( i )
                                  + " Wert: " + parser.getAttributeValue( i ) );
            break;
      
          case XMLStreamConstants.CHARACTERS:
            if ( ! parser.isWhiteSpace() )
              System.out.println( spacer + "  CHARACTERS: " + parser.getText() );
            break;
      
          case XMLStreamConstants.END_ELEMENT:
            System.out.println( spacer + "END_ELEMENT: " + parser.getLocalName() );
            spacer.delete( (spacer.length() - 2), spacer.length() );
            break;
      
          default:
            break;
        }
        parser.next();
      }
      parser.close();
    }
    catch ( IOException | XMLStreamException e ) {
      e.printStackTrace();
    }
  }
}