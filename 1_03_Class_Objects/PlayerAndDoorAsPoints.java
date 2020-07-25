class PlayerAndDoorAsPoints {

  public static void main( String[] args ) {
    java.awt.Point player = new java.awt.Point();
    player.x = player.y = 10;
    
    java.awt.Point door = new java.awt.Point();
    door.setLocation( 10, 100 );
    
    System.out.println( player.distance( door ) );  // 90.0
  }
}