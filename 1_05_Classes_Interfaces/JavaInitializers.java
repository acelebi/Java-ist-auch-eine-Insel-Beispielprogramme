public class JavaInitializers {

  static {
   System.out.println( "Statischer Initialisierer");
  }

  {
    System.out.println( "Exemplarinitialisierer" );
  }

  JavaInitializers() {
   System.out.println( "Konstruktor" );
  }

  public static void main( String[] args ) {
    new JavaInitializers();
    new JavaInitializers();
  }
}