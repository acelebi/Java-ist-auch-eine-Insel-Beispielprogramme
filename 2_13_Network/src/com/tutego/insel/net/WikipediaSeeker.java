package com.tutego.insel.net;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.*;

public class WikipediaSeeker {

  public static void main( String[] args ) throws Exception {

    String search = args.length > 0 ? String.join( "_", args ) : "Java (Programmiersprache)";
    search = URLEncoder.encode( search, StandardCharsets.UTF_8.name() );
    String baseUrl = "http://de.wikipedia.org/w/api.php?action=query&generator=search&format=txt&gsrsearch=";
    URL url = new URL( baseUrl + search );
    //      [title] => Java (Programmiersprache)
    Pattern titlePattern = Pattern.compile( "\\s+\\[title\\] => (.*)" );
    try ( Scanner scanner = new Scanner( url.openStream(),
                                         StandardCharsets.UTF_8.name() ) ) {
      while ( scanner.hasNextLine() ) {
        Matcher matcher = titlePattern.matcher( scanner.nextLine() );
        if ( matcher.matches() )
          System.out.println( matcher.group(1) );
      }
    }
  }
}