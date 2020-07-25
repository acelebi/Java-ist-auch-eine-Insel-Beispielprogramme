package com.tutego.insel.sound;

import java.io.InputStream;
import javax.sound.midi.*;

public class MidiDemo {

  public static void main( String[] args ) throws Exception {
    try ( Sequencer sequencer = MidiSystem.getSequencer();
        InputStream midiFile = ClassLoader.getSystemResourceAsStream( "media/beginn.mid" ) ) {
    
      sequencer.open();
      sequencer.setSequence( MidiSystem.getSequence( midiFile ) );
      sequencer.start();
    
      System.out.println( "Return beendet das Abspielen" );
      System.in.read();
    
      sequencer.stop();
    }
    System.exit( 0 );
  }
}