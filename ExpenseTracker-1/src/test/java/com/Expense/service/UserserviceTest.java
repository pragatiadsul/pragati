package com.Expense.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Expense.dto.CategoryDto;
import com.Expense.model.Category;
import com.Expense.model.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserserviceTest {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private ICategoryService categoryService;

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Method is used to get User by ID
	 */
	@Test
	public void testFindById() {
		// List<User> user = userService.usersList();
		User user = userService.getUserById(01);
		Assert.assertEquals("virat", user.getFirstName());
		Assert.assertEquals("v@gmail", user.getEmailId());
		Assert.assertEquals("v123", user.getPassword());
		// return;
	}

	/**
	 * Method used to get UserList
	 */
	@Test
	public void testUserList() {
		User user = new User();
		user.setFirstName("virat");
		List<User> member = userService.usersList();
		User newMember = member.get(0);
		Assert.assertEquals(user.getFirstName(), newMember.getFirstName());
	}

	/**
	 * Method used to add Category
	 */
	@Test
	public void testSave() {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setCategory("books");
		categoryService.addCategory(categoryDto);
		List<Category> members = categoryService.getAllCategories();
		Category newMember = members.get(5);
		Assert.assertEquals("books", newMember.getCategory());

	}
}
