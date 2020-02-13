package com.shethwala.pyramidCheck.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shethwala.pyramidCheck.exception.InputDataValidationException;
import com.shethwala.pyramidCheck.models.ErrorMessage;

@ControllerAdvice
public class PyramidCheckExceptionHandler {
	
	@ExceptionHandler(value = InputDataValidationException.class)
    public ResponseEntity<Object> exception(InputDataValidationException exception) {
		
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorMessage(exception.getMessage());
		errorMessage.setHttpStatus(400);
		
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

}
