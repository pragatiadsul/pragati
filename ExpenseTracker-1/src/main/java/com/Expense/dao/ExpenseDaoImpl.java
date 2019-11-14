package com.Expense.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Expense.model.Category;
import com.Expense.model.Expense;
@Repository
@Transactional
public class ExpenseDaoImpl implements IExpenseDao {

	@PersistenceContext
	private EntityManager entitytManager;

	@Override
	public String addExpense(Expense expense) {
		// TODO Auto-generated method stub
		
			entitytManager.persist(expense);
			return "expense added";	 
	}

	@Override
	public List<Object> getListOfExpenses() {


	
	String jpql = "select monthname(e.expensedate),YEAR(e.expensedate), SUM(e.expenseAmount) from Expense e GROUP BY monthname(e.expensedate) ";
		List<Object> data = new ArrayList<Object>();
		data = entitytManager.createQuery(jpql).getResultList();
		return data; 
}

	@Override
	public List<Expense> getAllExpenses() {
		String jpql = "select e from Expense e";
		return entitytManager.createQuery(jpql,Expense.class).getResultList();
	}
}