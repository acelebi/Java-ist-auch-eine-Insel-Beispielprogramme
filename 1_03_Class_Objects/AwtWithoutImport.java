class AwtWithoutImport {

  public static void main( String[] args ) {
    java.awt.Point p = new java.awt.Point();
    java.awt.Polygon poly = new java.awt.Polygon();
    poly.addPoint( 10, 10 );
    poly.addPoint( 10, 20 );
    poly.addPoint( 20, 10 );

    System.out.println( p );                        // java.awt.Point[x=0,y=0]
    System.out.println( poly.contains( 15, 15 ) );  // false
  }
}
