package com.tutego.insel.object.hashcode;

public class Player {

  String name;
  int    age;
  double weight;

  /**
   * Returns a hash code value for this {@code Player} object.
   * 
   * @return A hash code value for this object.
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   * @see java.util.HashMap
   */
  @Override public int hashCode() {
    int result = 31 + age;
    result = 31 * result + ((name == null) ? 0 : name.hashCode());
    long temp = Double.doubleToLongBits( weight );
    result = 31 * result + (int) (temp ^ (temp >>> 32));

    return result;
  }

  /**
   * Determines whether or not two players are equal. Two instances of
   * {@code Player} are equal if the values of their {@code name}, {@code age}
   * and {@code weight} member fields are the same.
   * 
   * @param that an object to be compared with this {@code Player}
   * 
   * @return {@code true} if the object to be compared is an instance of
   *         {@code Player} and has the same values; {@code false} otherwise.
   */
  @Override public boolean equals( Object that ) {
    if ( this == that )
      return true;

    if ( that == null )
      return false;

    if ( getClass() != that.getClass() )
      return false;

    if ( age != ((Player)that).age )
      return false;

    if ( name == null )
    {
      if ( ((Player) that).name != null )
        return false;
    }
    else if ( ! name.equals( ((Player) that).name ) )
      return false;

    return Double.doubleToLongBits( weight ) ==
           Double.doubleToLongBits( ((Player)that).weight );
  }
}