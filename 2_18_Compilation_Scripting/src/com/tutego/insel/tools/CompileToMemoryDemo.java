package com.tutego.insel.tools;

import java.util.Collection;
import java.util.Collections;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileToMemoryDemo {
  public static void main( String[] args ) throws Exception {
    String src = "public class A { static { System.out.println(\"Java Compiler API 3\"); } }";
    
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    MemClassLoader classLoader = new MemClassLoader();
    try ( JavaFileManager fileManager = new MemJavaFileManager( compiler, classLoader ) ) {
      JavaFileObject javaFile = new StringJavaFileObject( "A", src );
      Collection<JavaFileObject> files = Collections.singleton( javaFile );
      CompilationTask task = compiler.getTask( null, fileManager, null, null, null, files );
      task.call();
    }

    Class.forName( "A", true, classLoader ).newInstance(); // Java Compiler API 3
  }
}