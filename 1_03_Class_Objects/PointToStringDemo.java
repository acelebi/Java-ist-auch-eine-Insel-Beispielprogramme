class PointToStringDemo {

  public static void main( String[] args ) {
    java.awt.Point player = new java.awt.Point();
    java.awt.Point door = new java.awt.Point();
    door.setLocation( 10, 100 );
 
    System.out.println( player.toString() ); // java.awt.Point[x=0,y=0]
    System.out.println( door );              // java.awt.Point[x=10,y=100]
  }
}