package com.tutego.insel.bean.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DialogPlayer {
  public interface NameValidation { }
  public interface AgeValidation extends NameValidation { }
  
  @NotNull( groups = NameValidation.class )
  public String name;

  @Min( value = 10, groups = AgeValidation.class )
  @Max( value = 110, groups = AgeValidation.class )
  public int age;
}
