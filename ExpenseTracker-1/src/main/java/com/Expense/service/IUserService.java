package com.Expense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.Expense.dto.UserDto;
import com.Expense.model.Category;
import com.Expense.model.User;

public interface IUserService {

	User loginUser(String emailId, String password);

	List<User> usersList();

	String resgisterUser(User user);
	
	User getUserById(int userId);

	

	
	

}
