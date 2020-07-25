package com.tutego.insel.ui.table;

import javax.swing.table.AbstractTableModel;

class SquareTableModelSimple extends AbstractTableModel {

  @Override public int getRowCount() {
    return 100;
  }

  @Override public int getColumnCount() {
    return 3;
  }

  @Override public String getValueAt( int row, int col ) {
    if ( col == 0 )
      return "" + row;
    else if ( col == 1 )
      return "" + (row * row);
    else
      return "" + (row * row * row);
  }
}