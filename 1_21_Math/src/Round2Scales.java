class Round2Scales {
  public static double roundScale2( double d ) {
    return Math.rint( d * 100 ) / 100.;
  }

  public static void main( String[] args ) {
    System.out.println( roundScale2(+1.341 ) );    //  1.34
    System.out.println( roundScale2(-1.341 ) );    // –1.34
    System.out.println( roundScale2(+1.345 ) );    //  1.34
    System.out.println( roundScale2(-1.345 ) );    // –1.34

    System.out.println( roundScale2(+1.347 ) );    //  1.35
    System.out.println( roundScale2(-1.347 ) );    // –1.35
  }
}
