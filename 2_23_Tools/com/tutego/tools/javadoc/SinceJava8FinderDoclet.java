package com.tutego.tools.javadoc;

import java.util.Arrays;
import java.util.function.Predicate;
import com.sun.javadoc.*;
import com.sun.tools.javadoc.Main;

public class SinceJava8FinderDoclet {

  public static boolean start( RootDoc root ) {
    for ( ClassDoc clazz : root.classes() )
      processClass( clazz );
    return true;
  }

  private static void processClass( ClassDoc clazz ) {
    Predicate<Tag> isJava18 = tag -> tag.text().matches( "(1\\.)?8" );

    if ( Arrays.stream( clazz.tags( "since" ) ).anyMatch( isJava18 ) )
      System.out.printf( "Neuer Typ %s%n", clazz );

    for ( MethodDoc method : clazz.methods() )
      if ( Arrays.stream( method.tags( "since" ) ).anyMatch( isJava18 ) )
        System.out.printf( "Neue Methode %s%n", method );

    for ( ConstructorDoc constructor : clazz.constructors() )
      if ( Arrays.stream( constructor.tags( "since" ) ).anyMatch( isJava18 ) )
        System.out.printf( "Neuer Konstruktor %s%n", constructor );

    for ( FieldDoc field : clazz.fields() )
      if ( Arrays.stream( field.tags( "since" ) ).anyMatch( isJava18 ) )
        System.out.printf( "Neues Attribut %s%n", field );
  }

  public static void main( String[] args ) {
    String[] params = {
        "-quiet", "-XDignore.symbol.file",
        "-doclet", SinceJava8FinderDoclet.class.getName(),
        "-sourcepath", "C:/Program Files/Java/jdk1.8.0/src/",
//        "java.lang",  // Nur java.lang
        "-subpackages", "java:javax"  // Alles rekursiv unter java.* und javax.*
    };
    Main.execute( params );
  }
}