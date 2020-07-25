package com.tutego.insel.ui.table;

import javax.swing.*;
import javax.swing.table.*;

public class SquareTableWithRenderer {
  public static void main( String[] args ) {
    TableModel model = new _SquareTableModelComplex();

    JTable table = new JTable();
    TableCellRenderer renderer = new ColoredTableCellRenderer();
    table.setDefaultRenderer( Long.class, renderer );
    table.setModel( model );

    JFrame frame = new JFrame();
    frame.getContentPane().add( new JScrollPane( table ) );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.pack();
    frame.setVisible( true );
  }
}