package com.app.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Category;
import com.app.demo.model.Expense;
import com.app.demo.model.Users;
import com.app.demo.repository.UsersRepository;
@RestController
@RequestMapping("/api")
public class UsersController 
{



@GetMapping("/getMonthlyExpenses")
public ResponseEntity<List<Object>> getListOfExpenses (){
	UsersController expenseRepository;
	return new ResponseEntity<List<Object>>(HttpStatus.OK);

}



/*public ResponseEntity<List<Users>> getListOfExpenses ()

{
	return ResponseEntity.ok().body(usersRepository.findAll());
/*}
	@GetMapping("/GetMonthyExpenses")
	
	public ResponseEntity<List<Category>>  categories()


*/
}
