package com.tutego.insel.lang;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ExecWithArguments {
  public static void main( String[] args ) throws IOException {
    ProcessBuilder pb = new ProcessBuilder( "cmd", "/c", "echo", "%JAVATUTOR%" );
    Map<String, String> env = pb.environment();
    env.put( "JAVATUTOR", "Christian Ullenboom" );

    Process p = pb.start();

    try ( Scanner scanner = new Scanner( p.getInputStream() ) ) {
      System.out.println( scanner.nextLine() );
    }
  }
}
