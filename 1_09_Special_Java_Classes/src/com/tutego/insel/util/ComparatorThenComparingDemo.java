package com.tutego.insel.util;

import java.util.*;

public class ComparatorThenComparingDemo {
  
  public static class Person {
    
    public String firstname, lastname;

    public Person( String firstname, String lastname ) {
      this.firstname = firstname;
      this.lastname  = lastname;
    }

    public String getLastname() {
      return lastname;
    }
    
    public String getFirstname() {
      return firstname;
    }
    
    @Override public String toString() {
      return firstname + " " + lastname;
    }
  }

  public final static Comparator<Person> PERSON_FIRSTNAME_COMPARATOR =
          (p1, p2) -> p1.firstname.compareTo( p2.firstname );

  public final static Comparator<Person> PERSON_LASTNAME_COMPARATOR =
          (p1, p2) -> p1.lastname.compareTo( p2.lastname );

  public static void main( String[] args ) {
    List<Person> persons = Arrays.asList(
      new Person( "Onkel", "Ogar" ), new Person( "Olga", "Ogar" ),
      new Person( "Peter", "Lustig" ), new Person( "Lara", "Lustig" ) );

    persons.sort( PERSON_LASTNAME_COMPARATOR );
    System.out.println( persons );

    persons.sort( PERSON_FIRSTNAME_COMPARATOR );
    System.out.println( persons );

    persons.sort( PERSON_LASTNAME_COMPARATOR.thenComparing( PERSON_FIRSTNAME_COMPARATOR ) );
//    persons.sort( Comparator.comparing( Person::getLastname ).thenComparing( Person::getFirstname ) );
    System.out.println( persons );
  }
}