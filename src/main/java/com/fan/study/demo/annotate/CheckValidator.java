package com.fan.study.demo.annotate;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckValidator implements ConstraintValidator<CheckReq, Object> {

    private int min;

    private int length;


    @Override
    public void initialize(CheckReq constraintAnnotation) {
        length = constraintAnnotation.length();
        min = constraintAnnotation.min();
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("进入校验了--------------------");
        if (obj instanceof String) {
            if (StringUtils.isEmpty(obj) || ((String) obj).length() > 3) {
                return false;
            }
        } else if (obj instanceof Integer) {
            if ((Integer) obj < 1) {
                return false;
            }
        } else if (obj instanceof Long) {
            if ((Long) obj < 1) {
                return false;
            }
        }
        return true;
    }
}
