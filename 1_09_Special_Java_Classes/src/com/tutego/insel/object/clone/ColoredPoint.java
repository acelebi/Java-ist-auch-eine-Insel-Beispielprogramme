package com.tutego.insel.object.clone;

public class ColoredPoint extends java.awt.Point {
  
  public int rgb;

  @Override // aus Point2D
  public Object clone() {
    throw new RuntimeException( new CloneNotSupportedException() );
  }
  
  public static void main( String[] args ) {
    new ColoredPoint().clone();
  }
}