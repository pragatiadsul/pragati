package com.Expense.dao;

import com.Expense.model.User;

public interface IUserDao {

	String registerUser(User user);

	User loginUser(String emailId, String password);
	
	public User getUserByID(int userId);

	User getUserById(Integer userId);

}

