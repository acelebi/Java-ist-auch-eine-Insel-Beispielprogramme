package com.tutego.insel.bundle;

import java.util.*;

//java -Duser.language=en InternationalHelloWorld
//Hello World.

public class InternationalHelloWorld {

  public static void main( String[] args ) {
    //    Locale.setDefault( new Locale("de", "CH") );
    Locale.setDefault( new Locale("de") );

    String baseName = "resources.HelloWorld";

    try {
      ResourceBundle bundle = ResourceBundle.getBundle( baseName );
      System.out.println( bundle.getString("Hello") );
      System.out.println( bundle.getString("Bye") );
    }
    catch ( MissingResourceException e ) {
      System.err.println( e );
    }
  }
}
