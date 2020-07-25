package com.tutego.insel.lang;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

class Profiling {
  private static long[] measure() {
    final int MAX = 10000;

    final String string = "Aber Angie, Angie, ist es nicht an der Zeit, Goodbye zu sagen? " +
                          "Ohne Liebe in unseren Seelen und ohne Geld in unseren Mänteln. " +
                          "Du kannst nicht sagen, dass wir zufrieden sind.";

    final int    number     = 123;
    final double nullnummer = 0.0;

    // StringBuffer(size) und append() zur Konkatenation

    long time1 = System.nanoTime();

    final StringBuilder sb1 = new StringBuilder( MAX * (string.length() + 6) );
    for ( int i = MAX; i-- > 0; )
      sb1.append( string ).append( number ).append( nullnummer );
    sb1.toString();

    time1 = NANOSECONDS.toMillis( System.nanoTime() - time1 );

    // StringBuffer und append() zur Konkatenation

    long time2 = System.nanoTime();

    final StringBuilder sb2 = new StringBuilder();
    for ( int i = MAX; i-- > 0; )
      sb2.append( string ).append( number ).append( nullnummer );
    sb2.toString();
    
    time2 = NANOSECONDS.toMillis( System.nanoTime() - time2 );

    // + zur Konkatenation

    long time3 = System.nanoTime();

    String t = "";
    for ( int i = MAX; i-- > 0; )
      t += string + number + nullnummer;

    time3 = NANOSECONDS.toMillis( System.nanoTime() - time3 );

    // Variablen verwenden (-ea), um Wegoptimierung zu vermeiden

    assert sb1.length() == sb2.length();
    assert sb2.length() == t.length();

    return new long[] { time1, time2, time3 };
  }

  public static void main( String[] args ) {
    measure(); System.gc(); measure(); System.gc(); 
    long[] durations = measure();

    System.out.printf( "sb(size), append(): %d ms%n", durations[0] ); // sb(size), append(): 7 ms
    System.out.printf( "sb(), append()    : %d ms%n", durations[1] ); // sb(), append()    : 10 ms
    System.out.printf( "t+=               : %d ms%n", durations[2] ); // t+=               : 41262 ms
  }
}
