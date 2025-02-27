package com.tutego.insel.game.vk;

class PriceUtils {

  static double calculateSum( Buyable price1, Buyable... prices ) {
    double result = price1.price();
  
    for ( Buyable price : prices )
      result += price.price();
  
    return result;
  }
}
