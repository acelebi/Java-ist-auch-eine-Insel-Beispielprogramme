package com.tutego.insel.time.easter;

import java.time.LocalDate;

public class Easter {

  /**
   * Returns the date of Easter Sunday for a given year.
   * 
   * @param year > 1583
   * @return The date of Easter Sunday for a given year.
   */
  public static LocalDate easterSunday( int year ) {
    int i = year % 19;
    int j = year / 100;
    int k = year % 100;

    int l = (19 * i + j - (j / 4) - ((j - ((j + 8) / 25) + 1) / 3) + 15) % 30;
    int m = (32 + 2 * (j % 4) + 2 * (k / 4) - l - (k % 4)) % 7;
    int n = l + m - 7 * ((i + 11 * l + 22 * m) / 451) + 114;
    
    int month = n / 31;
    int day   = (n % 31) + 1;
    
    return LocalDate.of( year, month, day );
  }
}
