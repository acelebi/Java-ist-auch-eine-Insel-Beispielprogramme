package com.tutego.insel.lang;

import java.io.IOException;
import java.util.Scanner;

public class JavaWinReg {

  public static void main( String[] args ) throws IOException {
    ProcessBuilder builder = new ProcessBuilder( "reg", "query",
                                                 "\"HKEY_CURRENT_USER\\Control Panel\\Desktop\"",
                                                 "/v", "Wallpaper" );
    Process p = builder.start();
    try ( Scanner scanner = new Scanner( p.getInputStream() ) ) {
      scanner.nextLine(); // Springe über ! REG.EXE VERSION 3.0
      scanner.nextLine(); // Springe über HKEY_CURRENT_USER\Control Panel\Desktop
      scanner.useDelimiter( "\\s+\\w+\\s+\\w+\\s+" );
      System.out.println( scanner.next() );
    }
  }
}
