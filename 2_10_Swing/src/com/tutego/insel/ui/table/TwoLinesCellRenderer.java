package com.tutego.insel.ui.table;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class TwoLinesCellRenderer extends JTextArea implements TableCellRenderer {
  @Override public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected,
                                                            boolean hasFocus, int row, int column ) {
    setText( value.toString() );    // Value kann String mit \n enthalten

    return this;
  }
}