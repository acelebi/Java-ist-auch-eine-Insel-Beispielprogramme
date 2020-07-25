package com.tutego.insel.meta;

public class ReadPrivate {

  @SuppressWarnings( "unused" )
  private String privateKey = "Schnuppelhase";

  public static void main( String[] args ) throws Exception {
    ReadPrivate key = new ReadPrivate();
    Class<?> c = key.getClass();

    java.lang.reflect.Field field = c.getDeclaredField( "privateKey" );
    field.setAccessible( true );

    System.out.println( field.get( key ) ); // Schnuppelhase
    field.set( key, "Schnuckibutzihasidrachelchen" );

    System.out.println( field.get( key ) ); // Schnuckibutzihasidrachelchen
  }
}
