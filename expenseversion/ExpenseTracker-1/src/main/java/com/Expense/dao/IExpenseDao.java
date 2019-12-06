package com.Expense.dao;

import java.util.List;

import com.Expense.model.Expense;

public interface IExpenseDao {

	List<Object> getListOfExpenses();

//	List<Object> getListOfExpenses();

	String addExpense(Expense expense);

	List<Expense> getAllExpenses();

	Double sumOfallExpense();

	// String addExpense(Expense expense);

}
