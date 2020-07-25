package com.tutego.insel.mail;

import javax.mail.*;
import javax.swing.JOptionPane;

public class SendAttachementWithMailUtils {
  public static void main( String[] args ) throws Exception {
    Session session = MailUtils.getGMailSession( 
                        JOptionPane.showInputDialog( "user" ),
                        JOptionPane.showInputDialog( "pass" ) );
    MailUtils.postAttachement( session, "a@b.c", "Mail mit Anhang",
                               "Körper", "c:/eula.1028.txt" );
  }
}