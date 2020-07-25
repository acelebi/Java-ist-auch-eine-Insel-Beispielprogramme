package com.tutego.insel.bundle;

import java.util.ListResourceBundle;

public class MonthResourceBundle_de_DE extends ListResourceBundle {

  private static final String[] MONTHS = {
      "Jan", "Feb", "Mrz", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"
  };

  private static final Object[][] contents = {
    { "jan", MONTHS[0] },
    { "month", MONTHS }
  };

  @Override
  protected Object[][] getContents() {
    return contents;
  }
}