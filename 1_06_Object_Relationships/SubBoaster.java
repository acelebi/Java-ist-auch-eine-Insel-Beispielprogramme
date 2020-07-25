class SuperBoaster {

  int no = 1;

  void boast() {
    System.out.println( "Ich bin die Nummer " + no );
  }
}

public class SubBoaster extends SuperBoaster {
  
  int nr = 2;

  @Override void boast() {
    super.boast();                   // Ich bin die Nummer 1
    System.out.println( super.no );  // 1
    System.out.println( nr );        // 2

//    System.out.println( ((SuperBoaster) this).nr );
//    ((SuperBoaster)this).boast();
  }

  public static void main( String[] args ) {
    new SubBoaster().boast();
  }
}
