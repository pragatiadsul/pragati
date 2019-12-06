package com.app.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.demo.model.Users;
import com.app.demo.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepository;

	public String registerPerson(Users users) {
		// TODO Auto-generated method stub
		 usersRepository.save(users);
		 return " record added";
	}
	public Optional<Users> loginUser(String email, String password)
	{
		return usersRepository.findByEmailAndPassword(email,password);
		}

}
