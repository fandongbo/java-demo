package com.fan.study.demo.annotate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckValidator.class)
public @interface CheckReq {

    int length() default 0;

    int min() default 0;

    String message() default "数据出错";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
