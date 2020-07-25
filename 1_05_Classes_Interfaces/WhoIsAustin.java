class WhoIsAustin {

  String austinPowers = "Mike Myers";
 
  {
    System.out.println( "1 " + austinPowers );
  }

  
  WhoIsAustin() {
    System.out.println( "2 " + austinPowers );
  }
  
  public static void main( String[] args ) {
    new WhoIsAustin();
	}
}

class WhoIsDrEvil {
  {
//    System.out.println( drEvil );
  }

  String drEvil = "Mike Myers";
}