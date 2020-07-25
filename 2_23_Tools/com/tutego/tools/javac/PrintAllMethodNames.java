package com.tutego.tools.javac;

import java.io.*;
import java.net.*;
import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;
import com.sun.source.tree.*;
import com.sun.source.util.TreeScanner;
import com.sun.tools.javac.api.JavacTaskImpl;

public class PrintAllMethodNames {

  final static TreeScanner<?, ?> methodPrintingTreeVisitor = new TreeScanner<Void, Void>() {
    @Override public Void visitCompilationUnit( CompilationUnitTree unit, Void arg ) {
      System.out.println( "Paket: " + unit.getPackageName() );
      return super.visitCompilationUnit( unit, arg );
    };
    @Override public Void visitClass( ClassTree classTree, Void arg ) {
      System.out.println( "Klasse: " + classTree.getSimpleName() );
      return super.visitClass( classTree, arg );
    }
    @Override public Void visitMethod( MethodTree methodTree, Void arg ) {
      System.out.println( "Methode: " + methodTree.getName() );
      return super.visitMethod( methodTree, arg );
    }
  };

  public static void main( String[] args ) throws IOException, URISyntaxException {
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    try ( StandardJavaFileManager fileManager = compiler.getStandardFileManager( null, null, null ) ) {
      URI filename = PrintAllMethodNames.class.getResource( "PrintAllMethodNames.java" ).toURI();
      Iterable<? extends JavaFileObject> fileObjects = fileManager.getJavaFileObjects( new File( filename ) );
      CompilationTask task = compiler.getTask( null, null, null, null, null, fileObjects );
  
      JavacTaskImpl javacTask = (JavacTaskImpl) task;
  
      for ( CompilationUnitTree tree : javacTask.parse() )
        tree.accept( methodPrintingTreeVisitor, null );
    }
  }
}
