package com.tutego.insel.cdi;

import org.jboss.weld.environment.se.Weld;

public class StartMain {
  public static void main( String[] args ) {
    Application app = new Weld().initialize().instance().select( Application.class ).get();
    app.start();
  }
}