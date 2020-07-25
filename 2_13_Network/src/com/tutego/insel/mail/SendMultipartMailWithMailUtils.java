package com.tutego.insel.mail;

import javax.mail.*;
import javax.swing.JOptionPane;

public class SendMultipartMailWithMailUtils {
  public static void main( String[] args ) throws Exception {
    Session session = MailUtils.getGMailSession( 
                        JOptionPane.showInputDialog( "user" ),
                        JOptionPane.showInputDialog( "pass" ) );
    MailUtils.postMultipartTextAndHtmlMail(
                session, "a@b.c",
                "Text und HTML beides in einer EMail",
                "1. Text als Text",
                "<html>2. Text als <b>HTML</b></html>" );
  }
}