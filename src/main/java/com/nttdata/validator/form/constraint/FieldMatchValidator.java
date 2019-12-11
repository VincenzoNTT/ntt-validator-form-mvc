package com.nttdata.validator.form.constraint;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

    private String baseField;
    private String matchField;

    public void initialize(final FieldMatch constraintAnnotation) {
    	baseField = constraintAnnotation.baseField();
    	matchField = constraintAnnotation.matchField();
    }

    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        boolean valid = true;
        try
        {
            final Object firstObj = BeanUtils.getProperty(value, baseField);
            final Object secondObj = BeanUtils.getProperty(value, matchField);

            valid =  firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
        }
        catch (final Exception ignore)
        {
            // ignore
        }

        return valid;
    }
}