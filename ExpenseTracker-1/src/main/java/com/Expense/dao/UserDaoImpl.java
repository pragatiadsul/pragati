package com.Expense.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Expense.model.User;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager entitytManager;

	@Override
	public String registerUser(User user) {
		
		entitytManager.persist(user);
		return "Registered";
	
	}

	@Override
	public User loginUser(String email, String password) {

		
		CriteriaBuilder cm = entitytManager.getCriteriaBuilder();
		CriteriaQuery<User> cq = cm.createQuery(User.class);
		Root<User> pa = cq.from(User.class);
		Predicate emailID = cm.equal(pa.get("emailId"), email);
		Predicate passwords = cm.equal(pa.get("password"), password);
		cq.where(emailID, passwords);
		TypedQuery<User> tq = entitytManager.createQuery(cq);
		return tq.getSingleResult();

	}
	@Override
	public List<User> getusersList() {
		CriteriaBuilder criteriaBuilder = entitytManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root);

		return entitytManager.createQuery(criteriaQuery).getResultList();
	}
}