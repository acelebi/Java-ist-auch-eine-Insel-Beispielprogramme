package com.tutego.insel.ui.table;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;

class _SquareTableModelComplex extends AbstractTableModel
{
  class ColumnListener extends MouseAdapter
  {
    protected JTable table;

    public ColumnListener(JTable table) {
      this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      TableColumnModel colModel = table.getColumnModel();
      int columnModelIndex = colModel.getColumnIndexAtX(e.getX());
      int modelIndex = colModel.getColumn(columnModelIndex).getModelIndex();

      if ( modelIndex != 0 )  // Just sort first column
        return;

      if ( sortColumn == modelIndex )
        sortAsc = !sortAsc;
      else
        sortColumn = modelIndex;

      table.tableChanged( new TableModelEvent( table.getModel(),
                                                 TableModelEvent.HEADER_ROW ) );
    }
  }

  @Override public int getRowCount()
  {
    return 20;
  }

  @Override public int getColumnCount()
  {
    return 5;
  }

  final static String columnNames[] = {
    "Zahl", "Quadrat", "Quadrat Gerade", "Kubik", "Tolle Zahl"
  };

  int sortColumn = 0;

  boolean sortAsc = true;

  @Override public String getColumnName( int col )
  {
    String s = columnNames[col];
    return col == 0 ? s + ( sortAsc ? " »" : " «" ) : s;
  }

  final static Class<?> columnClasses[] = {
    Integer.class, Long.class, Boolean.class, String.class, String.class
  };

  @Override public Class<?> getColumnClass( int col )
  {
    return columnClasses[col];
  }

  // Wert einer Zelle

  public void setValueAt( int row, int col, Object o )
  {
    System.out.println( row + " " + col + " " + o );
  }

  @Override public Object getValueAt( int row, int col )
  {
    if ( !sortAsc )
      row = getRowCount() - row;

    switch ( col )
    {
      case 0  : return Integer.valueOf( row );
      case 1  : return Long.valueOf( row * row );
      case 2  : return Boolean.valueOf( (row * row) % 2 == 0 );
      default : return "" + (row * row * row);
    }
  }
}

