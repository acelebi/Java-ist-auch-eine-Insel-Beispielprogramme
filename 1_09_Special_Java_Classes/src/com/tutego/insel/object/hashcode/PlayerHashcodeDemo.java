package com.tutego.insel.object.hashcode;

public class PlayerHashcodeDemo {
  
  public static void main( String[] args ) {
    Player bruceWants = new Player();
    bruceWants.name = "Bruce Wants";
    bruceWants.age = 32;
    bruceWants.weight = 70.3;
    
    Player bruceLii = new Player();
    bruceLii.name = "Bruce Lii";
    bruceLii.age = 32;
    bruceLii.weight = 70.3;;
    
    System.out.println( bruceWants.hashCode() );                 // -340931147
    System.out.println( bruceLii.hashCode() );                   // 301931244
    System.out.println( System.identityHashCode( bruceWants ) ); // 1671711
    System.out.println( System.identityHashCode( bruceLii ) );   // 11394033
    System.out.println( bruceLii.equals( bruceWants ) );         // false
    
    bruceWants.name = "Bruce Lii";
    System.out.println( bruceWants.hashCode() );                 // 301931244
    System.out.println( bruceLii.equals( bruceWants ) );         // true
  }
}