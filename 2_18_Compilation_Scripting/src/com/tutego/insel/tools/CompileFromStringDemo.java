package com.tutego.insel.tools;

import java.net.*;
import java.nio.file.Paths;
import java.util.Arrays;
import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileFromStringDemo {
  public static void main( String[] args ) throws Exception {
    String src = "class A { static { System.out.println(\"Java Compiler API 2\"); } }";
    StringJavaFileObject javaFile = new StringJavaFileObject( "A", src );
    
    //

    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    try ( JavaFileManager fileManager = compiler.getStandardFileManager( null, null, null ) ) {
      Iterable<? extends JavaFileObject> files = Arrays.asList( javaFile );
      CompilationTask task = compiler.getTask( null, fileManager, null, null, null, files );
      task.call();
    }
    URL[] urls = new URL[] { Paths.get( "." ).toUri().toURL() };
    try ( URLClassLoader classLoader = new URLClassLoader( urls ) ) {
      Class.forName( "A", true, classLoader );    // Java Compiler API 2
    }
  }
}