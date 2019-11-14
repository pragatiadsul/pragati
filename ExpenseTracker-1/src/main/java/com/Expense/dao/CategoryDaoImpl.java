package com.Expense.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Expense.model.Category;


@Repository
@Transactional
public class CategoryDaoImpl  implements ICategoryDao{
	@PersistenceContext
	private EntityManager entitytManager;

	@Override
	public String addCategory(Category category) {
		entitytManager.persist(category);
		return "category Added";
	}

	@Override
	public List<Category> getAllCategories() {
		
		String jpql = "select c from Category c";
		return entitytManager.createQuery(jpql,Category.class).getResultList();
		// TODO Auto-generated method stub
		
	}

}
