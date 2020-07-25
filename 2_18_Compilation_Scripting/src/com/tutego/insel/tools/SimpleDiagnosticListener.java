package com.tutego.insel.tools;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;

public class SimpleDiagnosticListener implements DiagnosticListener<JavaFileObject> {
  @Override
  public void report( Diagnostic<? extends JavaFileObject> diagnostic ) {
    // ...
  }
}