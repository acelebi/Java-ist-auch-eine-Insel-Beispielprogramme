package com.tutego.insel.enumeration;

public enum GameCurrency {

  EURO() {
    @Override
    public double convertTo( GameCurrency targetCurrency, double value ) {
      return targetCurrency == EURO ? value : value / 2;
    }
  },
  PONRODOLLAR() {
    @Override
    public double convertTo( GameCurrency targetCurrency, double value ) {
      return targetCurrency == PONRODOLLAR ? value : value * 2;
    }
  };  
 
  public abstract double convertTo( GameCurrency targetCurrency, double value );
}