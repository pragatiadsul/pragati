package com.Expense.exception;

public class CategoryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CategoryNotFoundException(String error) {
		super(error);
	}

}
