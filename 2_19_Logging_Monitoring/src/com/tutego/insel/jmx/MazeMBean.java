package com.tutego.insel.jmx;

public interface MazeMBean {
  void setMaxNumberOfPlayers( int numberOfPlayers );
  int getMaxNumberOfPlayers();
  void dragonAlarm();
}
