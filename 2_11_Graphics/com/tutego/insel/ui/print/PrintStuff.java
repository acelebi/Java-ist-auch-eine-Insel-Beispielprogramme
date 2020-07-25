package com.tutego.insel.ui.print;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.*;

public class PrintStuff {
  public static void main( String[] args ) throws PrinterException {
    PrinterJob pjob = PrinterJob.getPrinterJob();

    if ( pjob.printDialog() == false )
      return;

    pjob.setPrintable( new TextPrintable() );
    pjob.print();
  }

  static class TextPrintable implements Printable {
    static Font FONT = new Font( Font.SANS_SERIF, Font.PLAIN, 20 );

    @Override
    public int print( Graphics g, PageFormat pageFormat, int pageIndex ) {
      if ( pageIndex >= 2 )
        return Printable.NO_SUCH_PAGE;

      g.setFont( FONT );
      g.drawString( "Hallo auf Seite " + pageIndex, 100, 100 );

      return Printable.PAGE_EXISTS;
    }
  }
}