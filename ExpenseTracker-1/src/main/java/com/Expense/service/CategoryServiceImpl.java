package com.Expense.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.ICategoryDao;
import com.Expense.dto.CategoryDto;
import com.Expense.model.Category;
import com.Expense.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {


	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ICategoryDao dao;

	
	@Override
	public List<Category> getAllCategories() {
	
		return categoryRepository.findAll();
	}

	@Override
	public String addCategory(CategoryDto categoryDto) {

		Category ca = new Category();
		ca.setCategoryId(categoryDto.getCategoryId());
		ca.setCategory(categoryDto.getCategory());

		categoryRepository.save(ca);
		return "Recored Added successfully";
	}

	@Override
	public Category getCategoryById(int categoryId) {
		
		return categoryRepository.findByCategoryId(categoryId);
	}
	

}
