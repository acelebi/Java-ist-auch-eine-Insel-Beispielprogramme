package com.tutego;

import java.util.Date;

public class DatePrinter {
  public static void printCurrentDate() {
    System.out.printf( "%tD%n", new Date() );
  }
}