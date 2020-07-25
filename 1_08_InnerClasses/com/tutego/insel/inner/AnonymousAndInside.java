package com.tutego.insel.inner;

public class AnonymousAndInside {

  public static void main( String[] args ) {
    java.awt.Point p = new java.awt.Point() {{
      x = (int)(Math.random() * 1000); y = (int)(Math.random() * 1000);
    }};
    
    System.out.println( p.getLocation() );  // java.awt.Point[...
    
    System.out.println( new java.awt.Point( -1, 0 ) {{
      y = (int)(Math.random() * 1000);
    }}.getLocation() );                     // java.awt.Point[x=-1,y=...]
  }
}