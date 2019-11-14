package com.Expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.model.Category;
import com.Expense.model.Expense;
import com.Expense.service.IExpenseService;


@RestController
@RequestMapping("/user")
public class ExpenseController {
	
@Autowired
private IExpenseService expenseService;

@PostMapping("/addExpense")
public ResponseEntity<?> addExpense(@RequestBody Expense expense)
{
	System.err.println("in controller");
	return new ResponseEntity<String>(expenseService.addExpense(expense),HttpStatus.OK);
	}
	
@GetMapping("/getMonthyExpense")
public ResponseEntity<List<Object>> getListOfExpenses (){
	return new ResponseEntity<List<Object>>(expenseService.getListOfExpenses(),HttpStatus.OK);
}

@GetMapping("/getExpenses")
public ResponseEntity<List<Expense>> getAllExpenses(){
	return new ResponseEntity<List<Expense>>(expenseService.getAllExpenses(),HttpStatus.OK);	
}
}





