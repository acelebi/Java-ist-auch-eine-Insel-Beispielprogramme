package com.tutego.insel.game.v3;

class Playground {

  public static void main( String[] args ) {
    Player parry = new Player();
    parry.name = "Parry Hotter";
    System.out.printf( "'%s' hat zusammengesetzten Namen: %b%n",
                       parry.name, parry.hasCompoundName() ); 
    
    Player spucki = new Player();
    spucki.name = "Spuckiman";
    System.out.printf( "'%s' hat zusammengesetzten Namen: %b%n",
                       spucki.name, spucki.hasCompoundName() ); 
    spucki.clearName();
    System.out.printf( "Spuckis Name ist leer? %b%n", spucki.name.isEmpty() );
  }
}