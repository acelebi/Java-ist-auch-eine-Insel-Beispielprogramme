package com.tutego.insel.pattern.singleton;

import java.util.Properties;

public class Configuration2 {

  private static final Configuration2 INSTANCE = new Configuration2();

  public final static Configuration2 getInstance() {
    return INSTANCE;
  }

  private Configuration2() {
  }
  
  private Properties props = new Properties( System.getProperties() );

  public String getVersion() {
    return "1.2";
  }
  
  public String getUserDir() {
    return props.getProperty( "user.dir" );
  }
}
