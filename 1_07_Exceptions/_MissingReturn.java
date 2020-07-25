class _MissingReturn {
  
  @SuppressWarnings( "finally" )
  public static int a() {
    while ( true ) {
      try {
        return 0;
      }
      finally {
        break;
      }
    }
  
    return 1;
  }

//  public static int b() {
//    while (true) {
//      try {
//        return 1;               // Hier ist der Fehler
//       } finally {
//        continue;
//       }
//    }
//  }
  
  public static void main( String[] args ) {
    System.out.println( a() );
//    System.out.println( b() );
  }
}
