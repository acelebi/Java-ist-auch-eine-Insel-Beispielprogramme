package com.tutego.insel.tools;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import javax.tools.*;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileWithDiagnosticsDemo {
  public static void main( String[] args ) throws Exception {

    Path javaSrc = Paths.get( "A.java" );
    
    Files.write( javaSrc,
                 Collections.singleton( "class A\n{\nstaticccc\n{\nSystem.outprintln(\"Java Compiler API\")" ),
                 StandardCharsets.UTF_8 );

    //

    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
    try ( StandardJavaFileManager fm = compiler.getStandardFileManager( diagnostics, null, null ) )  {
      Iterable<? extends JavaFileObject> files =
          fm.getJavaFileObjectsFromFiles( Arrays.asList( new File("QQ.java"), javaSrc.toFile() ) );
      CompilationTask task = compiler.getTask( null, fm, diagnostics, null, null, files );
      boolean success = task.call();
      System.out.println( success );    // false
    }

    for ( Diagnostic<?> diagnostic : diagnostics.getDiagnostics() ) {
      System.out.printf( "Kind: %s%n", diagnostic.getKind() );
      System.out.printf( "Quelle: %s%n", diagnostic.getSource() );
      System.out.printf( "Code und Nachricht: %s: %s%n", diagnostic.getCode(), diagnostic.getMessage( null ) );
      System.out.printf( "Zeile: %s%n", diagnostic.getLineNumber() );
      System.out.printf( "Position/Spalte: %s/%s%n", diagnostic.getPosition(), diagnostic.getColumnNumber() );
      System.out.printf( "Startpostion/Endposition: %s/%s%n", diagnostic.getStartPosition(), diagnostic.getEndPosition() );
      System.out.println();
    }
    
    //

    Files.delete( javaSrc );
  }
}