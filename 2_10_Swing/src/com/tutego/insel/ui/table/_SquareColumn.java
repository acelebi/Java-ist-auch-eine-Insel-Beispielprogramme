package com.tutego.insel.ui.table;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class _SquareColumn {
  public static void main( String[] args ) {
    _SquareTableModelComplex model = new _SquareTableModelComplex();

    JTable table = new JTable();
    TableCellRenderer renderer = new ColoredTableCellRenderer();
    table.setDefaultRenderer( Long.class, renderer );
    table.setModel( model );

    // table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    //
    JTableHeader header = table.getTableHeader();
    header.setUpdateTableInRealTime( true );
    header.addMouseListener( model.new ColumnListener( table ) );
    header.setReorderingAllowed( true );

    JFrame frame = new JFrame();
    frame.getContentPane().add( new JScrollPane( table ) );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.pack();
    frame.setVisible( true );
  }
}
