package com.Expense.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private double expenseAmount;
	private Date expensedate;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="categoryId")
	@JsonIgnore
	private Category category;
	

		
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	@ManyToOne(  cascade = CascadeType.ALL)
	
	//@JoinColumn(name = "user_id")
	@JsonIgnore

	private User user;
	
	public User getUser() {
		return user;
	}

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

	public double getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
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
		this.expenseAmount = expenseAmount;
		this.expensedate = expensedate;
	}
	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expenseAmount=" + expenseAmount
				+ ", expensedate=" + expensedate + "]";
	}
	
}	