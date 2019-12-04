package com.Expense.dao;

import java.util.List;

import com.Expense.model.User;

public interface IUserDao {

	String registerUser(User user);

	User loginUser(String emailId, String password);

	List<User> getusersList();

}
