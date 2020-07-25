package com.tutego.insel.ui.table;

import java.awt.*;
import javax.swing.table.*;

class ColoredTableCellRenderer extends DefaultTableCellRenderer {
  @Override
  public void setValue( Object value ) {
    if ( value instanceof Long ) {
      setForeground( (Long) value % 2 == 0 ? Color.BLUE : Color.GRAY );
      setText( value.toString() );
    }
    else
      super.setValue( value );
  }
}