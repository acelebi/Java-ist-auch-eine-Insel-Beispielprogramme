package com.tutego.insel.pattern.oberserver.generic;

class JokeListener implements Observer<String> {
  
  private final String name;

  JokeListener( String name ) {
    this.name = name;
  }

  @Override public void update( Observable<String> o, String arg ) {
    System.out.println( name + " lacht über: \"" + arg + "\"" );
  }
}