package com.Expense.service;

import java.util.List;


import com.Expense.model.Expense;

public interface IExpenseService {

	String addExpense(Expense expense);

	// List<Object> getListOfExpenses();

	List<Object> getListOfExpenses();

	

	List<Expense> getAllExpenses();

}
