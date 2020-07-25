package com.tutego.insel.xml.jaxb;

import javax.xml.bind.JAXB;
import com.tutego.insel.xml.jaxb.weather.Cities;

public class Weather {
  public static void main( String[] args ) {
    String url = "http://api.openweathermap.org/data/2.5/find?q=Frankfurt&units=metric&mode=xml";
    Cities city = JAXB.unmarshal( url, Cities.class );
    System.out.printf( "%.1f° C%n", city.getList().getItem().getTemperature().getValue() );
  }
}