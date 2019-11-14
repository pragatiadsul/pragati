package com.Expense.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.model.User;
import com.Expense.service.ICategoryService;
import com.Expense.service.IExpenseService;
import com.Expense.service.IUserService;



@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private IUserService  userService;
	
	/*@Autowired
	private IExpenseService expenseService;
	
	@Autowired
	private ICategoryService categoryService;
	*/
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user)
	{

		try {
			if(user.getPassword().equals(user.getConfirmPassword())) {
				return new ResponseEntity<String>(userService.resgisterUser(user),HttpStatus.OK);
			}
				return new ResponseEntity<String>("password dosen't match",HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			return new ResponseEntity<String>("Registeration failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		//return;
	}
	
	
	@PostMapping("/loginUser")
	public ResponseEntity<?> loginUser(@RequestBody User user,HttpSession hs)
	{
		
		try {
			User validUser=userService.loginUser(user.getEmailId(),user.getPassword());
			hs.setAttribute("validUser", validUser);
			return new ResponseEntity<User>(validUser,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.err.println("login failed");
		}
		return new ResponseEntity<String>("login failed",HttpStatus.UNAUTHORIZED);
		
		
//		String email=user.getEmailId();
//		String password=user.getPassword();
//		
		//return userService.loginUser(email, password);
}
	
	
	
}
