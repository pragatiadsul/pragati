package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.model.Expense;

public interface ExpenseRepository  extends JpaRepository<Expense, Long> {

}
