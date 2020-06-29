package com.jaenyeong.springapplicationcontext.ValidationAbstraction;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Event.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(
				errors, "title", "NotEmpty", "Empty title is now allowed");

		// 직접 담을 수 있음
//		Event event = (Event) target;
//		if (event.getTitle() == null) {
//			errors.reject("");
//		}
	}
}
