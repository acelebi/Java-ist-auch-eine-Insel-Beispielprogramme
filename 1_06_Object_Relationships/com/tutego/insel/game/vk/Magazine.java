package com.tutego.insel.game.vk;

public class Magazine extends GameObject implements Buyable {

  double price;

  @Override public double price() {
    return price;
  }
}