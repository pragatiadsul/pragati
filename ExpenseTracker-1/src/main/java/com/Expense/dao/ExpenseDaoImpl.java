package com.Expense.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Expense.model.Expense;

@Repository
@Transactional
public class ExpenseDaoImpl implements IExpenseDao {

	@PersistenceContext
	private EntityManager entitytManager;

	@Override
	public String addExpense(Expense expense) {
		entitytManager.persist(expense);
		return "expense added";
	}


	@Override
	public List<Expense> getAllExpenses() {
		CriteriaBuilder criteriaBuilder = entitytManager.getCriteriaBuilder();
		CriteriaQuery<Expense> criteriaQuery = criteriaBuilder.createQuery(Expense.class);
		Root<Expense> root = criteriaQuery.from(Expense.class);
		criteriaQuery.select(root);
	
		return entitytManager.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public Double sumOfallExpense() {
		CriteriaBuilder criteriaBuilder = entitytManager.getCriteriaBuilder();
		CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);
		Root<Expense> root = criteriaQuery.from(Expense.class);
		criteriaQuery.select(criteriaBuilder.sum(root.get("expenseAmount")));
		TypedQuery<Double> typedQuery = entitytManager.createQuery(criteriaQuery);
		return typedQuery.getSingleResult();
	}

}