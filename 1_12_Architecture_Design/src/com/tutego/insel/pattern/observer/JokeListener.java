package com.tutego.insel.pattern.observer;

import java.util.*;

class JokeListener implements Observer {
  
  private final String name;

  JokeListener( String name ) {
    this.name = name;
  }

  @Override public void update( Observable o, Object arg ) {
    System.out.println( name + " lacht über: \"" + arg + "\"" );
  }
}