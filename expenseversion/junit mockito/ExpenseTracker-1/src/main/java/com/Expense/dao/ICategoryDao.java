package com.Expense.dao;

import java.util.List;

import com.Expense.model.Category;

public interface ICategoryDao {

	String addCategory(Category category);

	List<Category> getAllCategories();

}
