package com.tutego.insel.game.vl;

import java.util.Arrays;

public class Playground {

  public static void main( String[] args ) {
    Magazine spiegel = new Magazine( "Spiegel", 3.50 );
    Magazine madMag  = new Magazine( "Mad Magazine", 2.50 );
    Magazine maxim   = new Magazine( "Maxim", 3.00 );
    Magazine neon    = new Magazine( "Neon", 3.00 );
    Magazine ct      = new Magazine( "c't", 3.30 );
    
    System.out.println( PriceUtils.calculateSum( spiegel, madMag, ct ) ); // 9.3
    
    System.out.println( spiegel.compareTo( ct ) );  // 1
    System.out.println( ct.compareTo( spiegel ) );  // -1
    System.out.println( maxim.compareTo( neon ) );  // 0

    Magazine[] mags = { spiegel, madMag, maxim, neon, ct };
    Arrays.sort( mags );
    System.out.println( Arrays.toString( mags ) ); // [Mad Magazine 2.5, Maxim 3.0, Neon 3.0, c't 3.3, Spiegel 3.5]
  }
}