package com.tutego.insel.xml.jaxb;

import java.util.*;
import javax.xml.bind.*;

public class SimplePlayerMarshaller {
  public static void main( String[] args ) {
    Player johnPeel = new Player();
    johnPeel.setName( "John Peel" );
    johnPeel.setBirthday( new GregorianCalendar(1939,Calendar.AUGUST,30).getTime() );
    
    JAXB.marshal( johnPeel, System.out );
  }
}