package com.tutego.insel.mail;

import java.io.*;
import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class MailUtils {

  private MailUtils() {}

  public static Session getGMailSession( String user, String pass ) {
    final Properties props = new Properties();

    // Zum Empfangen
    props.setProperty( "mail.pop3.host", "pop.googlemail.com" );
    props.setProperty( "mail.pop3.user", user );
    props.setProperty( "mail.pop3.password", pass );
    props.setProperty( "mail.pop3.port", "995" );
    props.setProperty( "mail.pop3.auth", "true" );
    props.setProperty( "mail.pop3.socketFactory.class",
                       "javax.net.ssl.SSLSocketFactory" );

    // Zum Senden
    props.setProperty( "mail.smtp.host", "smtp.gmail.com" );
    props.setProperty( "mail.smtp.auth", "true" );
    props.setProperty( "mail.smtp.port", "465" );
    props.setProperty( "mail.smtp.socketFactory.port", "465" );
    props.setProperty( "mail.smtp.socketFactory.class",
                       "javax.net.ssl.SSLSocketFactory" );
    props.setProperty( "mail.smtp.socketFactory.fallback", "false" );

    return Session.getInstance( props, new javax.mail.Authenticator() {
      @Override protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication( props.getProperty( "mail.pop3.user" ),
                                           props.getProperty( "mail.pop3.password" ) );
      }
    } );
//    session.setDebug( true );
  }

  public static Folder openPop3InboxReadOnly( Session session ) throws MessagingException {
    Store store = session.getStore( "pop3" );
    store.connect();

    Folder folder = store.getFolder( "INBOX" );
    folder.open( Folder.READ_ONLY );

    return folder;
  }

  public static void printAllTextPlainMessages( Folder folder )
                       throws MessagingException, IOException {
    for ( Message m : folder.getMessages() ) {
      System.out.println( "\nNachricht:" );
      System.out.println( "Von: " + Arrays.toString(m.getFrom()) );
      System.out.println( "Betreff: " + m.getSubject() );
      System.out.println( "Gesendet am: " + m.getSentDate() );
      System.out.println( "Content-Type: " +
                          new ContentType( m.getContentType() ) );

      if ( m.isMimeType( "text/plain" ) )
        System.out.println( m.getContent() );
    }
  }

  public static void printAllMultipartMessages( Folder folder )
                       throws MessagingException, IOException {
    for ( Message m : folder.getMessages() ) {
      if ( m.isMimeType( "text/plain" ) )
        System.out.println( "Nachricht ist text/plain" );
      else if ( m.isMimeType( "multipart/*" ) ) {
        System.out.println( "Verarbeite multipart/* Nachricht" );
        Multipart mp = (Multipart) m.getContent();

        // Der erste Part ist immer die Hauptnachricht
        if ( mp.getCount() > 1 ) {
          Part part = mp.getBodyPart( 0 );
          System.out.println( part.getContent() );
        }

        // Laufe über alle Teile (Anhänge)
        for ( int j = 1; j < mp.getCount(); j++ ) {
          Part part = mp.getBodyPart( j );
          String disp = part.getDisposition();
          if ( disp == null || disp.equalsIgnoreCase( Part.ATTACHMENT ) ) {
            MimeBodyPart mimePart = (MimeBodyPart) part;
            
            // Gib MIME-Typ jedes Anhangs aus; im Fall von XML die Nachricht 
            System.out.println( "MIME-Typ ist " + mimePart.getContentType() );
            if ( mimePart.isMimeType( "text/xml" ) )
              System.out.println( mimePart.getContent() );
          }
        }
        System.out.println( "Verarbeitung abgeschlossen" );
      }
    }
  }

  public static void closeInbox( Folder folder ) throws MessagingException {
    folder .close( false );
    folder.getStore().close();
  }

  public static void postMail( Session session, String recipient,
                               String subject,
                               String message ) throws MessagingException {
    Message msg = new MimeMessage( session );
  
    InternetAddress addressTo = new InternetAddress( recipient );
    msg.setRecipient( Message.RecipientType.TO, addressTo );
  
    msg.setSubject( subject );
    msg.setContent( message, "text/plain" );
    Transport.send( msg );
  }

  public static void postMultipartTextAndHtmlMail( Session session, String recipient,
                                                   String subject, String txtMsg,
                                                   String htmlMsg ) throws MessagingException {
    MimeMultipart content = new MimeMultipart( "alternative" );
  
    MimeBodyPart text = new MimeBodyPart();
    text.setContent( txtMsg, "text/text" );
    content.addBodyPart( text );
  
    MimeBodyPart html = new MimeBodyPart();
    html.setContent( htmlMsg, "text/html" );
    content.addBodyPart( html );
  
    Message msg = new MimeMessage( session );
  
    InternetAddress addressTo = new InternetAddress( recipient );
    msg.setRecipient( Message.RecipientType.TO, addressTo );
  
    msg.setSubject( subject );
    msg.setContent( content );
    Transport.send( msg );
  }

  public static void postAttachement( Session session, String recipient,
                                      String subject, String message,
                                      String filename ) throws MessagingException {
    MimeMultipart content = new MimeMultipart( "mixed" );
  
    MimeBodyPart text = new MimeBodyPart();
    text.setText( message );
    content.addBodyPart( text );
  
    BodyPart messageBodyPart = new MimeBodyPart();
    messageBodyPart.setDataHandler(
                      new DataHandler( new FileDataSource( filename ) ) );
    messageBodyPart.setFileName( new File(filename).getName() );
    content.addBodyPart( messageBodyPart );
  
    Message msg = new MimeMessage( session );
  
    InternetAddress addressTo = new InternetAddress( recipient );
    msg.setRecipient( Message.RecipientType.TO, addressTo );
  
    msg.setSubject( subject );
    msg.setContent( content );
    Transport.send( msg );
  }
}