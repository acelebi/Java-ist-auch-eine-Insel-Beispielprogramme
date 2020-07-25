package com.tutego.insel.annotation;

import java.lang.reflect.Field;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class ResourceReader {
  public static <T> T getInitializedInstance( Class<T> ressources ) {
    try {
      T obj = ressources.newInstance();

      for ( Field field : ressources.getFields() ) {
        if ( field.isAnnotationPresent( CurrentDateResource.class ) )
          field.set( obj, LocalDate.now() );

        else if ( field.isAnnotationPresent( ListOfFilesResource.class ) ) {
          Path dir = Paths.get( field.getAnnotation( ListOfFilesResource.class ).value() );
          field.set( obj, Files.list( dir ).toArray( Path[]::new ) );
        }
        else if ( field.isAnnotationPresent( UrlResource.class ) ) {
          String url = field.getAnnotation( UrlResource.class ).value();
          try ( Scanner scanner = new Scanner( new URL( url ).openStream() ) ) {
            String content = scanner.useDelimiter( "\\Z" ).next();
  
            if ( field.getAnnotation( UrlResource.class ).trim() )
              content = content.trim();
  
            switch ( field.getAnnotation( UrlResource.class ).upperLowerCase() ) {
              case UPPERCASE: content = content.toUpperCase(); break;
              case LOWERCASE: content = content.toLowerCase(); break;
              default: // Nichts zu tun
            }
  
            Class<? extends ResourceConverter>[] converterClasses =
              field.getAnnotation( UrlResource.class ).converter();
            for ( Class<? extends ResourceConverter> converterClass : converterClasses )
              content = converterClass.newInstance().convert( content );

            field.set( obj, content );
          }
        }
      }

      return obj;
    }
    catch ( Exception e ) {  // Ignoriere alle Ausnahmen
      return null;
    }
  }
}