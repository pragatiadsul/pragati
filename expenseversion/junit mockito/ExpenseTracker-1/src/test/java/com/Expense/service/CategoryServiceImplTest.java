package com.Expense.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.Expense.model.Category;
import com.Expense.model.User;
import com.Expense.repository.CategoryRepository;

public class CategoryServiceImplTest {

	@InjectMocks
	private CategoryServiceImpl categoryService;

	@Mock
	private CategoryRepository categoryRepository;

	@Before
	public void setUp() throws Exception {
		categoryService = new CategoryServiceImpl();
		System.out.print("before test");
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Method is used to get Category by ID
	 */
	@Test
	public void testGetCategoryById() {
		Category category = new Category();
		category.setCategory("pen");

		when(categoryRepository.findByCategoryId(1)).thenReturn(category);

		Category categorydata = categoryService.getCategoryById(1);
		assertNotNull(categorydata);
		System.out.print(categorydata.getCategory());
		assertEquals("pen", categorydata.getCategory());
	}

	/**
	 * Method is used to get CategoryList
	 */
	@Test
	public void testGetgetCategoryList() {
		when(categoryRepository.findAll()).thenReturn(Stream.of(new Category(1010, "SS")).collect(Collectors.toList()));
		assertEquals(1, categoryService.getAllCategories().size());
	}

}
