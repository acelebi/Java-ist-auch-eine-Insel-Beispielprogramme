package com.tutego.security;

import java.io.File;
import java.util.Arrays;

// java -Djava.security.manager -Djava.security.policy=myPol.policy com.tutego.security.SecTest

public class SecTest {
  public static void main( String[] args ) {
    System.err.println( System.getSecurityManager() );
    System.err.println( Arrays.toString( new File( "c:/" ).list() ) );
  }
}
