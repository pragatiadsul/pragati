package com.Expense.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Expense.model.Category;

@Repository
@Transactional
public class CategoryDaoImpl implements ICategoryDao {
	@PersistenceContext
	private EntityManager entitytManager;

	@Override
	public String addCategory(Category category) {
		entitytManager.persist(category);
		return "category Added";
	}

	@Override
	public List<Category> getAllCategories() {

		CriteriaBuilder criteriaBuilder = entitytManager.getCriteriaBuilder();
		CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);
		Root<Category> root = criteriaQuery.from(Category.class);
		criteriaQuery.select(root);

		return entitytManager.createQuery(criteriaQuery).getResultList();
	}

	/*
	 * @Override public Category getCategoryById(Integer cid) {
	 * 
	 * String jpql="Select c from Category c where c.categoryId=:id"; Category
	 * category=entitytManager.createQuery(jpql,Category.class).setParameter("id",
	 * cid).getSingleResult(); return category; }
	 */

}
