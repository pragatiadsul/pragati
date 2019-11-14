package com.Expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.IExpenseDao;
import com.Expense.dao.IUserDao;
import com.Expense.model.Expense;
import com.Expense.model.User;

@Service
public class ExpenseServiceImpl implements IExpenseService {

	@Autowired
	private IExpenseDao dao;

	@Autowired
	private IUserDao userDao;
	
	
	

	@Override
	public String addExpense(Expense expense) {

	/*User user = userDao.getUserByID(expense.getUser().getUserId());
		expense.setUser(user);
		System.out.println("in service");
		*/
		return dao.addExpense(expense);
	
		// TODO Auto-generated method stub
		//
//return dao.addExpense(expense);
	}

	@Override
	public List<Object> getListOfExpenses() {
		// TODO Auto-generated method stub
		return dao.getListOfExpenses();
	}

	@Override
	public List<Expense> getAllExpenses() {
		// TODO Auto-generated method stub
		return dao.getAllExpenses();
	}

}
