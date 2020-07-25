package com.tutego.insel.xml.jaxb;

import java.net.URL;
import java.nio.file.Paths;
import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.validation.*;

public class ValidatingRoomUnmarshaller
{
  public static void main( String[] args ) throws Exception
  {
    JAXBContext context = JAXBContext.newInstance( Room.class );
    Unmarshaller unmarshaller = context.createUnmarshaller();
    SchemaFactory sf = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI );
    Schema schema = sf.newSchema( ValidatingRoomUnmarshaller.class.getResource( "/schema1.xsd" ) );
    unmarshaller.setSchema( schema );

    URL url = Paths.get( "invalid-room.xml" ).toUri().toURL();
    Room room = (Room) unmarshaller.unmarshal( url ); 
    System.out.println( room.getPlayers() );
  }
}
