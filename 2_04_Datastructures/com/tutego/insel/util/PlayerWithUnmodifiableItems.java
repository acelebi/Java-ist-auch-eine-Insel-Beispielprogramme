package com.tutego.insel.util;

import java.util.*;

public class PlayerWithUnmodifiableItems {

  private List<String> items = new ArrayList<>();

  public List<String> getItems() {
    return Collections.unmodifiableList( items );
  }

  public void addItem( String item ) {
    items.add( item );
  }

  public static void main( String[] args ) {
    PlayerWithUnmodifiableItems p = new PlayerWithUnmodifiableItems();
    p.addItem( "Lasso" );
    System.out.println( p.getItems().get( 0 ) ); // Lasso
    p.getItems().clear(); // java.lang.UnsupportedOperationException
  }
}