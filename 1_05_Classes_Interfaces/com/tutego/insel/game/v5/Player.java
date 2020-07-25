package com.tutego.insel.game.v5;

public class Player {

  private String name = "";
  private String item = "";

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    if ( name != null && !name.trim().isEmpty() )
      this.name = name;
  }
  
  public String getItem() {
    return item;
  }
  
  public void setItem( String item ) {
    if ( item != null && !item.trim().isEmpty() )
      this.item = item;
  } 
}