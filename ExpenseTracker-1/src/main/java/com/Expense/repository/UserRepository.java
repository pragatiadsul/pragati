package com.Expense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.Expense.dto.UserDto;
import com.Expense.model.User;
import com.sun.mail.imap.protocol.ID;

public interface UserRepository extends JpaRepository<User, ID> {

	public User findByUserId(int userId);

}
