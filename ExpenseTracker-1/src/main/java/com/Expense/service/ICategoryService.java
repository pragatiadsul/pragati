package com.Expense.service;

import java.util.List;

import com.Expense.model.Category;

public interface ICategoryService {

	String addCategory(Category category);

	List<Category> getAllCategories();

}
