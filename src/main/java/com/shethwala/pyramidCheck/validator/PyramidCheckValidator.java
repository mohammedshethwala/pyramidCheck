package com.shethwala.pyramidCheck.validator;

import com.shethwala.pyramidCheck.exception.InputDataValidationException;

public class PyramidCheckValidator {
	
	public static void validateInput(String word) throws InputDataValidationException {
		
		if(word != null && (word.isEmpty() || (!word.matches("^[a-zA-Z]*$"))))
			throw new InputDataValidationException("Input must not be empty and must only have letters");
		
	}

}
