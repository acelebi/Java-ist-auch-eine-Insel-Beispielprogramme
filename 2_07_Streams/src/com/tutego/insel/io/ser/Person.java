package com.tutego.insel.io.ser;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

  static int BMI_OVERWEIGHT = 25;

  String name;
  Date birthday;
  double bodyHeight;
}
