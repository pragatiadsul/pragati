package com.Expense.service;

import com.Expense.model.User;

public interface IUserService {

	//String resgisterUser(User user);

	String resgisterUser(User user);

	//User loginUser(String emailId, String password);

	

	User loginUser(String emailId, String password);
	User getUserById(Integer userId );

}
