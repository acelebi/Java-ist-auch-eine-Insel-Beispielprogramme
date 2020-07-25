package com.tutego.insel.mail;

import javax.mail.*;
import javax.swing.JOptionPane;

public class PrintAllMailsWithMailUtils {
  public static void main( String[] args ) throws Exception {
    Session session = MailUtils.getGMailSession(
                        JOptionPane.showInputDialog( "user" ),
                        JOptionPane.showInputDialog( "pass" ) );
    Folder inbox = MailUtils.openPop3InboxReadOnly( session );
//    MailUtils.printAllTextPlainMessages( inbox );
    MailUtils.printAllMultipartMessages( inbox );
    MailUtils.closeInbox( inbox );
  }
}