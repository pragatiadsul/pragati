package com.Expense.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Expense.model.User;


@Repository
@Transactional
public class UserDaoImpl implements IUserDao{

	
	@PersistenceContext
	private EntityManager entitytManager;
	
	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		entitytManager.persist(user);
		return"Registered" ;
		//return null;
	}


public User getUserByID(int userId) {
		// TODO Auto-generated method stub
		String jpql = "select u from User u where u.userId=:userId";
		User user = entitytManager.createQuery(jpql, User.class).setParameter("userId", userId).getSingleResult();
		return user;
	}
	
	
	public User loginUser(String email, String password) {
		// TODO Auto-generated method stub
		String jpql = "select u from User u where u.emailId=:em and u.password=:pwd";
		User user = entitytManager.createQuery(jpql, User.class).setParameter("em", email).setParameter("pwd", password).getSingleResult();
		return user;

		
		
		
}


	@Override
	public User getUserById(Integer userId) {
		String jpql = "select u from User u where u.userId=:userId";
		User user = (User) entitytManager.createQuery(jpql,User.class).setParameter("userId", userId).getSingleResult();
        return user;
	}
}