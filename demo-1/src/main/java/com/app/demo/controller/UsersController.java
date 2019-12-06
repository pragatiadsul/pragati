package com.app.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import com.app.demo.model.*;

import com.app.demo.repository.UsersRepository;
import com.app.demo.service.UsersService;
@RestController
@RequestMapping("/api")
public class UsersController 
{
	@Autowired
	private  UsersService usersService;
	
	
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser (@RequestBody Users users) 
	{
		return new ResponseEntity<String> (usersService.registerPerson(users),HttpStatus.OK);
	}
	
   @GetMapping("/loginUser")
	public Optional<Users> loginUser(@RequestBody Users users)
{
	String password=users.getPassword();
	String email=users.getEmail();
    return	usersService.loginUser(email,password);
}	
	
@GetMapping("/getMonthlyExpenses")
public ResponseEntity<List<Object>> getListOfExpenses (){
	UsersController expenseRepository;
	return new ResponseEntity<List<Object>>(HttpStatus.OK);

}



}
