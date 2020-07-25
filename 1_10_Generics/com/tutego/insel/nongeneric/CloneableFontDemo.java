package com.tutego.insel.nongeneric;

import java.awt.Font;

public class CloneableFontDemo {
  
  public static void main( String[] args ) {
    CloneableFont font = new CloneableFont( "Arial", Font.BOLD, 12 );
    System.out.println( font );
    Object font2 = font.clone();
    System.out.println( font2 );
  }
}