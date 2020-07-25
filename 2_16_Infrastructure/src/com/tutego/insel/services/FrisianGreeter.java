package com.tutego.insel.services;

public class FrisianGreeter implements Greeter {
  @Override public String greet( String name ) {
    return "Moin " + name + "!";
  }
}
