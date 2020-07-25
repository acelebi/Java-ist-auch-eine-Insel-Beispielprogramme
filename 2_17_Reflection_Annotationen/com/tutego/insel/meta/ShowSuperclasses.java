package com.tutego.insel.meta;

public class ShowSuperclasses {
  public static void main( String[] args ) {
    Class<?> subclass = javax.swing.JButton.class;
    Class<?> superclass = subclass.getSuperclass();

    while ( superclass != null ) {
      String className = superclass.getName();
      System.out.println( className );
      subclass = superclass;
      superclass = subclass.getSuperclass();
    }
  }
}
