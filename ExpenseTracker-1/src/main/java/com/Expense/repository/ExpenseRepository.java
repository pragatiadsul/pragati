package com.Expense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Expense.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

	@Query(value = "select monthname(e.expensedate),YEAR(e.expensedate), SUM(e.expense_amount) from Expense e GROUP BY monthname(e.expensedate)", nativeQuery = true)

	List<Object[]> findBYMonth();

}
