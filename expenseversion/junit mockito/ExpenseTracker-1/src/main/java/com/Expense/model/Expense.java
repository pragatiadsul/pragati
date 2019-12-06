package com.Expense.model;

import java.util.Date;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "expense")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int expenseId;
	private String expenseName;
	private double expense_amount;

	public double getExpense_amount() {
		return expense_amount;
	}

	public void setExpense_amount(double expense_amount) {
		this.expense_amount = expense_amount;
	}

	private Date expensedate;
//	
//	private int userId;
//	
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId")
	@JsonIgnore
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(cascade = CascadeType.ALL)

	// @JoinColumn(name = "user_id")
	@JsonIgnore

	// private User user;
	private User user;

	public User getUser() {
		return user;
	}

//	public void setUser(Optional<User> user2) {
//		this.user = user2;
//	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	@Temporal(TemporalType.DATE)
	public Date getExpensedate() {
		return expensedate;
	}

	public void setExpensedate(Date expensedate) {
		this.expensedate = expensedate;
	}

	public Expense() {
		super();
	}

	public Expense(int expenseId, String expenseName, double expenseAmount, Date expensedate) {
		super();
		this.expenseId = expenseId;
		this.expenseName = expenseName;
		this.expense_amount = expense_amount;
		this.expensedate = expensedate;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expense_amount=" + expense_amount
				+ ", expensedate=" + expensedate + "]";
	}

}