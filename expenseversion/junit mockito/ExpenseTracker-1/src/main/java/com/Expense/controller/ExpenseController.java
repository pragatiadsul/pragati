package com.Expense.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.dto.ExpenseDto;
import com.Expense.model.Expense;
import com.Expense.model.User;
import com.Expense.service.IExpenseService;
import com.Expense.service.IUserService;
import com.Expense.service.UserServiceImpl;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

	@Autowired
	private IExpenseService expenseService;
	
	
	@SuppressWarnings("unused")
	@Autowired
	private UserServiceImpl userService;
	

	/**
	 * Method used for add Expense
	 * 
	 * @param object
	 * @return status string
	 */

	@PostMapping("/addExpense")
	public ResponseEntity<?> addExpense(@RequestBody ExpenseDto expenseDto) {
		System.err.println("in controller");
		
		return new ResponseEntity<String>(expenseService.addExpense(expenseDto), HttpStatus.OK);
	}
	/**
	 * Method used to fetch ExpenseList
	 * 
	 * @param No any parameter pass
	 * @return Expense List
	 */

	@GetMapping("/getExpenses")
	public ResponseEntity<List<Expense>> getAllExpenses() {
		return new ResponseEntity<List<Expense>>(expenseService.getAllExpenses(), HttpStatus.OK);
	}
	
	/**
	 * Method is used to fetch List
	 * @param No any parameter passed
	 * @return sum of Expense ammount
	 */

	@GetMapping("/getsum")
	public ResponseEntity<?> getSumOfAllExpenses() {
		try {
			return new ResponseEntity<Double>(expenseService.sumOfallExpense(), HttpStatus.OK);
		} catch (Exception e) {
		
			e.printStackTrace();
			return new ResponseEntity<String>("Cannot fetch Monthly expenses", HttpStatus.SERVICE_UNAVAILABLE);
		}

	}
	

	/**
	 * Method is used to find monthy expense
	 * 
	 * @param List of object
	 * @return monthwise expense ammount
	 */
	
	@GetMapping("/showmonthwise")
	public List<Object[]> getMOnthWiseExpenses() {

		return expenseService.getListOfExpensesmonthWise();
	}
}
