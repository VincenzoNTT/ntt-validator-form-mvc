package com.nttdata.validator.form.constraint;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *  This is a class-level annotation where we can compare two fields for equality and
 *  pass in an optional message to display to the user if the constraint validation fails. Accepts {@code List.FieldMatch}.
 *
 * @author nttdata
 *
 * @since 1.0
 */
@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = FieldMatchValidator.class)
@Documented
public @interface FieldMatch
{
    String message() default "{com.nttdata.validator.form.constraint.FieldMatch.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String baseField();
    String matchField();

    /**
	 * Defines list {@code FieldMatch}.
	 *
	 * @see FieldMatch
	 */
    @Target({TYPE, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List
    {
        FieldMatch[] value();
    }
}