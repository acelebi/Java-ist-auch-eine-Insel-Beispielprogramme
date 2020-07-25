package com.tutego.insel.object.hashcode;

import java.util.Arrays;

public class Chess {

  char[][] chessboard = new char[8][8];

  @Override
  public int hashCode() {
    return 31 + Arrays.hashCode( chessboard );
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj )
      return true;
    if ( obj == null )
      return false;
    if ( getClass() != obj.getClass() )
      return false;
    if ( ! Arrays.equals( chessboard, ((Chess) obj).chessboard ) )
      return false;
    return true;
  }
}
