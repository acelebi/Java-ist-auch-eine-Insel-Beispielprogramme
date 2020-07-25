package com.tutego.insel.inner;

import java.util.*;

public class ShorterSportReminder {
  public static void main( String[] args ) {
    new Timer().scheduleAtFixedRate( new TimerTask() {
                                       @Override public void run() {
                                         System.out.println( "Los, beweg dich, du faule Wurst!" );
                                       }
                                     },
                                     0 /* ms delay */,
                                     1000 /* ms period */);
  }
}