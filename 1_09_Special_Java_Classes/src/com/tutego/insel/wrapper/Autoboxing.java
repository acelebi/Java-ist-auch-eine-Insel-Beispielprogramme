package com.tutego.insel.wrapper;

class Autoboxing {

	public static void main( String[] args ) {
	  Integer i1 = new Integer( 1 );
	  Integer i2 = new Integer( 1 );

	  System.out.println( i1 >= i2 );    // true
	  System.out.println( i1 <= i2 );    // true
    System.out.println( i1 == i2 );    // false
    System.out.println( i1 == i2-0 );  // true

	  Integer j1 = 2;
	  Integer j2 = 2;
	  System.out.println( j1 == j2 );   // true
	
	  Integer k1 = 127;
	  Integer k2 = 127;
	  System.out.println( k1 == k2 );   // true
	
	  Integer l1 = 128;
	  Integer l2 = 128;
	  System.out.println( l1 == l2 );   // false
	
	  Integer m1 = 1000;
	  Integer m2 = 1000;
	  System.out.println( m1 == m2 );   // false
	    
	  Integer n1 = new Integer( 10 );
	  Integer n2 = Integer.valueOf( 10 );
	
	  Integer n3 = 10;
	  Integer n4 = 10;

	  System.out.println( n1 == n2 );   // false
	  System.out.println( n2 == n3 );   // true
	  System.out.println( n1 == n3 );   // false
	  System.out.println( n3 == n4 );   // true
	}
}