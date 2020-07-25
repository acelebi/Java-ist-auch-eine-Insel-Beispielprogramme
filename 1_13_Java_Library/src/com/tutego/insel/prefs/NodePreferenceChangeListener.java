package com.tutego.insel.prefs;

import java.util.prefs.NodeChangeEvent;
import java.util.prefs.NodeChangeListener;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;

class NodePreferenceChangeListener implements NodeChangeListener, PreferenceChangeListener {

  @Override
  public void childAdded( NodeChangeEvent e ) {
    Preferences parent = e.getParent(), child = e.getChild();

    System.out.println( parent.name() + " hat neuen Knoten " + child.name() );
  }

  @Override
  public void childRemoved( NodeChangeEvent e ) {
    Preferences parent = e.getParent(), child = e.getChild();

    System.out.println( parent.name() + " verliert Knoten " + child.name() );
  }

  @Override
  public void preferenceChange( PreferenceChangeEvent e ) {
    String key = e.getKey(), value = e.getNewValue();

    Preferences node = e.getNode();

    System.out.println( node.name() + " hat neuen Wert " + value + " für " + key );
  }
}