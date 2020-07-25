package com.tutego.insel.lang;

class SetProperty
{
  static public void main( String[] args )
  {
    String logProperty      = System.getProperty( "LOG" );
    String usernameProperty = System.getProperty( "USER" );
    String sizeProperty     = System.getProperty( "SIZE" );

    System.out.println( logProperty != null );                      // true
    System.out.println( usernameProperty );                         // Chris

    if ( sizeProperty != null )
      System.out.println( Integer.parseInt( sizeProperty ) );       // 100

    System.out.println( System.getProperty( "DEBUG", "false" ) );   // false
  }
}