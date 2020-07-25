package com.tutego.insel.ui.dialog;

import javax.swing.*;

public class JOptionPaneDialogDemo {
  public static void main( String[] args ) {

    // Dialog für Nachricht 
    JOptionPane.showMessageDialog( null, "Wir Kinder aus dem Möwenweg" );
    
    // Dialog für einfache Eingabe
    JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
    
    // Dialog mit Auswahl Ja/Nein/Abbrechen
    JOptionPane.showConfirmDialog( null, "Alles OK?" );

    // Dialog mit unterschiedlichen Auswahlmöglichkeiten
    String[] genderOptions = {
      "männlich", "weiblich", "keine Ahnung", "ändert sich ständig" };

    String gender = (String) JOptionPane.showInputDialog( null,
              "Geschlecht",
              "Bitte das Geschlecht wählen (eigenes, nicht gewünschtes)",
              JOptionPane.QUESTION_MESSAGE,
              null, genderOptions,
              genderOptions[1] );
    
    System.out.println( gender );
    
    // Angepasster Optionsdialog
    String[] yesNoOptions = { "Ja", "Nein", "Abbrechen" };

    int n = JOptionPane.showOptionDialog( null,
              "Ja oder Nein?",               // question
              "Ja/Nein/Abbrechen",           // title
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.QUESTION_MESSAGE,  // icon
              null, yesNoOptions,yesNoOptions[0] );
    
    if ( n == JOptionPane.YES_OPTION )
      System.out.println("Ja gewählt");
  }
}
