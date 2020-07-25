package com.tutego.insel.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

public class Server {

  public static void main( String[] args ) throws RemoteException {
    LocateRegistry.createRegistry( Registry.REGISTRY_PORT );

    AdderImpl adder = new AdderImpl();
    Adder stub = (Adder) UnicastRemoteObject.exportObject( adder, 0 );
    RemoteServer.setLog( System.out );

    Registry registry = LocateRegistry.getRegistry();
    registry.rebind( "Adder", stub );

    System.out.println( "Adder angemeldet" );
  }
}
