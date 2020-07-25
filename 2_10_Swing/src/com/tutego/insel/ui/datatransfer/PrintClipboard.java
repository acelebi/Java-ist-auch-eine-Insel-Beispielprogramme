package com.tutego.insel.ui.datatransfer;

import java.awt.Toolkit;
import java.awt.datatransfer.*;

class PrintClipboard {
  public static void main( String[] args ) throws Exception {
    Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    Transferable transferData = systemClipboard.getContents( null );

    for ( DataFlavor dataFlavor : transferData.getTransferDataFlavors() ) {
      Object content = transferData.getTransferData( dataFlavor );

      if ( content instanceof String ) {
        System.out.println( content );
        break;
      }
    }
  }
}
