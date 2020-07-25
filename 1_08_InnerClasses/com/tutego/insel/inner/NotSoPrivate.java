package com.tutego.insel.inner;

@SuppressWarnings("unused")
public class NotSoPrivate {

  private static class Family { private String dad, mom; }

  public static void main( String[] args ) {
    class Node { private Node next; }

    Node n = new Node();
    n.next = new Node();

    Family ullenboom = new Family();
    ullenboom.dad = "Heinz";
    ullenboom.mom = "Eva";
  }
}

//class B
//{
//  B() {
//    A.Family a;   // Compiler Fehler!
//  }
//}