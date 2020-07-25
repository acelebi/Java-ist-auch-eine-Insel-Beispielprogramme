package com.tutego.insel.game.v3;

class Player {

  String name = "";
  String item = "";

  void clearName() {
    name = "";
  }
  
  boolean hasCompoundName() {
    return (name == null) ? false : name.contains( " " );
  }
}