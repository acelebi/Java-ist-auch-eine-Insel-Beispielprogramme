package com.tutego.insel.object.equals;

public class Club {

  int numberOfPersons;
  int sm;

  @Override
  public boolean equals( Object o ) {
    if ( o == null )
      return false;
  
    if ( o == this )
      return true;

    if ( o.getClass() != getClass() )
      return false;
  
    Club that = (Club) o;
    
    return    this.numberOfPersons == that.numberOfPersons
           && this.sm == that.sm;
  }

  @Override
  public int hashCode() {
    return (31 + numberOfPersons) * 31 + sm;
  }
}