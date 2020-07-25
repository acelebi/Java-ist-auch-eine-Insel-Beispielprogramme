package com.tutego.insel.javadoc;

/**
 * This class models a room with a given number of players.
 */
public class Room {

  /** Number of players in a room. */
  private int numberOfPersons;

  /**
   * A person enters the room.
   * Increments the number of persons.
   */
  public void enterPerson() {
    numberOfPersons++;
  }

  /**
   * A person leaves the room.
   * Decrements the number of persons.
   */
  public void leavePerson() {
    if ( numberOfPersons > 0 )
      numberOfPersons--;
  }

  /**
   * Gets the number of persons in this room.
   * This is always greater equals 0.
   * 
   * @return Number of persons.
   */
  public int getNumberOfPersons() {
    return numberOfPersons;
  }
}
