package com.tutego.insel.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target( ElementType.FIELD )
@Retention( RetentionPolicy.RUNTIME )
public @interface UrlResource {

  enum UpperLowerCase { UNCHANGED, LOWERCASE, UPPERCASE }

  String value();

  boolean trim() default false;

  UpperLowerCase upperLowerCase() default UpperLowerCase.UNCHANGED;

  Class<? extends ResourceConverter>[] converter() default { };
}