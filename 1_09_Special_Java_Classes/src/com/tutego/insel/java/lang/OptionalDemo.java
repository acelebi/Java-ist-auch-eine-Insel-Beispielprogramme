package com.tutego.insel.java.lang;

public class OptionalDemo {
  public static void main( String[] args ) {
    Person heinz = new Person();
    System.out.println( heinz.getSpouse().isPresent() ); // false
    Person eva = new Person();
    heinz.setSpouse( eva );
    System.out.println( heinz.getSpouse().isPresent() ); // true
    System.out.println( heinz.getSpouse().get() ); // com......
    heinz.removeSpouse();
    System.out.println( heinz.getSpouse().isPresent() ); // false
  }
}