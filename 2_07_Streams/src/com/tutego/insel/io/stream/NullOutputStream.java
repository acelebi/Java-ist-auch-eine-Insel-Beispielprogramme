package com.tutego.insel.io.stream;

public final class NullOutputStream extends java.io.OutputStream {
  @Override public void write( byte[] b ) { /* Empty */ }
  @Override public void write( byte[] b, int off, int len ) { /* Empty */ }
  @Override public void write( int b ) { /* Empty */ }
}

