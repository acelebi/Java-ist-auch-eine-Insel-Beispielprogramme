class Dungeon {

  Dungeon() {
    System.out.println( "2. Konstruktor" );
  }

  void play() {
    System.out.println( "4. Spielen" );
  }
  
  public static void main( String[] args ) {
    System.out.println( "1. Vor dem Konstruktor" ); 
    Dungeon d = new Dungeon(); 
    System.out.println( "3. Nach dem Konstruktor" );
    d.play(); 
  }
}