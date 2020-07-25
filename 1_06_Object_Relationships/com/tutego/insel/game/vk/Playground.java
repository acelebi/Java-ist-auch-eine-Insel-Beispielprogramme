package com.tutego.insel.game.vk;

public class Playground {

  public static void main( String[] args ) {
    Magazine madMag = new Magazine();
    madMag.price = 2.50;

    Buyable schoki = new Chocolate();
    
    Magazine maxim = new Magazine();
    maxim.price = 3.00;
    
    System.out.printf( "%.2f", PriceUtils.calculateSum( madMag, maxim, schoki ) );  // 6,19
  }
}