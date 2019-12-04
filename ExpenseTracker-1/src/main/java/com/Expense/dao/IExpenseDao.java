package com.Expense.dao;

import java.util.List;

import com.Expense.model.Expense;

public interface IExpenseDao {

	
	String addExpense(Expense expense);

	List<Expense> getAllExpenses();

	Double sumOfallExpense();

	
}
