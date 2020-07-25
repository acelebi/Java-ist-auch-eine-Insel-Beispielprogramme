package com.tutego.insel.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
  public static void main( String[] args ) throws RemoteException, NotBoundException {
    Registry registry = LocateRegistry.getRegistry();
    Adder adder = (Adder) registry.lookup( "Adder" );
    System.out.println( adder.add( 47, 11 ) );
  }
}
