
package com.Expense.service;

import static org.hamcrest.CoreMatchers.theInstance;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.Expense.dto.UserDto;
import com.Expense.model.Category;
import com.Expense.model.User;
import com.Expense.repository.CategoryRepository;
import com.Expense.repository.UserRepository;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {

	@InjectMocks
	private UserServiceImpl userService;

	@Mock
	private UserRepository userRepository;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Method is used to get User by ID
	 */
	@Test
	public void testGetUserById() {
		User user = new User();

		// user.setUserId(1);
		user.setFirstName("reshma");
		user.setPassword("p123");
		user.setConfirmPassword("p123");
		user.setEmailId("p@123gmail.com");
		when(userRepository.findByUserId(3)).thenReturn(user);
		User userdata = userService.getUserById(3);
		assertNotNull(userdata);
		assertEquals("reshma", userdata.getFirstName());

	}

}
