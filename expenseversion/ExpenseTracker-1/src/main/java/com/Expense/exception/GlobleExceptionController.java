package com.Expense.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionController {

	@ExceptionHandler(CategoryNotFoundException.class)
	ResponseEntity<Object> CategoryException(CategoryNotFoundException CategoryException) {
		return new ResponseEntity<Object>("Category Not found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(UserNotFoundException.class)
	ResponseEntity<Object> UserException(UserNotFoundException CategoryException) {
		return new ResponseEntity<Object>("user Not found", HttpStatus.NOT_FOUND);
	}

}
