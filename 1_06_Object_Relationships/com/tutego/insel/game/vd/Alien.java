package com.tutego.insel.game.vd;

public class Alien extends GameObject {

  public String planet;

  public Alien( String planet ) {
//    super();              // Ruft automatisch Standard-Konstruktor von GameObject auf
    this.planet = planet;     // super() muss immer als Erstes stehen 
  }
}
