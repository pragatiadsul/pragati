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
		// TODO Auto-generated method stub
		entitytManager.persist(user);
		return "Registered";
		// return null;
	}

	@Override
	public User loginUser(String email, String password) {

		// TODO Auto-generated method stub
		CriteriaBuilder cm = entitytManager.getCriteriaBuilder();
		CriteriaQuery<User> cq = cm.createQuery(User.class);
		Root<User> pa = cq.from(User.class);
		Predicate emailID = cm.equal(pa.get("emailId"), email);
		Predicate passwords = cm.equal(pa.get("password"), password);
		cq.where(emailID, passwords);
		TypedQuery<User> tq = entitytManager.createQuery(cq);
		return tq.getSingleResult();

//			
//			List<Predicate> predicates = new ArrayList<Predicate>();
//			predicates.add(cm.equal(pa.get("emailId"),email));
//			predicates.add(cm.equal(pa.get("password"), password));
//			
//			cq.select(pa).where(predicates.toArray(new Predicate[] {}));
//			User user = entitytManager.createQuery(cq).getSingleResult();

		// String jpql = "select u from userModel u where u.emailId=:em and
		// u.password=:pwd";
		// userModel user = entitytManager.createQuery(jpql,
		// userModel.class).setParameter("em", email).setParameter("pwd",
		// password).getSingleResult();
		// return user;
	}

	/*
	 * // TODO Auto-generated method stub String jpql =
	 * "select u from User u where u.emailId=:em and u.password=:pwd"; User user =
	 * entitytManager.createQuery(jpql, User.class).setParameter("em",
	 * email).setParameter("pwd", password).getSingleResult(); return user;
	 * 
	 */

	@Override
	public List<User> getusersList() {
		CriteriaBuilder criteriaBuilder = entitytManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root);

		return entitytManager.createQuery(criteriaQuery).getResultList();
	}
}