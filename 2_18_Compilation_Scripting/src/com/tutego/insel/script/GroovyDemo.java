package com.tutego.insel.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class GroovyDemo {
  public static void main( String[] args ) throws Exception {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName( "groovy" );
    System.out.println( engine.eval( "(1g..42g.gcd(56g)).sum()" ) ); // 105
  }
}
