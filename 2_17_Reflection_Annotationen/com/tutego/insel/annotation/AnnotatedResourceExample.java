package com.tutego.insel.annotation;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;

class Resources {

  @CurrentDateResource()
  public LocalDate now;

  @ListOfFilesResource( value = "c:/" )
  public Path[] files;

//  @UrlResource( "http://tutego.de/javabuch/aufgaben/bond.txt" )
//  public String testFile;

//  @UrlResource( value = "http://tutego.de/javabuch/aufgaben/bond.txt", upperLowerCase = UpperLowerCase.UPPERCASE, trim = true )
//  public String testFile;

  @UrlResource( value = "http://tutego.de/javabuch/aufgaben/bond.txt",
                converter = { RemoveNoWordCharactersConverter.class, SortConverter.class } )
  public String testFile;
}

public class AnnotatedResourceExample {
  public static void main( String[] args ) {
    Resources resources = ResourceReader.getInitializedInstance( Resources.class );
    System.out.println( resources.now );
    System.out.println( Arrays.toString( resources.files ) );
    System.out.println( resources.testFile );
  }
}
