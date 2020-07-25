package com.tutego.insel.meta;

import static java.lang.System.out;

import java.awt.Component;
import java.io.Serializable;
import java.security.PublicKey;

import javax.swing.JLabel;

public class IsAssignableFrom {
  public static void main( String[] args ) throws ClassNotFoundException {
    Component b = new JLabel();
    out.println( b instanceof JLabel );                                                  // true
    out.println( JLabel.class.isInstance( b ) );                                         // true
    out.println( Object.class.isInstance( b ) );                                         // true
    out.println( Class.forName("java.awt.Component").isInstance( b ) );                  // true
    out.println( String.class.isInstance( b ) );                                         // false

    Class<?> clazz = Serializable.class;
    out.println( clazz.isAssignableFrom( String.class ) );                               // true
    out.println( clazz.isAssignableFrom( Thread.class ) );                               // false
    out.println( clazz.isAssignableFrom( PublicKey.class ) );                            // true
  }
}
