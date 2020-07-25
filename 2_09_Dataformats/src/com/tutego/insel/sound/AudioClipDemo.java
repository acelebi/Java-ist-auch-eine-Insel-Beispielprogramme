package com.tutego.insel.sound;

import java.applet.*;
import java.net.MalformedURLException;
import java.nio.file.*;

public class AudioClipDemo {
  public static void main( String[] args ) throws InterruptedException, MalformedURLException {
    Path path = Paths.get( "uups.wav" );
    AudioClip sound = Applet.newAudioClip( path.toUri().toURL() );
    sound.play();
    Thread.sleep( 100000 );
  }
}