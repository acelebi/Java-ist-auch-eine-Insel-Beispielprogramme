package com.tutego.insel.mail;

import javax.mail.*;
import javax.swing.JOptionPane;

public class SendMailWithMailUtils {
  public static void main( String[] args ) throws Exception {
    Session session = MailUtils.getGMailSession( 
                        JOptionPane.showInputDialog( "user" ),
                        JOptionPane.showInputDialog( "pass" ) );
    MailUtils.postMail( session, "a@b.c",
                        "Kurze Info", "Hab's verstanden!" );
  }
}