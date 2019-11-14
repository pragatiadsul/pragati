package com.Expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.ICategoryDao;
import com.Expense.model.Category;
@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ICategoryDao dao;
	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		return dao.addCategory(category);
	}
	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return dao.getAllCategories();
	}

}
