package com.tutego.insel.enumeration;

import java.awt.*;
import javax.swing.Icon;

public enum DefaultIcons implements Icon {

  WARNING {
    @Override public void paintIcon( Component c, Graphics g, int x, int y )
    {
      // g.drawXXX()
    } },
  ERROR {
    @Override public void paintIcon( Component c, Graphics g, int x, int y )
    {
      // g.drawXXX()
    } };

  @Override public int getIconWidth() { return 16; }

  @Override public int getIconHeight() { return 16; }
}