package com.tutego.insel.cdi;

import javax.inject.Inject;

public class Application {

  @Inject Configuration configuration;

  public void start() {
    System.out.println( configuration.greetingMessage() );
  }
}
