package com.tutego.insel.io.stream;

import java.io.*;
import java.util.Scanner;

public class HTMLReaderDemo
{
  @SuppressWarnings( "resource" )
  public static void main( String[] args )
  {
    String s = "<html>Hallo! <b>Ganz schön fett.</b> "
               + "Ah, wieder normal.</html>";

    Reader sr = new StringReader( s );
    Reader hr = new HTMLReader( sr );
    Scanner scanner = new Scanner( hr );
    while ( scanner.hasNextLine() )
      System.out.println( scanner.nextLine() );  
  }
}
