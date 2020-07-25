class StaticBlock {

  static {
    System.out.println( "Eins" );
  }

  public static void main( String[] args ) {
    System.out.println( "Jetzt geht's los." );
  }

  static {
    System.out.println( "Zwei" );
  }

}
