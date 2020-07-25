package com.tutego.insel.thread.timer;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
  @Override public void run() {
    System.out.println( "Make my day." );
  }
}

public class TimerTaskDemo {
  public static void main( String[] args ) {
    Timer timer = new Timer();

    // Start in 2 Sekunden
    timer.schedule( new Task(), 2000 );

    // Start in einer Sekunde, dann Ablauf alle 5 Sekunden
    timer.schedule( new Task(), 1000, 5000 );
  }
}
