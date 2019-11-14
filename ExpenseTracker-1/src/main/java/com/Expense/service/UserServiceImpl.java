package com.Expense.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.IUserDao;
import com.Expense.model.User;

@Service
public class UserServiceImpl implements IUserService{

	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public String resgisterUser(User user) {
		// TODO Auto-generated method stub
		return userDao.registerUser(user);
	}

	@Override
	public User loginUser(String emailId, String password) {
		// TODO Auto-generated method stub
		return userDao.loginUser(emailId,password);
	}
	
	
	public User getUserById(Integer userId) {
        // TODO Auto-generated method stub
        return userDao.getUserById(userId);
    }

}
