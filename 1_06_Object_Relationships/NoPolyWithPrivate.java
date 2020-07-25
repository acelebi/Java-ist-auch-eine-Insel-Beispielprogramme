class NoPolyWithPrivate {

  public static void main( String[] args ) {
    Banana unsicht = new Banana();
  
    System.out.println( unsicht.bar() );   // 2
  }
}

class Fruit {

  //  public int furcht()
  private int furcht() {
    return 2;
  }

  int bar() {
    return furcht();
//    return ((Banana)(this)).furcht();
  }
}

class Banana extends Fruit {

  // Überschreibt nicht, daher kein @Override
  public int furcht() {
    return 1;
  }
}