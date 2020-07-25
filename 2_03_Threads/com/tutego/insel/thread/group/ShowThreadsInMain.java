package com.tutego.insel.thread.group;

public class ShowThreadsInMain {
  public static void main( String[] args ) {
    ThreadGroup top = Thread.currentThread().getThreadGroup();

    while ( top.getParent() != null )
      top = top.getParent();

    showGroupInfo( "  ", top );
  }

  public static void showGroupInfo( String indent, ThreadGroup group ) {
    Thread[] threads = new Thread[group.activeCount()];
    group.enumerate( threads, false );
    System.out.println( group );

    for ( Thread t : threads )
      if ( t != null )
        System.out.printf( "%s%s -> %s ist %sDaemon-Thread%n",
                           indent, group.getName(), t,
                           t.isDaemon() ? "" : "kein " );

    ThreadGroup[] activeGroup = new ThreadGroup[group.activeGroupCount()];
    group.enumerate( activeGroup, false );

    for ( ThreadGroup g : activeGroup )
      showGroupInfo( indent + indent, g );
  }
}
