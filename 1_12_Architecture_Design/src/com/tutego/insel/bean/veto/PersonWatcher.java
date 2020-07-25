package com.tutego.insel.bean.veto;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class PersonWatcher {
  
  public static void main( String[] args ) {
    Person p = new Person();
    p.addPropertyChangeListener( new PropertyChangeListener() {
      @Override public void propertyChange( PropertyChangeEvent e ) {
        System.out.printf( "Property '%s': '%s' -> '%s'%n",
                           e.getPropertyName(), e.getOldValue(), e.getNewValue() );
      }
    } );

    try {
      p.setBigamist( true );
      p.setBigamist( false );
    }
    catch ( PropertyVetoException e ) {
      e.printStackTrace();
    }

    p.addVetoableChangeListener( new VetoableChangeListener() {
      @Override
      public void vetoableChange( PropertyChangeEvent e )
          throws PropertyVetoException {
        if (   "bigamist".equals( e.getPropertyName() )
            && (Boolean) e.getNewValue() )
          throw new PropertyVetoException( "Nimm zwei ist nichts für mich!", e );
      }
    } );

    try {
      p.setBigamist( true );
    }
    catch ( PropertyVetoException e ) {
      e.printStackTrace();
    }
  }
}