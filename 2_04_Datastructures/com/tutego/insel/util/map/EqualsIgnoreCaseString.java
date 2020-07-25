package com.tutego.insel.util.map;

public class EqualsIgnoreCaseString {

  /*@Nonnull*/ private final String string;

  public EqualsIgnoreCaseString( /*@Nonnull*/ String string ) {
    this.string = string.toLowerCase();
  }

  @Override
  public int hashCode() {
    return string.hashCode();
  }

  @Override
  public boolean equals( Object obj ) {
    if ( obj == this )
      return true;
    if ( obj == null )
      return false;
    if ( getClass() != obj.getClass() )
      return false;
    return string.equals( ((EqualsIgnoreCaseString) obj).string );
  }
}