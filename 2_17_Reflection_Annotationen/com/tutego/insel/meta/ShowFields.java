package com.tutego.insel.meta;

import java.lang.reflect.Field;

class ShowFields {
  public static void main( String[] args ) {
    Class<?> c = java.text.SimpleDateFormat.class;

    System.out.println( "class " + c.getName() + " {" );

    for ( Field publicField : c.getFields() ) {
      String fieldName = publicField.getName();
      String fieldType = publicField.getType().getName();
      System.out.printf( "  %s %s;%n", fieldType, fieldName);

//      System.out.println( "  " + publicField + ";" );
    }
    System.out.println( "}" );
  }
}
