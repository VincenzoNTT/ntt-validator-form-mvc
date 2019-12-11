package com.nttdata.validator.form.constraint;

import javax.validation.Payload;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 *  This annotation check valid password.
 *
 *  The annotated element must be true :
 * <ul>
 *   <li>{@code CharSequence} (least 8 characters)</li>
 *   <li>{@code CharSequence} (at least one upper-case character)</li>
 *   <li>{@code CharSequence} (at least one lower-case character)</li>
 *   <li>{@code CharSequence} (at least one digit character)</li>
 *   <li>{@code CharSequence} (at least one symbol (special character))</li>
 *   <li>{@code CharSequence} (no whitespace)</li>
 * </ul>
 * 
 *  @spec
 *  File massage.properties not exist default. 
 *  otherwise: 
 *  <ul>
 *   <li>ILLEGAL_WHITESPACE=Password cannot contain whitespace characters.</li>
 *	 <li>INSUFFICIENT_UPPERCASE=Password must contain at least %1$s uppercase characters.</li>
 *   <li>INSUFFICIENT_LOWERCASE=Password must contain at least %1$s lowercase characters.</li>
 *   <li>INSUFFICIENT_DIGIT=Password must contain at least %1$s digit characters.</li>
 *   <li>INSUFFICIENT_SPECIAL=Password must contain at least %1$s special characters.</li>
 *   <li>TOO_LONG=Password must be no more than %2$s characters in length.</li>
 *   <li>TOO_SHORT=Password must be at least %1$s characters in length.</li>
 * </ul>
 * 
 * @author nttdata
 *
 * @since 1.0
 */
@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface ValidPassword {

    String message() default "com.nttdata.validator.form.constraint.ValidPassword.message";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}