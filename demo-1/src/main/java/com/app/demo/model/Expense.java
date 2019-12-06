package com.app.demo.model;



import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="expense")

public class Expense
{
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	private Instant expensedate;
	private float amount;
	
	
	@ManyToOne
	private Category category;
	
	//@JsonIgnore
	@ManyToOne
	private Users user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getExpensedate() {
		return expensedate;
	}
	public void setExpensedate(Instant expensedate) {
		this.expensedate = expensedate;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Expense(Long id, Instant expensedate, float amount, Category category, Users user) {
		super();
		this.id = id;
		this.expensedate = expensedate;
		this.amount = amount;
		this.category = category;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Expense [id=" + id + ", expensedate=" + expensedate + ", amount=" + amount + ", category=" + category
				+ ", user=" + user + "]";
	}
	
	
	
	
}
