package com.tutego.insel.jmx;

public class Maze implements MazeMBean {

  private int numberOfPersons;

  @Override
  public void setMaxNumberOfPlayers( int numberOfPersons ) {
    this.numberOfPersons = numberOfPersons;
  }

  @Override
  public int getMaxNumberOfPlayers() {
    return numberOfPersons;
  }

  @Override
  public void dragonAlarm() {
    System.out.println( "Heul. Huhuhuhu." );
  }
}