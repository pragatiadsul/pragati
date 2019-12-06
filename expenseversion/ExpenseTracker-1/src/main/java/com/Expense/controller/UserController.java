package com.Expense.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.exception.CategoryNotFoundException;
import com.Expense.exception.UserNotFoundException;
import com.Expense.model.Category;
import com.Expense.model.User;
import com.Expense.project.SmtpMailSender;
import com.Expense.service.IUserService;


/**
 * 
 * @author All the methods of User controller are implemented using Criteria
 *         Builder
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@Autowired
	SmtpMailSender smtpMailSender;

	/*
	 * @Autowired private IExpenseService expenseService;
	 * 
	 * @Autowired private ICategoryService categoryService;
	 */

	/**
	 * Method used for user registration
	 * 
	 * @param user
	 * @return status string
	 */

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user) {

		try {
			if (user.getPassword().equals(user.getConfirmPassword())) {

				// return new
				// ResponseEntity<String>(userService.resgisterUser(user),HttpStatus.OK);

				ResponseEntity<String> status = new ResponseEntity<String>(userService.resgisterUser(user),
						HttpStatus.OK);
				ResponseEntity<String> statusCheck = new ResponseEntity<String>("Registered", HttpStatus.OK);

				if (statusCheck.equals(status)) {
					smtpMailSender.send("pragatiadsul3796@gmail.com", user.getFirstName() + " registed",
							"Mail of user registration");
				}
				return status;
			}
			return new ResponseEntity<String>("password dosen't match", HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			return new ResponseEntity<String>("Registeration failed", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Method used for login user
	 * 
	 * @param user
	 * @return User Details (Entire Object)
	 */

	@PostMapping("/loginUser")
	public ResponseEntity<?> loginUser(@RequestBody User user, HttpSession hs) {

		try {
			User validUser = userService.loginUser(user.getEmailId(), user.getPassword());
			hs.setAttribute("validUser", validUser);
			return new ResponseEntity<User>(validUser, HttpStatus.OK);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new UserNotFoundException("user not found");
		}
		// return new ResponseEntity<String>("login failed",HttpStatus.UNAUTHORIZED);

	}

	/**
	 * Method used to get registered users list
	 * 
	 * @param No any parameter provided
	 * @return List of registered Users
	 */

	@GetMapping("/userslist")
	public List<User> usersList() {
		return userService.usersList();
	}
	
	
	
	@GetMapping("/userslist/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);	
	}
	}

