package com.tutego.insel.ui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemTrayDemo {
  public static void main( String[] args ) throws Exception {
    Image image = Toolkit.getDefaultToolkit().getImage( SystemTrayDemo.class.getResource( "/images/javabean.gif" ) );

    PopupMenu popup = new PopupMenu();
    MenuItem item = new MenuItem( "Ende" );
    item.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        System.exit( 0 );
      }
    } );
    popup.add( item );

    TrayIcon trayIcon = new TrayIcon( image, "Java-Tray ", popup );
    trayIcon.setImageAutoSize( true );

    SystemTray tray = SystemTray.getSystemTray();
    tray.add( trayIcon );

    Thread.sleep( 2000 );

    trayIcon.displayMessage( "Formatierung beendet.",
                             "Sie können den Rechner jetzt neu installieren.",
                             TrayIcon.MessageType.INFO );
  }
}
