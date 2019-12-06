package com.Expense.service;

import java.util.List;
import java.util.Optional;

import com.Expense.dto.CategoryDto;
import com.Expense.model.Category;

public interface ICategoryService {

	String addCategory(CategoryDto categoryDto);

	List<Category> getAllCategories();

	Category getCategoryById(int categoryId);

	Category FindByCategory(String name);
}