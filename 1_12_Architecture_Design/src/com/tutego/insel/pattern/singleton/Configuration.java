package com.tutego.insel.pattern.singleton;

import java.util.Properties;

public enum Configuration {

  INSTANCE;

  private Properties props = new Properties( System.getProperties() );

  public String getVersion() {
    return "1.2";
  }
  
  public String getUserDir() {
    return props.getProperty( "user.dir" );
  }
}
