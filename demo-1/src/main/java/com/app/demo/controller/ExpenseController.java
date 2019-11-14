package com.app.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Category;
import com.app.demo.model.Expense;
import com.app.demo.repository.ExpenseRepository;

@RestController
@RequestMapping("/api")
public class ExpenseController
{
	@Autowired
private ExpenseRepository expenseRepository;
@GetMapping("/expenses")	
public ResponseEntity<List<Expense>>  expense()
{
	//System.out.println(categoryRepository.findAll());
	return ResponseEntity.ok().body(expenseRepository.findAll());
	//return new ResponseEntity<List<Category>>(categoryRepository.findAll(),HttpStatus.OK); 
}

@DeleteMapping("/expenses/{id}")
ResponseEntity<?> deleteCategory(@PathVariable Long id)
{
	expenseRepository.deleteById(id);
	return ResponseEntity.ok().build();
}
	
@PostMapping("/expenses")
ResponseEntity<Expense> createExpense(@Valid @RequestBody Expense expense) throws URISyntaxException
{
Expense result= expenseRepository.save(expense);
return ResponseEntity.created(new URI("/api/expenses" + result.getId())).body(result);
}

}
