package com.Expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.IExpenseDao;
import com.Expense.dao.IUserDao;
import com.Expense.dto.ExpenseDto;
import com.Expense.model.Expense;
import com.Expense.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements IExpenseService {

	@Autowired
	private IExpenseDao dao;

	@Autowired
	private IUserDao userDao;

	@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public List<Expense> getAllExpenses() {

		return dao.getAllExpenses();
	}

	@Override
	public String addExpense(ExpenseDto expensedto) {
		Expense exp = new Expense();

		exp.setExpenseId(expensedto.getExpenseId());
		exp.setExpenseName(expensedto.getExpenseName());
		exp.setExpensedate(expensedto.getExpensedate());
		exp.setExpense_amount(expensedto.getExpense_amount());

		expenseRepository.save(exp);

		return "Expense added";

	}

	@Override
	public Double sumOfallExpense() {

		return dao.sumOfallExpense();
	}

	@Override
	public List<Object[]> getListOfExpensesmonthWise() {

		return expenseRepository.findBYMonth();
	}

}
