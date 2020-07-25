class PointEqualsDemo {

  public static void main( String[] args ) {
    java.awt.Point player = new java.awt.Point();
    player.x = player.y = 10;
    
    java.awt.Point door = new java.awt.Point();
    door.setLocation( 10, 100 );
 
    double distance = player.distance( door.x, door.y );
    System.out.println( distance );            // 90.0
    
    System.out.println( player.toString() );   // java.awt.Point[x=10,y=10]
    System.out.println( door );                // java.awt.Point[x=10,y=100]
  }
}