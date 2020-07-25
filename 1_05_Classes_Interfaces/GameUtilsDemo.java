public class GameUtilsDemo {
  
  @SuppressWarnings("static-access")
  public static void main( String[] args ) {
    System.out.println( GameUtils.isGameIdentifier( "Superpig" ) );   // true
    System.out.println( GameUtils.isGameIdentifier( "Superpig II" ) );// false
    
    System.out.println( GameUtils.MAX_ID_LEN );           // Genau richtig
    GameUtils ut = new GameUtils();
    System.out.println( ut.MAX_ID_LEN );                  // Nicht so gut
    System.out.println( ((GameUtils) null).MAX_ID_LEN );  // Gar nicht gut so
  }
}
