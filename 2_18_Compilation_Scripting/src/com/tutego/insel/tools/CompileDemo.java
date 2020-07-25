package com.tutego.insel.tools;

import java.net.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileDemo {

  public static void main( String[] args ) throws Exception {
    
    Path javaSrc = Paths.get( "A.java" );
    
    Files.write( javaSrc,
                 Collections.singleton( "class A { static { System.out.println(\"Java Compiler API\"); } }" ),
                 StandardCharsets.UTF_8 );
    
    //
    
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

    try ( StandardJavaFileManager fm = compiler.getStandardFileManager(
            null /*DiagnosticListener*/, null /*Locale*/, null /*Charset*/ ) ) {
      Iterable<? extends JavaFileObject> files =
          fm.getJavaFileObjectsFromStrings( Collections.singleton( javaSrc.toString() ) );
      CompilationTask task = compiler.getTask(
        null /*Writer*/, fm, null /*DiagnosticListener*/, null /*Iterable<String>*/,
        null /*Iterable<String>*/, files );
      task.call();
    }
    
    //
    
    URL[] url = { javaSrc.toAbsolutePath().getParent().toUri().toURL() };
    try ( URLClassLoader classLoader = new URLClassLoader( url ) ) {
      Class.forName( "A", true, classLoader );    // Java Compiler API
    }
    
    Files.delete( javaSrc );
  }
}