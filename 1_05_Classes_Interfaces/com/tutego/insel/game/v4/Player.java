package com.tutego.insel.game.v4;

class Player {

  String name = "", item = "";

  Player name( String name ) {
    this.name = name;
    return this;
  }

  String name() {
    return name;
  }

  Player item( String item ) {
    this.item = item;
    return this;
  }

  String item() {
    return item;
  }

  String id() {
    return name + " hat " + item;
  }
}