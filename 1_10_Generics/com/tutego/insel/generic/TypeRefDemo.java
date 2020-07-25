package com.tutego.insel.generic;

public class TypeRefDemo {
  
  public static void main( String[] args ) {
    TypeRef<Pocket<String>> ref1 = new TypeRef<Pocket<String>>(){};
    System.out.println( ref1.type );     // com.tutego.insel.generics.Pocket<java.lang.String>
    TypeRef<Pocket<Byte>> ref2 = new TypeRef<Pocket<Byte>>(){};
    System.out.println( ref2.type );     // com.tutego.insel.generics.Pocket<java.lang.Byte>
  }
}
