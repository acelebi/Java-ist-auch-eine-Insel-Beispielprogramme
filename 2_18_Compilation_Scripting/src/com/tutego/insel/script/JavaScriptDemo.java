package com.tutego.insel.script;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptDemo {
  public static void main( String[] args ) throws ScriptException {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName( "JavaScript" );
    engine.put( "name", "Christian Ullenboom" );
    Reader script = new InputStreamReader( JavaScriptDemo.class.getResourceAsStream( "tutego.js" ),
                                           StandardCharsets.UTF_8 );
    engine.eval( script );
    System.out.println( engine.get( "month" ) );
  }
}
