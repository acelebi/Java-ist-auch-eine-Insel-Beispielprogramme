package com.tutego.insel.json;

import javax.script.*;
import jdk.nashorn.api.scripting.JSObject;

public class JavaSciptJSONDemo {
  public static void main( String[] args ) throws ScriptException {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName( "JavaScript" );
    engine.eval( "person = { 'name' : 'Michael Jackson', 'age' : 2*25 }" );
    JSObject obj = (JSObject) engine.get( "person" );
    System.out.println( obj.getMember( "age" ) );   // Michael Jackson
  }
}
