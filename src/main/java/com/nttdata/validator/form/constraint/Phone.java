package com.nttdata.validator.form.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * The annotated element phone number digit  .
 * <p>
 * Supported types are:
 * <ul>
 *     <li>{@code CharSequence} ( [0-9()-]* )</li>
 * </ul>
 * <p>
 *
 * @since 1.0
 * 
 * @author nttdata
 */
@Documented
@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

	
	String message() default "{com.nttdata.validator.form.constraint.Phone.message}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	 
}