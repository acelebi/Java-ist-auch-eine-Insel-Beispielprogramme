package com.tutego.insel.ui.tree;

import java.awt.Point;
import java.util.List;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class PointModel implements TreeModel {

  private final List<Point> points;

  public PointModel( List<Point> points ) {
    this.points = points;
  }

  @Override public Object getRoot() {
    System.out.println( "getRoot()" );

    return points;
  }

  @Override public boolean isLeaf( Object node ) {
    System.out.printf( "isLeaf( %s )%n", node );

    return node instanceof Number;
  }

  @Override public int getChildCount( Object parent ) {
    System.out.printf( "getChildCount( %s )%n", parent );

    if ( parent instanceof List<?> )
      return ((List<?>)parent).size();
    // if ( parent instanceof Point )
    return 2;
  }

  @Override public Object getChild( Object parent, int index ) {
    System.out.printf( "getChild( %s, %d )%n", parent, index );

    if ( parent instanceof List<?> )
      return ((List<?>)parent).get( index );
    // if ( parent instanceof Point )
    if ( index == 0 )
      return ((Point)parent).getX();
    return ((Point)parent).getY();
  }

  @Override public int getIndexOfChild( Object parent, Object child ) { return 0; }
  @Override public void removeTreeModelListener( TreeModelListener l ) { }
  @Override public void addTreeModelListener( TreeModelListener l ) { }
  @Override public void valueForPathChanged( TreePath path, Object newValue ) { }
}