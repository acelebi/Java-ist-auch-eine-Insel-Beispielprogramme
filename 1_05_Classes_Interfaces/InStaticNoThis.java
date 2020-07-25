class InStaticNoThis {

  String name;

  static void setName() {
//    name = "Amanda";            // Compilerfehler
//    // Cannot make a static reference to the non-static field name
//    System.out.println( this ); // Compilerfehler
//    // Cannot use this in a static context
  }
}
