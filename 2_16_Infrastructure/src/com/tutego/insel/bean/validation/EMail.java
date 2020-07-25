package com.tutego.insel.bean.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;
import javax.validation.*;

@Constraint( validatedBy = EMailValidator.class )
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention( RUNTIME )
@Documented
public @interface EMail {
  String message() default "ist keine gültige E-Mail Adresse";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
