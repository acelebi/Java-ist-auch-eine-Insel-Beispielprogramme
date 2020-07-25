package com.tutego.insel.input;

class InputWithDialog {
  public static void main( String[] args ) {
    String s = javax.swing.JOptionPane.showInputDialog( "Wo kommst du denn wech?" );
    System.out.println( "Aha, du kommst aus " + s );
  }
}
