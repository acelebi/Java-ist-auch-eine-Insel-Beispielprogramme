package com.tutego.insel.xml.jaxb;

import java.util.*;
import javax.xml.bind.*;

public class PlayerMarshaller {
  public static void main( String[] args ) throws Exception {
    Player johnPeel = new Player();
    johnPeel.setName( "John Peel" );
    johnPeel.setBirthday( new GregorianCalendar(1939,Calendar.AUGUST,30).getTime() );
    
    JAXBContext context = JAXBContext.newInstance( Player.class );
    Marshaller m = context.createMarshaller();
    m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
    m.marshal( johnPeel, System.out );
  }
}