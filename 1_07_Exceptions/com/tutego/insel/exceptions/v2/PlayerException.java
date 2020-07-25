package com.tutego.insel.exceptions.v2;

public class PlayerException extends RuntimeException {

  private static final long serialVersionUID = -1879318028765343561L;

  public PlayerException() { }

  public PlayerException( String s ) {
    super( s );
  }
}
