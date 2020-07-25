package com.tutego.insel.thread.group;

public class ThreadInThreadGroup {
  static public void main( String[] args ) {
    ThreadGroup group = new ThreadGroup( "Helden" );

    new OwnThread( group, "Darkwing Duck" ).start();
    new OwnThread( group, "Kikky" ).start();

    Thread[] threads = new Thread[ group.activeCount() ];

    // Fülle Array mit allen Threads der Gruppe

    group.enumerate( threads );

    // Eigenes Auflisten der Gruppe

    for ( Thread t : threads )
      System.out.println( t );
    System.out.println( "--" ); System.out.flush();

    // Eingebaute list()-Methode nutzen

    group.list();
  }
}

class OwnThread extends Thread {
  public OwnThread( ThreadGroup group, String name ) {
    super( group, name );
  }

  @Override
  public void run() {
    for ( int i = 0; i < 3; i++ ) {
      System.out.printf( "%s: Ich bin der Schrecken, der die Nacht durchflattert%n",
                         getName() );
    }
  }
}