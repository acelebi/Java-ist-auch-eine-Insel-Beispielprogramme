package com.tutego.insel.bean.bound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PersonWatcher {
  
  public static void main( String[] args ) {
    Person p = new Person();
    p.addPropertyChangeListener( new PropertyChangeListener() {
      @Override public void propertyChange( PropertyChangeEvent e ) {
        System.out.printf( "Property '%s': '%s' -> '%s'%n",
                           e.getPropertyName(), e.getOldValue(), e.getNewValue() );
      }
    } );
    p.setName( "Ulli" );   // Property 'name': '' -> 'Ulli'
    p.setName( "Ulli" );
    p.setName( "Chris" );  // Property 'name': 'Ulli' -> 'Chris'
  }
}