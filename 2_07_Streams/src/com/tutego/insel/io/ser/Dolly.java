package com.tutego.insel.io.ser;

import java.io.*;
import java.util.*;

class Dolly {

  @SuppressWarnings( "unchecked" )
  public static <T> T deepCopy( T o ) throws Exception {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try ( ObjectOutputStream oos = new ObjectOutputStream( baos ) ) {
      oos.writeObject( o );
    }
    ByteArrayInputStream bais = new ByteArrayInputStream( baos.toByteArray() );
    return (T) new ObjectInputStream( bais ).readObject();
  }

  public static void main( String[] args ) throws Exception {
    Map<String,String> map = new HashMap<>();
    map.put( "Cul de Paris",
             "hinten unter dem Kleid getragenes Gestell oder Polster" );
    
    LinkedList<Map<String,String>> o1 = new LinkedList<>();
    o1.add( map );
    
    @SuppressWarnings("unchecked")
    List<Map<String, String>> o2 = (List<Map<String, String>>) o1.clone();
    
    List<Map<String,String>> o3 = deepCopy( o1 );
    
    map.clear();
    
    System.out.println( o1 ); // [{}]
    System.out.println( o2 ); // [{}]
    System.out.println( o3 ); // [{Cul de Paris=hinten unter dem Kleid ...}]
  }
}