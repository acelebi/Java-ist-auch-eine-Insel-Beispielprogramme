package com.tutego.insel.enumeration;

import java.text.SimpleDateFormat;
import java.util.Locale;

public enum WeekdayInternational {

  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

  @Override
  public String toString() {
    return toString( Locale.getDefault() );
  }

  public String toString( Locale l ) {
    return new SimpleDateFormat("", l).getDateFormatSymbols().getWeekdays()[ ordinal() + 1 ];  
  }
}