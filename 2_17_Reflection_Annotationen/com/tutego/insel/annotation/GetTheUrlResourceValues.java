package com.tutego.insel.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.xml.bind.annotation.XmlValue;

import com.tutego.insel.annotation.UrlResource.UpperLowerCase;

public class GetTheUrlResourceValues {

  @UrlResource( value = "http://tutego.de/javabuch/aufgaben/bond.txt",
                upperLowerCase = UpperLowerCase.UPPERCASE, trim = true,
                converter = { RemoveNoWordCharactersConverter.class, SortConverter.class } )
  public String testFile;

  @XmlValue @Deprecated
  public String xmlValue;

  public static void main( String[] args ) throws Exception {
    for ( Field field : GetTheUrlResourceValues.class.getFields() )
      for ( Annotation a : field.getAnnotations() )
        System.out.println( a );
  }
}