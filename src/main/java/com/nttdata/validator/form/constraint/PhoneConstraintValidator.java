package com.nttdata.validator.form.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

	
	public void initialize(Phone String) { }

	public boolean isValid(String phoneField, ConstraintValidatorContext cxt) {
		if(phoneField == null) {
			return false;
		}
		return phoneField.matches("[0-9()-]*");
	}

}
