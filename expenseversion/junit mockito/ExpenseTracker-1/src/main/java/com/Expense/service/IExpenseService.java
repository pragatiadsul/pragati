package com.Expense.service;

import java.util.List;

import com.Expense.dto.ExpenseDto;
import com.Expense.model.Expense;

public interface IExpenseService {

	String addExpense(ExpenseDto expenseDto);

	List<Expense> getAllExpenses();

	Double sumOfallExpense();

	List<Object[]> getListOfExpensesmonthWise();

}
