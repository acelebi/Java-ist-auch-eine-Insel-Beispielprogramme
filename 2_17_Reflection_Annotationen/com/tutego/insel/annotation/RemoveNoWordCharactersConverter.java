package com.tutego.insel.annotation;

public class RemoveNoWordCharactersConverter implements ResourceConverter {
  @Override public String convert( String input ) {
    return input.replaceAll( "\\W", "" );
  }
}
