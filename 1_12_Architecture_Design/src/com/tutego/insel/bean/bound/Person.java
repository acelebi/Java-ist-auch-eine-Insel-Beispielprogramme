package com.tutego.insel.bean.bound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {
  private String name = "";

  private PropertyChangeSupport changes = new PropertyChangeSupport( this );

  public void setName( String name ) {
    String oldName = this.name;
    this.name = name;
    changes.firePropertyChange( "name", oldName, name );
  }

  public String getName() {
    return name;
  }

  public void addPropertyChangeListener( PropertyChangeListener l ) {
    changes.addPropertyChangeListener( l );
  }

  public void removePropertyChangeListener( PropertyChangeListener l ) {
    changes.removePropertyChangeListener( l );
  }
}