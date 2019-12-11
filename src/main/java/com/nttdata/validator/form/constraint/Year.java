package com.nttdata.validator.form.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 *
 * @author nttdata
 */
@Documented
@Constraint(validatedBy = YearConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Year {

	/**
	 * @return value the element
	 */
	int value();
	
	String message() default "{com.nttdata.validator.form.constraint.Year.message}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	 
}