package com.tutego.insel.lang;

public class LaunchBrowser {
  public static void main( String[] args ) throws java.io.IOException {
    String url = "http://www.tutego.de/";
    new ProcessBuilder( "rundll32", "url.dll,FileProtocolHandler", url ).start();
    // String pbArgs[] = { "rundll32", "url.dll,FileProtocolHandler", "javascript:location.href='" + url + "'" };
    // new ProcessBuilder( pbArgs ).start();
  }
}
