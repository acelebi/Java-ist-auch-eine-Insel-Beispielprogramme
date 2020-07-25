package com.tutego.insel.bean.validation;

import javax.validation.*;

public class EMailValidator implements ConstraintValidator<EMail,String> {

  @Override
  public void initialize( EMail constraintAnnotation ) { }

  @Override
  public boolean isValid( String value, ConstraintValidatorContext context ) {
    return value != null && value.matches( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
  }
}